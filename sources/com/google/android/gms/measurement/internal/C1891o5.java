package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
final class C1891o5 implements Callable<List<C1800ga>> {

    /* renamed from: a */
    private final /* synthetic */ String f6105a;

    /* renamed from: b */
    private final /* synthetic */ String f6106b;

    /* renamed from: c */
    private final /* synthetic */ String f6107c;

    /* renamed from: d */
    private final /* synthetic */ C1819i5 f6108d;

    C1891o5(C1819i5 i5Var, String str, String str2, String str3) {
        this.f6108d = i5Var;
        this.f6105a = str;
        this.f6106b = str2;
        this.f6107c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f6108d.f5917a.mo7456i0();
        return this.f6108d.f5917a.mo7446Z().mo6820K(this.f6105a, this.f6106b, this.f6107c);
    }
}
