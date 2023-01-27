package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.c */
final /* synthetic */ class C2582c implements Runnable {

    /* renamed from: f */
    private final C2585f f8332f;

    private C2582c(C2585f fVar) {
        this.f8332f = fVar;
    }

    /* renamed from: a */
    public static Runnable m11493a(C2585f fVar) {
        return new C2582c(fVar);
    }

    public void run() {
        this.f8332f.m11500g(false);
    }
}
