package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
final class C1903p5 implements Callable<List<C1800ga>> {

    /* renamed from: a */
    private final /* synthetic */ C1860la f6156a;

    /* renamed from: b */
    private final /* synthetic */ String f6157b;

    /* renamed from: c */
    private final /* synthetic */ String f6158c;

    /* renamed from: d */
    private final /* synthetic */ C1819i5 f6159d;

    C1903p5(C1819i5 i5Var, C1860la laVar, String str, String str2) {
        this.f6159d = i5Var;
        this.f6156a = laVar;
        this.f6157b = str;
        this.f6158c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f6159d.f5917a.mo7456i0();
        return this.f6159d.f5917a.mo7446Z().mo6820K(this.f6156a.f6014f, this.f6157b, this.f6158c);
    }
}
