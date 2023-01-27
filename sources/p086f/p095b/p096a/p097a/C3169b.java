package p086f.p095b.p096a.p097a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f.b.a.a.b */
public class C3169b extends C3171c {

    /* renamed from: a */
    private final Object f10092a = new Object();

    /* renamed from: b */
    private final ExecutorService f10093b = Executors.newFixedThreadPool(4, new C3170a(this));

    /* renamed from: f.b.a.a.b$a */
    class C3170a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f10094a = new AtomicInteger(0);

        C3170a(C3169b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f10094a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public boolean mo10972a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
