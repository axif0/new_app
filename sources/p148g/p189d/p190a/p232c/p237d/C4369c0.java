package p148g.p189d.p190a.p232c.p237d;

import android.util.Log;
import com.google.android.gms.common.util.C1678a;
import com.google.android.gms.common.util.C1687j;
import java.util.concurrent.Callable;

/* renamed from: g.d.a.c.d.c0 */
class C4369c0 {

    /* renamed from: d */
    private static final C4369c0 f13903d = new C4369c0(true, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f13904a;

    /* renamed from: b */
    private final String f13905b;

    /* renamed from: c */
    private final Throwable f13906c;

    C4369c0(boolean z, String str, Throwable th) {
        this.f13904a = z;
        this.f13905b = str;
        this.f13906c = th;
    }

    /* renamed from: b */
    static C4369c0 m18555b(String str, Throwable th) {
        return new C4369c0(false, str, th);
    }

    /* renamed from: c */
    static C4369c0 m18556c(Callable<String> callable) {
        return new C4374e0(callable);
    }

    /* renamed from: d */
    static C4369c0 m18557d(String str) {
        return new C4369c0(false, str, (Throwable) null);
    }

    /* renamed from: e */
    static String m18558e(String str, C4394u uVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C1687j.m7955a(C1678a.m7933b("SHA-1").digest(uVar.mo13729w())), Boolean.valueOf(z), "12451009.false"});
    }

    /* renamed from: f */
    static C4369c0 m18559f() {
        return f13903d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo13687a() {
        return this.f13905b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo13688g() {
        if (!this.f13904a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f13906c != null) {
                Log.d("GoogleCertificatesRslt", mo13687a(), this.f13906c);
            } else {
                Log.d("GoogleCertificatesRslt", mo13687a());
            }
        }
    }
}
