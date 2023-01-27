package p148g.p189d.p190a.p271e.p272a.p280g;

import java.util.concurrent.Executor;
import p148g.p189d.p190a.p271e.p272a.p276c.C5124r;

/* renamed from: g.d.a.e.a.g.t */
final class C5167t<ResultT> extends C5152e<ResultT> {

    /* renamed from: a */
    private final Object f15196a = new Object();

    /* renamed from: b */
    private final C5162o<ResultT> f15197b = new C5162o<>();

    /* renamed from: c */
    private boolean f15198c;

    /* renamed from: d */
    private ResultT f15199d;

    /* renamed from: e */
    private Exception f15200e;

    C5167t() {
    }

    /* renamed from: j */
    private final void m21634j() {
        C5124r.m21533c(this.f15198c, "Task is not yet complete");
    }

    /* renamed from: m */
    private final void m21635m() {
        C5124r.m21533c(!this.f15198c, "Task is already complete");
    }

    /* renamed from: p */
    private final void m21636p() {
        synchronized (this.f15196a) {
            if (this.f15198c) {
                this.f15197b.mo15259a(this);
            }
        }
    }

    /* renamed from: a */
    public final C5152e<ResultT> mo15246a(C5148a<ResultT> aVar) {
        this.f15197b.mo15260b(new C5156i(C5153f.f15174a, aVar));
        m21636p();
        return this;
    }

    /* renamed from: b */
    public final C5152e<ResultT> mo15247b(C5149b bVar) {
        mo15248c(C5153f.f15174a, bVar);
        return this;
    }

    /* renamed from: c */
    public final C5152e<ResultT> mo15248c(Executor executor, C5149b bVar) {
        this.f15197b.mo15260b(new C5158k(executor, bVar));
        m21636p();
        return this;
    }

    /* renamed from: d */
    public final C5152e<ResultT> mo15249d(C5150c<? super ResultT> cVar) {
        mo15250e(C5153f.f15174a, cVar);
        return this;
    }

    /* renamed from: e */
    public final C5152e<ResultT> mo15250e(Executor executor, C5150c<? super ResultT> cVar) {
        this.f15197b.mo15260b(new C5160m(executor, cVar));
        m21636p();
        return this;
    }

    /* renamed from: f */
    public final Exception mo15251f() {
        Exception exc;
        synchronized (this.f15196a) {
            exc = this.f15200e;
        }
        return exc;
    }

    /* renamed from: g */
    public final ResultT mo15252g() {
        ResultT resultt;
        synchronized (this.f15196a) {
            m21634j();
            Exception exc = this.f15200e;
            if (exc == null) {
                resultt = this.f15199d;
            } else {
                throw new C5151d(exc);
            }
        }
        return resultt;
    }

    /* renamed from: h */
    public final boolean mo15253h() {
        boolean z;
        synchronized (this.f15196a) {
            z = this.f15198c;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo15254i() {
        boolean z;
        synchronized (this.f15196a) {
            z = false;
            if (this.f15198c && this.f15200e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public final void mo15268k(Exception exc) {
        synchronized (this.f15196a) {
            m21635m();
            this.f15198c = true;
            this.f15200e = exc;
        }
        this.f15197b.mo15259a(this);
    }

    /* renamed from: l */
    public final void mo15269l(ResultT resultt) {
        synchronized (this.f15196a) {
            m21635m();
            this.f15198c = true;
            this.f15199d = resultt;
        }
        this.f15197b.mo15259a(this);
    }

    /* renamed from: n */
    public final boolean mo15270n(Exception exc) {
        synchronized (this.f15196a) {
            if (this.f15198c) {
                return false;
            }
            this.f15198c = true;
            this.f15200e = exc;
            this.f15197b.mo15259a(this);
            return true;
        }
    }

    /* renamed from: o */
    public final boolean mo15271o(ResultT resultt) {
        synchronized (this.f15196a) {
            if (this.f15198c) {
                return false;
            }
            this.f15198c = true;
            this.f15199d = resultt;
            this.f15197b.mo15259a(this);
            return true;
        }
    }
}
