package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.g6 */
final class C4562g6 extends C4505d6 {

    /* renamed from: a */
    private int f14145a;

    /* renamed from: b */
    private int f14146b;

    /* renamed from: c */
    private int f14147c;

    /* renamed from: d */
    private int f14148d;

    /* renamed from: e */
    private int f14149e;

    private C4562g6(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f14149e = Integer.MAX_VALUE;
        this.f14145a = i2 + i;
        this.f14147c = i;
        this.f14148d = i;
    }

    /* renamed from: f */
    private final void m19524f() {
        int i = this.f14145a + this.f14146b;
        this.f14145a = i;
        int i2 = i - this.f14148d;
        int i3 = this.f14149e;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f14146b = i4;
            this.f14145a = i - i4;
            return;
        }
        this.f14146b = 0;
    }

    /* renamed from: d */
    public final int mo14195d(int i) throws C4636k7 {
        if (i >= 0) {
            int e = i + mo14196e();
            int i2 = this.f14149e;
            if (e <= i2) {
                this.f14149e = e;
                m19524f();
                return i2;
            }
            throw C4636k7.m19823a();
        }
        throw C4636k7.m19824b();
    }

    /* renamed from: e */
    public final int mo14196e() {
        return this.f14147c - this.f14148d;
    }
}
