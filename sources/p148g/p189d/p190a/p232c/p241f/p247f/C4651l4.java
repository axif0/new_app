package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.NoSuchElementException;

/* renamed from: g.d.a.c.f.f.l4 */
final class C4651l4 extends C4855x4<T> {

    /* renamed from: f */
    private boolean f14247f;

    /* renamed from: g */
    private final /* synthetic */ Object f14248g;

    C4651l4(Object obj) {
        this.f14248g = obj;
    }

    public final boolean hasNext() {
        return !this.f14247f;
    }

    public final T next() {
        if (!this.f14247f) {
            this.f14247f = true;
            return this.f14248g;
        }
        throw new NoSuchElementException();
    }
}
