package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.d */
final /* synthetic */ class C2583d implements Runnable {

    /* renamed from: f */
    private final C2585f f8333f;

    /* renamed from: g */
    private final boolean f8334g;

    private C2583d(C2585f fVar, boolean z) {
        this.f8333f = fVar;
        this.f8334g = z;
    }

    /* renamed from: a */
    public static Runnable m11494a(C2585f fVar, boolean z) {
        return new C2583d(fVar, z);
    }

    public void run() {
        this.f8333f.m11500g(this.f8334g);
    }
}
