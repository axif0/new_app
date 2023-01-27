package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
final class C1809h7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1765e f5901f;

    /* renamed from: g */
    private final /* synthetic */ int f5902g;

    /* renamed from: h */
    private final /* synthetic */ long f5903h;

    /* renamed from: i */
    private final /* synthetic */ boolean f5904i;

    /* renamed from: j */
    private final /* synthetic */ C1856l6 f5905j;

    C1809h7(C1856l6 l6Var, C1765e eVar, int i, long j, boolean z) {
        this.f5905j = l6Var;
        this.f5901f = eVar;
        this.f5902g = i;
        this.f5903h = j;
        this.f5904i = z;
    }

    public final void run() {
        this.f5905j.mo7187I(this.f5901f);
        this.f5905j.m8650K(this.f5901f, this.f5902g, this.f5903h, false, this.f5904i);
    }
}
