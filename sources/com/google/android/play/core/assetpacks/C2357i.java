package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p276c.C5129t0;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.i */
final class C2357i extends C5102g {

    /* renamed from: g */
    final /* synthetic */ int f7793g;

    /* renamed from: h */
    final /* synthetic */ String f7794h;

    /* renamed from: i */
    final /* synthetic */ C5163p f7795i;

    /* renamed from: j */
    final /* synthetic */ int f7796j;

    /* renamed from: k */
    final /* synthetic */ C2398r f7797k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2357i(C2398r rVar, C5163p pVar, int i, String str, C5163p pVar2, int i2) {
        super(pVar);
        this.f7797k = rVar;
        this.f7793g = i;
        this.f7794h = str;
        this.f7795i = pVar2;
        this.f7796j = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            ((C5129t0) this.f7797k.f7929c.mo15223f()).mo15226M(this.f7797k.f7927a, C2398r.m11007o(this.f7793g, this.f7794h), C2398r.m11012t(), new C2394q(this.f7797k, this.f7795i, this.f7793g, this.f7794h, this.f7796j));
        } catch (RemoteException e) {
            C2398r.f7925f.mo15204d(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
