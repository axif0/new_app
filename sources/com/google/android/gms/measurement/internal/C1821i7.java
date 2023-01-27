package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
final class C1821i7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1765e f5924f;

    /* renamed from: g */
    private final /* synthetic */ long f5925g;

    /* renamed from: h */
    private final /* synthetic */ int f5926h;

    /* renamed from: i */
    private final /* synthetic */ long f5927i;

    /* renamed from: j */
    private final /* synthetic */ boolean f5928j;

    /* renamed from: k */
    private final /* synthetic */ C1856l6 f5929k;

    C1821i7(C1856l6 l6Var, C1765e eVar, long j, int i, long j2, boolean z) {
        this.f5929k = l6Var;
        this.f5924f = eVar;
        this.f5925g = j;
        this.f5926h = i;
        this.f5927i = j2;
        this.f5928j = z;
    }

    public final void run() {
        this.f5929k.mo7187I(this.f5924f);
        this.f5929k.mo7184F(this.f5925g, false);
        this.f5929k.m8650K(this.f5924f, this.f5926h, this.f5927i, true, this.f5928j);
    }
}
