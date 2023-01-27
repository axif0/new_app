package p148g.p189d.p296d.p322y.p323b;

import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.y.b.a */
final class C5515a {

    /* renamed from: a */
    private final C5412b f15957a;

    /* renamed from: b */
    private C5533j f15958b;

    /* renamed from: c */
    private C5530g f15959c;

    /* renamed from: d */
    private boolean f15960d;

    C5515a(C5412b bVar) throws C5374f {
        int i = bVar.mo15670i();
        if (i < 21 || (i & 3) != 1) {
            throw C5374f.m22179a();
        }
        this.f15957a = bVar;
    }

    /* renamed from: a */
    private int m22820a(int i, int i2, int i3) {
        return this.f15960d ? this.f15957a.mo15665e(i2, i) : this.f15957a.mo15665e(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15911b() {
        int i = 0;
        while (i < this.f15957a.mo15673n()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f15957a.mo15670i(); i3++) {
                if (this.f15957a.mo15665e(i, i3) != this.f15957a.mo15665e(i3, i)) {
                    this.f15957a.mo15664d(i3, i);
                    this.f15957a.mo15664d(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo15912c() throws C5374f {
        C5530g d = mo15913d();
        C5533j e = mo15914e();
        C5517c cVar = C5517c.values()[d.mo15922c()];
        int i = this.f15957a.mo15670i();
        cVar.mo15920g(this.f15957a, i);
        C5412b a = e.mo15928a();
        byte[] bArr = new byte[e.mo15932h()];
        int i2 = i - 1;
        boolean z = true;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = z ? i2 - i7 : i7;
                for (int i9 = 0; i9 < 2; i9++) {
                    int i10 = i3 - i9;
                    if (!a.mo15665e(i10, i8)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f15957a.mo15665e(i10, i8)) {
                            i6 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i4] = (byte) i6;
                            i4++;
                            i5 = 0;
                            i6 = 0;
                        }
                    }
                }
            }
            z = !z;
            i3 -= 2;
        }
        if (i4 == e.mo15932h()) {
            return bArr;
        }
        throw C5374f.m22179a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5530g mo15913d() throws C5374f {
        C5530g gVar = this.f15959c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m22820a(i3, 8, i2);
        }
        int a = m22820a(8, 7, m22820a(8, 8, m22820a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m22820a(8, i4, a);
        }
        int i5 = this.f15957a.mo15670i();
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = m22820a(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = m22820a(i8, 8, i);
        }
        C5530g a2 = C5530g.m22852a(a, i);
        this.f15959c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C5374f.m22179a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5533j mo15914e() throws C5374f {
        C5533j jVar = this.f15958b;
        if (jVar != null) {
            return jVar;
        }
        int i = this.f15957a.mo15670i();
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return C5533j.m22863i(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = m22820a(i7, i6, i5);
            }
        }
        C5533j c = C5533j.m22861c(i5);
        if (c == null || c.mo15930e() != i) {
            for (int i8 = 5; i8 >= 0; i8--) {
                for (int i9 = i - 9; i9 >= i3; i9--) {
                    i4 = m22820a(i8, i9, i4);
                }
            }
            C5533j c2 = C5533j.m22861c(i4);
            if (c2 == null || c2.mo15930e() != i) {
                throw C5374f.m22179a();
            }
            this.f15958b = c2;
            return c2;
        }
        this.f15958b = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15915f() {
        if (this.f15959c != null) {
            C5517c.values()[this.f15959c.mo15922c()].mo15920g(this.f15957a, this.f15957a.mo15670i());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo15916g(boolean z) {
        this.f15958b = null;
        this.f15959c = null;
        this.f15960d = z;
    }
}
