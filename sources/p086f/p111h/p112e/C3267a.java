package p086f.p111h.p112e;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: f.h.e.a */
public class C3267a {

    /* renamed from: a */
    private static final Object f10493a = new Object();

    /* renamed from: b */
    private static TypedValue f10494b;

    /* renamed from: a */
    public static int m14071a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static Context m14072b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m14073c(java.io.File r4) {
        /*
            java.lang.Class<f.h.e.a> r0 = p086f.p111h.p112e.C3267a.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r4
        L_0x0017:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r2.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0036 }
            r2.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0036 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0036 }
            r4 = 0
            monitor-exit(r0)
            return r4
        L_0x0034:
            monitor-exit(r0)
            return r4
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p112e.C3267a.m14073c(java.io.File):java.io.File");
    }

    /* renamed from: d */
    public static int m14074d(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: e */
    public static ColorStateList m14075e(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: f */
    public static Drawable m14076f(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f10493a) {
                if (f10494b == null) {
                    f10494b = new TypedValue();
                }
                context.getResources().getValue(i, f10494b, true);
                i = f10494b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: g */
    public static File m14077g(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : m14073c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: h */
    public static boolean m14078h(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m14079i(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: j */
    public static void m14080j(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
