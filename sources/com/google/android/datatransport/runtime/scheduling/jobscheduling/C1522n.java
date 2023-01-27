package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C1491e;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;
import p335h.p336a.C5599b;
import p349j.p350a.C5825a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.n */
public final class C1522n implements C5599b<C1521m> {

    /* renamed from: a */
    private final C5825a<Context> f5123a;

    /* renamed from: b */
    private final C5825a<C1491e> f5124b;

    /* renamed from: c */
    private final C5825a<C3784c> f5125c;

    /* renamed from: d */
    private final C5825a<C1527s> f5126d;

    /* renamed from: e */
    private final C5825a<Executor> f5127e;

    /* renamed from: f */
    private final C5825a<C3819b> f5128f;

    /* renamed from: g */
    private final C5825a<C3821a> f5129g;

    public C1522n(C5825a<Context> aVar, C5825a<C1491e> aVar2, C5825a<C3784c> aVar3, C5825a<C1527s> aVar4, C5825a<Executor> aVar5, C5825a<C3819b> aVar6, C5825a<C3821a> aVar7) {
        this.f5123a = aVar;
        this.f5124b = aVar2;
        this.f5125c = aVar3;
        this.f5126d = aVar4;
        this.f5127e = aVar5;
        this.f5128f = aVar6;
        this.f5129g = aVar7;
    }

    /* renamed from: a */
    public static C1522n m7334a(C5825a<Context> aVar, C5825a<C1491e> aVar2, C5825a<C3784c> aVar3, C5825a<C1527s> aVar4, C5825a<Executor> aVar5, C5825a<C3819b> aVar6, C5825a<C3821a> aVar7) {
        return new C1522n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* renamed from: b */
    public C1521m get() {
        return new C1521m(this.f5123a.get(), this.f5124b.get(), this.f5125c.get(), this.f5126d.get(), this.f5127e.get(), this.f5128f.get(), this.f5129g.get());
    }
}
