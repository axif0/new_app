package com.bumptech.glide.load.p012p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.p.p */
public class C1191p {

    /* renamed from: a */
    private final C1196r f4363a;

    /* renamed from: b */
    private final C1192a f4364b;

    /* renamed from: com.bumptech.glide.load.p.p$a */
    private static class C1192a {

        /* renamed from: a */
        private final Map<Class<?>, C1193a<?>> f4365a = new HashMap();

        /* renamed from: com.bumptech.glide.load.p.p$a$a */
        private static class C1193a<Model> {

            /* renamed from: a */
            final List<C1188n<Model, ?>> f4366a;

            public C1193a(List<C1188n<Model, ?>> list) {
                this.f4366a = list;
            }
        }

        C1192a() {
        }

        /* renamed from: a */
        public void mo5507a() {
            this.f4365a.clear();
        }

        /* renamed from: b */
        public <Model> List<C1188n<Model, ?>> mo5508b(Class<Model> cls) {
            C1193a aVar = this.f4365a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f4366a;
        }

        /* renamed from: c */
        public <Model> void mo5509c(Class<Model> cls, List<C1188n<Model, ?>> list) {
            if (this.f4365a.put(cls, new C1193a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    private C1191p(C1196r rVar) {
        this.f4364b = new C1192a();
        this.f4363a = rVar;
    }

    public C1191p(C3346e<List<Throwable>> eVar) {
        this(new C1196r(eVar));
    }

    /* renamed from: b */
    private static <A> Class<A> m6152b(A a) {
        return a.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<C1188n<A, ?>> m6153e(Class<A> cls) {
        List<C1188n<A, ?>> b;
        b = this.f4364b.mo5508b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f4363a.mo5513e(cls));
            this.f4364b.mo5509c(cls, b);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo5504a(Class<Model> cls, Class<Data> cls2, C1190o<? extends Model, ? extends Data> oVar) {
        this.f4363a.mo5511b(cls, cls2, oVar);
        this.f4364b.mo5507a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> mo5505c(Class<?> cls) {
        return this.f4363a.mo5514g(cls);
    }

    /* renamed from: d */
    public <A> List<C1188n<A, ?>> mo5506d(A a) {
        List e = m6153e(m6152b(a));
        int size = e.size();
        List<C1188n<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C1188n nVar = (C1188n) e.get(i);
            if (nVar.mo5454b(a)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(nVar);
            }
        }
        return emptyList;
    }
}
