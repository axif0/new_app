package p148g.p189d.p296d.p318x.p319d.p320k;

import p148g.p189d.p296d.C5372d;

/* renamed from: g.d.d.x.d.k.a */
public final class C5509a {

    /* renamed from: a */
    private final C5510b f15940a = C5510b.f15941f;

    /* renamed from: b */
    private int[] m22782b(C5511c cVar) throws C5372d {
        int d = cVar.mo15901d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f15940a.mo15892e() && i < d; i2++) {
            if (cVar.mo15899b(i2) == 0) {
                iArr[i] = this.f15940a.mo15894g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw C5372d.m22177a();
    }

    /* renamed from: c */
    private int[] m22783c(C5511c cVar, C5511c cVar2, int[] iArr) {
        int d = cVar2.mo15901d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f15940a.mo15896i(i, cVar2.mo15900c(i));
        }
        C5511c cVar3 = new C5511c(this.f15940a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f15940a.mo15894g(iArr[i2]);
            iArr3[i2] = this.f15940a.mo15896i(this.f15940a.mo15897j(0, cVar.mo15899b(g)), this.f15940a.mo15894g(cVar3.mo15899b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C5511c[] m22784d(C5511c cVar, C5511c cVar2, int i) throws C5372d {
        if (cVar.mo15901d() < cVar2.mo15901d()) {
            C5511c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C5511c f = this.f15940a.mo15893f();
        C5511c d = this.f15940a.mo15891d();
        while (true) {
            C5511c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C5511c cVar5 = d;
            C5511c cVar6 = f;
            f = cVar5;
            if (cVar.mo15901d() < i / 2) {
                int c = f.mo15900c(0);
                if (c != 0) {
                    int g = this.f15940a.mo15894g(c);
                    return new C5511c[]{f.mo15903f(g), cVar.mo15903f(g)};
                }
                throw C5372d.m22177a();
            } else if (!cVar.mo15902e()) {
                C5511c f2 = this.f15940a.mo15893f();
                int g2 = this.f15940a.mo15894g(cVar.mo15900c(cVar.mo15901d()));
                while (r11.mo15901d() >= cVar.mo15901d() && !r11.mo15902e()) {
                    int d2 = r11.mo15901d() - cVar.mo15901d();
                    int i2 = this.f15940a.mo15896i(r11.mo15900c(r11.mo15901d()), g2);
                    f2 = f2.mo15898a(this.f15940a.mo15889b(d2, i2));
                    r11 = r11.mo15907j(cVar.mo15905h(d2, i2));
                }
                d = f2.mo15904g(f).mo15907j(cVar6).mo15906i();
            } else {
                throw C5372d.m22177a();
            }
        }
    }

    /* renamed from: a */
    public int mo15887a(int[] iArr, int i, int[] iArr2) throws C5372d {
        C5511c cVar = new C5511c(this.f15940a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = cVar.mo15899b(this.f15940a.mo15890c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C5511c d = this.f15940a.mo15891d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f15940a.mo15890c((iArr.length - 1) - length);
                C5510b bVar = this.f15940a;
                d = d.mo15904g(new C5511c(bVar, new int[]{bVar.mo15897j(0, c), 1}));
            }
        }
        C5511c[] d2 = m22784d(this.f15940a.mo15889b(i, 1), new C5511c(this.f15940a, iArr3), i);
        C5511c cVar2 = d2[0];
        C5511c cVar3 = d2[1];
        int[] b2 = m22782b(cVar2);
        int[] c2 = m22783c(cVar3, cVar2, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f15940a.mo15895h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f15940a.mo15897j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw C5372d.m22177a();
            }
        }
        return b2.length;
    }
}
