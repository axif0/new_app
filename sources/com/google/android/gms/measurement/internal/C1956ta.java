package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p148g.p189d.p190a.p232c.p241f.p247f.C4663m0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4701o0;

/* renamed from: com.google.android.gms.measurement.internal.ta */
abstract class C1956ta {

    /* renamed from: a */
    String f6301a;

    /* renamed from: b */
    int f6302b;

    /* renamed from: c */
    Boolean f6303c;

    /* renamed from: d */
    Boolean f6304d;

    /* renamed from: e */
    Long f6305e;

    /* renamed from: f */
    Long f6306f;

    C1956ta(String str, int i) {
        this.f6301a = str;
        this.f6302b = i;
    }

    /* renamed from: b */
    static Boolean m8879b(double d, C4663m0 m0Var) {
        try {
            return m8885h(new BigDecimal(d), m0Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Boolean m8880c(long j, C4663m0 m0Var) {
        try {
            return m8885h(new BigDecimal(j), m0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: d */
    static Boolean m8881d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: e */
    static Boolean m8882e(String str, C4663m0 m0Var) {
        if (!C1740ba.m8147S(str)) {
            return null;
        }
        try {
            return m8885h(new BigDecimal(str), m0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Boolean m8883f(String str, C4701o0.C4703b bVar, boolean z, String str2, List<String> list, String str3, C1746c4 c4Var) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (bVar == C4701o0.C4703b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != C4701o0.C4703b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C1908pa.f6176a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c4Var != null) {
                        c4Var.mo6767H().mo6886b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* renamed from: g */
    static Boolean m8884g(String str, C4701o0 o0Var, C1746c4 c4Var) {
        List<String> list;
        C1658o.m7845j(o0Var);
        if (str == null || !o0Var.mo14486B() || o0Var.mo14487C() == C4701o0.C4703b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (o0Var.mo14487C() == C4701o0.C4703b.IN_LIST) {
            if (o0Var.mo14493J() == 0) {
                return null;
            }
        } else if (!o0Var.mo14488D()) {
            return null;
        }
        C4701o0.C4703b C = o0Var.mo14487C();
        boolean G = o0Var.mo14491G();
        String E = (G || C == C4701o0.C4703b.REGEXP || C == C4701o0.C4703b.IN_LIST) ? o0Var.mo14489E() : o0Var.mo14489E().toUpperCase(Locale.ENGLISH);
        if (o0Var.mo14493J() == 0) {
            list = null;
        } else {
            List<String> I = o0Var.mo14492I();
            if (!G) {
                ArrayList arrayList = new ArrayList(I.size());
                for (String upperCase : I) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                I = Collections.unmodifiableList(arrayList);
            }
            list = I;
        }
        return m8883f(str, C, G, E, list, C == C4701o0.C4703b.REGEXP ? E : null, c4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r2 != null) goto L_0x0086;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m8885h(java.math.BigDecimal r9, p148g.p189d.p190a.p232c.p241f.p247f.C4663m0 r10, double r11) {
        /*
            com.google.android.gms.common.internal.C1658o.m7845j(r10)
            boolean r0 = r10.mo14438B()
            r1 = 0
            if (r0 == 0) goto L_0x010f
            g.d.a.c.f.f.m0$a r0 = r10.mo14439C()
            g.d.a.c.f.f.m0$a r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4663m0.C4664a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x010f
        L_0x0014:
            g.d.a.c.f.f.m0$a r0 = r10.mo14439C()
            g.d.a.c.f.f.m0$a r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4663m0.C4664a.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.mo14444I()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.mo14446K()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.mo14442F()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            g.d.a.c.f.f.m0$a r0 = r10.mo14439C()
            g.d.a.c.f.f.m0$a r2 = r10.mo14439C()
            g.d.a.c.f.f.m0$a r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4663m0.C4664a.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.mo14445J()
            boolean r2 = com.google.android.gms.measurement.internal.C1740ba.m8147S(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.mo14447L()
            boolean r2 = com.google.android.gms.measurement.internal.C1740ba.m8147S(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.mo14445J()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.mo14447L()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.mo14443G()
            boolean r2 = com.google.android.gms.measurement.internal.C1740ba.m8147S(r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x010f }
            java.lang.String r10 = r10.mo14443G()     // Catch:{ NumberFormatException -> 0x010f }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x010f }
            r10 = r1
            r3 = r10
        L_0x007d:
            g.d.a.c.f.f.m0$a r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4663m0.C4664a.BETWEEN
            if (r0 != r4) goto L_0x0084
            if (r10 != 0) goto L_0x0086
            return r1
        L_0x0084:
            if (r2 == 0) goto L_0x010f
        L_0x0086:
            int[] r4 = com.google.android.gms.measurement.internal.C1908pa.f6177b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0103
            r7 = 2
            if (r0 == r7) goto L_0x00f7
            r8 = 3
            if (r0 == r8) goto L_0x00af
            r11 = 4
            if (r0 == r11) goto L_0x009d
            goto L_0x010f
        L_0x009d:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00aa
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00aa
            r5 = 1
        L_0x00aa:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00af:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00eb
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e6
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e6
            r5 = 1
        L_0x00e6:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00eb:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f2
            r5 = 1
        L_0x00f2:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f7:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00fe
            r5 = 1
        L_0x00fe:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0103:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010a
            r5 = 1
        L_0x010a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x010f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1956ta.m8885h(java.math.BigDecimal, g.d.a.c.f.f.m0, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo7317a();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract boolean mo7318i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo7319j();
}
