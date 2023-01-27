package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p148g.p189d.p190a.p191a.p192i.C3755l;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.h */
final /* synthetic */ class C1516h implements Runnable {

    /* renamed from: f */
    private final C1521m f5101f;

    /* renamed from: g */
    private final C3755l f5102g;

    /* renamed from: h */
    private final int f5103h;

    /* renamed from: i */
    private final Runnable f5104i;

    private C1516h(C1521m mVar, C3755l lVar, int i, Runnable runnable) {
        this.f5101f = mVar;
        this.f5102g = lVar;
        this.f5103h = i;
        this.f5104i = runnable;
    }

    /* renamed from: a */
    public static Runnable m7322a(C1521m mVar, C3755l lVar, int i, Runnable runnable) {
        return new C1516h(mVar, lVar, i, runnable);
    }

    public void run() {
        C1521m.m7330e(this.f5101f, this.f5102g, this.f5103h, this.f5104i);
    }
}
