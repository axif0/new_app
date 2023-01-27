package p340io.realm;

import java.io.InterruptedIOException;
import java.net.URI;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p340io.realm.internal.Keep;
import p340io.realm.internal.android.C5699a;
import p340io.realm.internal.async.C5700a;
import p340io.realm.internal.p343u.C5740b;
import p340io.realm.internal.p343u.C5741c;
import p340io.realm.internal.p343u.C5746f;
import p340io.realm.internal.p344v.C5747a;
import p340io.realm.internal.p345w.C5749a;
import p340io.realm.log.RealmLog;

@Keep
/* renamed from: io.realm.SyncSession */
public class SyncSession {
    static final byte CONNECTION_VALUE_CONNECTED = 2;
    static final byte CONNECTION_VALUE_CONNECTING = 1;
    static final byte CONNECTION_VALUE_DISCONNECTED = 0;
    private static final int DIRECTION_DOWNLOAD = 1;
    private static final int DIRECTION_UPLOAD = 2;
    private static final long REFRESH_MARGIN_DELAY = TimeUnit.SECONDS.toMillis(10);
    private static final ScheduledThreadPoolExecutor REFRESH_TOKENS_EXECUTOR = new ScheduledThreadPoolExecutor(1);
    private static final byte STATE_VALUE_ACTIVE = 1;
    private static final byte STATE_VALUE_DYING = 2;
    private static final byte STATE_VALUE_ERROR = 4;
    private static final byte STATE_VALUE_INACTIVE = 3;
    private static final byte STATE_VALUE_WAITING_FOR_ACCESS_TOKEN = 0;
    /* access modifiers changed from: private */
    public final C5804v0 configuration;
    private final CopyOnWriteArrayList<C5660g> connectionListeners = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */
    public final C5624d errorHandler;
    /* access modifiers changed from: private */
    public volatile boolean isClosed = false;
    private final Map<Long, C5749a<C5628a0, C5823z>> listenerIdToProgressListenerMap = new HashMap();
    private long nativeConnectionListenerToken;
    private C5652e0 networkRequest;
    /* access modifiers changed from: private */
    public AtomicBoolean onGoingAccessTokenQuery = new AtomicBoolean(false);
    private final AtomicLong progressListenerId = new AtomicLong(-1);
    private final Map<C5628a0, Long> progressListenerToOsTokenMap = new IdentityHashMap();
    /* access modifiers changed from: private */
    public C5652e0 refreshTokenNetworkRequest;
    /* access modifiers changed from: private */
    public C5652e0 refreshTokenTask;
    /* access modifiers changed from: private */
    public URI resolvedRealmURI;
    private final AtomicInteger waitCounter = new AtomicInteger(0);
    private final Object waitForChangesMutex = new Object();
    private final AtomicReference<C5626f> waitingForServerChanges = new AtomicReference<>((Object) null);

    /* renamed from: io.realm.SyncSession$a */
    class C5621a extends C5741c<C5740b> {

        /* renamed from: g */
        final /* synthetic */ C5746f f16207g;

