package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0998g;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.d */
final class C1096d implements C0998g {

    /* renamed from: b */
    private final C0998g f4113b;

    /* renamed from: c */
    private final C0998g f4114c;

    C1096d(C0998g gVar, C0998g gVar2) {
        this.f4113b = gVar;
        this.f4114c = gVar2;
    }

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        this.f4113b.mo5145b(messageDigest);
        this.f4114c.mo5145b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1096d)) {
            return false;
        }
        C1096d dVar = (C1096d) obj;
        return this.f4113b.equals(dVar.f4113b) && this.f4114c.equals(dVar.f4114c);
    }

    public int hashCode() {
        return (this.f4113b.hashCode() * 31) + this.f4114c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f4113b + ", signature=" + this.f4114c + '}';
    }
}
