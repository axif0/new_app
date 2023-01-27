package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.q */
final class C2394q extends C2377m<Void> {

    /* renamed from: c */
    final int f7891c;

    /* renamed from: d */
    final String f7892d;

    /* renamed from: e */
    final int f7893e;

    /* renamed from: f */
    final /* synthetic */ C2398r f7894f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2394q(C2398r rVar, C5163p<Void> pVar, int i, String str, int i2) {
        super(rVar, pVar);
        this.f7894f = rVar;
        this.f7891c = i;
        this.f7892d = str;
        this.f7893e = i2;
    }

    /* renamed from: e */
    public final void mo9187e(Bundle bundle) {
        this.f7894f.f7929c.mo15221b();
        int i = bundle.getInt("error_code");
        C2398r.f7925f.mo15205e("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f7893e;
        if (i2 > 0) {
            this.f7894f.m10999f(this.f7891c, this.f7892d, i2 - 1);
        }
    }
}
