package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
final class C1869m7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f6058f;

    /* renamed from: g */
    private final /* synthetic */ Uri f6059g;

    /* renamed from: h */
    private final /* synthetic */ String f6060h;

    /* renamed from: i */
    private final /* synthetic */ String f6061i;

    /* renamed from: j */
    private final /* synthetic */ C1833j7 f6062j;

    C1869m7(C1833j7 j7Var, boolean z, Uri uri, String str, String str2) {
        this.f6062j = j7Var;
        this.f6058f = z;
        this.f6059g = uri;
        this.f6060h = str;
        this.f6061i = str2;
    }

    public final void run() {
        this.f6062j.m8620b(this.f6058f, this.f6059g, this.f6060h, this.f6061i);
    }
}
