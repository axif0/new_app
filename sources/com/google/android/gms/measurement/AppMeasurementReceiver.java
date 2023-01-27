package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2011y4;
import com.google.android.gms.measurement.internal.C2022z4;
import p086f.p135n.p136a.C3457a;

public final class AppMeasurementReceiver extends C3457a implements C2011y4 {

    /* renamed from: c */
    private C2022z4 f5605c;

    /* renamed from: a */
    public final void mo6629a(Context context, Intent intent) {
        C3457a.m14937c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f5605c == null) {
            this.f5605c = new C2022z4(this);
        }
        this.f5605c.mo7481a(context, intent);
    }
}
