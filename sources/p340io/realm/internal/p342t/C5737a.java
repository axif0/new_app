package p340io.realm.internal.p342t;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5648d0;
import p340io.realm.C5763l0;
import p340io.realm.C5781q;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5721o;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.Util;

/* renamed from: io.realm.internal.t.a */
public class C5737a extends C5721o {

    /* renamed from: a */
    private final Map<Class<? extends C5763l0>, C5721o> f16574a;

    /* renamed from: b */
    private final Map<String, Class<? extends C5763l0>> f16575b = new HashMap();

    public C5737a(C5721o... oVarArr) {
        HashMap hashMap = new HashMap();
        if (oVarArr != null) {
            for (C5721o oVar : oVarArr) {
                for (Class next : oVar.mo16147f()) {
                    String g = oVar.mo16640g(next);
                    Class cls = this.f16575b.get(g);
                    if (cls == null || cls.equals(next)) {
                        hashMap.put(next, oVar);
                        this.f16575b.put(g, next);
                    } else {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", new Object[]{cls, next, hashMap.get(cls), oVar, g}));
                    }
                }
            }
        }
        this.f16574a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: k */
    private C5721o m23977k(Class<? extends C5763l0> cls) {
        C5721o oVar = this.f16574a.get(cls);
        if (oVar != null) {
            return oVar;
        }
        throw new RealmException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    /* renamed from: b */
    public <E extends C5763l0> E mo16144b(C5648d0 d0Var, E e, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        return m23977k(Util.m23789b(e.getClass())).mo16144b(d0Var, e, z, map, set);
    }

    /* renamed from: c */
    public C5704c mo16145c(Class<? extends C5763l0> cls, OsSchemaInfo osSchemaInfo) {
        return m23977k(cls).mo16145c(cls, osSchemaInfo);
    }

    /* renamed from: d */
    public Map<Class<? extends C5763l0>, OsObjectSchemaInfo> mo16146d() {
        HashMap hashMap = new HashMap();
        for (C5721o d : this.f16574a.values()) {
            hashMap.putAll(d.mo16146d());
        }
        return hashMap;
    }

    /* renamed from: f */
    public Set<Class<? extends C5763l0>> mo16147f() {
        return this.f16574a.keySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo16148h(Class<? extends C5763l0> cls) {
        return m23977k(cls).mo16640g(cls);
    }

    /* renamed from: i */
    public <E extends C5763l0> E mo16149i(Class<E> cls, Object obj, C5722p pVar, C5704c cVar, boolean z, List<String> list) {
        return m23977k(cls).mo16149i(cls, obj, pVar, cVar, z, list);
    }

    /* renamed from: j */
    public boolean mo16150j() {
        for (Map.Entry<Class<? extends C5763l0>, C5721o> value : this.f16574a.entrySet()) {
            if (!((C5721o) value.getValue()).mo16150j()) {
                return false;
            }
        }
        return true;
    }
}
