package kotlinx.coroutines;

import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.y0 */
public final class C6088y0 {

    /* renamed from: a */
    private static final ThreadLocal<C6034d0> f17048a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C6088y0 f17049b = new C6088y0();

    private C6088y0() {
    }

    /* renamed from: a */
    public final C6034d0 mo17179a() {
        C6034d0 d0Var = f17048a.get();
        if (d0Var != null) {
            return d0Var;
        }
        C6034d0 a = C6046g0.m24744a();
        f17048a.set(a);
        return a;
    }

    /* renamed from: b */
    public final void mo17180b() {
        f17048a.set((Object) null);
    }

    /* renamed from: c */
    public final void mo17181c(C6034d0 d0Var) {
        C5956g.m24501f(d0Var, "eventLoop");
        f17048a.set(d0Var);
    }
}
