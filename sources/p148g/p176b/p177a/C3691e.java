package p148g.p176b.p177a;

import android.os.Build;
import p148g.p176b.p177a.C3683c;

/* renamed from: g.b.a.e */
final class C3691e implements C3683c.C3685b {
    C3691e() {
    }

    /* renamed from: a */
    public String mo12196a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    /* renamed from: b */
    public String mo12197b(String str) {
        return str.substring(3, str.length() - 3);
    }

    /* renamed from: c */
    public void mo12198c(String str) {
        System.loadLibrary(str);
    }

    /* renamed from: d */
    public String[] mo12199d() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr;
            }
        }
        if (!C3692f.m15495a(Build.CPU_ABI2)) {
            return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        }
        return new String[]{Build.CPU_ABI};
    }

    /* renamed from: e */
    public void mo12200e(String str) {
        System.load(str);
    }
}
