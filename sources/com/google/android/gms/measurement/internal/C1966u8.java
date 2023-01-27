package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
final class C1966u8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6428f;

    /* renamed from: g */
    private final /* synthetic */ String f6429g;

    /* renamed from: h */
    private final /* synthetic */ C1860la f6430h;

    /* renamed from: i */
    private final /* synthetic */ C4571gf f6431i;

    /* renamed from: j */
    private final /* synthetic */ C1750c8 f6432j;

    C1966u8(C1750c8 c8Var, String str, String str2, C1860la laVar, C4571gf gfVar) {
        this.f6432j = c8Var;
        this.f6428f = str;
        this.f6429g = str2;
        this.f6430h = laVar;
        this.f6431i = gfVar;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            C1961u3 l0 = this.f6432j.f5703d;
            if (l0 == null) {
                this.f6432j.mo6709i().mo6764E().mo6887c("Failed to get conditional properties; not connected to service", this.f6428f, this.f6429g);
            } else {
                arrayList = C1788fa.m8466s0(l0.mo7129H0(this.f6428f, this.f6429g, this.f6430h));
                this.f6432j.m8205e0();
            }
        } catch (RemoteException e) {
            this.f6432j.mo6709i().mo6764E().mo6888d("Failed to get conditional properties; remote exception", this.f6428f, this.f6429g, e);
        } catch (Throwable th) {
            this.f6432j.mo6707f().mo6990S(this.f6431i, arrayList);
            throw th;
        }
        this.f6432j.mo6707f().mo6990S(this.f6431i, arrayList);
    }
}
