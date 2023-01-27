package p086f.p103f.p107b;

import java.util.ArrayList;
import java.util.Iterator;
import p086f.p103f.p107b.C3211d;
import p086f.p103f.p107b.C3220i;

/* renamed from: f.f.b.b */
public class C3208b implements C3211d.C3212a {

    /* renamed from: a */
    C3220i f10193a = null;

    /* renamed from: b */
    float f10194b = 0.0f;

    /* renamed from: c */
    boolean f10195c;

    /* renamed from: d */
    ArrayList<C3220i> f10196d = new ArrayList<>();

    /* renamed from: e */
    public C3209a f10197e;

    /* renamed from: f */
    boolean f10198f = false;

    /* renamed from: f.f.b.b$a */
    public interface C3209a {
        /* renamed from: a */
        float mo11163a(int i);

        /* renamed from: b */
        void mo11164b(C3220i iVar, float f, boolean z);

        /* renamed from: c */
        float mo11165c(C3220i iVar);

        void clear();

        /* renamed from: d */
        boolean mo11167d(C3220i iVar);

        /* renamed from: e */
        int mo11168e();

        /* renamed from: f */
        float mo11169f(C3208b bVar, boolean z);

        /* renamed from: g */
        void mo11170g(C3220i iVar, float f);

        /* renamed from: h */
        float mo11171h(C3220i iVar, boolean z);

        /* renamed from: i */
        C3220i mo11172i(int i);

        /* renamed from: j */
        void mo11173j(float f);

        /* renamed from: k */
        void mo11174k();
    }

    public C3208b() {
    }

    public C3208b(C3210c cVar) {
        this.f10197e = new C3207a(this, cVar);
    }

    /* renamed from: v */
    private boolean m13711v(C3220i iVar, C3211d dVar) {
        return iVar.f10271m <= 1;
    }

