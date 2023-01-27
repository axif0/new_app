package com.google.firebase.installations.p045p;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p148g.p189d.p281b.C5171c;

/* renamed from: com.google.firebase.installations.p.b */
public class C2602b {

    /* renamed from: c */
    private static final String[] f8378c = {"*", "FCM", "GCM", BuildConfig.FLAVOR};

    /* renamed from: a */
    private final SharedPreferences f8379a;

    /* renamed from: b */
    private final String f8380b;

    public C2602b(C5171c cVar) {
        this.f8379a = cVar.mo15275g().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f8380b = m11564b(cVar);
    }

    /* renamed from: a */
    private String m11563a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m11564b(C5171c cVar) {
        String d = cVar.mo15278j().mo15289d();
        if (d != null) {
            return d;
        }
        String c = cVar.mo15278j().mo15288c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m11565c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m11566d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m11567e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m11568g() {
        String string;
        synchronized (this.f8379a) {
            string = this.f8379a.getString("|S|id", (String) null);
        }
        return string;
    }

    /* renamed from: h */
    private String m11569h() {
        synchronized (this.f8379a) {
            String string = this.f8379a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = m11567e(string);
            if (e == null) {
                return null;
            }
            String c = m11565c(e);
            return c;
        }
    }

    /* renamed from: f */
    public String mo9525f() {
        synchronized (this.f8379a) {
            String g = m11568g();
            if (g != null) {
                return g;
            }
            String h = m11569h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo9526i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f8379a
            monitor-enter(r0)
            java.lang.String[] r1 = f8378c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f8380b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m11563a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f8379a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m11566d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r1
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p045p.C2602b.mo9526i():java.lang.String");
    }
}
