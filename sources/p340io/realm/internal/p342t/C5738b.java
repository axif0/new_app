package p340io.realm.internal.p342t;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p340io.realm.C5648d0;
import p340io.realm.C5763l0;
import p340io.realm.C5781q;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5721o;
import p340io.realm.internal.C5722p;
import p340io.realm.internal.OsObjectSchemaInfo;
import p340io.realm.internal.OsSchemaInfo;
import p340io.realm.internal.Util;

/* renamed from: io.realm.internal.t.b */
public class C5738b extends C5721o {

    /* renamed from: a */
    private final C5721o f16576a;

    /* renamed from: b */
    private final Set<Class<? extends C5763l0>> f16577b;

    public C5738b(C5721o oVar, Collection<Class<? extends C5763l0>> collection) {
        this.f16576a = oVar;
        HashSet hashSet = new HashSet();
        if (oVar != null) {
            Set<Class<? extends C5763l0>> f = oVar.mo16147f();
            for (Class next : collection) {
                if (f.contains(next)) {
                    hashSet.add(next);
                }
            }
        }
        this.f16577b = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: k */
    private void m23985k(Class<? extends C5763l0> cls) {
        if (!this.f16577b.contains(cls)) {
            throw new IllegalArgumentException(cls.getSimpleName() + " is not part of the schema for this Realm");
        }
    }

    /* renamed from: b */
    public <E extends C5763l0> E mo16144b(C5648d0 d0Var, E e, boolean z, Map<C5763l0, C5720n> map, Set<C5781q> set) {
        m23985k(Util.m23789b(e.getClass()));
        return this.f16576a.mo16144b(d0Var, e, z, map, set);
    }

    /* renamed from: c */
    public C5704c mo16145c(Class<? extends C5763l0> cls, OsSchemaInfo osSchemaInfo) {
        m23985k(cls);
        return this.f16576a.mo16145c(cls, osSchemaInfo);
    }

    /* renamed from: d */
    public Map<Class<? extends C5763l0>, OsObjectSchemaInfo> mo16146d() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f16576a.mo16146d().entrySet()) {
            if (this.f16577b.contains(next.getKey())) {
                hashMap.put((Class) next.getKey(), (OsObjectSchemaInfo) next.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    public Set<Class<? extends C5763l0>> mo16147f() {
        return this.f16577b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo16148h(Class<? extends C5763l0> cls) {
        m23985k(cls);
        return this.f16576a.mo16640g(cls);
    }

    /* renamed from: i */
    public <E extends C5763l0> E mo16149i(Class<E> cls, Object obj, C5722p pVar, C5704c cVar, boolean z, List<String> list) {
        m23985k(cls);
        return this.f16576a.mo16149i(cls, obj, pVar, cVar, z, list);
    }

    /* renamed from: j */
    public boolean mo16150j() {
        C5721o oVar = this.f16576a;
        if (oVar == null) {
            return true;
        }
        return oVar.mo16150j();
    }
}
