package p351k.p353r;

import java.util.Collections;
import java.util.Map;
import p351k.C5849i;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.y */
class C5885y extends C5884x {
    /* renamed from: a */
    public static int m24413a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m24414b(C5849i<? extends K, ? extends V> iVar) {
        C5956g.m24500e(iVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(iVar.mo16860c(), iVar.mo16861d());
        C5956g.m24499d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m24415c(Map<? extends K, ? extends V> map) {
        C5956g.m24500e(map, "$this$toSingletonMap");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C5956g.m24499d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
