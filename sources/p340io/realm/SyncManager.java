package p340io.realm;

import com.karumi.dexter.BuildConfig;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p340io.realm.SyncSession;
import p340io.realm.internal.Keep;
import p340io.realm.internal.Util;
import p340io.realm.internal.p343u.C5742d;
import p340io.realm.internal.p343u.C5744e;
import p340io.realm.internal.p343u.C5746f;
import p340io.realm.log.RealmLog;
import p374m.p375g0.p384m.C6233d;

@Keep
@SuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
/* renamed from: io.realm.SyncManager */
public class SyncManager {
    public static String APP_ID;
    private static CertificateFactory CERTIFICATE_FACTORY;
    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL"})
    public static ThreadPoolExecutor NETWORK_POOL_EXECUTOR = new ThreadPoolExecutor(10, 10, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
    private static HashMap<String, List<String>> ROS_CERTIFICATES_CHAIN;
    private static final SyncSession.C5624d SESSION_NO_OP_ERROR_HANDLER = new C5617a();
    private static X509TrustManager TRUST_MANAGER;
    private static CopyOnWriteArrayList<C5627a> authListeners = new CopyOnWriteArrayList<>();
    private static volatile C5746f authServer = new C5744e();
    static volatile SyncSession.C5624d defaultSessionErrorHandler = SESSION_NO_OP_ERROR_HANDLER;
    private static String globalAuthorizationHeaderName = "Authorization";
    private static Map<String, String> globalCustomHeaders = new HashMap();
    private static Map<String, String> hostRestrictedAuthorizationHeaderName = new HashMap();
    private static Map<String, Map<String, String>> hostRestrictedCustomHeaders = new HashMap();
    private static C5742d.C5743a networkListener = new C5618b();
    private static Map<String, SyncSession> sessions = new ConcurrentHashMap();
    private static volatile C5817x0 userStore;

    /* renamed from: io.realm.SyncManager$a */
    class C5617a implements SyncSession.C5624d {
        C5617a() {
        }

        /* renamed from: a */
        public void mo16169a(SyncSession syncSession, C5803v vVar) {
            if (vVar.mo16804a() == C5765m.CLIENT_RESET) {
                RealmLog.m24077c("Client Reset required for: " + syncSession.getConfiguration().mo16811C(), new Object[0]);
                return;
            }
            String format = String.format(Locale.US, "Session Error[%s]: %s", new Object[]{syncSession.getConfiguration().mo16811C(), vVar.toString()});
            int i = C5619c.f16204a[vVar.mo16804a().mo16733g().ordinal()];
            if (i == 1) {
                RealmLog.m24077c(format, new Object[0]);
            } else if (i == 2) {
                RealmLog.m24083i(format, new Object[0]);
            } else {
                throw new IllegalArgumentException("Unsupported error category: " + vVar.mo16804a().mo16733g());
            }
        }
    }

    /* renamed from: io.realm.SyncManager$b */
    class C5618b implements C5742d.C5743a {
        C5618b() {
        }

        /* renamed from: a */
        public void mo16170a(boolean z) {
            if (z) {
                RealmLog.m24075a("NetworkListener: Connection available", new Object[0]);
                SyncManager.notifyNetworkIsBack();
                return;
            }
            RealmLog.m24075a("NetworkListener: Connection lost", new Object[0]);
        }
    }

    /* renamed from: io.realm.SyncManager$c */
    static /* synthetic */ class C5619c {

        /* renamed from: a */
        static final /* synthetic */ int[] f16204a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.realm.m$a[] r0 = p340io.realm.C5765m.C5766a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16204a = r0
                io.realm.m$a r1 = p340io.realm.C5765m.C5766a.FATAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16204a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.m$a r1 = p340io.realm.C5765m.C5766a.RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p340io.realm.SyncManager.C5619c.<clinit>():void");
        }
    }

    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL"})
    /* renamed from: io.realm.SyncManager$d */
    public static class C5620d {

        /* renamed from: a */
        public static boolean f16205a = false;

        /* renamed from: b */
        public static boolean f16206b = false;
    }

    public static void addAuthenticationListener(C5627a aVar) {
        if (aVar != null) {
            authListeners.add(aVar);
            return;
        }
        throw new IllegalArgumentException("Non-null 'listener' required.");
    }

