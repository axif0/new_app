package com.bumptech.glide.load.p008o.p010b0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p010b0.C1079h;
import com.bumptech.glide.p029s.C1398g;

/* renamed from: com.bumptech.glide.load.o.b0.g */
public class C1078g extends C1398g<C0998g, C1141v<?>> implements C1079h {

    /* renamed from: d */
    private C1079h.C1080a f4074d;

    public C1078g(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo5287a(int i) {
        if (i >= 40) {
            mo5889b();
        } else if (i >= 20 || i == 15) {
            mo5894m(mo5891h() / 2);
        }
    }

    /* renamed from: c */
    public void mo5288c(C1079h.C1080a aVar) {
        this.f4074d = aVar;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C1141v mo5289d(C0998g gVar, C1141v vVar) {
        return (C1141v) super.mo5892k(gVar, vVar);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ C1141v mo5290e(C0998g gVar) {
        return (C1141v) super.mo5893l(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo5291i(C1141v<?> vVar) {
        return vVar == null ? super.mo5291i(null) : vVar.mo5420b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5292j(C0998g gVar, C1141v<?> vVar) {
        C1079h.C1080a aVar = this.f4074d;
        if (aVar != null && vVar != null) {
            aVar.mo5296a(vVar);
        }
    }
}
