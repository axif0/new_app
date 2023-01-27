package com.google.firebase.installations.p046q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1678a;
import com.google.android.gms.common.util.C1687j;
import com.google.firebase.installations.C2589h;
import com.google.firebase.installations.p046q.C2614d;
import com.google.firebase.installations.p046q.C2617e;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5209h;

/* renamed from: com.google.firebase.installations.q.c */
public class C2613c {

    /* renamed from: d */
    private static final Pattern f8405d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f8406e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f8407a;

    /* renamed from: b */
    private final C5209h f8408b;

    /* renamed from: c */
    private final C5197c f8409c;

    public C2613c(Context context, C5209h hVar, C5197c cVar) {
        this.f8407a = context;
        this.f8408b = hVar;
        this.f8409c = cVar;
    }

    /* renamed from: a */
    private static String m11621a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = BuildConfig.FLAVOR;
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m11622b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.3");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m11623c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m11624f() {
        try {
            byte[] a = C1678a.m7932a(this.f8407a, this.f8407a.getPackageName());
            if (a != null) {
                return C1687j.m7956b(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f8407a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f8407a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m11625g(String str) throws C2589h {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new C2589h(e.getMessage(), C2589h.C2590a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m11626h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static void m11627i() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: j */
    private static void m11628j(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String n = m11632n(httpURLConnection);
        if (!TextUtils.isEmpty(n)) {
            Log.w("Firebase-Installations", n);
            Log.w("Firebase-Installations", m11621a(str, str2, str3));
        }
    }

    /* renamed from: k */
    private HttpURLConnection m11629k(URL url, String str) throws C2589h {
        C5197c.C5198a a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(HttpConnection.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty(HttpConnection.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f8407a.getPackageName());
            C5197c cVar = this.f8409c;
            if (!(cVar == null || this.f8408b == null || (a = cVar.mo15319a("fire-installations-id")) == C5197c.C5198a.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f8408b.mo15329a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.mo15320e()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m11624f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C2589h("Firebase Installations Service is unavailable. Please try again later.", C2589h.C2590a.UNAVAILABLE);
        }
    }

    /* renamed from: l */
    static long m11630l(String str) {
        C1658o.m7837b(f8405d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: m */
    private C2614d m11631m(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f8406e));
        C2617e.C2618a a = C2617e.m11651a();
        C2614d.C2615a a2 = C2614d.m11639a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo9553f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo9550c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo9551d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo9562c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo9563d(m11630l(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo9549b(a.mo9560a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.mo9552e(C2614d.C2616b.OK);
        return a2.mo9548a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11632n(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f8406e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p046q.C2613c.m11632n(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: o */
    private C2617e m11633o(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f8406e));
        C2617e.C2618a a = C2617e.m11651a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo9562c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo9563d(m11630l(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a.mo9561b(C2617e.C2619b.OK);
        return a.mo9560a();
    }

    /* renamed from: p */
    private void m11634p(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m11636r(httpURLConnection, m11626h(m11622b(str, str2)));
    }

    /* renamed from: q */
    private void m11635q(HttpURLConnection httpURLConnection) throws IOException {
        m11636r(httpURLConnection, m11626h(m11623c()));
    }

    /* renamed from: r */
    private static void m11636r(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: d */
    public C2614d mo9564d(String str, String str2, String str3, String str4, String str5) throws C2589h {
        int i = 0;
        URL g = m11625g(String.format("projects/%s/installations", new Object[]{str3}));
        while (i <= 1) {
            HttpURLConnection k = m11629k(g, str);
            try {
                k.setRequestMethod("POST");
                k.setDoOutput(true);
                if (str5 != null) {
                    k.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                m11634p(k, str2, str4);
                int responseCode = k.getResponseCode();
                if (responseCode == 200) {
                    C2614d m = m11631m(k);
                    k.disconnect();
                    return m;
                }
                m11628j(k, str4, str, str3);
                if (responseCode == 429) {
                    continue;
                } else if (responseCode < 500 || responseCode >= 600) {
                    m11627i();
                    C2614d.C2615a a = C2614d.m11639a();
                    a.mo9552e(C2614d.C2616b.BAD_CONFIG);
                    C2614d a2 = a.mo9548a();
                    k.disconnect();
                    return a2;
                }
                i++;
                k.disconnect();
            } catch (IOException unused) {
            } catch (Throwable th) {
                k.disconnect();
                throw th;
            }
        }
        throw new C2589h("Firebase Installations Service is unavailable. Please try again later.", C2589h.C2590a.UNAVAILABLE);
    }

    /* renamed from: e */
    public C2617e mo9565e(String str, String str2, String str3, String str4) throws C2589h {
        int i = 0;
        URL g = m11625g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
        while (i <= 1) {
            HttpURLConnection k = m11629k(g, str);
            try {
                k.setRequestMethod("POST");
                k.addRequestProperty("Authorization", "FIS_v2 " + str4);
                m11635q(k);
                int responseCode = k.getResponseCode();
                if (responseCode == 200) {
                    C2617e o = m11633o(k);
                    k.disconnect();
                    return o;
                }
                m11628j(k, (String) null, str, str3);
                if (responseCode != 401) {
                    if (responseCode != 404) {
                        if (responseCode == 429) {
                            continue;
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m11627i();
                            C2617e.C2618a a = C2617e.m11651a();
                            a.mo9561b(C2617e.C2619b.BAD_CONFIG);
                            C2617e a2 = a.mo9560a();
                            k.disconnect();
                            return a2;
                        }
                        i++;
                        k.disconnect();
                    }
                }
                C2617e.C2618a a3 = C2617e.m11651a();
                a3.mo9561b(C2617e.C2619b.AUTH_ERROR);
                C2617e a4 = a3.mo9560a();
                k.disconnect();
                return a4;
            } catch (IOException unused) {
            } catch (Throwable th) {
                k.disconnect();
                throw th;
            }
        }
        throw new C2589h("Firebase Installations Service is unavailable. Please try again later.", C2589h.C2590a.UNAVAILABLE);
    }
}
