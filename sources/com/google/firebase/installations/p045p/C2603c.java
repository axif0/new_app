package com.google.firebase.installations.p045p;

import com.google.firebase.installations.p045p.C2605d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p148g.p189d.p281b.C5171c;

/* renamed from: com.google.firebase.installations.p.c */
public class C2603c {

    /* renamed from: a */
    private final File f8381a;

    /* renamed from: b */
    private final C5171c f8382b;

    /* renamed from: com.google.firebase.installations.p.c$a */
    public enum C2604a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C2603c(C5171c cVar) {
        File filesDir = cVar.mo15275g().getFilesDir();
        this.f8381a = new File(filesDir, "PersistedInstallation." + cVar.mo15279k() + ".json");
        this.f8382b = cVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m11572b() {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002d }
            java.io.File r4 = r6.f8381a     // Catch:{ IOException | JSONException -> 0x002d }
            r3.<init>(r4)     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x0010:
            r4 = 0
            int r5 = r3.read(r2, r4, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ IOException | JSONException -> 0x002d }
            return r1
        L_0x0024:
            r0.write(r2, r4, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0028:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x002d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p045p.C2603c.m11572b():org.json.JSONObject");
    }

    /* renamed from: a */
    public C2605d mo9527a(C2605d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo9508d());
            jSONObject.put("Status", dVar.mo9512g().ordinal());
            jSONObject.put("AuthToken", dVar.mo9506b());
            jSONObject.put("RefreshToken", dVar.mo9511f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo9513h());
            jSONObject.put("ExpiresInSecs", dVar.mo9507c());
            jSONObject.put("FisError", dVar.mo9509e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f8382b.mo15275g().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f8381a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: c */
    public C2605d mo9528c() {
        JSONObject b = m11572b();
        String optString = b.optString("Fid", (String) null);
        int optInt = b.optInt("Status", C2604a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", (String) null);
        String optString3 = b.optString("RefreshToken", (String) null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b.optLong("ExpiresInSecs", 0);
        String optString4 = b.optString("FisError", (String) null);
        C2605d.C2606a a = C2605d.m11575a();
        a.mo9520d(optString);
        a.mo9523g(C2604a.values()[optInt]);
        a.mo9518b(optString2);
        a.mo9522f(optString3);
        a.mo9524h(optLong);
        a.mo9519c(optLong2);
        a.mo9521e(optString4);
        return a.mo9517a();
    }
}
