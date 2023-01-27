package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p148g.p189d.p281b.p284g.C5193c;
import p148g.p189d.p281b.p284g.C5194d;
import p148g.p189d.p281b.p286i.C5200a;

/* renamed from: com.google.firebase.components.l */
public class C2521l extends C2505a {

    /* renamed from: e */
    private static final C5200a<Set<Object>> f8198e = C2520k.m11305a();

    /* renamed from: a */
    private final Map<C2508d<?>, C2531s<?>> f8199a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C2531s<?>> f8200b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C2531s<Set<?>>> f8201c = new HashMap();

    /* renamed from: d */
    private final C2530r f8202d;

    public C2521l(Executor executor, Iterable<C2517h> iterable, C2508d<?>... dVarArr) {
        this.f8202d = new C2530r(executor);
        ArrayList<C2508d> arrayList = new ArrayList<>();
        arrayList.add(C2508d.m11274n(this.f8202d, C2530r.class, C5194d.class, C5193c.class));
        for (C2517h components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (C2508d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        C2522m.m11314a(arrayList);
        for (C2508d dVar2 : arrayList) {
            this.f8199a.put(dVar2, new C2531s(C2518i.m11303a(this, dVar2)));
        }
        m11308h();
        m11309i();
    }

    /* renamed from: g */
    static /* synthetic */ Set m11307g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((C2531s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: h */
    private void m11308h() {
        for (Map.Entry next : this.f8199a.entrySet()) {
            C2508d dVar = (C2508d) next.getKey();
            if (dVar.mo9370k()) {
                C2531s sVar = (C2531s) next.getValue();
                for (Class put : dVar.mo9366e()) {
                    this.f8200b.put(put, sVar);
                }
            }
        }
        m11310j();
    }

    /* renamed from: i */
    private void m11309i() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f8199a.entrySet()) {
            C2508d dVar = (C2508d) next.getKey();
            if (!dVar.mo9370k()) {
                C2531s sVar = (C2531s) next.getValue();
                for (Class cls : dVar.mo9366e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(sVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f8201c.put((Class) entry.getKey(), new C2531s(C2519j.m11304a((Set) entry.getValue())));
        }
    }

    /* renamed from: j */
    private void m11310j() {
        for (C2508d next : this.f8199a.keySet()) {
            Iterator<C2526n> it = next.mo9364c().iterator();
            while (true) {
                if (it.hasNext()) {
                    C2526n next2 = it.next();
                    if (next2.mo9395c() && !this.f8200b.containsKey(next2.mo9393a())) {
                        throw new C2532t(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo9393a()}));
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public <T> C5200a<T> mo9377c(Class<T> cls) {
        C2533u.m11341c(cls, "Null interface requested.");
        return this.f8200b.get(cls);
    }

    /* renamed from: d */
    public <T> C5200a<Set<T>> mo9378d(Class<T> cls) {
        C2531s sVar = this.f8201c.get(cls);
        return sVar != null ? sVar : f8198e;
    }

    /* renamed from: e */
    public void mo9383e(boolean z) {
        for (Map.Entry next : this.f8199a.entrySet()) {
            C2508d dVar = (C2508d) next.getKey();
            C2531s sVar = (C2531s) next.getValue();
            if (dVar.mo9368i() || (dVar.mo9369j() && z)) {
                sVar.get();
            }
        }
        this.f8202d.mo9403c();
    }
}
