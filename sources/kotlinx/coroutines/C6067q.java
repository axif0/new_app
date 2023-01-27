package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.q */
public final class C6067q {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f17027a;

    static {
        Iterator a = C0000a.m0a();
        C5956g.m24497b(a, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        f17027a = C5990h.m24554d(C5987f.m24551a(a));
    }

    /* renamed from: a */
    public static final void m24776a(C5899f fVar, Throwable th) {
        C5956g.m24501f(fVar, "context");
        C5956g.m24501f(th, "exception");
        for (CoroutineExceptionHandler handleException : f17027a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                C5956g.m24497b(currentThread, "currentThread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C6069r.m24781b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        C5956g.m24497b(currentThread2, "currentThread");
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
