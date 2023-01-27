package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.l */
final /* synthetic */ class C1520l implements C3819b.C3820a {

    /* renamed from: a */
    private final C1521m f5113a;

    /* renamed from: b */
    private final C3755l f5114b;

    /* renamed from: c */
    private final int f5115c;

    private C1520l(C1521m mVar, C3755l lVar, int i) {
        this.f5113a = mVar;
        this.f5114b = lVar;
        this.f5115c = i;
    }

    /* renamed from: a */
    public static C3819b.C3820a m7326a(C1521m mVar, C3755l lVar, int i) {
        return new C1520l(mVar, lVar, i);
    }

    public Object execute() {
        return this.f5113a.f5119d.mo6147a(this.f5114b, this.f5115c + 1);
    }
}
