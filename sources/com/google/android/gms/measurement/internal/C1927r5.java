package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
final class C1927r5 implements Callable<List<C1968ua>> {

    /* renamed from: a */
    private final /* synthetic */ C1860la f6220a;

    /* renamed from: b */
    private final /* synthetic */ String f6221b;

    /* renamed from: c */
    private final /* synthetic */ String f6222c;

    /* renamed from: d */
    private final /* synthetic */ C1819i5 f6223d;

    C1927r5(C1819i5 i5Var, C1860la laVar, String str, String str2) {
        this.f6223d = i5Var;
        this.f6220a = laVar;
        this.f6221b = str;
        this.f6222c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f6223d.f5917a.mo7456i0();
        return this.f6223d.f5917a.mo7446Z().mo6833k0(this.f6220a.f6014f, this.f6221b, this.f6222c);
    }
}
