package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
final class C1737b7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f5672f;

    /* renamed from: g */
    private final /* synthetic */ String f5673g;

    /* renamed from: h */
    private final /* synthetic */ String f5674h;

    /* renamed from: i */
    private final /* synthetic */ String f5675i;

    /* renamed from: j */
    private final /* synthetic */ C1856l6 f5676j;

    C1737b7(C1856l6 l6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f5676j = l6Var;
        this.f5672f = atomicReference;
        this.f5673g = str;
        this.f5674h = str2;
        this.f5675i = str3;
    }

    public final void run() {
        this.f5676j.f5634a.mo7033P().mo6789S(this.f5672f, this.f5673g, this.f5674h, this.f5675i);
    }
}