    public static synchronized void addCustomRequestHeader(String str, String str2) {
        synchronized (SyncManager.class) {
            checkNotEmpty(str, "headerName");
            checkNotNull(str2, "headerValue");
            authServer.mo16687c(str, str2, (String) null);
            globalCustomHeaders.put(str, str2);
        }
    }

    public static synchronized void addCustomRequestHeader(String str, String str2, String str3) {
        synchronized (SyncManager.class) {
            checkNotEmpty(str, "headerName");
            checkNotNull(str2, "headerValue");
            checkNotEmpty(str3, "host");
            String lowerCase = str3.toLowerCase(Locale.US);
            authServer.mo16687c(str, str2, lowerCase);
            Map map = hostRestrictedCustomHeaders.get(lowerCase);
            if (map == null) {
                map = new LinkedHashMap();
                hostRestrictedCustomHeaders.put(lowerCase, map);
            }
            map.put(str, str2);
        }
    }

    public static synchronized void addCustomRequestHeaders(Map<String, String> map) {
        synchronized (SyncManager.class) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    addCustomRequestHeader((String) next.getKey(), (String) next.getValue());
                }
            }
        }
    }

    public static synchronized void addCustomRequestHeaders(Map<String, String> map, String str) {
        synchronized (SyncManager.class) {
            if (!Util.m23792e(str)) {
                String lowerCase = str.toLowerCase(Locale.US);
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        addCustomRequestHeader((String) next.getKey(), (String) next.getValue(), lowerCase);
                    }
                }
            } else {
                throw new IllegalArgumentException("Non-empty 'host' required");
            }
        }
    }

    private static synchronized String bindSessionWithConfig(String str, String str2) {
        synchronized (SyncManager.class) {
            SyncSession syncSession = sessions.get(str);
            if (syncSession == null) {
                RealmLog.m24077c("Matching Java SyncSession could not be found for: " + str, new Object[0]);
            } else {
                try {
                    String accessToken = syncSession.getAccessToken(authServer, str2);
                    return accessToken;
                } catch (Exception e) {
                    RealmLog.m24078d(e);
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate buildCertificateFromPEM(java.lang.String r3) throws java.io.IOException, java.security.cert.CertificateException {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x001b }
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch:{ all -> 0x001b }
            r1.<init>(r3)     // Catch:{ all -> 0x001b }
            java.security.cert.CertificateFactory r3 = CERTIFICATE_FACTORY     // Catch:{ all -> 0x0018 }
            java.security.cert.Certificate r3 = r3.generateCertificate(r1)     // Catch:{ all -> 0x0018 }
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ all -> 0x0018 }
            r1.close()
            return r3
        L_0x0018:
            r3 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.SyncManager.buildCertificateFromPEM(java.lang.String):java.security.cert.X509Certificate");
    }

    private static void checkNotEmpty(String str, String str2) {
        if (Util.m23792e(str)) {
            throw new IllegalArgumentException("Non-empty '" + str2 + "' required.");
        }
    }

    private static void checkNotNull(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Non-null'" + str2 + "' required.");
        }
    }

    static List<SyncSession> getAllSessions(C5815w0 w0Var) {
        if (w0Var != null) {
            ArrayList arrayList = new ArrayList();
            for (SyncSession next : sessions.values()) {
                if (next.getState() != SyncSession.C5625e.ERROR) {
                    next.getUser().equals(w0Var);
                    throw null;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("A non-empty 'syncUser' is required.");
    }

    static C5746f getAuthServer() {
        return authServer;
    }

    public static synchronized String getAuthorizationHeaderName(URI uri) {
        String str;
        synchronized (SyncManager.class) {
            str = hostRestrictedAuthorizationHeaderName.get(uri.getHost().toLowerCase(Locale.US));
            if (str == null) {
                str = globalAuthorizationHeaderName;
            }
        }
        return str;
    }

    public static synchronized Map<String, String> getCustomRequestHeaders(URI uri) {
        LinkedHashMap linkedHashMap;
        synchronized (SyncManager.class) {
            linkedHashMap = new LinkedHashMap(globalCustomHeaders);
            Map map = hostRestrictedCustomHeaders.get(uri.getHost().toLowerCase(Locale.US));
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    public static synchronized SyncSession getOrCreateSession(C5804v0 v0Var, URI uri) {
        SyncSession syncSession;
        synchronized (SyncManager.class) {
            if (v0Var != null) {
                syncSession = sessions.get(v0Var.mo16315k());
                if (syncSession == null) {
                    RealmLog.m24075a("Creating session for: %s", v0Var.mo16315k());
                    syncSession = new SyncSession(v0Var);
                    sessions.put(v0Var.mo16315k(), syncSession);
                    if (sessions.size() == 1) {
                        RealmLog.m24075a("first session created add network listener", new Object[0]);
                        C5742d.m24003a(networkListener);
                    }
                    if (uri != null) {
                        syncSession.setResolvedRealmURI(uri);
                        syncSession.getAccessToken(authServer, BuildConfig.FLAVOR);
                    }
                }
            } else {
                throw new IllegalArgumentException("A non-empty 'syncConfiguration' is required.");
            }
        }
        return syncSession;
    }

    public static synchronized SyncSession getSession(C5804v0 v0Var) throws IllegalStateException {
        SyncSession syncSession;
        synchronized (SyncManager.class) {
            if (v0Var != null) {
                try {
                    syncSession = sessions.get(v0Var.mo16315k());
                    if (syncSession == null) {
                        throw new IllegalStateException("No SyncSession found using the path : " + v0Var.mo16315k() + "\nplease ensure to call this method after you've open the Realm");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("A non-empty 'syncConfiguration' is required.");
            }
        }
        return syncSession;
    }

    public static C5817x0 getUserStore() {
        return userStore;
    }

    static void init(String str, C5817x0 x0Var) {
        APP_ID = str;
        userStore = x0Var;
    }

    protected static native void nativeInitializeSyncManager(String str, String str2);

    private static native void nativeReconnect();

    private static native void nativeReset();

    private static native void nativeSimulateSyncError(String str, int i, String str2, boolean z);

    private static synchronized void notifyConnectionListeners(String str, long j, long j2) {
        synchronized (SyncManager.class) {
            SyncSession syncSession = sessions.get(str);
            if (syncSession != null) {
                try {
                    syncSession.notifyConnectionListeners(C5668h.m23534e(j), C5668h.m23534e(j2));
                } catch (Exception e) {
                    RealmLog.m24078d(e);
                }
            }
        }
        return;
    }

    private static synchronized void notifyErrorHandler(String str, int i, String str2, String str3) {
        synchronized (SyncManager.class) {
            if (Util.m23792e(str3)) {
                for (SyncSession notifySessionError : sessions.values()) {
                    try {
                        notifySessionError.notifySessionError(str, i, str2);
                    } catch (Exception e) {
                        RealmLog.m24078d(e);
                    }
                }
            } else {
                SyncSession syncSession = sessions.get(str3);
                if (syncSession != null) {
                    try {
                        syncSession.notifySessionError(str, i, str2);
                    } catch (Exception e2) {
                        RealmLog.m24078d(e2);
                    }
                } else {
                    RealmLog.m24088n("Cannot find the SyncSession corresponding to the path: " + str3, new Object[0]);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void notifyNetworkIsBack() {
        synchronized (SyncManager.class) {
            try {
                nativeReconnect();
            } catch (Exception e) {
                RealmLog.m24078d(e);
            }
        }
        return;
    }

    private static synchronized void notifyProgressListener(String str, long j, long j2, long j3) {
        synchronized (SyncManager.class) {
            SyncSession syncSession = sessions.get(str);
            if (syncSession != null) {
                try {
                    syncSession.notifyProgressListener(j, j2, j3);
                } catch (Exception e) {
                    RealmLog.m24078d(e);
                }
            }
        }
        return;
    }

    static void notifyUserLoggedIn(C5815w0 w0Var) {
        Iterator<C5627a> it = authListeners.iterator();
        while (it.hasNext()) {
            it.next().mo16209a(w0Var);
        }
    }

    static void notifyUserLoggedOut(C5815w0 w0Var) {
        Iterator<C5627a> it = authListeners.iterator();
        while (it.hasNext()) {
            it.next().mo16210b(w0Var);
        }
    }

    public static void refreshConnections() {
        notifyNetworkIsBack();
    }

    public static void removeAuthenticationListener(C5627a aVar) {
        if (aVar != null) {
            authListeners.remove(aVar);
        }
    }

    private static synchronized void removeSession(C5804v0 v0Var) {
        synchronized (SyncManager.class) {
            if (v0Var != null) {
                RealmLog.m24075a("Removing session for: %s", v0Var.mo16315k());
                SyncSession remove = sessions.remove(v0Var.mo16315k());
                if (remove != null) {
                    remove.close();
                }
                if (sessions.isEmpty()) {
                    RealmLog.m24075a("Last session dropped. Remove network listener.", new Object[0]);
                    C5742d.m24005c(networkListener);
                }
            } else {
                throw new IllegalArgumentException("A non-empty 'syncConfiguration' is required.");
            }
        }
    }

    static synchronized void reset() {
        synchronized (SyncManager.class) {
            nativeReset();
            sessions.clear();
            hostRestrictedAuthorizationHeaderName.clear();
            globalAuthorizationHeaderName = "Authorization";
            hostRestrictedCustomHeaders.clear();
            globalCustomHeaders.clear();
            authServer.mo16686b();
        }
    }

    static void setAuthServerImpl(C5746f fVar) {
        authServer = fVar;
    }

    public static synchronized void setAuthorizationHeaderName(String str) {
        synchronized (SyncManager.class) {
            checkNotEmpty(str, "headerName");
            authServer.mo16685a(str, (String) null);
            globalAuthorizationHeaderName = str;
        }
    }

    public static synchronized void setAuthorizationHeaderName(String str, String str2) {
        synchronized (SyncManager.class) {
            checkNotEmpty(str, "headerName");
            checkNotEmpty(str2, "host");
            String lowerCase = str2.toLowerCase(Locale.US);
            authServer.mo16685a(str, lowerCase);
            hostRestrictedAuthorizationHeaderName.put(lowerCase, str);
        }
    }

    public static void setDefaultSessionErrorHandler(SyncSession.C5624d dVar) {
        if (dVar == null) {
            dVar = SESSION_NO_OP_ERROR_HANDLER;
        }
        defaultSessionErrorHandler = dVar;
    }

    public static void setUserStore(C5817x0 x0Var) {
        if (x0Var != null) {
            userStore = x0Var;
            return;
        }
        throw new IllegalArgumentException("Non-null 'userStore' required.");
    }

    static void simulateClientReset(SyncSession syncSession) {
        nativeSimulateSyncError(syncSession.getConfiguration().mo16315k(), C5765m.DIVERGING_HISTORIES.mo16735j(), "Simulate Client Reset", true);
    }

    static synchronized boolean sslVerifyCallback(String str, String str2, int i) {
        synchronized (SyncManager.class) {
            try {
                if (ROS_CERTIFICATES_CHAIN == null) {
                    ROS_CERTIFICATES_CHAIN = new HashMap<>();
                    TRUST_MANAGER = systemDefaultTrustManager();
                    CERTIFICATE_FACTORY = CertificateFactory.getInstance("X.509");
                }
                if (!ROS_CERTIFICATES_CHAIN.containsKey(str)) {
                    ROS_CERTIFICATES_CHAIN.put(str, new ArrayList());
                }
                ROS_CERTIFICATES_CHAIN.get(str).add(str2);
                if (i != 0) {
                    return true;
                }
                List<String> list = ROS_CERTIFICATES_CHAIN.get(str);
                int size = list.size();
                X509Certificate[] x509CertificateArr = new X509Certificate[size];
                for (String buildCertificateFromPEM : list) {
                    size--;
                    x509CertificateArr[size] = buildCertificateFromPEM(buildCertificateFromPEM);
                }
                try {
                    TRUST_MANAGER.checkClientTrusted(x509CertificateArr, "RSA");
                    if (C6233d.f17573a.mo17608c(str, x509CertificateArr[0])) {
                        ROS_CERTIFICATES_CHAIN.remove(str);
                        return true;
                    }
                    RealmLog.m24077c("Can not verify the hostname for the host: " + str, new Object[0]);
                    ROS_CERTIFICATES_CHAIN.remove(str);
                    return false;
                } catch (CertificateException e) {
                    RealmLog.m24079e(e, "Can not validate SSL chain certificate for the host: " + str, new Object[0]);
                    ROS_CERTIFICATES_CHAIN.remove(str);
                    return false;
                }
            } catch (Exception e2) {
                RealmLog.m24079e(e2, "Error during certificate validation for host: " + str, new Object[0]);
                return false;
            } catch (Throwable th) {
                ROS_CERTIFICATES_CHAIN.remove(str);
                throw th;
            }
        }
    }

    private static X509TrustManager systemDefaultTrustManager() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("No System TLS", e);
        }
    }
}
