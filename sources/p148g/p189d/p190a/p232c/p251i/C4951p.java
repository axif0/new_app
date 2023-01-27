package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.p */
final class C4951p<TResult> implements C4961z<TResult> {

    /* renamed from: a */
    private final Executor f14771a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f14772b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4931b f14773c;

    public C4951p(Executor executor, C4931b bVar) {
        this.f14771a = executor;
        this.f14773c = bVar;
    }

    /* renamed from: a */
    public final void mo14891a(C4940h hVar) {
        if (hVar.mo14872j()) {
            synchronized (this.f14772b) {
                if (this.f14773c != null) {
                    this.f14771a.execute(new C4952q(this));
                }
            }
        }
    }
}
