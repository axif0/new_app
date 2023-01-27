package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C1658o;
import p148g.p189d.p190a.p232c.p241f.p247f.C4478bf;

/* renamed from: com.google.android.gms.measurement.internal.k */
abstract class C1837k {

    /* renamed from: d */
    private static volatile Handler f5955d;

    /* renamed from: a */
    private final C1748c6 f5956a;

    /* renamed from: b */
    private final Runnable f5957b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f5958c;

    C1837k(C1748c6 c6Var) {
        C1658o.m7845j(c6Var);
        this.f5956a = c6Var;
        this.f5957b = new C1825j(this, c6Var);
    }

    /* renamed from: f */
    private final Handler m8633f() {
        Handler handler;
        if (f5955d != null) {
            return f5955d;
        }
        synchronized (C1837k.class) {
            if (f5955d == null) {
                f5955d = new C4478bf(this.f5956a.mo6710j().getMainLooper());
            }
            handler = f5955d;
        }
        return handler;
    }

    /* renamed from: b */
    public abstract void mo6736b();

    /* renamed from: c */
    public final void mo7165c(long j) {
        mo7167e();
        if (j >= 0) {
            this.f5958c = this.f5956a.mo6708g().mo6587c();
            if (!m8633f().postDelayed(this.f5957b, j)) {
                this.f5956a.mo6709i().mo6764E().mo6886b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: d */
    public final boolean mo7166d() {
        return this.f5958c != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo7167e() {
        this.f5958c = 0;
        m8633f().removeCallbacks(this.f5957b);
    }
}