        C5621a(C5746f fVar) {
            this.f16207g = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C5740b mo16195b() {
            if (SyncSession.this.isClosed || Thread.currentThread().isInterrupted()) {
                return null;
            }
            SyncSession.this.getUser().mo16823c();
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo16196d(C5740b bVar) {
            SyncSession.this.onGoingAccessTokenQuery.set(false);
            RealmLog.m24075a("Session[%s]: Failed to get access token (%s)", SyncSession.this.configuration.mo16315k(), bVar.mo16677a().mo16804a());
            if (!SyncSession.this.isClosed && !Thread.currentThread().isInterrupted() && !(bVar.mo16677a().mo16807d() instanceof InterruptedIOException)) {
                SyncSession.this.errorHandler.mo16169a(SyncSession.this, bVar.mo16677a());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo16197e(C5740b bVar) {
            RealmLog.m24075a("Session[%s]: Access token acquired", SyncSession.this.configuration.mo16315k());
            if (!SyncSession.this.isClosed && !Thread.currentThread().isInterrupted()) {
                SyncSession.this.configuration.mo16811C();
                SyncSession.this.getUser().mo16821a(SyncSession.this.configuration, bVar.mo16679c());
                throw null;
            }
        }
    }

    /* renamed from: io.realm.SyncSession$b */
    class C5622b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5746f f16209f;

        C5622b(C5746f fVar) {
            this.f16209f = fVar;
        }

        public void run() {
            if (!SyncSession.this.isClosed && !Thread.currentThread().isInterrupted() && !SyncSession.this.refreshTokenTask.isCancelled()) {
                SyncSession.this.refreshAccessToken(this.f16209f);
            }
        }
    }

    /* renamed from: io.realm.SyncSession$c */
    class C5623c extends C5741c<C5740b> {

        /* renamed from: g */
        final /* synthetic */ C5746f f16211g;

        C5623c(C5746f fVar) {
            this.f16211g = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C5740b mo16195b() {
            if (SyncSession.this.isClosed || Thread.currentThread().isInterrupted()) {
                return null;
            }
            SyncSession.this.getUser().mo16823c();
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo16196d(C5740b bVar) {
            if (!SyncSession.this.isClosed && !Thread.currentThread().isInterrupted()) {
                SyncSession.this.onGoingAccessTokenQuery.set(false);
                RealmLog.m24077c("Unrecoverable error, while refreshing the access Token (" + bVar.mo16677a().toString() + ") reschedule will not happen", new Object[0]);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo16197e(C5740b bVar) {
            synchronized (SyncSession.this) {
                if (!SyncSession.this.isClosed && !Thread.currentThread().isInterrupted() && !SyncSession.this.refreshTokenNetworkRequest.isCancelled()) {
                    RealmLog.m24075a("Access Token refreshed successfully, Sync URL: " + SyncSession.this.configuration.mo16811C(), new Object[0]);
                    C5747a d = bVar.mo16680d();
                    if (d != null) {
                        SyncSession.nativeSetUrlPrefix(SyncSession.this.configuration.mo16315k(), d.mo16689a());
                    }
                    if (SyncSession.nativeRefreshAccessToken(SyncSession.this.configuration.mo16315k(), bVar.mo16679c().mo16690a(), SyncSession.this.configuration.mo16811C().toString())) {
                        SyncSession.this.getUser().mo16821a(SyncSession.this.configuration, bVar.mo16679c());
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: io.realm.SyncSession$d */
    public interface C5624d {
        /* renamed from: a */
        void mo16169a(SyncSession syncSession, C5803v vVar);
    }

    /* renamed from: io.realm.SyncSession$e */
    public enum C5625e {
        INACTIVE((byte) 3),
        WAITING_FOR_ACCESS_TOKEN((byte) 0),
        ACTIVE((byte) 1),
        DYING((byte) 2),
        ERROR((byte) 4);
        

        /* renamed from: f */
        final byte f16219f;

        private C5625e(byte b) {
            this.f16219f = b;
        }

        /* renamed from: e */
        static C5625e m23298e(long j) {
            for (C5625e eVar : values()) {
                if (((long) eVar.f16219f) == j) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Unknown session state code: " + j);
        }
    }

    /* renamed from: io.realm.SyncSession$f */
    private static class C5626f {

        /* renamed from: a */
        private final CountDownLatch f16220a;

        /* renamed from: b */
        private volatile boolean f16221b;

        /* renamed from: c */
        private Long f16222c;

        /* renamed from: d */
        private String f16223d;

        private C5626f() {
            this.f16220a = new CountDownLatch(1);
            this.f16221b = false;
            this.f16222c = null;
        }

        /* synthetic */ C5626f(C5621a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo16205a(Long l, String str) {
            this.f16222c = l;
            this.f16223d = str;
            this.f16221b = true;
            this.f16220a.countDown();
        }

        /* renamed from: b */
        public boolean mo16206b() {
            return this.f16221b && this.f16222c == null;
        }

        /* renamed from: c */
        public void mo16207c() {
            if (this.f16221b && this.f16222c != null) {
                throw new C5803v(C5765m.UNKNOWN, String.format(Locale.US, "Internal error (%d): %s", new Object[]{this.f16222c, this.f16223d}));
            }
        }

        /* renamed from: d */
        public boolean mo16208d(long j, TimeUnit timeUnit) throws InterruptedException {
            return !this.f16221b ? this.f16220a.await(j, timeUnit) : mo16206b();
        }
    }

    SyncSession(C5804v0 v0Var) {
        this.configuration = v0Var;
        this.errorHandler = v0Var.mo16815y();
    }

    private void addProgressListener(C5639b0 b0Var, int i, C5628a0 a0Var) {
        checkProgressListenerArguments(b0Var, a0Var);
        boolean z = b0Var == C5639b0.INDEFINITELY;
        long incrementAndGet = this.progressListenerId.incrementAndGet();
        this.listenerIdToProgressListenerMap.put(Long.valueOf(incrementAndGet), new C5749a(a0Var, null));
        long nativeAddProgressListener = nativeAddProgressListener(this.configuration.mo16315k(), incrementAndGet, i, z);
        if (nativeAddProgressListener == REFRESH_MARGIN_DELAY) {
            this.listenerIdToProgressListenerMap.remove(Long.valueOf(incrementAndGet));
        } else {
            this.progressListenerToOsTokenMap.put(a0Var, Long.valueOf(nativeAddProgressListener));
        }
    }

    private void authenticateRealm(C5746f fVar) {
        C5652e0 e0Var = this.networkRequest;
        if (e0Var != null) {
            e0Var.cancel();
        }
        clearScheduledAccessTokenRefresh();
        this.onGoingAccessTokenQuery.set(true);
        this.networkRequest = new C5700a(SyncManager.NETWORK_POOL_EXECUTOR.submit(new C5621a(fVar)), SyncManager.NETWORK_POOL_EXECUTOR);
    }

    private void checkIfNotOnMainThread(String str) {
        if (new C5699a().mo16610e()) {
            throw new IllegalStateException(str);
        }
    }

    private void checkNonNullListener(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Non-null 'listener' required.");
        }
    }

    private void checkProgressListenerArguments(C5639b0 b0Var, C5628a0 a0Var) {
        if (a0Var == null) {
            throw new IllegalArgumentException("Non-null 'listener' required.");
        } else if (b0Var == null) {
            throw new IllegalArgumentException("Non-null 'mode' required.");
        }
    }

    private void checkTimeout(long j, TimeUnit timeUnit) {
        if (j <= REFRESH_MARGIN_DELAY) {
            throw new IllegalArgumentException("'timeout' must be > 0. It was: " + j);
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("Non-null 'unit' required");
        }
    }

    private static native long nativeAddConnectionListener(String str);

    private static native long nativeAddProgressListener(String str, long j, int i, boolean z);

    private static native byte nativeGetConnectionState(String str);

    private static native byte nativeGetState(String str);

    /* access modifiers changed from: private */
    public static native boolean nativeRefreshAccessToken(String str, String str2, String str3);

    private static native void nativeRemoveConnectionListener(long j, String str);

    private static native void nativeRemoveProgressListener(String str, long j);

    /* access modifiers changed from: private */
    public static native void nativeSetUrlPrefix(String str, String str2);

    private static native void nativeStart(String str);

    private static native void nativeStop(String str);

    private native boolean nativeWaitForDownloadCompletion(int i, String str);

    private native boolean nativeWaitForUploadCompletion(int i, String str);

    private void notifyAllChangesSent(int i, Long l, String str) {
        C5626f fVar = this.waitingForServerChanges.get();
        if (fVar != null && this.waitCounter.get() == i) {
            fVar.mo16205a(l, str);
        }
    }

    /* access modifiers changed from: private */
    public void refreshAccessToken(C5746f fVar) {
        clearScheduledAccessTokenRefresh();
        this.refreshTokenNetworkRequest = new C5700a(SyncManager.NETWORK_POOL_EXECUTOR.submit(new C5623c(fVar)), SyncManager.NETWORK_POOL_EXECUTOR);
    }

    /* access modifiers changed from: private */
    public void scheduleRefreshAccessToken(C5746f fVar, long j) {
        this.onGoingAccessTokenQuery.set(true);
        long currentTimeMillis = (j - System.currentTimeMillis()) - REFRESH_MARGIN_DELAY;
        if (currentTimeMillis < REFRESH_MARGIN_DELAY) {
            RealmLog.m24075a("Expires time already reached for the access token, refresh as soon as possible", new Object[0]);
            currentTimeMillis = REFRESH_MARGIN_DELAY;
        }
        RealmLog.m24075a("Scheduling an access_token refresh in " + currentTimeMillis + " milliseconds", new Object[0]);
        C5652e0 e0Var = this.refreshTokenTask;
        if (e0Var != null) {
            e0Var.cancel();
        }
        this.refreshTokenTask = new C5700a(REFRESH_TOKENS_EXECUTOR.schedule(new C5622b(fVar), currentTimeMillis, TimeUnit.MILLISECONDS), REFRESH_TOKENS_EXECUTOR);
    }

    private boolean waitForChanges(int i, long j, TimeUnit timeUnit) throws InterruptedException {
        String str;
        if (i == 1 || i == 2) {
            boolean z = false;
            if (!this.isClosed) {
                String k = this.configuration.mo16315k();
                C5626f fVar = new C5626f((C5621a) null);
                this.waitingForServerChanges.set(fVar);
                int incrementAndGet = this.waitCounter.incrementAndGet();
                if (!(i == 1 ? nativeWaitForDownloadCompletion(incrementAndGet, k) : nativeWaitForUploadCompletion(incrementAndGet, k))) {
                    this.waitingForServerChanges.set((Object) null);
                    if (i == 1) {
                        str = "It was not possible to download all remote changes.";
                    } else if (i != 2) {
                        throw new IllegalArgumentException("Unknown direction: " + i);
                    } else {
                        str = "It was not possible upload all local changes.";
                    }
                    C5765m mVar = C5765m.UNKNOWN;
                    throw new C5803v(mVar, str + " Has the SyncClient been started?");
                }
                try {
                    z = fVar.mo16208d(j, timeUnit);
                    try {
                        if (!this.isClosed && !fVar.mo16206b()) {
                            fVar.mo16207c();
                        }
                    } finally {
                        this.waitingForServerChanges.set((Object) null);
                    }
                } catch (InterruptedException e) {
                    this.waitingForServerChanges.set((Object) null);
                    throw e;
                }
            }
            return z;
        }
        throw new IllegalArgumentException("Unknown direction: " + i);
    }

    public synchronized void addConnectionChangeListener(C5660g gVar) {
        checkNonNullListener(gVar);
        if (this.connectionListeners.isEmpty()) {
            this.nativeConnectionListenerToken = nativeAddConnectionListener(this.configuration.mo16315k());
        }
        this.connectionListeners.add(gVar);
    }

    public synchronized void addDownloadProgressListener(C5639b0 b0Var, C5628a0 a0Var) {
        addProgressListener(b0Var, 1, a0Var);
    }

    public synchronized void addUploadProgressListener(C5639b0 b0Var, C5628a0 a0Var) {
        addProgressListener(b0Var, 2, a0Var);
    }

    /* access modifiers changed from: package-private */
    public void clearScheduledAccessTokenRefresh() {
        C5652e0 e0Var = this.refreshTokenTask;
        if (e0Var != null) {
            e0Var.cancel();
        }
        C5652e0 e0Var2 = this.refreshTokenNetworkRequest;
        if (e0Var2 != null) {
            e0Var2.cancel();
        }
        this.onGoingAccessTokenQuery.set(false);
    }

    /* access modifiers changed from: package-private */
    public void close() {
        this.isClosed = true;
        C5652e0 e0Var = this.networkRequest;
        if (e0Var != null) {
            e0Var.cancel();
        }
        clearScheduledAccessTokenRefresh();
    }

    public void downloadAllServerChanges() throws InterruptedException {
        checkIfNotOnMainThread("downloadAllServerChanges() cannot be called from the main thread.");
        synchronized (this.waitForChangesMutex) {
            waitForChanges(1, Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        }
    }

    public boolean downloadAllServerChanges(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean waitForChanges;
        checkIfNotOnMainThread("downloadAllServerChanges() cannot be called from the main thread.");
        checkTimeout(j, timeUnit);
        synchronized (this.waitForChangesMutex) {
            waitForChanges = waitForChanges(1, j, timeUnit);
        }
        return waitForChanges;
    }

    /* access modifiers changed from: package-private */
    public String getAccessToken(C5746f fVar, String str) {
        getUser().mo16824d(this.configuration);
        throw null;
    }

    public C5804v0 getConfiguration() {
        return this.configuration;
    }

    public C5668h getConnectionState() {
        byte nativeGetConnectionState = nativeGetConnectionState(this.configuration.mo16315k());
        if (nativeGetConnectionState != -1) {
            return C5668h.m23534e((long) nativeGetConnectionState);
        }
        throw new IllegalStateException("Could not find session, Realm was probably closed");
    }

    public URI getServerUrl() {
        return this.configuration.mo16811C();
    }

    public C5625e getState() {
        byte nativeGetState = nativeGetState(this.configuration.mo16315k());
        if (nativeGetState != -1) {
            return C5625e.m23298e((long) nativeGetState);
        }
        throw new IllegalStateException("Could not find session, Realm was probably closed");
    }

    public C5815w0 getUser() {
        return this.configuration.mo16812D();
    }

    public boolean isConnected() {
        C5668h e = C5668h.m23534e((long) nativeGetConnectionState(this.configuration.mo16315k()));
        C5625e state = getState();
        return (state == C5625e.ACTIVE || state == C5625e.DYING) && e == C5668h.CONNECTED;
    }

    /* access modifiers changed from: package-private */
    public void notifyConnectionListeners(C5668h hVar, C5668h hVar2) {
        Iterator<C5660g> it = this.connectionListeners.iterator();
        while (it.hasNext()) {
            it.next().mo16297a(hVar, hVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void notifyProgressListener(long j, long j2, long j3) {
        C5749a aVar = this.listenerIdToProgressListenerMap.get(Long.valueOf(j));
        if (aVar != null) {
            S zVar = new C5823z(j2, j3);
            if (!zVar.equals(aVar.f16589b)) {
                aVar.f16589b = zVar;
                ((C5628a0) aVar.f16588a).mo16211a(zVar);
            }
        } else {
            RealmLog.m24075a("Trying unknown listener failed: " + j, new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifySessionError(String str, int i, String str2) {
        if (this.errorHandler != null) {
            C5765m e = C5765m.m24090e(str, i);
            if (e == C5765m.CLIENT_RESET) {
                this.errorHandler.mo16169a(this, new ClientResetRequiredError(e, "A Client Reset is required. Read more here: https://realm.io/docs/realm-object-server/#client-recovery-from-a-backup.", this.configuration, C5804v0.m24241w(str2, this.configuration.mo16311g(), this.configuration.mo16318n())));
            } else {
                this.errorHandler.mo16169a(this, e == C5765m.UNKNOWN ? new C5803v(str, i, str2) : new C5803v(e, str2));
            }
        }
    }

    public synchronized void removeConnectionChangeListener(C5660g gVar) {
        checkNonNullListener(gVar);
        this.connectionListeners.remove(gVar);
        if (this.connectionListeners.isEmpty()) {
            nativeRemoveConnectionListener(this.nativeConnectionListenerToken, this.configuration.mo16315k());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void removeProgressListener(p340io.realm.C5628a0 r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0005
            monitor-exit(r3)
            return
        L_0x0005:
            java.util.Map<io.realm.a0, java.lang.Long> r0 = r3.progressListenerToOsTokenMap     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.remove(r4)     // Catch:{ all -> 0x0047 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            java.util.Map<java.lang.Long, io.realm.internal.w.a<io.realm.a0, io.realm.z>> r1 = r3.listenerIdToProgressListenerMap     // Catch:{ all -> 0x0047 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0047 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0047 }
        L_0x0019:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0047 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0047 }
            io.realm.internal.w.a r2 = (p340io.realm.internal.p345w.C5749a) r2     // Catch:{ all -> 0x0047 }
            F r2 = r2.f16588a     // Catch:{ all -> 0x0047 }
            io.realm.a0 r2 = (p340io.realm.C5628a0) r2     // Catch:{ all -> 0x0047 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0019
            r1.remove()     // Catch:{ all -> 0x0047 }
        L_0x0038:
            io.realm.v0 r4 = r3.configuration     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = r4.mo16315k()     // Catch:{ all -> 0x0047 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0047 }
            nativeRemoveProgressListener(r4, r0)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r3)
            return
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x004b
        L_0x004a:
            throw r4
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.SyncSession.removeProgressListener(io.realm.a0):void");
    }

    /* access modifiers changed from: package-private */
    public void setResolvedRealmURI(URI uri) {
        this.resolvedRealmURI = uri;
    }

    public synchronized void start() {
        nativeStart(this.configuration.mo16315k());
    }

    public synchronized void stop() {
        nativeStop(this.configuration.mo16315k());
    }

    public void uploadAllLocalChanges() throws InterruptedException {
        checkIfNotOnMainThread("uploadAllLocalChanges() cannot be called from the main thread.");
        synchronized (this.waitForChangesMutex) {
            waitForChanges(2, Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        }
    }

    public boolean uploadAllLocalChanges(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean waitForChanges;
        checkIfNotOnMainThread("uploadAllLocalChanges() cannot be called from the main thread.");
        checkTimeout(j, timeUnit);
        synchronized (this.waitForChangesMutex) {
            waitForChanges = waitForChanges(2, j, timeUnit);
        }
        return waitForChanges;
    }
}
