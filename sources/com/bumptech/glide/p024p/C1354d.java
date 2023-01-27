package com.bumptech.glide.p024p;

import com.bumptech.glide.p029s.C1400i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p086f.p102e.C3190a;

/* renamed from: com.bumptech.glide.p.d */
public class C1354d {

    /* renamed from: a */
    private final AtomicReference<C1400i> f4662a = new AtomicReference<>();

    /* renamed from: b */
    private final C3190a<C1400i, List<Class<?>>> f4663b = new C3190a<>();

    /* renamed from: a */
    public List<Class<?>> mo5757a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C1400i andSet = this.f4662a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C1400i(cls, cls2, cls3);
        } else {
            andSet.mo5901a(cls, cls2, cls3);
        }
        synchronized (this.f4663b) {
            list = this.f4663b.get(andSet);
        }
        this.f4662a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void mo5758b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f4663b) {
            this.f4663b.put(new C1400i(cls, cls2, cls3), list);
        }
    }
}
