package p086f.p103f.p107b.p108k.p109m;

import p086f.p103f.p107b.p108k.C3223a;
import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.p109m.C3247f;

/* renamed from: f.f.b.k.m.i */
class C3251i extends C3257m {
    public C3251i(C3229e eVar) {
        super(eVar);
    }

    /* renamed from: q */
    private void m14032q(C3247f fVar) {
        this.f10484h.f10456k.add(fVar);
        fVar.f10457l.add(this.f10484h);
    }

    /* renamed from: a */
    public void mo11388a(C3245d dVar) {
        C3223a aVar = (C3223a) this.f10478b;
        int I0 = aVar.mo11250I0();
        int i = 0;
        int i2 = -1;
        for (C3247f fVar : this.f10484h.f10457l) {
            int i3 = fVar.f10452g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (I0 == 0 || I0 == 2) {
            this.f10484h.mo11406d(i2 + aVar.mo11251J0());
        } else {
            this.f10484h.mo11406d(i + aVar.mo11251J0());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11389d() {
        C3257m mVar;
        C3229e eVar = this.f10478b;
        if (eVar instanceof C3223a) {
            this.f10484h.f10447b = true;
            C3223a aVar = (C3223a) eVar;
            int I0 = aVar.mo11250I0();
            boolean H0 = aVar.mo11249H0();
            int i = 0;
            if (I0 == 0) {
                this.f10484h.f10450e = C3247f.C3248a.LEFT;
                while (i < aVar.f10419h0) {
                    C3229e eVar2 = aVar.f10418g0[i];
                    if (H0 || eVar2.mo11292M() != 8) {
                        C3247f fVar = eVar2.f10365d.f10484h;
                        fVar.f10456k.add(this.f10484h);
                        this.f10484h.f10457l.add(fVar);
                    }
                    i++;
                }
            } else if (I0 != 1) {
                if (I0 == 2) {
                    this.f10484h.f10450e = C3247f.C3248a.TOP;
                    while (i < aVar.f10419h0) {
                        C3229e eVar3 = aVar.f10418g0[i];
                        if (H0 || eVar3.mo11292M() != 8) {
                            C3247f fVar2 = eVar3.f10367e.f10484h;
                            fVar2.f10456k.add(this.f10484h);
                            this.f10484h.f10457l.add(fVar2);
                        }
                        i++;
                    }
                } else if (I0 == 3) {
                    this.f10484h.f10450e = C3247f.C3248a.BOTTOM;
                    while (i < aVar.f10419h0) {
                        C3229e eVar4 = aVar.f10418g0[i];
                        if (H0 || eVar4.mo11292M() != 8) {
                            C3247f fVar3 = eVar4.f10367e.f10485i;
                            fVar3.f10456k.add(this.f10484h);
                            this.f10484h.f10457l.add(fVar3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                m14032q(this.f10478b.f10367e.f10484h);
                mVar = this.f10478b.f10367e;
                m14032q(mVar.f10485i);
            } else {
                this.f10484h.f10450e = C3247f.C3248a.RIGHT;
                while (i < aVar.f10419h0) {
                    C3229e eVar5 = aVar.f10418g0[i];
                    if (H0 || eVar5.mo11292M() != 8) {
                        C3247f fVar4 = eVar5.f10365d.f10485i;
                        fVar4.f10456k.add(this.f10484h);
                        this.f10484h.f10457l.add(fVar4);
                    }
                    i++;
                }
            }
            m14032q(this.f10478b.f10365d.f10484h);
            mVar = this.f10478b.f10365d;
            m14032q(mVar.f10485i);
        }
    }

    /* renamed from: e */
    public void mo11390e() {
        C3229e eVar = this.f10478b;
        if (eVar instanceof C3223a) {
            int I0 = ((C3223a) eVar).mo11250I0();
            if (I0 == 0 || I0 == 1) {
                this.f10478b.mo11278C0(this.f10484h.f10452g);
            } else {
                this.f10478b.mo11280D0(this.f10484h.f10452g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11391f() {
        this.f10479c = null;
        this.f10484h.mo11405c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo11393m() {
        return false;
    }
}
