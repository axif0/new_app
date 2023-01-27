package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
final class C1918q8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1860la f6198f;

    /* renamed from: g */
    private final /* synthetic */ C1750c8 f6199g;

    C1918q8(C1750c8 c8Var, C1860la laVar) {
        this.f6199g = c8Var;
        this.f6198f = laVar;
    }

    public final void run() {
        C1961u3 l0 = this.f6199g.f5703d;
        if (l0 == null) {
            this.f6199g.mo6709i().mo6764E().mo6885a("Failed to send consent settings to service");
            return;
        }
        try {
            l0.mo7130I(this.f6198f);
            this.f6199g.m8205e0();
        } catch (RemoteException e) {
            this.f6199g.mo6709i().mo6764E().mo6886b("Failed to send consent settings to the service", e);
        }
    }
}
