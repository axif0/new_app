package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
final class C1989w7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Bundle f6489f;

    /* renamed from: g */
    private final /* synthetic */ C1965u7 f6490g;

    /* renamed from: h */
    private final /* synthetic */ C1965u7 f6491h;

    /* renamed from: i */
    private final /* synthetic */ long f6492i;

    /* renamed from: j */
    private final /* synthetic */ C1953t7 f6493j;

    C1989w7(C1953t7 t7Var, Bundle bundle, C1965u7 u7Var, C1965u7 u7Var2, long j) {
        this.f6493j = t7Var;
        this.f6489f = bundle;
        this.f6490g = u7Var;
        this.f6491h = u7Var2;
        this.f6492i = j;
    }

    public final void run() {
        this.f6493j.m8854K(this.f6489f, this.f6490g, this.f6491h, this.f6492i);
    }
}
