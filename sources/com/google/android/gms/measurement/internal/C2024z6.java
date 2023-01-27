package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
final class C2024z6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6569f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f6570g;

    C2024z6(C1856l6 l6Var, AtomicReference atomicReference) {
        this.f6570g = l6Var;
        this.f6569f = atomicReference;
    }

    public final void run() {
        synchronized (this.f6569f) {
            try {
                this.f6569f.set(this.f6570g.mo6712l().mo7407N(this.f6570g.mo6856q().mo7370C()));
                this.f6569f.notify();
            } catch (Throwable th) {
                this.f6569f.notify();
                throw th;
            }
        }
    }
}
