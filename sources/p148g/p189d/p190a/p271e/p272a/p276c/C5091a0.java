package p148g.p189d.p190a.p271e.p272a.p276c;

/* renamed from: g.d.a.e.a.c.a0 */
final class C5091a0 extends C5136x {

    /* renamed from: a */
    private final C5140z f15129a = new C5140z();

    C5091a0() {
    }

    /* renamed from: a */
    public final void mo15200a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f15129a.mo15239a(th).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
