package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.u */
final class C1667u extends C1633e {

    /* renamed from: f */
    private final /* synthetic */ Intent f5537f;

    /* renamed from: g */
    private final /* synthetic */ Activity f5538g;

    /* renamed from: h */
    private final /* synthetic */ int f5539h;

    C1667u(Intent intent, Activity activity, int i) {
        this.f5537f = intent;
        this.f5538g = activity;
        this.f5539h = i;
    }

    /* renamed from: b */
    public final void mo6528b() {
        Intent intent = this.f5537f;
        if (intent != null) {
            this.f5538g.startActivityForResult(intent, this.f5539h);
        }
    }
}
