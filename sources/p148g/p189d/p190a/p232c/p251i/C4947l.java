package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.l */
final class C4947l<TResult, TContinuationResult> implements C4961z<TResult> {

    /* renamed from: a */
    private final Executor f14761a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4929a<TResult, TContinuationResult> f14762b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4934c0<TContinuationResult> f14763c;

    public C4947l(Executor executor, C4929a<TResult, TContinuationResult> aVar, C4934c0<TContinuationResult> c0Var) {
        this.f14761a = executor;
        this.f14762b = aVar;
        this.f14763c = c0Var;
    }

    /* renamed from: a */
    public final void mo14891a(C4940h<TResult> hVar) {
        this.f14761a.execute(new C4948m(this, hVar));
    }
}
