package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
abstract class C1967u9 extends C1979v9 {

    /* renamed from: c */
    private boolean f6433c;

    C1967u9(C2003x9 x9Var) {
        super(x9Var);
        this.f6476b.mo7462s(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo7365q() {
        return this.f6433c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo7366r() {
        if (!mo7365q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: s */
    public final void mo7367s() {
        if (!this.f6433c) {
            mo6730t();
            this.f6476b.mo7457j0();
            this.f6433c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo6730t();
}
