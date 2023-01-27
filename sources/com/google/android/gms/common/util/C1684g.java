package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C1658o;

/* renamed from: com.google.android.gms.common.util.g */
public final class C1684g {
    /* renamed from: a */
    public static boolean m7944a(Context context, Throwable th) {
        return m7945b(context, th, 536870912);
    }

    /* renamed from: b */
    private static boolean m7945b(Context context, Throwable th, int i) {
        try {
            C1658o.m7845j(context);
            C1658o.m7845j(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
