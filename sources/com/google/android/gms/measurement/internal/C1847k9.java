package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
final class C1847k9 {

    /* renamed from: a */
    private C1883n9 f5975a;

    /* renamed from: b */
    final /* synthetic */ C1835j9 f5976b;

    C1847k9(C1835j9 j9Var) {
        this.f5976b = j9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7172a() {
        this.f5976b.mo6700b();
        if (this.f5976b.mo6712l().mo7415s(C1957u.f6377l0) && this.f5975a != null) {
            this.f5976b.f5950c.removeCallbacks(this.f5975a);
        }
        if (this.f5976b.mo6712l().mo7415s(C1957u.f6401x0)) {
            this.f5976b.mo6711k().f6152w.mo7325a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7173b(long j) {
        if (this.f5976b.mo6712l().mo7415s(C1957u.f6377l0)) {
            this.f5975a = new C1883n9(this, this.f5976b.mo6708g().mo6587c(), j);
            this.f5976b.f5950c.postDelayed(this.f5975a, 2000);
        }
    }
}
