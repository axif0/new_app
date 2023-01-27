package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
final class C1762d8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f5734f;

    /* renamed from: g */
    private final /* synthetic */ C1776ea f5735g;

    /* renamed from: h */
    private final /* synthetic */ C1860la f5736h;

    /* renamed from: i */
    private final /* synthetic */ C1750c8 f5737i;

    C1762d8(C1750c8 c8Var, boolean z, C1776ea eaVar, C1860la laVar) {
        this.f5737i = c8Var;
        this.f5734f = z;
        this.f5735g = eaVar;
        this.f5736h = laVar;
    }

    public final void run() {
        C1961u3 l0 = this.f5737i.f5703d;
        if (l0 == null) {
            this.f5737i.mo6709i().mo6764E().mo6885a("Discarding data. Failed to set user property");
            return;
        }
        this.f5737i.mo6784L(l0, this.f5734f ? null : this.f5735g, this.f5736h);
        this.f5737i.m8205e0();
    }
}
