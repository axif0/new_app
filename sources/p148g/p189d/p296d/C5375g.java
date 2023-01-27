package p148g.p189d.p296d;

/* renamed from: g.d.d.g */
public abstract class C5375g {

    /* renamed from: a */
    private final int f15545a;

    /* renamed from: b */
    private final int f15546b;

    protected C5375g(int i, int i2) {
        this.f15545a = i;
        this.f15546b = i2;
    }

    /* renamed from: a */
    public final int mo15596a() {
        return this.f15546b;
    }

    /* renamed from: b */
    public abstract byte[] mo15597b();

    /* renamed from: c */
    public abstract byte[] mo15598c(int i, byte[] bArr);

    /* renamed from: d */
    public final int mo15599d() {
        return this.f15545a;
    }

    /* renamed from: e */
    public boolean mo15600e() {
        return false;
    }

    /* renamed from: f */
    public C5375g mo15601f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f15545a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f15546b * (i + 1));
        for (int i2 = 0; i2 < this.f15546b; i2++) {
            bArr = mo15598c(i2, bArr);
            for (int i3 = 0; i3 < this.f15545a; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
