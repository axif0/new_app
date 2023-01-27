package com.bumptech.glide.load.p012p;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.p029s.C1401j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.p.g */
public class C1175g implements C0998g {

    /* renamed from: b */
    private final C1176h f4336b;

    /* renamed from: c */
    private final URL f4337c;

    /* renamed from: d */
    private final String f4338d;

    /* renamed from: e */
    private String f4339e;

    /* renamed from: f */
    private URL f4340f;

    /* renamed from: g */
    private volatile byte[] f4341g;

    /* renamed from: h */
    private int f4342h;

    public C1175g(String str) {
        this(str, C1176h.f4343a);
    }

    public C1175g(String str, C1176h hVar) {
        this.f4337c = null;
        C1401j.m6970b(str);
        this.f4338d = str;
        C1401j.m6972d(hVar);
        this.f4336b = hVar;
    }

    public C1175g(URL url) {
        this(url, C1176h.f4343a);
    }

    public C1175g(URL url, C1176h hVar) {
        C1401j.m6972d(url);
        this.f4337c = url;
        this.f4338d = null;
        C1401j.m6972d(hVar);
        this.f4336b = hVar;
    }

    /* renamed from: d */
    private byte[] m6117d() {
        if (this.f4341g == null) {
            this.f4341g = mo5482c().getBytes(C0998g.f3954a);
        }
        return this.f4341g;
    }

    /* renamed from: f */
    private String m6118f() {
        if (TextUtils.isEmpty(this.f4339e)) {
            String str = this.f4338d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f4337c;
                C1401j.m6972d(url);
                str = url.toString();
            }
            this.f4339e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f4339e;
    }

    /* renamed from: g */
    private URL m6119g() throws MalformedURLException {
        if (this.f4340f == null) {
            this.f4340f = new URL(m6118f());
        }
        return this.f4340f;
    }

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        messageDigest.update(m6117d());
    }

    /* renamed from: c */
    public String mo5482c() {
        String str = this.f4338d;
        if (str != null) {
            return str;
        }
        URL url = this.f4337c;
        C1401j.m6972d(url);
        return url.toString();
    }

    /* renamed from: e */
    public Map<String, String> mo5483e() {
        return this.f4336b.mo5486a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1175g)) {
            return false;
        }
        C1175g gVar = (C1175g) obj;
        return mo5482c().equals(gVar.mo5482c()) && this.f4336b.equals(gVar.f4336b);
    }

    /* renamed from: h */
    public URL mo5484h() throws MalformedURLException {
        return m6119g();
    }

    public int hashCode() {
        if (this.f4342h == 0) {
            int hashCode = mo5482c().hashCode();
            this.f4342h = hashCode;
            this.f4342h = (hashCode * 31) + this.f4336b.hashCode();
        }
        return this.f4342h;
    }

    public String toString() {
        return mo5482c();
    }
}
