package p086f.p103f.p107b;

import java.util.Arrays;
import java.util.HashMap;
import p086f.p103f.p107b.C3220i;
import p086f.p103f.p107b.p108k.C3226d;
import p086f.p103f.p107b.p108k.C3229e;

/* renamed from: f.f.b.d */
public class C3211d {

    /* renamed from: q */
    private static int f10203q = 1000;

    /* renamed from: r */
    public static C3214e f10204r = null;

    /* renamed from: s */
    public static boolean f10205s = true;

    /* renamed from: t */
    public static long f10206t;

    /* renamed from: u */
    public static long f10207u;

    /* renamed from: a */
    int f10208a;

    /* renamed from: b */
    private HashMap<String, C3220i> f10209b;

    /* renamed from: c */
    private C3212a f10210c;

    /* renamed from: d */
    private int f10211d;

    /* renamed from: e */
    private int f10212e;

    /* renamed from: f */
    C3208b[] f10213f;

    /* renamed from: g */
    public boolean f10214g;

    /* renamed from: h */
    public boolean f10215h;

    /* renamed from: i */
    private boolean[] f10216i;

    /* renamed from: j */
    int f10217j;

    /* renamed from: k */
    int f10218k;

    /* renamed from: l */
    private int f10219l;

    /* renamed from: m */
    final C3210c f10220m;

    /* renamed from: n */
    private C3220i[] f10221n;

    /* renamed from: o */
    private int f10222o;

    /* renamed from: p */
    private C3212a f10223p;

    /* renamed from: f.f.b.d$a */
    interface C3212a {
        /* renamed from: a */
        void mo11180a(C3212a aVar);

        /* renamed from: b */
        void mo11181b(C3220i iVar);

        /* renamed from: c */
        C3220i mo11182c(C3211d dVar, boolean[] zArr);

        void clear();

        C3220i getKey();
    }

    /* renamed from: f.f.b.d$b */
    class C3213b extends C3208b {
        public C3213b(C3211d dVar, C3210c cVar) {
            this.f10197e = new C3222j(this, cVar);
        }
    }

    public C3211d() {
        this.f10208a = 0;
        this.f10209b = null;
        this.f10211d = 32;
        this.f10212e = 32;
        this.f10213f = null;
        this.f10214g = false;
        this.f10215h = false;
        this.f10216i = new boolean[32];
        this.f10217j = 1;
        this.f10218k = 0;
        this.f10219l = 32;
        this.f10221n = new C3220i[f10203q];
        this.f10222o = 0;
        this.f10213f = new C3208b[32];
        m13753C();
        C3210c cVar = new C3210c();
        this.f10220m = cVar;
        this.f10210c = new C3217h(cVar);
        this.f10223p = f10205s ? new C3213b(this, this.f10220m) : new C3208b(this.f10220m);
    }

