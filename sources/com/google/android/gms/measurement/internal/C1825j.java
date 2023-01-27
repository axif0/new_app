package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j */
final class C1825j implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1748c6 f5939f;

    /* renamed from: g */
    private final /* synthetic */ C1837k f5940g;

    C1825j(C1837k kVar, C1748c6 c6Var) {
        this.f5940g = kVar;
        this.f5939f = c6Var;
    }

    public final void run() {
        this.f5939f.mo6713n();
        if (C1980va.m9035a()) {
            this.f5939f.mo6706e().mo6703y(this);
            return;
        }
        boolean d = this.f5940g.mo7166d();
        long unused = this.f5940g.f5958c = 0;
        if (d) {
            this.f5940g.mo6736b();
        }
    }
}
