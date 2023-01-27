package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p086f.p102e.C3190a;
import p086f.p111h.p112e.C3267a;

/* renamed from: com.google.firebase.iid.z */
class C2576z {

    /* renamed from: a */
    final SharedPreferences f8317a;

    /* renamed from: b */
    final Context f8318b;

    /* renamed from: c */
    private final Map<String, Long> f8319c = new C3190a();

    /* renamed from: com.google.firebase.iid.z$a */
    static class C2577a {

        /* renamed from: d */
        private static final long f8320d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f8321a;

        /* renamed from: b */
        final String f8322b;

        /* renamed from: c */
        final long f8323c;

        private C2577a(String str, String str2, long j) {
            this.f8321a = str;
            this.f8322b = str2;
            this.f8323c = j;
        }

        /* renamed from: a */
        static String m11481a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* renamed from: c */
        static C2577a m11482c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C2577a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C2577a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo9480b(String str) {
            return System.currentTimeMillis() > this.f8323c + f8320d || !str.equals(this.f8322b);
        }
    }

    public C2576z(Context context) {
        this.f8318b = context;
        this.f8317a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m11471a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m11471a(String str) {
        File file = new File(C3267a.m14077g(this.f8318b), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo9477g()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo9475d();
                    FirebaseInstanceId.m11356k().mo9407D();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    /* renamed from: b */
    static String m11472b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    private String m11473c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: e */
    private long m11474e(String str) {
        String string = this.f8317a.getString(m11472b(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: j */
    private long m11475j(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f8317a.contains(m11472b(str, "cre"))) {
            return m11474e(str);
        }
        SharedPreferences.Editor edit = this.f8317a.edit();
        edit.putString(m11472b(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }

    /* renamed from: d */
    public synchronized void mo9475d() {
        this.f8319c.clear();
        this.f8317a.edit().clear().commit();
    }

    /* renamed from: f */
    public synchronized C2577a mo9476f(String str, String str2, String str3) {
        return C2577a.m11482c(this.f8317a.getString(m11473c(str, str2, str3), (String) null));
    }

    /* renamed from: g */
    public synchronized boolean mo9477g() {
        return this.f8317a.getAll().isEmpty();
    }

    /* renamed from: h */
    public synchronized void mo9478h(String str, String str2, String str3, String str4, String str5) {
        String a = C2577a.m11481a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f8317a.edit();
            edit.putString(m11473c(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: i */
    public synchronized long mo9479i(String str) {
        long j;
        j = m11475j(str);
        this.f8319c.put(str, Long.valueOf(j));
        return j;
    }
}
