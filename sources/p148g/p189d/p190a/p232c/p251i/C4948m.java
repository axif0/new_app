package p148g.p189d.p190a.p232c.p251i;

/* renamed from: g.d.a.c.i.m */
final class C4948m implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4940h f14764f;

    /* renamed from: g */
    private final /* synthetic */ C4947l f14765g;

    C4948m(C4947l lVar, C4940h hVar) {
        this.f14765g = lVar;
        this.f14764f = hVar;
    }

    public final void run() {
        if (this.f14764f.mo14872j()) {
            this.f14765g.f14763c.mo14880r();
            return;
        }
        try {
            this.f14765g.f14763c.mo14877o(this.f14765g.f14762b.mo9439a(this.f14764f));
        } catch (C4938f e) {
            if (e.getCause() instanceof Exception) {
                this.f14765g.f14763c.mo14876n((Exception) e.getCause());
            } else {
                this.f14765g.f14763c.mo14876n(e);
            }
        } catch (Exception e2) {
            this.f14765g.f14763c.mo14876n(e2);
        }
    }
}
