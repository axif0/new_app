package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.d6 */
public abstract class C4505d6 {
    private C4505d6() {
    }

    /* renamed from: a */
    public static long m19226a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: b */
    static C4505d6 m19227b(byte[] bArr, int i, int i2, boolean z) {
        C4562g6 g6Var = new C4562g6(bArr, i2);
        try {
            g6Var.mo14195d(i2);
            return g6Var;
        } catch (C4636k7 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: c */
    public static int m19228c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }
}
