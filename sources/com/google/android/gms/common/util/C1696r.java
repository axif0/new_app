package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.r */
public final class C1696r {

    /* renamed from: a */
    private static final IntentFilter f5581a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f5582b;

    /* renamed from: c */
    private static float f5583c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m7988a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, f5581a);
        int i = 0;
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C1689l.m7963f() ? powerManager.isInteractive() : powerManager.isScreenOn()) {
            i = 2;
        }
        return i | i2;
    }

    /* renamed from: b */
    public static synchronized float m7989b(Context context) {
        synchronized (C1696r.class) {
            if (SystemClock.elapsedRealtime() - f5582b >= 60000 || Float.isNaN(f5583c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, f5581a);
                if (registerReceiver != null) {
                    f5583c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f5582b = SystemClock.elapsedRealtime();
                float f = f5583c;
                return f;
            }
            float f2 = f5583c;
            return f2;
        }
    }
}
