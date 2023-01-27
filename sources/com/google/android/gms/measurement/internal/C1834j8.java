package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
final class C1834j8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1965u7 f5948f;

    /* renamed from: g */
    private final /* synthetic */ C1750c8 f5949g;

    C1834j8(C1750c8 c8Var, C1965u7 u7Var) {
        this.f5949g = c8Var;
        this.f5948f = u7Var;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        C1961u3 l0 = this.f5949g.f5703d;
        if (l0 == null) {
            this.f5949g.mo6709i().mo6764E().mo6885a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f5948f == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f5949g.mo6710j().getPackageName();
            } else {
                j = this.f5948f.f6424c;
                str = this.f5948f.f6422a;
                str2 = this.f5948f.f6423b;
                packageName = this.f5949g.mo6710j().getPackageName();
            }
            l0.mo7122A0(j, str, str2, packageName);
            this.f5949g.m8205e0();
        } catch (RemoteException e) {
            this.f5949g.mo6709i().mo6764E().mo6886b("Failed to send current screen to the service", e);
        }
    }
}
