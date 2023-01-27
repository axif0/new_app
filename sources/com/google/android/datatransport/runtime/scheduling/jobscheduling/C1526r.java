package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;
import p335h.p336a.C5599b;
import p349j.p350a.C5825a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
public final class C1526r implements C5599b<C1525q> {

    /* renamed from: a */
    private final C5825a<Executor> f5136a;

    /* renamed from: b */
    private final C5825a<C3784c> f5137b;

    /* renamed from: c */
    private final C5825a<C1527s> f5138c;

    /* renamed from: d */
    private final C5825a<C3819b> f5139d;

    public C1526r(C5825a<Executor> aVar, C5825a<C3784c> aVar2, C5825a<C1527s> aVar3, C5825a<C3819b> aVar4) {
        this.f5136a = aVar;
        this.f5137b = aVar2;
        this.f5138c = aVar3;
        this.f5139d = aVar4;
    }

    /* renamed from: a */
    public static C1526r m7341a(C5825a<Executor> aVar, C5825a<C3784c> aVar2, C5825a<C1527s> aVar3, C5825a<C3819b> aVar4) {
        return new C1526r(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: b */
    public C1525q get() {
        return new C1525q(this.f5136a.get(), this.f5137b.get(), this.f5138c.get(), this.f5139d.get());
    }
}
