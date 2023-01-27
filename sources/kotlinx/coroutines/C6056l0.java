package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p351k.C5859q;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.l0 */
final class C6056l0 extends C6066p0<C6060n0> {

    /* renamed from: k */
    private static final AtomicIntegerFieldUpdater f17021k = AtomicIntegerFieldUpdater.newUpdater(C6056l0.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: j */
    private final C5937l<Throwable, C5859q> f17022j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6056l0(C6060n0 n0Var, C5937l<? super Throwable, C5859q> lVar) {
        super(n0Var);
        C5956g.m24501f(n0Var, "job");
        C5956g.m24501f(lVar, "handler");
        this.f17022j = lVar;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Object mo16990c(Object obj) {
        mo17138t((Throwable) obj);
        return C5859q.f16886a;
    }

    /* renamed from: t */
    public void mo17138t(Throwable th) {
        if (f17021k.compareAndSet(this, 0, 1)) {
            this.f17022j.mo16990c(th);
        }
    }

    public String toString() {
        return "InvokeOnCancelling[" + C6082w.m24816a(this) + '@' + C6082w.m24817b(this) + ']';
    }
}
