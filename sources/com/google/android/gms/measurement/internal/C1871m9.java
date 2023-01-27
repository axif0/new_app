package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.m9 */
final /* synthetic */ class C1871m9 implements Runnable {

    /* renamed from: f */
    private final C1883n9 f6066f;

    C1871m9(C1883n9 n9Var) {
        this.f6066f = n9Var;
    }

    public final void run() {
        C1883n9 n9Var = this.f6066f;
        C1847k9 k9Var = n9Var.f6088h;
        long j = n9Var.f6086f;
        long j2 = n9Var.f6087g;
        k9Var.f5976b.mo6700b();
        k9Var.f5976b.mo6709i().mo6771L().mo6885a("Application going to the background");
        boolean z = true;
        if (k9Var.f5976b.mo6712l().mo7415s(C1957u.f6401x0)) {
            k9Var.f5976b.mo6711k().f6152w.mo7325a(true);
        }
        Bundle bundle = new Bundle();
        if (!k9Var.f5976b.mo6712l().mo7403H().booleanValue()) {
            k9Var.f5976b.f5952e.mo7302f(j2);
            if (k9Var.f5976b.mo6712l().mo7415s(C1957u.f6383o0)) {
                bundle.putLong("_et", k9Var.f5976b.mo7155B(j2));
                C1953t7.m8858O(k9Var.f5976b.mo6858s().mo7347D(true), bundle, true);
            } else {
                z = false;
            }
            k9Var.f5976b.mo7156E(false, z, j2);
        }
        k9Var.f5976b.mo6855p().mo7193U("auto", "_ab", j, bundle);
    }
}
