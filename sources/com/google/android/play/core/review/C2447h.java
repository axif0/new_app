package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5096d;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.review.h */
class C2447h<T> extends C5096d {

    /* renamed from: a */
    final C5100f f8077a;

    /* renamed from: b */
    final C5163p<T> f8078b;

    /* renamed from: c */
    final /* synthetic */ C2449j f8079c;

    C2447h(C2449j jVar, C5100f fVar, C5163p<T> pVar) {
        this.f8079c = jVar;
        this.f8077a = fVar;
        this.f8078b = pVar;
    }

    /* renamed from: e */
    public void mo9291e(Bundle bundle) throws RemoteException {
        this.f8079c.f8081a.mo15221b();
        this.f8077a.mo15206f("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
