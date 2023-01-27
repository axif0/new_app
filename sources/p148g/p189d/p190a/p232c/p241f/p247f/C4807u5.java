package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.NoSuchElementException;

/* renamed from: g.d.a.c.f.f.u5 */
final class C4807u5 extends C4839w5 {

    /* renamed from: f */
    private int f14563f = 0;

    /* renamed from: g */
    private final int f14564g = this.f14565h.mo13854d();

    /* renamed from: h */
    private final /* synthetic */ C4773s5 f14565h;

    C4807u5(C4773s5 s5Var) {
        this.f14565h = s5Var;
    }

    /* renamed from: a */
    public final byte mo13792a() {
        int i = this.f14563f;
        if (i < this.f14564g) {
            this.f14563f = i + 1;
            return this.f14565h.mo13860q(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f14563f < this.f14564g;
    }
}
