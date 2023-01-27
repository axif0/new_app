package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.p8 */
final class C1906p8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f6166f;

    /* renamed from: g */
    private final /* synthetic */ boolean f6167g;

    /* renamed from: h */
    private final /* synthetic */ C1933s f6168h;

    /* renamed from: i */
    private final /* synthetic */ C1860la f6169i;

    /* renamed from: j */
    private final /* synthetic */ String f6170j;

    /* renamed from: k */
    private final /* synthetic */ C1750c8 f6171k;

    C1906p8(C1750c8 c8Var, boolean z, boolean z2, C1933s sVar, C1860la laVar, String str) {
        this.f6171k = c8Var;
        this.f6166f = z;
        this.f6167g = z2;
        this.f6168h = sVar;
        this.f6169i = laVar;
        this.f6170j = str;
    }

    public final void run() {
        C1961u3 l0 = this.f6171k.f5703d;
        if (l0 == null) {
            this.f6171k.mo6709i().mo6764E().mo6885a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f6166f) {
            this.f6171k.mo6784L(l0, this.f6167g ? null : this.f6168h, this.f6169i);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6170j)) {
                    l0.mo7137a0(this.f6168h, this.f6169i);
                } else {
                    l0.mo7128G0(this.f6168h, this.f6170j, this.f6171k.mo6709i().mo6773N());
                }
            } catch (RemoteException e) {
                this.f6171k.mo6709i().mo6764E().mo6886b("Failed to send event to the service", e);
            }
        }
        this.f6171k.m8205e0();
    }
}
