package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.p */
public class C2644p {

    /* renamed from: a */
    private final Bundle f8453a;

    public C2644p(Bundle bundle) {
        if (bundle != null) {
            this.f8453a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    private static int m11760d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m11761s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m11762t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m11764v("gcm.n.e")));
    }

    /* renamed from: u */
    private static boolean m11763u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    private static String m11764v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m11765w(String str) {
        if (!this.f8453a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = m11764v(str);
            if (this.f8453a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m11766z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean mo9597a(String str) {
        String p = mo9611p(str);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }

    /* renamed from: b */
    public Integer mo9598b(String str) {
        String p = mo9611p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            String z = m11766z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38 + String.valueOf(p).length());
            sb.append("Couldn't parse value of ");
            sb.append(z);
            sb.append("(");
            sb.append(p);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray mo9599c(String str) {
        String p = mo9611p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            String z = m11766z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 50 + String.valueOf(p).length());
            sb.append("Malformed JSON for key ");
            sb.append(z);
            sb.append(": ");
            sb.append(p);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo9600e() {
        String str;
        JSONArray c = mo9599c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m11760d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append("LightSettings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting LightSettings");
            str = sb.toString();
            Log.w("NotificationParams", str);
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(c);
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf2);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            str = sb2.toString();
            Log.w("NotificationParams", str);
            return null;
        }
    }

    /* renamed from: f */
    public Uri mo9601f() {
        String p = mo9611p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = mo9611p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] mo9602g(String str) {
        String valueOf = String.valueOf(str);
        JSONArray c = mo9599c("_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String mo9603h(String str) {
        String valueOf = String.valueOf(str);
        return mo9611p("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    /* renamed from: i */
    public String mo9604i(Resources resources, String str, String str2) {
        String h = mo9603h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            String z = m11766z("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 49 + String.valueOf(str2).length());
            sb.append(z);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] g = mo9602g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e) {
            String z2 = m11766z(str2);
            String arrays = Arrays.toString(g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(z2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(z2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: j */
    public Long mo9605j(String str) {
        String p = mo9611p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            String z = m11766z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38 + String.valueOf(p).length());
            sb.append("Couldn't parse value of ");
            sb.append(z);
            sb.append("(");
            sb.append(p);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: k */
    public String mo9606k() {
        return mo9611p("gcm.n.android_channel_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer mo9607l() {
        Integer b = mo9598b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
        sb.append("notificationCount is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationCount.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer mo9608m() {
        Integer b = mo9598b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationPriority.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    /* renamed from: n */
    public String mo9609n(Resources resources, String str, String str2) {
        String p = mo9611p(str2);
        return !TextUtils.isEmpty(p) ? p : mo9604i(resources, str, str2);
    }

    /* renamed from: o */
    public String mo9610o() {
        String p = mo9611p("gcm.n.sound2");
        return TextUtils.isEmpty(p) ? mo9611p("gcm.n.sound") : p;
    }

    /* renamed from: p */
    public String mo9611p(String str) {
        return this.f8453a.getString(m11765w(str));
    }

    /* renamed from: q */
    public long[] mo9612q() {
        JSONArray c = mo9599c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo9613r() {
        Integer b = mo9598b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb.toString());
        return null;
    }

    /* renamed from: x */
    public Bundle mo9614x() {
        Bundle bundle = new Bundle(this.f8453a);
        for (String str : this.f8453a.keySet()) {
            if (!m11761s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle mo9615y() {
        Bundle bundle = new Bundle(this.f8453a);
        for (String str : this.f8453a.keySet()) {
            if (m11763u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
