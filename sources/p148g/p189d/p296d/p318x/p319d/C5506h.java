package p148g.p189d.p296d.p318x.p319d;

import p148g.p189d.p296d.C5383o;

/* renamed from: g.d.d.x.d.h */
final class C5506h extends C5505g {

    /* renamed from: c */
    private final boolean f15937c;

    C5506h(C5499c cVar, boolean z) {
        super(cVar);
        this.f15937c = z;
    }

    /* renamed from: h */
    private void m22747h(C5497a aVar) {
        C5499c a = mo15876a();
        C5383o h = this.f15937c ? a.mo15854h() : a.mo15855i();
        C5383o b = this.f15937c ? a.mo15848b() : a.mo15849c();
        int e = mo15880e((int) b.mo15619d());
        C5500d[] d = mo15879d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = mo15880e((int) h.mo15619d()); e2 < e; e2++) {
            if (d[e2] != null) {
                C5500d dVar = d[e2];
                dVar.mo15865j();
                int c = dVar.mo15858c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (dVar.mo15858c() >= aVar.mo15842c()) {
                        d[e2] = null;
                    }
                    i = dVar.mo15858c();
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m22748l(C5500d[] dVarArr, C5497a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C5500d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo15860e() % 30;
                int c = dVar.mo15858c();
                if (c > aVar.mo15842c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f15937c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo15840a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo15841b() || e % 3 != aVar.mo15843d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo15844e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m22749m() {
        for (C5500d dVar : mo15879d()) {
            if (dVar != null) {
                dVar.mo15865j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo15883g(C5497a aVar) {
        C5500d[] d = mo15879d();
        m22749m();
        m22748l(d, aVar);
        C5499c a = mo15876a();
        C5383o h = this.f15937c ? a.mo15854h() : a.mo15855i();
        C5383o b = this.f15937c ? a.mo15848b() : a.mo15849c();
        int e = mo15880e((int) h.mo15619d());
        int e2 = mo15880e((int) b.mo15619d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (e < e2) {
            if (d[e] != null) {
                C5500d dVar = d[e];
                int c = dVar.mo15858c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (c < 0 || dVar.mo15858c() >= aVar.mo15842c() || c > e) {
                        d[e] = null;
                    } else {
                        if (i3 > 2) {
                            c *= i3 - 2;
                        }
                        boolean z = c >= e;
                        for (int i4 = 1; i4 <= c && !z; i4++) {
                            z = d[e - i4] != null;
                        }
                        if (z) {
                            d[e] = null;
                        }
                    }
                    i = dVar.mo15858c();
                    i2 = 1;
                }
            }
            e++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C5497a mo15884i() {
        C5500d[] d = mo15879d();
        C5498b bVar = new C5498b();
        C5498b bVar2 = new C5498b();
        C5498b bVar3 = new C5498b();
        C5498b bVar4 = new C5498b();
        for (C5500d dVar : d) {
            if (dVar != null) {
                dVar.mo15865j();
                int e = dVar.mo15860e() % 30;
                int c = dVar.mo15858c();
                if (!this.f15937c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo15846b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo15846b(e / 3);
                    bVar3.mo15846b(e % 3);
                } else if (i == 2) {
                    bVar.mo15846b(e + 1);
                }
            }
        }
        if (bVar.mo15845a().length == 0 || bVar2.mo15845a().length == 0 || bVar3.mo15845a().length == 0 || bVar4.mo15845a().length == 0 || bVar.mo15845a()[0] <= 0 || bVar2.mo15845a()[0] + bVar3.mo15845a()[0] < 3 || bVar2.mo15845a()[0] + bVar3.mo15845a()[0] > 90) {
            return null;
        }
        C5497a aVar = new C5497a(bVar.mo15845a()[0], bVar2.mo15845a()[0], bVar3.mo15845a()[0], bVar4.mo15845a()[0]);
        m22748l(d, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo15885j() {
        int c;
        C5497a i = mo15884i();
        if (i == null) {
            return null;
        }
        m22747h(i);
        int c2 = i.mo15842c();
        int[] iArr = new int[c2];
        for (C5500d dVar : mo15879d()) {
            if (dVar != null && (c = dVar.mo15858c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo15886k() {
        return this.f15937c;
    }

    public String toString() {
        return "IsLeft: " + this.f15937c + 10 + super.toString();
    }
}
