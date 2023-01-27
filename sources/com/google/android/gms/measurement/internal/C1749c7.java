package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
final class C1749c7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f5700f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f5701g;

    C1749c7(C1856l6 l6Var, AtomicReference atomicReference) {
        this.f5701g = l6Var;
        this.f5700f = atomicReference;
    }

    public final void run() {
        synchronized (this.f5700f) {
            try {
                this.f5700f.set(Integer.valueOf(this.f5701g.mo6712l().mo7417u(this.f5701g.mo6856q().mo7370C(), C1957u.f6333N)));
                this.f5700f.notify();
            } catch (Throwable th) {
                this.f5700f.notify();
                throw th;
            }
        }
    }
}
