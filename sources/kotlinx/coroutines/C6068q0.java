package kotlinx.coroutines;

import kotlinx.coroutines.C6060n0;
import p351k.C5856n;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.q0 */
public abstract class C6068q0<J extends C6060n0> extends C6057m implements C5996b0, C6052j0 {

    /* renamed from: i */
    public final J f17028i;

    public C6068q0(J j) {
        C5956g.m24501f(j, "job");
        this.f17028i = j;
    }

    /* renamed from: a */
    public C6077t0 mo17042a() {
        return null;
    }

    /* renamed from: d */
    public boolean mo17043d() {
        return true;
    }

    /* renamed from: h */
    public void mo17041h() {
        J j = this.f17028i;
        if (j != null) {
            ((C6070r0) j).mo17156o(this);
            return;
        }
        throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }
}
