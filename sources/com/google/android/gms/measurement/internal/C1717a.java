package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1658o;
import java.util.Map;
import p086f.p102e.C3190a;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C1717a extends C1756d2 {

    /* renamed from: b */
    private final Map<String, Long> f5614b = new C3190a();

    /* renamed from: c */
    private final Map<String, Integer> f5615c = new C3190a();

    /* renamed from: d */
    private long f5616d;

    public C1717a(C1807h5 h5Var) {
        super(h5Var);
    }

    /* renamed from: A */
    private final void m8048A(String str, long j, C1965u7 u7Var) {
        if (u7Var == null) {
            mo6709i().mo6772M().mo6885a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo6709i().mo6772M().mo6886b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C1953t7.m8858O(u7Var, bundle, true);
            mo6855p().mo7195X("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m8049B(long j) {
        for (String put : this.f5614b.keySet()) {
            this.f5614b.put(put, Long.valueOf(j));
        }
        if (!this.f5614b.isEmpty()) {
            this.f5616d = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m8051E(String str, long j) {
        mo6700b();
        C1658o.m7841f(str);
        if (this.f5615c.isEmpty()) {
            this.f5616d = j;
        }
        Integer num = this.f5615c.get(str);
        if (num != null) {
            this.f5615c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f5615c.size() >= 100) {
            mo6709i().mo6767H().mo6885a("Too many ads visible");
        } else {
            this.f5615c.put(str, 1);
            this.f5614b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m8052F(String str, long j) {
        mo6700b();
        C1658o.m7841f(str);
        Integer num = this.f5615c.get(str);
        if (num != null) {
            C1965u7 D = mo6858s().mo7347D(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f5615c.remove(str);
                Long l = this.f5614b.get(str);
                if (l == null) {
                    mo6709i().mo6764E().mo6885a("First ad unit exposure time was never set");
                } else {
                    this.f5614b.remove(str);
                    m8048A(str, j - l.longValue(), D);
                }
                if (this.f5615c.isEmpty()) {
                    long j2 = this.f5616d;
                    if (j2 == 0) {
                        mo6709i().mo6764E().mo6885a("First ad exposure time was never set");
                        return;
                    }
                    m8053w(j - j2, D);
                    this.f5616d = 0;
                    return;
                }
                return;
            }
            this.f5615c.put(str, Integer.valueOf(intValue));
            return;
        }
        mo6709i().mo6764E().mo6886b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: w */
    private final void m8053w(long j, C1965u7 u7Var) {
        if (u7Var == null) {
            mo6709i().mo6772M().mo6885a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo6709i().mo6772M().mo6886b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C1953t7.m8858O(u7Var, bundle, true);
            mo6855p().mo7195X("am", "_xa", bundle);
        }
    }

    /* renamed from: D */
    public final void mo6685D(String str, long j) {
        if (str == null || str.length() == 0) {
            mo6709i().mo6764E().mo6885a("Ad unit id must be a non-empty string");
        } else {
            mo6706e().mo6703y(new C1730b0(this, str, j));
        }
    }

    /* renamed from: v */
    public final void mo6686v(long j) {
        C1965u7 D = mo6858s().mo7347D(false);
        for (String next : this.f5614b.keySet()) {
            m8048A(next, j - this.f5614b.get(next).longValue(), D);
        }
        if (!this.f5614b.isEmpty()) {
            m8053w(j - this.f5616d, D);
        }
        m8049B(j);
    }

    /* renamed from: z */
    public final void mo6687z(String str, long j) {
        if (str == null || str.length() == 0) {
            mo6709i().mo6764E().mo6885a("Ad unit id must be a non-empty string");
        } else {
            mo6706e().mo6703y(new C1743c1(this, str, j));
        }
    }
}
