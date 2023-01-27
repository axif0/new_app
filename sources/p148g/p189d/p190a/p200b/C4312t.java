package p148g.p189d.p190a.p200b;

import android.util.Pair;
import p148g.p189d.p190a.p200b.C3844g0;
import p148g.p189d.p190a.p200b.p217n0.C4124e;
import p148g.p189d.p190a.p200b.p217n0.C4126f;
import p148g.p189d.p190a.p200b.p228p0.C4232g;
import p148g.p189d.p190a.p200b.p228p0.C4234h;
import p148g.p189d.p190a.p200b.p229q0.C4237b;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.t */
final class C4312t {

    /* renamed from: a */
    private final C3844g0.C3846b f13780a = new C3844g0.C3846b();

    /* renamed from: b */
    private final C3844g0.C3847c f13781b = new C3844g0.C3847c();

    /* renamed from: c */
    private long f13782c;

    /* renamed from: d */
    private C3844g0 f13783d;

    /* renamed from: e */
    private int f13784e;

    /* renamed from: f */
    private boolean f13785f;

    /* renamed from: g */
    private C4259r f13786g;

    /* renamed from: h */
    private C4259r f13787h;

    /* renamed from: i */
    private C4259r f13788i;

    /* renamed from: j */
    private int f13789j;

    /* renamed from: A */
    private long m18368A(int i) {
        Object obj = this.f13783d.mo12537g(i, this.f13780a, true).f11574b;
        for (C4259r h = mo13569h(); h != null; h = h.f13601i) {
            if (h.f13594b.equals(obj)) {
                return h.f13600h.f13666a.f13048d;
            }
        }
        int i2 = this.f13780a.f11575c;
        for (C4259r h2 = mo13569h(); h2 != null; h2 = h2.f13601i) {
            int b = this.f13783d.mo12532b(h2.f13594b);
            if (b != -1 && this.f13783d.mo12536f(b, this.f13780a).f11575c == i2) {
                return h2.f13600h.f13666a.f13048d;
            }
        }
        long j = this.f13782c;
        this.f13782c = 1 + j;
        return j;
    }

    /* renamed from: D */
    private boolean m18369D() {
        C4259r rVar;
        C4259r h = mo13569h();
        if (h == null) {
            return true;
        }
        while (true) {
            int d = this.f13783d.mo12534d(h.f13600h.f13666a.f13045a, this.f13780a, this.f13781b, this.f13784e, this.f13785f);
            while (true) {
                C4259r rVar2 = h.f13601i;
                if (rVar2 != null && !h.f13600h.f13671f) {
                    h = rVar2;
                }
            }
            if (d == -1 || (rVar = h.f13601i) == null || rVar.f13600h.f13666a.f13045a != d) {
                boolean x = mo13579x(h);
                C4287s sVar = h.f13600h;
                h.f13600h = m18376q(sVar, sVar.f13666a);
            } else {
                h = rVar;
            }
        }
        boolean x2 = mo13579x(h);
        C4287s sVar2 = h.f13600h;
        h.f13600h = m18376q(sVar2, sVar2.f13666a);
        return !x2 || !mo13576s();
    }

    /* renamed from: c */
    private boolean m18370c(C4259r rVar, C4287s sVar) {
        C4287s sVar2 = rVar.f13600h;
        return sVar2.f13667b == sVar.f13667b && sVar2.f13668c == sVar.f13668c && sVar2.f13666a.equals(sVar.f13666a);
    }

    /* renamed from: f */
    private C4287s m18371f(C4314v vVar) {
        return m18373j(vVar.f13792c, vVar.f13794e, vVar.f13793d);
    }

