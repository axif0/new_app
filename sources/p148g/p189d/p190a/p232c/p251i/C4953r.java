package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.r */
final class C4953r<TResult> implements C4961z<TResult> {

    /* renamed from: a */
    private final Executor f14775a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f14776b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4933c<TResult> f14777c;

    public C4953r(Executor executor, C4933c<TResult> cVar) {
        this.f14775a = executor;
        this.f14777c = cVar;
    }

    /* renamed from: a */
    public final void mo14891a(C4940h<TResult> hVar) {
        synchronized (this.f14776b) {
            if (this.f14777c != null) {
                this.f14775a.execute(new C4954s(this, hVar));
            }
        }
    }
}
