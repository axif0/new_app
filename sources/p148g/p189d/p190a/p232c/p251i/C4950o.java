package p148g.p189d.p190a.p232c.p251i;

/* renamed from: g.d.a.c.i.o */
final class C4950o implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4940h f14769f;

    /* renamed from: g */
    private final /* synthetic */ C4949n f14770g;

    C4950o(C4949n nVar, C4940h hVar) {
        this.f14770g = nVar;
        this.f14769f = hVar;
    }

    public final void run() {
        try {
            C4940h hVar = (C4940h) this.f14770g.f14767b.mo9439a(this.f14769f);
            if (hVar == null) {
                this.f14770g.mo14881c(new NullPointerException("Continuation returned null"));
                return;
            }
            hVar.mo14866d(C4942j.f14758a, this.f14770g);
            hVar.mo14865c(C4942j.f14758a, this.f14770g);
            hVar.mo14863a(C4942j.f14758a, this.f14770g);
        } catch (C4938f e) {
            if (e.getCause() instanceof Exception) {
                this.f14770g.f14768c.mo14876n((Exception) e.getCause());
            } else {
                this.f14770g.f14768c.mo14876n(e);
            }
        } catch (Exception e2) {
            this.f14770g.f14768c.mo14876n(e2);
        }
    }
}
