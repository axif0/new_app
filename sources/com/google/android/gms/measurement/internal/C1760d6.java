package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
abstract class C1760d6 extends C1724a6 {

    /* renamed from: b */
    private boolean f5731b;

    C1760d6(C1807h5 h5Var) {
        super(h5Var);
        this.f5634a.mo7041k(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo6863m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo6864o() {
        if (!mo6867s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: p */
    public final void mo6865p() {
        if (this.f5731b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo6689r()) {
            this.f5634a.mo7048t();
            this.f5731b = true;
        }
    }

    /* renamed from: q */
    public final void mo6866q() {
        if (!this.f5731b) {
            mo6863m();
            this.f5634a.mo7048t();
            this.f5731b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo6689r();

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo6867s() {
        return this.f5731b;
    }
}
