package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
final class C1843k5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1860la f5969f;

    /* renamed from: g */
    private final /* synthetic */ C1819i5 f5970g;

    C1843k5(C1819i5 i5Var, C1860la laVar) {
        this.f5970g = i5Var;
        this.f5969f = laVar;
    }

    public final void run() {
        this.f5970g.f5917a.mo7456i0();
        C2003x9 r = this.f5970g.f5917a;
        C1860la laVar = this.f5969f;
        r.mo6706e().mo6700b();
        r.mo7453g0();
        C1658o.m7841f(laVar.f6014f);
        r.mo7442U(laVar);
    }
}
