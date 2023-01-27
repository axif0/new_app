package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p276c.C5129t0;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.j */
final class C2362j extends C5102g {

    /* renamed from: g */
    final /* synthetic */ int f7814g;

    /* renamed from: h */
    final /* synthetic */ C5163p f7815h;

    /* renamed from: i */
    final /* synthetic */ C2398r f7816i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2362j(C2398r rVar, C5163p pVar, int i, C5163p pVar2) {
        super(pVar);
        this.f7816i = rVar;
        this.f7814g = i;
        this.f7815h = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            ((C5129t0) this.f7816i.f7929c.mo15223f()).mo15227k0(this.f7816i.f7927a, C2398r.m11006n(this.f7814g), C2398r.m11012t(), new C2377m(this.f7816i, this.f7815h, (int[]) null));
        } catch (RemoteException e) {
            C2398r.f7925f.mo15204d(e, "notifySessionFailed", new Object[0]);
        }
    }
}
