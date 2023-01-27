package com.google.android.gms.measurement.internal;

import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
final class C1798g8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4571gf f5846f;

    /* renamed from: g */
    private final /* synthetic */ C1933s f5847g;

    /* renamed from: h */
    private final /* synthetic */ String f5848h;

    /* renamed from: i */
    private final /* synthetic */ AppMeasurementDynamiteService f5849i;

    C1798g8(AppMeasurementDynamiteService appMeasurementDynamiteService, C4571gf gfVar, C1933s sVar, String str) {
        this.f5849i = appMeasurementDynamiteService;
        this.f5846f = gfVar;
        this.f5847g = sVar;
        this.f5848h = str;
    }

    public final void run() {
        this.f5849i.f5608a.mo7033P().mo6779G(this.f5846f, this.f5847g, this.f5848h);
    }
}
