package p148g.p189d.p296d.p322y.p323b;

import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.y.b.j */
public final class C5533j {

    /* renamed from: e */
    private static final int[] f15997e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C5533j[] f15998f = m22860b();

    /* renamed from: a */
    private final int f15999a;

    /* renamed from: b */
    private final int[] f16000b;

    /* renamed from: c */
    private final C5535b[] f16001c;

    /* renamed from: d */
    private final int f16002d;

    /* renamed from: g.d.d.y.b.j$a */
    public static final class C5534a {

        /* renamed from: a */
        private final int f16003a;

        /* renamed from: b */
        private final int f16004b;

        C5534a(int i, int i2) {
            this.f16003a = i;
            this.f16004b = i2;
        }

        /* renamed from: a */
        public int mo15935a() {
            return this.f16003a;
        }

        /* renamed from: b */
        public int mo15936b() {
            return this.f16004b;
        }
    }

    /* renamed from: g.d.d.y.b.j$b */
    public static final class C5535b {

        /* renamed from: a */
        private final int f16005a;

        /* renamed from: b */
        private final C5534a[] f16006b;

        C5535b(int i, C5534a... aVarArr) {
            this.f16005a = i;
            this.f16006b = aVarArr;
        }

        /* renamed from: a */
        public C5534a[] mo15937a() {
            return this.f16006b;
        }

        /* renamed from: b */
        public int mo15938b() {
            return this.f16005a;
        }
    }

    private C5533j(int i, int[] iArr, C5535b... bVarArr) {
        this.f15999a = i;
        this.f16000b = iArr;
        this.f16001c = bVarArr;
        int b = bVarArr[0].mo15938b();
        int i2 = 0;
        for (C5534a aVar : bVarArr[0].mo15937a()) {
            i2 += aVar.mo15935a() * (aVar.mo15936b() + b);
        }
        this.f16002d = i2;
    }

