package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import p148g.p189d.p190a.p232c.p241f.p247f.C4813ub;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
final class C1931r9 {

    /* renamed from: a */
    final /* synthetic */ C1835j9 f6232a;

    C1931r9(C1835j9 j9Var) {
        this.f6232a = j9Var;
    }

    /* renamed from: c */
    private final void m8825c(long j, boolean z) {
        this.f6232a.mo6700b();
        if (this.f6232a.f5634a.mo7044p()) {
            this.f6232a.mo6711k().f6150u.mo7344b(j);
            this.f6232a.mo6709i().mo6772M().mo6886b("Session started, time", Long.valueOf(this.f6232a.mo6708g().mo6585a()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f6232a.mo6855p().mo7197Z("auto", "_sid", valueOf, j);
            this.f6232a.mo6711k().f6147r.mo7325a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f6232a.mo6712l().mo7415s(C1957u.f6379m0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f6232a.mo6855p().mo7193U("auto", "_s", j, bundle);
            if (C4813ub.m20481b() && this.f6232a.mo6712l().mo7415s(C1957u.f6389r0)) {
                String a = this.f6232a.mo6711k().f6155z.mo7377a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f6232a.mo6855p().mo7193U("auto", "_ssr", j, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7330a() {
        this.f6232a.mo6700b();
        if (this.f6232a.mo6711k().mo7291x(this.f6232a.mo6708g().mo6587c())) {
            this.f6232a.mo6711k().f6147r.mo7325a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f6232a.mo6709i().mo6772M().mo6885a("Detected application was in foreground");
                m8825c(this.f6232a.mo6708g().mo6587c(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7331b(long j, boolean z) {
        this.f6232a.mo6700b();
        this.f6232a.m8623F();
        if (this.f6232a.mo6711k().mo7291x(j)) {
            this.f6232a.mo6711k().f6147r.mo7325a(true);
        }
        this.f6232a.mo6711k().f6150u.mo7344b(j);
        if (this.f6232a.mo6711k().f6147r.mo7326b()) {
            m8825c(j, z);
        }
    }
}
