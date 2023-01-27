package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
final class C1976v6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f6467f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f6468g;

    C1976v6(C1856l6 l6Var, long j) {
        this.f6468g = l6Var;
        this.f6467f = j;
    }

    public final void run() {
        this.f6468g.mo7184F(this.f6467f, true);
        this.f6468g.mo6857r().mo6788R(new AtomicReference());
    }
}
