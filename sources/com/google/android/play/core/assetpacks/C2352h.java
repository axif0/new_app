package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p276c.C5129t0;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.h */
final class C2352h extends C5102g {

    /* renamed from: g */
    final /* synthetic */ int f7777g;

    /* renamed from: h */
    final /* synthetic */ String f7778h;

    /* renamed from: i */
    final /* synthetic */ String f7779i;

    /* renamed from: j */
    final /* synthetic */ int f7780j;

    /* renamed from: k */
    final /* synthetic */ C5163p f7781k;

    /* renamed from: l */
    final /* synthetic */ C2398r f7782l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2352h(C2398r rVar, C5163p pVar, int i, String str, String str2, int i2, C5163p pVar2) {
        super(pVar);
        this.f7782l = rVar;
        this.f7777g = i;
        this.f7778h = str;
        this.f7779i = str2;
        this.f7780j = i2;
        this.f7781k = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            ((C5129t0) this.f7782l.f7929c.mo15223f()).mo15225K0(this.f7782l.f7927a, C2398r.m11008p(this.f7777g, this.f7778h, this.f7779i, this.f7780j), C2398r.m11012t(), new C2377m(this.f7782l, this.f7781k, (char[]) null));
        } catch (RemoteException e) {
            C2398r.f7925f.mo15204d(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
