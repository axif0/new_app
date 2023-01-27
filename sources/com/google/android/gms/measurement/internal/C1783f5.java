package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
abstract class C1783f5 extends C1756d2 {

    /* renamed from: b */
    private boolean f5817b;

    C1783f5(C1807h5 h5Var) {
        super(h5Var);
        this.f5634a.mo7040d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo6963A() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo6964v() {
        return this.f5817b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo6965w() {
        if (!mo6964v()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: x */
    public final void mo6966x() {
        if (this.f5817b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo6801z()) {
            this.f5634a.mo7048t();
            this.f5817b = true;
        }
    }

    /* renamed from: y */
    public final void mo6967y() {
        if (!this.f5817b) {
            mo6963A();
            this.f5634a.mo7048t();
            this.f5817b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract boolean mo6801z();
}
