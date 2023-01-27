package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;

/* renamed from: com.google.android.play.core.assetpacks.e2 */
final class C2340e2 {

    /* renamed from: a */
    private final C2328c0 f7742a;

    /* renamed from: b */
    private final C5099e0<C2371k3> f7743b;

    /* renamed from: c */
    private final C2379m1 f7744c;

    /* renamed from: d */
    private final C5099e0<Executor> f7745d;

    /* renamed from: e */
    private final C2427y0 f7746e;

    C2340e2(C2328c0 c0Var, C5099e0<C2371k3> e0Var, C2379m1 m1Var, C5099e0<Executor> e0Var2, C2427y0 y0Var) {
        this.f7742a = c0Var;
        this.f7743b = e0Var;
        this.f7744c = m1Var;
        this.f7745d = e0Var2;
        this.f7746e = y0Var;
    }

    /* renamed from: a */
    public final void mo9143a(C2330c2 c2Var) {
        File m = this.f7742a.mo9123m(c2Var.f7879b, c2Var.f7728c, c2Var.f7729d);
        File v = this.f7742a.mo9131v(c2Var.f7879b, c2Var.f7728c, c2Var.f7729d);
        if (!m.exists() || !v.exists()) {
            throw new C2411u0(String.format("Cannot find pack files to move for pack %s.", new Object[]{c2Var.f7879b}), c2Var.f7878a);
        }
        File b = this.f7742a.mo9114b(c2Var.f7879b, c2Var.f7728c, c2Var.f7729d);
        b.mkdirs();
        if (m.renameTo(b)) {
            new File(this.f7742a.mo9114b(c2Var.f7879b, c2Var.f7728c, c2Var.f7729d), "merge.tmp").delete();
            File j = this.f7742a.mo9120j(c2Var.f7879b, c2Var.f7728c, c2Var.f7729d);
            j.mkdirs();
            if (v.renameTo(j)) {
                C2328c0 c0Var = this.f7742a;
                c0Var.getClass();
                this.f7745d.mo15202d().execute(C2335d2.m10862a(c0Var));
                this.f7744c.mo9199d(c2Var.f7879b, c2Var.f7728c, c2Var.f7729d);
                this.f7746e.mo9266b(c2Var.f7879b);
                this.f7743b.mo15202d().mo9161a(c2Var.f7878a, c2Var.f7879b);
                return;
            }
            throw new C2411u0("Cannot move metadata files to final location.", c2Var.f7878a);
        }
        throw new C2411u0("Cannot move merged pack files to final location.", c2Var.f7878a);
    }
}
