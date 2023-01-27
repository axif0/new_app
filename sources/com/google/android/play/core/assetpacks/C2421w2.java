package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p279f.C5146a;
import p148g.p189d.p190a.p271e.p272a.p280g.C5152e;

/* renamed from: com.google.android.play.core.assetpacks.w2 */
final class C2421w2 {

    /* renamed from: e */
    private static final C5100f f8018e = new C5100f("AssetPackManager");

    /* renamed from: a */
    private final C2328c0 f8019a;

    /* renamed from: b */
    private final C5099e0<C2371k3> f8020b;

    /* renamed from: c */
    private final C2418w f8021c;

    /* renamed from: d */
    private final C5099e0<Executor> f8022d;

    C2421w2(C2328c0 c0Var, C5099e0<C2371k3> e0Var, C2418w wVar, C5146a aVar, C2379m1 m1Var, C2427y0 y0Var, C2378m0 m0Var, C5099e0<Executor> e0Var2) {
        new Handler(Looper.getMainLooper());
        this.f8019a = c0Var;
        this.f8020b = e0Var;
        this.f8021c = wVar;
        this.f8022d = e0Var2;
    }

    /* renamed from: d */
    private final void m11069d() {
        this.f8022d.mo15202d().execute(new C2409t2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9256b(boolean z) {
        boolean f = this.f8021c.mo15245f();
        this.f8021c.mo15243d(z);
        if (z && !f) {
            m11069d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo9257c() {
        C5152e<List<String>> v = this.f8020b.mo15202d().mo9165v(this.f8019a.mo9122l());
        C2328c0 c0Var = this.f8019a;
        c0Var.getClass();
        v.mo15250e(this.f8022d.mo15202d(), C2413u2.m11049a(c0Var));
        v.mo15248c(this.f8022d.mo15202d(), C2417v2.f7999a);
    }
}
