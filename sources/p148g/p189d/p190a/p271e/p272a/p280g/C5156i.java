package p148g.p189d.p190a.p271e.p272a.p280g;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.e.a.g.i */
final class C5156i<ResultT> implements C5161n<ResultT> {

    /* renamed from: a */
    private final Executor f15178a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15179b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5148a<ResultT> f15180c;

    public C5156i(Executor executor, C5148a<ResultT> aVar) {
        this.f15178a = executor;
        this.f15180c = aVar;
    }

    /* renamed from: a */
    public final void mo15256a(C5152e<ResultT> eVar) {
        synchronized (this.f15179b) {
            if (this.f15180c != null) {
                this.f15178a.execute(new C5155h(this, eVar));
            }
        }
    }
}