    /* renamed from: b */
    private static C5533j[] m22860b() {
        return new C5533j[]{new C5533j(1, new int[0], new C5535b(7, new C5534a(1, 19)), new C5535b(10, new C5534a(1, 16)), new C5535b(13, new C5534a(1, 13)), new C5535b(17, new C5534a(1, 9))), new C5533j(2, new int[]{6, 18}, new C5535b(10, new C5534a(1, 34)), new C5535b(16, new C5534a(1, 28)), new C5535b(22, new C5534a(1, 22)), new C5535b(28, new C5534a(1, 16))), new C5533j(3, new int[]{6, 22}, new C5535b(15, new C5534a(1, 55)), new C5535b(26, new C5534a(1, 44)), new C5535b(18, new C5534a(2, 17)), new C5535b(22, new C5534a(2, 13))), new C5533j(4, new int[]{6, 26}, new C5535b(20, new C5534a(1, 80)), new C5535b(18, new C5534a(2, 32)), new C5535b(26, new C5534a(2, 24)), new C5535b(16, new C5534a(4, 9))), new C5533j(5, new int[]{6, 30}, new C5535b(26, new C5534a(1, 108)), new C5535b(24, new C5534a(2, 43)), new C5535b(18, new C5534a(2, 15), new C5534a(2, 16)), new C5535b(22, new C5534a(2, 11), new C5534a(2, 12))), new C5533j(6, new int[]{6, 34}, new C5535b(18, new C5534a(2, 68)), new C5535b(16, new C5534a(4, 27)), new C5535b(24, new C5534a(4, 19)), new C5535b(28, new C5534a(4, 15))), new C5533j(7, new int[]{6, 22, 38}, new C5535b(20, new C5534a(2, 78)), new C5535b(18, new C5534a(4, 31)), new C5535b(18, new C5534a(2, 14), new C5534a(4, 15)), new C5535b(26, new C5534a(4, 13), new C5534a(1, 14))), new C5533j(8, new int[]{6, 24, 42}, new C5535b(24, new C5534a(2, 97)), new C5535b(22, new C5534a(2, 38), new C5534a(2, 39)), new C5535b(22, new C5534a(4, 18), new C5534a(2, 19)), new C5535b(26, new C5534a(4, 14), new C5534a(2, 15))), new C5533j(9, new int[]{6, 26, 46}, new C5535b(30, new C5534a(2, 116)), new C5535b(22, new C5534a(3, 36), new C5534a(2, 37)), new C5535b(20, new C5534a(4, 16), new C5534a(4, 17)), new C5535b(24, new C5534a(4, 12), new C5534a(4, 13))), new C5533j(10, new int[]{6, 28, 50}, new C5535b(18, new C5534a(2, 68), new C5534a(2, 69)), new C5535b(26, new C5534a(4, 43), new C5534a(1, 44)), new C5535b(24, new C5534a(6, 19), new C5534a(2, 20)), new C5535b(28, new C5534a(6, 15), new C5534a(2, 16))), new C5533j(11, new int[]{6, 30, 54}, new C5535b(20, new C5534a(4, 81)), new C5535b(30, new C5534a(1, 50), new C5534a(4, 51)), new C5535b(28, new C5534a(4, 22), new C5534a(4, 23)), new C5535b(24, new C5534a(3, 12), new C5534a(8, 13))), new C5533j(12, new int[]{6, 32, 58}, new C5535b(24, new C5534a(2, 92), new C5534a(2, 93)), new C5535b(22, new C5534a(6, 36), new C5534a(2, 37)), new C5535b(26, new C5534a(4, 20), new C5534a(6, 21)), new C5535b(28, new C5534a(7, 14), new C5534a(4, 15))), new C5533j(13, new int[]{6, 34, 62}, new C5535b(26, new C5534a(4, 107)), new C5535b(22, new C5534a(8, 37), new C5534a(1, 38)), new C5535b(24, new C5534a(8, 20), new C5534a(4, 21)), new C5535b(22, new C5534a(12, 11), new C5534a(4, 12))), new C5533j(14, new int[]{6, 26, 46, 66}, new C5535b(30, new C5534a(3, 115), new C5534a(1, 116)), new C5535b(24, new C5534a(4, 40), new C5534a(5, 41)), new C5535b(20, new C5534a(11, 16), new C5534a(5, 17)), new C5535b(24, new C5534a(11, 12), new C5534a(5, 13))), new C5533j(15, new int[]{6, 26, 48, 70}, new C5535b(22, new C5534a(5, 87), new C5534a(1, 88)), new C5535b(24, new C5534a(5, 41), new C5534a(5, 42)), new C5535b(30, new C5534a(5, 24), new C5534a(7, 25)), new C5535b(24, new C5534a(11, 12), new C5534a(7, 13))), new C5533j(16, new int[]{6, 26, 50, 74}, new C5535b(24, new C5534a(5, 98), new C5534a(1, 99)), new C5535b(28, new C5534a(7, 45), new C5534a(3, 46)), new C5535b(24, new C5534a(15, 19), new C5534a(2, 20)), new C5535b(30, new C5534a(3, 15), new C5534a(13, 16))), new C5533j(17, new int[]{6, 30, 54, 78}, new C5535b(28, new C5534a(1, 107), new C5534a(5, 108)), new C5535b(28, new C5534a(10, 46), new C5534a(1, 47)), new C5535b(28, new C5534a(1, 22), new C5534a(15, 23)), new C5535b(28, new C5534a(2, 14), new C5534a(17, 15))), new C5533j(18, new int[]{6, 30, 56, 82}, new C5535b(30, new C5534a(5, 120), new C5534a(1, 121)), new C5535b(26, new C5534a(9, 43), new C5534a(4, 44)), new C5535b(28, new C5534a(17, 22), new C5534a(1, 23)), new C5535b(28, new C5534a(2, 14), new C5534a(19, 15))), new C5533j(19, new int[]{6, 30, 58, 86}, new C5535b(28, new C5534a(3, 113), new C5534a(4, 114)), new C5535b(26, new C5534a(3, 44), new C5534a(11, 45)), new C5535b(26, new C5534a(17, 21), new C5534a(4, 22)), new C5535b(26, new C5534a(9, 13), new C5534a(16, 14))), new C5533j(20, new int[]{6, 34, 62, 90}, new C5535b(28, new C5534a(3, 107), new C5534a(5, 108)), new C5535b(26, new C5534a(3, 41), new C5534a(13, 42)), new C5535b(30, new C5534a(15, 24), new C5534a(5, 25)), new C5535b(28, new C5534a(15, 15), new C5534a(10, 16))), new C5533j(21, new int[]{6, 28, 50, 72, 94}, new C5535b(28, new C5534a(4, 116), new C5534a(4, 117)), new C5535b(26, new C5534a(17, 42)), new C5535b(28, new C5534a(17, 22), new C5534a(6, 23)), new C5535b(30, new C5534a(19, 16), new C5534a(6, 17))), new C5533j(22, new int[]{6, 26, 50, 74, 98}, new C5535b(28, new C5534a(2, 111), new C5534a(7, 112)), new C5535b(28, new C5534a(17, 46)), new C5535b(30, new C5534a(7, 24), new C5534a(16, 25)), new C5535b(24, new C5534a(34, 13))), new C5533j(23, new int[]{6, 30, 54, 78, 102}, new C5535b(30, new C5534a(4, 121), new C5534a(5, 122)), new C5535b(28, new C5534a(4, 47), new C5534a(14, 48)), new C5535b(30, new C5534a(11, 24), new C5534a(14, 25)), new C5535b(30, new C5534a(16, 15), new C5534a(14, 16))), new C5533j(24, new int[]{6, 28, 54, 80, 106}, new C5535b(30, new C5534a(6, 117), new C5534a(4, 118)), new C5535b(28, new C5534a(6, 45), new C5534a(14, 46)), new C5535b(30, new C5534a(11, 24), new C5534a(16, 25)), new C5535b(30, new C5534a(30, 16), new C5534a(2, 17))), new C5533j(25, new int[]{6, 32, 58, 84, 110}, new C5535b(26, new C5534a(8, 106), new C5534a(4, 107)), new C5535b(28, new C5534a(8, 47), new C5534a(13, 48)), new C5535b(30, new C5534a(7, 24), new C5534a(22, 25)), new C5535b(30, new C5534a(22, 15), new C5534a(13, 16))), new C5533j(26, new int[]{6, 30, 58, 86, 114}, new C5535b(28, new C5534a(10, 114), new C5534a(2, 115)), new C5535b(28, new C5534a(19, 46), new C5534a(4, 47)), new C5535b(28, new C5534a(28, 22), new C5534a(6, 23)), new C5535b(30, new C5534a(33, 16), new C5534a(4, 17))), new C5533j(27, new int[]{6, 34, 62, 90, 118}, new C5535b(30, new C5534a(8, 122), new C5534a(4, 123)), new C5535b(28, new C5534a(22, 45), new C5534a(3, 46)), new C5535b(30, new C5534a(8, 23), new C5534a(26, 24)), new C5535b(30, new C5534a(12, 15), new C5534a(28, 16))), new C5533j(28, new int[]{6, 26, 50, 74, 98, 122}, new C5535b(30, new C5534a(3, 117), new C5534a(10, 118)), new C5535b(28, new C5534a(3, 45), new C5534a(23, 46)), new C5535b(30, new C5534a(4, 24), new C5534a(31, 25)), new C5535b(30, new C5534a(11, 15), new C5534a(31, 16))), new C5533j(29, new int[]{6, 30, 54, 78, 102, 126}, new C5535b(30, new C5534a(7, 116), new C5534a(7, 117)), new C5535b(28, new C5534a(21, 45), new C5534a(7, 46)), new C5535b(30, new C5534a(1, 23), new C5534a(37, 24)), new C5535b(30, new C5534a(19, 15), new C5534a(26, 16))), new C5533j(30, new int[]{6, 26, 52, 78, 104, 130}, new C5535b(30, new C5534a(5, 115), new C5534a(10, 116)), new C5535b(28, new C5534a(19, 47), new C5534a(10, 48)), new C5535b(30, new C5534a(15, 24), new C5534a(25, 25)), new C5535b(30, new C5534a(23, 15), new C5534a(25, 16))), new C5533j(31, new int[]{6, 30, 56, 82, 108, 134}, new C5535b(30, new C5534a(13, 115), new C5534a(3, 116)), new C5535b(28, new C5534a(2, 46), new C5534a(29, 47)), new C5535b(30, new C5534a(42, 24), new C5534a(1, 25)), new C5535b(30, new C5534a(23, 15), new C5534a(28, 16))), new C5533j(32, new int[]{6, 34, 60, 86, 112, 138}, new C5535b(30, new C5534a(17, 115)), new C5535b(28, new C5534a(10, 46), new C5534a(23, 47)), new C5535b(30, new C5534a(10, 24), new C5534a(35, 25)), new C5535b(30, new C5534a(19, 15), new C5534a(35, 16))), new C5533j(33, new int[]{6, 30, 58, 86, 114, 142}, new C5535b(30, new C5534a(17, 115), new C5534a(1, 116)), new C5535b(28, new C5534a(14, 46), new C5534a(21, 47)), new C5535b(30, new C5534a(29, 24), new C5534a(19, 25)), new C5535b(30, new C5534a(11, 15), new C5534a(46, 16))), new C5533j(34, new int[]{6, 34, 62, 90, 118, 146}, new C5535b(30, new C5534a(13, 115), new C5534a(6, 116)), new C5535b(28, new C5534a(14, 46), new C5534a(23, 47)), new C5535b(30, new C5534a(44, 24), new C5534a(7, 25)), new C5535b(30, new C5534a(59, 16), new C5534a(1, 17))), new C5533j(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C5535b(30, new C5534a(12, 121), new C5534a(7, 122)), new C5535b(28, new C5534a(12, 47), new C5534a(26, 48)), new C5535b(30, new C5534a(39, 24), new C5534a(14, 25)), new C5535b(30, new C5534a(22, 15), new C5534a(41, 16))), new C5533j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C5535b(30, new C5534a(6, 121), new C5534a(14, 122)), new C5535b(28, new C5534a(6, 47), new C5534a(34, 48)), new C5535b(30, new C5534a(46, 24), new C5534a(10, 25)), new C5535b(30, new C5534a(2, 15), new C5534a(64, 16))), new C5533j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C5535b(30, new C5534a(17, 122), new C5534a(4, 123)), new C5535b(28, new C5534a(29, 46), new C5534a(14, 47)), new C5535b(30, new C5534a(49, 24), new C5534a(10, 25)), new C5535b(30, new C5534a(24, 15), new C5534a(46, 16))), new C5533j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C5535b(30, new C5534a(4, 122), new C5534a(18, 123)), new C5535b(28, new C5534a(13, 46), new C5534a(32, 47)), new C5535b(30, new C5534a(48, 24), new C5534a(14, 25)), new C5535b(30, new C5534a(42, 15), new C5534a(32, 16))), new C5533j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C5535b(30, new C5534a(20, 117), new C5534a(4, 118)), new C5535b(28, new C5534a(40, 47), new C5534a(7, 48)), new C5535b(30, new C5534a(43, 24), new C5534a(22, 25)), new C5535b(30, new C5534a(10, 15), new C5534a(67, 16))), new C5533j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C5535b(30, new C5534a(19, 118), new C5534a(6, 119)), new C5535b(28, new C5534a(18, 47), new C5534a(31, 48)), new C5535b(30, new C5534a(34, 24), new C5534a(34, 25)), new C5535b(30, new C5534a(20, 15), new C5534a(61, 16)))};
    }

    /* renamed from: c */
    static C5533j m22861c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            int[] iArr = f15997e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m22863i(i2 + 7);
                }
                int e = C5530g.m22854e(i, i5);
                if (e < i4) {
                    i3 = i2 + 7;
                    i4 = e;
                }
                i2++;
            } else if (i4 <= 3) {
                return m22863i(i3);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C5533j m22862g(int i) throws C5374f {
        if (i % 4 == 1) {
            try {
                return m22863i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C5374f.m22179a();
            }
        } else {
            throw C5374f.m22179a();
        }
    }

    /* renamed from: i */
    public static C5533j m22863i(int i) {
        if (i > 0 && i <= 40) {
            return f15998f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5412b mo15928a() {
        int e = mo15930e();
        C5412b bVar = new C5412b(e);
        bVar.mo15676r(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo15676r(i, 0, 8, 9);
        bVar.mo15676r(0, i, 9, 8);
        int length = this.f16000b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f16000b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo15676r(this.f16000b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo15676r(6, 9, 1, i5);
        bVar.mo15676r(9, 6, i5, 1);
        if (this.f15999a > 6) {
            int i6 = e - 11;
            bVar.mo15676r(i6, 0, 3, 6);
            bVar.mo15676r(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo15929d() {
        return this.f16000b;
    }

    /* renamed from: e */
    public int mo15930e() {
        return (this.f15999a * 4) + 17;
    }

    /* renamed from: f */
    public C5535b mo15931f(C5529f fVar) {
        return this.f16001c[fVar.ordinal()];
    }

    /* renamed from: h */
    public int mo15932h() {
        return this.f16002d;
    }

    /* renamed from: j */
    public int mo15933j() {
        return this.f15999a;
    }

    public String toString() {
        return String.valueOf(this.f15999a);
    }
}
