package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.e */
public final class C1765e {

    /* renamed from: c */
    public static final C1765e f5741c = new C1765e((Boolean) null, (Boolean) null);

    /* renamed from: a */
    private final Boolean f5742a;

    /* renamed from: b */
    private final Boolean f5743b;

    public C1765e(Boolean bool, Boolean bool2) {
        this.f5742a = bool;
        this.f5743b = bool2;
    }

    /* renamed from: a */
    private static int m8333a(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: b */
    public static C1765e m8334b(String str) {
        Boolean bool;
        Boolean bool2 = null;
        if (str != null) {
            Boolean c = str.length() >= 3 ? m8335c(str.charAt(2)) : null;
            if (str.length() >= 4) {
                bool2 = m8335c(str.charAt(3));
            }
            bool = bool2;
            bool2 = c;
        } else {
            bool = null;
        }
        return new C1765e(bool2, bool);
    }

    /* renamed from: c */
    private static Boolean m8335c(char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: d */
    private static Boolean m8336d(Boolean bool, Boolean bool2) {
        if (bool != null) {
            return bool.booleanValue() ? bool2 : Boolean.FALSE;
        }
        if (bool2 == null || bool2.booleanValue()) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: f */
    public static String m8337f(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && m8341m(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || m8341m(string2) != null) {
            return null;
        }
        return string2;
    }

    /* renamed from: g */
    static boolean m8338g(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: i */
    private static char m8339i(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    /* renamed from: j */
    public static C1765e m8340j(Bundle bundle) {
        return bundle == null ? f5741c : new C1765e(m8341m(bundle.getString("ad_storage")), m8341m(bundle.getString("analytics_storage")));
    }

    /* renamed from: m */
    private static Boolean m8341m(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: e */
    public final String mo6873e() {
        return "G1" + m8339i(this.f5742a) + m8339i(this.f5743b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1765e)) {
            return false;
        }
        C1765e eVar = (C1765e) obj;
        return m8333a(this.f5742a) == m8333a(eVar.f5742a) && m8333a(this.f5743b) == m8333a(eVar.f5743b);
    }

    /* renamed from: h */
    public final boolean mo6875h(C1765e eVar) {
        Boolean bool = this.f5742a;
        Boolean bool2 = Boolean.FALSE;
        if (bool == bool2 && eVar.f5742a != bool2) {
            return true;
        }
        Boolean bool3 = this.f5743b;
        Boolean bool4 = Boolean.FALSE;
        return bool3 == bool4 && eVar.f5743b != bool4;
    }

    public final int hashCode() {
        return ((m8333a(this.f5742a) + 527) * 31) + m8333a(this.f5743b);
    }

    /* renamed from: k */
    public final C1765e mo6877k(C1765e eVar) {
        return new C1765e(m8336d(this.f5742a, eVar.f5742a), m8336d(this.f5743b, eVar.f5743b));
    }

    /* renamed from: l */
    public final Boolean mo6878l() {
        return this.f5742a;
    }

    /* renamed from: n */
    public final C1765e mo6879n(C1765e eVar) {
        Boolean bool = this.f5742a;
        if (bool == null) {
            bool = eVar.f5742a;
        }
        Boolean bool2 = this.f5743b;
        if (bool2 == null) {
            bool2 = eVar.f5743b;
        }
        return new C1765e(bool, bool2);
    }

    /* renamed from: o */
    public final boolean mo6880o() {
        Boolean bool = this.f5742a;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: p */
    public final Boolean mo6881p() {
        return this.f5743b;
    }

    /* renamed from: q */
    public final boolean mo6882q() {
        Boolean bool = this.f5743b;
        return bool == null || bool.booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f5742a;
        String str = "granted";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool.booleanValue() ? str : "denied");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f5743b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (!bool2.booleanValue()) {
                str = "denied";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