    /* renamed from: x */
    private C3220i m13712x(boolean[] zArr, C3220i iVar) {
        C3220i.C3221a aVar;
        int e = this.f10197e.mo11168e();
        C3220i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < e; i++) {
            float a = this.f10197e.mo11163a(i);
            if (a < 0.0f) {
                C3220i i2 = this.f10197e.mo11172i(i);
                if ((zArr == null || !zArr[i2.f10261c]) && i2 != iVar && (((aVar = i2.f10268j) == C3220i.C3221a.SLACK || aVar == C3220i.C3221a.ERROR) && a < f)) {
                    f = a;
                    iVar2 = i2;
                }
            }
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo11176A() {
        /*
            r9 = this;
            f.f.b.i r0 = r9.f10193a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            f.f.b.i r1 = r9.f10193a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f10194b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f10194b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            f.f.b.b$a r5 = r9.f10197e
            int r5 = r5.mo11168e()
        L_0x0059:
            if (r2 >= r5) goto L_0x00d6
            f.f.b.b$a r6 = r9.f10197e
            f.f.b.i r6 = r6.mo11172i(r2)
            if (r6 != 0) goto L_0x0064
            goto L_0x00d3
        L_0x0064:
            f.f.b.b$a r7 = r9.f10197e
            float r7 = r7.mo11163a(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006f
            goto L_0x00d3
        L_0x006f:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0086
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00af
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a6
        L_0x0086:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00af
        L_0x009c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a6:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        L_0x00af:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c8
        L_0x00bb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c8:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00d3:
            int r2 = r2 + 1
            goto L_0x0059
        L_0x00d6:
            if (r1 != 0) goto L_0x00e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.C3208b.mo11176A():java.lang.String");
    }

    /* renamed from: B */
    public void mo11177B(C3211d dVar, C3220i iVar, boolean z) {
        if (iVar.f10265g) {
            this.f10194b += iVar.f10264f * this.f10197e.mo11165c(iVar);
            this.f10197e.mo11171h(iVar, z);
            if (z) {
                iVar.mo11241c(this);
            }
        }
    }

    /* renamed from: C */
    public void mo11178C(C3208b bVar, boolean z) {
        this.f10194b += bVar.f10194b * this.f10197e.mo11169f(bVar, z);
        if (z) {
            bVar.f10193a.mo11241c(this);
        }
    }

    /* renamed from: D */
    public void mo11179D(C3211d dVar) {
        if (dVar.f10213f.length != 0) {
            boolean z = false;
            while (!z) {
                int e = this.f10197e.mo11168e();
                for (int i = 0; i < e; i++) {
                    C3220i i2 = this.f10197e.mo11172i(i);
                    if (i2.f10262d != -1 || i2.f10265g) {
                        this.f10196d.add(i2);
                    }
                }
                if (this.f10196d.size() > 0) {
                    Iterator<C3220i> it = this.f10196d.iterator();
                    while (it.hasNext()) {
                        C3220i next = it.next();
                        if (next.f10265g) {
                            mo11177B(dVar, next, true);
                        } else {
                            mo11178C(dVar.f10213f[next.f10262d], true);
                        }
                    }
                    this.f10196d.clear();
                } else {
                    z = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo11180a(C3211d.C3212a aVar) {
        if (aVar instanceof C3208b) {
            C3208b bVar = (C3208b) aVar;
            this.f10193a = null;
            this.f10197e.clear();
            for (int i = 0; i < bVar.f10197e.mo11168e(); i++) {
                this.f10197e.mo11164b(bVar.f10197e.mo11172i(i), bVar.f10197e.mo11163a(i), true);
            }
        }
    }

    /* renamed from: b */
    public void mo11181b(C3220i iVar) {
        int i = iVar.f10263e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f10197e.mo11170g(iVar, f);
    }

    /* renamed from: c */
    public C3220i mo11182c(C3211d dVar, boolean[] zArr) {
        return m13712x(zArr, (C3220i) null);
    }

    public void clear() {
        this.f10197e.clear();
        this.f10193a = null;
        this.f10194b = 0.0f;
    }

    /* renamed from: d */
    public C3208b mo11184d(C3211d dVar, int i) {
        this.f10197e.mo11170g(dVar.mo11220o(i, "ep"), 1.0f);
        this.f10197e.mo11170g(dVar.mo11220o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3208b mo11185e(C3220i iVar, int i) {
        this.f10197e.mo11170g(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo11186f(C3211d dVar) {
        boolean z;
        C3220i g = mo11187g(dVar);
        if (g == null) {
            z = true;
        } else {
            mo11205y(g);
            z = false;
        }
        if (this.f10197e.mo11168e() == 0) {
            this.f10198f = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C3220i mo11187g(C3211d dVar) {
        int e = this.f10197e.mo11168e();
        C3220i iVar = null;
        C3220i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < e; i++) {
            float a = this.f10197e.mo11163a(i);
            C3220i i2 = this.f10197e.mo11172i(i);
            if (i2.f10268j == C3220i.C3221a.UNRESTRICTED) {
                if (iVar == null || f > a) {
                    z = m13711v(i2, dVar);
                    f = a;
                    iVar = i2;
                } else if (!z && m13711v(i2, dVar)) {
                    f = a;
                    iVar = i2;
                    z = true;
                }
            } else if (iVar == null && a < 0.0f) {
                if (iVar2 == null || f2 > a) {
                    z2 = m13711v(i2, dVar);
                    f2 = a;
                    iVar2 = i2;
                } else if (!z2 && m13711v(i2, dVar)) {
                    f2 = a;
                    iVar2 = i2;
                    z2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public C3220i getKey() {
        return this.f10193a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C3208b mo11189h(C3220i iVar, C3220i iVar2, int i, float f, C3220i iVar3, C3220i iVar4, int i2) {
        float f2;
        int i3;
        if (iVar2 == iVar3) {
            this.f10197e.mo11170g(iVar, 1.0f);
            this.f10197e.mo11170g(iVar4, 1.0f);
            this.f10197e.mo11170g(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f10197e.mo11170g(iVar, 1.0f);
            this.f10197e.mo11170g(iVar2, -1.0f);
            this.f10197e.mo11170g(iVar3, -1.0f);
            this.f10197e.mo11170g(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
            }
            return this;
        }
        if (f <= 0.0f) {
            this.f10197e.mo11170g(iVar, -1.0f);
            this.f10197e.mo11170g(iVar2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f10197e.mo11170g(iVar4, -1.0f);
            this.f10197e.mo11170g(iVar3, 1.0f);
            i3 = -i2;
        } else {
            float f3 = 1.0f - f;
            this.f10197e.mo11170g(iVar, f3 * 1.0f);
            this.f10197e.mo11170g(iVar2, f3 * -1.0f);
            this.f10197e.mo11170g(iVar3, -1.0f * f);
            this.f10197e.mo11170g(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f10194b = f2;
        return this;
        f2 = (float) i3;
        this.f10194b = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C3208b mo11190i(C3220i iVar, int i) {
        this.f10193a = iVar;
        float f = (float) i;
        iVar.f10264f = f;
        this.f10194b = f;
        this.f10198f = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3208b mo11191j(C3220i iVar, C3220i iVar2, float f) {
        this.f10197e.mo11170g(iVar, -1.0f);
        this.f10197e.mo11170g(iVar2, f);
        return this;
    }

    /* renamed from: k */
    public C3208b mo11192k(C3220i iVar, C3220i iVar2, C3220i iVar3, C3220i iVar4, float f) {
        this.f10197e.mo11170g(iVar, -1.0f);
        this.f10197e.mo11170g(iVar2, 1.0f);
        this.f10197e.mo11170g(iVar3, f);
        this.f10197e.mo11170g(iVar4, -f);
        return this;
    }

    /* renamed from: l */
    public C3208b mo11193l(float f, float f2, float f3, C3220i iVar, C3220i iVar2, C3220i iVar3, C3220i iVar4) {
        this.f10194b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f10197e.mo11170g(iVar, 1.0f);
            this.f10197e.mo11170g(iVar2, -1.0f);
            this.f10197e.mo11170g(iVar4, 1.0f);
            this.f10197e.mo11170g(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f10197e.mo11170g(iVar, 1.0f);
            this.f10197e.mo11170g(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f10197e.mo11170g(iVar3, 1.0f);
            this.f10197e.mo11170g(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f10197e.mo11170g(iVar, 1.0f);
            this.f10197e.mo11170g(iVar2, -1.0f);
            this.f10197e.mo11170g(iVar4, f4);
            this.f10197e.mo11170g(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C3208b mo11194m(C3220i iVar, int i) {
        C3209a aVar;
        float f;
        if (i < 0) {
            this.f10194b = (float) (i * -1);
            aVar = this.f10197e;
            f = 1.0f;
        } else {
            this.f10194b = (float) i;
            aVar = this.f10197e;
            f = -1.0f;
        }
        aVar.mo11170g(iVar, f);
        return this;
    }

    /* renamed from: n */
    public C3208b mo11195n(C3220i iVar, C3220i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f10194b = (float) i;
        }
        if (!z) {
            this.f10197e.mo11170g(iVar, -1.0f);
            this.f10197e.mo11170g(iVar2, 1.0f);
        } else {
            this.f10197e.mo11170g(iVar, 1.0f);
            this.f10197e.mo11170g(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C3208b mo11196o(C3220i iVar, C3220i iVar2, C3220i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f10194b = (float) i;
        }
        if (!z) {
            this.f10197e.mo11170g(iVar, -1.0f);
            this.f10197e.mo11170g(iVar2, 1.0f);
            this.f10197e.mo11170g(iVar3, 1.0f);
        } else {
            this.f10197e.mo11170g(iVar, 1.0f);
            this.f10197e.mo11170g(iVar2, -1.0f);
            this.f10197e.mo11170g(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C3208b mo11197p(C3220i iVar, C3220i iVar2, C3220i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f10194b = (float) i;
        }
        if (!z) {
            this.f10197e.mo11170g(iVar, -1.0f);
            this.f10197e.mo11170g(iVar2, 1.0f);
            this.f10197e.mo11170g(iVar3, -1.0f);
        } else {
            this.f10197e.mo11170g(iVar, 1.0f);
            this.f10197e.mo11170g(iVar2, -1.0f);
            this.f10197e.mo11170g(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C3208b mo11198q(C3220i iVar, C3220i iVar2, C3220i iVar3, C3220i iVar4, float f) {
        this.f10197e.mo11170g(iVar3, 0.5f);
        this.f10197e.mo11170g(iVar4, 0.5f);
        this.f10197e.mo11170g(iVar, -0.5f);
        this.f10197e.mo11170g(iVar2, -0.5f);
        this.f10194b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo11199r() {
        float f = this.f10194b;
        if (f < 0.0f) {
            this.f10194b = f * -1.0f;
            this.f10197e.mo11174k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo11200s() {
        C3220i iVar = this.f10193a;
        return iVar != null && (iVar.f10268j == C3220i.C3221a.UNRESTRICTED || this.f10194b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo11201t(C3220i iVar) {
        return this.f10197e.mo11167d(iVar);
    }

    public String toString() {
        return mo11176A();
    }

    /* renamed from: u */
    public boolean mo11203u() {
        return this.f10193a == null && this.f10194b == 0.0f && this.f10197e.mo11168e() == 0;
    }

    /* renamed from: w */
    public C3220i mo11204w(C3220i iVar) {
        return m13712x((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo11205y(C3220i iVar) {
        C3220i iVar2 = this.f10193a;
        if (iVar2 != null) {
            this.f10197e.mo11170g(iVar2, -1.0f);
            this.f10193a = null;
        }
        float h = this.f10197e.mo11171h(iVar, true) * -1.0f;
        this.f10193a = iVar;
        if (h != 1.0f) {
            this.f10194b /= h;
            this.f10197e.mo11173j(h);
        }
    }

    /* renamed from: z */
    public void mo11206z() {
        this.f10193a = null;
        this.f10197e.clear();
        this.f10194b = 0.0f;
        this.f10198f = false;
    }
}
