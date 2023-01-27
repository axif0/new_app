package com.google.android.play.core.review;

import android.os.RemoteException;
import com.google.android.play.core.common.C2436c;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.review.g */
final class C2446g extends C5102g {

    /* renamed from: g */
    final /* synthetic */ C5163p f8075g;

    /* renamed from: h */
    final /* synthetic */ C2449j f8076h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2446g(C2449j jVar, C5163p pVar, C5163p pVar2) {
        super(pVar);
        this.f8076h = jVar;
        this.f8075g = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            this.f8076h.f8081a.mo15223f().mo15199y0(this.f8076h.f8082b, C2436c.m11088a(), new C2448i(this.f8076h, this.f8075g));
        } catch (RemoteException e) {
            C2449j.f8080c.mo15204d(e, "error requesting in-app review for %s", this.f8076h.f8082b);
            this.f8075g.mo15264d(new RuntimeException(e));
        }
    }
}
