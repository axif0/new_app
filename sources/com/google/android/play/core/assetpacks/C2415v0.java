package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.assetpacks.v0 */
final class C2415v0 {

    /* renamed from: j */
    private static final C5100f f7983j = new C5100f("ExtractorLooper");

    /* renamed from: a */
    private final C2379m1 f7984a;

    /* renamed from: b */
    private final C2403s0 f7985b;

    /* renamed from: c */
    private final C2397q2 f7986c;

    /* renamed from: d */
    private final C2320a2 f7987d;

    /* renamed from: e */
    private final C2340e2 f7988e;

    /* renamed from: f */
    private final C2365j2 f7989f;

    /* renamed from: g */
    private final C5099e0<C2371k3> f7990g;

    /* renamed from: h */
    private final C2392p1 f7991h;

    /* renamed from: i */
    private final AtomicBoolean f7992i = new AtomicBoolean(false);

    C2415v0(C2379m1 m1Var, C5099e0<C2371k3> e0Var, C2403s0 s0Var, C2397q2 q2Var, C2320a2 a2Var, C2340e2 e2Var, C2365j2 j2Var, C2392p1 p1Var) {
        this.f7984a = m1Var;
        this.f7990g = e0Var;
        this.f7985b = s0Var;
        this.f7986c = q2Var;
        this.f7987d = a2Var;
        this.f7988e = e2Var;
        this.f7989f = j2Var;
        this.f7991h = p1Var;
    }

    /* renamed from: b */
    private final void m11051b(int i, Exception exc) {
        try {
            this.f7984a.mo9210p(i);
            this.f7984a.mo9198c(i);
        } catch (C2411u0 unused) {
            f7983j.mo15205e("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9251a() {
        f7983j.mo15203c("Run extractor loop", new Object[0]);
        if (this.f7992i.compareAndSet(false, true)) {
            while (true) {
                C2388o1 o1Var = null;
                try {
                    o1Var = this.f7991h.mo9227a();
                } catch (C2411u0 e) {
                    f7983j.mo15205e("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f7972f >= 0) {
                        this.f7990g.mo15202d().mo9164u(e.f7972f);
                        m11051b(e.f7972f, e);
                    }
                }
                if (o1Var != null) {
                    try {
                        if (o1Var instanceof C2399r0) {
                            this.f7985b.mo9231a((C2399r0) o1Var);
                        } else if (o1Var instanceof C2393p2) {
                            this.f7986c.mo9228a((C2393p2) o1Var);
                        } else if (o1Var instanceof C2432z1) {
                            this.f7987d.mo9099a((C2432z1) o1Var);
                        } else if (o1Var instanceof C2330c2) {
                            this.f7988e.mo9143a((C2330c2) o1Var);
                        } else if (o1Var instanceof C2360i2) {
                            this.f7989f.mo9160a((C2360i2) o1Var);
                        } else {
                            f7983j.mo15205e("Unknown task type: %s", o1Var.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f7983j.mo15205e("Error during extraction task: %s", e2.getMessage());
                        this.f7990g.mo15202d().mo9164u(o1Var.f7878a);
                        m11051b(o1Var.f7878a, e2);
                    }
                } else {
                    this.f7992i.set(false);
                    return;
                }
            }
        } else {
            f7983j.mo15207g("runLoop already looping; return", new Object[0]);
        }
    }
}
