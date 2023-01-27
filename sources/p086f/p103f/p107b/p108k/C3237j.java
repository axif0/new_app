package p086f.p103f.p107b.p108k;

import p086f.p103f.p107b.C3211d;
import p086f.p103f.p107b.p108k.C3229e;

/* renamed from: f.f.b.k.j */
public class C3237j {

    /* renamed from: a */
    static boolean[] f10420a = new boolean[3];

    /* renamed from: a */
    static void m13979a(C3232f fVar, C3211d dVar, C3229e eVar) {
        eVar.f10371h = -1;
        eVar.f10372i = -1;
        if (fVar.f10342J[0] != C3229e.C3231b.WRAP_CONTENT && eVar.f10342J[0] == C3229e.C3231b.MATCH_PARENT) {
            int i = eVar.f10388y.f10318e;
            int N = fVar.mo11293N() - eVar.f10333A.f10318e;
            C3226d dVar2 = eVar.f10388y;
            dVar2.f10320g = dVar.mo11222q(dVar2);
            C3226d dVar3 = eVar.f10333A;
            dVar3.f10320g = dVar.mo11222q(dVar3);
            dVar.mo11213f(eVar.f10388y.f10320g, i);
            dVar.mo11213f(eVar.f10333A.f10320g, N);
            eVar.f10371h = 2;
            eVar.mo11313h0(i, N);
        }
        if (fVar.f10342J[1] != C3229e.C3231b.WRAP_CONTENT && eVar.f10342J[1] == C3229e.C3231b.MATCH_PARENT) {
            int i2 = eVar.f10389z.f10318e;
            int t = fVar.mo11336t() - eVar.f10334B.f10318e;
            C3226d dVar4 = eVar.f10389z;
            dVar4.f10320g = dVar.mo11222q(dVar4);
            C3226d dVar5 = eVar.f10334B;
            dVar5.f10320g = dVar.mo11222q(dVar5);
            dVar.mo11213f(eVar.f10389z.f10320g, i2);
            dVar.mo11213f(eVar.f10334B.f10320g, t);
            if (eVar.f10350R > 0 || eVar.mo11292M() == 8) {
                C3226d dVar6 = eVar.f10335C;
                dVar6.f10320g = dVar.mo11222q(dVar6);
                dVar.mo11213f(eVar.f10335C.f10320g, eVar.f10350R + i2);
            }
            eVar.f10372i = 2;
            eVar.mo11343w0(i2, t);
        }
    }

    /* renamed from: b */
    public static final boolean m13980b(int i, int i2) {
        return (i & i2) == i2;
    }
}
