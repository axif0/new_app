package p148g.p189d.p190a.p191a.p192i.p194u;

/* renamed from: g.d.a.a.i.u.b */
public final class C3767b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m15711a(int i, TInput tinput, C3766a<TInput, TResult, TException> aVar, C3768c<TInput, TResult> cVar) throws Throwable {
        TResult a;
        if (i < 1) {
            return aVar.mo6112a(tinput);
        }
        do {
            a = aVar.mo6112a(tinput);
            tinput = cVar.mo6113a(tinput, a);
            if (tinput == null || i - 1 < 1) {
                return a;
            }
            a = aVar.mo6112a(tinput);
            tinput = cVar.mo6113a(tinput, a);
            break;
        } while (i - 1 < 1);
        return a;
    }
}
