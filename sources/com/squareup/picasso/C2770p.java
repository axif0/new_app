package com.squareup.picasso;

/* renamed from: com.squareup.picasso.p */
public enum C2770p {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: f */
    final int f8844f;

    private C2770p(int i) {
        this.f8844f = i;
    }

    /* renamed from: e */
    static boolean m12211e(int i) {
        return (i & NO_CACHE.f8844f) == 0;
    }

    /* renamed from: g */
    static boolean m12212g(int i) {
        return (i & NO_STORE.f8844f) == 0;
    }
}
