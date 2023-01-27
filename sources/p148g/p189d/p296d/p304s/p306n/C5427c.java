package p148g.p189d.p296d.p304s.p306n;

/* renamed from: g.d.d.s.n.c */
public final class C5427c {

    /* renamed from: a */
    private final C5425a f15725a;

    public C5427c(C5425a aVar) {
        this.f15725a = aVar;
    }

    /* renamed from: b */
    private int[] m22382b(C5426b bVar) throws C5428d {
        int d = bVar.mo15718d();
        int i = 0;
        if (d == 1) {
            return new int[]{bVar.mo15717c(1)};
        }
        int[] iArr = new int[d];
        for (int i2 = 1; i2 < this.f15725a.mo15709f() && i < d; i2++) {
            if (bVar.mo15716b(i2) == 0) {
                iArr[i] = this.f15725a.mo15711h(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw new C5428d("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m22383c(C5426b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f15725a.mo15711h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f15725a.mo15713j(iArr[i3], h);
                    i2 = this.f15725a.mo15713j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f15725a.mo15713j(bVar.mo15716b(h), this.f15725a.mo15711h(i2));
            if (this.f15725a.mo15707d() != 0) {
                iArr2[i] = this.f15725a.mo15713j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C5426b[] m22384d(C5426b bVar, C5426b bVar2, int i) throws C5428d {
        if (bVar.mo15718d() < bVar2.mo15718d()) {
            C5426b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C5426b g = this.f15725a.mo15710g();
        C5426b e = this.f15725a.mo15708e();
        do {
            C5426b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C5426b bVar5 = e;
            C5426b bVar6 = g;
            g = bVar5;
            if (bVar.mo15718d() < i / 2) {
                int c = g.mo15717c(0);
                if (c != 0) {
                    int h = this.f15725a.mo15711h(c);
                    return new C5426b[]{g.mo15720f(h), bVar.mo15720f(h)};
                }
                throw new C5428d("sigmaTilde(0) was zero");
            } else if (!bVar.mo15719e()) {
                C5426b g2 = this.f15725a.mo15710g();
                int h2 = this.f15725a.mo15711h(bVar.mo15717c(bVar.mo15718d()));
                while (r11.mo15718d() >= bVar.mo15718d() && !r11.mo15719e()) {
                    int d = r11.mo15718d() - bVar.mo15718d();
                    int j = this.f15725a.mo15713j(r11.mo15717c(r11.mo15718d()), h2);
                    g2 = g2.mo15715a(this.f15725a.mo15705b(d, j));
                    r11 = r11.mo15715a(bVar.mo15722h(d, j));
                }
                e = g2.mo15721g(g).mo15715a(bVar6);
            } else {
                throw new C5428d("r_{i-1} was zero");
            }
        } while (r11.mo15718d() < bVar.mo15718d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void mo15724a(int[] iArr, int i) throws C5428d {
        C5426b bVar = new C5426b(this.f15725a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C5425a aVar = this.f15725a;
            int b = bVar.mo15716b(aVar.mo15706c(aVar.mo15707d() + i3));
            iArr2[(i - 1) - i3] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C5426b[] d = m22384d(this.f15725a.mo15705b(i, 1), new C5426b(this.f15725a, iArr2), i);
            C5426b bVar2 = d[0];
            C5426b bVar3 = d[1];
            int[] b2 = m22382b(bVar2);
            int[] c = m22383c(bVar3, b2);
            while (i2 < b2.length) {
                int length = (iArr.length - 1) - this.f15725a.mo15712i(b2[i2]);
                if (length >= 0) {
                    iArr[length] = C5425a.m22364a(iArr[length], c[i2]);
                    i2++;
                } else {
                    throw new C5428d("Bad error location");
                }
            }
        }
    }
}
