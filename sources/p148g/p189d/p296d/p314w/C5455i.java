package p148g.p189d.p296d.p314w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5380l;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.p304s.C5411a;
import p148g.p189d.p296d.p314w.p315r.C5468e;
import p148g.p189d.p296d.p314w.p315r.p316g.C5473d;

/* renamed from: g.d.d.w.i */
public final class C5455i extends C5457k {

    /* renamed from: b */
    private static final C5457k[] f15807b = new C5457k[0];

    /* renamed from: a */
    private final C5457k[] f15808a;

    public C5455i(Map<C5373e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C5373e.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(C5373e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C5369a.EAN_13) || collection.contains(C5369a.UPC_A) || collection.contains(C5369a.EAN_8) || collection.contains(C5369a.UPC_E)) {
                arrayList.add(new C5456j(map));
            }
            if (collection.contains(C5369a.CODE_39)) {
                arrayList.add(new C5449c(z));
            }
            if (collection.contains(C5369a.CODE_93)) {
                arrayList.add(new C5450d());
            }
            if (collection.contains(C5369a.CODE_128)) {
                arrayList.add(new C5448b());
            }
            if (collection.contains(C5369a.ITF)) {
                arrayList.add(new C5454h());
            }
            if (collection.contains(C5369a.CODABAR)) {
                arrayList.add(new C5447a());
            }
            if (collection.contains(C5369a.RSS_14)) {
                arrayList.add(new C5468e());
            }
            if (collection.contains(C5369a.RSS_EXPANDED)) {
                arrayList.add(new C5473d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C5456j(map));
            arrayList.add(new C5449c());
            arrayList.add(new C5447a());
            arrayList.add(new C5450d());
            arrayList.add(new C5448b());
            arrayList.add(new C5454h());
            arrayList.add(new C5468e());
            arrayList.add(new C5473d());
        }
        this.f15808a = (C5457k[]) arrayList.toArray(f15807b);
    }

    /* renamed from: b */
    public void mo15604b() {
        for (C5457k b : this.f15808a) {
            b.mo15604b();
        }
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i {
        C5457k[] kVarArr = this.f15808a;
        int i2 = 0;
        while (i2 < kVarArr.length) {
            try {
                return kVarArr[i2].mo15752d(i, aVar, map);
            } catch (C5380l unused) {
                i2++;
            }
        }
        throw C5377i.m22193a();
    }
}
