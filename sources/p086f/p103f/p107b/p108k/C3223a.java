package p086f.p103f.p107b.p108k;

import p086f.p103f.p107b.C3211d;
import p086f.p103f.p107b.C3220i;
import p086f.p103f.p107b.p108k.C3229e;

/* renamed from: f.f.b.k.a */
public class C3223a extends C3236i {

    /* renamed from: i0 */
    private int f10291i0 = 0;

    /* renamed from: j0 */
    private boolean f10292j0 = true;

    /* renamed from: k0 */
    private int f10293k0 = 0;

    /* renamed from: H0 */
    public boolean mo11249H0() {
        return this.f10292j0;
    }

    /* renamed from: I0 */
    public int mo11250I0() {
        return this.f10291i0;
    }

    /* renamed from: J0 */
    public int mo11251J0() {
        return this.f10293k0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo11252K0() {
        for (int i = 0; i < this.f10419h0; i++) {
            C3229e eVar = this.f10418g0[i];
            int i2 = this.f10291i0;
            if (i2 == 0 || i2 == 1) {
                eVar.mo11321l0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                eVar.mo11321l0(1, true);
            }
        }
    }

    /* renamed from: L0 */
    public void mo11253L0(boolean z) {
        this.f10292j0 = z;
    }

    /* renamed from: M0 */
    public void mo11254M0(int i) {
        this.f10291i0 = i;
    }

    /* renamed from: N0 */
    public void mo11255N0(int i) {
        this.f10293k0 = i;
    }

    /* renamed from: f */
    public void mo11256f(C3211d dVar) {
        C3226d[] dVarArr;
        boolean z;
        C3220i iVar;
        C3226d dVar2;
        int i;
        int i2;
        C3226d[] dVarArr2 = this.f10339G;
        dVarArr2[0] = this.f10388y;
        dVarArr2[2] = this.f10389z;
        dVarArr2[1] = this.f10333A;
        dVarArr2[3] = this.f10334B;
        int i3 = 0;
        while (true) {
            dVarArr = this.f10339G;
            if (i3 >= dVarArr.length) {
                break;
            }
            dVarArr[i3].f10320g = dVar.mo11222q(dVarArr[i3]);
            i3++;
        }
        int i4 = this.f10291i0;
        if (i4 >= 0 && i4 < 4) {
            C3226d dVar3 = dVarArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.f10419h0) {
                    z = false;
                    break;
                }
                C3229e eVar = this.f10418g0[i5];
                if ((this.f10292j0 || eVar.mo11257g()) && ((((i = this.f10291i0) == 0 || i == 1) && eVar.mo11342w() == C3229e.C3231b.MATCH_CONSTRAINT && eVar.f10388y.f10317d != null && eVar.f10333A.f10317d != null) || (((i2 = this.f10291i0) == 2 || i2 == 3) && eVar.mo11290K() == C3229e.C3231b.MATCH_CONSTRAINT && eVar.f10389z.f10317d != null && eVar.f10334B.f10317d != null))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            z = true;
            boolean z2 = this.f10388y.mo11267h() || this.f10333A.mo11267h();
            boolean z3 = this.f10389z.mo11267h() || this.f10334B.mo11267h();
            boolean z4 = !z && ((this.f10291i0 == 0 && z2) || ((this.f10291i0 == 2 && z3) || ((this.f10291i0 == 1 && z2) || (this.f10291i0 == 3 && z3))));
            int i6 = 5;
            if (!z4) {
                i6 = 4;
            }
            for (int i7 = 0; i7 < this.f10419h0; i7++) {
                C3229e eVar2 = this.f10418g0[i7];
                if (this.f10292j0 || eVar2.mo11257g()) {
                    C3220i q = dVar.mo11222q(eVar2.f10339G[this.f10291i0]);
                    C3226d[] dVarArr3 = eVar2.f10339G;
                    int i8 = this.f10291i0;
                    dVarArr3[i8].f10320g = q;
                    int i9 = (dVarArr3[i8].f10317d == null || dVarArr3[i8].f10317d.f10315b != this) ? 0 : dVarArr3[i8].f10318e + 0;
                    int i10 = this.f10291i0;
                    if (i10 == 0 || i10 == 2) {
                        dVar.mo11216i(dVar3.f10320g, q, this.f10293k0 - i9, z);
                    } else {
                        dVar.mo11214g(dVar3.f10320g, q, this.f10293k0 + i9, z);
                    }
                    dVar.mo11212e(dVar3.f10320g, q, this.f10293k0 + i9, i6);
                }
            }
            int i11 = this.f10291i0;
            if (i11 == 0) {
                dVar.mo11212e(this.f10333A.f10320g, this.f10388y.f10320g, 0, 8);
                dVar.mo11212e(this.f10388y.f10320g, this.f10343K.f10333A.f10320g, 0, 4);
                iVar = this.f10388y.f10320g;
                dVar2 = this.f10343K.f10388y;
            } else if (i11 == 1) {
                dVar.mo11212e(this.f10388y.f10320g, this.f10333A.f10320g, 0, 8);
                dVar.mo11212e(this.f10388y.f10320g, this.f10343K.f10388y.f10320g, 0, 4);
                iVar = this.f10388y.f10320g;
                dVar2 = this.f10343K.f10333A;
            } else if (i11 == 2) {
                dVar.mo11212e(this.f10334B.f10320g, this.f10389z.f10320g, 0, 8);
                dVar.mo11212e(this.f10389z.f10320g, this.f10343K.f10334B.f10320g, 0, 4);
                iVar = this.f10389z.f10320g;
                dVar2 = this.f10343K.f10389z;
            } else if (i11 == 3) {
                dVar.mo11212e(this.f10389z.f10320g, this.f10334B.f10320g, 0, 8);
                dVar.mo11212e(this.f10389z.f10320g, this.f10343K.f10389z.f10320g, 0, 4);
                iVar = this.f10389z.f10320g;
                dVar2 = this.f10343K.f10334B;
            } else {
                return;
            }
            dVar.mo11212e(iVar, dVar2.f10320g, 0, 0);
        }
    }

    /* renamed from: g */
    public boolean mo11257g() {
        return true;
    }

    public String toString() {
        String str = "[Barrier] " + mo11328p() + " {";
        for (int i = 0; i < this.f10419h0; i++) {
            C3229e eVar = this.f10418g0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.mo11328p();
        }
        return str + "}";
    }
}
