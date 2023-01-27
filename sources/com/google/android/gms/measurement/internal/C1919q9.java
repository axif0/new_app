package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1682e;

/* renamed from: com.google.android.gms.measurement.internal.q9 */
final class C1919q9 {

    /* renamed from: a */
    private final C1682e f6200a;

    /* renamed from: b */
    private long f6201b;

    public C1919q9(C1682e eVar) {
        C1658o.m7845j(eVar);
        this.f6200a = eVar;
    }

    /* renamed from: a */
    public final void mo7314a() {
        this.f6201b = this.f6200a.mo6585a();
    }

    /* renamed from: b */
    public final boolean mo7315b(long j) {
        return this.f6201b == 0 || this.f6200a.mo6585a() - this.f6201b >= 3600000;
    }

    /* renamed from: c */
    public final void mo7316c() {
        this.f6201b = 0;
    }
}
