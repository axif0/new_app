package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
final class C1774e8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f5763f;

    /* renamed from: g */
    private final /* synthetic */ String f5764g;

    /* renamed from: h */
    private final /* synthetic */ boolean f5765h;

    /* renamed from: i */
    private final /* synthetic */ C1860la f5766i;

    /* renamed from: j */
    private final /* synthetic */ C4571gf f5767j;

    /* renamed from: k */
    private final /* synthetic */ C1750c8 f5768k;

    C1774e8(C1750c8 c8Var, String str, String str2, boolean z, C1860la laVar, C4571gf gfVar) {
        this.f5768k = c8Var;
        this.f5763f = str;
        this.f5764g = str2;
        this.f5765h = z;
        this.f5766i = laVar;
        this.f5767j = gfVar;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            C1961u3 l0 = this.f5768k.f5703d;
            if (l0 == null) {
                this.f5768k.mo6709i().mo6764E().mo6887c("Failed to get user properties; not connected to service", this.f5763f, this.f5764g);
            } else {
                bundle = C1788fa.m8444D(l0.mo7121A(this.f5763f, this.f5764g, this.f5765h, this.f5766i));
                this.f5768k.m8205e0();
            }
        } catch (RemoteException e) {
            this.f5768k.mo6709i().mo6764E().mo6887c("Failed to get user properties; remote exception", this.f5763f, e);
        } catch (Throwable th) {
            this.f5768k.mo6707f().mo6988Q(this.f5767j, bundle);
            throw th;
        }
        this.f5768k.mo6707f().mo6988Q(this.f5767j, bundle);
    }
}
