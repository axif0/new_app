package p148g.p189d.p190a.p232c.p241f.p246e;

/* renamed from: g.d.a.c.f.e.o */
final class C4439o extends C4438n {

    /* renamed from: a */
    private final C4437m f13962a = new C4437m();

    C4439o() {
    }

    /* renamed from: a */
    public final void mo13762a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f13962a.mo13763a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
