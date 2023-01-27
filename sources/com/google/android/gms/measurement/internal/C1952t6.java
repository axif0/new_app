package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
final class C1952t6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6275f;

    /* renamed from: g */
    private final /* synthetic */ String f6276g;

    /* renamed from: h */
    private final /* synthetic */ Object f6277h;

    /* renamed from: i */
    private final /* synthetic */ long f6278i;

    /* renamed from: j */
    private final /* synthetic */ C1856l6 f6279j;

    C1952t6(C1856l6 l6Var, String str, String str2, Object obj, long j) {
        this.f6279j = l6Var;
        this.f6275f = str;
        this.f6276g = str2;
        this.f6277h = obj;
        this.f6278i = j;
    }

    public final void run() {
        this.f6279j.mo7197Z(this.f6275f, this.f6276g, this.f6277h, this.f6278i);
    }
}
