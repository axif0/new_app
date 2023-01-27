package p148g.p189d.p296d.p307t.p308b;

import p148g.p189d.p296d.C5374f;

/* renamed from: g.d.d.t.b.e */
public final class C5436e {

    /* renamed from: h */
    private static final C5436e[] f15748h = m22415a();

    /* renamed from: a */
    private final int f15749a;

    /* renamed from: b */
    private final int f15750b;

    /* renamed from: c */
    private final int f15751c;

    /* renamed from: d */
    private final int f15752d;

    /* renamed from: e */
    private final int f15753e;

    /* renamed from: f */
    private final C5439c f15754f;

    /* renamed from: g */
    private final int f15755g;

    /* renamed from: g.d.d.t.b.e$b */
    static final class C5438b {

        /* renamed from: a */
        private final int f15756a;

        /* renamed from: b */
        private final int f15757b;

        private C5438b(int i, int i2) {
            this.f15756a = i;
            this.f15757b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo15738a() {
            return this.f15756a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo15739b() {
            return this.f15757b;
        }
    }

    /* renamed from: g.d.d.t.b.e$c */
    static final class C5439c {

        /* renamed from: a */
        private final int f15758a;

        /* renamed from: b */
        private final C5438b[] f15759b;

        private C5439c(int i, C5438b bVar) {
            this.f15758a = i;
            this.f15759b = new C5438b[]{bVar};
        }

        private C5439c(int i, C5438b bVar, C5438b bVar2) {
            this.f15758a = i;
            this.f15759b = new C5438b[]{bVar, bVar2};
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5438b[] mo15740a() {
            return this.f15759b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo15741b() {
            return this.f15758a;
        }
    }

    private C5436e(int i, int i2, int i3, int i4, int i5, C5439c cVar) {
        this.f15749a = i;
        this.f15750b = i2;
        this.f15751c = i3;
        this.f15752d = i4;
        this.f15753e = i5;
        this.f15754f = cVar;
        int b = cVar.mo15741b();
        int i6 = 0;
        for (C5438b bVar : cVar.mo15740a()) {
            i6 += bVar.mo15738a() * (bVar.mo15739b() + b);
        }
        this.f15755g = i6;
    }

    /* renamed from: a */
    private static C5436e[] m22415a() {
        return new C5436e[]{new C5436e(1, 10, 10, 8, 8, new C5439c(5, new C5438b(1, 3))), new C5436e(2, 12, 12, 10, 10, new C5439c(7, new C5438b(1, 5))), new C5436e(3, 14, 14, 12, 12, new C5439c(10, new C5438b(1, 8))), new C5436e(4, 16, 16, 14, 14, new C5439c(12, new C5438b(1, 12))), new C5436e(5, 18, 18, 16, 16, new C5439c(14, new C5438b(1, 18))), new C5436e(6, 20, 20, 18, 18, new C5439c(18, new C5438b(1, 22))), new C5436e(7, 22, 22, 20, 20, new C5439c(20, new C5438b(1, 30))), new C5436e(8, 24, 24, 22, 22, new C5439c(24, new C5438b(1, 36))), new C5436e(9, 26, 26, 24, 24, new C5439c(28, new C5438b(1, 44))), new C5436e(10, 32, 32, 14, 14, new C5439c(36, new C5438b(1, 62))), new C5436e(11, 36, 36, 16, 16, new C5439c(42, new C5438b(1, 86))), new C5436e(12, 40, 40, 18, 18, new C5439c(48, new C5438b(1, 114))), new C5436e(13, 44, 44, 20, 20, new C5439c(56, new C5438b(1, 144))), new C5436e(14, 48, 48, 22, 22, new C5439c(68, new C5438b(1, 174))), new C5436e(15, 52, 52, 24, 24, new C5439c(42, new C5438b(2, 102))), new C5436e(16, 64, 64, 14, 14, new C5439c(56, new C5438b(2, 140))), new C5436e(17, 72, 72, 16, 16, new C5439c(36, new C5438b(4, 92))), new C5436e(18, 80, 80, 18, 18, new C5439c(48, new C5438b(4, 114))), new C5436e(19, 88, 88, 20, 20, new C5439c(56, new C5438b(4, 144))), new C5436e(20, 96, 96, 22, 22, new C5439c(68, new C5438b(4, 174))), new C5436e(21, 104, 104, 24, 24, new C5439c(56, new C5438b(6, 136))), new C5436e(22, 120, 120, 18, 18, new C5439c(68, new C5438b(6, 175))), new C5436e(23, 132, 132, 20, 20, new C5439c(62, new C5438b(8, 163))), new C5436e(24, 144, 144, 22, 22, new C5439c(62, new C5438b(8, 156), new C5438b(2, 155))), new C5436e(25, 8, 18, 6, 16, new C5439c(7, new C5438b(1, 5))), new C5436e(26, 8, 32, 6, 14, new C5439c(11, new C5438b(1, 10))), new C5436e(27, 12, 26, 10, 24, new C5439c(14, new C5438b(1, 16))), new C5436e(28, 12, 36, 10, 16, new C5439c(18, new C5438b(1, 22))), new C5436e(29, 16, 36, 14, 16, new C5439c(24, new C5438b(1, 32))), new C5436e(30, 16, 48, 14, 22, new C5439c(28, new C5438b(1, 49)))};
    }

    /* renamed from: h */
    public static C5436e m22416h(int i, int i2) throws C5374f {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C5436e eVar : f15748h) {
                if (eVar.f15750b == i && eVar.f15751c == i2) {
                    return eVar;
                }
            }
            throw C5374f.m22179a();
        }
        throw C5374f.m22179a();
    }

    /* renamed from: b */
    public int mo15730b() {
        return this.f15753e;
    }

    /* renamed from: c */
    public int mo15731c() {
        return this.f15752d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5439c mo15732d() {
        return this.f15754f;
    }

    /* renamed from: e */
    public int mo15733e() {
        return this.f15751c;
    }

    /* renamed from: f */
    public int mo15734f() {
        return this.f15750b;
    }

    /* renamed from: g */
    public int mo15735g() {
        return this.f15755g;
    }

    /* renamed from: i */
    public int mo15736i() {
        return this.f15749a;
    }

    public String toString() {
        return String.valueOf(this.f15749a);
    }
}
