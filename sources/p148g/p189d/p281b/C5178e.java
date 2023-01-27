package p148g.p189d.p281b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1655n;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.C1662s;
import com.google.android.gms.common.util.C1691n;

/* renamed from: g.d.b.e */
public final class C5178e {

    /* renamed from: a */
    private final String f15220a;

    /* renamed from: b */
    private final String f15221b;

    /* renamed from: c */
    private final String f15222c;

    /* renamed from: d */
    private final String f15223d;

    /* renamed from: e */
    private final String f15224e;

    /* renamed from: f */
    private final String f15225f;

    /* renamed from: g */
    private final String f15226g;

    private C5178e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1658o.m7849n(!C1691n.m7971a(str), "ApplicationId must be set.");
        this.f15221b = str;
        this.f15220a = str2;
        this.f15222c = str3;
        this.f15223d = str4;
        this.f15224e = str5;
        this.f15225f = str6;
        this.f15226g = str7;
    }

    /* renamed from: a */
    public static C5178e m21681a(Context context) {
        C1662s sVar = new C1662s(context);
        String a = sVar.mo6565a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C5178e(a, sVar.mo6565a("google_api_key"), sVar.mo6565a("firebase_database_url"), sVar.mo6565a("ga_trackingId"), sVar.mo6565a("gcm_defaultSenderId"), sVar.mo6565a("google_storage_bucket"), sVar.mo6565a("project_id"));
    }

    /* renamed from: b */
    public String mo15287b() {
        return this.f15220a;
    }

    /* renamed from: c */
    public String mo15288c() {
        return this.f15221b;
    }

    /* renamed from: d */
    public String mo15289d() {
        return this.f15224e;
    }

    /* renamed from: e */
    public String mo15290e() {
        return this.f15226g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5178e)) {
            return false;
        }
        C5178e eVar = (C5178e) obj;
        return C1655n.m7832a(this.f15221b, eVar.f15221b) && C1655n.m7832a(this.f15220a, eVar.f15220a) && C1655n.m7832a(this.f15222c, eVar.f15222c) && C1655n.m7832a(this.f15223d, eVar.f15223d) && C1655n.m7832a(this.f15224e, eVar.f15224e) && C1655n.m7832a(this.f15225f, eVar.f15225f) && C1655n.m7832a(this.f15226g, eVar.f15226g);
    }

    public int hashCode() {
        return C1655n.m7833b(this.f15221b, this.f15220a, this.f15222c, this.f15223d, this.f15224e, this.f15225f, this.f15226g);
    }

    public String toString() {
        C1655n.C1656a c = C1655n.m7834c(this);
        c.mo6552a("applicationId", this.f15221b);
        c.mo6552a("apiKey", this.f15220a);
        c.mo6552a("databaseUrl", this.f15222c);
        c.mo6552a("gcmSenderId", this.f15224e);
        c.mo6552a("storageBucket", this.f15225f);
        c.mo6552a("projectId", this.f15226g);
        return c.toString();
    }
}