    /* renamed from: B */
    private final int m13752B(C3212a aVar, boolean z) {
        C3214e eVar = f10204r;
        if (eVar != null) {
            eVar.f10231h++;
        }
        for (int i = 0; i < this.f10217j; i++) {
            this.f10216i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C3214e eVar2 = f10204r;
            if (eVar2 != null) {
                eVar2.f10232i++;
            }
            i2++;
            if (i2 >= this.f10217j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f10216i[aVar.getKey().f10261c] = true;
            }
            C3220i c = aVar.mo11182c(this, this.f10216i);
            if (c != null) {
                boolean[] zArr = this.f10216i;
                int i3 = c.f10261c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (c != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f10218k; i5++) {
                    C3208b bVar = this.f10213f[i5];
                    if (bVar.f10193a.f10268j != C3220i.C3221a.UNRESTRICTED && !bVar.f10198f && bVar.mo11201t(c)) {
                        float c2 = bVar.f10197e.mo11165c(c);
                        if (c2 < 0.0f) {
                            float f2 = (-bVar.f10194b) / c2;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C3208b bVar2 = this.f10213f[i4];
                    bVar2.f10193a.f10262d = -1;
                    C3214e eVar3 = f10204r;
                    if (eVar3 != null) {
                        eVar3.f10233j++;
                    }
                    bVar2.mo11205y(c);
                    C3220i iVar = bVar2.f10193a;
                    iVar.f10262d = i4;
                    iVar.mo11245g(bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: C */
    private void m13753C() {
        int i = 0;
        if (f10205s) {
            while (true) {
                C3208b[] bVarArr = this.f10213f;
                if (i < bVarArr.length) {
                    C3208b bVar = bVarArr[i];
                    if (bVar != null) {
                        this.f10220m.f10199a.mo11228a(bVar);
                    }
                    this.f10213f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C3208b[] bVarArr2 = this.f10213f;
                if (i < bVarArr2.length) {
                    C3208b bVar2 = bVarArr2[i];
                    if (bVar2 != null) {
                        this.f10220m.f10200b.mo11228a(bVar2);
                    }
                    this.f10213f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private C3220i m13754a(C3220i.C3221a aVar, String str) {
        C3220i b = this.f10220m.f10201c.mo11229b();
        if (b == null) {
            b = new C3220i(aVar, str);
        } else {
            b.mo11242d();
        }
        b.mo11244f(aVar, str);
        int i = this.f10222o;
        int i2 = f10203q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f10203q = i3;
            this.f10221n = (C3220i[]) Arrays.copyOf(this.f10221n, i3);
        }
        C3220i[] iVarArr = this.f10221n;
        int i4 = this.f10222o;
        this.f10222o = i4 + 1;
        iVarArr[i4] = b;
        return b;
    }

    /* renamed from: l */
    private final void m13755l(C3208b bVar) {
        C3215f<C3208b> fVar;
        C3208b bVar2;
        if (f10205s) {
            C3208b[] bVarArr = this.f10213f;
            int i = this.f10218k;
            if (bVarArr[i] != null) {
                fVar = this.f10220m.f10199a;
                bVar2 = bVarArr[i];
            }
            C3208b[] bVarArr2 = this.f10213f;
            int i2 = this.f10218k;
            bVarArr2[i2] = bVar;
            C3220i iVar = bVar.f10193a;
            iVar.f10262d = i2;
            this.f10218k = i2 + 1;
            iVar.mo11245g(bVar);
        }
        C3208b[] bVarArr3 = this.f10213f;
        int i3 = this.f10218k;
        if (bVarArr3[i3] != null) {
            fVar = this.f10220m.f10200b;
            bVar2 = bVarArr3[i3];
        }
        C3208b[] bVarArr22 = this.f10213f;
        int i22 = this.f10218k;
        bVarArr22[i22] = bVar;
        C3220i iVar2 = bVar.f10193a;
        iVar2.f10262d = i22;
        this.f10218k = i22 + 1;
        iVar2.mo11245g(bVar);
        fVar.mo11228a(bVar2);
        C3208b[] bVarArr222 = this.f10213f;
        int i222 = this.f10218k;
        bVarArr222[i222] = bVar;
        C3220i iVar22 = bVar.f10193a;
        iVar22.f10262d = i222;
        this.f10218k = i222 + 1;
        iVar22.mo11245g(bVar);
    }

    /* renamed from: n */
    private void m13756n() {
        for (int i = 0; i < this.f10218k; i++) {
            C3208b bVar = this.f10213f[i];
            bVar.f10193a.f10264f = bVar.f10194b;
        }
    }

    /* renamed from: s */
    public static C3208b m13757s(C3211d dVar, C3220i iVar, C3220i iVar2, float f) {
        C3208b r = dVar.mo11223r();
        r.mo11191j(iVar, iVar2, f);
        return r;
    }

    /* renamed from: u */
    private int m13758u(C3212a aVar) throws Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f10218k) {
                z = false;
                break;
            }
            C3208b[] bVarArr = this.f10213f;
            if (bVarArr[i].f10193a.f10268j != C3220i.C3221a.UNRESTRICTED && bVarArr[i].f10194b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C3214e eVar = f10204r;
            if (eVar != null) {
                eVar.f10234k++;
            }
            i2++;
            float f2 = Float.MAX_VALUE;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            while (i3 < this.f10218k) {
                C3208b bVar = this.f10213f[i3];
                if (bVar.f10193a.f10268j != C3220i.C3221a.UNRESTRICTED && !bVar.f10198f && bVar.f10194b < f) {
                    int i7 = 1;
                    while (i7 < this.f10217j) {
                        C3220i iVar = this.f10220m.f10202d[i7];
                        float c = bVar.f10197e.mo11165c(iVar);
                        if (c > f) {
                            for (int i8 = 0; i8 < 9; i8++) {
                                float f3 = iVar.f10266h[i8] / c;
                                if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                    i5 = i7;
                                    i6 = i8;
                                    f2 = f3;
                                    i4 = i3;
                                }
                            }
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C3208b bVar2 = this.f10213f[i4];
                bVar2.f10193a.f10262d = -1;
                C3214e eVar2 = f10204r;
                if (eVar2 != null) {
                    eVar2.f10233j++;
                }
                bVar2.mo11205y(this.f10220m.f10202d[i5]);
                C3220i iVar2 = bVar2.f10193a;
                iVar2.f10262d = i4;
                iVar2.mo11245g(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f10217j / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: w */
    public static C3214e m13759w() {
        return f10204r;
    }

    /* renamed from: y */
    private void m13760y() {
        int i = this.f10211d * 2;
        this.f10211d = i;
        this.f10213f = (C3208b[]) Arrays.copyOf(this.f10213f, i);
        C3210c cVar = this.f10220m;
        cVar.f10202d = (C3220i[]) Arrays.copyOf(cVar.f10202d, this.f10211d);
        int i2 = this.f10211d;
        this.f10216i = new boolean[i2];
        this.f10212e = i2;
        this.f10219l = i2;
        C3214e eVar = f10204r;
        if (eVar != null) {
            eVar.f10227d++;
            eVar.f10238o = Math.max(eVar.f10238o, (long) i2);
            C3214e eVar2 = f10204r;
            eVar2.f10247x = eVar2.f10238o;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo11207A(C3212a aVar) throws Exception {
        C3214e eVar = f10204r;
        if (eVar != null) {
            eVar.f10243t++;
            eVar.f10244u = Math.max(eVar.f10244u, (long) this.f10217j);
            C3214e eVar2 = f10204r;
            eVar2.f10245v = Math.max(eVar2.f10245v, (long) this.f10218k);
        }
        m13758u(aVar);
        m13752B(aVar, false);
        m13756n();
    }

    /* renamed from: D */
    public void mo11208D() {
        C3210c cVar;
        int i = 0;
        while (true) {
            cVar = this.f10220m;
            C3220i[] iVarArr = cVar.f10202d;
            if (i >= iVarArr.length) {
                break;
            }
            C3220i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo11242d();
            }
            i++;
        }
        cVar.f10201c.mo11230c(this.f10221n, this.f10222o);
        this.f10222o = 0;
        Arrays.fill(this.f10220m.f10202d, (Object) null);
        HashMap<String, C3220i> hashMap = this.f10209b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f10208a = 0;
        this.f10210c.clear();
        this.f10217j = 1;
        for (int i2 = 0; i2 < this.f10218k; i2++) {
            this.f10213f[i2].f10195c = false;
        }
        m13753C();
        this.f10218k = 0;
        this.f10223p = f10205s ? new C3213b(this, this.f10220m) : new C3208b(this.f10220m);
    }

    /* renamed from: b */
    public void mo11209b(C3229e eVar, C3229e eVar2, float f, int i) {
        C3229e eVar3 = eVar;
        C3229e eVar4 = eVar2;
        C3220i q = mo11222q(eVar3.mo11318k(C3226d.C3228b.LEFT));
        C3220i q2 = mo11222q(eVar3.mo11318k(C3226d.C3228b.TOP));
        C3220i q3 = mo11222q(eVar3.mo11318k(C3226d.C3228b.RIGHT));
        C3220i q4 = mo11222q(eVar3.mo11318k(C3226d.C3228b.BOTTOM));
        C3220i q5 = mo11222q(eVar4.mo11318k(C3226d.C3228b.LEFT));
        C3220i q6 = mo11222q(eVar4.mo11318k(C3226d.C3228b.TOP));
        C3220i q7 = mo11222q(eVar4.mo11318k(C3226d.C3228b.RIGHT));
        C3220i q8 = mo11222q(eVar4.mo11318k(C3226d.C3228b.BOTTOM));
        C3208b r = mo11223r();
        double d = (double) f;
        double sin = Math.sin(d);
        C3220i iVar = q3;
        double d2 = (double) i;
        Double.isNaN(d2);
        r.mo11198q(q2, q4, q6, q8, (float) (sin * d2));
        mo11211d(r);
        C3208b r2 = mo11223r();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        r2.mo11198q(q, iVar, q5, q7, (float) (cos * d2));
        mo11211d(r2);
    }

    /* renamed from: c */
    public void mo11210c(C3220i iVar, C3220i iVar2, int i, float f, C3220i iVar3, C3220i iVar4, int i2, int i3) {
        int i4 = i3;
        C3208b r = mo11223r();
        r.mo11189h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 8) {
            r.mo11184d(this, i4);
        }
        mo11211d(r);
    }

    /* renamed from: d */
    public void mo11211d(C3208b bVar) {
        C3220i w;
        if (bVar != null) {
            C3214e eVar = f10204r;
            if (eVar != null) {
                eVar.f10229f++;
                if (bVar.f10198f) {
                    eVar.f10230g++;
                }
            }
            boolean z = true;
            if (this.f10218k + 1 >= this.f10219l || this.f10217j + 1 >= this.f10212e) {
                m13760y();
            }
            boolean z2 = false;
            if (!bVar.f10198f) {
                bVar.mo11179D(this);
                if (!bVar.mo11203u()) {
                    bVar.mo11199r();
                    if (bVar.mo11186f(this)) {
                        C3220i p = mo11221p();
                        bVar.f10193a = p;
                        m13755l(bVar);
                        this.f10223p.mo11180a(bVar);
                        m13752B(this.f10223p, true);
                        if (p.f10262d == -1) {
                            if (bVar.f10193a == p && (w = bVar.mo11204w(p)) != null) {
                                C3214e eVar2 = f10204r;
                                if (eVar2 != null) {
                                    eVar2.f10233j++;
                                }
                                bVar.mo11205y(w);
                            }
                            if (!bVar.f10198f) {
                                bVar.f10193a.mo11245g(bVar);
                            }
                            this.f10218k--;
                        }
                    } else {
                        z = false;
                    }
                    if (bVar.mo11200s()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                m13755l(bVar);
            }
        }
    }

    /* renamed from: e */
    public C3208b mo11212e(C3220i iVar, C3220i iVar2, int i, int i2) {
        if (i2 == 8 && iVar2.f10265g && iVar.f10262d == -1) {
            iVar.mo11243e(this, iVar2.f10264f + ((float) i));
            return null;
        }
        C3208b r = mo11223r();
        r.mo11195n(iVar, iVar2, i);
        if (i2 != 8) {
            r.mo11184d(this, i2);
        }
        mo11211d(r);
        return r;
    }

    /* renamed from: f */
    public void mo11213f(C3220i iVar, int i) {
        C3208b bVar;
        int i2 = iVar.f10262d;
        if (i2 == -1) {
            iVar.mo11243e(this, (float) i);
            return;
        }
        if (i2 != -1) {
            C3208b bVar2 = this.f10213f[i2];
            if (!bVar2.f10198f) {
                if (bVar2.f10197e.mo11168e() == 0) {
                    bVar2.f10198f = true;
                } else {
                    bVar = mo11223r();
                    bVar.mo11194m(iVar, i);
                }
            }
            bVar2.f10194b = (float) i;
            return;
        }
        bVar = mo11223r();
        bVar.mo11190i(iVar, i);
        mo11211d(bVar);
    }

    /* renamed from: g */
    public void mo11214g(C3220i iVar, C3220i iVar2, int i, boolean z) {
        C3208b r = mo11223r();
        C3220i t = mo11224t();
        t.f10263e = 0;
        r.mo11196o(iVar, iVar2, t, i);
        mo11211d(r);
    }

    /* renamed from: h */
    public void mo11215h(C3220i iVar, C3220i iVar2, int i, int i2) {
        C3208b r = mo11223r();
        C3220i t = mo11224t();
        t.f10263e = 0;
        r.mo11196o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo11219m(r, (int) (r.f10197e.mo11165c(t) * -1.0f), i2);
        }
        mo11211d(r);
    }

    /* renamed from: i */
    public void mo11216i(C3220i iVar, C3220i iVar2, int i, boolean z) {
        C3208b r = mo11223r();
        C3220i t = mo11224t();
        t.f10263e = 0;
        r.mo11197p(iVar, iVar2, t, i);
        mo11211d(r);
    }

    /* renamed from: j */
    public void mo11217j(C3220i iVar, C3220i iVar2, int i, int i2) {
        C3208b r = mo11223r();
        C3220i t = mo11224t();
        t.f10263e = 0;
        r.mo11197p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo11219m(r, (int) (r.f10197e.mo11165c(t) * -1.0f), i2);
        }
        mo11211d(r);
    }

    /* renamed from: k */
    public void mo11218k(C3220i iVar, C3220i iVar2, C3220i iVar3, C3220i iVar4, float f, int i) {
        C3208b r = mo11223r();
        r.mo11192k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r.mo11184d(this, i);
        }
        mo11211d(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo11219m(C3208b bVar, int i, int i2) {
        bVar.mo11185e(mo11220o(i2, (String) null), i);
    }

    /* renamed from: o */
    public C3220i mo11220o(int i, String str) {
        C3214e eVar = f10204r;
        if (eVar != null) {
            eVar.f10235l++;
        }
        if (this.f10217j + 1 >= this.f10212e) {
            m13760y();
        }
        C3220i a = m13754a(C3220i.C3221a.ERROR, str);
        int i2 = this.f10208a + 1;
        this.f10208a = i2;
        this.f10217j++;
        a.f10261c = i2;
        a.f10263e = i;
        this.f10220m.f10202d[i2] = a;
        this.f10210c.mo11181b(a);
        return a;
    }

    /* renamed from: p */
    public C3220i mo11221p() {
        C3214e eVar = f10204r;
        if (eVar != null) {
            eVar.f10237n++;
        }
        if (this.f10217j + 1 >= this.f10212e) {
            m13760y();
        }
        C3220i a = m13754a(C3220i.C3221a.SLACK, (String) null);
        int i = this.f10208a + 1;
        this.f10208a = i;
        this.f10217j++;
        a.f10261c = i;
        this.f10220m.f10202d[i] = a;
        return a;
    }

    /* renamed from: q */
    public C3220i mo11222q(Object obj) {
        C3220i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f10217j + 1 >= this.f10212e) {
            m13760y();
        }
        if (obj instanceof C3226d) {
            C3226d dVar = (C3226d) obj;
            iVar = dVar.mo11264e();
            if (iVar == null) {
                dVar.mo11271l(this.f10220m);
                iVar = dVar.mo11264e();
            }
            int i = iVar.f10261c;
            if (i == -1 || i > this.f10208a || this.f10220m.f10202d[i] == null) {
                if (iVar.f10261c != -1) {
                    iVar.mo11242d();
                }
                int i2 = this.f10208a + 1;
                this.f10208a = i2;
                this.f10217j++;
                iVar.f10261c = i2;
                iVar.f10268j = C3220i.C3221a.UNRESTRICTED;
                this.f10220m.f10202d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public C3208b mo11223r() {
        C3208b bVar;
        if (f10205s) {
            bVar = this.f10220m.f10199a.mo11229b();
            if (bVar == null) {
                bVar = new C3213b(this, this.f10220m);
                f10207u++;
                C3220i.m13803b();
                return bVar;
            }
        } else {
            bVar = this.f10220m.f10200b.mo11229b();
            if (bVar == null) {
                bVar = new C3208b(this.f10220m);
                f10206t++;
                C3220i.m13803b();
                return bVar;
            }
        }
        bVar.mo11206z();
        C3220i.m13803b();
        return bVar;
    }

    /* renamed from: t */
    public C3220i mo11224t() {
        C3214e eVar = f10204r;
        if (eVar != null) {
            eVar.f10236m++;
        }
        if (this.f10217j + 1 >= this.f10212e) {
            m13760y();
        }
        C3220i a = m13754a(C3220i.C3221a.SLACK, (String) null);
        int i = this.f10208a + 1;
        this.f10208a = i;
        this.f10217j++;
        a.f10261c = i;
        this.f10220m.f10202d[i] = a;
        return a;
    }

    /* renamed from: v */
    public C3210c mo11225v() {
        return this.f10220m;
    }

    /* renamed from: x */
    public int mo11226x(Object obj) {
        C3220i e = ((C3226d) obj).mo11264e();
        if (e != null) {
            return (int) (e.f10264f + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void mo11227z() throws Exception {
        C3214e eVar = f10204r;
        if (eVar != null) {
            eVar.f10228e++;
        }
        if (this.f10214g || this.f10215h) {
            C3214e eVar2 = f10204r;
            if (eVar2 != null) {
                eVar2.f10240q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f10218k) {
                    z = true;
                    break;
                } else if (!this.f10213f[i].f10198f) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                C3214e eVar3 = f10204r;
                if (eVar3 != null) {
                    eVar3.f10239p++;
                }
                m13756n();
                return;
            }
        }
        mo11207A(this.f10210c);
    }
}
