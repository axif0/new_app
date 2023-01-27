package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p271e.p272a.p276c.C5103g0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5105h0;

/* renamed from: com.google.android.play.core.assetpacks.v1 */
public final class C2416v1 implements C5105h0<C2412u1> {

    /* renamed from: a */
    private final C5105h0<String> f7993a;

    /* renamed from: b */
    private final C5105h0<C2418w> f7994b;

    /* renamed from: c */
    private final C5105h0<C2427y0> f7995c;

    /* renamed from: d */
    private final C5105h0<Context> f7996d;

    /* renamed from: e */
    private final C5105h0<C2350g2> f7997e;

    /* renamed from: f */
    private final C5105h0<Executor> f7998f;

    public C2416v1(C5105h0<String> h0Var, C5105h0<C2418w> h0Var2, C5105h0<C2427y0> h0Var3, C5105h0<Context> h0Var4, C5105h0<C2350g2> h0Var5, C5105h0<Executor> h0Var6) {
        this.f7993a = h0Var;
        this.f7994b = h0Var2;
        this.f7995c = h0Var3;
        this.f7996d = h0Var4;
        this.f7997e = h0Var5;
        this.f7998f = h0Var6;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo9098d() {
        String d = this.f7993a.mo9098d();
        C2418w d2 = this.f7994b.mo9098d();
        C2427y0 d3 = this.f7995c.mo9098d();
        Context b = ((C2351g3) this.f7996d).mo9098d();
        C2350g2 d4 = this.f7997e.mo9098d();
        return new C2412u1(d != null ? new File(b.getExternalFilesDir((String) null), d) : b.getExternalFilesDir((String) null), d2, d3, b, d4, C5103g0.m21488b(this.f7998f));
    }
}
