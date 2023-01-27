package p086f.p103f.p107b.p108k;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import p086f.p103f.p107b.C3211d;
import p086f.p103f.p107b.C3214e;
import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.p109m.C3241b;
import p086f.p103f.p107b.p108k.p109m.C3246e;

/* renamed from: f.f.b.k.f */
public class C3232f extends C3239l {

    /* renamed from: h0 */
    C3241b f10397h0 = new C3241b(this);

    /* renamed from: i0 */
    public C3246e f10398i0 = new C3246e(this);

    /* renamed from: j0 */
    protected C3241b.C3243b f10399j0 = null;

    /* renamed from: k0 */
    private boolean f10400k0 = false;

    /* renamed from: l0 */
    public C3214e f10401l0;

    /* renamed from: m0 */
    protected C3211d f10402m0 = new C3211d();

    /* renamed from: n0 */
    int f10403n0;

    /* renamed from: o0 */
    int f10404o0;

    /* renamed from: p0 */
    int f10405p0 = 0;

    /* renamed from: q0 */
    int f10406q0 = 0;

    /* renamed from: r0 */
    C3225c[] f10407r0 = new C3225c[4];

    /* renamed from: s0 */
    C3225c[] f10408s0 = new C3225c[4];

    /* renamed from: t0 */
    private int f10409t0 = 263;

    /* renamed from: u0 */
    private boolean f10410u0 = false;

    /* renamed from: v0 */
    private boolean f10411v0 = false;

