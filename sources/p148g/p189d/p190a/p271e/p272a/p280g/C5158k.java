package p148g.p189d.p190a.p271e.p272a.p280g;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.e.a.g.k */
final class C5158k<ResultT> implements C5161n<ResultT> {

    /* renamed from: a */
    private final Executor f15183a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15184b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5149b f15185c;

    public C5158k(Executor executor, C5149b bVar) {
        this.f15183a = executor;
        this.f15185c = bVar;
    }

    /* renamed from: a */
    public final void mo15256a(C5152e<ResultT> eVar) {
        if (!eVar.mo15254i()) {
            synchronized (this.f15184b) {
                if (this.f15185c != null) {
                    this.f15183a.execute(new C5157j(this, eVar));
                }
            }
        }
    }
}
