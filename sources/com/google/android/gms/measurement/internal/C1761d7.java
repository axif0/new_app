package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
final class C1761d7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f5732f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f5733g;

    C1761d7(C1856l6 l6Var, AtomicReference atomicReference) {
        this.f5733g = l6Var;
        this.f5732f = atomicReference;
    }

    public final void run() {
        synchronized (this.f5732f) {
            try {
                this.f5732f.set(Long.valueOf(this.f5733g.mo6712l().mo7412p(this.f5733g.mo6856q().mo7370C(), C1957u.f6331M)));
                this.f5732f.notify();
            } catch (Throwable th) {
                this.f5732f.notify();
                throw th;
            }
        }
    }
}
