package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
final class C1939s5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1860la f6250f;

    /* renamed from: g */
    private final /* synthetic */ C1819i5 f6251g;

    C1939s5(C1819i5 i5Var, C1860la laVar) {
        this.f6251g = i5Var;
        this.f6250f = laVar;
    }

    public final void run() {
        this.f6251g.f5917a.mo7456i0();
        C2003x9 r = this.f6251g.f5917a;
        C1860la laVar = this.f6250f;
        if (C4602ib.m19620b() && r.mo7437L().mo7415s(C1957u.f6340Q0)) {
            r.mo6706e().mo6700b();
            r.mo7453g0();
            C1658o.m7841f(laVar.f6014f);
            C1765e b = C1765e.m8334b(laVar.f6013B);
            C1765e b2 = r.mo7447b(laVar.f6014f);
            r.mo7435B(laVar.f6014f, b);
            if (b.mo6875h(b2)) {
                r.mo7464w(laVar);
            }
        }
    }
}
