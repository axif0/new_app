package p340io.realm;

import p340io.realm.internal.OsResults;

/* renamed from: io.realm.q0 */
public class C5782q0<E> extends C5818y<E> {
    C5782q0(C5632b bVar, OsResults osResults, Class<E> cls) {
        super(bVar, osResults, cls);
    }

    C5782q0(C5632b bVar, OsResults osResults, String str) {
        super(bVar, osResults, str);
    }

    /* renamed from: m */
    private void m24159m(Object obj) {
        if (obj != null) {
            this.f16855f.mo16228j();
            this.f16855f.f16249i.capabilities.mo16609b("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    /* renamed from: j */
    public void mo16764j(C5669h0<C5782q0<E>> h0Var) {
        m24159m(h0Var);
        this.f16858i.mo16447d(this, h0Var);
    }

    /* renamed from: l */
    public boolean mo16153l() {
        this.f16855f.mo16228j();
        return this.f16858i.mo16453k();
    }

    /* renamed from: o */
    public boolean mo16765o() {
        this.f16855f.mo16228j();
        this.f16858i.mo16455m();
        return true;
    }
}
