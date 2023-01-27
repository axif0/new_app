package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
final class C1915q5 implements Callable<List<C1968ua>> {

    /* renamed from: a */
    private final /* synthetic */ String f6188a;

    /* renamed from: b */
    private final /* synthetic */ String f6189b;

    /* renamed from: c */
    private final /* synthetic */ String f6190c;

    /* renamed from: d */
    private final /* synthetic */ C1819i5 f6191d;

    C1915q5(C1819i5 i5Var, String str, String str2, String str3) {
        this.f6191d = i5Var;
        this.f6188a = str;
        this.f6189b = str2;
        this.f6190c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f6191d.f5917a.mo7456i0();
        return this.f6191d.f5917a.mo7446Z().mo6833k0(this.f6188a, this.f6189b, this.f6190c);
    }
}
