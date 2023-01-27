package com.google.android.youtube.player.p042f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: com.google.android.youtube.player.f.r */
public final class C2497r {

    /* renamed from: a */
    private static final Uri f8162a = Uri.parse("http://play.google.com/store/apps/details");

    /* renamed from: b */
    private static final String[] f8163b = {"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms", null};

    /* renamed from: a */
    public static Intent m11228a(String str) {
        Uri fromParts = Uri.fromParts("package", str, (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: b */
    public static String m11229b() {
        StringBuilder sb = new StringBuilder(35);
        sb.append(1);
        sb.append(".2.2");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m11230c(Context context) {
        ServiceInfo serviceInfo;
        String str;
        PackageManager packageManager = context.getPackageManager();
        for (String str2 : f8163b) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(str2), 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null && (str = serviceInfo.packageName) != null) {
                return str;
            }
        }
        return packageManager.hasSystemFeature("android.software.leanback") ? "com.google.android.youtube.tv" : packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
    }

    /* renamed from: d */
    public static boolean m11231d(Context context, String str) {
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            if (str.equals("com.google.android.youtube.googletvdev")) {
                str = "com.google.android.youtube.googletv";
            }
            int identifier = resourcesForApplication.getIdentifier("youtube_api_version_code", "integer", str);
            return identifier == 0 || 12 > resourcesForApplication.getInteger(identifier) / 100;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: e */
    public static boolean m11232e(PackageManager packageManager) {
        return packageManager.hasSystemFeature("com.google.android.tv");
    }

    /* renamed from: f */
    public static Intent m11233f(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(f8162a.buildUpon().appendQueryParameter("id", str).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: g */
    public static boolean m11234g(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.software.leanback");
    }

    /* renamed from: h */
    public static String m11235h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }
}
