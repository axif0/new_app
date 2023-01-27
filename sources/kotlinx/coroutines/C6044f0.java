package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C6040e0;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.f0 */
public abstract class C6044f0 extends C6034d0 {
    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract Thread mo17040u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo17128v(long j, C6040e0.C6041a aVar) {
        C5956g.m24501f(aVar, "delayedTask");
        if (C6080v.m24813a()) {
            if (!(this != C6084x.f17042l)) {
                throw new AssertionError();
            }
        }
        C6084x.f17042l.mo17114G(j, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo17129w() {
        Thread u = mo17040u();
        if (Thread.currentThread() != u) {
            C6090z0 a = C5994a1.m24562a();
            if (a != null) {
                a.mo17185d(u);
            } else {
                LockSupport.unpark(u);
            }
        }
    }
}
