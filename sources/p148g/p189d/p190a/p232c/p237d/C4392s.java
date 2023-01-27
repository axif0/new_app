package p148g.p189d.p190a.p232c.p237d;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.C1647j0;
import com.google.android.gms.common.internal.C1650k0;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.dynamite.DynamiteModule;
import p148g.p189d.p190a.p232c.p240e.C4403b;

/* renamed from: g.d.a.c.d.s */
final class C4392s {

    /* renamed from: a */
    private static volatile C1647j0 f13933a;

    /* renamed from: b */
    private static final Object f13934b = new Object();

    /* renamed from: c */
    private static Context f13935c;

    /* renamed from: a */
    static C4369c0 m18629a(String str, C4394u uVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m18632d(str, uVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ String m18630b(boolean z, String str, C4394u uVar) throws Exception {
        boolean z2 = true;
        if (z || !m18632d(str, uVar, true, false).f13904a) {
            z2 = false;
        }
        return C4369c0.m18558e(str, uVar, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m18631c(android.content.Context r2) {
        /*
            java.lang.Class<g.d.a.c.d.s> r0 = p148g.p189d.p190a.p232c.p237d.C4392s.class
            monitor-enter(r0)
            android.content.Context r1 = f13935c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f13935c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p237d.C4392s.m18631c(android.content.Context):void");
    }

    /* renamed from: d */
    private static C4369c0 m18632d(String str, C4394u uVar, boolean z, boolean z2) {
        try {
            if (f13933a == null) {
                C1658o.m7845j(f13935c);
                synchronized (f13934b) {
                    if (f13933a == null) {
                        f13933a = C1650k0.m7825r(DynamiteModule.m7994d(f13935c, DynamiteModule.f5592j, "com.google.android.gms.googlecertificates").mo6590c("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C1658o.m7845j(f13935c);
            try {
                return f13933a.mo6549i0(new C4365a0(str, uVar, z, z2), C4403b.m18643S0(f13935c.getPackageManager())) ? C4369c0.m18559f() : C4369c0.m18556c(new C4393t(z, str, uVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C4369c0.m18555b("module call", e);
            }
        } catch (DynamiteModule.C1699a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return C4369c0.m18555b(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }
}
