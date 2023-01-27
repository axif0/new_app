package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
final class C2002x8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1961u3 f6516f;

    /* renamed from: g */
    private final /* synthetic */ C1990w8 f6517g;

    C2002x8(C1990w8 w8Var, C1961u3 u3Var) {
        this.f6517g = w8Var;
        this.f6516f = u3Var;
    }

    public final void run() {
        synchronized (this.f6517g) {
            boolean unused = this.f6517g.f6494a = false;
            if (!this.f6517g.f6496c.mo6792V()) {
                this.f6517g.f6496c.mo6709i().mo6771L().mo6885a("Connected to remote service");
                this.f6517g.f6496c.mo6783K(this.f6516f);
            }
        }
    }
}
