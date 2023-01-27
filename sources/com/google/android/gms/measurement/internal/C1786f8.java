package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.f8 */
final class C1786f8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1860la f5820f;

    /* renamed from: g */
    private final /* synthetic */ C1750c8 f5821g;

    C1786f8(C1750c8 c8Var, C1860la laVar) {
        this.f5821g = c8Var;
        this.f5820f = laVar;
    }

    public final void run() {
        C1961u3 l0 = this.f5821g.f5703d;
        if (l0 == null) {
            this.f5821g.mo6709i().mo6764E().mo6885a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            l0.mo7126E0(this.f5820f);
        } catch (RemoteException e) {
            this.f5821g.mo6709i().mo6764E().mo6886b("Failed to reset data on the service: remote exception", e);
        }
        this.f5821g.m8205e0();
    }
}
