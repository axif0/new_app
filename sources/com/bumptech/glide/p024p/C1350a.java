package com.bumptech.glide.p024p;

import com.bumptech.glide.load.C0995d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.p.a */
public class C1350a {

    /* renamed from: a */
    private final List<C1351a<?>> f4655a = new ArrayList();

    /* renamed from: com.bumptech.glide.p.a$a */
    private static final class C1351a<T> {

        /* renamed from: a */
        private final Class<T> f4656a;

        /* renamed from: b */
        final C0995d<T> f4657b;

        C1351a(Class<T> cls, C0995d<T> dVar) {
            this.f4656a = cls;
            this.f4657b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5751a(Class<?> cls) {
            return this.f4656a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo5749a(Class<T> cls, C0995d<T> dVar) {
        this.f4655a.add(new C1351a(cls, dVar));
    }

    /* renamed from: b */
    public synchronized <T> C0995d<T> mo5750b(Class<T> cls) {
        for (C1351a next : this.f4655a) {
            if (next.mo5751a(cls)) {
                return next.f4657b;
            }
        }
        return null;
    }
}
