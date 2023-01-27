package p086f.p111h.p119j;

import android.util.Base64;
import java.util.List;
import p086f.p111h.p121l.C3349h;

/* renamed from: f.h.j.a */
public final class C3311a {

    /* renamed from: a */
    private final String f10549a;

    /* renamed from: b */
    private final String f10550b;

    /* renamed from: c */
    private final String f10551c;

    /* renamed from: d */
    private final List<List<byte[]>> f10552d;

    /* renamed from: e */
    private final int f10553e = 0;

    /* renamed from: f */
    private final String f10554f = (this.f10549a + "-" + this.f10550b + "-" + this.f10551c);

    public C3311a(String str, String str2, String str3, List<List<byte[]>> list) {
        C3349h.m14361c(str);
        this.f10549a = str;
        C3349h.m14361c(str2);
        this.f10550b = str2;
        C3349h.m14361c(str3);
        this.f10551c = str3;
        C3349h.m14361c(list);
        this.f10552d = list;
    }

    /* renamed from: a */
    public List<List<byte[]>> mo11472a() {
        return this.f10552d;
    }

    /* renamed from: b */
    public int mo11473b() {
        return this.f10553e;
    }

    /* renamed from: c */
    public String mo11474c() {
        return this.f10554f;
    }

    /* renamed from: d */
    public String mo11475d() {
        return this.f10549a;
    }

    /* renamed from: e */
    public String mo11476e() {
        return this.f10550b;
    }

    /* renamed from: f */
    public String mo11477f() {
        return this.f10551c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f10549a + ", mProviderPackage: " + this.f10550b + ", mQuery: " + this.f10551c + ", mCertificates:");
        for (int i = 0; i < this.f10552d.size(); i++) {
            sb.append(" [");
            List list = this.f10552d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f10553e);
        return sb.toString();
    }
}
