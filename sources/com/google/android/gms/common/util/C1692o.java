package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p148g.p189d.p190a.p232c.p237d.C4380k;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: com.google.android.gms.common.util.o */
public final class C1692o {
    /* renamed from: a */
    public static boolean m7972a(Context context, int i) {
        if (!m7973b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C4380k.m18605a(context).mo13710b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m7973b(Context context, int i, String str) {
        return C4389c.m18627a(context).mo13721i(i, str);
    }
}
