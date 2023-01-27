package com.bumptech.glide.p024p;

import com.bumptech.glide.load.C1005l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.p.f */
public class C1357f {

    /* renamed from: a */
    private final List<C1358a<?>> f4669a = new ArrayList();

    /* renamed from: com.bumptech.glide.p.f$a */
    private static final class C1358a<T> {

        /* renamed from: a */
        private final Class<T> f4670a;

        /* renamed from: b */
        final C1005l<T> f4671b;

        C1358a(Class<T> cls, C1005l<T> lVar) {
            this.f4670a = cls;
            this.f4671b = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5766a(Class<?> cls) {
            return this.f4670a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo5764a(Class<Z> cls, C1005l<Z> lVar) {
        this.f4669a.add(new C1358a(cls, lVar));
    }

    /* renamed from: b */
    public synchronized <Z> C1005l<Z> mo5765b(Class<Z> cls) {
        int size = this.f4669a.size();
        for (int i = 0; i < size; i++) {
            C1358a aVar = this.f4669a.get(i);
            if (aVar.mo5766a(cls)) {
                return aVar.f4671b;
            }
        }
        return null;
    }
}
