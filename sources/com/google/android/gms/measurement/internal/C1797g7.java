package com.google.android.gms.measurement.internal;

import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
final class C1797g7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4571gf f5841f;

    /* renamed from: g */
    private final /* synthetic */ String f5842g;

    /* renamed from: h */
    private final /* synthetic */ String f5843h;

    /* renamed from: i */
    private final /* synthetic */ boolean f5844i;

    /* renamed from: j */
    private final /* synthetic */ AppMeasurementDynamiteService f5845j;

    C1797g7(AppMeasurementDynamiteService appMeasurementDynamiteService, C4571gf gfVar, String str, String str2, boolean z) {
        this.f5845j = appMeasurementDynamiteService;
        this.f5841f = gfVar;
        this.f5842g = str;
        this.f5843h = str2;
        this.f5844i = z;
    }

    public final void run() {
        this.f5845j.f5608a.mo7033P().mo6781I(this.f5841f, this.f5842g, this.f5843h, this.f5844i);
    }
}
