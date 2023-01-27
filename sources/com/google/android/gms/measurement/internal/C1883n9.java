package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
final class C1883n9 implements Runnable {

    /* renamed from: f */
    long f6086f;

    /* renamed from: g */
    long f6087g;

    /* renamed from: h */
    final /* synthetic */ C1847k9 f6088h;

    C1883n9(C1847k9 k9Var, long j, long j2) {
        this.f6088h = k9Var;
        this.f6086f = j;
        this.f6087g = j2;
    }

    public final void run() {
        this.f6088h.f5976b.mo6706e().mo6703y(new C1871m9(this));
    }
}
