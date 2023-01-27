package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
final class C1940s6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f6252f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f6253g;

    C1940s6(C1856l6 l6Var, long j) {
        this.f6253g = l6Var;
        this.f6252f = j;
    }

    public final void run() {
        this.f6253g.mo6711k().f6145p.mo7344b(this.f6252f);
        this.f6253g.mo6709i().mo6771L().mo6886b("Minimum session duration set", Long.valueOf(this.f6252f));
    }
}
