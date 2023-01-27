package com.google.firebase.installations;

import com.google.firebase.installations.C2594l;
import com.google.firebase.installations.p045p.C2605d;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: com.google.firebase.installations.j */
class C2592j implements C2597n {

    /* renamed from: a */
    private final C2598o f8357a;

    /* renamed from: b */
    private final C4941i<C2594l> f8358b;

    public C2592j(C2598o oVar, C4941i<C2594l> iVar) {
        this.f8357a = oVar;
        this.f8358b = iVar;
    }

    /* renamed from: a */
    public boolean mo9501a(C2605d dVar, Exception exc) {
        if (!dVar.mo9529i() && !dVar.mo9530j() && !dVar.mo9532l()) {
            return false;
        }
        this.f8358b.mo14886d(exc);
        return true;
    }

    /* renamed from: b */
    public boolean mo9502b(C2605d dVar) {
        if (!dVar.mo9531k() || this.f8357a.mo9505b(dVar)) {
            return false;
        }
        C4941i<C2594l> iVar = this.f8358b;
        C2594l.C2595a a = C2594l.m11530a();
        a.mo9488b(dVar.mo9506b());
        a.mo9490d(dVar.mo9507c());
        a.mo9489c(dVar.mo9513h());
        iVar.mo14885c(a.mo9487a());
        return true;
    }
}
