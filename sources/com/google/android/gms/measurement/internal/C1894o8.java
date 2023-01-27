package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
final class C1894o8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1933s f6112f;

    /* renamed from: g */
    private final /* synthetic */ String f6113g;

    /* renamed from: h */
    private final /* synthetic */ C4571gf f6114h;

    /* renamed from: i */
    private final /* synthetic */ C1750c8 f6115i;

    C1894o8(C1750c8 c8Var, C1933s sVar, String str, C4571gf gfVar) {
        this.f6115i = c8Var;
        this.f6112f = sVar;
        this.f6113g = str;
        this.f6114h = gfVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C1961u3 l0 = this.f6115i.f5703d;
            if (l0 == null) {
                this.f6115i.mo6709i().mo6764E().mo6885a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = l0.mo7136Z(this.f6112f, this.f6113g);
                this.f6115i.m8205e0();
            }
        } catch (RemoteException e) {
            this.f6115i.mo6709i().mo6764E().mo6886b("Failed to send event to the service to bundle", e);
        } catch (Throwable th) {
            this.f6115i.mo6707f().mo6992U(this.f6114h, bArr);
            throw th;
        }
        this.f6115i.mo6707f().mo6992U(this.f6114h, bArr);
    }
}
