package kotlinx.coroutines;

import kotlinx.coroutines.p368c1.C6000a;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.d0 */
public abstract class C6034d0 extends C6065p {

    /* renamed from: f */
    private long f16993f;

    /* renamed from: g */
    private boolean f16994g;

    /* renamed from: h */
    private C6000a<C5993a0<?>> f16995h;

    /* renamed from: l */
    private final long m24680l(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: p */
    public static /* synthetic */ void m24681p(C6034d0 d0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            d0Var.mo17103o(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: k */
    public final void mo17100k(boolean z) {
        long l = this.f16993f - m24680l(z);
        this.f16993f = l;
        if (l <= 0) {
            if (C6080v.m24813a()) {
                if (!(this.f16993f == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f16994g) {
                mo17107t();
            }
        }
    }

    /* renamed from: m */
    public final void mo17101m(C5993a0<?> a0Var) {
        C5956g.m24501f(a0Var, "task");
        C6000a<C5993a0<?>> aVar = this.f16995h;
        if (aVar == null) {
            aVar = new C6000a<>();
            this.f16995h = aVar;
        }
        aVar.mo17045a(a0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public long mo17102n() {
        C6000a<C5993a0<?>> aVar = this.f16995h;
        return (aVar == null || aVar.mo17046c()) ? Long.MAX_VALUE : 0;
    }

    /* renamed from: o */
    public final void mo17103o(boolean z) {
        this.f16993f += m24680l(z);
        if (!z) {
            this.f16994g = true;
        }
    }

    /* renamed from: q */
    public final boolean mo17104q() {
        return this.f16993f >= m24680l(true);
    }

    /* renamed from: r */
    public final boolean mo17105r() {
        C6000a<C5993a0<?>> aVar = this.f16995h;
        if (aVar != null) {
            return aVar.mo17046c();
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo17106s() {
        C5993a0 d;
        C6000a<C5993a0<?>> aVar = this.f16995h;
        if (aVar == null || (d = aVar.mo17047d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo17107t() {
    }
}
