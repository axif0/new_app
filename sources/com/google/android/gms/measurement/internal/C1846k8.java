package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.p037t.C1663a;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
final class C1846k8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1860la f5973f;

    /* renamed from: g */
    private final /* synthetic */ C1750c8 f5974g;

    C1846k8(C1750c8 c8Var, C1860la laVar) {
        this.f5974g = c8Var;
        this.f5973f = laVar;
    }

    public final void run() {
        C1961u3 l0 = this.f5974g.f5703d;
        if (l0 == null) {
            this.f5974g.mo6709i().mo6764E().mo6885a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            l0.mo7125D(this.f5973f);
            this.f5974g.mo6859t().mo7476J();
            this.f5974g.mo6784L(l0, (C1663a) null, this.f5973f);
            this.f5974g.m8205e0();
        } catch (RemoteException e) {
            this.f5974g.mo6709i().mo6764E().mo6886b("Failed to send app launch to the service", e);
        }
    }
}
