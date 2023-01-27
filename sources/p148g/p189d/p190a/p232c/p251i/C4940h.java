package p148g.p189d.p190a.p232c.p251i;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.c.i.h */
public abstract class C4940h<TResult> {
    /* renamed from: a */
    public C4940h<TResult> mo14863a(Executor executor, C4931b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public C4940h<TResult> mo14864b(Executor executor, C4933c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public abstract C4940h<TResult> mo14865c(Executor executor, C4935d dVar);

    /* renamed from: d */
    public abstract C4940h<TResult> mo14866d(Executor executor, C4937e<? super TResult> eVar);

    /* renamed from: e */
    public <TContinuationResult> C4940h<TContinuationResult> mo14867e(Executor executor, C4929a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: f */
    public <TContinuationResult> C4940h<TContinuationResult> mo14868f(Executor executor, C4929a<TResult, C4940h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: g */
    public abstract Exception mo14869g();

    /* renamed from: h */
    public abstract TResult mo14870h();

    /* renamed from: i */
    public abstract <X extends Throwable> TResult mo14871i(Class<X> cls) throws Throwable;

    /* renamed from: j */
    public abstract boolean mo14872j();

    /* renamed from: k */
    public abstract boolean mo14873k();

    /* renamed from: l */
    public abstract boolean mo14874l();

    /* renamed from: m */
    public <TContinuationResult> C4940h<TContinuationResult> mo14875m(Executor executor, C4939g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
