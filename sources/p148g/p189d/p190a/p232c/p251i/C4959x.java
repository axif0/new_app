package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.x */
final class C4959x<TResult, TContinuationResult> implements C4931b, C4935d, C4937e<TContinuationResult>, C4961z<TResult> {

    /* renamed from: a */
    private final Executor f14790a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4939g<TResult, TContinuationResult> f14791b;

    /* renamed from: c */
    private final C4934c0<TContinuationResult> f14792c;

    public C4959x(Executor executor, C4939g<TResult, TContinuationResult> gVar, C4934c0<TContinuationResult> c0Var) {
        this.f14790a = executor;
        this.f14791b = gVar;
        this.f14792c = c0Var;
    }

    /* renamed from: a */
    public final void mo14891a(C4940h<TResult> hVar) {
        this.f14790a.execute(new C4960y(this, hVar));
    }

    /* renamed from: b */
    public final void mo9585b(TContinuationResult tcontinuationresult) {
        this.f14792c.mo14877o(tcontinuationresult);
    }

    /* renamed from: c */
    public final void mo14881c(Exception exc) {
        this.f14792c.mo14876n(exc);
    }

    /* renamed from: d */
    public final void mo14861d() {
        this.f14792c.mo14880r();
    }
}
