package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p276c.C5129t0;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.g */
final class C2347g extends C5102g {

    /* renamed from: g */
    final /* synthetic */ Map f7765g;

    /* renamed from: h */
    final /* synthetic */ C5163p f7766h;

    /* renamed from: i */
    final /* synthetic */ C2398r f7767i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2347g(C2398r rVar, C5163p pVar, Map map, C5163p pVar2) {
        super(pVar);
        this.f7767i = rVar;
        this.f7765g = map;
        this.f7766h = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            ((C5129t0) this.f7767i.f7929c.mo15223f()).mo15229u0(this.f7767i.f7927a, C2398r.m11003j(this.f7765g), new C2386o(this.f7767i, this.f7766h));
        } catch (RemoteException e) {
            C2398r.f7925f.mo15204d(e, "syncPacks", new Object[0]);
            this.f7766h.mo15264d(new RuntimeException(e));
        }
    }
}
