package p148g.p189d.p190a.p271e.p272a.p280g;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.e.a.g.m */
final class C5160m<ResultT> implements C5161n<ResultT> {

    /* renamed from: a */
    private final Executor f15188a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15189b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5150c<? super ResultT> f15190c;

    public C5160m(Executor executor, C5150c<? super ResultT> cVar) {
        this.f15188a = executor;
        this.f15190c = cVar;
    }

    /* renamed from: a */
    public final void mo15256a(C5152e<ResultT> eVar) {
        if (eVar.mo15254i()) {
            synchronized (this.f15189b) {
                if (this.f15190c != null) {
                    this.f15188a.execute(new C5159l(this, eVar));
                }
            }
        }
    }
}
