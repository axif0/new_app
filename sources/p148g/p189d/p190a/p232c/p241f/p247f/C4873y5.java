package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.y5 */
final class C4873y5 extends C4469b6 {

    /* renamed from: j */
    private final int f14643j;

    /* renamed from: k */
    private final int f14644k;

    C4873y5(byte[] bArr, int i, int i2) {
        super(bArr);
        C4773s5.m20339r(i, i + i2, bArr.length);
        this.f14643j = i;
        this.f14644k = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final int mo13852B() {
        return this.f14643j;
    }

    /* renamed from: c */
    public final byte mo13853c(int i) {
        int d = mo13854d();
        if (((d - (i + 1)) | i) >= 0) {
            return this.f13992i[this.f14643j + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(d);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: d */
    public final int mo13854d() {
        return this.f14644k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final byte mo13860q(int i) {
        return this.f13992i[this.f14643j + i];
    }
}
