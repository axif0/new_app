package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
final class C1977v7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1965u7 f6469f;

    /* renamed from: g */
    private final /* synthetic */ C1965u7 f6470g;

    /* renamed from: h */
    private final /* synthetic */ long f6471h;

    /* renamed from: i */
    private final /* synthetic */ boolean f6472i;

    /* renamed from: j */
    private final /* synthetic */ C1953t7 f6473j;

    C1977v7(C1953t7 t7Var, C1965u7 u7Var, C1965u7 u7Var2, long j, boolean z) {
        this.f6473j = t7Var;
        this.f6469f = u7Var;
        this.f6470g = u7Var2;
        this.f6471h = j;
        this.f6472i = z;
    }

    public final void run() {
        this.f6473j.m8859P(this.f6469f, this.f6470g, this.f6471h, this.f6472i, (Bundle) null);
    }
}
