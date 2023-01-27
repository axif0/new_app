package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m5 */
final class C1867m5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1968ua f6047f;

    /* renamed from: g */
    private final /* synthetic */ C1819i5 f6048g;

    C1867m5(C1819i5 i5Var, C1968ua uaVar) {
        this.f6048g = i5Var;
        this.f6047f = uaVar;
    }

    public final void run() {
        this.f6048g.f5917a.mo7456i0();
        if (this.f6047f.f6436h.mo6894d() == null) {
            this.f6048g.f5917a.mo7440S(this.f6047f);
        } else {
            this.f6048g.f5917a.mo7465x(this.f6047f);
        }
    }
}
