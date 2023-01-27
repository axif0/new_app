package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.m */
class C2522m {

    /* renamed from: com.google.firebase.components.m$b */
    private static class C2524b {

        /* renamed from: a */
        private final C2508d<?> f8203a;

        /* renamed from: b */
        private final Set<C2524b> f8204b = new HashSet();

        /* renamed from: c */
        private final Set<C2524b> f8205c = new HashSet();

        C2524b(C2508d<?> dVar) {
            this.f8203a = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9384a(C2524b bVar) {
            this.f8204b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9385b(C2524b bVar) {
            this.f8205c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2508d<?> mo9386c() {
            return this.f8203a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<C2524b> mo9387d() {
            return this.f8204b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo9388e() {
            return this.f8204b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo9389f() {
            return this.f8205c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo9390g(C2524b bVar) {
            this.f8205c.remove(bVar);
        }
    }

    /* renamed from: com.google.firebase.components.m$c */
    private static class C2525c {

        /* renamed from: a */
        private final Class<?> f8206a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f8207b;

        private C2525c(Class<?> cls, boolean z) {
            this.f8206a = cls;
            this.f8207b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2525c)) {
                return false;
            }
            C2525c cVar = (C2525c) obj;
            return cVar.f8206a.equals(this.f8206a) && cVar.f8207b == this.f8207b;
        }

        public int hashCode() {
            return ((this.f8206a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8207b).hashCode();
        }
    }

    /* renamed from: a */
    static void m11314a(List<C2508d<?>> list) {
        Set<C2524b> c = m11316c(list);
        Set<C2524b> b = m11315b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C2524b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C2524b next2 : next.mo9387d()) {
                next2.mo9390g(next);
                if (next2.mo9389f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C2524b next3 : c) {
                if (!next3.mo9389f() && !next3.mo9388e()) {
                    arrayList.add(next3.mo9386c());
                }
            }
            throw new C2527o(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C2524b> m11315b(Set<C2524b> set) {
        HashSet hashSet = new HashSet();
        for (C2524b next : set) {
            if (next.mo9389f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C2524b> m11316c(List<C2508d<?>> list) {
        Set<C2524b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C2508d next : list) {
            C2524b bVar = new C2524b(next);
            Iterator it = next.mo9366e().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C2525c cVar = new C2525c(cls, !next.mo9370k());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f8207b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C2524b> it2 : hashMap.values()) {
            for (C2524b bVar2 : it2) {
                for (C2526n next2 : bVar2.mo9386c().mo9364c()) {
                    if (next2.mo9394b() && (set = (Set) hashMap.get(new C2525c(next2.mo9393a(), next2.mo9396d()))) != null) {
                        for (C2524b bVar3 : set) {
                            bVar2.mo9384a(bVar3);
                            bVar3.mo9385b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
