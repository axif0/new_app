package p148g.p189d.p190a.p200b.p204k0.p208r;

import java.io.IOException;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.r.i */
final class C3974i {

    /* renamed from: a */
    private static final int[] f12338a = {C4284w.m18249o("isom"), C4284w.m18249o("iso2"), C4284w.m18249o("iso3"), C4284w.m18249o("iso4"), C4284w.m18249o("iso5"), C4284w.m18249o("iso6"), C4284w.m18249o("avc1"), C4284w.m18249o("hvc1"), C4284w.m18249o("hev1"), C4284w.m18249o("mp41"), C4284w.m18249o("mp42"), C4284w.m18249o("3g2a"), C4284w.m18249o("3g2b"), C4284w.m18249o("3gr6"), C4284w.m18249o("3gs6"), C4284w.m18249o("3ge6"), C4284w.m18249o("3gg6"), C4284w.m18249o("M4V "), C4284w.m18249o("M4A "), C4284w.m18249o("f4v "), C4284w.m18249o("kddi"), C4284w.m18249o("M4VP"), C4284w.m18249o("qt  "), C4284w.m18249o("MSNV")};

    /* renamed from: a */
    private static boolean m16734a(int i) {
        if ((i >>> 8) == C4284w.m18249o("3gp")) {
            return true;
        }
        for (int i2 : f12338a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m16735b(C3916f fVar) throws IOException, InterruptedException {
        return m16736c(fVar, true);
    }

    /* renamed from: c */
    private static boolean m16736c(C3916f fVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        C3916f fVar2 = fVar;
        long d = fVar.mo12722d();
        long j = -1;
        if (d == -1 || d > 4096) {
            d = 4096;
        }
        int i = (int) d;
        C4274m mVar = new C4274m(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            mVar.mo13451G(8);
            fVar2.mo12727i(mVar.f13643a, 0, 8);
            long z4 = mVar.mo13481z();
            int i3 = mVar.mo13464i();
            int i4 = 16;
            if (z4 == 1) {
                fVar2.mo12727i(mVar.f13643a, 8, 8);
                mVar.mo13453I(16);
                z4 = mVar.mo13447C();
            } else {
                if (z4 == 0) {
                    long d2 = fVar.mo12722d();
                    if (d2 != j) {
                        z4 = ((long) 8) + (d2 - fVar.mo12729k());
                    }
                }
                i4 = 8;
            }
            long j2 = (long) i4;
            if (z4 < j2) {
                return false;
            }
            i2 += i4;
            if (i3 != C3952a.f12103C) {
                if (i3 == C3952a.f12121L || i3 == C3952a.f12125N) {
                    z2 = true;
                } else if ((((long) i2) + z4) - j2 >= ((long) i)) {
                    break;
                } else {
                    int i5 = (int) (z4 - j2);
                    i2 += i5;
                    if (i3 == C3952a.f12141b) {
                        if (i5 < 8) {
                            return false;
                        }
                        mVar.mo13451G(i5);
                        fVar2.mo12727i(mVar.f13643a, 0, i5);
                        int i6 = i5 / 4;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                break;
                            }
                            if (i7 == 1) {
                                mVar.mo13455K(4);
                            } else if (m16734a(mVar.mo13464i())) {
                                z3 = true;
                                break;
                            }
                            i7++;
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i5 != 0) {
                        fVar2.mo12728j(i5);
                    }
                    j = -1;
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }

    /* renamed from: d */
    public static boolean m16737d(C3916f fVar) throws IOException, InterruptedException {
        return m16736c(fVar, false);
    }
}
