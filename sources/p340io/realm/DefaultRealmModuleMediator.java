package p340io.realm;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p048d.p049a.p050a.p051a.p067n.p070c.C3004a;
import p048d.p049a.p050a.p051a.p067n.p070c.C3005b;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p067n.p070c.C3007d;
import p048d.p049a.p050a.p051a.p079t.p080b.C3112d;
import p340io.realm.C5629a1;
import p340io.realm.C5632b;
import p340io.realm.C5645c1;
import p340io.realm.C5653e1;
import p340io.realm.C5666g1;
import p340io.realm.C5821y0;
import p340io.realm.annotations.RealmModule;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5721o;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;

@RealmModule
/* renamed from: io.realm.DefaultRealmModuleMediator */
class DefaultRealmModuleMediator extends C5721o {

    /* renamed from: a */
    private static final Set<Class<? extends C5763l0>> f16193a;

    static {
        HashSet hashSet = new HashSet(5);
        hashSet.add(C3112d.class);
        hashSet.add(C3004a.class);
        hashSet.add(C3006c.class);
        hashSet.add(C3007d.class);
        hashSet.add(C3005b.class);
        f16193a = Collections.unmodifiableSet(hashSet);
    }

    DefaultRealmModuleMediator() {
    }

    /* renamed from: b */
    public <E extends C5763l0> E mo16144b(C5648d0 d0Var, E e, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        Object t0;
        E e2 = e;
        Class<C3005b> cls = C3005b.class;
        Class<C3007d> cls2 = C3007d.class;
        Class<C3006c> cls3 = C3006c.class;
        Class<C3004a> cls4 = C3004a.class;
        Class<C3112d> cls5 = C3112d.class;
        Class superclass = e2 instanceof C5720n ? e.getClass().getSuperclass() : e.getClass();
        if (superclass.equals(cls5)) {
            t0 = C5666g1.m23515g0(d0Var, (C5666g1.C5667a) d0Var.mo16219H().mo16773b(cls5), (C3112d) e2, z, map, set);
        } else if (superclass.equals(cls4)) {
            t0 = C5821y0.m24299l0(d0Var, (C5821y0.C5822a) d0Var.mo16219H().mo16773b(cls4), (C3004a) e2, z, map, set);
        } else if (superclass.equals(cls3)) {
            t0 = C5645c1.m23394h0(d0Var, (C5645c1.C5646a) d0Var.mo16219H().mo16773b(cls3), (C3006c) e2, z, map, set);
        } else if (superclass.equals(cls2)) {
            t0 = C5653e1.m23447t0(d0Var, (C5653e1.C5654a) d0Var.mo16219H().mo16773b(cls2), (C3007d) e2, z, map, set);
        } else if (superclass.equals(cls)) {
            t0 = C5629a1.m23307t0(d0Var, (C5629a1.C5630a) d0Var.mo16219H().mo16773b(cls), (C3005b) e2, z, map, set);
        } else {
            throw C5721o.m23892e(superclass);
        }
        return (C5763l0) superclass.cast(t0);
    }

    /* renamed from: c */
    public C5704c mo16145c(Class<? extends C5763l0> cls, OsSchemaInfo osSchemaInfo) {
        C5721o.m23891a(cls);
        if (cls.equals(C3112d.class)) {
            return C5666g1.m23516h0(osSchemaInfo);
        }
        if (cls.equals(C3004a.class)) {
            return C5821y0.m24300m0(osSchemaInfo);
        }
        if (cls.equals(C3006c.class)) {
            return C5645c1.m23395i0(osSchemaInfo);
        }
        if (cls.equals(C3007d.class)) {
            return C5653e1.m23448u0(osSchemaInfo);
        }
        if (cls.equals(C3005b.class)) {
            return C5629a1.m23308u0(osSchemaInfo);
        }
        throw C5721o.m23892e(cls);
    }

    /* renamed from: d */
    public Map<Class<? extends C5763l0>, OsObjectSchemaInfo> mo16146d() {
        HashMap hashMap = new HashMap(5);
        hashMap.put(C3112d.class, C5666g1.m23518j0());
        hashMap.put(C3004a.class, C5821y0.m24302o0());
        hashMap.put(C3006c.class, C5645c1.m23397k0());
        hashMap.put(C3007d.class, C5653e1.m23450w0());
        hashMap.put(C3005b.class, C5629a1.m23310w0());
        return hashMap;
    }

    /* renamed from: f */
    public Set<Class<? extends C5763l0>> mo16147f() {
        return f16193a;
    }

    /* renamed from: h */
    public String mo16148h(Class<? extends C5763l0> cls) {
        C5721o.m23891a(cls);
        if (cls.equals(C3112d.class)) {
            return "YouTubeVideo";
        }
        if (cls.equals(C3004a.class)) {
            return "AcademicCalendar";
        }
        if (cls.equals(C3006c.class)) {
            return "FragmentData";
        }
        if (cls.equals(C3007d.class)) {
            return "Notification";
        }
        if (cls.equals(C3005b.class)) {
            return "FacultyNotification";
        }
        throw C5721o.m23892e(cls);
    }

    /* renamed from: i */
    public <E extends C5763l0> E mo16149i(Class<E> cls, Object obj, C5722p pVar, C5704c cVar, boolean z, List<String> list) {
        C5632b.C5637e eVar = (C5632b.C5637e) C5632b.f16245m.get();
        try {
            eVar.mo16245g((C5632b) obj, pVar, cVar, z, list);
            C5721o.m23891a(cls);
            if (cls.equals(C3112d.class)) {
                return (C5763l0) cls.cast(new C5666g1());
            }
            if (cls.equals(C3004a.class)) {
                E e = (C5763l0) cls.cast(new C5821y0());
                eVar.mo16239a();
                return e;
            } else if (cls.equals(C3006c.class)) {
                E e2 = (C5763l0) cls.cast(new C5645c1());
                eVar.mo16239a();
                return e2;
            } else if (cls.equals(C3007d.class)) {
                E e3 = (C5763l0) cls.cast(new C5653e1());
                eVar.mo16239a();
                return e3;
            } else if (cls.equals(C3005b.class)) {
                E e4 = (C5763l0) cls.cast(new C5629a1());
                eVar.mo16239a();
                return e4;
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
