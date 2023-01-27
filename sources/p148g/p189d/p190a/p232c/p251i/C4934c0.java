package p148g.p189d.p190a.p232c.p251i;

import com.google.android.gms.common.internal.C1658o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.c0 */
final class C4934c0<TResult> extends C4940h<TResult> {

    /* renamed from: a */
    private final Object f14749a = new Object();

    /* renamed from: b */
    private final C4930a0<TResult> f14750b = new C4930a0<>();

    /* renamed from: c */
    private boolean f14751c;

    /* renamed from: d */
    private volatile boolean f14752d;

    /* renamed from: e */
    private TResult f14753e;

    /* renamed from: f */
    private Exception f14754f;

    C4934c0() {
    }

    /* renamed from: s */
    private final void m20902s() {
        C1658o.m7849n(this.f14751c, "Task is not yet complete");
    }

    /* renamed from: t */
    private final void m20903t() {
        C1658o.m7849n(!this.f14751c, "Task is already complete");
    }

    /* renamed from: u */
    private final void m20904u() {
        if (this.f14752d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: v */
    private final void m20905v() {
        synchronized (this.f14749a) {
            if (this.f14751c) {
                this.f14750b.mo14859a(this);
            }
        }
    }

    /* renamed from: a */
    public final C4940h<TResult> mo14863a(Executor executor, C4931b bVar) {
        this.f14750b.mo14860b(new C4951p(executor, bVar));
        m20905v();
        return this;
    }

    /* renamed from: b */
    public final C4940h<TResult> mo14864b(Executor executor, C4933c<TResult> cVar) {
        this.f14750b.mo14860b(new C4953r(executor, cVar));
        m20905v();
        return this;
    }

    /* renamed from: c */
    public final C4940h<TResult> mo14865c(Executor executor, C4935d dVar) {
        this.f14750b.mo14860b(new C4955t(executor, dVar));
        m20905v();
        return this;
    }

    /* renamed from: d */
    public final C4940h<TResult> mo14866d(Executor executor, C4937e<? super TResult> eVar) {
        this.f14750b.mo14860b(new C4957v(executor, eVar));
        m20905v();
        return this;
    }

    /* renamed from: e */
    public final <TContinuationResult> C4940h<TContinuationResult> mo14867e(Executor executor, C4929a<TResult, TContinuationResult> aVar) {
        C4934c0 c0Var = new C4934c0();
        this.f14750b.mo14860b(new C4947l(executor, aVar, c0Var));
        m20905v();
        return c0Var;
    }

    /* renamed from: f */
    public final <TContinuationResult> C4940h<TContinuationResult> mo14868f(Executor executor, C4929a<TResult, C4940h<TContinuationResult>> aVar) {
        C4934c0 c0Var = new C4934c0();
        this.f14750b.mo14860b(new C4949n(executor, aVar, c0Var));
        m20905v();
        return c0Var;
    }

    /* renamed from: g */
    public final Exception mo14869g() {
        Exception exc;
        synchronized (this.f14749a) {
            exc = this.f14754f;
        }
        return exc;
    }

    /* renamed from: h */
    public final TResult mo14870h() {
        TResult tresult;
        synchronized (this.f14749a) {
            m20902s();
            m20904u();
            if (this.f14754f == null) {
                tresult = this.f14753e;
            } else {
                throw new C4938f(this.f14754f);
            }
        }
        return tresult;
    }

    /* renamed from: i */
    public final <X extends Throwable> TResult mo14871i(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f14749a) {
            m20902s();
            m20904u();
            if (cls.isInstance(this.f14754f)) {
                throw ((Throwable) cls.cast(this.f14754f));
            } else if (this.f14754f == null) {
                tresult = this.f14753e;
            } else {
                throw new C4938f(this.f14754f);
            }
        }
        return tresult;
    }

    /* renamed from: j */
    public final boolean mo14872j() {
        return this.f14752d;
    }

    /* renamed from: k */
    public final boolean mo14873k() {
        boolean z;
        synchronized (this.f14749a) {
            z = this.f14751c;
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo14874l() {
        boolean z;
        synchronized (this.f14749a) {
            z = this.f14751c && !this.f14752d && this.f14754f == null;
        }
        return z;
    }

    /* renamed from: m */
    public final <TContinuationResult> C4940h<TContinuationResult> mo14875m(Executor executor, C4939g<TResult, TContinuationResult> gVar) {
        C4934c0 c0Var = new C4934c0();
        this.f14750b.mo14860b(new C4959x(executor, gVar, c0Var));
        m20905v();
        return c0Var;
    }

    /* renamed from: n */
    public final void mo14876n(Exception exc) {
        C1658o.m7846k(exc, "Exception must not be null");
        synchronized (this.f14749a) {
            m20903t();
            this.f14751c = true;
            this.f14754f = exc;
        }
        this.f14750b.mo14859a(this);
    }

    /* renamed from: o */
    public final void mo14877o(TResult tresult) {
        synchronized (this.f14749a) {
            m20903t();
            this.f14751c = true;
            this.f14753e = tresult;
        }
        this.f14750b.mo14859a(this);
    }

    /* renamed from: p */
    public final boolean mo14878p(Exception exc) {
        C1658o.m7846k(exc, "Exception must not be null");
        synchronized (this.f14749a) {
            if (this.f14751c) {
                return false;
            }
            this.f14751c = true;
            this.f14754f = exc;
            this.f14750b.mo14859a(this);
            return true;
        }
    }

    /* renamed from: q */
    public final boolean mo14879q(TResult tresult) {
        synchronized (this.f14749a) {
            if (this.f14751c) {
                return false;
            }
            this.f14751c = true;
            this.f14753e = tresult;
            this.f14750b.mo14859a(this);
            return true;
        }
    }

    /* renamed from: r */
    public final boolean mo14880r() {
        synchronized (this.f14749a) {
            if (this.f14751c) {
                return false;
            }
            this.f14751c = true;
            this.f14752d = true;
            this.f14750b.mo14859a(this);
            return true;
        }
    }
}
