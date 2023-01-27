package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: androidx.core.app.c */
public final class C0569c {
    /* renamed from: a */
    public static int m2653a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    /* renamed from: b */
    public static String m2654b(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
