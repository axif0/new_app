package p148g.p189d.p296d.p304s;

import java.util.Arrays;

/* renamed from: g.d.d.s.b */
public final class C5412b implements Cloneable {

    /* renamed from: f */
    private final int f15636f;

    /* renamed from: g */
    private final int f15637g;

    /* renamed from: h */
    private final int f15638h;

    /* renamed from: i */
    private final int[] f15639i;

    public C5412b(int i) {
        this(i, i);
    }

    public C5412b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f15636f = i;
        this.f15637g = i2;
        int i3 = (i + 31) / 32;
        this.f15638h = i3;
        this.f15639i = new int[(i3 * i2)];
    }

    private C5412b(int i, int i2, int i3, int[] iArr) {
        this.f15636f = i;
        this.f15637g = i2;
        this.f15638h = i3;
        this.f15639i = iArr;
    }

    /* renamed from: b */
    private String m22299b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f15637g * (this.f15636f + 1));
        for (int i = 0; i < this.f15637g; i++) {
            for (int i2 = 0; i2 < this.f15636f; i2++) {
                sb.append(mo15665e(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public C5412b clone() {
        return new C5412b(this.f15636f, this.f15637g, this.f15638h, (int[]) this.f15639i.clone());
    }

    /* renamed from: d */
    public void mo15664d(int i, int i2) {
        int i3 = (i2 * this.f15638h) + (i / 32);
        int[] iArr = this.f15639i;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: e */
    public boolean mo15665e(int i, int i2) {
        return ((this.f15639i[(i2 * this.f15638h) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5412b)) {
            return false;
        }
        C5412b bVar = (C5412b) obj;
        return this.f15636f == bVar.f15636f && this.f15637g == bVar.f15637g && this.f15638h == bVar.f15638h && Arrays.equals(this.f15639i, bVar.f15639i);
    }

    /* renamed from: f */
    public int[] mo15667f() {
        int length = this.f15639i.length - 1;
        while (length >= 0 && this.f15639i[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f15638h;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f15639i[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: g */
    public int[] mo15668g() {
        int i = this.f15636f;
        int i2 = this.f15637g;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f15637g; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f15638h;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f15639i[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int hashCode() {
        int i = this.f15636f;
        return (((((((i * 31) + i) * 31) + this.f15637g) * 31) + this.f15638h) * 31) + Arrays.hashCode(this.f15639i);
    }

    /* renamed from: i */
    public int mo15670i() {
        return this.f15637g;
    }

    /* renamed from: k */
    public C5411a mo15671k(int i, C5411a aVar) {
        if (aVar == null || aVar.mo15656i() < this.f15636f) {
            aVar = new C5411a(this.f15636f);
        } else {
            aVar.mo15647b();
        }
        int i2 = i * this.f15638h;
        for (int i3 = 0; i3 < this.f15638h; i3++) {
            aVar.mo15660q(i3 << 5, this.f15639i[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: l */
    public int[] mo15672l() {
        int i = 0;
        while (true) {
            int[] iArr = this.f15639i;
            if (i >= iArr.length || iArr[i] != 0) {
                int[] iArr2 = this.f15639i;
            } else {
                i++;
            }
        }
        int[] iArr22 = this.f15639i;
        if (i == iArr22.length) {
            return null;
        }
        int i2 = this.f15638h;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr22[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: n */
    public int mo15673n() {
        return this.f15636f;
    }

    /* renamed from: p */
    public void mo15674p() {
        int n = mo15673n();
        int i = mo15670i();
        C5411a aVar = new C5411a(n);
        C5411a aVar2 = new C5411a(n);
        for (int i2 = 0; i2 < (i + 1) / 2; i2++) {
            aVar = mo15671k(i2, aVar);
            int i3 = (i - 1) - i2;
            aVar2 = mo15671k(i3, aVar2);
            aVar.mo15658n();
            aVar2.mo15658n();
            mo15677s(i2, aVar2);
            mo15677s(i3, aVar);
        }
    }

    /* renamed from: q */
    public void mo15675q(int i, int i2) {
        int i3 = (i2 * this.f15638h) + (i / 32);
        int[] iArr = this.f15639i;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: r */
    public void mo15676r(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f15637g || i5 > this.f15636f) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f15638h * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f15639i;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: s */
    public void mo15677s(int i, C5411a aVar) {
        int[] e = aVar.mo15651e();
        int[] iArr = this.f15639i;
        int i2 = this.f15638h;
        System.arraycopy(e, 0, iArr, i * i2, i2);
    }

    /* renamed from: t */
    public String mo15678t(String str, String str2) {
        return m22299b(str, str2, "\n");
    }

    public String toString() {
        return mo15678t("X ", "  ");
    }
}
