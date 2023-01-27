package p148g.p189d.p296d.p322y;

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
import p148g.p189d.p296d.p322y.p323b.C5528e;
import p148g.p189d.p296d.p322y.p323b.C5532i;
import p148g.p189d.p296d.p322y.p324c.C5538c;

/* renamed from: g.d.d.y.a */
public class C5514a implements C5379k {

    /* renamed from: b */
    private static final C5383o[] f15955b = new C5383o[0];

    /* renamed from: a */
    private final C5528e f15956a = new C5528e();

    /* renamed from: d */
    private static C5412b m22815d(C5412b bVar) throws C5377i {
        int[] l = bVar.mo15672l();
        int[] f = bVar.mo15667f();
        if (l == null || f == null) {
            throw C5377i.m22193a();
        }
        float e = m22816e(l, bVar);
        int i = l[1];
        int i2 = f[1];
        int i3 = l[0];
        int i4 = f[0];
        if (i3 >= i4 || i >= i2) {
            throw C5377i.m22193a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < bVar.mo15673n()) {
            int round = Math.round(((float) ((i4 - i3) + 1)) / e);
            int round2 = Math.round(((float) (i5 + 1)) / e);
            if (round <= 0 || round2 <= 0) {
                throw C5377i.m22193a();
            } else if (round2 == round) {
                int i6 = (int) (e / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) (((float) (round - 1)) * e)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw C5377i.m22193a();
                    }
                }
                int i10 = (((int) (((float) (round2 - 1)) * e)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw C5377i.m22193a();
                    }
                }
                C5412b bVar2 = new C5412b(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (((float) i11) * e)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (bVar.mo15665e(((int) (((float) i13) * e)) + i8, i12)) {
                            bVar2.mo15675q(i13, i11);
                        }
                    }
                }
                return bVar2;
            } else {
                throw C5377i.m22193a();
            }
        } else {
            throw C5377i.m22193a();
        }
    }

    /* renamed from: e */
    private static float m22816e(int[] iArr, C5412b bVar) throws C5377i {
        int i = bVar.mo15670i();
        int n = bVar.mo15673n();
        int i2 = iArr[0];
        boolean z = true;
        int i3 = iArr[1];
        int i4 = 0;
        while (i2 < n && i3 < i) {
            if (z != bVar.mo15665e(i2, i3)) {
                i4++;
                if (i4 == 5) {
                    break;
                }
                z = !z;
            }
            i2++;
            i3++;
        }
        if (i2 != n && i3 != i) {
            return ((float) (i2 - iArr[0])) / 7.0f;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: a */
    public final C5381m mo15603a(C5371c cVar, Map<C5373e, ?> map) throws C5377i, C5372d, C5374f {
        C5383o[] oVarArr;
        C5415e eVar;
        if (map == null || !map.containsKey(C5373e.PURE_BARCODE)) {
            C5417g e = new C5538c(cVar.mo15588a()).mo15943e(map);
            C5415e b = this.f15956a.mo15921b(e.mo15699a(), map);
            oVarArr = e.mo15700b();
            eVar = b;
        } else {
            eVar = this.f15956a.mo15921b(m22815d(cVar.mo15588a()), map);
            oVarArr = f15955b;
        }
        if (eVar.mo15687d() instanceof C5532i) {
            ((C5532i) eVar.mo15687d()).mo15927a(oVarArr);
        }
        C5381m mVar = new C5381m(eVar.mo15691h(), eVar.mo15688e(), oVarArr, C5369a.QR_CODE);
        List<byte[]> a = eVar.mo15684a();
        if (a != null) {
            mVar.mo15616h(C5382n.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo15685b();
        if (b2 != null) {
            mVar.mo15616h(C5382n.ERROR_CORRECTION_LEVEL, b2);
        }
        if (eVar.mo15692i()) {
            mVar.mo15616h(C5382n.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.mo15690g()));
            mVar.mo15616h(C5382n.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.mo15689f()));
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
