package p148g.p189d.p190a.p232c.p237d;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.common.internal.C1654m0;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1686i;
import com.google.android.gms.common.util.C1689l;
import com.google.android.gms.common.util.C1692o;
import com.google.android.gms.common.util.C1697s;
import java.util.concurrent.atomic.AtomicBoolean;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: g.d.a.c.d.j */
public class C4379j {
    @Deprecated

    /* renamed from: a */
    public static final int f13918a = 12451000;

    /* renamed from: b */
    private static boolean f13919b = false;

    /* renamed from: c */
    private static boolean f13920c = false;

    /* renamed from: d */
    static final AtomicBoolean f13921d = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f13922e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static int m18593a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static String m18594b(int i) {
        return C4366b.m18548m(i);
    }

    /* renamed from: c */
    public static Context m18595c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Resources m18596d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m18597e(Context context) {
        if (!f13920c) {
            try {
                PackageInfo e = C4389c.m18627a(context).mo13717e("com.google.android.gms", 64);
                C4380k.m18605a(context);
                if (e == null || C4380k.m18608f(e, false) || !C4380k.m18608f(e, true)) {
                    f13919b = false;
                } else {
                    f13919b = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } catch (Throwable th) {
                f13920c = true;
                throw th;
            }
            f13920c = true;
        }
        return f13919b || !C1686i.m7951b();
    }

    @Deprecated
    /* renamed from: f */
    public static int m18598f(Context context, int i) {
        try {
            context.getResources().getString(C4381l.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f13922e.get()) {
            int b = C1654m0.m7830b(context);
            if (b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b != f13918a) {
                int i2 = f13918a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(b);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return m18604l(context, !C1686i.m7953d(context) && !C1686i.m7954e(context), i);
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m18599g(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m18601i(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((android.os.UserManager) r1.getSystemService("user")).getApplicationRestrictions(r1.getPackageName());
     */
    @android.annotation.TargetApi(18)
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m18600h(android.content.Context r1) {
        /*
            boolean r0 = com.google.android.gms.common.util.C1689l.m7961d()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "user"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            java.lang.String r1 = r1.getPackageName()
            android.os.Bundle r1 = r0.getApplicationRestrictions(r1)
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "restricted_profile"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0028
            r1 = 1
            return r1
        L_0x0028:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p237d.C4379j.m18600h(android.content.Context):boolean");
    }

    @TargetApi(21)
    /* renamed from: i */
    static boolean m18601i(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C1689l.m7964g()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !m18600h(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m18602j(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: k */
    public static boolean m18603k(Context context, int i, String str) {
        return C1692o.m7973b(context, i, str);
    }

    /* renamed from: l */
    private static int m18604l(Context context, boolean z, int i) {
        String str;
        C1658o.m7836a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                str = "Google Play Store is missing.";
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C4380k.m18605a(context);
            if (!C4380k.m18608f(packageInfo2, true)) {
                str = "Google Play services signature invalid.";
            } else if (z && (!C4380k.m18608f(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                str = "Google Play Store signature invalid.";
            } else if (C1697s.m7990a(packageInfo2.versionCode) < C1697s.m7990a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w("GooglePlayServicesUtil", sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            Log.w("GooglePlayServicesUtil", str);
            return 9;
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }
}
