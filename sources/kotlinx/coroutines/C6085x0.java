package kotlinx.coroutines;

import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.x0 */
public interface C6085x0<S> extends C5899f.C5902b {

    /* renamed from: kotlinx.coroutines.x0$a */
    public static final class C6086a {
        /* renamed from: a */
        public static <S, R> R m24830a(C6085x0<S> x0Var, R r, C5941p<? super R, ? super C5899f.C5902b, ? extends R> pVar) {
            C5956g.m24501f(pVar, "operation");
            return C5899f.C5902b.C5903a.m24440a(x0Var, r, pVar);
        }

        /* renamed from: b */
        public static <S, E extends C5899f.C5902b> E m24831b(C6085x0<S> x0Var, C5899f.C5904c<E> cVar) {
            C5956g.m24501f(cVar, "key");
            return C5899f.C5902b.C5903a.m24441b(x0Var, cVar);
        }

        /* renamed from: c */
        public static <S> C5899f m24832c(C6085x0<S> x0Var, C5899f.C5904c<?> cVar) {
            C5956g.m24501f(cVar, "key");
            return C5899f.C5902b.C5903a.m24442c(x0Var, cVar);
        }

        /* renamed from: d */
        public static <S> C5899f m24833d(C6085x0<S> x0Var, C5899f fVar) {
            C5956g.m24501f(fVar, "context");
            return C5899f.C5902b.C5903a.m24443d(x0Var, fVar);
        }
    }

    /* renamed from: c */
    void mo17163c(C5899f fVar, S s);

    /* renamed from: g */
    S mo17165g(C5899f fVar);
}
