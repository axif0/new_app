package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
final class C1759d5 extends Thread {

    /* renamed from: f */
    private final Object f5727f;

    /* renamed from: g */
    private final BlockingQueue<C1771e5<?>> f5728g;

    /* renamed from: h */
    private boolean f5729h = false;

    /* renamed from: i */
    private final /* synthetic */ C1723a5 f5730i;

    public C1759d5(C1723a5 a5Var, String str, BlockingQueue<C1771e5<?>> blockingQueue) {
        this.f5730i = a5Var;
        C1658o.m7845j(str);
        C1658o.m7845j(blockingQueue);
        this.f5727f = new Object();
        this.f5728g = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m8324b(InterruptedException interruptedException) {
        this.f5730i.mo6709i().mo6767H().mo6886b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: c */
    private final void m8325c() {
        synchronized (this.f5730i.f5631i) {
            if (!this.f5729h) {
                this.f5730i.f5632j.release();
                this.f5730i.f5631i.notifyAll();
                if (this == this.f5730i.f5625c) {
                    C1759d5 unused = this.f5730i.f5625c = null;
                } else if (this == this.f5730i.f5626d) {
                    C1759d5 unused2 = this.f5730i.f5626d = null;
                } else {
                    this.f5730i.mo6709i().mo6764E().mo6885a("Current scheduler thread is neither worker nor network");
                }
                this.f5729h = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo6861a() {
        synchronized (this.f5727f) {
            this.f5727f.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        m8325c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.a5 r1 = r5.f5730i     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f5632j     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r5.m8324b(r1)
            goto L_0x0001
        L_0x0013:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0081 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0081 }
        L_0x001b:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.e5<?>> r1 = r5.f5728g     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0081 }
            com.google.android.gms.measurement.internal.e5 r1 = (com.google.android.gms.measurement.internal.C1771e5) r1     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.f5754g     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x002b
            r2 = r0
            goto L_0x002d
        L_0x002b:
            r2 = 10
        L_0x002d:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x0081 }
            r1.run()     // Catch:{ all -> 0x0081 }
            goto L_0x001b
        L_0x0034:
            java.lang.Object r1 = r5.f5727f     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.e5<?>> r2 = r5.f5728g     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            com.google.android.gms.measurement.internal.a5 r2 = r5.f5730i     // Catch:{ all -> 0x007e }
            boolean r2 = r2.f5633k     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            java.lang.Object r2 = r5.f5727f     // Catch:{ InterruptedException -> 0x004f }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r5.m8324b(r2)     // Catch:{ all -> 0x007e }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.a5 r1 = r5.f5730i     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.f5631i     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.e5<?>> r2 = r5.f5728g     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0079
            com.google.android.gms.measurement.internal.a5 r0 = r5.f5730i     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.wa r0 = r0.mo6712l()     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6393t0     // Catch:{ all -> 0x007b }
            boolean r0 = r0.mo7415s(r2)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            r5.m8325c()     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r5.m8325c()
            return
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x001b
        L_0x007b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r5.m8325c()
            goto L_0x0087
        L_0x0086:
            throw r0
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1759d5.run():void");
    }
}
