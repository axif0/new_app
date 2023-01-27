package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.review.i */
final class C2448i extends C2447h<ReviewInfo> {
    C2448i(C2449j jVar, C5163p pVar) {
        super(jVar, new C5100f("OnRequestInstallCallback"), pVar);
    }

    /* renamed from: e */
    public final void mo9291e(Bundle bundle) throws RemoteException {
        super.mo9291e(bundle);
        this.f8078b.mo15265e(ReviewInfo.m11098b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
