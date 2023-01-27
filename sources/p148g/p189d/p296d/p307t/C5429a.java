package p148g.p189d.p296d.p307t;

import java.util.List;
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
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5415e;
import p148g.p189d.p296d.p304s.C5417g;
import p148g.p189d.p296d.p307t.p308b.C5435d;
import p148g.p189d.p296d.p307t.p309c.C5440a;

/* renamed from: g.d.d.t.a */
public final class C5429a implements C5379k {

    /* renamed from: b */
    private static final C5383o[] f15726b = new C5383o[0];

    /* renamed from: a */
    private final C5435d f15727a = new C5435d();

    /* renamed from: d */
    private static C5412b m22386d(C5412b bVar) throws C5377i {
        int[] l = bVar.mo15672l();
        int[] f = bVar.mo15667f();
        if (l == null || f == null) {
            throw C5377i.m22193a();
        }
        int e = m22387e(l, bVar);
        int i = l[1];
        int i2 = f[1];
        int i3 = l[0];
        int i4 = ((f[0] - i3) + 1) / e;
        int i5 = ((i2 - i) + 1) / e;
        if (i4 <= 0 || i5 <= 0) {
            throw C5377i.m22193a();
        }
        int i6 = e / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C5412b bVar2 = new C5412b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * e) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (bVar.mo15665e((i11 * e) + i8, i10)) {
                    bVar2.mo15675q(i11, i9);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: e */
    private static int m22387e(int[] iArr, C5412b bVar) throws C5377i {
        int n = bVar.mo15673n();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < n && bVar.mo15665e(i, i2)) {
            i++;
        }
        if (i != n) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C5377i.m22193a();
        }
        throw C5377i.m22193a();
    }

    /* renamed from: a */
    public C5381m mo15603a(C5371c cVar, Map<C5373e, ?> map) throws C5377i, C5372d, C5374f {
        C5383o[] oVarArr;
        C5415e eVar;
        if (map == null || !map.containsKey(C5373e.PURE_BARCODE)) {
            C5417g b = new C5440a(cVar.mo15588a()).mo15742b();
            C5415e b2 = this.f15727a.mo15729b(b.mo15699a());
            oVarArr = b.mo15700b();
            eVar = b2;
        } else {
            eVar = this.f15727a.mo15729b(m22386d(cVar.mo15588a()));
            oVarArr = f15726b;
        }
        C5381m mVar = new C5381m(eVar.mo15691h(), eVar.mo15688e(), oVarArr, C5369a.DATA_MATRIX);
        List<byte[]> a = eVar.mo15684a();
        if (a != null) {
            mVar.mo15616h(C5382n.BYTE_SEGMENTS, a);
        }
        String b3 = eVar.mo15685b();
        if (b3 != null) {
            mVar.mo15616h(C5382n.ERROR_CORRECTION_LEVEL, b3);
        }
        return mVar;
    }

    /* renamed from: b */
    public void mo15604b() {
    }

    /* renamed from: c */
    public C5381m mo15605c(C5371c cVar) throws C5377i, C5372d, C5374f {
        return mo15603a(cVar, (Map<C5373e, ?>) null);
    }
}
