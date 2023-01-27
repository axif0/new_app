package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.backends.C1494g;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.j */
final /* synthetic */ class C1518j implements C3819b.C3820a {

    /* renamed from: a */
    private final C1521m f5107a;

    /* renamed from: b */
    private final C1494g f5108b;

    /* renamed from: c */
    private final Iterable f5109c;

    /* renamed from: d */
    private final C3755l f5110d;

    /* renamed from: e */
    private final int f5111e;

    private C1518j(C1521m mVar, C1494g gVar, Iterable iterable, C3755l lVar, int i) {
        this.f5107a = mVar;
        this.f5108b = gVar;
        this.f5109c = iterable;
        this.f5110d = lVar;
        this.f5111e = i;
    }

    /* renamed from: a */
    public static C3819b.C3820a m7324a(C1521m mVar, C1494g gVar, Iterable iterable, C3755l lVar, int i) {
        return new C1518j(mVar, gVar, iterable, lVar, i);
    }

    public Object execute() {
        return C1521m.m7328c(this.f5107a, this.f5108b, this.f5109c, this.f5110d, this.f5111e);
    }
}
