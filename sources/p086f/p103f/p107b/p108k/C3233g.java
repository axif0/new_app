package p086f.p103f.p107b.p108k;

import p086f.p103f.p107b.C3211d;
import p086f.p103f.p107b.C3220i;
import p086f.p103f.p107b.p108k.C3226d;
import p086f.p103f.p107b.p108k.C3229e;

/* renamed from: f.f.b.k.g */
public class C3233g extends C3229e {

    /* renamed from: g0 */
    protected float f10412g0 = -1.0f;

    /* renamed from: h0 */
    protected int f10413h0 = -1;

    /* renamed from: i0 */
    protected int f10414i0 = -1;

    /* renamed from: j0 */
    private C3226d f10415j0 = this.f10389z;

    /* renamed from: k0 */
    private int f10416k0;

    /* renamed from: f.f.b.k.g$a */
    static /* synthetic */ class C3234a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10417a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.f.b.k.d$b[] r0 = p086f.p103f.p107b.p108k.C3226d.C3228b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10417a = r0
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10417a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10417a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10417a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10417a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10417a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10417a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f10417a     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f10417a     // Catch:{ NoSuchFieldError -> 0x006c }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.C3233g.C3234a.<clinit>():void");
        }
    }

    public C3233g() {
        this.f10416k0 = 0;
        this.f10340H.clear();
        this.f10340H.add(this.f10415j0);
        int length = this.f10339G.length;
        for (int i = 0; i < length; i++) {
            this.f10339G[i] = this.f10415j0;
        }
    }

    /* renamed from: G0 */
    public void mo11286G0(C3211d dVar) {
        if (mo11281E() != null) {
            int x = dVar.mo11226x(this.f10415j0);
            if (this.f10416k0 == 1) {
                mo11278C0(x);
                mo11280D0(0);
                mo11310e0(mo11281E().mo11336t());
                mo11276B0(0);
                return;
            }
            mo11278C0(0);
            mo11280D0(x);
            mo11276B0(mo11281E().mo11293N());
            mo11310e0(0);
        }
    }

    /* renamed from: H0 */
    public int mo11370H0() {
        return this.f10416k0;
    }

    /* renamed from: I0 */
    public int mo11371I0() {
        return this.f10413h0;
    }

    /* renamed from: J0 */
    public int mo11372J0() {
        return this.f10414i0;
    }

    /* renamed from: K0 */
    public float mo11373K0() {
        return this.f10412g0;
    }

    /* renamed from: L0 */
    public void mo11374L0(int i) {
        if (i > -1) {
            this.f10412g0 = -1.0f;
            this.f10413h0 = i;
            this.f10414i0 = -1;
        }
    }

    /* renamed from: M0 */
    public void mo11375M0(int i) {
        if (i > -1) {
            this.f10412g0 = -1.0f;
            this.f10413h0 = -1;
            this.f10414i0 = i;
        }
    }

    /* renamed from: N0 */
    public void mo11376N0(float f) {
        if (f > -1.0f) {
            this.f10412g0 = f;
            this.f10413h0 = -1;
            this.f10414i0 = -1;
        }
    }

    /* renamed from: O0 */
    public void mo11377O0(int i) {
        if (this.f10416k0 != i) {
            this.f10416k0 = i;
            this.f10340H.clear();
            this.f10415j0 = this.f10416k0 == 1 ? this.f10388y : this.f10389z;
            this.f10340H.add(this.f10415j0);
            int length = this.f10339G.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f10339G[i2] = this.f10415j0;
            }
        }
    }

    /* renamed from: f */
    public void mo11256f(C3211d dVar) {
        C3232f fVar = (C3232f) mo11281E();
        if (fVar != null) {
            C3226d k = fVar.mo11318k(C3226d.C3228b.LEFT);
            C3226d k2 = fVar.mo11318k(C3226d.C3228b.RIGHT);
            C3229e eVar = this.f10343K;
            boolean z = true;
            boolean z2 = eVar != null && eVar.f10342J[0] == C3229e.C3231b.WRAP_CONTENT;
            if (this.f10416k0 == 0) {
                k = fVar.mo11318k(C3226d.C3228b.TOP);
                k2 = fVar.mo11318k(C3226d.C3228b.BOTTOM);
                C3229e eVar2 = this.f10343K;
                if (eVar2 == null || eVar2.f10342J[1] != C3229e.C3231b.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f10413h0 != -1) {
                C3220i q = dVar.mo11222q(this.f10415j0);
                dVar.mo11212e(q, dVar.mo11222q(k), this.f10413h0, 8);
                if (z2) {
                    dVar.mo11215h(dVar.mo11222q(k2), q, 0, 5);
                }
            } else if (this.f10414i0 != -1) {
                C3220i q2 = dVar.mo11222q(this.f10415j0);
                C3220i q3 = dVar.mo11222q(k2);
                dVar.mo11212e(q2, q3, -this.f10414i0, 8);
                if (z2) {
                    dVar.mo11215h(q2, dVar.mo11222q(k), 0, 5);
                    dVar.mo11215h(q3, q2, 0, 5);
                }
            } else if (this.f10412g0 != -1.0f) {
                dVar.mo11211d(C3211d.m13757s(dVar, dVar.mo11222q(this.f10415j0), dVar.mo11222q(k2), this.f10412g0));
            }
        }
    }

    /* renamed from: g */
    public boolean mo11257g() {
        return true;
    }

    /* renamed from: k */
    public C3226d mo11318k(C3226d.C3228b bVar) {
        switch (C3234a.f10417a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f10416k0 == 1) {
                    return this.f10415j0;
                }
                break;
            case 3:
            case 4:
                if (this.f10416k0 == 0) {
                    return this.f10415j0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
