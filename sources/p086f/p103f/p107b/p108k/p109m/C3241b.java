package p086f.p103f.p107b.p108k.p109m;

import java.util.ArrayList;
import p086f.p103f.p107b.C3211d;
import p086f.p103f.p107b.C3214e;
import p086f.p103f.p107b.p108k.C3226d;
import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.C3232f;
import p086f.p103f.p107b.p108k.C3233g;
import p086f.p103f.p107b.p108k.C3235h;
import p086f.p103f.p107b.p108k.C3237j;
import p086f.p103f.p107b.p108k.C3238k;

/* renamed from: f.f.b.k.m.b */
public class C3241b {

    /* renamed from: a */
    private final ArrayList<C3229e> f10423a = new ArrayList<>();

    /* renamed from: b */
    private C3242a f10424b = new C3242a();

    /* renamed from: c */
    private C3232f f10425c;

    /* renamed from: f.f.b.k.m.b$a */
    public static class C3242a {

        /* renamed from: a */
        public C3229e.C3231b f10426a;

        /* renamed from: b */
        public C3229e.C3231b f10427b;

        /* renamed from: c */
        public int f10428c;

        /* renamed from: d */
        public int f10429d;

        /* renamed from: e */
        public int f10430e;

        /* renamed from: f */
        public int f10431f;

        /* renamed from: g */
        public int f10432g;

        /* renamed from: h */
        public boolean f10433h;

        /* renamed from: i */
        public boolean f10434i;

        /* renamed from: j */
        public boolean f10435j;
    }

    /* renamed from: f.f.b.k.m.b$b */
    public interface C3243b {
        /* renamed from: a */
        void mo2612a(C3229e eVar, C3242a aVar);

        /* renamed from: b */
        void mo2613b();
    }

    public C3241b(C3232f fVar) {
        this.f10425c = fVar;
    }

    /* renamed from: a */
    private boolean m13990a(C3243b bVar, C3229e eVar, boolean z) {
        this.f10424b.f10426a = eVar.mo11342w();
        this.f10424b.f10427b = eVar.mo11290K();
        this.f10424b.f10428c = eVar.mo11293N();
        this.f10424b.f10429d = eVar.mo11336t();
        C3242a aVar = this.f10424b;
        aVar.f10434i = false;
        aVar.f10435j = z;
        boolean z2 = aVar.f10426a == C3229e.C3231b.MATCH_CONSTRAINT;
        boolean z3 = this.f10424b.f10427b == C3229e.C3231b.MATCH_CONSTRAINT;
        boolean z4 = z2 && eVar.f10346N > 0.0f;
        boolean z5 = z3 && eVar.f10346N > 0.0f;
        if (z4 && eVar.f10375l[0] == 4) {
            this.f10424b.f10426a = C3229e.C3231b.FIXED;
        }
        if (z5 && eVar.f10375l[1] == 4) {
            this.f10424b.f10427b = C3229e.C3231b.FIXED;
        }
        bVar.mo2612a(eVar, this.f10424b);
        eVar.mo11276B0(this.f10424b.f10430e);
        eVar.mo11310e0(this.f10424b.f10431f);
        eVar.mo11308d0(this.f10424b.f10433h);
        eVar.mo11303Y(this.f10424b.f10432g);
        C3242a aVar2 = this.f10424b;
        aVar2.f10435j = false;
        return aVar2.f10434i;
    }

    /* renamed from: b */
    private void m13991b(C3232f fVar) {
        int size = fVar.f10422g0.size();
        C3243b R0 = fVar.mo11356R0();
        for (int i = 0; i < size; i++) {
            C3229e eVar = fVar.f10422g0.get(i);
            if (!(eVar instanceof C3233g) && (!eVar.f10365d.f10481e.f10455j || !eVar.f10367e.f10481e.f10455j)) {
                C3229e.C3231b q = eVar.mo11330q(0);
                boolean z = true;
                C3229e.C3231b q2 = eVar.mo11330q(1);
                C3229e.C3231b bVar = C3229e.C3231b.MATCH_CONSTRAINT;
                if (q != bVar || eVar.f10373j == 1 || q2 != bVar || eVar.f10374k == 1) {
                    z = false;
                }
                if (!z) {
                    m13990a(R0, eVar, false);
                    C3214e eVar2 = fVar.f10401l0;
                    if (eVar2 != null) {
                        eVar2.f10224a++;
                    }
                }
            }
        }
        R0.mo2613b();
    }

