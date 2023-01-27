package p148g.p189d.p296d.p312v;

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
import p148g.p189d.p296d.p312v.p313b.C5446c;

/* renamed from: g.d.d.v.a */
public final class C5443a implements C5379k {

    /* renamed from: b */
    private static final C5383o[] f15774b = new C5383o[0];

    /* renamed from: a */
    private final C5446c f15775a = new C5446c();

    /* renamed from: d */
    private static C5412b m22447d(C5412b bVar) throws C5377i {
        int[] g = bVar.mo15668g();
        if (g != null) {
            int i = g[0];
            int i2 = g[1];
            int i3 = g[2];
            int i4 = g[3];
            C5412b bVar2 = new C5412b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo15665e(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo15675q(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: a */
    public C5381m mo15603a(C5371c cVar, Map<C5373e, ?> map) throws C5377i, C5372d, C5374f {
        C5415e b = this.f15775a.mo15751b(m22447d(cVar.mo15588a()), map);
        C5381m mVar = new C5381m(b.mo15691h(), b.mo15688e(), f15774b, C5369a.MAXICODE);
        String b2 = b.mo15685b();
        if (b2 != null) {
            mVar.mo15616h(C5382n.ERROR_CORRECTION_LEVEL, b2);
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
