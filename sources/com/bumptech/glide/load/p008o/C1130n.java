package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.p029s.C1401j;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.n */
class C1130n implements C0998g {

    /* renamed from: b */
    private final Object f4255b;

    /* renamed from: c */
    private final int f4256c;

    /* renamed from: d */
    private final int f4257d;

    /* renamed from: e */
    private final Class<?> f4258e;

    /* renamed from: f */
    private final Class<?> f4259f;

    /* renamed from: g */
    private final C0998g f4260g;

    /* renamed from: h */
    private final Map<Class<?>, C1006m<?>> f4261h;

    /* renamed from: i */
    private final C1002i f4262i;

    /* renamed from: j */
    private int f4263j;

    C1130n(Object obj, C0998g gVar, int i, int i2, Map<Class<?>, C1006m<?>> map, Class<?> cls, Class<?> cls2, C1002i iVar) {
        C1401j.m6972d(obj);
        this.f4255b = obj;
        C1401j.m6973e(gVar, "Signature must not be null");
        this.f4260g = gVar;
        this.f4256c = i;
        this.f4257d = i2;
        C1401j.m6972d(map);
        this.f4261h = map;
        C1401j.m6973e(cls, "Resource class must not be null");
        this.f4258e = cls;
        C1401j.m6973e(cls2, "Transcode class must not be null");
        this.f4259f = cls2;
        C1401j.m6972d(iVar);
        this.f4262i = iVar;
    }

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1130n)) {
            return false;
        }
        C1130n nVar = (C1130n) obj;
        return this.f4255b.equals(nVar.f4255b) && this.f4260g.equals(nVar.f4260g) && this.f4257d == nVar.f4257d && this.f4256c == nVar.f4256c && this.f4261h.equals(nVar.f4261h) && this.f4258e.equals(nVar.f4258e) && this.f4259f.equals(nVar.f4259f) && this.f4262i.equals(nVar.f4262i);
    }

    public int hashCode() {
        if (this.f4263j == 0) {
            int hashCode = this.f4255b.hashCode();
            this.f4263j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f4260g.hashCode();
            this.f4263j = hashCode2;
            int i = (hashCode2 * 31) + this.f4256c;
            this.f4263j = i;
            int i2 = (i * 31) + this.f4257d;
            this.f4263j = i2;
            int hashCode3 = (i2 * 31) + this.f4261h.hashCode();
            this.f4263j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f4258e.hashCode();
            this.f4263j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f4259f.hashCode();
            this.f4263j = hashCode5;
            this.f4263j = (hashCode5 * 31) + this.f4262i.hashCode();
        }
        return this.f4263j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f4255b + ", width=" + this.f4256c + ", height=" + this.f4257d + ", resourceClass=" + this.f4258e + ", transcodeClass=" + this.f4259f + ", signature=" + this.f4260g + ", hashCode=" + this.f4263j + ", transformations=" + this.f4261h + ", options=" + this.f4262i + '}';
    }
}
