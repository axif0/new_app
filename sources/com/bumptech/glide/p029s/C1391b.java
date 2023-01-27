package com.bumptech.glide.p029s;

import p086f.p102e.C3190a;
import p086f.p102e.C3203g;

/* renamed from: com.bumptech.glide.s.b */
public final class C1391b<K, V> extends C3190a<K, V> {

    /* renamed from: n */
    private int f4781n;

    public void clear() {
        this.f4781n = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f4781n == 0) {
            this.f4781n = super.hashCode();
        }
        return this.f4781n;
    }

    /* renamed from: j */
    public void mo5867j(C3203g<? extends K, ? extends V> gVar) {
        this.f4781n = 0;
        super.mo5867j(gVar);
    }

    /* renamed from: k */
    public V mo5868k(int i) {
        this.f4781n = 0;
        return super.mo5868k(i);
    }

    /* renamed from: l */
    public V mo5869l(int i, V v) {
        this.f4781n = 0;
        return super.mo5869l(i, v);
    }

    public V put(K k, V v) {
        this.f4781n = 0;
        return super.put(k, v);
    }
}
