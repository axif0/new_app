package p148g.p189d.p296d.p304s;

/* renamed from: g.d.d.s.c */
public final class C5413c {

    /* renamed from: a */
    private final byte[] f15640a;

    /* renamed from: b */
    private int f15641b;

    /* renamed from: c */
    private int f15642c;

    public C5413c(byte[] bArr) {
        this.f15640a = bArr;
    }

    /* renamed from: a */
    public int mo15680a() {
        return ((this.f15640a.length - this.f15641b) * 8) - this.f15642c;
    }

    /* renamed from: b */
    public int mo15681b() {
        return this.f15642c;
    }

    /* renamed from: c */
    public int mo15682c() {
        return this.f15641b;
    }

    /* renamed from: d */
    public int mo15683d(int i) {
        if (i <= 0 || i > 32 || i > mo15680a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f15642c;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f15640a;
            int i6 = this.f15641b;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            int i8 = this.f15642c + i4;
            this.f15642c = i8;
            if (i8 == 8) {
                this.f15642c = 0;
                this.f15641b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = b << 8;
            byte[] bArr2 = this.f15640a;
            int i10 = this.f15641b;
            b = (bArr2[i10] & 255) | i9;
            this.f15641b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((255 >> i11) << i11) & this.f15640a[this.f15641b]) >> i11);
        this.f15642c += i;
        return i12;
    }
}
