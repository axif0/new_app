package com.bumptech.glide.p028r;

import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.p029s.C1401j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.r.b */
public final class C1387b implements C0998g {

    /* renamed from: b */
    private final Object f4774b;

    public C1387b(Object obj) {
        C1401j.m6972d(obj);
        this.f4774b = obj;
    }

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        messageDigest.update(this.f4774b.toString().getBytes(C0998g.f3954a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1387b) {
            return this.f4774b.equals(((C1387b) obj).f4774b);
        }
        return false;
    }

    public int hashCode() {
        return this.f4774b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f4774b + '}';
    }
}