    /* renamed from: M0 */
    private void m13936M0(C3229e eVar) {
        int i = this.f10405p0 + 1;
        C3225c[] cVarArr = this.f10408s0;
        if (i >= cVarArr.length) {
            this.f10408s0 = (C3225c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f10408s0[this.f10405p0] = new C3225c(eVar, 0, mo11361W0());
        this.f10405p0++;
    }

    /* renamed from: N0 */
    private void m13937N0(C3229e eVar) {
        int i = this.f10406q0 + 1;
        C3225c[] cVarArr = this.f10407r0;
        if (i >= cVarArr.length) {
            this.f10407r0 = (C3225c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f10407r0[this.f10406q0] = new C3225c(eVar, 1, mo11361W0());
        this.f10406q0++;
    }

    /* renamed from: a1 */
    private void m13938a1() {
        this.f10405p0 = 0;
        this.f10406q0 = 0;
    }

    /* renamed from: F0 */
    public void mo11284F0(boolean z, boolean z2) {
        super.mo11284F0(z, z2);
        int size = this.f10422g0.size();
        for (int i = 0; i < size; i++) {
            this.f10422g0.get(i).mo11284F0(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* renamed from: H0 */
    public void mo11350H0() {
        boolean z;
        ? r11;
        this.f10348P = 0;
        this.f10349Q = 0;
        int max = Math.max(0, mo11293N());
        int max2 = Math.max(0, mo11336t());
        this.f10410u0 = false;
        this.f10411v0 = false;
        boolean z2 = mo11364Z0(64) || mo11364Z0(128);
        C3211d dVar = this.f10402m0;
        dVar.f10214g = false;
        dVar.f10215h = false;
        if (this.f10409t0 != 0 && z2) {
            dVar.f10215h = true;
        }
        C3229e.C3231b[] bVarArr = this.f10342J;
        C3229e.C3231b bVar = bVarArr[1];
        C3229e.C3231b bVar2 = bVarArr[0];
        ArrayList<C3229e> arrayList = this.f10422g0;
        boolean z3 = mo11342w() == C3229e.C3231b.WRAP_CONTENT || mo11290K() == C3229e.C3231b.WRAP_CONTENT;
        m13938a1();
        int size = this.f10422g0.size();
        for (int i = 0; i < size; i++) {
            C3229e eVar = this.f10422g0.get(i);
            if (eVar instanceof C3239l) {
                ((C3239l) eVar).mo11350H0();
            }
        }
        int i2 = 0;
        boolean z4 = true;
        boolean z5 = false;
        while (z4) {
            int i3 = i2 + 1;
            try {
                this.f10402m0.mo11208D();
                m13938a1();
                mo11316j(this.f10402m0);
                for (int i4 = 0; i4 < size; i4++) {
                    this.f10422g0.get(i4).mo11316j(this.f10402m0);
                }
                z4 = mo11352L0(this.f10402m0);
                if (z4) {
                    this.f10402m0.mo11227z();
                }
            } catch (Exception e) {
                e.printStackTrace();
                PrintStream printStream = System.out;
                printStream.println("EXCEPTION : " + e);
            }
            C3211d dVar2 = this.f10402m0;
            if (z4) {
                mo11368e1(dVar2, C3237j.f10420a);
            } else {
                mo11286G0(dVar2);
                for (int i5 = 0; i5 < size; i5++) {
                    this.f10422g0.get(i5).mo11286G0(this.f10402m0);
                }
            }
            if (!z3 || i3 >= 8 || !C3237j.f10420a[2]) {
                z = false;
            } else {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    C3229e eVar2 = this.f10422g0.get(i8);
                    i6 = Math.max(i6, eVar2.f10348P + eVar2.mo11293N());
                    i7 = Math.max(i7, eVar2.f10349Q + eVar2.mo11336t());
                }
                int max3 = Math.max(this.f10351S, i6);
                int max4 = Math.max(this.f10352T, i7);
                if (bVar2 != C3229e.C3231b.WRAP_CONTENT || mo11293N() >= max3) {
                    z = false;
                } else {
                    mo11276B0(max3);
                    this.f10342J[0] = C3229e.C3231b.WRAP_CONTENT;
                    z = true;
                    z5 = true;
                }
                if (bVar == C3229e.C3231b.WRAP_CONTENT && mo11336t() < max4) {
                    mo11310e0(max4);
                    this.f10342J[1] = C3229e.C3231b.WRAP_CONTENT;
                    z = true;
                    z5 = true;
                }
            }
            int max5 = Math.max(this.f10351S, mo11293N());
            if (max5 > mo11293N()) {
                mo11276B0(max5);
                this.f10342J[0] = C3229e.C3231b.FIXED;
                z = true;
                z5 = true;
            }
            int max6 = Math.max(this.f10352T, mo11336t());
            if (max6 > mo11336t()) {
                mo11310e0(max6);
                r11 = 1;
                this.f10342J[1] = C3229e.C3231b.FIXED;
                z = true;
                z5 = true;
            } else {
                r11 = 1;
            }
            if (!z5) {
                if (this.f10342J[0] == C3229e.C3231b.WRAP_CONTENT && max > 0 && mo11293N() > max) {
                    this.f10410u0 = r11;
                    this.f10342J[0] = C3229e.C3231b.FIXED;
                    mo11276B0(max);
                    z = true;
                    z5 = true;
                }
                if (this.f10342J[r11] == C3229e.C3231b.WRAP_CONTENT && max2 > 0 && mo11336t() > max2) {
                    this.f10411v0 = r11;
                    this.f10342J[r11] = C3229e.C3231b.FIXED;
                    mo11310e0(max2);
                    z4 = true;
                    z5 = true;
                    i2 = i3;
                }
            }
            z4 = z;
            i2 = i3;
        }
        this.f10422g0 = arrayList;
        if (z5) {
            C3229e.C3231b[] bVarArr2 = this.f10342J;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        mo11302X(this.f10402m0.mo11225v());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo11351K0(C3229e eVar, int i) {
        if (i == 0) {
            m13936M0(eVar);
        } else if (i == 1) {
            m13937N0(eVar);
        }
    }

    /* renamed from: L0 */
    public boolean mo11352L0(C3211d dVar) {
        mo11256f(dVar);
        int size = this.f10422g0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C3229e eVar = this.f10422g0.get(i);
            eVar.mo11321l0(0, false);
            eVar.mo11321l0(1, false);
            if (eVar instanceof C3223a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C3229e eVar2 = this.f10422g0.get(i2);
                if (eVar2 instanceof C3223a) {
                    ((C3223a) eVar2).mo11252K0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C3229e eVar3 = this.f10422g0.get(i3);
            if (eVar3.mo11309e()) {
                eVar3.mo11256f(dVar);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C3229e eVar4 = this.f10422g0.get(i4);
            if (eVar4 instanceof C3232f) {
                C3229e.C3231b[] bVarArr = eVar4.f10342J;
                C3229e.C3231b bVar = bVarArr[0];
                C3229e.C3231b bVar2 = bVarArr[1];
                if (bVar == C3229e.C3231b.WRAP_CONTENT) {
                    eVar4.mo11315i0(C3229e.C3231b.FIXED);
                }
                if (bVar2 == C3229e.C3231b.WRAP_CONTENT) {
                    eVar4.mo11345x0(C3229e.C3231b.FIXED);
                }
                eVar4.mo11256f(dVar);
                if (bVar == C3229e.C3231b.WRAP_CONTENT) {
                    eVar4.mo11315i0(bVar);
                }
                if (bVar2 == C3229e.C3231b.WRAP_CONTENT) {
                    eVar4.mo11345x0(bVar2);
                }
            } else {
                C3237j.m13979a(this, dVar, eVar4);
                if (!eVar4.mo11309e()) {
                    eVar4.mo11256f(dVar);
                }
            }
        }
        if (this.f10405p0 > 0) {
            C3224b.m13837a(this, dVar, 0);
        }
        if (this.f10406q0 > 0) {
            C3224b.m13837a(this, dVar, 1);
        }
        return true;
    }

    /* renamed from: O0 */
    public boolean mo11353O0(boolean z) {
        return this.f10398i0.mo11397f(z);
    }

    /* renamed from: P0 */
    public boolean mo11354P0(boolean z) {
        return this.f10398i0.mo11398g(z);
    }

    /* renamed from: Q0 */
    public boolean mo11355Q0(boolean z, int i) {
        return this.f10398i0.mo11399h(z, i);
    }

    /* renamed from: R0 */
    public C3241b.C3243b mo11356R0() {
        return this.f10399j0;
    }

    /* renamed from: S0 */
    public int mo11357S0() {
        return this.f10409t0;
    }

    /* renamed from: T0 */
    public void mo11358T0() {
        this.f10398i0.mo11400j();
    }

    /* renamed from: U0 */
    public void mo11359U0() {
        this.f10398i0.mo11401k();
    }

    /* renamed from: V0 */
    public boolean mo11360V0() {
        return this.f10411v0;
    }

    /* renamed from: W */
    public void mo11301W() {
        this.f10402m0.mo11208D();
        this.f10403n0 = 0;
        this.f10404o0 = 0;
        super.mo11301W();
    }

    /* renamed from: W0 */
    public boolean mo11361W0() {
        return this.f10400k0;
    }

    /* renamed from: X0 */
    public boolean mo11362X0() {
        return this.f10410u0;
    }

    /* renamed from: Y0 */
    public long mo11363Y0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f10403n0 = i10;
        int i11 = i9;
        this.f10404o0 = i11;
        return this.f10397h0.mo11386d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: Z0 */
    public boolean mo11364Z0(int i) {
        return (this.f10409t0 & i) == i;
    }

    /* renamed from: b1 */
    public void mo11365b1(C3241b.C3243b bVar) {
        this.f10399j0 = bVar;
        this.f10398i0.mo11403n(bVar);
    }

    /* renamed from: c1 */
    public void mo11366c1(int i) {
        this.f10409t0 = i;
        C3211d.f10205s = C3237j.m13980b(i, 256);
    }

    /* renamed from: d1 */
    public void mo11367d1(boolean z) {
        this.f10400k0 = z;
    }

    /* renamed from: e1 */
    public void mo11368e1(C3211d dVar, boolean[] zArr) {
        zArr[2] = false;
        mo11286G0(dVar);
        int size = this.f10422g0.size();
        for (int i = 0; i < size; i++) {
            this.f10422g0.get(i).mo11286G0(dVar);
        }
    }

    /* renamed from: f1 */
    public void mo11369f1() {
        this.f10397h0.mo11387e(this);
    }
}
