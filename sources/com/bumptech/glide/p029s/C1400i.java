package com.bumptech.glide.p029s;

/* renamed from: com.bumptech.glide.s.i */
public class C1400i {

    /* renamed from: a */
    private Class<?> f4795a;

    /* renamed from: b */
    private Class<?> f4796b;

    /* renamed from: c */
    private Class<?> f4797c;

    public C1400i() {
    }

    public C1400i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo5901a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void mo5901a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f4795a = cls;
        this.f4796b = cls2;
        this.f4797c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1400i.class != obj.getClass()) {
            return false;
        }
        C1400i iVar = (C1400i) obj;
        return this.f4795a.equals(iVar.f4795a) && this.f4796b.equals(iVar.f4796b) && C1402k.m6976c(this.f4797c, iVar.f4797c);
    }

    public int hashCode() {
        int hashCode = ((this.f4795a.hashCode() * 31) + this.f4796b.hashCode()) * 31;
        Class<?> cls = this.f4797c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f4795a + ", second=" + this.f4796b + '}';
    }
}
