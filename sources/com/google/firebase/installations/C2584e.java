package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.e */
final /* synthetic */ class C2584e implements Runnable {

    /* renamed from: f */
    private final C2585f f8335f;

    /* renamed from: g */
    private final boolean f8336g;

    private C2584e(C2585f fVar, boolean z) {
        this.f8335f = fVar;
        this.f8336g = z;
    }

    /* renamed from: a */
    public static Runnable m11495a(C2585f fVar, boolean z) {
        return new C2584e(fVar, z);
    }

    public void run() {
        this.f8335f.m11499e(this.f8336g);
    }
}
