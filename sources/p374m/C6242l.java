package p374m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p374m.p375g0.C6130c;
import p374m.p375g0.p378g.C6161d;

/* renamed from: m.l */
public final class C6242l {

    /* renamed from: j */
    private static final Pattern f17615j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f17616k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f17617l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f17618m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f17619a;

    /* renamed from: b */
    private final String f17620b;

    /* renamed from: c */
    private final long f17621c;

    /* renamed from: d */
    private final String f17622d;

    /* renamed from: e */
    private final String f17623e;

    /* renamed from: f */
    private final boolean f17624f;

    /* renamed from: g */
    private final boolean f17625g;

    /* renamed from: h */
    private final boolean f17626h;

    /* renamed from: i */
    private final boolean f17627i;

    private C6242l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17619a = str;
        this.f17620b = str2;
        this.f17621c = j;
        this.f17622d = str3;
        this.f17623e = str4;
        this.f17624f = z;
        this.f17625g = z2;
        this.f17627i = z3;
        this.f17626h = z4;
    }

    /* renamed from: a */
    private static int m25566a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    private static boolean m25567b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C6130c.m25037J(str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p374m.C6242l m25568d(long r23, p374m.C6257t r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = p374m.p375g0.C6130c.m25051n(r0, r2, r1, r3)
            r5 = 61
            int r6 = p374m.p375g0.C6130c.m25051n(r0, r2, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = p374m.p375g0.C6130c.m25036I(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0135
            int r8 = p374m.p375g0.C6130c.m25061x(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0135
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = p374m.p375g0.C6130c.m25036I(r0, r6, r4)
            int r11 = p374m.p375g0.C6130c.m25061x(r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r14 = r8
            r19 = r10
            r21 = r12
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
        L_0x004c:
            if (r4 >= r1) goto L_0x00ba
            int r7 = p374m.p375g0.C6130c.m25051n(r0, r4, r1, r3)
            int r3 = p374m.p375g0.C6130c.m25051n(r0, r4, r7, r5)
            java.lang.String r4 = p374m.p375g0.C6130c.m25036I(r0, r4, r3)
            if (r3 >= r7) goto L_0x0063
            int r3 = r3 + 1
            java.lang.String r3 = p374m.p375g0.C6130c.m25036I(r0, r3, r7)
            goto L_0x0065
        L_0x0063:
            java.lang.String r3 = ""
        L_0x0065:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            long r21 = m25572h(r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            goto L_0x0082
        L_0x0076:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            long r19 = m25573i(r3)     // Catch:{  }
        L_0x0082:
            r18 = 1
            goto L_0x00b2
        L_0x0085:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r14 = m25571g(r3)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r17 = 0
            goto L_0x00b2
        L_0x0094:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x009e
            r8 = r3
            goto L_0x00b2
        L_0x009e:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00a8
            r15 = 1
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00b2
            r16 = 1
        L_0x00b2:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L_0x004c
        L_0x00ba:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            r11 = r0
            goto L_0x00e7
        L_0x00c2:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00d4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00d9
        L_0x00d4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d9:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c0
        L_0x00e3:
            r11 = r12
            goto L_0x00e7
        L_0x00e5:
            r11 = r21
        L_0x00e7:
            java.lang.String r0 = r25.mo17709m()
            if (r14 != 0) goto L_0x00f0
            r13 = r0
            r1 = 0
            goto L_0x00fa
        L_0x00f0:
            boolean r1 = m25567b(r0, r14)
            if (r1 != 0) goto L_0x00f8
            r1 = 0
            return r1
        L_0x00f8:
            r1 = 0
            r13 = r14
        L_0x00fa:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L_0x010f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m26238c()
            java.lang.String r0 = r0.mo18059d(r13)
            if (r0 != 0) goto L_0x010f
            return r1
        L_0x010f:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x011c
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r14 = r8
            goto L_0x012d
        L_0x011c:
            java.lang.String r1 = r25.mo17704h()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L_0x012c
            java.lang.String r0 = r1.substring(r2, r3)
        L_0x012c:
            r14 = r0
        L_0x012d:
            m.l r0 = new m.l
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0135:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.C6242l.m25568d(long, m.t, java.lang.String):m.l");
    }

    /* renamed from: e */
    public static C6242l m25569e(C6257t tVar, String str) {
        return m25568d(System.currentTimeMillis(), tVar, str);
    }

    /* renamed from: f */
    public static List<C6242l> m25570f(C6257t tVar, C6255s sVar) {
        List<String> j = sVar.mo17688j("Set-Cookie");
        int size = j.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C6242l e = m25569e(tVar, j.get(i));
            if (e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    /* renamed from: g */
    private static String m25571g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String d = C6130c.m25041d(str);
            if (d != null) {
                return d;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static long m25572h(String str, int i, int i2) {
        int a = m25566a(str, i, i2, false);
        Matcher matcher = f17618m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m25566a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f17618m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f17617l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f17616k).matches()) {
                i6 = f17616k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(f17615j).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            a = m25566a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C6130c.f17210n);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* renamed from: i */
    private static long m25573i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public String mo17636c() {
        return this.f17619a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6242l)) {
            return false;
        }
        C6242l lVar = (C6242l) obj;
        return lVar.f17619a.equals(this.f17619a) && lVar.f17620b.equals(this.f17620b) && lVar.f17622d.equals(this.f17622d) && lVar.f17623e.equals(this.f17623e) && lVar.f17621c == this.f17621c && lVar.f17624f == this.f17624f && lVar.f17625g == this.f17625g && lVar.f17626h == this.f17626h && lVar.f17627i == this.f17627i;
    }

    public int hashCode() {
        long j = this.f17621c;
        return ((((((((((((((((527 + this.f17619a.hashCode()) * 31) + this.f17620b.hashCode()) * 31) + this.f17622d.hashCode()) * 31) + this.f17623e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f17624f ^ true ? 1 : 0)) * 31) + (this.f17625g ^ true ? 1 : 0)) * 31) + (this.f17626h ^ true ? 1 : 0)) * 31) + (this.f17627i ^ true ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo17639j(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17619a);
        sb.append('=');
        sb.append(this.f17620b);
        if (this.f17626h) {
            if (this.f17621c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = C6161d.m25188a(new Date(this.f17621c));
            }
            sb.append(str);
        }
        if (!this.f17627i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f17622d);
        }
        sb.append("; path=");
        sb.append(this.f17623e);
        if (this.f17624f) {
            sb.append("; secure");
        }
        if (this.f17625g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: k */
    public String mo17640k() {
        return this.f17620b;
    }

    public String toString() {
        return mo17639j(false);
    }
}
