package p148g.p189d.p190a.p232c.p251i;

import com.google.android.gms.common.internal.C1658o;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: g.d.a.c.i.k */
public final class C4944k {

    /* renamed from: g.d.a.c.i.k$a */
    private static final class C4945a implements C4946b {

        /* renamed from: a */
        private final CountDownLatch f14760a;

        private C4945a() {
            this.f14760a = new CountDownLatch(1);
        }

        /* synthetic */ C4945a(C4936d0 d0Var) {
            this();
        }

        /* renamed from: a */
        public final void mo14889a() throws InterruptedException {
            this.f14760a.await();
        }

        /* renamed from: b */
        public final void mo9585b(Object obj) {
            this.f14760a.countDown();
        }

        /* renamed from: c */
        public final void mo14881c(Exception exc) {
            this.f14760a.countDown();
        }

        /* renamed from: d */
        public final void mo14861d() {
            this.f14760a.countDown();
        }

        /* renamed from: e */
        public final boolean mo14890e(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f14760a.await(j, timeUnit);
        }
    }

    /* renamed from: g.d.a.c.i.k$b */
    interface C4946b extends C4931b, C4935d, C4937e<Object> {
    }

    /* renamed from: a */
    public static <TResult> TResult m20945a(C4940h<TResult> hVar) throws ExecutionException, InterruptedException {
        C1658o.m7843h();
        C1658o.m7846k(hVar, "Task must not be null");
        if (hVar.mo14873k()) {
            return m20951g(hVar);
        }
        C4945a aVar = new C4945a((C4936d0) null);
        m20950f(hVar, aVar);
        aVar.mo14889a();
        return m20951g(hVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m20946b(C4940h<TResult> hVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C1658o.m7843h();
        C1658o.m7846k(hVar, "Task must not be null");
        C1658o.m7846k(timeUnit, "TimeUnit must not be null");
        if (hVar.mo14873k()) {
            return m20951g(hVar);
        }
        C4945a aVar = new C4945a((C4936d0) null);
        m20950f(hVar, aVar);
        if (aVar.mo14890e(j, timeUnit)) {
            return m20951g(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: c */
    public static <TResult> C4940h<TResult> m20947c(Executor executor, Callable<TResult> callable) {
        C1658o.m7846k(executor, "Executor must not be null");
        C1658o.m7846k(callable, "Callback must not be null");
        C4934c0 c0Var = new C4934c0();
        executor.execute(new C4936d0(c0Var, callable));
        return c0Var;
    }

    /* renamed from: d */
    public static <TResult> C4940h<TResult> m20948d(Exception exc) {
        C4934c0 c0Var = new C4934c0();
        c0Var.mo14876n(exc);
        return c0Var;
    }

    /* renamed from: e */
    public static <TResult> C4940h<TResult> m20949e(TResult tresult) {
        C4934c0 c0Var = new C4934c0();
        c0Var.mo14877o(tresult);
        return c0Var;
    }

    /* renamed from: f */
    private static void m20950f(C4940h<?> hVar, C4946b bVar) {
        hVar.mo14866d(C4942j.f14758a, bVar);
        hVar.mo14865c(C4942j.f14758a, bVar);
        hVar.mo14863a(C4942j.f14758a, bVar);
    }

    /* renamed from: g */
    private static <TResult> TResult m20951g(C4940h<TResult> hVar) throws ExecutionException {
        if (hVar.mo14874l()) {
            return hVar.mo14870h();
        }
        if (hVar.mo14872j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.mo14869g());
    }
}
