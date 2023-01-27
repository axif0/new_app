package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;
import com.google.android.gms.common.util.C1682e;
import com.google.android.gms.common.util.C1685h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends C1663a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1546b();

    /* renamed from: s */
    private static C1682e f5287s = C1685h.m7946d();

    /* renamed from: f */
    private final int f5288f;

    /* renamed from: g */
    private String f5289g;

    /* renamed from: h */
    private String f5290h;

    /* renamed from: i */
    private String f5291i;

    /* renamed from: j */
    private String f5292j;

    /* renamed from: k */
    private Uri f5293k;

    /* renamed from: l */
    private String f5294l;

    /* renamed from: m */
    private long f5295m;

    /* renamed from: n */
    private String f5296n;

    /* renamed from: o */
    private List<Scope> f5297o;

    /* renamed from: p */
    private String f5298p;

    /* renamed from: q */
    private String f5299q;

    /* renamed from: r */
    private Set<Scope> f5300r = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f5288f = i;
        this.f5289g = str;
        this.f5290h = str2;
        this.f5291i = str3;
        this.f5292j = str4;
        this.f5293k = uri;
        this.f5294l = str5;
        this.f5295m = j;
        this.f5296n = str6;
        this.f5297o = list;
        this.f5298p = str7;
        this.f5299q = str8;
    }

    /* renamed from: B */
    public static GoogleSignInAccount m7478B(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount C = m7479C(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString("email", (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        C.f5294l = jSONObject.optString("serverAuthCode", (String) null);
        return C;
    }

    /* renamed from: C */
    private static GoogleSignInAccount m7479C(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f5287s.mo6587c() / 1000) : l).longValue();
        C1658o.m7841f(str7);
        C1658o.m7845j(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    /* renamed from: A */
    public String mo6289A() {
        return this.f5294l;
    }

    /* renamed from: d */
    public Account mo6290d() {
        if (this.f5291i == null) {
            return null;
        }
        return new Account(this.f5291i, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5296n.equals(this.f5296n) && googleSignInAccount.mo6300w().equals(mo6300w());
    }

    /* renamed from: f */
    public String mo6292f() {
        return this.f5292j;
    }

    /* renamed from: h */
    public String mo6293h() {
        return this.f5291i;
    }

    public int hashCode() {
        return ((this.f5296n.hashCode() + 527) * 31) + mo6300w().hashCode();
    }

    /* renamed from: i */
    public String mo6295i() {
        return this.f5299q;
    }

    /* renamed from: j */
    public String mo6296j() {
        return this.f5298p;
    }

    /* renamed from: m */
    public String mo6297m() {
        return this.f5289g;
    }

    /* renamed from: o */
    public String mo6298o() {
        return this.f5290h;
    }

    /* renamed from: p */
    public Uri mo6299p() {
        return this.f5293k;
    }

    /* renamed from: w */
    public Set<Scope> mo6300w() {
        HashSet hashSet = new HashSet(this.f5297o);
        hashSet.addAll(this.f5300r);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f5288f);
        C1666c.m7900n(parcel, 2, mo6297m(), false);
        C1666c.m7900n(parcel, 3, mo6298o(), false);
        C1666c.m7900n(parcel, 4, mo6293h(), false);
        C1666c.m7900n(parcel, 5, mo6292f(), false);
        C1666c.m7899m(parcel, 6, mo6299p(), i, false);
        C1666c.m7900n(parcel, 7, mo6289A(), false);
        C1666c.m7897k(parcel, 8, this.f5295m);
        C1666c.m7900n(parcel, 9, this.f5296n, false);
        C1666c.m7903q(parcel, 10, this.f5297o, false);
        C1666c.m7900n(parcel, 11, mo6296j(), false);
        C1666c.m7900n(parcel, 12, mo6295i(), false);
        C1666c.m7888b(parcel, a);
    }
}