    /* renamed from: g */
    private C4287s m18372g(C4259r rVar, long j) {
        long j2;
        int i;
        long j3;
        C4259r rVar2 = rVar;
        C4287s sVar = rVar2.f13600h;
        if (sVar.f13671f) {
            int d = this.f13783d.mo12534d(sVar.f13666a.f13045a, this.f13780a, this.f13781b, this.f13784e, this.f13785f);
            if (d == -1) {
                return null;
            }
            int i2 = this.f13783d.mo12537g(d, this.f13780a, true).f11575c;
            Object obj = this.f13780a.f11574b;
            long j4 = sVar.f13666a.f13048d;
            long j5 = 0;
            if (this.f13783d.mo12542l(i2, this.f13781b).f11582d == d) {
                Pair<Integer, Long> j6 = this.f13783d.mo12540j(this.f13781b, this.f13780a, i2, -9223372036854775807L, Math.max(0, (rVar.mo13403j() + sVar.f13670e) - j));
                if (j6 == null) {
                    return null;
                }
                int intValue = ((Integer) j6.first).intValue();
                long longValue = ((Long) j6.second).longValue();
                C4259r rVar3 = rVar2.f13601i;
                if (rVar3 == null || !rVar3.f13594b.equals(obj)) {
                    j3 = this.f13782c;
                    this.f13782c = 1 + j3;
                } else {
                    j3 = rVar2.f13601i.f13600h.f13666a.f13048d;
                }
                j5 = longValue;
                j2 = j3;
                i = intValue;
            } else {
                i = d;
                j2 = j4;
            }
            long j7 = j5;
            return m18373j(m18379z(i, j7, j2), j7, j5);
        }
        C4126f.C4128b bVar = sVar.f13666a;
        this.f13783d.mo12536f(bVar.f13045a, this.f13780a);
        if (bVar.mo13121b()) {
            int i3 = bVar.f13046b;
            int a = this.f13780a.mo12548a(i3);
            if (a == -1) {
                return null;
            }
            int j8 = this.f13780a.mo12557j(i3, bVar.f13047c);
            if (j8 >= a) {
                return m18375l(bVar.f13045a, sVar.f13669d, bVar.f13048d);
            } else if (!this.f13780a.mo12561n(i3, j8)) {
                return null;
            } else {
                return m18374k(bVar.f13045a, i3, j8, sVar.f13669d, bVar.f13048d);
            }
        } else {
            long j9 = sVar.f13668c;
            if (j9 != Long.MIN_VALUE) {
                int e = this.f13780a.mo12552e(j9);
                if (e == -1) {
                    return m18375l(bVar.f13045a, sVar.f13668c, bVar.f13048d);
                }
                int i4 = this.f13780a.mo12556i(e);
                if (!this.f13780a.mo12561n(e, i4)) {
                    return null;
                }
                return m18374k(bVar.f13045a, e, i4, sVar.f13668c, bVar.f13048d);
            }
            int c = this.f13780a.mo12550c();
            if (c == 0) {
                return null;
            }
            int i5 = c - 1;
            if (this.f13780a.mo12553f(i5) != Long.MIN_VALUE || this.f13780a.mo12560m(i5)) {
                return null;
            }
            int i6 = this.f13780a.mo12556i(i5);
            if (!this.f13780a.mo12561n(i5, i6)) {
                return null;
            }
            return m18374k(bVar.f13045a, i5, i6, this.f13780a.mo12555h(), bVar.f13048d);
        }
    }

    /* renamed from: j */
    private C4287s m18373j(C4126f.C4128b bVar, long j, long j2) {
        this.f13783d.mo12536f(bVar.f13045a, this.f13780a);
        if (!bVar.mo13121b()) {
            return m18375l(bVar.f13045a, j2, bVar.f13048d);
        } else if (!this.f13780a.mo12561n(bVar.f13046b, bVar.f13047c)) {
            return null;
        } else {
            return m18374k(bVar.f13045a, bVar.f13046b, bVar.f13047c, j, bVar.f13048d);
        }
    }

    /* renamed from: k */
    private C4287s m18374k(int i, int i2, int i3, long j, long j2) {
        C4126f.C4128b bVar = new C4126f.C4128b(i, i2, i3, j2);
        boolean t = m18377t(bVar, Long.MIN_VALUE);
        boolean u = m18378u(bVar, t);
        return new C4287s(bVar, i3 == this.f13780a.mo12556i(i2) ? this.f13780a.mo12554g() : 0, Long.MIN_VALUE, j, this.f13783d.mo12536f(bVar.f13045a, this.f13780a).mo12549b(bVar.f13046b, bVar.f13047c), t, u);
    }

