package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p148g.p189d.p281b.p284g.C5193c;
import p148g.p189d.p281b.p286i.C5200a;

/* renamed from: com.google.firebase.components.v */
final class C2534v extends C2505a {

    /* renamed from: a */
    private final Set<Class<?>> f8219a;

    /* renamed from: b */
    private final Set<Class<?>> f8220b;

    /* renamed from: c */
    private final Set<Class<?>> f8221c;

    /* renamed from: d */
    private final Set<Class<?>> f8222d;

    /* renamed from: e */
    private final Set<Class<?>> f8223e;

    /* renamed from: f */
    private final C2511e f8224f;

    /* renamed from: com.google.firebase.components.v$a */
    private static class C2535a implements C5193c {
        public C2535a(Set<Class<?>> set, C5193c cVar) {
        }
    }

    C2534v(C2508d<?> dVar, C2511e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C2526n next : dVar.mo9364c()) {
            if (next.mo9394b()) {
                boolean d = next.mo9396d();
                Class<?> a = next.mo9393a();
                if (d) {
                    hashSet3.add(a);
                } else {
                    hashSet.add(a);
                }
            } else {
                boolean d2 = next.mo9396d();
                Class<?> a2 = next.mo9393a();
                if (d2) {
                    hashSet4.add(a2);
                } else {
                    hashSet2.add(a2);
                }
            }
        }
        if (!dVar.mo9367f().isEmpty()) {
            hashSet.add(C5193c.class);
        }
        this.f8219a = Collections.unmodifiableSet(hashSet);
        this.f8220b = Collections.unmodifiableSet(hashSet2);
        this.f8221c = Collections.unmodifiableSet(hashSet3);
        this.f8222d = Collections.unmodifiableSet(hashSet4);
        this.f8223e = dVar.mo9367f();
        this.f8224f = eVar;
    }

    /* renamed from: a */
    public <T> T mo9362a(Class<T> cls) {
        if (this.f8219a.contains(cls)) {
            T a = this.f8224f.mo9362a(cls);
            return !cls.equals(C5193c.class) ? a : new C2535a(this.f8223e, (C5193c) a);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> Set<T> mo9363b(Class<T> cls) {
        if (this.f8221c.contains(cls)) {
            return this.f8224f.mo9363b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C5200a<T> mo9377c(Class<T> cls) {
        if (this.f8220b.contains(cls)) {
            return this.f8224f.mo9377c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> C5200a<Set<T>> mo9378d(Class<T> cls) {
        if (this.f8222d.contains(cls)) {
            return this.f8224f.mo9378d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
