package kotlinx.coroutines;

import p351k.C5859q;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.m0 */
final class C6058m0 extends C6068q0<C6060n0> {

    /* renamed from: j */
    private final C5937l<Throwable, C5859q> f17023j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6058m0(C6060n0 n0Var, C5937l<? super Throwable, C5859q> lVar) {
        super(n0Var);
        C5956g.m24501f(n0Var, "job");
        C5956g.m24501f(lVar, "handler");
        this.f17023j = lVar;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Object mo16990c(Object obj) {
        mo17139t((Throwable) obj);
        return C5859q.f16886a;
    }

    /* renamed from: t */
    public void mo17139t(Throwable th) {
        this.f17023j.mo16990c(th);
    }

    public String toString() {
        return "InvokeOnCompletion[" + C6082w.m24816a(this) + '@' + C6082w.m24817b(this) + ']';
    }
}
