package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.g5 */
final class C4561g5 extends C4523e5 {

    /* renamed from: a */
    private final C4504d5 f14144a = new C4504d5();

    C4561g5() {
    }

    /* renamed from: a */
    public final void mo13850a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f14144a.mo14037a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
