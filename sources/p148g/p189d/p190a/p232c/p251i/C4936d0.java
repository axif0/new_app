package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Callable;

/* renamed from: g.d.a.c.i.d0 */
final class C4936d0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4934c0 f14755f;

    /* renamed from: g */
    private final /* synthetic */ Callable f14756g;

    C4936d0(C4934c0 c0Var, Callable callable) {
        this.f14755f = c0Var;
        this.f14756g = callable;
    }

    public final void run() {
        try {
            this.f14755f.mo14877o(this.f14756g.call());
        } catch (Exception e) {
            this.f14755f.mo14876n(e);
        }
    }
}
