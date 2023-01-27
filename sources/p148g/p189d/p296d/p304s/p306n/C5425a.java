package p148g.p189d.p296d.p304s.p306n;

/* renamed from: g.d.d.s.n.a */
public final class C5425a {

    /* renamed from: h */
    public static final C5425a f15708h = new C5425a(4201, 4096, 1);

    /* renamed from: i */
    public static final C5425a f15709i = new C5425a(1033, 1024, 1);

    /* renamed from: j */
    public static final C5425a f15710j = new C5425a(67, 64, 1);

    /* renamed from: k */
    public static final C5425a f15711k = new C5425a(19, 16, 1);

    /* renamed from: l */
    public static final C5425a f15712l = new C5425a(285, 256, 0);

    /* renamed from: m */
    public static final C5425a f15713m;

    /* renamed from: n */
    public static final C5425a f15714n;

    /* renamed from: o */
    public static final C5425a f15715o = f15710j;

    /* renamed from: a */
    private final int[] f15716a;

    /* renamed from: b */
    private final int[] f15717b;

    /* renamed from: c */
    private final C5426b f15718c;

    /* renamed from: d */
    private final C5426b f15719d;

    /* renamed from: e */
    private final int f15720e;

    /* renamed from: f */
    private final int f15721f;

    /* renamed from: g */
    private final int f15722g;

    static {
        C5425a aVar = new C5425a(301, 256, 1);
        f15713m = aVar;
        f15714n = aVar;
    }

    public C5425a(int i, int i2, int i3) {
        this.f15721f = i;
        this.f15720e = i2;
        this.f15722g = i3;
        this.f15716a = new int[i2];
        this.f15717b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f15716a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f15717b[this.f15716a[i6]] = i6;
        }
        this.f15718c = new C5426b(this, new int[]{0});
        this.f15719d = new C5426b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m22364a(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5426b mo15705b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f15718c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C5426b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15706c(int i) {
        return this.f15716a[i];
    }

    /* renamed from: d */
    public int mo15707d() {
        return this.f15722g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5426b mo15708e() {
        return this.f15719d;
    }

    /* renamed from: f */
    public int mo15709f() {
        return this.f15720e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C5426b mo15710g() {
        return this.f15718c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo15711h(int i) {
        if (i != 0) {
            return this.f15716a[(this.f15720e - this.f15717b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo15712i(int i) {
        if (i != 0) {
            return this.f15717b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo15713j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f15716a;
        int[] iArr2 = this.f15717b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f15720e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f15721f) + ',' + this.f15720e + ')';
    }
}
