package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
final class C1810h8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1860la f5906f;

    /* renamed from: g */
    private final /* synthetic */ C4571gf f5907g;

    /* renamed from: h */
    private final /* synthetic */ C1750c8 f5908h;

    C1810h8(C1750c8 c8Var, C1860la laVar, C4571gf gfVar) {
        this.f5908h = c8Var;
        this.f5906f = laVar;
        this.f5907g = gfVar;
    }

    public final void run() {
        String str = null;
        try {
            if (!C4602ib.m19620b() || !this.f5908h.mo6712l().mo7415s(C1957u.f6338P0) || this.f5908h.mo6711k().mo7284K().mo6882q()) {
                C1961u3 l0 = this.f5908h.f5703d;
                if (l0 == null) {
                    this.f5908h.mo6709i().mo6764E().mo6885a("Failed to get app instance id");
                } else {
                    str = l0.mo7138n0(this.f5906f);
                    if (str != null) {
                        this.f5908h.mo6855p().mo7192T(str);
                        this.f5908h.mo6711k().f6141l.mo7378b(str);
                    }
                    this.f5908h.m8205e0();
                }
                this.f5908h.mo6707f().mo6989R(this.f5907g, str);
            }
            this.f5908h.mo6709i().mo6769J().mo6885a("Analytics storage consent denied; will not get app instance id");
            this.f5908h.mo6855p().mo7192T((String) null);
            this.f5908h.mo6711k().f6141l.mo7378b((String) null);
            this.f5908h.mo6707f().mo6989R(this.f5907g, str);
        } catch (RemoteException e) {
            this.f5908h.mo6709i().mo6764E().mo6886b("Failed to get app instance id", e);
        } catch (Throwable th) {
            this.f5908h.mo6707f().mo6989R(this.f5907g, (String) null);
            throw th;
        }
    }
}
