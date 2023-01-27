package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: g.d.a.c.f.f.n */
final class C4683n implements ThreadFactory {

    /* renamed from: a */
    private ThreadFactory f14301a = Executors.defaultThreadFactory();

    C4683n(C4552g gVar) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f14301a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
