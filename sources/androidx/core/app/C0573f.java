package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.core.app.f */
public final class C0573f {
    /* renamed from: a */
    public static Intent m2660a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String c = m2662c(activity);
        if (c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, c);
        try {
            return m2663d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m2661b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String d = m2663d(context, componentName);
        if (d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), d);
        return m2663d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m2662c(Activity activity) {
        try {
            return m2663d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m2663d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            i2 = 269222528;
        } else if (i3 >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: e */
    public static void m2664e(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: f */
    public static boolean m2665f(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }
}
