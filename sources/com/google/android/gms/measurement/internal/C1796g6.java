package com.google.android.gms.measurement.internal;

import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
final class C1796g6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4571gf f5839f;

    /* renamed from: g */
    private final /* synthetic */ AppMeasurementDynamiteService f5840g;

    C1796g6(AppMeasurementDynamiteService appMeasurementDynamiteService, C4571gf gfVar) {
        this.f5840g = appMeasurementDynamiteService;
        this.f5839f = gfVar;
    }

    public final void run() {
        this.f5840g.f5608a.mo7033P().mo6778F(this.f5839f);
    }
}
