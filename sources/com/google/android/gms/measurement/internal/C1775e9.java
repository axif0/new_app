package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
final /* synthetic */ class C1775e9 implements Runnable {

    /* renamed from: f */
    private final C1739b9 f5769f;

    /* renamed from: g */
    private final int f5770g;

    /* renamed from: h */
    private final C1746c4 f5771h;

    /* renamed from: i */
    private final Intent f5772i;

    C1775e9(C1739b9 b9Var, int i, C1746c4 c4Var, Intent intent) {
        this.f5769f = b9Var;
        this.f5770g = i;
        this.f5771h = c4Var;
        this.f5772i = intent;
    }

    public final void run() {
        this.f5769f.mo6740d(this.f5770g, this.f5771h, this.f5772i);
    }
}
