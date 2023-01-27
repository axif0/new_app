package p148g.p189d.p296d.p307t.p308b;

import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.t.b.a */
final class C5430a {

    /* renamed from: a */
    private final C5412b f15728a;

    /* renamed from: b */
    private final C5412b f15729b;

    /* renamed from: c */
    private final C5436e f15730c;

    C5430a(C5412b bVar) throws C5374f {
        int i = bVar.mo15670i();
        if (i < 8 || i > 144 || (i & 1) != 0) {
            throw C5374f.m22179a();
        }
        this.f15730c = m22398j(bVar);
        C5412b a = m22391a(bVar);
        this.f15728a = a;
        this.f15729b = new C5412b(a.mo15673n(), this.f15728a.mo15670i());
    }

    /* renamed from: a */
    private C5412b m22391a(C5412b bVar) {
        int f = this.f15730c.mo15734f();
        int e = this.f15730c.mo15733e();
        if (bVar.mo15670i() == f) {
            int c = this.f15730c.mo15731c();
            int b = this.f15730c.mo15730b();
            int i = f / c;
            int i2 = e / b;
            C5412b bVar2 = new C5412b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.mo15665e(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo15675q(i6 + i10, i9);
                            }
                        }
                        C5412b bVar3 = bVar;
                    }
                    C5412b bVar4 = bVar;
                }
                C5412b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: d */
    private int m22392d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m22396h(i3, 0, i, i2) ? 1 : 0) << true;
        if (m22396h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m22396h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m22396h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m22396h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m22396h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m22396h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m22396h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* renamed from: e */
    private int m22393e(int i, int i2) {
        int i3 = (m22396h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m22396h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m22396h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m22396h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m22396h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m22396h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m22396h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m22396h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: f */
    private int m22394f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m22396h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (m22396h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m22396h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m22396h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m22396h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m22396h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m22396h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m22396h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: g */
    private int m22395g(int i, int i2) {
        int i3 = (m22396h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m22396h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m22396h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m22396h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m22396h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m22396h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m22396h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m22396h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: h */
    private boolean m22396h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f15729b.mo15675q(i2, i);
        return this.f15728a.mo15665e(i2, i);
    }

    /* renamed from: i */
    private int m22397i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m22396h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (m22396h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m22396h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m22396h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m22396h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m22396h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m22396h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m22396h(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* renamed from: j */
    private static C5436e m22398j(C5412b bVar) throws C5374f {
        return C5436e.m22416h(bVar.mo15670i(), bVar.mo15673n());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5436e mo15725b() {
        return this.f15730c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo15726c() throws C5374f {
        byte[] bArr = new byte[this.f15730c.mo15735g()];
        int i = this.f15728a.mo15670i();
        int n = this.f15728a.mo15673n();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 4;
        while (true) {
            if (i4 == i && i2 == 0 && !z) {
                bArr[i3] = (byte) m22392d(i, n);
                i4 -= 2;
                i2 += 2;
                i3++;
                z = true;
            } else {
                int i5 = i - 2;
                if (i4 == i5 && i2 == 0 && (n & 3) != 0 && !z2) {
                    bArr[i3] = (byte) m22393e(i, n);
                    i4 -= 2;
                    i2 += 2;
                    i3++;
                    z2 = true;
                } else if (i4 == i + 4 && i2 == 2 && (n & 7) == 0 && !z3) {
                    bArr[i3] = (byte) m22394f(i, n);
                    i4 -= 2;
                    i2 += 2;
                    i3++;
                    z3 = true;
                } else if (i4 == i5 && i2 == 0 && (n & 7) == 4 && !z4) {
                    bArr[i3] = (byte) m22395g(i, n);
                    i4 -= 2;
                    i2 += 2;
                    i3++;
                    z4 = true;
                } else {
                    do {
                        if (i4 < i && i2 >= 0 && !this.f15729b.mo15665e(i2, i4)) {
                            bArr[i3] = (byte) m22397i(i4, i2, i, n);
                            i3++;
                        }
                        i4 -= 2;
                        i2 += 2;
                        if (i4 < 0) {
                            break;
                        }
                    } while (i2 < n);
                    int i6 = i4 + 1;
                    int i7 = i2 + 3;
                    do {
                        if (i6 >= 0 && i7 < n && !this.f15729b.mo15665e(i7, i6)) {
                            bArr[i3] = (byte) m22397i(i6, i7, i, n);
                            i3++;
                        }
                        i6 += 2;
                        i7 -= 2;
                        if (i6 >= i) {
                            break;
                        }
                    } while (i7 >= 0);
                    i4 = i6 + 3;
                    i2 = i7 + 1;
                }
            }
            if (i4 >= i && i2 >= n) {
                break;
            }
        }
        if (i3 == this.f15730c.mo15735g()) {
            return bArr;
        }
        throw C5374f.m22179a();
    }
}
