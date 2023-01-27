package kotlinx.coroutines;

import p351k.C5859q;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.k0 */
final class C6054k0 extends C5998c {

    /* renamed from: f */
    private final C5937l<Throwable, C5859q> f17018f;

    public C6054k0(C5937l<? super Throwable, C5859q> lVar) {
        C5956g.m24501f(lVar, "handler");
        this.f17018f = lVar;
    }

    /* renamed from: a */
    public void mo17099a(Throwable th) {
        this.f17018f.mo16990c(th);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Object mo16990c(Object obj) {
        mo17099a((Throwable) obj);
        return C5859q.f16886a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C6082w.m24816a(this.f17018f) + '@' + C6082w.m24817b(this) + ']';
    }
}
