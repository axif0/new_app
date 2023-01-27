package p351k.p361v.p363d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p351k.C5849i;
import p351k.C5855m;
import p351k.p353r.C5867g;
import p351k.p361v.C5924a;
import p351k.p361v.p362c.C5926a;
import p351k.p361v.p362c.C5927b;
import p351k.p361v.p362c.C5928c;
import p351k.p361v.p362c.C5929d;
import p351k.p361v.p362c.C5930e;
import p351k.p361v.p362c.C5931f;
import p351k.p361v.p362c.C5932g;
import p351k.p361v.p362c.C5933h;
import p351k.p361v.p362c.C5934i;
import p351k.p361v.p362c.C5935j;
import p351k.p361v.p362c.C5936k;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p362c.C5938m;
import p351k.p361v.p362c.C5939n;
import p351k.p361v.p362c.C5940o;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p362c.C5942q;
import p351k.p361v.p362c.C5943r;
import p351k.p361v.p362c.C5944s;
import p351k.p361v.p362c.C5945t;
import p351k.p361v.p362c.C5946u;
import p351k.p361v.p362c.C5947v;
import p351k.p361v.p362c.C5948w;
import p351k.p366y.C5976b;

/* renamed from: k.v.d.c */
public final class C5952c implements C5976b<Object>, C5951b {

    /* renamed from: b */
    private static final Map<Class<? extends Object<?>>, Integer> f16922b;

    /* renamed from: c */
    private static final HashMap<String, String> f16923c;

    /* renamed from: d */
    private static final HashMap<String, String> f16924d;

    /* renamed from: e */
    private static final HashMap<String, String> f16925e;

    /* renamed from: a */
    private final Class<?> f16926a;

    static {
        int i = 0;
        List c = C5869i.m24390c(C5926a.class, C5937l.class, C5941p.class, C5942q.class, C5943r.class, C5944s.class, C5945t.class, C5946u.class, C5947v.class, C5948w.class, C5927b.class, C5928c.class, C5929d.class, C5930e.class, C5931f.class, C5932g.class, C5933h.class, C5934i.class, C5935j.class, C5936k.class, C5938m.class, C5939n.class, C5940o.class);
        ArrayList arrayList = new ArrayList(C5870j.m24393f(c, 10));
        for (Object next : c) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(C5855m.m24370a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C5867g.m24386e();
                throw null;
            }
        }
        f16922b = C5886z.m24419g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f16923c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f16924d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f16923c);
        hashMap3.putAll(f16924d);
        Collection<String> values = f16923c.values();
        C5956g.m24499d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C5956g.m24499d(str, "kotlinName");
            sb.append(C5839m.m24352r(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C5849i a = C5855m.m24370a(sb2, str + ".Companion");
            hashMap3.put(a.mo16860c(), a.mo16861d());
        }
        for (Map.Entry next2 : f16922b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f16925e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5885y.m24413a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C5839m.m24352r((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
    }

    public C5952c(Class<?> cls) {
        C5956g.m24500e(cls, "jClass");
        this.f16926a = cls;
    }

    /* renamed from: a */
    public Class<?> mo16999a() {
        return this.f16926a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5952c) && C5956g.m24496a(C5924a.m24479a(this), C5924a.m24479a((C5976b) obj));
    }

    public int hashCode() {
        return C5924a.m24479a(this).hashCode();
    }

    public String toString() {
        return mo16999a().toString() + " (Kotlin reflection is not available)";
    }
}
