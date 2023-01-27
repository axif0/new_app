package com.google.android.youtube.player;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.youtube.player.p042f.C2497r;
import java.util.List;

/* renamed from: com.google.android.youtube.player.c */
public final class C2456c {
    /* renamed from: a */
    static Intent m11128a(Intent intent, Context context) {
        intent.putExtra("app_package", context.getPackageName()).putExtra("app_version", C2497r.m11235h(context)).putExtra("client_library_version", C2497r.m11229b());
        return intent;
    }

    /* renamed from: b */
    private static String m11129b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return C2497r.m11234g(packageManager) ? "com.google.android.youtube.tv" : C2497r.m11232e(packageManager) ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
    }

    /* renamed from: c */
    private static boolean m11130c(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && !queryIntentActivities.isEmpty();
    }

    /* renamed from: d */
    private static boolean m11131d(Context context, Uri uri) {
        return m11130c(context, new Intent("android.intent.action.VIEW", uri).setPackage(m11129b(context)));
    }

    /* renamed from: e */
    public static boolean m11132e(Context context) {
        return m11131d(context, Uri.parse("https://www.youtube.com/watch?v="));
    }

    /* renamed from: f */
    public static boolean m11133f(Context context) {
        int g = m11134g(context);
        PackageManager packageManager = context.getPackageManager();
        return (C2497r.m11234g(packageManager) || (!C2497r.m11232e(packageManager) ? g >= 3300 : g >= Integer.MAX_VALUE)) && m11132e(context);
    }

    /* renamed from: g */
    public static int m11134g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(m11129b(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }
}
