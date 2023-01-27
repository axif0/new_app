package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.s8 */
final class C1942s8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f6254f = true;

    /* renamed from: g */
    private final /* synthetic */ boolean f6255g;

    /* renamed from: h */
    private final /* synthetic */ C1968ua f6256h;

    /* renamed from: i */
    private final /* synthetic */ C1860la f6257i;

    /* renamed from: j */
    private final /* synthetic */ C1968ua f6258j;

    /* renamed from: k */
    private final /* synthetic */ C1750c8 f6259k;

    C1942s8(C1750c8 c8Var, boolean z, boolean z2, C1968ua uaVar, C1860la laVar, C1968ua uaVar2) {
        this.f6259k = c8Var;
        this.f6255g = z2;
        this.f6256h = uaVar;
        this.f6257i = laVar;
        this.f6258j = uaVar2;
    }

    public final void run() {
        C1961u3 l0 = this.f6259k.f5703d;
        if (l0 == null) {
            this.f6259k.mo6709i().mo6764E().mo6885a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f6254f) {
            this.f6259k.mo6784L(l0, this.f6255g ? null : this.f6256h, this.f6257i);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6258j.f6434f)) {
                    l0.mo7124C(this.f6256h, this.f6257i);
                } else {
                    l0.mo7131P(this.f6256h);
                }
            } catch (RemoteException e) {
                this.f6259k.mo6709i().mo6764E().mo6886b("Failed to send conditional user property to the service", e);
            }
        }
        this.f6259k.m8205e0();
    }
}
