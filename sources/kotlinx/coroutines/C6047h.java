package kotlinx.coroutines;

import p351k.C5859q;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.h */
public final class C6047h extends C6066p0<C6060n0> {

    /* renamed from: j */
    public final C6043f<?> f17011j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6047h(C6060n0 n0Var, C6043f<?> fVar) {
        super(n0Var);
        C5956g.m24501f(n0Var, "parent");
        C5956g.m24501f(fVar, "child");
        this.f17011j = fVar;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Object mo16990c(Object obj) {
        mo17131t((Throwable) obj);
        return C5859q.f16886a;
    }

    /* renamed from: t */
    public void mo17131t(Throwable th) {
        C6043f<?> fVar = this.f17011j;
        fVar.mo17121m(fVar.mo17122p(this.f17028i));
    }

    public String toString() {
        return "ChildContinuation[" + this.f17011j + ']';
    }
}