    /* renamed from: l */
    private C4287s m18375l(int i, long j, long j2) {
        C4126f.C4128b bVar = new C4126f.C4128b(i, j2);
        this.f13783d.mo12536f(bVar.f13045a, this.f13780a);
        int d = this.f13780a.mo12551d(j);
        long f = d == -1 ? Long.MIN_VALUE : this.f13780a.mo12553f(d);
        boolean t = m18377t(bVar, f);
        return new C4287s(bVar, j, f, -9223372036854775807L, f == Long.MIN_VALUE ? this.f13780a.mo12555h() : f, t, m18378u(bVar, t));
    }

    /* renamed from: q */
    private C4287s m18376q(C4287s sVar, C4126f.C4128b bVar) {
        long j;
        long h;
        long j2 = sVar.f13667b;
        long j3 = sVar.f13668c;
        boolean t = m18377t(bVar, j3);
        boolean u = m18378u(bVar, t);
        this.f13783d.mo12536f(bVar.f13045a, this.f13780a);
        if (bVar.mo13121b()) {
            h = this.f13780a.mo12549b(bVar.f13046b, bVar.f13047c);
        } else if (j3 == Long.MIN_VALUE) {
            h = this.f13780a.mo12555h();
        } else {
            j = j3;
            return new C4287s(bVar, j2, j3, sVar.f13669d, j, t, u);
        }
        j = h;
        return new C4287s(bVar, j2, j3, sVar.f13669d, j, t, u);
    }

    /* renamed from: t */
    private boolean m18377t(C4126f.C4128b bVar, long j) {
        int c = this.f13783d.mo12536f(bVar.f13045a, this.f13780a).mo12550c();
        if (c == 0) {
            return true;
        }
        int i = c - 1;
        boolean b = bVar.mo13121b();
        if (this.f13780a.mo12553f(i) != Long.MIN_VALUE) {
            return !b && j == Long.MIN_VALUE;
        }
        int a = this.f13780a.mo12548a(i);
        if (a == -1) {
            return false;
        }
        if (!(b && bVar.f13046b == i && bVar.f13047c == a + -1)) {
            return !b && this.f13780a.mo12556i(i) == a;
        }
        return true;
    }

    /* renamed from: u */
    private boolean m18378u(C4126f.C4128b bVar, boolean z) {
        return !this.f13783d.mo12542l(this.f13783d.mo12536f(bVar.f13045a, this.f13780a).f11575c, this.f13781b).f11581c && this.f13783d.mo12547q(bVar.f13045a, this.f13780a, this.f13781b, this.f13784e, this.f13785f) && z;
    }

    /* renamed from: z */
    private C4126f.C4128b m18379z(int i, long j, long j2) {
        this.f13783d.mo12536f(i, this.f13780a);
        int e = this.f13780a.mo12552e(j);
        if (e == -1) {
            return new C4126f.C4128b(i, j2);
        }
        return new C4126f.C4128b(i, e, this.f13780a.mo12556i(e), j2);
    }

    /* renamed from: B */
    public void mo13560B(C3844g0 g0Var) {
        this.f13783d = g0Var;
    }

    /* renamed from: C */
    public boolean mo13561C() {
        C4259r rVar = this.f13788i;
        return rVar == null || (!rVar.f13600h.f13672g && rVar.mo13405l() && this.f13788i.f13600h.f13670e != -9223372036854775807L && this.f13789j < 100);
    }

    /* renamed from: E */
    public boolean mo13562E(C4126f.C4128b bVar, long j) {
        int i = bVar.f13045a;
        C4259r rVar = null;
        int i2 = i;
        for (C4259r h = mo13569h(); h != null; h = h.f13601i) {
            if (rVar == null) {
                h.f13600h = mo13574p(h.f13600h, i2);
            } else if (i2 == -1 || !h.f13594b.equals(this.f13783d.mo12537g(i2, this.f13780a, true).f11574b)) {
                return true ^ mo13579x(rVar);
            } else {
                C4287s g = m18372g(rVar, j);
                if (g == null) {
                    return true ^ mo13579x(rVar);
                }
                h.f13600h = mo13574p(h.f13600h, i2);
                if (!m18370c(h, g)) {
                    return true ^ mo13579x(rVar);
                }
            }
            if (h.f13600h.f13671f) {
                i2 = this.f13783d.mo12534d(i2, this.f13780a, this.f13781b, this.f13784e, this.f13785f);
            }
            rVar = h;
        }
        return true;
    }

