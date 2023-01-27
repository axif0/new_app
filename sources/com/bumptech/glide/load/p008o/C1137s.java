package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0998g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.s */
final class C1137s {

    /* renamed from: a */
    private final Map<C0998g, C1123l<?>> f4279a = new HashMap();

    /* renamed from: b */
    private final Map<C0998g, C1123l<?>> f4280b = new HashMap();

    C1137s() {
    }

    /* renamed from: b */
    private Map<C0998g, C1123l<?>> m6008b(boolean z) {
        return z ? this.f4280b : this.f4279a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1123l<?> mo5443a(C0998g gVar, boolean z) {
        return m6008b(z).get(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5444c(C0998g gVar, C1123l<?> lVar) {
        m6008b(lVar.mo5401p()).put(gVar, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5445d(C0998g gVar, C1123l<?> lVar) {
        Map<C0998g, C1123l<?>> b = m6008b(lVar.mo5401p());
        if (lVar.equals(b.get(gVar))) {
            b.remove(gVar);
        }
    }
}
