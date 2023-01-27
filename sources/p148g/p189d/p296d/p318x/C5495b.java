package p148g.p189d.p296d.p318x;

import java.util.ArrayList;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5371c;
import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5379k;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5382n;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5415e;
import p148g.p189d.p296d.p318x.p319d.C5508j;
import p148g.p189d.p296d.p318x.p321e.C5512a;
import p148g.p189d.p296d.p318x.p321e.C5513b;

/* renamed from: g.d.d.x.b */
public final class C5495b implements C5379k {

    /* renamed from: a */
    private static final C5381m[] f15898a = new C5381m[0];

    /* renamed from: d */
    private static C5381m[] m22670d(C5371c cVar, Map<C5373e, ?> map, boolean z) throws C5377i, C5374f, C5372d {
        ArrayList arrayList = new ArrayList();
        C5513b b = C5512a.m22807b(cVar, map, z);
        for (C5383o[] next : b.mo15910b()) {
            C5415e i = C5508j.m22767i(b.mo15909a(), next[4], next[5], next[6], next[7], m22673g(next), m22671e(next));
            C5381m mVar = new C5381m(i.mo15691h(), i.mo15688e(), next, C5369a.PDF_417);
            mVar.mo15616h(C5382n.ERROR_CORRECTION_LEVEL, i.mo15685b());
            C5496c cVar2 = (C5496c) i.mo15687d();
            if (cVar2 != null) {
                mVar.mo15616h(C5382n.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(mVar);
        }
        return (C5381m[]) arrayList.toArray(f15898a);
    }

    /* renamed from: e */
    private static int m22671e(C5383o[] oVarArr) {
        return Math.max(Math.max(m22672f(oVarArr[0], oVarArr[4]), (m22672f(oVarArr[6], oVarArr[2]) * 17) / 18), Math.max(m22672f(oVarArr[1], oVarArr[5]), (m22672f(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    /* renamed from: f */
    private static int m22672f(C5383o oVar, C5383o oVar2) {
        if (oVar == null || oVar2 == null) {
            return 0;
        }
        return (int) Math.abs(oVar.mo15618c() - oVar2.mo15618c());
    }

    /* renamed from: g */
    private static int m22673g(C5383o[] oVarArr) {
        return Math.min(Math.min(m22674h(oVarArr[0], oVarArr[4]), (m22674h(oVarArr[6], oVarArr[2]) * 17) / 18), Math.min(m22674h(oVarArr[1], oVarArr[5]), (m22674h(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    /* renamed from: h */
    private static int m22674h(C5383o oVar, C5383o oVar2) {
        if (oVar == null || oVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(oVar.mo15618c() - oVar2.mo15618c());
    }

    /* renamed from: a */
    public C5381m mo15603a(C5371c cVar, Map<C5373e, ?> map) throws C5377i, C5374f, C5372d {
        C5381m[] d = m22670d(cVar, map, false);
        if (d.length != 0 && d[0] != null) {
            return d[0];
        }
        throw C5377i.m22193a();
    }

    /* renamed from: b */
    public void mo15604b() {
    }

    /* renamed from: c */
    public C5381m mo15605c(C5371c cVar) throws C5377i, C5374f, C5372d {
        return mo15603a(cVar, (Map<C5373e, ?>) null);
    }
}
