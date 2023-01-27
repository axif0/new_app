package p148g.p189d.p296d.p304s.p306n;

/* renamed from: g.d.d.s.n.b */
final class C5426b {

    /* renamed from: a */
    private final C5425a f15723a;

    /* renamed from: b */
    private final int[] f15724b;

    C5426b(C5425a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f15723a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f15724b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f15724b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f15724b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5426b mo15715a(C5426b bVar) {
        if (!this.f15723a.equals(bVar.f15723a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo15719e()) {
            return bVar;
        } else {
            if (bVar.mo15719e()) {
                return this;
            }
            int[] iArr = this.f15724b;
            int[] iArr2 = bVar.f15724b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C5425a.m22364a(iArr2[i - length], iArr[i]);
            }
            return new C5426b(this.f15723a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15716b(int i) {
        if (i == 0) {
            return mo15717c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f15724b) {
                i2 = C5425a.m22364a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f15724b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C5425a.m22364a(this.f15723a.mo15713j(i, i3), this.f15724b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15717c(int i) {
        int[] iArr = this.f15724b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15718d() {
        return this.f15724b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo15719e() {
        return this.f15724b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C5426b mo15720f(int i) {
        if (i == 0) {
            return this.f15723a.mo15710g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f15724b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f15723a.mo15713j(this.f15724b[i2], i);
        }
        return new C5426b(this.f15723a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C5426b mo15721g(C5426b bVar) {
        if (!this.f15723a.equals(bVar.f15723a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo15719e() || bVar.mo15719e()) {
            return this.f15723a.mo15710g();
        } else {
            int[] iArr = this.f15724b;
            int length = iArr.length;
            int[] iArr2 = bVar.f15724b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C5425a.m22364a(iArr3[i4], this.f15723a.mo15713j(i2, iArr2[i3]));
                }
            }
            return new C5426b(this.f15723a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5426b mo15722h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f15723a.mo15710g();
        } else {
            int length = this.f15724b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f15723a.mo15713j(this.f15724b[i3], i2);
            }
            return new C5426b(this.f15723a, iArr);
        }
    }

    public String toString() {
        char c;
        if (mo15719e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(mo15718d() * 8);
        int d = mo15718d();
        while (d >= 0) {
            int c2 = mo15717c(d);
            if (c2 != 0) {
                if (c2 < 0) {
                    sb.append(d == mo15718d() ? "-" : " - ");
                    c2 = -c2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c2 != 1) {
                    int i = this.f15723a.mo15712i(c2);
                    if (i == 0) {
                        c = '1';
                    } else if (i == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
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
            d--;
        }
        return sb.toString();
    }
}
