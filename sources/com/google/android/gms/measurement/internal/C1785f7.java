package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
final class C1785f7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f5818f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f5819g;

    C1785f7(C1856l6 l6Var, AtomicReference atomicReference) {
        this.f5819g = l6Var;
        this.f5818f = atomicReference;
    }

    public final void run() {
        synchronized (this.f5818f) {
            try {
                this.f5818f.set(Double.valueOf(this.f5819g.mo6712l().mo7418v(this.f5819g.mo6856q().mo7370C(), C1957u.f6335O)));
                this.f5818f.notify();
            } catch (Throwable th) {
                this.f5818f.notify();
                throw th;
            }
        }
    }
}
