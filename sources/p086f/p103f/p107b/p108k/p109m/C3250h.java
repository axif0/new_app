package p086f.p103f.p107b.p108k.p109m;

import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.C3233g;

/* renamed from: f.f.b.k.m.h */
class C3250h extends C3257m {
    public C3250h(C3229e eVar) {
        super(eVar);
        eVar.f10365d.mo11391f();
        eVar.f10367e.mo11391f();
        this.f10482f = ((C3233g) eVar).mo11370H0();
    }

    /* renamed from: q */
    private void m14026q(C3247f fVar) {
        this.f10484h.f10456k.add(fVar);
        fVar.f10457l.add(this.f10484h);
    }

    /* renamed from: a */
    public void mo11388a(C3245d dVar) {
        C3247f fVar = this.f10484h;
        if (fVar.f10448c && !fVar.f10455j) {
            this.f10484h.mo11406d((int) ((((float) fVar.f10457l.get(0).f10452g) * ((C3233g) this.f10478b).mo11373K0()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11389d() {
        C3257m mVar;
        C3247f fVar;
        C3247f fVar2;
        C3233g gVar = (C3233g) this.f10478b;
        int I0 = gVar.mo11371I0();
        int J0 = gVar.mo11372J0();
        gVar.mo11373K0();
        if (gVar.mo11370H0() == 1) {
            C3247f fVar3 = this.f10484h;
            if (I0 != -1) {
                fVar3.f10457l.add(this.f10478b.f10343K.f10365d.f10484h);
                this.f10478b.f10343K.f10365d.f10484h.f10456k.add(this.f10484h);
                fVar2 = this.f10484h;
            } else if (J0 != -1) {
                fVar3.f10457l.add(this.f10478b.f10343K.f10365d.f10485i);
                this.f10478b.f10343K.f10365d.f10485i.f10456k.add(this.f10484h);
                fVar2 = this.f10484h;
                I0 = -J0;
            } else {
                fVar3.f10447b = true;
                fVar3.f10457l.add(this.f10478b.f10343K.f10365d.f10485i);
                this.f10478b.f10343K.f10365d.f10485i.f10456k.add(this.f10484h);
                m14026q(this.f10478b.f10365d.f10484h);
                mVar = this.f10478b.f10365d;
            }
            fVar2.f10451f = I0;
            m14026q(this.f10478b.f10365d.f10484h);
            mVar = this.f10478b.f10365d;
        } else {
            C3247f fVar4 = this.f10484h;
            if (I0 != -1) {
                fVar4.f10457l.add(this.f10478b.f10343K.f10367e.f10484h);
                this.f10478b.f10343K.f10367e.f10484h.f10456k.add(this.f10484h);
                fVar = this.f10484h;
            } else if (J0 != -1) {
                fVar4.f10457l.add(this.f10478b.f10343K.f10367e.f10485i);
                this.f10478b.f10343K.f10367e.f10485i.f10456k.add(this.f10484h);
                fVar = this.f10484h;
                I0 = -J0;
            } else {
                fVar4.f10447b = true;
                fVar4.f10457l.add(this.f10478b.f10343K.f10367e.f10485i);
                this.f10478b.f10343K.f10367e.f10485i.f10456k.add(this.f10484h);
                m14026q(this.f10478b.f10367e.f10484h);
                mVar = this.f10478b.f10367e;
            }
            fVar.f10451f = I0;
            m14026q(this.f10478b.f10367e.f10484h);
            mVar = this.f10478b.f10367e;
        }
        m14026q(mVar.f10485i);
    }

    /* renamed from: e */
    public void mo11390e() {
        if (((C3233g) this.f10478b).mo11370H0() == 1) {
            this.f10478b.mo11278C0(this.f10484h.f10452g);
        } else {
            this.f10478b.mo11280D0(this.f10484h.f10452g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11391f() {
        this.f10484h.mo11405c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo11393m() {
        return false;
    }
}
