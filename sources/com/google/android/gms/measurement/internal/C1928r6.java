package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
final class C1928r6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f6224f;

    /* renamed from: g */
    private final /* synthetic */ C1856l6 f6225g;

    C1928r6(C1856l6 l6Var, long j) {
        this.f6225g = l6Var;
        this.f6224f = j;
    }

    public final void run() {
        this.f6225g.mo6711k().f6146q.mo7344b(this.f6224f);
        this.f6225g.mo6709i().mo6771L().mo6886b("Session timeout duration set", Long.valueOf(this.f6224f));
    }
}
