package p148g.p189d.p296d.p318x.p319d.p320k;

/* renamed from: g.d.d.x.d.k.b */
public final class C5510b {

    /* renamed from: f */
    public static final C5510b f15941f = new C5510b(929, 3);

    /* renamed from: a */
    private final int[] f15942a;

    /* renamed from: b */
    private final int[] f15943b;

    /* renamed from: c */
    private final C5511c f15944c;

    /* renamed from: d */
    private final C5511c f15945d;

    /* renamed from: e */
    private final int f15946e;

    private C5510b(int i, int i2) {
        this.f15946e = i;
        this.f15942a = new int[i];
        this.f15943b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f15942a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f15943b[this.f15942a[i5]] = i5;
        }
        this.f15944c = new C5511c(this, new int[]{0});
        this.f15945d = new C5511c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15888a(int i, int i2) {
        return (i + i2) % this.f15946e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5511c mo15889b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f15944c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C5511c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15890c(int i) {
        return this.f15942a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5511c mo15891d() {
        return this.f15945d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo15892e() {
        return this.f15946e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C5511c mo15893f() {
        return this.f15944c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo15894g(int i) {
        if (i != 0) {
            return this.f15942a[(this.f15946e - this.f15943b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo15895h(int i) {
        if (i != 0) {
            return this.f15943b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo15896i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f15942a;
        int[] iArr2 = this.f15943b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f15946e - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo15897j(int i, int i2) {
        int i3 = this.f15946e;
        return ((i + i3) - i2) % i3;
    }
}
