package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.n */
final class C4949n<TResult, TContinuationResult> implements C4931b, C4935d, C4937e<TContinuationResult>, C4961z<TResult> {

    /* renamed from: a */
    private final Executor f14766a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4929a<TResult, C4940h<TContinuationResult>> f14767b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4934c0<TContinuationResult> f14768c;

    public C4949n(Executor executor, C4929a<TResult, C4940h<TContinuationResult>> aVar, C4934c0<TContinuationResult> c0Var) {
        this.f14766a = executor;
        this.f14767b = aVar;
        this.f14768c = c0Var;
    }

    /* renamed from: a */
    public final void mo14891a(C4940h<TResult> hVar) {
        this.f14766a.execute(new C4950o(this, hVar));
    }

    /* renamed from: b */
    public final void mo9585b(TContinuationResult tcontinuationresult) {
        this.f14768c.mo14877o(tcontinuationresult);
    }

    /* renamed from: c */
    public final void mo14881c(Exception exc) {
        this.f14768c.mo14876n(exc);
    }

    /* renamed from: d */
    public final void mo14861d() {
        this.f14768c.mo14880r();
    }
}
