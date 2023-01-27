package p340io.realm;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5632b;
import p340io.realm.C5674i1;
import p340io.realm.C5759k1;
import p340io.realm.C5768m1;
import p340io.realm.C5775o1;
import p340io.realm.C5783q1;
import p340io.realm.C5790s1;
import p340io.realm.annotations.RealmModule;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5721o;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.p347v1.C5805a;
import p340io.realm.p347v1.p348b.C5807a;
import p340io.realm.p347v1.p348b.C5808b;
import p340io.realm.p347v1.p348b.C5809c;
import p340io.realm.p347v1.p348b.C5810d;
import p340io.realm.p347v1.p348b.C5811e;

@RealmModule
/* renamed from: io.realm.BaseModuleMediator */
class BaseModuleMediator extends C5721o {

    /* renamed from: a */
    private static final Set<Class<? extends C5763l0>> f16192a;

    static {
        HashSet hashSet = new HashSet(6);
        hashSet.add(C5809c.class);
        hashSet.add(C5810d.class);
        hashSet.add(C5807a.class);
        hashSet.add(C5808b.class);
        hashSet.add(C5811e.class);
        hashSet.add(C5805a.class);
        f16192a = Collections.unmodifiableSet(hashSet);
    }

    BaseModuleMediator() {
    }

    /* renamed from: b */
    public <E extends C5763l0> E mo16144b(C5648d0 d0Var, E e, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        Object V;
        E e2 = e;
        Class<C5805a> cls = C5805a.class;
        Class<C5811e> cls2 = C5811e.class;
        Class<C5808b> cls3 = C5808b.class;
        Class<C5807a> cls4 = C5807a.class;
        Class<C5810d> cls5 = C5810d.class;
        Class<C5809c> cls6 = C5809c.class;
        Class superclass = e2 instanceof C5720n ? e.getClass().getSuperclass() : e.getClass();
        if (superclass.equals(cls6)) {
            V = C5775o1.m24140W(d0Var, (C5775o1.C5776a) d0Var.mo16219H().mo16773b(cls6), (C5809c) e2, z, map, set);
        } else if (superclass.equals(cls5)) {
            V = C5783q1.m24164X(d0Var, (C5783q1.C5784a) d0Var.mo16219H().mo16773b(cls5), (C5810d) e2, z, map, set);
        } else if (superclass.equals(cls4)) {
            V = C5759k1.m24057W(d0Var, (C5759k1.C5760a) d0Var.mo16219H().mo16773b(cls4), (C5807a) e2, z, map, set);
        } else if (superclass.equals(cls3)) {
            V = C5768m1.m24104V(d0Var, (C5768m1.C5769a) d0Var.mo16219H().mo16773b(cls3), (C5808b) e2, z, map, set);
        } else if (superclass.equals(cls2)) {
            V = C5790s1.m24213W(d0Var, (C5790s1.C5791a) d0Var.mo16219H().mo16773b(cls2), (C5811e) e2, z, map, set);
        } else if (superclass.equals(cls)) {
            V = C5674i1.m23577V(d0Var, (C5674i1.C5675a) d0Var.mo16219H().mo16773b(cls), (C5805a) e2, z, map, set);
        } else {
            throw C5721o.m23892e(superclass);
        }
        return (C5763l0) superclass.cast(V);
    }

    /* renamed from: c */
    public C5704c mo16145c(Class<? extends C5763l0> cls, OsSchemaInfo osSchemaInfo) {
        C5721o.m23891a(cls);
        if (cls.equals(C5809c.class)) {
            return C5775o1.m24141X(osSchemaInfo);
        }
        if (cls.equals(C5810d.class)) {
            return C5783q1.m24165Y(osSchemaInfo);
        }
        if (cls.equals(C5807a.class)) {
            return C5759k1.m24058X(osSchemaInfo);
        }
        if (cls.equals(C5808b.class)) {
            return C5768m1.m24105W(osSchemaInfo);
        }
        if (cls.equals(C5811e.class)) {
            return C5790s1.m24214X(osSchemaInfo);
        }
        if (cls.equals(C5805a.class)) {
            return C5674i1.m23578W(osSchemaInfo);
        }
        throw C5721o.m23892e(cls);
    }

    /* renamed from: d */
    public Map<Class<? extends C5763l0>, OsObjectSchemaInfo> mo16146d() {
        HashMap hashMap = new HashMap(6);
        hashMap.put(C5809c.class, C5775o1.m24143Z());
        hashMap.put(C5810d.class, C5783q1.m24167a0());
        hashMap.put(C5807a.class, C5759k1.m24060Z());
        hashMap.put(C5808b.class, C5768m1.m24107Y());
        hashMap.put(C5811e.class, C5790s1.m24216Z());
        hashMap.put(C5805a.class, C5674i1.m23580Y());
        return hashMap;
    }

    /* renamed from: f */
    public Set<Class<? extends C5763l0>> mo16147f() {
        return f16192a;
    }

    /* renamed from: h */
    public String mo16148h(Class<? extends C5763l0> cls) {
        C5721o.m23891a(cls);
        if (cls.equals(C5809c.class)) {
            return "__User";
        }
        if (cls.equals(C5810d.class)) {
            return "__Realm";
        }
        if (cls.equals(C5807a.class)) {
            return "__Class";
        }
        if (cls.equals(C5808b.class)) {
            return "__Permission";
        }
        if (cls.equals(C5811e.class)) {
            return "__Role";
        }
        if (cls.equals(C5805a.class)) {
            return "__ResultSets";
        }
        throw C5721o.m23892e(cls);
    }

    /* renamed from: i */
    public <E extends C5763l0> E mo16149i(Class<E> cls, Object obj, C5722p pVar, C5704c cVar, boolean z, List<String> list) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        try {
            eVar.mo16245g((C5632b) obj, pVar, cVar, z, list);
            C5721o.m23891a(cls);
            if (cls.equals(C5809c.class)) {
                return (C5763l0) cls.cast(new C5775o1());
            }
            if (cls.equals(C5810d.class)) {
                E e = (C5763l0) cls.cast(new C5783q1());
                eVar.mo16239a();
                return e;
            } else if (cls.equals(C5807a.class)) {
                E e2 = (C5763l0) cls.cast(new C5759k1());
                eVar.mo16239a();
                return e2;
            } else if (cls.equals(C5808b.class)) {
                E e3 = (C5763l0) cls.cast(new C5768m1());
                eVar.mo16239a();
                return e3;
            } else if (cls.equals(C5811e.class)) {
                E e4 = (C5763l0) cls.cast(new C5790s1());
                eVar.mo16239a();
                return e4;
            } else if (cls.equals(C5805a.class)) {
                E e5 = (C5763l0) cls.cast(new C5674i1());
                eVar.mo16239a();
                return e5;
            } else {
                throw C5721o.m23892e(cls);
            }
        } finally {
            eVar.mo16239a();
        }
    }

    /* renamed from: j */
    public boolean mo16150j() {
        return true;
    }
}
