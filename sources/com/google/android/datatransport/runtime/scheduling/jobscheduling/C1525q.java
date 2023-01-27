package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
public class C1525q {

    /* renamed from: a */
    private final Executor f5132a;

    /* renamed from: b */
    private final C3784c f5133b;

    /* renamed from: c */
    private final C1527s f5134c;

    /* renamed from: d */
    private final C3819b f5135d;

    C1525q(Executor executor, C3784c cVar, C1527s sVar, C3819b bVar) {
        this.f5132a = executor;
        this.f5133b = cVar;
        this.f5134c = sVar;
        this.f5135d = bVar;
    }

    /* renamed from: b */
    static /* synthetic */ Object m7338b(C1525q qVar) {
        for (C3755l a : qVar.f5133b.mo12382F()) {
            qVar.f5134c.mo6147a(a, 1);
        }
        return null;
    }

    /* renamed from: a */
    public void mo6179a() {
        this.f5132a.execute(C1523o.m7336a(this));
    }
}
