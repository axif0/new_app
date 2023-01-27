package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
final class C1725a7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f5635f;

    /* renamed from: g */
    private final /* synthetic */ String f5636g;

    /* renamed from: h */
    private final /* synthetic */ String f5637h;

    /* renamed from: i */
    private final /* synthetic */ String f5638i;

    /* renamed from: j */
    private final /* synthetic */ boolean f5639j;

    /* renamed from: k */
    private final /* synthetic */ C1856l6 f5640k;

    C1725a7(C1856l6 l6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f5640k = l6Var;
        this.f5635f = atomicReference;
        this.f5636g = str;
        this.f5637h = str2;
        this.f5638i = str3;
        this.f5639j = z;
    }

    public final void run() {
        this.f5640k.f5634a.mo7033P().mo6790T(this.f5635f, this.f5636g, this.f5637h, this.f5638i, this.f5639j);
    }
}
