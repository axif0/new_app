package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b6 */
final class C1736b6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f5667f;

    /* renamed from: g */
    private final /* synthetic */ String f5668g;

    /* renamed from: h */
    private final /* synthetic */ String f5669h;

    /* renamed from: i */
    private final /* synthetic */ long f5670i;

    /* renamed from: j */
    private final /* synthetic */ C1819i5 f5671j;

    C1736b6(C1819i5 i5Var, String str, String str2, String str3, long j) {
        this.f5671j = i5Var;
        this.f5667f = str;
        this.f5668g = str2;
        this.f5669h = str3;
        this.f5670i = j;
    }

    public final void run() {
        String str = this.f5667f;
        if (str == null) {
            this.f5671j.f5917a.mo7459k0().mo7032O().mo7352R(this.f5668g, (C1965u7) null);
            return;
        }
        this.f5671j.f5917a.mo7459k0().mo7032O().mo7352R(this.f5668g, new C1965u7(this.f5669h, str, this.f5670i));
    }
}
