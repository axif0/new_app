package p148g.p189d.p190a.p191a.p192i;

import com.karumi.dexter.BuildConfig;
import java.util.Map;
import p148g.p189d.p190a.p191a.p192i.C3749h;

/* renamed from: g.d.a.a.i.a */
final class C3734a extends C3749h {

    /* renamed from: a */
    private final String f11370a;

    /* renamed from: b */
    private final Integer f11371b;

    /* renamed from: c */
    private final C3748g f11372c;

    /* renamed from: d */
    private final long f11373d;

    /* renamed from: e */
    private final long f11374e;

    /* renamed from: f */
    private final Map<String, String> f11375f;

    /* renamed from: g.d.a.a.i.a$b */
    static final class C3736b extends C3749h.C3750a {

        /* renamed from: a */
        private String f11376a;

        /* renamed from: b */
        private Integer f11377b;

        /* renamed from: c */
        private C3748g f11378c;

        /* renamed from: d */
        private Long f11379d;

        /* renamed from: e */
        private Long f11380e;

        /* renamed from: f */
        private Map<String, String> f11381f;

        C3736b() {
        }

        /* renamed from: d */
        public C3749h mo12297d() {
            String str = this.f11376a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = str2 + " transportName";
            }
            if (this.f11378c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f11379d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f11380e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f11381f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new C3734a(this.f11376a, this.f11377b, this.f11378c, this.f11379d.longValue(), this.f11380e.longValue(), this.f11381f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map<String, String> mo12298e() {
            Map<String, String> map = this.f11381f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C3749h.C3750a mo12299f(Map<String, String> map) {
            if (map != null) {
                this.f11381f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* renamed from: g */
        public C3749h.C3750a mo12300g(Integer num) {
            this.f11377b = num;
            return this;
        }

        /* renamed from: h */
        public C3749h.C3750a mo12301h(C3748g gVar) {
            if (gVar != null) {
                this.f11378c = gVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: i */
        public C3749h.C3750a mo12302i(long j) {
            this.f11379d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C3749h.C3750a mo12303j(String str) {
            if (str != null) {
                this.f11376a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: k */
        public C3749h.C3750a mo12304k(long j) {
            this.f11380e = Long.valueOf(j);
            return this;
        }
    }

    private C3734a(String str, Integer num, C3748g gVar, long j, long j2, Map<String, String> map) {
        this.f11370a = str;
        this.f11371b = num;
        this.f11372c = gVar;
        this.f11373d = j;
        this.f11374e = j2;
        this.f11375f = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo12288c() {
        return this.f11375f;
    }

    /* renamed from: d */
    public Integer mo12289d() {
        return this.f11371b;
    }

    /* renamed from: e */
    public C3748g mo12290e() {
        return this.f11372c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f11371b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p148g.p189d.p190a.p191a.p192i.C3749h
            r2 = 0
            if (r1 == 0) goto L_0x005b
            g.d.a.a.i.h r8 = (p148g.p189d.p190a.p191a.p192i.C3749h) r8
            java.lang.String r1 = r7.f11370a
            java.lang.String r3 = r8.mo12294j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f11371b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.mo12289d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.mo12289d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            g.d.a.a.i.g r1 = r7.f11372c
            g.d.a.a.i.g r3 = r8.mo12290e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f11373d
            long r5 = r8.mo12292f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f11374e
            long r5 = r8.mo12295k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f11375f
            java.util.Map r8 = r8.mo12288c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p191a.p192i.C3734a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public long mo12292f() {
        return this.f11373d;
    }

    public int hashCode() {
        int hashCode = (this.f11370a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11371b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f11373d;
        long j2 = this.f11374e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f11372c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f11375f.hashCode();
    }

    /* renamed from: j */
    public String mo12294j() {
        return this.f11370a;
    }

    /* renamed from: k */
    public long mo12295k() {
        return this.f11374e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f11370a + ", code=" + this.f11371b + ", encodedPayload=" + this.f11372c + ", eventMillis=" + this.f11373d + ", uptimeMillis=" + this.f11374e + ", autoMetadata=" + this.f11375f + "}";
    }
}
