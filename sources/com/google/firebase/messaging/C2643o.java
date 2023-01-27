package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.analytics.p043a.C2498a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C2637l;
import p148g.p189d.p190a.p191a.C3728c;
import p148g.p189d.p190a.p191a.C3731f;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p282f.C5179a;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.p283g.C5187c;

/* renamed from: com.google.firebase.messaging.o */
public class C2643o {

    /* renamed from: a */
    private static final C5179a f8452a;

    static {
        C5187c cVar = new C5187c();
        cVar.mo15303f(C2637l.C2639b.class, new C2637l.C2640c());
        cVar.mo15303f(C2637l.class, new C2637l.C2638a());
        f8452a = cVar.mo15302c();
    }

    /* renamed from: A */
    public static boolean m11732A(Intent intent) {
        if (intent == null || m11752s(intent)) {
            return false;
        }
        return m11734a();
    }

    /* renamed from: B */
    public static boolean m11733B(Intent intent) {
        if (intent == null || m11752s(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m11734a() {
        ApplicationInfo applicationInfo;
        try {
            C5171c.m21659h();
            Context g = C5171c.m21659h().mo15275g();
            SharedPreferences sharedPreferences = g.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = g.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(g.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static String m11735b(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    /* renamed from: c */
    static String m11736c(Intent intent) {
        return intent.getStringExtra("google.c.a.c_id");
    }

    /* renamed from: d */
    static String m11737d(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    /* renamed from: e */
    static String m11738e() {
        return FirebaseInstanceId.getInstance(C5171c.m21659h()).mo9415i();
    }

    /* renamed from: f */
    static String m11739f(Intent intent) {
        return intent.getStringExtra("google.c.a.m_c");
    }

    /* renamed from: g */
    static String m11740g(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: h */
    static String m11741h(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    /* renamed from: i */
    private static int m11742i(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* renamed from: j */
    static String m11743j(Intent intent) {
        return intent.getStringExtra("google.c.a.ts");
    }

    /* renamed from: k */
    static String m11744k(Intent intent) {
        return (intent.getExtras() == null || !C2644p.m11762t(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    /* renamed from: l */
    static String m11745l(Intent intent) {
        return (intent.getExtras() == null || !C2644p.m11762t(intent.getExtras())) ? "data" : "display";
    }

    /* renamed from: m */
    static String m11746m() {
        return C5171c.m21659h().mo15275g().getPackageName();
    }

    /* renamed from: n */
    static int m11747n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        return m11742i(stringExtra);
    }

    /* renamed from: o */
    static String m11748o() {
        C5171c h = C5171c.m21659h();
        String d = h.mo15278j().mo15289d();
        if (d != null) {
            return d;
        }
        String c = h.mo15278j().mo15288c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: p */
    static String m11749p(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* renamed from: q */
    static int m11750q(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    /* renamed from: r */
    static String m11751r(Intent intent) {
        if (intent.hasExtra("google.c.a.udt")) {
            return intent.getStringExtra("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: s */
    private static boolean m11752s(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: t */
    public static void m11753t(Intent intent) {
        m11758y("_nd", intent);
    }

    /* renamed from: u */
    public static void m11754u(Intent intent) {
        m11758y("_nf", intent);
    }

    /* renamed from: v */
    public static void m11755v(Intent intent) {
        m11759z(intent);
        m11758y("_no", intent);
    }

    /* renamed from: w */
    public static void m11756w(Intent intent, C3731f<String> fVar) {
        m11758y("_nr", intent);
        if (fVar != null) {
            m11757x("MESSAGE_DELIVERED", intent, fVar);
        }
    }

    /* renamed from: x */
    private static void m11757x(String str, Intent intent, C3731f<String> fVar) {
        try {
            fVar.mo9568a(C3728c.m15583d(f8452a.mo15294a(new C2637l.C2639b(new C2637l(str, intent)))));
        } catch (C5180b unused) {
            Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
        }
    }

    /* renamed from: y */
    static void m11758y(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String c = m11736c(intent);
        if (c != null) {
            bundle.putString("_nmid", c);
        }
        String d = m11737d(intent);
        if (d != null) {
            bundle.putString("_nmn", d);
        }
        String h = m11741h(intent);
        if (!TextUtils.isEmpty(h)) {
            bundle.putString("label", h);
        }
        String f = m11739f(intent);
        if (!TextUtils.isEmpty(f)) {
            bundle.putString("message_channel", f);
        }
        String p = m11749p(intent);
        if (p != null) {
            bundle.putString("_nt", p);
        }
        String j = m11743j(intent);
        if (j != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(j));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        String r = m11751r(intent);
        if (r != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(r));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String l = m11745l(intent);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", l);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(valueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        C2498a aVar = (C2498a) C5171c.m21659h().mo15274f(C2498a.class);
        if (aVar != null) {
            aVar.mo9356b("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    /* renamed from: z */
    private static void m11759z(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                C2498a aVar = (C2498a) C5171c.m21659h().mo15274f(C2498a.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (aVar != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    aVar.mo9355a("fcm", "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    aVar.mo9356b("fcm", "_cmp", bundle);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }
}
