package com.bumptech.glide.load;

import com.bumptech.glide.p029s.C1391b;
import java.security.MessageDigest;
import p086f.p102e.C3190a;

/* renamed from: com.bumptech.glide.load.i */
public final class C1002i implements C0998g {

    /* renamed from: b */
    private final C3190a<C0999h<?>, Object> f3960b = new C1391b();

    /* renamed from: f */
    private static <T> void m5551f(C0999h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.mo5150g(obj, messageDigest);
    }

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        for (int i = 0; i < this.f3960b.size(); i++) {
            m5551f(this.f3960b.mo11139i(i), this.f3960b.mo11141m(i), messageDigest);
        }
    }

    /* renamed from: c */
    public <T> T mo5154c(C0999h<T> hVar) {
        return this.f3960b.containsKey(hVar) ? this.f3960b.get(hVar) : hVar.mo5148c();
    }

    /* renamed from: d */
    public void mo5155d(C1002i iVar) {
        this.f3960b.mo5867j(iVar.f3960b);
    }

    /* renamed from: e */
    public <T> C1002i mo5156e(C0999h<T> hVar, T t) {
        this.f3960b.put(hVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1002i) {
            return this.f3960b.equals(((C1002i) obj).f3960b);
        }
        return false;
    }

    public int hashCode() {
        return this.f3960b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f3960b + '}';
    }
}
