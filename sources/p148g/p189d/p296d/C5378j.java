package p148g.p189d.p296d;

/* renamed from: g.d.d.j */
public final class C5378j extends C5375g {

    /* renamed from: c */
    private final byte[] f15551c;

    /* renamed from: d */
    private final int f15552d;

    /* renamed from: e */
    private final int f15553e;

    /* renamed from: f */
    private final int f15554f;

    /* renamed from: g */
    private final int f15555g;

    public C5378j(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f15551c = bArr;
        this.f15552d = i;
        this.f15553e = i2;
        this.f15554f = i3;
        this.f15555g = i4;
        if (z) {
            m22194g(i5, i6);
        }
    }

    /* renamed from: g */
    private void m22194g(int i, int i2) {
        byte[] bArr = this.f15551c;
        int i3 = (this.f15555g * this.f15552d) + this.f15554f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f15552d;
        }
    }

    /* renamed from: b */
    public byte[] mo15597b() {
        int d = mo15599d();
        int a = mo15596a();
        if (d == this.f15552d && a == this.f15553e) {
            return this.f15551c;
        }
        int i = d * a;
        byte[] bArr = new byte[i];
        int i2 = this.f15555g;
        int i3 = this.f15552d;
        int i4 = (i2 * i3) + this.f15554f;
        if (d == i3) {
            System.arraycopy(this.f15551c, i4, bArr, 0, i);
            return bArr;
        }
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(this.f15551c, i4, bArr, i5 * d, d);
            i4 += this.f15552d;
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo15598c(int i, byte[] bArr) {
        if (i < 0 || i >= mo15596a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int d = mo15599d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f15551c, ((i + this.f15555g) * this.f15552d) + this.f15554f, bArr, 0, d);
        return bArr;
    }
}
