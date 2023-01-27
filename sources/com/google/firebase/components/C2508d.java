package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.d */
public final class C2508d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f8179a;

    /* renamed from: b */
    private final Set<C2526n> f8180b;

    /* renamed from: c */
    private final int f8181c;

    /* renamed from: d */
    private final int f8182d;

    /* renamed from: e */
    private final C2516g<T> f8183e;

    /* renamed from: f */
    private final Set<Class<?>> f8184f;

    /* renamed from: com.google.firebase.components.d$b */
    public static class C2510b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f8185a;

        /* renamed from: b */
        private final Set<C2526n> f8186b;

        /* renamed from: c */
        private int f8187c;

        /* renamed from: d */
        private int f8188d;

        /* renamed from: e */
        private C2516g<T> f8189e;

        /* renamed from: f */
        private Set<Class<?>> f8190f;

        @SafeVarargs
        private C2510b(Class<T> cls, Class<? super T>... clsArr) {
            this.f8185a = new HashSet();
            this.f8186b = new HashSet();
            this.f8187c = 0;
            this.f8188d = 0;
            this.f8190f = new HashSet();
            C2533u.m11341c(cls, "Null interface");
            this.f8185a.add(cls);
            for (Class<? super T> c : clsArr) {
                C2533u.m11341c(c, "Null interface");
            }
            Collections.addAll(this.f8185a, clsArr);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C2510b<T> m11283g() {
            this.f8188d = 1;
            return this;
        }

        /* renamed from: h */
        private C2510b<T> m11284h(int i) {
            C2533u.m11342d(this.f8187c == 0, "Instantiation type has already been set.");
            this.f8187c = i;
            return this;
        }

        /* renamed from: i */
        private void m11285i(Class<?> cls) {
            C2533u.m11339a(!this.f8185a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C2510b<T> mo9372b(C2526n nVar) {
            C2533u.m11341c(nVar, "Null dependency");
            m11285i(nVar.mo9393a());
            this.f8186b.add(nVar);
            return this;
        }

        /* renamed from: c */
        public C2510b<T> mo9373c() {
            m11284h(1);
            return this;
        }

        /* renamed from: d */
        public C2508d<T> mo9374d() {
            C2533u.m11342d(this.f8189e != null, "Missing required property: factory.");
            return new C2508d(new HashSet(this.f8185a), new HashSet(this.f8186b), this.f8187c, this.f8188d, this.f8189e, this.f8190f);
        }

        /* renamed from: e */
        public C2510b<T> mo9375e() {
            m11284h(2);
            return this;
        }

        /* renamed from: f */
        public C2510b<T> mo9376f(C2516g<T> gVar) {
            C2533u.m11341c(gVar, "Null factory");
            this.f8189e = gVar;
            return this;
        }
    }

    private C2508d(Set<Class<? super T>> set, Set<C2526n> set2, int i, int i2, C2516g<T> gVar, Set<Class<?>> set3) {
        this.f8179a = Collections.unmodifiableSet(set);
        this.f8180b = Collections.unmodifiableSet(set2);
        this.f8181c = i;
        this.f8182d = i2;
        this.f8183e = gVar;
        this.f8184f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C2510b<T> m11268a(Class<T> cls) {
        return new C2510b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> C2510b<T> m11269b(Class<T> cls, Class<? super T>... clsArr) {
        return new C2510b<>(cls, clsArr);
    }

    /* renamed from: g */
    public static <T> C2508d<T> m11270g(T t, Class<T> cls) {
        C2510b<T> h = m11271h(cls);
        h.mo9376f(C2507c.m11266b(t));
        return h.mo9374d();
    }

    /* renamed from: h */
    public static <T> C2510b<T> m11271h(Class<T> cls) {
        C2510b<T> a = m11268a(cls);
        C2510b unused = a.m11283g();
        return a;
    }

    /* renamed from: l */
    static /* synthetic */ Object m11272l(Object obj, C2511e eVar) {
        return obj;
    }

    /* renamed from: m */
    static /* synthetic */ Object m11273m(Object obj, C2511e eVar) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: n */
    public static <T> C2508d<T> m11274n(T t, Class<T> cls, Class<? super T>... clsArr) {
        C2510b<T> b = m11269b(cls, clsArr);
        b.mo9376f(C2506b.m11264b(t));
        return b.mo9374d();
    }

    /* renamed from: c */
    public Set<C2526n> mo9364c() {
        return this.f8180b;
    }

    /* renamed from: d */
    public C2516g<T> mo9365d() {
        return this.f8183e;
    }

    /* renamed from: e */
    public Set<Class<? super T>> mo9366e() {
        return this.f8179a;
    }

    /* renamed from: f */
    public Set<Class<?>> mo9367f() {
        return this.f8184f;
    }

    /* renamed from: i */
    public boolean mo9368i() {
        return this.f8181c == 1;
    }

    /* renamed from: j */
    public boolean mo9369j() {
        return this.f8181c == 2;
    }

    /* renamed from: k */
    public boolean mo9370k() {
        return this.f8182d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f8179a.toArray()) + ">{" + this.f8181c + ", type=" + this.f8182d + ", deps=" + Arrays.toString(this.f8180b.toArray()) + "}";
    }
}
