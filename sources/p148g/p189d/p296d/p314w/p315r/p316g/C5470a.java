package p148g.p189d.p296d.p314w.p315r.p316g;

import java.util.List;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.r.g.a */
final class C5470a {
    /* renamed from: a */
    static C5411a m22578a(List<C5471b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).mo15783c() == null) {
            size--;
        }
        C5411a aVar = new C5411a(size * 12);
        int i = 0;
        int b = list.get(0).mo15783c().mo15769b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo15659p(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C5471b bVar = list.get(i3);
            int b2 = bVar.mo15782b().mo15769b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo15659p(i);
                }
                i++;
            }
            if (bVar.mo15783c() != null) {
                int b3 = bVar.mo15783c().mo15769b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo15659p(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
