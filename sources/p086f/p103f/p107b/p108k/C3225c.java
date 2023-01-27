package p086f.p103f.p107b.p108k;

import java.util.ArrayList;
import p086f.p103f.p107b.p108k.C3229e;

/* renamed from: f.f.b.k.c */
public class C3225c {

    /* renamed from: a */
    protected C3229e f10294a;

    /* renamed from: b */
    protected C3229e f10295b;

    /* renamed from: c */
    protected C3229e f10296c;

    /* renamed from: d */
    protected C3229e f10297d;

    /* renamed from: e */
    protected C3229e f10298e;

    /* renamed from: f */
    protected C3229e f10299f;

    /* renamed from: g */
    protected C3229e f10300g;

    /* renamed from: h */
    protected ArrayList<C3229e> f10301h;

    /* renamed from: i */
    protected int f10302i;

    /* renamed from: j */
    protected int f10303j;

    /* renamed from: k */
    protected float f10304k = 0.0f;

    /* renamed from: l */
    int f10305l;

    /* renamed from: m */
    int f10306m;

    /* renamed from: n */
    int f10307n;

    /* renamed from: o */
    private int f10308o;

    /* renamed from: p */
    private boolean f10309p = false;

    /* renamed from: q */
    protected boolean f10310q;

    /* renamed from: r */
    protected boolean f10311r;

    /* renamed from: s */
    protected boolean f10312s;

    /* renamed from: t */
    private boolean f10313t;

    public C3225c(C3229e eVar, int i, boolean z) {
        this.f10294a = eVar;
        this.f10308o = i;
        this.f10309p = z;
    }

    /* renamed from: b */
    private void m13839b() {
        int i = this.f10308o * 2;
        C3229e eVar = this.f10294a;
        boolean z = false;
        C3229e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f10302i++;
            C3229e[] eVarArr = eVar.f10368e0;
            int i2 = this.f10308o;
            C3229e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f10366d0[i2] = null;
            if (eVar.mo11292M() != 8) {
                this.f10305l++;
                if (eVar.mo11330q(this.f10308o) != C3229e.C3231b.MATCH_CONSTRAINT) {
                    this.f10306m += eVar.mo11346y(this.f10308o);
                }
                int b = this.f10306m + eVar.f10339G[i].mo11261b();
                this.f10306m = b;
                int i3 = i + 1;
                this.f10306m = b + eVar.f10339G[i3].mo11261b();
                int b2 = this.f10307n + eVar.f10339G[i].mo11261b();
                this.f10307n = b2;
                this.f10307n = b2 + eVar.f10339G[i3].mo11261b();
                if (this.f10295b == null) {
                    this.f10295b = eVar;
                }
                this.f10297d = eVar;
                C3229e.C3231b[] bVarArr = eVar.f10342J;
                int i4 = this.f10308o;
                if (bVarArr[i4] == C3229e.C3231b.MATCH_CONSTRAINT) {
                    int[] iArr = eVar.f10375l;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f10303j++;
                        float[] fArr = eVar.f10364c0;
                        int i5 = this.f10308o;
                        float f = fArr[i5];
                        if (f > 0.0f) {
                            this.f10304k += fArr[i5];
                        }
                        if (m13840c(eVar, this.f10308o)) {
                            if (f < 0.0f) {
                                this.f10310q = true;
                            } else {
                                this.f10311r = true;
                            }
                            if (this.f10301h == null) {
                                this.f10301h = new ArrayList<>();
                            }
                            this.f10301h.add(eVar);
                        }
                        if (this.f10299f == null) {
                            this.f10299f = eVar;
                        }
                        C3229e eVar4 = this.f10300g;
                        if (eVar4 != null) {
                            eVar4.f10366d0[this.f10308o] = eVar;
                        }
                        this.f10300g = eVar;
                    }
                    if (this.f10308o == 0) {
                        if (eVar.f10373j == 0 && eVar.f10376m == 0) {
                            int i6 = eVar.f10377n;
                        }
                    } else if (eVar.f10374k == 0 && eVar.f10379p == 0) {
                        int i7 = eVar.f10380q;
                    }
                    int i8 = (eVar.f10346N > 0.0f ? 1 : (eVar.f10346N == 0.0f ? 0 : -1));
                }
            }
            if (eVar2 != eVar) {
                eVar2.f10368e0[this.f10308o] = eVar;
            }
            C3226d dVar = eVar.f10339G[i + 1].f10317d;
            if (dVar != null) {
                C3229e eVar5 = dVar.f10315b;
                C3226d[] dVarArr = eVar5.f10339G;
                if (dVarArr[i].f10317d != null && dVarArr[i].f10317d.f10315b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C3229e eVar6 = this.f10295b;
        if (eVar6 != null) {
            this.f10306m -= eVar6.f10339G[i].mo11261b();
        }
        C3229e eVar7 = this.f10297d;
        if (eVar7 != null) {
            this.f10306m -= eVar7.f10339G[i + 1].mo11261b();
        }
        this.f10296c = eVar;
        if (this.f10308o != 0 || !this.f10309p) {
            this.f10298e = this.f10294a;
        } else {
            this.f10298e = eVar;
        }
        if (this.f10311r && this.f10310q) {
            z = true;
        }
        this.f10312s = z;
    }

    /* renamed from: c */
    private static boolean m13840c(C3229e eVar, int i) {
        if (eVar.mo11292M() != 8 && eVar.f10342J[i] == C3229e.C3231b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f10375l;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo11259a() {
        if (!this.f10313t) {
            m13839b();
        }
        this.f10313t = true;
    }
}
