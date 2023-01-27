package com.google.firebase.components;

/* renamed from: com.google.firebase.components.u */
public final class C2533u {
    /* renamed from: a */
    public static void m11339a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m11340b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m11341c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m11342d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
