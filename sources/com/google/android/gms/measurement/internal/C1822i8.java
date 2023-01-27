package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
final class C1822i8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f5930f;

    /* renamed from: g */
    private final /* synthetic */ C1860la f5931g;

    /* renamed from: h */
    private final /* synthetic */ C1750c8 f5932h;

    C1822i8(C1750c8 c8Var, AtomicReference atomicReference, C1860la laVar) {
        this.f5932h = c8Var;
        this.f5930f = atomicReference;
        this.f5931g = laVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f5930f) {
            try {
                if (!C4602ib.m19620b() || !this.f5932h.mo6712l().mo7415s(C1957u.f6338P0) || this.f5932h.mo6711k().mo7284K().mo6882q()) {
                    C1961u3 l0 = this.f5932h.f5703d;
                    if (l0 == null) {
                        this.f5932h.mo6709i().mo6764E().mo6885a("Failed to get app instance id");
                        this.f5930f.notify();
                        return;
                    }
                    this.f5930f.set(l0.mo7138n0(this.f5931g));
                    String str = (String) this.f5930f.get();
                    if (str != null) {
                        this.f5932h.mo6855p().mo7192T(str);
                        this.f5932h.mo6711k().f6141l.mo7378b(str);
                    }
                    this.f5932h.m8205e0();
                    atomicReference = this.f5930f;
                    atomicReference.notify();
                    return;
                }
                this.f5932h.mo6709i().mo6769J().mo6885a("Analytics storage consent denied; will not get app instance id");
                this.f5932h.mo6855p().mo7192T((String) null);
                this.f5932h.mo6711k().f6141l.mo7378b((String) null);
                this.f5930f.set((Object) null);
                this.f5930f.notify();
            } catch (RemoteException e) {
                try {
                    this.f5932h.mo6709i().mo6764E().mo6886b("Failed to get app instance id", e);
                    atomicReference = this.f5930f;
                } catch (Throwable th) {
                    this.f5930f.notify();
                    throw th;
                }
            }
        }
    }
}
