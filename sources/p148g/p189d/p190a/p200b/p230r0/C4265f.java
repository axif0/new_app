package p148g.p189d.p190a.p200b.p230r0;

/* renamed from: g.d.a.b.r0.f */
public final class C4265f {

    /* renamed from: a */
    public final int f13616a;

    /* renamed from: b */
    public final int f13617b;

    /* renamed from: c */
    public final int f13618c;

    /* renamed from: d */
    public final long f13619d;

    public C4265f(byte[] bArr, int i) {
        C4273l lVar = new C4273l(bArr);
        lVar.mo13441m(i * 8);
        lVar.mo13436h(16);
        lVar.mo13436h(16);
        lVar.mo13436h(24);
        lVar.mo13436h(24);
        this.f13616a = lVar.mo13436h(20);
        this.f13617b = lVar.mo13436h(3) + 1;
        this.f13618c = lVar.mo13436h(5) + 1;
        this.f13619d = ((((long) lVar.mo13436h(4)) & 15) << 32) | (((long) lVar.mo13436h(32)) & 4294967295L);
    }

    /* renamed from: a */
    public int mo13417a() {
        return this.f13618c * this.f13616a;
    }

    /* renamed from: b */
    public long mo13418b() {
        return (this.f13619d * 1000000) / ((long) this.f13616a);
    }
}
