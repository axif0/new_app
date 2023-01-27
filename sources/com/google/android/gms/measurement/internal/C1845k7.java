package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
final class C1845k7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f5971f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f5972g;

    C1845k7(C1856l6 l6Var, boolean z) {
        this.f5972g = l6Var;
        this.f5971f = z;
    }

    public final void run() {
        boolean p = this.f5972g.f5634a.mo7044p();
        boolean T = this.f5972g.f5634a.mo7037T();
        this.f5972g.f5634a.mo7043o(this.f5971f);
        if (T == this.f5971f) {
            this.f5972g.f5634a.mo6709i().mo6772M().mo6886b("Default data collection state already set to", Boolean.valueOf(this.f5971f));
        }
        if (this.f5972g.f5634a.mo7044p() == p || this.f5972g.f5634a.mo7044p() != this.f5972g.f5634a.mo7037T()) {
            this.f5972g.f5634a.mo6709i().mo6769J().mo6887c("Default data collection is different than actual status", Boolean.valueOf(this.f5971f), Boolean.valueOf(p));
        }
        this.f5972g.m8657o0();
    }
}
