package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C1696r;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.d */
public class C1676d {

    /* renamed from: a */
    private static C1676d f5563a = new C1676d();

    /* renamed from: b */
    private static Boolean f5564b;

    /* renamed from: a */
    public static C1676d m7927a() {
        return f5563a;
    }

    /* renamed from: d */
    private static void m7928d(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(C1674b.f5562a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e) {
            Log.wtf("WakeLockTracker", e);
        }
    }

    /* renamed from: e */
    private static boolean m7929e() {
        if (f5564b == null) {
            f5564b = Boolean.FALSE;
        }
        return f5564b.booleanValue();
    }

    /* renamed from: b */
    public void mo6581b(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        mo6582c(context, str, i, str2, str3, str4, i2, list, 0);
    }

    /* renamed from: c */
    public void mo6582c(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        if (m7929e()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                Log.e("WakeLockTracker", valueOf.length() != 0 ? "missing wakeLock key. ".concat(valueOf) : new String("missing wakeLock key. "));
            } else if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                WakeLockEvent wakeLockEvent = r0;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, C1675c.m7925b(list), str, SystemClock.elapsedRealtime(), C1696r.m7988a(context), str3, C1675c.m7926c(context.getPackageName()), C1696r.m7989b(context), j, str4, false);
                m7928d(context, wakeLockEvent);
            }
        }
    }
}
