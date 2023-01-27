package p340io.realm;

import android.os.SystemClock;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p340io.realm.internal.C5713j;
import p340io.realm.internal.OsObjectStore;
import p340io.realm.internal.Util;
import p340io.realm.log.RealmLog;

/* renamed from: io.realm.g0 */
final class C5661g0 {

    /* renamed from: e */
    private static final List<WeakReference<C5661g0>> f16312e = new ArrayList();

    /* renamed from: f */
    private static final Collection<C5661g0> f16313f = new ConcurrentLinkedQueue();

    /* renamed from: a */
    private final EnumMap<C5664c, C5665d> f16314a;

    /* renamed from: b */
    private final String f16315b;

    /* renamed from: c */
    private C5672i0 f16316c;

    /* renamed from: d */
    private final AtomicBoolean f16317d = new AtomicBoolean(false);

    /* renamed from: io.realm.g0$a */
    class C5662a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ File f16318f;

        /* renamed from: g */
        final /* synthetic */ C5672i0 f16319g;

        /* renamed from: h */
        final /* synthetic */ boolean f16320h;

        /* renamed from: i */
        final /* synthetic */ String f16321i;

        C5662a(File file, C5672i0 i0Var, boolean z, String str) {
            this.f16318f = file;
            this.f16319g = i0Var;
            this.f16320h = z;
            this.f16321i = str;
        }

