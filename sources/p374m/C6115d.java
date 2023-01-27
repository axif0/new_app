package p374m;

import com.karumi.dexter.BuildConfig;
import java.util.concurrent.TimeUnit;

/* renamed from: m.d */
public final class C6115d {

    /* renamed from: n */
    public static final C6115d f17147n;

    /* renamed from: a */
    private final boolean f17148a;

    /* renamed from: b */
    private final boolean f17149b;

    /* renamed from: c */
    private final int f17150c;

    /* renamed from: d */
    private final int f17151d;

    /* renamed from: e */
    private final boolean f17152e;

    /* renamed from: f */
    private final boolean f17153f;

    /* renamed from: g */
    private final boolean f17154g;

    /* renamed from: h */
    private final int f17155h;

    /* renamed from: i */
    private final int f17156i;

    /* renamed from: j */
    private final boolean f17157j;

    /* renamed from: k */
    private final boolean f17158k;

    /* renamed from: l */
    private final boolean f17159l;

    /* renamed from: m */
    String f17160m;

    /* renamed from: m.d$a */
    public static final class C6116a {

        /* renamed from: a */
        boolean f17161a;

        /* renamed from: b */
        boolean f17162b;

        /* renamed from: c */
        int f17163c = -1;

        /* renamed from: d */
        int f17164d = -1;

        /* renamed from: e */
        int f17165e = -1;

        /* renamed from: f */
        boolean f17166f;

        /* renamed from: g */
        boolean f17167g;

        /* renamed from: h */
        boolean f17168h;

        /* renamed from: a */
        public C6115d mo17304a() {
            return new C6115d(this);
        }

        /* renamed from: b */
        public C6116a mo17305b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f17164d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: c */
        public C6116a mo17306c() {
            this.f17161a = true;
            return this;
        }

        /* renamed from: d */
        public C6116a mo17307d() {
            this.f17162b = true;
            return this;
        }

        /* renamed from: e */
        public C6116a mo17308e() {
            this.f17166f = true;
            return this;
        }
    }

    static {
        C6116a aVar = new C6116a();
        aVar.mo17306c();
        aVar.mo17304a();
        C6116a aVar2 = new C6116a();
        aVar2.mo17308e();
        aVar2.mo17305b(Integer.MAX_VALUE, TimeUnit.SECONDS);
        f17147n = aVar2.mo17304a();
    }

    C6115d(C6116a aVar) {
        this.f17148a = aVar.f17161a;
        this.f17149b = aVar.f17162b;
        this.f17150c = aVar.f17163c;
        this.f17151d = -1;
        this.f17152e = false;
        this.f17153f = false;
        this.f17154g = false;
        this.f17155h = aVar.f17164d;
        this.f17156i = aVar.f17165e;
        this.f17157j = aVar.f17166f;
        this.f17158k = aVar.f17167g;
        this.f17159l = aVar.f17168h;
    }

    private C6115d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f17148a = z;
        this.f17149b = z2;
        this.f17150c = i;
        this.f17151d = i2;
        this.f17152e = z3;
        this.f17153f = z4;
        this.f17154g = z5;
        this.f17155h = i3;
        this.f17156i = i4;
        this.f17157j = z6;
        this.f17158k = z7;
        this.f17159l = z8;
        this.f17160m = str;
    }

    /* renamed from: a */
    private String m24970a() {
        StringBuilder sb = new StringBuilder();
        if (this.f17148a) {
            sb.append("no-cache, ");
        }
        if (this.f17149b) {
            sb.append("no-store, ");
        }
        if (this.f17150c != -1) {
            sb.append("max-age=");
            sb.append(this.f17150c);
            sb.append(", ");
        }
        if (this.f17151d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f17151d);
            sb.append(", ");
        }
        if (this.f17152e) {
            sb.append("private, ");
        }
        if (this.f17153f) {
            sb.append("public, ");
        }
        if (this.f17154g) {
            sb.append("must-revalidate, ");
        }
        if (this.f17155h != -1) {
            sb.append("max-stale=");
            sb.append(this.f17155h);
            sb.append(", ");
        }
        if (this.f17156i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f17156i);
            sb.append(", ");
        }
        if (this.f17157j) {
            sb.append("only-if-cached, ");
        }
        if (this.f17158k) {
            sb.append("no-transform, ");
        }
        if (this.f17159l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p374m.C6115d m24971k(p374m.C6255s r22) {
        /*
            r0 = r22
            int r1 = r22.mo17685h()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x013f
            java.lang.String r2 = r0.mo17682e(r6)
            java.lang.String r4 = r0.mo17687i(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0138
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0138
            java.lang.String r3 = "=,;"
            int r3 = p374m.p375g0.p378g.C6163e.m25198h(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = p374m.p375g0.p378g.C6163e.m25199i(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p374m.p375g0.p378g.C6163e.m25198h(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p374m.p375g0.p378g.C6163e.m25198h(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x0133
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x0133
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c4
            r5 = -1
            int r11 = p374m.p375g0.p378g.C6163e.m25196f(r0, r5)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r12 = p374m.p375g0.p378g.C6163e.m25196f(r0, r5)
            goto L_0x0133
        L_0x00d2:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00dd
            r5 = -1
            r13 = 1
            goto L_0x0133
        L_0x00dd:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e8
            r5 = -1
            r14 = 1
            goto L_0x0133
        L_0x00e8:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f3
            r5 = -1
            r15 = 1
            goto L_0x0133
        L_0x00f3:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = p374m.p375g0.p378g.C6163e.m25196f(r0, r2)
            r5 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0112
            r5 = -1
            int r17 = p374m.p375g0.p378g.C6163e.m25196f(r0, r5)
            goto L_0x0133
        L_0x0112:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011e
            r18 = 1
            goto L_0x0133
        L_0x011e:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0129
            r19 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0133
            r20 = 1
        L_0x0133:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x0138:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x013f:
            if (r7 != 0) goto L_0x0144
            r21 = 0
            goto L_0x0146
        L_0x0144:
            r21 = r8
        L_0x0146:
            m.d r0 = new m.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.C6115d.m24971k(m.s):m.d");
    }

    /* renamed from: b */
    public boolean mo17294b() {
        return this.f17152e;
    }

    /* renamed from: c */
    public boolean mo17295c() {
        return this.f17153f;
    }

    /* renamed from: d */
    public int mo17296d() {
        return this.f17150c;
    }

    /* renamed from: e */
    public int mo17297e() {
        return this.f17155h;
    }

    /* renamed from: f */
    public int mo17298f() {
        return this.f17156i;
    }

    /* renamed from: g */
    public boolean mo17299g() {
        return this.f17154g;
    }

    /* renamed from: h */
    public boolean mo17300h() {
        return this.f17148a;
    }

    /* renamed from: i */
    public boolean mo17301i() {
        return this.f17149b;
    }

    /* renamed from: j */
    public boolean mo17302j() {
        return this.f17157j;
    }

    public String toString() {
        String str = this.f17160m;
        if (str != null) {
            return str;
        }
        String a = m24970a();
        this.f17160m = a;
        return a;
    }
}
