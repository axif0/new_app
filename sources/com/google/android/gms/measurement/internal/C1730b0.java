package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b0 */
final class C1730b0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f5647f;

    /* renamed from: g */
    private final /* synthetic */ long f5648g;

    /* renamed from: h */
    private final /* synthetic */ C1717a f5649h;

    C1730b0(C1717a aVar, String str, long j) {
        this.f5649h = aVar;
        this.f5647f = str;
        this.f5648g = j;
    }

    public final void run() {
        this.f5649h.m8052F(this.f5647f, this.f5648g);
    }
}
