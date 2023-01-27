package p148g.p189d.p190a.p200b;

import android.util.Log;
import p148g.p189d.p190a.p200b.p217n0.C4111a;
import p148g.p189d.p190a.p200b.p217n0.C4113b;
import p148g.p189d.p190a.p200b.p217n0.C4124e;
import p148g.p189d.p190a.p200b.p217n0.C4126f;
import p148g.p189d.p190a.p200b.p217n0.C4141j;
import p148g.p189d.p190a.p200b.p228p0.C4229e;
import p148g.p189d.p190a.p200b.p228p0.C4231f;
import p148g.p189d.p190a.p200b.p228p0.C4232g;
import p148g.p189d.p190a.p200b.p228p0.C4234h;
import p148g.p189d.p190a.p200b.p229q0.C4237b;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.r */
final class C4259r {

    /* renamed from: a */
    public final C4124e f13593a;

    /* renamed from: b */
    public final Object f13594b;

    /* renamed from: c */
    public final C4141j[] f13595c;

    /* renamed from: d */
    public final boolean[] f13596d;

    /* renamed from: e */
    public long f13597e;

    /* renamed from: f */
    public boolean f13598f;

    /* renamed from: g */
    public boolean f13599g;

    /* renamed from: h */
    public C4287s f13600h;

    /* renamed from: i */
    public C4259r f13601i;

    /* renamed from: j */
    public C4234h f13602j;

    /* renamed from: k */
    private final C3831b0[] f13603k;

    /* renamed from: l */
    private final C4232g f13604l;

    /* renamed from: m */
    private final C4126f f13605m;

    /* renamed from: n */
    private C4234h f13606n;

    public C4259r(C3831b0[] b0VarArr, long j, C4232g gVar, C4237b bVar, C4126f fVar, Object obj, C4287s sVar) {
        this.f13603k = b0VarArr;
        this.f13597e = j - sVar.f13667b;
        this.f13604l = gVar;
        this.f13605m = fVar;
        C4260a.m18073e(obj);
        this.f13594b = obj;
        this.f13600h = sVar;
        this.f13595c = new C4141j[b0VarArr.length];
        this.f13596d = new boolean[b0VarArr.length];
        C4124e a = fVar.mo13113a(sVar.f13666a, bVar);
        if (sVar.f13668c != Long.MIN_VALUE) {
            C4111a aVar = new C4111a(a, true);
            aVar.mo13078k(0, sVar.f13668c);
            a = aVar;
        }
        this.f13593a = a;
    }

    /* renamed from: c */
    private void m18051c(C4141j[] jVarArr) {
        int i = 0;
        while (true) {
            C3831b0[] b0VarArr = this.f13603k;
            if (i < b0VarArr.length) {
                if (b0VarArr[i].mo12416i() == 5 && this.f13602j.f13533b[i]) {
                    jVarArr[i] = new C4113b();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private void m18052e(C4234h hVar) {
        int i = 0;
        while (true) {
            boolean[] zArr = hVar.f13533b;
            if (i < zArr.length) {
                boolean z = zArr[i];
                C4229e a = hVar.f13534c.mo13357a(i);
                if (z && a != null) {
                    a.mo13332f();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private void m18053f(C4141j[] jVarArr) {
        int i = 0;
        while (true) {
            C3831b0[] b0VarArr = this.f13603k;
            if (i < b0VarArr.length) {
                if (b0VarArr[i].mo12416i() == 5) {
                    jVarArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    private void m18054g(C4234h hVar) {
        int i = 0;
        while (true) {
            boolean[] zArr = hVar.f13533b;
            if (i < zArr.length) {
                boolean z = zArr[i];
                C4229e a = hVar.f13534c.mo13357a(i);
                if (z && a != null) {
                    a.mo13327b();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private void m18055r(C4234h hVar) {
        C4234h hVar2 = this.f13606n;
        if (hVar2 != null) {
            m18052e(hVar2);
        }
        this.f13606n = hVar;
        if (hVar != null) {
            m18054g(hVar);
        }
    }

    /* renamed from: a */
    public long mo13398a(long j, boolean z) {
        return mo13399b(j, z, new boolean[this.f13603k.length]);
    }

    /* renamed from: b */
    public long mo13399b(long j, boolean z, boolean[] zArr) {
        C4231f fVar = this.f13602j.f13534c;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= fVar.f13529a) {
                break;
            }
            boolean[] zArr2 = this.f13596d;
            if (z || !this.f13602j.mo13363b(this.f13606n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m18053f(this.f13595c);
        m18055r(this.f13602j);
        long f = this.f13593a.mo13073f(fVar.mo13358b(), this.f13596d, this.f13595c, zArr, j);
        m18051c(this.f13595c);
        this.f13599g = false;
        int i2 = 0;
        while (true) {
            C4141j[] jVarArr = this.f13595c;
            if (i2 >= jVarArr.length) {
                return f;
            }
            if (jVarArr[i2] != null) {
                C4260a.m18074f(this.f13602j.f13533b[i2]);
                if (this.f13603k[i2].mo12416i() != 5) {
                    this.f13599g = true;
                }
            } else {
                C4260a.m18074f(fVar.mo13357a(i2) == null);
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void mo13400d(long j) {
        this.f13593a.mo13084s(mo13409p(j));
    }

    /* renamed from: h */
    public long mo13401h(boolean z) {
        if (!this.f13598f) {
            return this.f13600h.f13667b;
        }
        long o = this.f13593a.mo13080o();
        return (o != Long.MIN_VALUE || !z) ? o : this.f13600h.f13670e;
    }

    /* renamed from: i */
    public long mo13402i() {
        if (!this.f13598f) {
            return 0;
        }
        return this.f13593a.mo13075h();
    }

    /* renamed from: j */
    public long mo13403j() {
        return this.f13597e;
    }

    /* renamed from: k */
    public C4234h mo13404k(float f) throws C3848h {
        this.f13598f = true;
        mo13408o(f);
        long a = mo13398a(this.f13600h.f13667b, false);
        long j = this.f13597e;
        C4287s sVar = this.f13600h;
        this.f13597e = j + (sVar.f13667b - a);
        this.f13600h = sVar.mo13506b(a);
        return this.f13602j;
    }

    /* renamed from: l */
    public boolean mo13405l() {
        return this.f13598f && (!this.f13599g || this.f13593a.mo13080o() == Long.MIN_VALUE);
    }

    /* renamed from: m */
    public void mo13406m(long j) {
        if (this.f13598f) {
            this.f13593a.mo13085t(mo13409p(j));
        }
    }

    /* renamed from: n */
    public void mo13407n() {
        C4126f fVar;
        C4124e eVar;
        m18055r((C4234h) null);
        try {
            if (this.f13600h.f13668c != Long.MIN_VALUE) {
                fVar = this.f13605m;
                eVar = ((C4111a) this.f13593a).f12965f;
            } else {
                fVar = this.f13605m;
                eVar = this.f13593a;
            }
            fVar.mo13115c(eVar);
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: o */
    public boolean mo13408o(float f) throws C3848h {
        C4234h c = this.f13604l.mo13353c(this.f13603k, this.f13593a.mo13079l());
        if (c.mo13362a(this.f13606n)) {
            return false;
        }
        this.f13602j = c;
        for (C4229e eVar : c.f13534c.mo13358b()) {
            if (eVar != null) {
                eVar.mo13333h(f);
            }
        }
        return true;
    }

    /* renamed from: p */
    public long mo13409p(long j) {
        return j - mo13403j();
    }

    /* renamed from: q */
    public long mo13410q(long j) {
        return j + mo13403j();
    }
}
