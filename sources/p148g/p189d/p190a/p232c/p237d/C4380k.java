package p148g.p189d.p190a.p232c.p237d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C1658o;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: g.d.a.c.d.k */
public class C4380k {

    /* renamed from: b */
    private static C4380k f13923b;

    /* renamed from: a */
    private final Context f13924a;

    private C4380k(Context context) {
        this.f13924a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4380k m18605a(Context context) {
        C1658o.m7845j(context);
        synchronized (C4380k.class) {
            if (f13923b == null) {
                C4392s.m18631c(context);
                f13923b = new C4380k(context);
            }
        }
        return f13923b;
    }

    /* renamed from: d */
    private static C4394u m18606d(PackageInfo packageInfo, C4394u... uVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C4395v vVar = new C4395v(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < uVarArr.length; i++) {
            if (uVarArr[i].equals(vVar)) {
                return uVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    private final C4369c0 m18607e(String str, int i) {
        try {
            PackageInfo h = C4389c.m18627a(this.f13924a).mo13720h(str, 64, i);
            boolean e = C4379j.m18597e(this.f13924a);
            if (h == null) {
                return C4369c0.m18557d("null pkg");
            }
            if (h.signatures.length != 1) {
                return C4369c0.m18557d("single cert required");
            }
            C4395v vVar = new C4395v(h.signatures[0].toByteArray());
            String str2 = h.packageName;
            C4369c0 a = C4392s.m18629a(str2, vVar, e, false);
            return (!a.f13904a || h.applicationInfo == null || (h.applicationInfo.flags & 2) == 0 || !C4392s.m18629a(str2, vVar, false, true).f13904a) ? a : C4369c0.m18557d("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return C4369c0.m18557d(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    /* renamed from: f */
    public static boolean m18608f(PackageInfo packageInfo, boolean z) {
        C4394u uVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                uVar = m18606d(packageInfo, C4397x.f13943a);
            } else {
                uVar = m18606d(packageInfo, C4397x.f13943a[0]);
            }
            if (uVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo13710b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m18608f(packageInfo, false)) {
            return true;
        }
        if (m18608f(packageInfo, true)) {
            if (C4379j.m18597e(this.f13924a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo13711c(int i) {
        C4369c0 c0Var;
        String[] f = C4389c.m18627a(this.f13924a).mo13718f(i);
        if (f != null && f.length != 0) {
            c0Var = null;
            for (String e : f) {
                c0Var = m18607e(e, i);
                if (c0Var.f13904a) {
                    break;
                }
            }
        } else {
            c0Var = C4369c0.m18557d("no pkgs");
        }
        c0Var.mo13688g();
        return c0Var.f13904a;
    }
}
