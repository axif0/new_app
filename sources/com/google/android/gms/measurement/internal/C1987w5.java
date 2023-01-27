package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
final class C1987w5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1776ea f6484f;

    /* renamed from: g */
    private final /* synthetic */ C1860la f6485g;

    /* renamed from: h */
    private final /* synthetic */ C1819i5 f6486h;

    C1987w5(C1819i5 i5Var, C1776ea eaVar, C1860la laVar) {
        this.f6486h = i5Var;
        this.f6484f = eaVar;
        this.f6485g = laVar;
    }

    public final void run() {
        this.f6486h.f5917a.mo7456i0();
        if (this.f6484f.mo6894d() == null) {
            this.f6486h.f5917a.mo7438Q(this.f6484f, this.f6485g);
        } else {
            this.f6486h.f5917a.mo7463v(this.f6484f, this.f6485g);
        }
    }
}
