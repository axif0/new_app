package p374m.p375g0.p378g;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6242l;
import p374m.C6243m;
import p374m.C6255s;
import p374m.C6257t;
import p374m.p375g0.C6130c;
import p385n.C6282f;

/* renamed from: m.g0.g.e */
public final class C6163e {
    static {
        C6282f.m25891n("\"\\");
        C6282f.m25891n("\t ,=");
    }

    /* renamed from: a */
    public static long m25191a(C6255s sVar) {
        return m25200j(sVar.mo17681c("Content-Length"));
    }

    /* renamed from: b */
    public static long m25192b(C6113c0 c0Var) {
        return m25191a(c0Var.mo17274t());
    }

    /* renamed from: c */
    public static boolean m25193c(C6113c0 c0Var) {
        if (c0Var.mo17264S().mo17218g().equals("HEAD")) {
            return false;
        }
        int m = c0Var.mo17270m();
        return (((m >= 100 && m < 200) || m == 204 || m == 304) && m25192b(c0Var) == -1 && !"chunked".equalsIgnoreCase(c0Var.mo17272q("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: d */
    public static boolean m25194d(C6255s sVar) {
        return m25201k(sVar).contains("*");
    }

    /* renamed from: e */
    public static boolean m25195e(C6113c0 c0Var) {
        return m25194d(c0Var.mo17274t());
    }

    /* renamed from: f */
    public static int m25196f(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: g */
    public static void m25197g(C6243m mVar, C6257t tVar, C6255s sVar) {
        if (mVar != C6243m.f17628a) {
            List<C6242l> f = C6242l.m25570f(tVar, sVar);
            if (!f.isEmpty()) {
                mVar.mo17643b(tVar, f);
            }
        }
    }

    /* renamed from: h */
    public static int m25198h(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: i */
    public static int m25199i(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    /* renamed from: j */
    private static long m25200j(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: k */
    public static Set<String> m25201k(C6255s sVar) {
        Set<String> emptySet = Collections.emptySet();
        int h = sVar.mo17685h();
        for (int i = 0; i < h; i++) {
            if ("Vary".equalsIgnoreCase(sVar.mo17682e(i))) {
                String i2 = sVar.mo17687i(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : i2.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    /* renamed from: l */
    private static Set<String> m25202l(C6113c0 c0Var) {
        return m25201k(c0Var.mo17274t());
    }

    /* renamed from: m */
    public static C6255s m25203m(C6255s sVar, C6255s sVar2) {
        Set<String> k = m25201k(sVar2);
        if (k.isEmpty()) {
            return new C6255s.C6256a().mo17693d();
        }
        C6255s.C6256a aVar = new C6255s.C6256a();
        int h = sVar.mo17685h();
        for (int i = 0; i < h; i++) {
            String e = sVar.mo17682e(i);
            if (k.contains(e)) {
                aVar.mo17690a(e, sVar.mo17687i(i));
            }
        }
        return aVar.mo17693d();
    }

    /* renamed from: n */
    public static C6255s m25204n(C6113c0 c0Var) {
        return m25203m(c0Var.mo17278x().mo17264S().mo17216e(), c0Var.mo17274t());
    }

    /* renamed from: o */
    public static boolean m25205o(C6113c0 c0Var, C6255s sVar, C6099a0 a0Var) {
        for (String next : m25202l(c0Var)) {
            if (!C6130c.m25054q(sVar.mo17688j(next), a0Var.mo17215d(next))) {
                return false;
            }
        }
        return true;
    }
}
