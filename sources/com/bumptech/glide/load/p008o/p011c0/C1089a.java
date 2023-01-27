package com.bumptech.glide.load.p008o.p011c0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.load.o.c0.a */
public final class C1089a implements ExecutorService {

    /* renamed from: b */
    private static final long f4102b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private static volatile int f4103c;

    /* renamed from: a */
    private final ExecutorService f4104a;

    /* renamed from: com.bumptech.glide.load.o.c0.a$a */
    private static final class C1090a implements ThreadFactory {

        /* renamed from: a */
        private final String f4105a;

        /* renamed from: b */
        final C1092b f4106b;

        /* renamed from: c */
        final boolean f4107c;

        /* renamed from: d */
        private int f4108d;

        /* renamed from: com.bumptech.glide.load.o.c0.a$a$a */
        class C1091a extends Thread {
            C1091a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C1090a.this.f4107c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C1090a.this.f4106b.mo5325a(th);
                }
            }
        }

        C1090a(String str, C1092b bVar, boolean z) {
            this.f4105a = str;
            this.f4106b = bVar;
            this.f4107c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C1091a aVar;
            aVar = new C1091a(runnable, "glide-" + this.f4105a + "-thread-" + this.f4108d);
            this.f4108d = this.f4108d + 1;
            return aVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c0.a$b */
    public interface C1092b {

        /* renamed from: a */
        public static final C1092b f4110a = new C1093a();

        /* renamed from: b */
        public static final C1092b f4111b = f4110a;

        /* renamed from: com.bumptech.glide.load.o.c0.a$b$a */
        class C1093a implements C1092b {
            C1093a() {
            }

            /* renamed from: a */
            public void mo5325a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: a */
        void mo5325a(Throwable th);
    }

    C1089a(ExecutorService executorService) {
        this.f4104a = executorService;
    }

    /* renamed from: a */
    public static int m5833a() {
        if (f4103c == 0) {
            f4103c = Math.min(4, C1094b.m5843a());
        }
        return f4103c;
    }

    /* renamed from: b */
    public static C1089a m5834b() {
        return m5835c(m5833a() >= 4 ? 2 : 1, C1092b.f4111b);
    }

    /* renamed from: c */
    public static C1089a m5835c(int i, C1092b bVar) {
        return new C1089a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1090a("animation", bVar, true)));
    }

    /* renamed from: d */
    public static C1089a m5836d() {
        return m5837e(1, "disk-cache", C1092b.f4111b);
    }

    /* renamed from: e */
    public static C1089a m5837e(int i, String str, C1092b bVar) {
        return new C1089a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1090a(str, bVar, true)));
    }

    /* renamed from: f */
    public static C1089a m5838f() {
        return m5839g(m5833a(), "source", C1092b.f4111b);
    }

    /* renamed from: g */
    public static C1089a m5839g(int i, String str, C1092b bVar) {
        return new C1089a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1090a(str, bVar, false)));
    }

    /* renamed from: h */
    public static C1089a m5840h() {
        return new C1089a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f4102b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C1090a("source-unlimited", C1092b.f4111b, false)));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f4104a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f4104a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f4104a.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f4104a.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f4104a.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f4104a.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f4104a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f4104a.isTerminated();
    }

    public void shutdown() {
        this.f4104a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f4104a.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f4104a.submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f4104a.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f4104a.submit(callable);
    }

    public String toString() {
        return this.f4104a.toString();
    }
}
