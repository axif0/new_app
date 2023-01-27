package p351k.p353r;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p351k.C5849i;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.z */
class C5886z extends C5885y {
    /* renamed from: d */
    public static final <K, V> Map<K, V> m24416d() {
        C5880t tVar = C5880t.f16889f;
        if (tVar != null) {
            return tVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: e */
    public static final <K, V> Map<K, V> m24417e(Map<K, ? extends V> map) {
        C5956g.m24500e(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C5885y.m24415c(map) : m24416d();
    }

    /* renamed from: f */
    public static final <K, V> void m24418f(Map<? super K, ? super V> map, Iterable<? extends C5849i<? extends K, ? extends V>> iterable) {
        C5956g.m24500e(map, "$this$putAll");
        C5956g.m24500e(iterable, "pairs");
        for (C5849i iVar : iterable) {
            map.put(iVar.mo16858a(), iVar.mo16859b());
        }
    }

    /* renamed from: g */
    public static <K, V> Map<K, V> m24419g(Iterable<? extends C5849i<? extends K, ? extends V>> iterable) {
        C5956g.m24500e(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return m24416d();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C5885y.m24413a(collection.size()));
                m24420h(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return C5885y.m24414b((C5849i) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        m24420h(iterable, linkedHashMap2);
        return m24417e(linkedHashMap2);
    }

    /* renamed from: h */
    public static final <K, V, M extends Map<? super K, ? super V>> M m24420h(Iterable<? extends C5849i<? extends K, ? extends V>> iterable, M m) {
        C5956g.m24500e(iterable, "$this$toMap");
        C5956g.m24500e(m, "destination");
        m24418f(m, iterable);
        return m;
    }
}
