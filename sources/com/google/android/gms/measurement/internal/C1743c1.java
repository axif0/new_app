package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c1 */
final class C1743c1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f5681f;

    /* renamed from: g */
    private final /* synthetic */ long f5682g;

    /* renamed from: h */
    private final /* synthetic */ C1717a f5683h;

    C1743c1(C1717a aVar, String str, long j) {
        this.f5683h = aVar;
        this.f5681f = str;
        this.f5682g = j;
    }

    public final void run() {
        this.f5683h.m8051E(this.f5681f, this.f5682g);
    }
}
