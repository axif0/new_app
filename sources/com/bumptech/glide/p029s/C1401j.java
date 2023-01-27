package com.bumptech.glide.p029s;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.bumptech.glide.s.j */
public final class C1401j {
    /* renamed from: a */
    public static void m6969a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m6970b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m6971c(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static <T> T m6972d(T t) {
        m6973e(t, "Argument must not be null");
        return t;
    }

    /* renamed from: e */
    public static <T> T m6973e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
