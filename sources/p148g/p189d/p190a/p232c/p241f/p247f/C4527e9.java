package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g.d.a.c.f.f.e9 */
final class C4527e9 implements C4526e8 {
    private C4527e9() {
    }

    /* renamed from: b */
    private static ExecutorService m19311b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: a */
    public final ExecutorService mo14088a(ThreadFactory threadFactory, int i) {
        return m19311b(1, threadFactory, i);
    }
}
