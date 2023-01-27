package com.google.android.youtube.player.p042f;

import android.text.TextUtils;

/* renamed from: com.google.android.youtube.player.f.c */
public final class C2463c {
    /* renamed from: a */
    public static <T> T m11153a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: b */
    public static <T> T m11154b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: c */
    public static String m11155c(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: d */
    public static void m11156d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
