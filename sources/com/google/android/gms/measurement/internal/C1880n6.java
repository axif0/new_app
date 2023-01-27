package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n6 */
final /* synthetic */ class C1880n6 implements Runnable {

    /* renamed from: f */
    private final C1856l6 f6083f;

    C1880n6(C1856l6 l6Var) {
        this.f6083f = l6Var;
    }

    public final void run() {
        C1856l6 l6Var = this.f6083f;
        l6Var.mo6700b();
        if (l6Var.mo6711k().f6153x.mo7326b()) {
            l6Var.mo6709i().mo6771L().mo6885a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = l6Var.mo6711k().f6154y.mo7343a();
        l6Var.mo6711k().f6154y.mo7344b(1 + a);
        if (a >= 5) {
            l6Var.mo6709i().mo6767H().mo6885a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            l6Var.mo6711k().f6153x.mo7325a(true);
            return;
        }
        l6Var.f5634a.mo7050v();
    }
}
