package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import p148g.p189d.p190a.p232c.p241f.p247f.C4478bf;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
public final class C1835j9 extends C1783f5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f5950c;

    /* renamed from: d */
    protected final C1931r9 f5951d = new C1931r9(this);

    /* renamed from: e */
    protected final C1907p9 f5952e = new C1907p9(this);

    /* renamed from: f */
    private final C1847k9 f5953f = new C1847k9(this);

    C1835j9(C1807h5 h5Var) {
        super(h5Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m8623F() {
        mo6700b();
        if (this.f5950c == null) {
            this.f5950c = new C4478bf(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m8625H(long j) {
        mo6700b();
        m8623F();
        mo6709i().mo6772M().mo6886b("Activity resumed, time", Long.valueOf(j));
        if (mo6712l().mo7415s(C1957u.f6401x0)) {
            if (mo6712l().mo7403H().booleanValue() || mo6711k().f6152w.mo7326b()) {
                this.f5952e.mo7299b(j);
            }
            this.f5953f.mo7172a();
        } else {
            this.f5953f.mo7172a();
            if (mo6712l().mo7403H().booleanValue()) {
                this.f5952e.mo7299b(j);
            }
        }
        C1931r9 r9Var = this.f5951d;
        r9Var.f6232a.mo6700b();
        if (r9Var.f6232a.f5634a.mo7044p()) {
            if (!r9Var.f6232a.mo6712l().mo7415s(C1957u.f6401x0)) {
                r9Var.f6232a.mo6711k().f6152w.mo7325a(false);
            }
            r9Var.mo7331b(r9Var.f6232a.mo6708g().mo6587c(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m8627J(long j) {
        mo6700b();
        m8623F();
        mo6709i().mo6772M().mo6886b("Activity paused, time", Long.valueOf(j));
        this.f5953f.mo7173b(j);
        if (mo6712l().mo7403H().booleanValue()) {
            this.f5952e.mo7302f(j);
        }
        C1931r9 r9Var = this.f5951d;
        if (!r9Var.f6232a.mo6712l().mo7415s(C1957u.f6401x0)) {
            r9Var.f6232a.mo6711k().f6152w.mo7325a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final long mo7155B(long j) {
        return this.f5952e.mo7303g(j);
    }

    /* renamed from: E */
    public final boolean mo7156E(boolean z, boolean z2, long j) {
        return this.f5952e.mo7300d(z, z2, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo6801z() {
        return false;
    }
}
