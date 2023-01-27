package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p276c.C5129t0;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.l */
final class C2372l extends C5102g {

    /* renamed from: g */
    final /* synthetic */ C5163p f7841g;

    /* renamed from: h */
    final /* synthetic */ C2398r f7842h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2372l(C2398r rVar, C5163p pVar, C5163p pVar2) {
        super(pVar);
        this.f7842h = rVar;
        this.f7841g = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            ((C5129t0) this.f7842h.f7930d.mo15223f()).mo15228l0(this.f7842h.f7927a, C2398r.m11012t(), new C2390p(this.f7842h, this.f7841g));
        } catch (RemoteException e) {
            C2398r.f7925f.mo15204d(e, "keepAlive", new Object[0]);
        }
    }
}
