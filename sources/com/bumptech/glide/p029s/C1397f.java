package com.bumptech.glide.p029s;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.s.f */
public final class C1397f {

    /* renamed from: a */
    private static final double f4790a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f4790a = d;
    }

    /* renamed from: a */
    public static double m6955a(long j) {
        double b = (double) (m6956b() - j);
        double d = f4790a;
        Double.isNaN(b);
        return b * d;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m6956b() {
        return Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}
