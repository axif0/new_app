package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.p */
final class C2390p extends C2377m<Void> {

    /* renamed from: c */
    final /* synthetic */ C2398r f7881c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2390p(C2398r rVar, C5163p<Void> pVar) {
        super(rVar, pVar);
        this.f7881c = rVar;
    }

    /* renamed from: s */
    public final void mo9193s(Bundle bundle, Bundle bundle2) {
        super.mo9193s(bundle, bundle2);
        if (!this.f7881c.f7931e.compareAndSet(true, false)) {
            C2398r.f7925f.mo15207g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f7881c.mo9162d();
        }
    }
}
