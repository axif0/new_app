package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p351k.C5859q;
import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.n0 */
public interface C6060n0 extends C5899f.C5902b {

    /* renamed from: e */
    public static final C6062b f17024e = C6062b.f17025a;

    /* renamed from: kotlinx.coroutines.n0$a */
    public static final class C6061a {
        /* renamed from: a */
        public static <R> R m24764a(C6060n0 n0Var, R r, C5941p<? super R, ? super C5899f.C5902b, ? extends R> pVar) {
            C5956g.m24501f(pVar, "operation");
            return C5899f.C5902b.C5903a.m24440a(n0Var, r, pVar);
        }

        /* renamed from: b */
        public static <E extends C5899f.C5902b> E m24765b(C6060n0 n0Var, C5899f.C5904c<E> cVar) {
            C5956g.m24501f(cVar, "key");
            return C5899f.C5902b.C5903a.m24441b(n0Var, cVar);
        }

        /* renamed from: c */
        public static /* synthetic */ C5996b0 m24766c(C6060n0 n0Var, boolean z, boolean z2, C5937l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return n0Var.mo17141e(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: d */
        public static C5899f m24767d(C6060n0 n0Var, C5899f.C5904c<?> cVar) {
            C5956g.m24501f(cVar, "key");
            return C5899f.C5902b.C5903a.m24442c(n0Var, cVar);
        }
    }

    /* renamed from: kotlinx.coroutines.n0$b */
    public static final class C6062b implements C5899f.C5904c<C6060n0> {

        /* renamed from: a */
        static final /* synthetic */ C6062b f17025a = new C6062b();

        static {
            CoroutineExceptionHandler.C5991a aVar = CoroutineExceptionHandler.f16941d;
        }

        private C6062b() {
        }
    }

    /* renamed from: d */
    boolean mo17140d();

    /* renamed from: e */
    C5996b0 mo17141e(boolean z, boolean z2, C5937l<? super Throwable, C5859q> lVar);

    /* renamed from: f */
    CancellationException mo17142f();

    boolean start();
}
