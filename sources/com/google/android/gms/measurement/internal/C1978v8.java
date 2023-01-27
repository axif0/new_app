package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
final class C1978v8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1961u3 f6474f;

    /* renamed from: g */
    private final /* synthetic */ C1990w8 f6475g;

    C1978v8(C1990w8 w8Var, C1961u3 u3Var) {
        this.f6475g = w8Var;
        this.f6474f = u3Var;
    }

    public final void run() {
        synchronized (this.f6475g) {
            boolean unused = this.f6475g.f6494a = false;
            if (!this.f6475g.f6496c.mo6792V()) {
                this.f6475g.f6496c.mo6709i().mo6772M().mo6885a("Connected to service");
                this.f6475g.f6496c.mo6783K(this.f6474f);
            }
        }
    }
}
