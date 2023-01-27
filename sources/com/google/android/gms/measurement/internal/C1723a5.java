package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
public final class C1723a5 extends C1760d6 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f5624l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1759d5 f5625c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1759d5 f5626d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C1771e5<?>> f5627e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    private final BlockingQueue<C1771e5<?>> f5628f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f5629g = new C1747c5(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f5630h = new C1747c5(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f5631i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f5632j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f5633k;

    C1723a5(C1807h5 h5Var) {
        super(h5Var);
    }

    /* renamed from: x */
    private final void m8079x(C1771e5<?> e5Var) {
        synchronized (this.f5631i) {
            this.f5627e.add(e5Var);
            if (this.f5625c == null) {
                C1759d5 d5Var = new C1759d5(this, "Measurement Worker", this.f5627e);
                this.f5625c = d5Var;
                d5Var.setUncaughtExceptionHandler(this.f5629g);
                this.f5625c.start();
            } else {
                this.f5625c.mo6861a();
            }
        }
    }

    /* renamed from: A */
    public final <V> Future<V> mo6695A(Callable<V> callable) throws IllegalStateException {
        mo6864o();
        C1658o.m7845j(callable);
        C1771e5 e5Var = new C1771e5(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f5625c) {
            e5Var.run();
        } else {
            m8079x(e5Var);
        }
        return e5Var;
    }

    /* renamed from: B */
    public final void mo6696B(Runnable runnable) throws IllegalStateException {
        mo6864o();
        C1658o.m7845j(runnable);
        m8079x(new C1771e5(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: E */
    public final void mo6697E(Runnable runnable) throws IllegalStateException {
        mo6864o();
        C1658o.m7845j(runnable);
        C1771e5 e5Var = new C1771e5(this, runnable, false, "Task exception on network thread");
        synchronized (this.f5631i) {
            this.f5628f.add(e5Var);
            if (this.f5626d == null) {
                C1759d5 d5Var = new C1759d5(this, "Measurement Network", this.f5628f);
                this.f5626d = d5Var;
                d5Var.setUncaughtExceptionHandler(this.f5630h);
                this.f5626d.start();
            } else {
                this.f5626d.mo6861a();
            }
        }
    }

    /* renamed from: H */
    public final boolean mo6698H() {
        return Thread.currentThread() == this.f5625c;
    }

    /* renamed from: a */
    public final void mo6699a() {
        if (Thread.currentThread() != this.f5626d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: b */
    public final void mo6700b() {
        if (Thread.currentThread() != this.f5625c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo6689r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.mo6885a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = mo6709i().mo6767H();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5.length() != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r3.mo6885a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = mo6709i().mo6767H();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo6701u(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.a5 r0 = r1.mo6706e()     // Catch:{ all -> 0x005a }
            r0.mo6703y(r6)     // Catch:{ all -> 0x005a }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.c4 r3 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6767H()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.mo6885a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            com.google.android.gms.measurement.internal.c4 r3 = r1.mo6709i()     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6767H()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "Interrupted waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005a }
            int r6 = r5.length()     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004e
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0054
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x005a }
            r5.<init>(r4)     // Catch:{ all -> 0x005a }
            r4 = r5
        L_0x0054:
            r3.mo6885a(r4)     // Catch:{ all -> 0x005a }
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            return r3
        L_0x005a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1723a5.mo6701u(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: v */
    public final <V> Future<V> mo6702v(Callable<V> callable) throws IllegalStateException {
        mo6864o();
        C1658o.m7845j(callable);
        C1771e5 e5Var = new C1771e5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f5625c) {
            if (!this.f5627e.isEmpty()) {
                mo6709i().mo6767H().mo6885a("Callable skipped the worker queue.");
            }
            e5Var.run();
        } else {
            m8079x(e5Var);
        }
        return e5Var;
    }

    /* renamed from: y */
    public final void mo6703y(Runnable runnable) throws IllegalStateException {
        mo6864o();
        C1658o.m7845j(runnable);
        m8079x(new C1771e5(this, runnable, false, "Task exception on worker thread"));
    }
}
