package p148g.p189d.p296d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p148g.p189d.p296d.p297q.C5386b;
import p148g.p189d.p296d.p307t.C5429a;
import p148g.p189d.p296d.p312v.C5443a;
import p148g.p189d.p296d.p314w.C5455i;
import p148g.p189d.p296d.p318x.C5495b;
import p148g.p189d.p296d.p322y.C5514a;

/* renamed from: g.d.d.h */
public final class C5376h implements C5379k {

    /* renamed from: c */
    private static final C5379k[] f15547c = new C5379k[0];

    /* renamed from: a */
    private Map<C5373e, ?> f15548a;

    /* renamed from: b */
    private C5379k[] f15549b;

    /* renamed from: d */
    private C5381m m22187d(C5371c cVar) throws C5377i {
        C5379k[] kVarArr = this.f15549b;
        if (kVarArr != null) {
            int length = kVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return kVarArr[i].mo15603a(cVar, this.f15548a);
                } catch (C5380l unused) {
                    i++;
                }
            }
        }
        throw C5377i.m22193a();
    }

    /* renamed from: a */
    public C5381m mo15603a(C5371c cVar, Map<C5373e, ?> map) throws C5377i {
        mo15607f(map);
        return m22187d(cVar);
    }

    /* renamed from: b */
    public void mo15604b() {
        C5379k[] kVarArr = this.f15549b;
        if (kVarArr != null) {
            for (C5379k b : kVarArr) {
                b.mo15604b();
            }
        }
    }

    /* renamed from: c */
    public C5381m mo15605c(C5371c cVar) throws C5377i {
        mo15607f((Map<C5373e, ?>) null);
        return m22187d(cVar);
    }

    /* renamed from: e */
    public C5381m mo15606e(C5371c cVar) throws C5377i {
        if (this.f15549b == null) {
            mo15607f((Map<C5373e, ?>) null);
        }
        return m22187d(cVar);
    }

    /* renamed from: f */
    public void mo15607f(Map<C5373e, ?> map) {
        this.f15548a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C5373e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(C5373e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C5369a.UPC_A) && !collection.contains(C5369a.UPC_E) && !collection.contains(C5369a.EAN_13) && !collection.contains(C5369a.EAN_8) && !collection.contains(C5369a.CODABAR) && !collection.contains(C5369a.CODE_39) && !collection.contains(C5369a.CODE_93) && !collection.contains(C5369a.CODE_128) && !collection.contains(C5369a.ITF) && !collection.contains(C5369a.RSS_14) && !collection.contains(C5369a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C5455i(map));
            }
            if (collection.contains(C5369a.QR_CODE)) {
                arrayList.add(new C5514a());
            }
            if (collection.contains(C5369a.DATA_MATRIX)) {
                arrayList.add(new C5429a());
            }
            if (collection.contains(C5369a.AZTEC)) {
                arrayList.add(new C5386b());
            }
            if (collection.contains(C5369a.PDF_417)) {
                arrayList.add(new C5495b());
            }
            if (collection.contains(C5369a.MAXICODE)) {
                arrayList.add(new C5443a());
            }
            if (z && z2) {
                arrayList.add(new C5455i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C5455i(map));
            }
            arrayList.add(new C5514a());
            arrayList.add(new C5429a());
            arrayList.add(new C5386b());
            arrayList.add(new C5495b());
            arrayList.add(new C5443a());
            if (z2) {
                arrayList.add(new C5455i(map));
            }
        }
        this.f15549b = (C5379k[]) arrayList.toArray(f15547c);
    }
}
