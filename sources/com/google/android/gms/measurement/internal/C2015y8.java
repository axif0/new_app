package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
final class C2015y8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ComponentName f6559f;

    /* renamed from: g */
    private final /* synthetic */ C1990w8 f6560g;

    C2015y8(C1990w8 w8Var, ComponentName componentName) {
        this.f6560g = w8Var;
        this.f6559f = componentName;
    }

    public final void run() {
        this.f6560g.f6496c.m8202D(this.f6559f);
    }
}
