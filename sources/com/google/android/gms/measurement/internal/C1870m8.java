package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
final class C1870m8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Bundle f6063f;

    /* renamed from: g */
    private final /* synthetic */ C1860la f6064g;

    /* renamed from: h */
    private final /* synthetic */ C1750c8 f6065h;

    C1870m8(C1750c8 c8Var, Bundle bundle, C1860la laVar) {
        this.f6065h = c8Var;
        this.f6063f = bundle;
        this.f6064g = laVar;
    }

    public final void run() {
        C1961u3 l0 = this.f6065h.f5703d;
        if (l0 == null) {
            this.f6065h.mo6709i().mo6764E().mo6885a("Failed to send default event parameters to service");
            return;
        }
        try {
            l0.mo7139q0(this.f6063f, this.f6064g);
        } catch (RemoteException e) {
            this.f6065h.mo6709i().mo6764E().mo6886b("Failed to send default event parameters to service", e);
        }
    }
}