    /* renamed from: F */
    public boolean mo13563F(int i) {
        this.f13784e = i;
        return m18369D();
    }

    /* renamed from: G */
    public boolean mo13564G(boolean z) {
        this.f13785f = z;
        return m18369D();
    }

    /* renamed from: a */
    public C4259r mo13565a() {
        C4259r rVar = this.f13786g;
        if (rVar != null) {
            if (rVar == this.f13787h) {
                this.f13787h = rVar.f13601i;
            }
            this.f13786g.mo13407n();
            this.f13786g = this.f13786g.f13601i;
            int i = this.f13789j - 1;
            this.f13789j = i;
            if (i == 0) {
                this.f13788i = null;
            }
        } else {
            C4259r rVar2 = this.f13788i;
            this.f13786g = rVar2;
            this.f13787h = rVar2;
        }
        return this.f13786g;
    }

    /* renamed from: b */
    public C4259r mo13566b() {
        C4259r rVar = this.f13787h;
        C4260a.m18074f((rVar == null || rVar.f13601i == null) ? false : true);
        C4259r rVar2 = this.f13787h.f13601i;
        this.f13787h = rVar2;
        return rVar2;
    }

    /* renamed from: d */
    public void mo13567d() {
        C4259r h = mo13569h();
        if (h != null) {
            h.mo13407n();
            mo13579x(h);
        }
        this.f13786g = null;
        this.f13788i = null;
        this.f13787h = null;
        this.f13789j = 0;
    }

    /* renamed from: e */
    public C4124e mo13568e(C3831b0[] b0VarArr, long j, C4232g gVar, C4237b bVar, C4126f fVar, Object obj, C4287s sVar) {
        C4259r rVar = this.f13788i;
        C4259r rVar2 = new C4259r(b0VarArr, rVar == null ? sVar.f13667b + j : rVar.mo13403j() + this.f13788i.f13600h.f13670e, gVar, bVar, fVar, obj, sVar);
        if (this.f13788i != null) {
            C4260a.m18074f(mo13576s());
            this.f13788i.f13601i = rVar2;
        }
        this.f13788i = rVar2;
        this.f13789j++;
        return rVar2.f13593a;
    }

    /* renamed from: h */
    public C4259r mo13569h() {
        return mo13576s() ? this.f13786g : this.f13788i;
    }

    /* renamed from: i */
    public C4259r mo13570i() {
        return this.f13788i;
    }

    /* renamed from: m */
    public C4287s mo13571m(long j, C4314v vVar) {
        C4259r rVar = this.f13788i;
        return rVar == null ? m18371f(vVar) : m18372g(rVar, j);
    }

    /* renamed from: n */
    public C4259r mo13572n() {
        return this.f13786g;
    }

    /* renamed from: o */
    public C4259r mo13573o() {
        return this.f13787h;
    }

    /* renamed from: p */
    public C4287s mo13574p(C4287s sVar, int i) {
        return m18376q(sVar, sVar.f13666a.mo13120a(i));
    }

    /* renamed from: r */
    public C4234h mo13575r(float f) throws C3848h {
        return this.f13788i.mo13404k(f);
    }

    /* renamed from: s */
    public boolean mo13576s() {
        return this.f13786g != null;
    }

    /* renamed from: v */
    public boolean mo13577v(C4124e eVar) {
        C4259r rVar = this.f13788i;
        return rVar != null && rVar.f13593a == eVar;
    }

    /* renamed from: w */
    public void mo13578w(long j) {
        C4259r rVar = this.f13788i;
        if (rVar != null) {
            rVar.mo13406m(j);
        }
    }

    /* renamed from: x */
    public boolean mo13579x(C4259r rVar) {
        boolean z = false;
        C4260a.m18074f(rVar != null);
        this.f13788i = rVar;
        while (true) {
            rVar = rVar.f13601i;
            if (rVar != null) {
                if (rVar == this.f13787h) {
                    this.f13787h = this.f13786g;
                    z = true;
                }
                rVar.mo13407n();
                this.f13789j--;
            } else {
                this.f13788i.f13601i = null;
                return z;
            }
        }
    }

    /* renamed from: y */
    public C4126f.C4128b mo13580y(int i, long j) {
        return m18379z(i, j, m18368A(i));
    }
}
