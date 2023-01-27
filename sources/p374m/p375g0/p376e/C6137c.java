package p374m.p375g0.p376e;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6115d;
import p374m.C6255s;
import p374m.p375g0.C6128a;
import p374m.p375g0.p378g.C6161d;
import p374m.p375g0.p378g.C6163e;

/* renamed from: m.g0.e.c */
public final class C6137c {

    /* renamed from: a */
    public final C6099a0 f17221a;

    /* renamed from: b */
    public final C6113c0 f17222b;

    /* renamed from: m.g0.e.c$a */
    public static class C6138a {

        /* renamed from: a */
        final long f17223a;

        /* renamed from: b */
        final C6099a0 f17224b;

        /* renamed from: c */
        final C6113c0 f17225c;

        /* renamed from: d */
        private Date f17226d;

        /* renamed from: e */
        private String f17227e;

        /* renamed from: f */
        private Date f17228f;

        /* renamed from: g */
        private String f17229g;

        /* renamed from: h */
        private Date f17230h;

        /* renamed from: i */
        private long f17231i;

        /* renamed from: j */
        private long f17232j;

        /* renamed from: k */
        private String f17233k;

        /* renamed from: l */
        private int f17234l = -1;

        public C6138a(long j, C6099a0 a0Var, C6113c0 c0Var) {
            this.f17223a = j;
            this.f17224b = a0Var;
            this.f17225c = c0Var;
            if (c0Var != null) {
                this.f17231i = c0Var.mo17265V();
                this.f17232j = c0Var.mo17263Q();
                C6255s t = c0Var.mo17274t();
                int h = t.mo17685h();
                for (int i = 0; i < h; i++) {
                    String e = t.mo17682e(i);
                    String i2 = t.mo17687i(i);
                    if ("Date".equalsIgnoreCase(e)) {
                        this.f17226d = C6161d.m25189b(i2);
                        this.f17227e = i2;
                    } else if ("Expires".equalsIgnoreCase(e)) {
                        this.f17230h = C6161d.m25189b(i2);
                    } else if ("Last-Modified".equalsIgnoreCase(e)) {
                        this.f17228f = C6161d.m25189b(i2);
                        this.f17229g = i2;
                    } else if ("ETag".equalsIgnoreCase(e)) {
                        this.f17233k = i2;
                    } else if ("Age".equalsIgnoreCase(e)) {
                        this.f17234l = C6163e.m25196f(i2, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m25075a() {
            Date date = this.f17226d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f17232j - date.getTime());
            }
            int i = this.f17234l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f17232j;
            return j + (j2 - this.f17231i) + (this.f17223a - j2);
        }

        /* renamed from: b */
        private long m25076b() {
            C6115d h = this.f17225c.mo17268h();
            if (h.mo17296d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) h.mo17296d());
            }
            if (this.f17230h != null) {
                Date date = this.f17226d;
                long time = this.f17230h.getTime() - (date != null ? date.getTime() : this.f17232j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f17228f == null || this.f17225c.mo17264S().mo17221j().mo17716z() != null) {
                return 0;
            } else {
                Date date2 = this.f17226d;
                long time2 = (date2 != null ? date2.getTime() : this.f17231i) - this.f17228f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        /* renamed from: d */
        private C6137c m25077d() {
            if (this.f17225c == null) {
                return new C6137c(this.f17224b, (C6113c0) null);
            }
            if (this.f17224b.mo17217f() && this.f17225c.mo17271o() == null) {
                return new C6137c(this.f17224b, (C6113c0) null);
            }
            if (!C6137c.m25074a(this.f17225c, this.f17224b)) {
                return new C6137c(this.f17224b, (C6113c0) null);
            }
            C6115d b = this.f17224b.mo17213b();
            if (b.mo17300h() || m25078e(this.f17224b)) {
                return new C6137c(this.f17224b, (C6113c0) null);
            }
            C6115d h = this.f17225c.mo17268h();
            long a = m25075a();
            long b2 = m25076b();
            if (b.mo17296d() != -1) {
                b2 = Math.min(b2, TimeUnit.SECONDS.toMillis((long) b.mo17296d()));
            }
            long j = 0;
            long millis = b.mo17298f() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo17298f()) : 0;
            if (!h.mo17299g() && b.mo17297e() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo17297e());
            }
            if (!h.mo17300h()) {
                long j2 = millis + a;
                if (j2 < j + b2) {
                    C6113c0.C6114a D = this.f17225c.mo17260D();
                    if (j2 >= b2) {
                        D.mo17279a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m25079f()) {
                        D.mo17279a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C6137c((C6099a0) null, D.mo17281c());
                }
            }
            String str = this.f17233k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f17228f != null) {
                str = this.f17229g;
            } else if (this.f17226d == null) {
                return new C6137c(this.f17224b, (C6113c0) null);
            } else {
                str = this.f17227e;
            }
            C6255s.C6256a f = this.f17224b.mo17216e().mo17684f();
            C6128a.f17195a.mo17340b(f, str2, str);
            C6099a0.C6100a h2 = this.f17224b.mo17219h();
            h2.mo17226d(f.mo17693d());
            return new C6137c(h2.mo17223a(), this.f17225c);
        }

        /* renamed from: e */
        private static boolean m25078e(C6099a0 a0Var) {
            return (a0Var.mo17214c("If-Modified-Since") == null && a0Var.mo17214c("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m25079f() {
            return this.f17225c.mo17268h().mo17296d() == -1 && this.f17230h == null;
        }

        /* renamed from: c */
        public C6137c mo17357c() {
            C6137c d = m25077d();
            return (d.f17221a == null || !this.f17224b.mo17213b().mo17302j()) ? d : new C6137c((C6099a0) null, (C6113c0) null);
        }
    }

    C6137c(C6099a0 a0Var, C6113c0 c0Var) {
        this.f17221a = a0Var;
        this.f17222b = c0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo17268h().mo17294b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m25074a(p374m.C6113c0 r3, p374m.C6099a0 r4) {
        /*
            int r0 = r3.mo17270m()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo17272q(r0)
            if (r0 != 0) goto L_0x005a
            m.d r0 = r3.mo17268h()
            int r0 = r0.mo17296d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            m.d r0 = r3.mo17268h()
            boolean r0 = r0.mo17295c()
            if (r0 != 0) goto L_0x005a
            m.d r0 = r3.mo17268h()
            boolean r0 = r0.mo17294b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            m.d r3 = r3.mo17268h()
            boolean r3 = r3.mo17301i()
            if (r3 != 0) goto L_0x006f
            m.d r3 = r4.mo17213b()
            boolean r3 = r3.mo17301i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p376e.C6137c.m25074a(m.c0, m.a0):boolean");
    }
}
