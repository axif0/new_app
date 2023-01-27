package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
final class C1963u5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1933s f6410f;

    /* renamed from: g */
    private final /* synthetic */ String f6411g;

    /* renamed from: h */
    private final /* synthetic */ C1819i5 f6412h;

    C1963u5(C1819i5 i5Var, C1933s sVar, String str) {
        this.f6412h = i5Var;
        this.f6410f = sVar;
        this.f6411g = str;
    }

    public final void run() {
        this.f6412h.f5917a.mo7456i0();
        this.f6412h.f5917a.mo7461q(this.f6410f, this.f6411g);
    }
}
