package com.bumptech.glide.p029s.p030l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p121l.C3346e;
import p086f.p111h.p121l.C3348g;

/* renamed from: com.bumptech.glide.s.l.a */
public final class C1404a {

    /* renamed from: a */
    private static final C1411g<Object> f4801a = new C1405a();

    /* renamed from: com.bumptech.glide.s.l.a$a */
    class C1405a implements C1411g<Object> {
        C1405a() {
        }

        /* renamed from: a */
        public void mo5905a(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.s.l.a$b */
    class C1406b implements C1408d<List<T>> {
        C1406b() {
        }

        /* renamed from: b */
        public List<T> mo5304a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.s.l.a$c */
    class C1407c implements C1411g<List<T>> {
        C1407c() {
        }

        /* renamed from: b */
        public void mo5905a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.s.l.a$d */
    public interface C1408d<T> {
        /* renamed from: a */
        T mo5304a();
    }

    /* renamed from: com.bumptech.glide.s.l.a$e */
    private static final class C1409e<T> implements C3346e<T> {

        /* renamed from: a */
        private final C1408d<T> f4802a;

        /* renamed from: b */
        private final C1411g<T> f4803b;

        /* renamed from: c */
        private final C3346e<T> f4804c;

        C1409e(C3346e<T> eVar, C1408d<T> dVar, C1411g<T> gVar) {
            this.f4804c = eVar;
            this.f4802a = dVar;
            this.f4803b = gVar;
        }

        /* renamed from: a */
        public boolean mo5908a(T t) {
            if (t instanceof C1410f) {
                ((C1410f) t).mo5306i().mo5910b(true);
            }
            this.f4803b.mo5905a(t);
            return this.f4804c.mo5908a(t);
        }

        /* renamed from: b */
        public T mo5909b() {
            T b = this.f4804c.mo5909b();
            if (b == null) {
                b = this.f4802a.mo5304a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b.getClass());
                }
            }
            if (b instanceof C1410f) {
                ((C1410f) b).mo5306i().mo5910b(false);
            }
            return b;
        }
    }

    /* renamed from: com.bumptech.glide.s.l.a$f */
    public interface C1410f {
        /* renamed from: i */
        C1413c mo5306i();
    }

    /* renamed from: com.bumptech.glide.s.l.a$g */
    public interface C1411g<T> {
        /* renamed from: a */
        void mo5905a(T t);
    }

    /* renamed from: a */
    private static <T extends C1410f> C3346e<T> m6993a(C3346e<T> eVar, C1408d<T> dVar) {
        return m6994b(eVar, dVar, m6995c());
    }

    /* renamed from: b */
    private static <T> C3346e<T> m6994b(C3346e<T> eVar, C1408d<T> dVar, C1411g<T> gVar) {
        return new C1409e(eVar, dVar, gVar);
    }

    /* renamed from: c */
    private static <T> C1411g<T> m6995c() {
        return f4801a;
    }

    /* renamed from: d */
    public static <T extends C1410f> C3346e<T> m6996d(int i, C1408d<T> dVar) {
        return m6993a(new C3348g(i), dVar);
    }

    /* renamed from: e */
    public static <T> C3346e<List<T>> m6997e() {
        return m6998f(20);
    }

    /* renamed from: f */
    public static <T> C3346e<List<T>> m6998f(int i) {
        return m6994b(new C3348g(i), new C1406b(), new C1407c());
    }
}
