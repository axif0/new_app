package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
final class C1916q6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6192f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f6193g;

    C1916q6(C1856l6 l6Var, AtomicReference atomicReference) {
        this.f6193g = l6Var;
        this.f6192f = atomicReference;
    }

    public final void run() {
        synchronized (this.f6192f) {
            try {
                this.f6192f.set(Boolean.valueOf(this.f6193g.mo6712l().mo7406M(this.f6193g.mo6856q().mo7370C())));
                this.f6192f.notify();
            } catch (Throwable th) {
                this.f6192f.notify();
                throw th;
            }
        }
    }
}
