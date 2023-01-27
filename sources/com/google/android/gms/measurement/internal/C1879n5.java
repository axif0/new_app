package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
final class C1879n5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1968ua f6080f;

    /* renamed from: g */
    private final /* synthetic */ C1860la f6081g;

    /* renamed from: h */
    private final /* synthetic */ C1819i5 f6082h;

    C1879n5(C1819i5 i5Var, C1968ua uaVar, C1860la laVar) {
        this.f6082h = i5Var;
        this.f6080f = uaVar;
        this.f6081g = laVar;
    }

    public final void run() {
        this.f6082h.f5917a.mo7456i0();
        if (this.f6080f.f6436h.mo6894d() == null) {
            this.f6082h.f5917a.mo7441T(this.f6080f, this.f6081g);
        } else {
            this.f6082h.f5917a.mo7466y(this.f6080f, this.f6081g);
        }
    }
}
