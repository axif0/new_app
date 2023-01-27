package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p148g.p189d.p190a.p271e.p272a.p276c.C5105h0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5126s;

/* renamed from: com.google.android.play.core.assetpacks.e3 */
public final class C2341e3 implements C5105h0<Object> {

    /* renamed from: a */
    private final C5105h0<C2421w2> f7747a;

    /* renamed from: b */
    private final C5105h0<Context> f7748b;

    public C2341e3(C5105h0<C2421w2> h0Var, C5105h0<Context> h0Var2) {
        this.f7747a = h0Var;
        this.f7748b = h0Var2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo9098d() {
        C2421w2 d = this.f7747a.mo9098d();
        Context b = ((C2351g3) this.f7748b).mo9098d();
        C2421w2 w2Var = d;
        C5126s.m21541a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        PlayCoreDialogWrapperActivity.m11086a(b);
        C5126s.m21547g(w2Var);
        return w2Var;
    }
}
