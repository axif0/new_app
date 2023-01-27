package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0575h;
import java.util.concurrent.atomic.AtomicInteger;
import p086f.p111h.p112e.C3267a;

/* renamed from: com.google.firebase.messaging.a */
public final class C2623a {

    /* renamed from: a */
    private static final AtomicInteger f8422a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.a$a */
    public static class C2624a {

        /* renamed from: a */
        public final C0575h.C0580e f8423a;

        /* renamed from: b */
        public final String f8424b;

        /* renamed from: c */
        public final int f8425c;

        C2624a(C0575h.C0580e eVar, String str, int i) {
            this.f8423a = eVar;
            this.f8424b = str;
            this.f8425c = i;
        }
    }

    /* renamed from: a */
    private static PendingIntent m11678a(Context context, C2644p pVar, String str, PackageManager packageManager) {
        Intent f = m11683f(str, pVar, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(pVar.mo9615y());
        PendingIntent activity = PendingIntent.getActivity(context, m11684g(), f, 1073741824);
        return m11693p(pVar) ? m11694q(context, pVar, activity) : activity;
    }

    /* renamed from: b */
    private static PendingIntent m11679b(Context context, C2644p pVar) {
        if (!m11693p(pVar)) {
            return null;
        }
        return m11680c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(pVar.mo9614x()));
    }

    /* renamed from: c */
    private static PendingIntent m11680c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m11684g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    /* renamed from: d */
    static C2624a m11681d(Context context, C2644p pVar) {
        Bundle j = m11687j(context.getPackageManager(), context.getPackageName());
        return m11682e(context, context.getPackageName(), pVar, m11688k(context, pVar.mo9606k(), j), context.getResources(), context.getPackageManager(), j);
    }

    /* renamed from: e */
    public static C2624a m11682e(Context context, String str, C2644p pVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        C0575h.C0580e eVar = new C0575h.C0580e(context, str2);
        String n = pVar.mo9609n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.mo2846k(n);
        }
        String n2 = pVar.mo9609n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.mo2845j(n2);
            C0575h.C0578c cVar = new C0575h.C0578c();
            cVar.mo2835g(n2);
            eVar.mo2857w(cVar);
        }
        eVar.mo2855u(m11689l(packageManager, resources, str, pVar.mo9611p("gcm.n.icon"), bundle));
        Uri m = m11690m(str, pVar, resources);
        if (m != null) {
            eVar.mo2856v(m);
        }
        eVar.mo2844i(m11678a(context, pVar, str, packageManager));
        PendingIntent b = m11679b(context, pVar);
        if (b != null) {
            eVar.mo2848m(b);
        }
        Integer h = m11685h(context, pVar.mo9611p("gcm.n.color"), bundle);
        if (h != null) {
            eVar.mo2843h(h.intValue());
        }
        eVar.mo2841f(!pVar.mo9597a("gcm.n.sticky"));
        eVar.mo2851q(pVar.mo9597a("gcm.n.local_only"));
        String p = pVar.mo9611p("gcm.n.ticker");
        if (p != null) {
            eVar.mo2858x(p);
        }
        Integer m2 = pVar.mo9608m();
        if (m2 != null) {
            eVar.mo2853s(m2.intValue());
        }
        Integer r = pVar.mo9613r();
        if (r != null) {
            eVar.mo2860z(r.intValue());
        }
        Integer l = pVar.mo9607l();
        if (l != null) {
            eVar.mo2852r(l.intValue());
        }
        Long j = pVar.mo9605j("gcm.n.event_time");
        if (j != null) {
            eVar.mo2854t(true);
            eVar.mo2837A(j.longValue());
        }
        long[] q = pVar.mo9612q();
        if (q != null) {
            eVar.mo2859y(q);
        }
        int[] e = pVar.mo9600e();
        if (e != null) {
            eVar.mo2850p(e[0], e[1], e[2]);
        }
        eVar.mo2847l(m11686i(pVar));
        return new C2624a(eVar, m11691n(pVar), 0);
    }

    /* renamed from: f */
    private static Intent m11683f(String str, C2644p pVar, PackageManager packageManager) {
        String p = pVar.mo9611p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = pVar.mo9601f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m11684g() {
        return f8422a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m11685h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C3267a.m14074d(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* renamed from: i */
    private static int m11686i(C2644p pVar) {
        int i = pVar.mo9597a("gcm.n.default_sound") ? 1 : 0;
        if (pVar.mo9597a("gcm.n.default_vibrate_timings")) {
            i |= 2;
        }
        return pVar.mo9597a("gcm.n.default_light_settings") ? i | 4 : i;
    }

    /* renamed from: j */
    private static Bundle m11687j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    private static String m11688k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb.toString());
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static int m11689l(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m11692o(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m11692o(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m11692o(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        if (i == 0 || !m11692o(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: m */
    private static Uri m11690m(String str, C2644p pVar, Resources resources) {
        String o = pVar.mo9610o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(o).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(o);
        return Uri.parse(sb.toString());
    }

    /* renamed from: n */
    private static String m11691n(C2644p pVar) {
        String p = pVar.mo9611p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(uptimeMillis);
        return sb.toString();
    }

    @TargetApi(26)
    /* renamed from: o */
    private static boolean m11692o(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    /* renamed from: p */
    static boolean m11693p(C2644p pVar) {
        return pVar.mo9597a("google.c.a.e");
    }

    /* renamed from: q */
    private static PendingIntent m11694q(Context context, C2644p pVar, PendingIntent pendingIntent) {
        return m11680c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(pVar.mo9614x()).putExtra("pending_intent", pendingIntent));
    }
}
