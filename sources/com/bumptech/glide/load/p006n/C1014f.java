package com.bumptech.glide.load.p006n;

import com.bumptech.glide.load.p006n.C1012e;
import com.bumptech.glide.p029s.C1401j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.f */
public class C1014f {

    /* renamed from: b */
    private static final C1012e.C1013a<?> f3971b = new C1015a();

    /* renamed from: a */
    private final Map<Class<?>, C1012e.C1013a<?>> f3972a = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.f$a */
    class C1015a implements C1012e.C1013a<Object> {
        C1015a() {
        }

        /* renamed from: a */
        public Class<Object> mo5182a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: b */
        public C1012e<Object> mo5183b(Object obj) {
            return new C1016b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.f$b */
    private static final class C1016b implements C1012e<Object> {

        /* renamed from: a */
        private final Object f3973a;

        C1016b(Object obj) {
            this.f3973a = obj;
        }

        /* renamed from: a */
        public Object mo5180a() {
            return this.f3973a;
        }

        /* renamed from: b */
        public void mo5181b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> C1012e<T> mo5184a(T t) {
        C1012e.C1013a<?> aVar;
        C1401j.m6972d(t);
        aVar = this.f3972a.get(t.getClass());
        if (aVar == null) {
            Iterator<C1012e.C1013a<?>> it = this.f3972a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1012e.C1013a<?> next = it.next();
                if (next.mo5182a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f3971b;
        }
        return aVar.mo5183b(t);
    }

    /* renamed from: b */
    public synchronized void mo5185b(C1012e.C1013a<?> aVar) {
        this.f3972a.put(aVar.mo5182a(), aVar);
    }
}
