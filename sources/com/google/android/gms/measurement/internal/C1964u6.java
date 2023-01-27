package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.u6 */
final class C1964u6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6413f;

    /* renamed from: g */
    private final /* synthetic */ String f6414g;

    /* renamed from: h */
    private final /* synthetic */ long f6415h;

    /* renamed from: i */
    private final /* synthetic */ Bundle f6416i;

    /* renamed from: j */
    private final /* synthetic */ boolean f6417j;

    /* renamed from: k */
    private final /* synthetic */ boolean f6418k;

    /* renamed from: l */
    private final /* synthetic */ boolean f6419l;

    /* renamed from: m */
    private final /* synthetic */ String f6420m;

    /* renamed from: n */
    private final /* synthetic */ C1856l6 f6421n;

    C1964u6(C1856l6 l6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f6421n = l6Var;
        this.f6413f = str;
        this.f6414g = str2;
        this.f6415h = j;
        this.f6416i = bundle;
        this.f6417j = z;
        this.f6418k = z2;
        this.f6419l = z3;
        this.f6420m = str3;
    }

    public final void run() {
        this.f6421n.mo7194V(this.f6413f, this.f6414g, this.f6415h, this.f6416i, this.f6417j, this.f6418k, this.f6419l, this.f6420m);
    }
}
