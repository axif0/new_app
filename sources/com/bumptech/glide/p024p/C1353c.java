package com.bumptech.glide.p024p;

import com.bumptech.glide.load.p008o.C1110i;
import com.bumptech.glide.load.p008o.C1138t;
import com.bumptech.glide.load.p014q.p020i.C1317g;
import com.bumptech.glide.p029s.C1400i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p086f.p102e.C3190a;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.p.c */
public class C1353c {

    /* renamed from: c */
    private static final C1138t<?, ?, ?> f4659c = new C1138t(Object.class, Object.class, Object.class, Collections.singletonList(new C1110i(Object.class, Object.class, Object.class, Collections.emptyList(), new C1317g(), (C3346e<List<Throwable>>) null)), (C3346e<List<Throwable>>) null);

    /* renamed from: a */
    private final C3190a<C1400i, C1138t<?, ?, ?>> f4660a = new C3190a<>();

    /* renamed from: b */
    private final AtomicReference<C1400i> f4661b = new AtomicReference<>();

    /* renamed from: b */
    private C1400i m6717b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C1400i andSet = this.f4661b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C1400i();
        }
        andSet.mo5901a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1138t<Data, TResource, Transcode> mo5754a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1138t<Data, TResource, Transcode> tVar;
        C1400i b = m6717b(cls, cls2, cls3);
        synchronized (this.f4660a) {
            tVar = this.f4660a.get(b);
        }
        this.f4661b.set(b);
        return tVar;
    }

    /* renamed from: c */
    public boolean mo5755c(C1138t<?, ?, ?> tVar) {
        return f4659c.equals(tVar);
    }

    /* renamed from: d */
    public void mo5756d(Class<?> cls, Class<?> cls2, Class<?> cls3, C1138t<?, ?, ?> tVar) {
        synchronized (this.f4660a) {
            C3190a<C1400i, C1138t<?, ?, ?>> aVar = this.f4660a;
            C1400i iVar = new C1400i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f4659c;
            }
            aVar.put(iVar, tVar);
        }
    }
}
