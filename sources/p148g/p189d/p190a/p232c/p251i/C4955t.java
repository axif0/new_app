package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.t */
final class C4955t<TResult> implements C4961z<TResult> {

    /* renamed from: a */
    private final Executor f14780a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f14781b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4935d f14782c;

    public C4955t(Executor executor, C4935d dVar) {
        this.f14780a = executor;
        this.f14782c = dVar;
    }

    /* renamed from: a */
    public final void mo14891a(C4940h<TResult> hVar) {
        if (!hVar.mo14874l() && !hVar.mo14872j()) {
            synchronized (this.f14781b) {
                if (this.f14782c != null) {
                    this.f14780a.execute(new C4956u(this, hVar));
                }
            }
        }
    }
}
