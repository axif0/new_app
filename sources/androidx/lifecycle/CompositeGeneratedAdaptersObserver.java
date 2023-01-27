package androidx.lifecycle;

import androidx.lifecycle.C0710e;

class CompositeGeneratedAdaptersObserver implements C0715g {

    /* renamed from: a */
    private final C0709d[] f2923a;

    CompositeGeneratedAdaptersObserver(C0709d[] dVarArr) {
        this.f2923a = dVarArr;
    }

    /* renamed from: d */
    public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
        C0723m mVar = new C0723m();
        for (C0709d a : this.f2923a) {
            a.mo3666a(iVar, aVar, false, mVar);
        }
        for (C0709d a2 : this.f2923a) {
            a2.mo3666a(iVar, aVar, true, mVar);
        }
    }
}
