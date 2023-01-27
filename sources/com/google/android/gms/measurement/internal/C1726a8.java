package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
final class C1726a8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1965u7 f5641f;

    /* renamed from: g */
    private final /* synthetic */ long f5642g;

    /* renamed from: h */
    private final /* synthetic */ C1953t7 f5643h;

    C1726a8(C1953t7 t7Var, C1965u7 u7Var, long j) {
        this.f5643h = t7Var;
        this.f5641f = u7Var;
        this.f5642g = j;
    }

    public final void run() {
        this.f5643h.m8860Q(this.f5641f, false, this.f5642g);
        C1953t7 t7Var = this.f5643h;
        t7Var.f6282e = null;
        t7Var.mo6857r().mo6785M((C1965u7) null);
    }
}