    /* renamed from: c */
    private void m13992c(C3232f fVar, String str, int i, int i2) {
        int C = fVar.mo11277C();
        int B = fVar.mo11275B();
        fVar.mo11333r0(0);
        fVar.mo11331q0(0);
        fVar.mo11276B0(i);
        fVar.mo11310e0(i2);
        fVar.mo11333r0(C);
        fVar.mo11331q0(B);
        this.f10425c.mo11350H0();
    }

    /* renamed from: d */
    public long mo11386d(C3232f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4;
        int i18;
        C3214e eVar;
        C3232f fVar2 = fVar;
        int i19 = i;
        int i20 = i4;
        int i21 = i6;
        C3243b R0 = fVar.mo11356R0();
        int size = fVar2.f10422g0.size();
        int N = fVar.mo11293N();
        int t = fVar.mo11336t();
        boolean b = C3237j.m13980b(i19, 128);
        boolean z5 = b || C3237j.m13980b(i19, 64);
        if (z5) {
            int i22 = 0;
            while (true) {
                if (i22 >= size) {
                    break;
                }
                C3229e eVar2 = fVar2.f10422g0.get(i22);
                boolean z6 = (eVar2.mo11342w() == C3229e.C3231b.MATCH_CONSTRAINT) && (eVar2.mo11290K() == C3229e.C3231b.MATCH_CONSTRAINT) && eVar2.mo11332r() > 0.0f;
                if ((!eVar2.mo11298T() || !z6) && ((!eVar2.mo11300V() || !z6) && !(eVar2 instanceof C3238k) && !eVar2.mo11298T() && !eVar2.mo11300V())) {
                    i22++;
                }
            }
            z5 = false;
        }
        if (z5 && (eVar = C3211d.f10204r) != null) {
            eVar.f10226c++;
        }
        if (z5 && ((i20 == 1073741824 && i21 == 1073741824) || b)) {
            int min = Math.min(fVar.mo11273A(), i5);
            int min2 = Math.min(fVar.mo11348z(), i7);
            if (i20 == 1073741824 && fVar.mo11293N() != min) {
                fVar2.mo11276B0(min);
                fVar.mo11358T0();
            }
            if (i21 == 1073741824 && fVar.mo11336t() != min2) {
                fVar2.mo11310e0(min2);
                fVar.mo11358T0();
            }
            if (i20 == 1073741824 && i21 == 1073741824) {
                z = fVar2.mo11353O0(b);
                i10 = 2;
            } else {
                boolean P0 = fVar2.mo11354P0(b);
                if (i20 == 1073741824) {
                    z4 = P0 & fVar2.mo11355Q0(b, 0);
                    i18 = 1;
                } else {
                    z4 = P0;
                    i18 = 0;
                }
                if (i21 == 1073741824) {
                    boolean Q0 = fVar2.mo11355Q0(b, 1) & z4;
                    i10 = i18 + 1;
                    z = Q0;
                } else {
                    i10 = i18;
                    z = z4;
                }
            }
            if (z) {
                fVar2.mo11284F0(i20 == 1073741824, i21 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0;
        }
        if (size > 0) {
            m13991b(fVar);
        }
        int S0 = fVar.mo11357S0();
        int size2 = this.f10423a.size();
        if (size > 0) {
            m13992c(fVar2, "First pass", N, t);
        }
        if (size2 > 0) {
            boolean z7 = fVar.mo11342w() == C3229e.C3231b.WRAP_CONTENT;
            boolean z8 = fVar.mo11290K() == C3229e.C3231b.WRAP_CONTENT;
            int max = Math.max(fVar.mo11293N(), this.f10425c.mo11277C());
            int max2 = Math.max(fVar.mo11336t(), this.f10425c.mo11275B());
            int i23 = 0;
            boolean z9 = false;
            while (i23 < size2) {
                C3229e eVar3 = this.f10423a.get(i23);
                if (!(eVar3 instanceof C3238k)) {
                    i15 = S0;
                    i17 = N;
                    i16 = t;
                } else {
                    int N2 = eVar3.mo11293N();
                    int t2 = eVar3.mo11336t();
                    i15 = S0;
                    boolean a = z9 | m13990a(R0, eVar3, true);
                    C3214e eVar4 = fVar2.f10401l0;
                    i17 = N;
                    i16 = t;
                    if (eVar4 != null) {
                        eVar4.f10225b++;
                    }
                    int N3 = eVar3.mo11293N();
                    int t3 = eVar3.mo11336t();
                    if (N3 != N2) {
                        eVar3.mo11276B0(N3);
                        if (z7 && eVar3.mo11285G() > max) {
                            max = Math.max(max, eVar3.mo11285G() + eVar3.mo11318k(C3226d.C3228b.RIGHT).mo11261b());
                        }
                        a = true;
                    }
                    if (t3 != t2) {
                        eVar3.mo11310e0(t3);
                        if (z8 && eVar3.mo11324n() > max2) {
                            max2 = Math.max(max2, eVar3.mo11324n() + eVar3.mo11318k(C3226d.C3228b.BOTTOM).mo11261b());
                        }
                        a = true;
                    }
                    z9 = a | ((C3238k) eVar3).mo11382I0();
                }
                i23++;
                S0 = i15;
                N = i17;
                t = i16;
            }
            int i24 = S0;
            int i25 = N;
            int i26 = t;
            int i27 = 0;
            int i28 = 2;
            while (i27 < i28) {
                int i29 = 0;
                while (i29 < size2) {
                    C3229e eVar5 = this.f10423a.get(i29);
                    if ((!(eVar5 instanceof C3235h) || (eVar5 instanceof C3238k)) && !(eVar5 instanceof C3233g) && eVar5.mo11292M() != 8 && ((!eVar5.f10365d.f10481e.f10455j || !eVar5.f10367e.f10481e.f10455j) && !(eVar5 instanceof C3238k))) {
                        int N4 = eVar5.mo11293N();
                        int t4 = eVar5.mo11336t();
                        int l = eVar5.mo11320l();
                        z9 |= m13990a(R0, eVar5, true);
                        C3214e eVar6 = fVar2.f10401l0;
                        i14 = i27;
                        i13 = size2;
                        if (eVar6 != null) {
                            eVar6.f10225b++;
                        }
                        int N5 = eVar5.mo11293N();
                        int t5 = eVar5.mo11336t();
                        if (N5 != N4) {
                            eVar5.mo11276B0(N5);
                            if (z7 && eVar5.mo11285G() > max) {
                                max = Math.max(max, eVar5.mo11285G() + eVar5.mo11318k(C3226d.C3228b.RIGHT).mo11261b());
                            }
                            z9 = true;
                        }
                        if (t5 != t4) {
                            eVar5.mo11310e0(t5);
                            if (z8 && eVar5.mo11324n() > max2) {
                                max2 = Math.max(max2, eVar5.mo11324n() + eVar5.mo11318k(C3226d.C3228b.BOTTOM).mo11261b());
                            }
                            z9 = true;
                        }
                        if (eVar5.mo11296Q() && l != eVar5.mo11320l()) {
                            z9 = true;
                        }
                    } else {
                        i14 = i27;
                        i13 = size2;
                    }
                    i29++;
                    size2 = i13;
                    i27 = i14;
                }
                int i30 = i27;
                int i31 = size2;
                if (z9) {
                    i12 = i25;
                    i11 = i26;
                    m13992c(fVar2, "intermediate pass", i12, i11);
                    z9 = false;
                } else {
                    i12 = i25;
                    i11 = i26;
                }
                i27 = i30 + 1;
                i25 = i12;
                i26 = i11;
                i28 = 2;
                size2 = i31;
            }
            int i32 = i25;
            int i33 = i26;
            if (z9) {
                m13992c(fVar2, "2nd pass", i32, i33);
                if (fVar.mo11293N() < max) {
                    fVar2.mo11276B0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fVar.mo11336t() < max2) {
                    fVar2.mo11310e0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    m13992c(fVar2, "3rd pass", i32, i33);
                }
            }
            S0 = i24;
        }
        fVar2.mo11366c1(S0);
        return 0;
    }

    /* renamed from: e */
    public void mo11387e(C3232f fVar) {
        this.f10423a.clear();
        int size = fVar.f10422g0.size();
        for (int i = 0; i < size; i++) {
            C3229e eVar = fVar.f10422g0.get(i);
            if (eVar.mo11342w() == C3229e.C3231b.MATCH_CONSTRAINT || eVar.mo11342w() == C3229e.C3231b.MATCH_PARENT || eVar.mo11290K() == C3229e.C3231b.MATCH_CONSTRAINT || eVar.mo11290K() == C3229e.C3231b.MATCH_PARENT) {
                this.f10423a.add(eVar);
            }
        }
        fVar.mo11358T0();
    }
}
