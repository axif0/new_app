package p148g.p189d.p190a.p200b.p219o0.p220m;

import android.util.Log;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.m.f */
public final class C4176f {

    /* renamed from: a */
    private static final int f13297a = C4284w.m18249o("GA94");

    /* renamed from: b */
    private static final int f13298b = C4284w.m18249o("DTG1");

    /* renamed from: a */
    public static void m17704a(long j, C4274m mVar, C3927n[] nVarArr) {
        C4274m mVar2 = mVar;
        C3927n[] nVarArr2 = nVarArr;
        while (mVar.mo13456a() > 1) {
            int b = m17705b(mVar);
            int b2 = m17705b(mVar);
            int c = mVar.mo13458c() + b2;
            if (b2 == -1 || b2 > mVar.mo13456a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                c = mVar.mo13459d();
            } else if (b == 4 && b2 >= 8) {
                int x = mVar.mo13479x();
                int D = mVar.mo13448D();
                int i = D == 49 ? mVar.mo13464i() : 0;
                int x2 = mVar.mo13479x();
                if (D == 47) {
                    mVar2.mo13455K(1);
                }
                boolean z = x == 181 && (D == 49 || D == 47) && x2 == 3;
                if (D == 49) {
                    z &= i == f13297a || i == f13298b;
                }
                if (z) {
                    mVar2.mo13455K(1);
                    int x3 = (mVar.mo13479x() & 31) * 3;
                    int c2 = mVar.mo13458c();
                    for (C3927n nVar : nVarArr2) {
                        mVar2.mo13454J(c2);
                        nVar.mo12734a(mVar2, x3);
                        nVar.mo12736c(j, 1, x3, 0, (C3927n.C3928a) null);
                    }
                }
            }
            mVar2.mo13454J(c);
        }
    }

    /* renamed from: b */
    private static int m17705b(C4274m mVar) {
        int i = 0;
        while (mVar.mo13456a() != 0) {
            int x = mVar.mo13479x();
            i += x;
            if (x != 255) {
                return i;
            }
        }
        return -1;
    }
}
