package p148g.p189d.p296d.p318x.p319d.p320k;

/* renamed from: g.d.d.x.d.k.c */
final class C5511c {

    /* renamed from: a */
    private final C5510b f15947a;

    /* renamed from: b */
    private final int[] f15948b;

    C5511c(C5510b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f15947a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f15948b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f15948b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f15948b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5511c mo15898a(C5511c cVar) {
        if (!this.f15947a.equals(cVar.f15947a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo15902e()) {
            return cVar;
        } else {
            if (cVar.mo15902e()) {
                return this;
            }
            int[] iArr = this.f15948b;
            int[] iArr2 = cVar.f15948b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f15947a.mo15888a(iArr2[i - length], iArr[i]);
            }
            return new C5511c(this.f15947a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15899b(int i) {
        if (i == 0) {
            return mo15900c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f15948b) {
                i2 = this.f15947a.mo15888a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f15948b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C5510b bVar = this.f15947a;
            i3 = bVar.mo15888a(bVar.mo15896i(i, i3), this.f15948b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15900c(int i) {
        int[] iArr = this.f15948b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15901d() {
        return this.f15948b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo15902e() {
        return this.f15948b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C5511c mo15903f(int i) {
        if (i == 0) {
            return this.f15947a.mo15893f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f15948b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f15947a.mo15896i(this.f15948b[i2], i);
        }
        return new C5511c(this.f15947a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C5511c mo15904g(C5511c cVar) {
        if (!this.f15947a.equals(cVar.f15947a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo15902e() || cVar.mo15902e()) {
            return this.f15947a.mo15893f();
        } else {
            int[] iArr = this.f15948b;
            int length = iArr.length;
            int[] iArr2 = cVar.f15948b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C5510b bVar = this.f15947a;
                    iArr3[i4] = bVar.mo15888a(iArr3[i4], bVar.mo15896i(i2, iArr2[i3]));
                }
            }
            return new C5511c(this.f15947a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5511c mo15905h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f15947a.mo15893f();
        } else {
            int length = this.f15948b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f15947a.mo15896i(this.f15948b[i3], i2);
            }
            return new C5511c(this.f15947a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C5511c mo15906i() {
        int length = this.f15948b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f15947a.mo15897j(0, this.f15948b[i]);
        }
        return new C5511c(this.f15947a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C5511c mo15907j(C5511c cVar) {
        if (this.f15947a.equals(cVar.f15947a)) {
            return cVar.mo15902e() ? this : mo15898a(cVar.mo15906i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo15901d() * 8);
        for (int d = mo15901d(); d >= 0; d--) {
            int c = mo15900c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
