package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.v */
final class C4957v<TResult> implements C4961z<TResult> {

    /* renamed from: a */
    private final Executor f14785a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f14786b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4937e<? super TResult> f14787c;

    public C4957v(Executor executor, C4937e<? super TResult> eVar) {
        this.f14785a = executor;
        this.f14787c = eVar;
    }

    /* renamed from: a */
    public final void mo14891a(C4940h<TResult> hVar) {
        if (hVar.mo14874l()) {
            synchronized (this.f14786b) {
                if (this.f14787c != null) {
                    this.f14785a.execute(new C4958w(this, hVar));
                }
            }
        }
    }
}
