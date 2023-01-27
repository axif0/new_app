package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.p029s.C1398g;
import com.bumptech.glide.p029s.C1402k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.x */
final class C1143x implements C0998g {

    /* renamed from: j */
    private static final C1398g<Class<?>, byte[]> f4299j = new C1398g<>(50);

    /* renamed from: b */
    private final C1042b f4300b;

    /* renamed from: c */
    private final C0998g f4301c;

    /* renamed from: d */
    private final C0998g f4302d;

    /* renamed from: e */
    private final int f4303e;

    /* renamed from: f */
    private final int f4304f;

    /* renamed from: g */
    private final Class<?> f4305g;

    /* renamed from: h */
    private final C1002i f4306h;

    /* renamed from: i */
    private final C1006m<?> f4307i;

    C1143x(C1042b bVar, C0998g gVar, C0998g gVar2, int i, int i2, C1006m<?> mVar, Class<?> cls, C1002i iVar) {
        this.f4300b = bVar;
        this.f4301c = gVar;
        this.f4302d = gVar2;
        this.f4303e = i;
        this.f4304f = i2;
        this.f4307i = mVar;
        this.f4305g = cls;
        this.f4306h = iVar;
    }

    /* renamed from: c */
    private byte[] m6031c() {
        byte[] g = f4299j.mo5890g(this.f4305g);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f4305g.getName().getBytes(C0998g.f3954a);
        f4299j.mo5892k(this.f4305g, bytes);
        return bytes;
    }

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f4300b.mo5226c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f4303e).putInt(this.f4304f).array();
        this.f4302d.mo5145b(messageDigest);
        this.f4301c.mo5145b(messageDigest);
        messageDigest.update(bArr);
        C1006m<?> mVar = this.f4307i;
        if (mVar != null) {
            mVar.mo5145b(messageDigest);
        }
        this.f4306h.mo5145b(messageDigest);
        messageDigest.update(m6031c());
        this.f4300b.mo5227d(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1143x)) {
            return false;
        }
        C1143x xVar = (C1143x) obj;
        return this.f4304f == xVar.f4304f && this.f4303e == xVar.f4303e && C1402k.m6976c(this.f4307i, xVar.f4307i) && this.f4305g.equals(xVar.f4305g) && this.f4301c.equals(xVar.f4301c) && this.f4302d.equals(xVar.f4302d) && this.f4306h.equals(xVar.f4306h);
    }

    public int hashCode() {
        int hashCode = (((((this.f4301c.hashCode() * 31) + this.f4302d.hashCode()) * 31) + this.f4303e) * 31) + this.f4304f;
        C1006m<?> mVar = this.f4307i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f4305g.hashCode()) * 31) + this.f4306h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f4301c + ", signature=" + this.f4302d + ", width=" + this.f4303e + ", height=" + this.f4304f + ", decodedResourceClass=" + this.f4305g + ", transformation='" + this.f4307i + '\'' + ", options=" + this.f4306h + '}';
    }
}
