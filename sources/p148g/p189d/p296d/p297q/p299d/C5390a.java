package p148g.p189d.p296d.p297q.p299d;

import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p297q.C5385a;
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5419i;
import p148g.p189d.p296d.p304s.p305m.C5423a;
import p148g.p189d.p296d.p304s.p305m.C5424b;
import p148g.p189d.p296d.p304s.p306n.C5425a;
import p148g.p189d.p296d.p304s.p306n.C5427c;
import p148g.p189d.p296d.p304s.p306n.C5428d;

/* renamed from: g.d.d.q.d.a */
public final class C5390a {

    /* renamed from: g */
    private static final int[] f15594g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C5412b f15595a;

    /* renamed from: b */
    private boolean f15596b;

    /* renamed from: c */
    private int f15597c;

    /* renamed from: d */
    private int f15598d;

    /* renamed from: e */
    private int f15599e;

    /* renamed from: f */
    private int f15600f;

    /* renamed from: g.d.d.q.d.a$a */
    static final class C5391a {

        /* renamed from: a */
        private final int f15601a;

        /* renamed from: b */
        private final int f15602b;

        C5391a(int i, int i2) {
            this.f15601a = i;
            this.f15602b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo15628a() {
            return this.f15601a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo15629b() {
            return this.f15602b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5383o mo15630c() {
            return new C5383o((float) mo15628a(), (float) mo15629b());
        }

        public String toString() {
            return "<" + this.f15601a + ' ' + this.f15602b + '>';
        }
    }

    public C5390a(C5412b bVar) {
        this.f15595a = bVar;
    }

    /* renamed from: b */
    private static float m22230b(C5383o oVar, C5383o oVar2) {
        return C5423a.m22356a(oVar.mo15618c(), oVar.mo15619d(), oVar2.mo15618c(), oVar2.mo15619d());
    }

    /* renamed from: c */
    private static float m22231c(C5391a aVar, C5391a aVar2) {
        return C5423a.m22357b(aVar.mo15628a(), aVar.mo15629b(), aVar2.mo15628a(), aVar2.mo15629b());
    }

    /* renamed from: d */
    private static C5383o[] m22232d(C5383o[] oVarArr, int i, int i2) {
        float f = ((float) i2) / (((float) i) * 2.0f);
        float c = oVarArr[0].mo15618c() - oVarArr[2].mo15618c();
        float d = oVarArr[0].mo15619d() - oVarArr[2].mo15619d();
        float c2 = (oVarArr[0].mo15618c() + oVarArr[2].mo15618c()) / 2.0f;
        float d2 = (oVarArr[0].mo15619d() + oVarArr[2].mo15619d()) / 2.0f;
        float f2 = c * f;
        float f3 = d * f;
        C5383o oVar = new C5383o(c2 + f2, d2 + f3);
        C5383o oVar2 = new C5383o(c2 - f2, d2 - f3);
        float c3 = oVarArr[1].mo15618c() - oVarArr[3].mo15618c();
        float d3 = oVarArr[1].mo15619d() - oVarArr[3].mo15619d();
        float c4 = (oVarArr[1].mo15618c() + oVarArr[3].mo15618c()) / 2.0f;
        float d4 = (oVarArr[1].mo15619d() + oVarArr[3].mo15619d()) / 2.0f;
        float f4 = c3 * f;
        float f5 = f * d3;
        return new C5383o[]{oVar, new C5383o(c4 + f4, d4 + f5), oVar2, new C5383o(c4 - f4, d4 - f5)};
    }

    /* renamed from: e */
    private void m22233e(C5383o[] oVarArr) throws C5377i {
        int i;
        long j;
        long j2;
        if (!m22243o(oVarArr[0]) || !m22243o(oVarArr[1]) || !m22243o(oVarArr[2]) || !m22243o(oVarArr[3])) {
            throw C5377i.m22193a();
        }
        int i2 = this.f15599e * 2;
        int[] iArr = {m22246r(oVarArr[0], oVarArr[1], i2), m22246r(oVarArr[1], oVarArr[2], i2), m22246r(oVarArr[2], oVarArr[3], i2), m22246r(oVarArr[3], oVarArr[0], i2)};
        this.f15600f = m22241m(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f15600f + i3) % 4];
            if (this.f15596b) {
                j2 = j3 << 7;
                j = (long) ((i4 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i4 >> 2) & 992) + ((i4 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = m22236h(j3, this.f15596b);
        if (this.f15596b) {
            this.f15597c = (h >> 6) + 1;
            i = h & 63;
        } else {
            this.f15597c = (h >> 11) + 1;
            i = h & 2047;
        }
        this.f15598d = i + 1;
    }

    /* renamed from: f */
    private C5383o[] m22234f(C5391a aVar) throws C5377i {
        this.f15599e = 1;
        C5391a aVar2 = aVar;
        C5391a aVar3 = aVar2;
        C5391a aVar4 = aVar3;
        C5391a aVar5 = aVar4;
        boolean z = true;
        while (this.f15599e < 9) {
            C5391a j = m22238j(aVar2, z, 1, -1);
            C5391a j2 = m22238j(aVar3, z, 1, 1);
            C5391a j3 = m22238j(aVar4, z, -1, 1);
            C5391a j4 = m22238j(aVar5, z, -1, -1);
            if (this.f15599e > 2) {
                double c = (double) ((m22231c(j4, j) * ((float) this.f15599e)) / (m22231c(aVar5, aVar2) * ((float) (this.f15599e + 2))));
                if (c < 0.75d || c > 1.25d || !m22244p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.f15599e++;
            aVar5 = j4;
            aVar2 = j;
            aVar3 = j2;
            aVar4 = j3;
        }
        int i = this.f15599e;
        if (i == 5 || i == 7) {
            this.f15596b = this.f15599e == 5;
            C5383o[] oVarArr = {new C5383o(((float) aVar2.mo15628a()) + 0.5f, ((float) aVar2.mo15629b()) - 0.5f), new C5383o(((float) aVar3.mo15628a()) + 0.5f, ((float) aVar3.mo15629b()) + 0.5f), new C5383o(((float) aVar4.mo15628a()) - 0.5f, ((float) aVar4.mo15629b()) + 0.5f), new C5383o(((float) aVar5.mo15628a()) - 0.5f, ((float) aVar5.mo15629b()) - 0.5f)};
            int i2 = this.f15599e;
            return m22232d(oVarArr, (i2 * 2) - 3, i2 * 2);
        }
        throw C5377i.m22193a();
    }

    /* renamed from: g */
    private int m22235g(C5391a aVar, C5391a aVar2) {
        float c = m22231c(aVar, aVar2);
        float a = ((float) (aVar2.mo15628a() - aVar.mo15628a())) / c;
        float b = ((float) (aVar2.mo15629b() - aVar.mo15629b())) / c;
        float a2 = (float) aVar.mo15628a();
        float b2 = (float) aVar.mo15629b();
        boolean e = this.f15595a.mo15665e(aVar.mo15628a(), aVar.mo15629b());
        int ceil = (int) Math.ceil((double) c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f15595a.mo15665e(C5423a.m22358c(a2), C5423a.m22358c(b2)) != e) {
                i++;
            }
        }
        float f = ((float) i) / c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        return z == e ? 1 : -1;
    }

    /* renamed from: h */
    private static int m22236h(long j, boolean z) throws C5377i {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C5427c(C5425a.f15711k).mo15724a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C5428d unused) {
            throw C5377i.m22193a();
        }
    }

    /* renamed from: i */
    private int m22237i() {
        if (this.f15596b) {
            return (this.f15597c * 4) + 11;
        }
        int i = this.f15597c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C5391a m22238j(C5391a aVar, boolean z, int i, int i2) {
        int a = aVar.mo15628a() + i;
        int b = aVar.mo15629b();
        while (true) {
            b += i2;
            if (!m22242n(a, b) || this.f15595a.mo15665e(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m22242n(i32, i42) && this.f15595a.mo15665e(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m22242n(i5, i42) && this.f15595a.mo15665e(i5, i42) == z) {
            i42 += i2;
        }
        return new C5391a(i5, i42 - i2);
    }

    /* renamed from: k */
    private C5391a m22239k() {
        C5383o oVar;
        C5383o oVar2;
        C5383o oVar3;
        C5383o oVar4;
        C5383o oVar5;
        C5383o oVar6;
        C5383o oVar7;
        C5383o oVar8;
        try {
            C5383o[] c = new C5424b(this.f15595a).mo15704c();
            oVar3 = c[0];
            oVar2 = c[1];
            oVar = c[2];
            oVar4 = c[3];
        } catch (C5377i unused) {
            int n = this.f15595a.mo15673n() / 2;
            int i = this.f15595a.mo15670i() / 2;
            int i2 = n + 7;
            int i3 = i - 7;
            C5383o c2 = m22238j(new C5391a(i2, i3), false, 1, -1).mo15630c();
            int i4 = i + 7;
            C5383o c3 = m22238j(new C5391a(i2, i4), false, 1, 1).mo15630c();
            int i5 = n - 7;
            C5383o c4 = m22238j(new C5391a(i5, i4), false, -1, 1).mo15630c();
            oVar4 = m22238j(new C5391a(i5, i3), false, -1, -1).mo15630c();
            C5383o oVar9 = c3;
            oVar = c4;
            oVar3 = c2;
            oVar2 = oVar9;
        }
        int c5 = C5423a.m22358c((((oVar3.mo15618c() + oVar4.mo15618c()) + oVar2.mo15618c()) + oVar.mo15618c()) / 4.0f);
        int c6 = C5423a.m22358c((((oVar3.mo15619d() + oVar4.mo15619d()) + oVar2.mo15619d()) + oVar.mo15619d()) / 4.0f);
        try {
            C5383o[] c7 = new C5424b(this.f15595a, 15, c5, c6).mo15704c();
            oVar6 = c7[0];
            oVar5 = c7[1];
            oVar7 = c7[2];
            oVar8 = c7[3];
        } catch (C5377i unused2) {
            int i6 = c5 + 7;
            int i7 = c6 - 7;
            oVar6 = m22238j(new C5391a(i6, i7), false, 1, -1).mo15630c();
            int i8 = c6 + 7;
            oVar5 = m22238j(new C5391a(i6, i8), false, 1, 1).mo15630c();
            int i9 = c5 - 7;
            oVar7 = m22238j(new C5391a(i9, i8), false, -1, 1).mo15630c();
            oVar8 = m22238j(new C5391a(i9, i7), false, -1, -1).mo15630c();
        }
        return new C5391a(C5423a.m22358c((((oVar6.mo15618c() + oVar8.mo15618c()) + oVar5.mo15618c()) + oVar7.mo15618c()) / 4.0f), C5423a.m22358c((((oVar6.mo15619d() + oVar8.mo15619d()) + oVar5.mo15619d()) + oVar7.mo15619d()) / 4.0f));
    }

    /* renamed from: l */
    private C5383o[] m22240l(C5383o[] oVarArr) {
        return m22232d(oVarArr, this.f15599e * 2, m22237i());
    }

    /* renamed from: m */
    private static int m22241m(int[] iArr, int i) throws C5377i {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f15594g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C5377i.m22193a();
    }

    /* renamed from: n */
    private boolean m22242n(int i, int i2) {
        return i >= 0 && i < this.f15595a.mo15673n() && i2 > 0 && i2 < this.f15595a.mo15670i();
    }

    /* renamed from: o */
    private boolean m22243o(C5383o oVar) {
        return m22242n(C5423a.m22358c(oVar.mo15618c()), C5423a.m22358c(oVar.mo15619d()));
    }

    /* renamed from: p */
    private boolean m22244p(C5391a aVar, C5391a aVar2, C5391a aVar3, C5391a aVar4) {
        C5391a aVar5 = new C5391a(aVar.mo15628a() - 3, aVar.mo15629b() + 3);
        C5391a aVar6 = new C5391a(aVar2.mo15628a() - 3, aVar2.mo15629b() - 3);
        C5391a aVar7 = new C5391a(aVar3.mo15628a() + 3, aVar3.mo15629b() - 3);
        C5391a aVar8 = new C5391a(aVar4.mo15628a() + 3, aVar4.mo15629b() + 3);
        int g = m22235g(aVar8, aVar5);
        return g != 0 && m22235g(aVar5, aVar6) == g && m22235g(aVar6, aVar7) == g && m22235g(aVar7, aVar8) == g;
    }

    /* renamed from: q */
    private C5412b m22245q(C5412b bVar, C5383o oVar, C5383o oVar2, C5383o oVar3, C5383o oVar4) throws C5377i {
        C5419i b = C5419i.m22341b();
        int i = m22237i();
        int i2 = i;
        int i3 = i;
        float f = ((float) i) / 2.0f;
        int i4 = this.f15599e;
        float f2 = f - ((float) i4);
        float f3 = f + ((float) i4);
        return b.mo15697c(bVar, i3, i2, f2, f2, f3, f2, f3, f3, f2, f3, oVar.mo15618c(), oVar.mo15619d(), oVar2.mo15618c(), oVar2.mo15619d(), oVar3.mo15618c(), oVar3.mo15619d(), oVar4.mo15618c(), oVar4.mo15619d());
    }

    /* renamed from: r */
    private int m22246r(C5383o oVar, C5383o oVar2, int i) {
        float b = m22230b(oVar, oVar2);
        float f = b / ((float) i);
        float c = oVar.mo15618c();
        float d = oVar.mo15619d();
        float c2 = ((oVar2.mo15618c() - oVar.mo15618c()) * f) / b;
        float d2 = (f * (oVar2.mo15619d() - oVar.mo15619d())) / b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f15595a.mo15665e(C5423a.m22358c((f2 * c2) + c), C5423a.m22358c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C5385a mo15627a(boolean z) throws C5377i {
        C5383o[] f = m22234f(m22239k());
        if (z) {
            C5383o oVar = f[0];
            f[0] = f[2];
            f[2] = oVar;
        }
        m22233e(f);
        C5412b bVar = this.f15595a;
        int i = this.f15600f;
        return new C5385a(m22245q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), m22240l(f), this.f15596b, this.f15598d, this.f15597c);
    }
}
