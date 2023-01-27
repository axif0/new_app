package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: com.google.android.gms.common.internal.m0 */
public final class C1654m0 {

    /* renamed from: a */
    private static Object f5519a = new Object();

    /* renamed from: b */
    private static boolean f5520b;

    /* renamed from: c */
    private static String f5521c;

    /* renamed from: d */
    private static int f5522d;

    /* renamed from: a */
    public static String m7829a(Context context) {
        m7831c(context);
        return f5521c;
    }

    /* renamed from: b */
    public static int m7830b(Context context) {
        m7831c(context);
        return f5522d;
    }

    /* renamed from: c */
    private static void m7831c(Context context) {
        synchronized (f5519a) {
            if (!f5520b) {
                f5520b = true;
                try {
                    Bundle bundle = C4389c.m18627a(context).mo13715c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f5521c = bundle.getString("com.google.app.id");
                        f5522d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
