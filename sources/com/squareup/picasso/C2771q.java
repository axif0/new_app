package com.squareup.picasso;

/* renamed from: com.squareup.picasso.q */
public enum C2771q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: f */
    final int f8849f;

    private C2771q(int i) {
        this.f8849f = i;
    }

    /* renamed from: e */
    public static boolean m12213e(int i) {
        return (i & OFFLINE.f8849f) != 0;
    }

    /* renamed from: g */
    public static boolean m12214g(int i) {
        return (i & NO_CACHE.f8849f) == 0;
    }

    /* renamed from: h */
    public static boolean m12215h(int i) {
        return (i & NO_STORE.f8849f) == 0;
    }
}
