package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.CancellationException;

/* renamed from: g.d.a.c.i.y */
final class C4960y implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4940h f14793f;

    /* renamed from: g */
    private final /* synthetic */ C4959x f14794g;

    C4960y(C4959x xVar, C4940h hVar) {
        this.f14794g = xVar;
        this.f14793f = hVar;
    }

    public final void run() {
        try {
            C4940h a = this.f14794g.f14791b.mo9457a(this.f14793f.mo14870h());
            if (a == null) {
                this.f14794g.mo14881c(new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo14866d(C4942j.f14758a, this.f14794g);
            a.mo14865c(C4942j.f14758a, this.f14794g);
            a.mo14863a(C4942j.f14758a, this.f14794g);
        } catch (C4938f e) {
            if (e.getCause() instanceof Exception) {
                this.f14794g.mo14881c((Exception) e.getCause());
            } else {
                this.f14794g.mo14881c(e);
            }
        } catch (CancellationException unused) {
            this.f14794g.mo14861d();
        } catch (Exception e2) {
            this.f14794g.mo14881c(e2);
        }
    }
}