        public void run() {
            if (this.f16318f != null) {
                C5661g0.m23494c(this.f16319g.mo16307c(), this.f16318f);
            }
            if (this.f16320h) {
                C5661g0.m23494c(this.f16321i, new File(C5713j.getFacade(this.f16319g.mo16323t()).getSyncServerCertificateFilePath(this.f16319g)));
            }
        }
    }

    /* renamed from: io.realm.g0$b */
    interface C5663b {
        /* renamed from: a */
        void mo16302a(int i);
    }

    /* renamed from: io.realm.g0$c */
    private enum C5664c {
        TYPED_REALM,
        DYNAMIC_REALM;

        /* renamed from: e */
        static C5664c m23508e(Class<? extends C5632b> cls) {
            if (cls == C5648d0.class) {
                return TYPED_REALM;
            }
            if (cls == C5756k.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    /* renamed from: io.realm.g0$d */
    private static class C5665d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final ThreadLocal<C5632b> f16325a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ThreadLocal<Integer> f16326b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f16327c;

        private C5665d() {
            this.f16325a = new ThreadLocal<>();
            this.f16326b = new ThreadLocal<>();
            this.f16327c = 0;
        }

        /* synthetic */ C5665d(C5662a aVar) {
            this();
        }

        /* renamed from: d */
        static /* synthetic */ int m23512d(C5665d dVar) {
            int i = dVar.f16327c;
            dVar.f16327c = i + 1;
            return i;
        }

        /* renamed from: e */
        static /* synthetic */ int m23513e(C5665d dVar) {
            int i = dVar.f16327c;
            dVar.f16327c = i - 1;
            return i;
        }
    }

    private C5661g0(String str) {
        this.f16315b = str;
        this.f16314a = new EnumMap<>(C5664c.class);
        for (C5664c put : C5664c.values()) {
            this.f16314a.put(put, new C5665d((C5662a) null));
        }
    }

    /* renamed from: b */
    private static void m23493b(C5672i0 i0Var) {
        File file = i0Var.mo16320p() ? new File(i0Var.mo16316l(), i0Var.mo16317m()) : null;
        String syncServerCertificateAssetName = C5713j.getFacade(i0Var.mo16323t()).getSyncServerCertificateAssetName(i0Var);
        boolean z = !Util.m23792e(syncServerCertificateAssetName);
        if (file != null || z) {
            OsObjectStore.m23669a(i0Var, new C5662a(file, i0Var, z, syncServerCertificateAssetName));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087 A[SYNTHETIC, Splitter:B:45:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008e A[SYNTHETIC, Splitter:B:49:0x008e] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23494c(java.lang.String r7, java.io.File r8) {
        /*
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            android.content.Context r1 = p340io.realm.C5632b.f16244l     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            java.io.InputStream r1 = r1.open(r7)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            if (r1 == 0) goto L_0x004b
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            r8 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r8]     // Catch:{ IOException -> 0x0043 }
        L_0x001d:
            int r3 = r1.read(r8)     // Catch:{ IOException -> 0x0043 }
            r4 = -1
            if (r3 <= r4) goto L_0x0029
            r4 = 0
            r2.write(r8, r4, r3)     // Catch:{ IOException -> 0x0043 }
            goto L_0x001d
        L_0x0029:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            r2.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r7 = move-exception
            if (r0 != 0) goto L_0x0038
            r0 = r7
        L_0x0038:
            if (r0 != 0) goto L_0x003b
            return
        L_0x003b:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$Kind r8 = p340io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
            r7.<init>((p340io.realm.exceptions.RealmFileException.Kind) r8, (java.lang.Throwable) r0)
            throw r7
        L_0x0043:
            r8 = move-exception
            goto L_0x006b
        L_0x0045:
            r7 = move-exception
            r2 = r0
            goto L_0x0085
        L_0x0048:
            r8 = move-exception
            r2 = r0
            goto L_0x006b
        L_0x004b:
            io.realm.exceptions.RealmFileException r8 = new io.realm.exceptions.RealmFileException     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            io.realm.exceptions.RealmFileException$Kind r2 = p340io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            r3.<init>()     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            r3.append(r7)     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            r8.<init>((p340io.realm.exceptions.RealmFileException.Kind) r2, (java.lang.String) r3)     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            throw r8     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
        L_0x0064:
            r7 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x0085
        L_0x0068:
            r8 = move-exception
            r1 = r0
            r2 = r1
        L_0x006b:
            io.realm.exceptions.RealmFileException r3 = new io.realm.exceptions.RealmFileException     // Catch:{ all -> 0x0084 }
            io.realm.exceptions.RealmFileException$Kind r4 = p340io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r5.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = "Could not resolve the path to the asset file: "
            r5.append(r6)     // Catch:{ all -> 0x0084 }
            r5.append(r7)     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = r5.toString()     // Catch:{ all -> 0x0084 }
            r3.<init>(r4, r7, r8)     // Catch:{ all -> 0x0084 }
            throw r3     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r7 = move-exception
        L_0x0085:
            if (r1 == 0) goto L_0x008c
            r1.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r0 = move-exception
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            r2.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            goto L_0x0093
        L_0x0092:
            throw r7
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5661g0.m23494c(java.lang.String, java.io.File):void");
    }

    /* renamed from: d */
    static <E extends C5632b> E m23495d(C5672i0 i0Var, Class<E> cls) {
        return m23499h(i0Var.mo16315k(), true).m23497f(i0Var, cls);
    }

    /* renamed from: e */
    private static void m23496e(C5672i0 i0Var) {
        int i = 5;
        boolean z = false;
        while (i > 0 && !z) {
            try {
                z = C5632b.m23337q(i0Var);
            } catch (IllegalStateException unused) {
                i--;
                RealmLog.m24088n("Sync server still holds a reference to the Realm. It cannot be deleted. Retrying " + i + " more times", new Object[0]);
                if (i > 0) {
                    SystemClock.sleep(15);
                }
            }
        }
        if (!z) {
            RealmLog.m24077c("Failed to delete the underlying Realm file: " + i0Var.mo16315k(), new Object[0]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: io.realm.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: io.realm.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: io.realm.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: io.realm.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized <E extends p340io.realm.C5632b> E m23497f(p340io.realm.C5672i0 r8, java.lang.Class<E> r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.EnumMap<io.realm.g0$c, io.realm.g0$d> r0 = r7.f16314a     // Catch:{ all -> 0x00e2 }
            io.realm.g0$c r1 = p340io.realm.C5661g0.C5664c.m23508e(r9)     // Catch:{ all -> 0x00e2 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00e2 }
            io.realm.g0$d r0 = (p340io.realm.C5661g0.C5665d) r0     // Catch:{ all -> 0x00e2 }
            int r1 = r7.m23500j()     // Catch:{ all -> 0x00e2 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r4 = r8.mo16325u()     // Catch:{ all -> 0x00e2 }
            r4 = r4 ^ r3
            if (r1 == 0) goto L_0x007d
            m23493b(r8)     // Catch:{ all -> 0x00e2 }
            r1 = 0
            boolean r5 = r8.mo16323t()     // Catch:{ all -> 0x0076 }
            if (r5 == 0) goto L_0x0065
            if (r4 == 0) goto L_0x006e
            io.realm.internal.OsRealmConfig$b r5 = new io.realm.internal.OsRealmConfig$b     // Catch:{ all -> 0x0076 }
            r5.<init>(r8)     // Catch:{ all -> 0x0076 }
            io.realm.internal.OsRealmConfig r5 = r5.mo16440b()     // Catch:{ all -> 0x0076 }
            io.realm.internal.j r6 = p340io.realm.internal.C5713j.getSyncFacadeIfPossible()     // Catch:{ all -> 0x0076 }
            r6.wrapObjectStoreSessionIfRequired(r5)     // Catch:{ all -> 0x0076 }
            io.realm.internal.j r5 = p340io.realm.internal.C5713j.getSyncFacadeIfPossible()     // Catch:{ all -> 0x0076 }
            boolean r5 = r5.isPartialRealm(r8)     // Catch:{ all -> 0x0076 }
            if (r5 == 0) goto L_0x005d
            io.realm.internal.OsSharedRealm r5 = p340io.realm.internal.OsSharedRealm.getInstance((p340io.realm.C5672i0) r8)     // Catch:{ all -> 0x0076 }
            io.realm.internal.j r6 = p340io.realm.internal.C5713j.getSyncFacadeIfPossible()     // Catch:{ all -> 0x0052 }
            r6.downloadInitialRemoteChanges(r8)     // Catch:{ all -> 0x0052 }
            r1 = r5
            goto L_0x006e
        L_0x0052:
            r9 = move-exception
            r5.close()     // Catch:{ all -> 0x005a }
            m23496e(r8)     // Catch:{ all -> 0x0076 }
            throw r9     // Catch:{ all -> 0x0076 }
        L_0x005a:
            r8 = move-exception
            r1 = r5
            goto L_0x0077
        L_0x005d:
            io.realm.internal.j r5 = p340io.realm.internal.C5713j.getSyncFacadeIfPossible()     // Catch:{ all -> 0x0076 }
            r5.downloadInitialRemoteChanges(r8)     // Catch:{ all -> 0x0076 }
            goto L_0x006e
        L_0x0065:
            if (r4 != 0) goto L_0x006e
            io.realm.internal.OsSharedRealm r1 = p340io.realm.internal.OsSharedRealm.getInstance((p340io.realm.C5672i0) r8)     // Catch:{ all -> 0x0076 }
            p340io.realm.internal.Table.m23721s(r1)     // Catch:{ all -> 0x0076 }
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ all -> 0x00e2 }
        L_0x0073:
            r7.f16316c = r8     // Catch:{ all -> 0x00e2 }
            goto L_0x0080
        L_0x0076:
            r8 = move-exception
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            r1.close()     // Catch:{ all -> 0x00e2 }
        L_0x007c:
            throw r8     // Catch:{ all -> 0x00e2 }
        L_0x007d:
            r7.m23503o(r8)     // Catch:{ all -> 0x00e2 }
        L_0x0080:
            java.lang.ThreadLocal r8 = r0.f16325a     // Catch:{ all -> 0x00e2 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x00e2 }
            if (r8 != 0) goto L_0x00bc
            java.lang.Class<io.realm.d0> r8 = p340io.realm.C5648d0.class
            if (r9 != r8) goto L_0x0096
            io.realm.d0 r8 = p340io.realm.C5648d0.m23424j0(r7)     // Catch:{ all -> 0x00e2 }
            m23502n(r8, r4)     // Catch:{ all -> 0x00e2 }
            goto L_0x009e
        L_0x0096:
            java.lang.Class<io.realm.k> r8 = p340io.realm.C5756k.class
            if (r9 != r8) goto L_0x00b4
            io.realm.k r8 = p340io.realm.C5756k.m24051X(r7)     // Catch:{ all -> 0x00e2 }
        L_0x009e:
            java.lang.ThreadLocal r9 = r0.f16325a     // Catch:{ all -> 0x00e2 }
            r9.set(r8)     // Catch:{ all -> 0x00e2 }
            java.lang.ThreadLocal r8 = r0.f16326b     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00e2 }
            r8.set(r9)     // Catch:{ all -> 0x00e2 }
            p340io.realm.C5661g0.C5665d.m23512d(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00bc
        L_0x00b4:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e2 }
            java.lang.String r9 = "The type of Realm class must be Realm or DynamicRealm."
            r8.<init>(r9)     // Catch:{ all -> 0x00e2 }
            throw r8     // Catch:{ all -> 0x00e2 }
        L_0x00bc:
            java.lang.ThreadLocal r8 = r0.f16326b     // Catch:{ all -> 0x00e2 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x00e2 }
            java.lang.ThreadLocal r9 = r0.f16326b     // Catch:{ all -> 0x00e2 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x00e2 }
            int r8 = r8 + r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00e2 }
            r9.set(r8)     // Catch:{ all -> 0x00e2 }
            java.lang.ThreadLocal r8 = r0.f16325a     // Catch:{ all -> 0x00e2 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x00e2 }
            io.realm.b r8 = (p340io.realm.C5632b) r8     // Catch:{ all -> 0x00e2 }
            monitor-exit(r7)
            return r8
        L_0x00e2:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5661g0.m23497f(io.realm.i0, java.lang.Class):io.realm.b");
    }

    /* renamed from: g */
    private synchronized void m23498g(C5663b bVar) {
        bVar.mo16302a(m23500j());
    }

    /* renamed from: h */
    private static C5661g0 m23499h(String str, boolean z) {
        C5661g0 g0Var;
        synchronized (f16312e) {
            Iterator<WeakReference<C5661g0>> it = f16312e.iterator();
            g0Var = null;
            while (it.hasNext()) {
                C5661g0 g0Var2 = (C5661g0) it.next().get();
                if (g0Var2 == null) {
                    it.remove();
                } else if (g0Var2.f16315b.equals(str)) {
                    g0Var = g0Var2;
                }
            }
            if (g0Var == null && z) {
                g0Var = new C5661g0(str);
                f16312e.add(new WeakReference(g0Var));
            }
        }
        return g0Var;
    }

    /* renamed from: j */
    private int m23500j() {
        int i = 0;
        for (C5665d c : this.f16314a.values()) {
            i += c.f16327c;
        }
        return i;
    }

    /* renamed from: k */
    static void m23501k(C5672i0 i0Var, C5663b bVar) {
        synchronized (f16312e) {
            C5661g0 h = m23499h(i0Var.mo16315k(), false);
            if (h == null) {
                bVar.mo16302a(0);
            } else {
                h.m23498g(bVar);
            }
        }
    }

    /* renamed from: n */
    private static void m23502n(C5648d0 d0Var, boolean z) {
        if (z) {
            try {
                C5713j.getSyncFacadeIfPossible().downloadInitialSubscriptions(d0Var);
            } catch (Throwable unused) {
                d0Var.close();
                m23496e(d0Var.mo16234x());
            }
        }
    }

    /* renamed from: o */
    private void m23503o(C5672i0 i0Var) {
        if (!this.f16316c.equals(i0Var)) {
            if (Arrays.equals(this.f16316c.mo16311g(), i0Var.mo16311g())) {
                C5758k0 i = i0Var.mo16314i();
                C5758k0 i2 = this.f16316c.mo16314i();
                if (i2 == null || i == null || !i2.getClass().equals(i.getClass()) || i.equals(i2)) {
                    throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. \nCached configuration: \n" + this.f16316c + "\n\nNew configuration: \n" + i0Var);
                }
                throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: " + i0Var.mo16314i().getClass().getCanonicalName());
            }
            throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
        }
    }

    /* renamed from: i */
    public C5672i0 mo16298i() {
        return this.f16316c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo16299l() {
        if (!this.f16317d.getAndSet(true)) {
            f16313f.add(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo16300m(p340io.realm.C5632b r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r7.mo16218D()     // Catch:{ all -> 0x00a6 }
            java.util.EnumMap<io.realm.g0$c, io.realm.g0$d> r1 = r6.f16314a     // Catch:{ all -> 0x00a6 }
            java.lang.Class r2 = r7.getClass()     // Catch:{ all -> 0x00a6 }
            io.realm.g0$c r2 = p340io.realm.C5661g0.C5664c.m23508e(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00a6 }
            io.realm.g0$d r1 = (p340io.realm.C5661g0.C5665d) r1     // Catch:{ all -> 0x00a6 }
            java.lang.ThreadLocal r2 = r1.f16326b     // Catch:{ all -> 0x00a6 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00a6 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x00a6 }
            r3 = 0
            if (r2 != 0) goto L_0x0026
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00a6 }
        L_0x0026:
            int r4 = r2.intValue()     // Catch:{ all -> 0x00a6 }
            r5 = 1
            if (r4 > 0) goto L_0x003b
            java.lang.String r7 = "%s has been closed already. refCount is %s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a6 }
            r1[r3] = r0     // Catch:{ all -> 0x00a6 }
            r1[r5] = r2     // Catch:{ all -> 0x00a6 }
            p340io.realm.log.RealmLog.m24088n(r7, r1)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r6)
            return
        L_0x003b:
            int r2 = r2.intValue()     // Catch:{ all -> 0x00a6 }
            int r2 = r2 - r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a6 }
            int r3 = r2.intValue()     // Catch:{ all -> 0x00a6 }
            if (r3 != 0) goto L_0x009d
            java.lang.ThreadLocal r2 = r1.f16326b     // Catch:{ all -> 0x00a6 }
            r3 = 0
            r2.set(r3)     // Catch:{ all -> 0x00a6 }
            java.lang.ThreadLocal r2 = r1.f16325a     // Catch:{ all -> 0x00a6 }
            r2.set(r3)     // Catch:{ all -> 0x00a6 }
            p340io.realm.C5661g0.C5665d.m23513e(r1)     // Catch:{ all -> 0x00a6 }
            int r1 = r1.f16327c     // Catch:{ all -> 0x00a6 }
            if (r1 < 0) goto L_0x0081
            r7.mo16230r()     // Catch:{ all -> 0x00a6 }
            int r0 = r6.m23500j()     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x00a4
            r6.f16316c = r3     // Catch:{ all -> 0x00a6 }
            io.realm.i0 r0 = r7.mo16234x()     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.mo16323t()     // Catch:{ all -> 0x00a6 }
            io.realm.internal.j r0 = p340io.realm.internal.C5713j.getFacade(r0)     // Catch:{ all -> 0x00a6 }
            io.realm.i0 r7 = r7.mo16234x()     // Catch:{ all -> 0x00a6 }
            r0.realmClosed(r7)     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x0081:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "Global reference counter of Realm"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            r1.append(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = " got corrupted."
            r1.append(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a6 }
            r7.<init>(r0)     // Catch:{ all -> 0x00a6 }
            throw r7     // Catch:{ all -> 0x00a6 }
        L_0x009d:
            java.lang.ThreadLocal r7 = r1.f16326b     // Catch:{ all -> 0x00a6 }
            r7.set(r2)     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r6)
            return
        L_0x00a6:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5661g0.mo16300m(io.realm.b):void");
    }
}
