package p148g.p189d.p190a.p271e.p272a.p280g;

import java.util.concurrent.ExecutionException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5124r;

/* renamed from: g.d.a.e.a.g.g */
public final class C5154g {
    /* renamed from: a */
    public static <ResultT> C5152e<ResultT> m21612a(Exception exc) {
        C5167t tVar = new C5167t();
        tVar.mo15268k(exc);
        return tVar;
    }

    /* renamed from: b */
    public static <ResultT> C5152e<ResultT> m21613b(ResultT resultt) {
        C5167t tVar = new C5167t();
        tVar.mo15269l(resultt);
        return tVar;
    }

    /* renamed from: c */
    private static <ResultT> ResultT m21614c(C5152e<ResultT> eVar) throws ExecutionException {
        if (eVar.mo15254i()) {
            return eVar.mo15252g();
        }
        throw new ExecutionException(eVar.mo15251f());
    }

    /* renamed from: d */
    private static void m21615d(C5152e<?> eVar, C5168u uVar) {
        eVar.mo15250e(C5153f.f15175b, uVar);
        eVar.mo15248c(C5153f.f15175b, uVar);
    }

    /* renamed from: e */
    public static <ResultT> ResultT m21616e(C5152e<ResultT> eVar) throws ExecutionException, InterruptedException {
        C5124r.m21532b(eVar, "Task must not be null");
        if (eVar.mo15253h()) {
            return m21614c(eVar);
        }
        C5168u uVar = new C5168u((byte[]) null);
        m21615d(eVar, uVar);
        uVar.mo15272a();
        return m21614c(eVar);
    }
}
