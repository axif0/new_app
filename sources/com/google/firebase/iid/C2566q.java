package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.installations.C2588g;
import com.google.firebase.installations.C2594l;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p148g.p189d.p190a.p232c.p236c.C4339d;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4944k;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5209h;

/* renamed from: com.google.firebase.iid.q */
public class C2566q {

    /* renamed from: a */
    private final C5171c f8293a;

    /* renamed from: b */
    private final C2569t f8294b;

    /* renamed from: c */
    private final C4339d f8295c;

    /* renamed from: d */
    private final C5209h f8296d;

    /* renamed from: e */
    private final C5197c f8297e;

    /* renamed from: f */
    private final C2588g f8298f;

    C2566q(C5171c cVar, C2569t tVar, C4339d dVar, C5209h hVar, C5197c cVar2, C2588g gVar) {
        this.f8293a = cVar;
        this.f8294b = tVar;
        this.f8295c = dVar;
        this.f8296d = hVar;
        this.f8297e = cVar2;
        this.f8298f = gVar;
    }

    public C2566q(C5171c cVar, C2569t tVar, C5209h hVar, C5197c cVar2, C2588g gVar) {
        this(cVar, tVar, new C4339d(cVar.mo15275g()), hVar, cVar2, gVar);
    }

    /* renamed from: a */
    private static String m11436a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    private C4940h<String> m11437b(C4940h<Bundle> hVar) {
        return hVar.mo14867e(C2556h.m11429a(), new C2565p(this));
    }

    /* renamed from: c */
    private String m11438c() {
        try {
            return m11436a(MessageDigest.getInstance("SHA-1").digest(this.f8293a.mo15277i().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    private String m11439e(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: f */
    static boolean m11440f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: h */
    private Bundle m11441h(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f8293a.mo15278j().mo15288c());
        bundle.putString("gmsv", Integer.toString(this.f8294b.mo9466d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f8294b.mo9464a());
        bundle.putString("app_ver_name", this.f8294b.mo9465b());
        bundle.putString("firebase-app-name-hash", m11438c());
        try {
            String b = ((C2594l) C4944k.m20945a(this.f8298f.mo9495a(false))).mo9481b();
            if (!TextUtils.isEmpty(b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "20.3.0".length() != 0 ? "fiid-".concat("20.3.0") : new String("fiid-"));
        C5197c.C5198a a = this.f8297e.mo15319a("fire-iid");
        if (a != C5197c.C5198a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a.mo15320e()));
            bundle.putString("Firebase-Client", this.f8296d.mo15329a());
        }
        return bundle;
    }

    /* renamed from: i */
    private C4940h<Bundle> m11442i(String str, String str2, String str3, Bundle bundle) {
        m11441h(str, str2, str3, bundle);
        return this.f8295c.mo13628a(bundle);
    }

    /* renamed from: d */
    public C4940h<String> mo9458d(String str, String str2, String str3) {
        return m11437b(m11442i(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ String mo9459g(C4940h hVar) throws Exception {
        return m11439e((Bundle) hVar.mo14871i(IOException.class));
    }

    /* renamed from: j */
    public C4940h<?> mo9460j(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return m11437b(m11442i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    /* renamed from: k */
    public C4940h<?> mo9461k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m11437b(m11442i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
