package com.journeyapps.barcodescanner;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5376h;

/* renamed from: com.journeyapps.barcodescanner.i */
public class C2688i implements C2683f {

    /* renamed from: a */
    private Collection<C5369a> f8604a;

    /* renamed from: b */
    private Map<C5373e, ?> f8605b;

    /* renamed from: c */
    private String f8606c;

    public C2688i() {
    }

    public C2688i(Collection<C5369a> collection, Map<C5373e, ?> map, String str) {
        this.f8604a = collection;
        this.f8605b = map;
        this.f8606c = str;
    }

    /* renamed from: a */
    public C2682e mo9801a(Map<C5373e, ?> map) {
        EnumMap enumMap = new EnumMap(C5373e.class);
        enumMap.putAll(map);
        Map<C5373e, ?> map2 = this.f8605b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<C5369a> collection = this.f8604a;
        if (collection != null) {
            enumMap.put(C5373e.POSSIBLE_FORMATS, collection);
        }
        String str = this.f8606c;
        if (str != null) {
            enumMap.put(C5373e.CHARACTER_SET, str);
        }
        C5376h hVar = new C5376h();
        hVar.mo15607f(enumMap);
        return new C2682e(hVar);
    }
}
