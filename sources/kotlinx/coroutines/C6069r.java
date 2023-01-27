package kotlinx.coroutines;

import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.r */
public final class C6069r {
    /* renamed from: a */
    public static final void m24780a(C5899f fVar, Throwable th) {
        C5956g.m24501f(fVar, "context");
        C5956g.m24501f(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.f16941d);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                C6067q.m24776a(fVar, th);
            }
        } catch (Throwable th2) {
            C6067q.m24776a(fVar, m24781b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m24781b(Throwable th, Throwable th2) {
        C5956g.m24501f(th, "originalException");
        C5956g.m24501f(th2, "thrownException");
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C5842b.m24354a(runtimeException, th);
        return runtimeException;
    }
}
