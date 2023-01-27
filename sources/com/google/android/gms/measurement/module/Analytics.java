package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.measurement.internal.C1807h5;
import p148g.p189d.p190a.p232c.p241f.p247f.C4515e;

public class Analytics {

    /* renamed from: a */
    private static volatile Analytics f6575a;

    private Analytics(C1807h5 h5Var) {
        C1658o.m7845j(h5Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (f6575a == null) {
            synchronized (Analytics.class) {
                if (f6575a == null) {
                    f6575a = new Analytics(C1807h5.m8537a(context, (C4515e) null, (Long) null));
                }
            }
        }
        return f6575a;
    }
}
