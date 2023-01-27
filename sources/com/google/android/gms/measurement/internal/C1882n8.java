package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
final class C1882n8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1860la f6084f;

    /* renamed from: g */
    private final /* synthetic */ C1750c8 f6085g;

    C1882n8(C1750c8 c8Var, C1860la laVar) {
        this.f6085g = c8Var;
        this.f6084f = laVar;
    }

    public final void run() {
        C1961u3 l0 = this.f6085g.f5703d;
        if (l0 == null) {
            this.f6085g.mo6709i().mo6764E().mo6885a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            l0.mo7134W(this.f6084f);
            this.f6085g.m8205e0();
        } catch (RemoteException e) {
            this.f6085g.mo6709i().mo6764E().mo6886b("Failed to send measurementEnabled to the service", e);
        }
    }
}
