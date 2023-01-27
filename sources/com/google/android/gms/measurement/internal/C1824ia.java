package com.google.android.gms.measurement.internal;

import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;

/* renamed from: com.google.android.gms.measurement.internal.ia */
final class C1824ia implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4571gf f5935f;

    /* renamed from: g */
    private final /* synthetic */ String f5936g;

    /* renamed from: h */
    private final /* synthetic */ String f5937h;

    /* renamed from: i */
    private final /* synthetic */ AppMeasurementDynamiteService f5938i;

    C1824ia(AppMeasurementDynamiteService appMeasurementDynamiteService, C4571gf gfVar, String str, String str2) {
        this.f5938i = appMeasurementDynamiteService;
        this.f5935f = gfVar;
        this.f5936g = str;
        this.f5937h = str2;
    }

    public final void run() {
        this.f5938i.f5608a.mo7033P().mo6780H(this.f5935f, this.f5936g, this.f5937h);
    }
}
