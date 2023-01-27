package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.C1698t;

/* renamed from: com.google.android.gms.common.internal.o */
public final class C1658o {
    /* renamed from: a */
    public static void m7836a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m7837b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m7838c(Handler handler) {
        m7839d(handler, "Must be called on the handler thread");
    }

    /* renamed from: d */
    public static void m7839d(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: e */
    public static void m7840e(String str) {
        if (!C1698t.m7991a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static String m7841f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: g */
    public static String m7842g(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static void m7843h() {
        m7844i("Must not be called on the main application thread");
    }

    /* renamed from: i */
    public static void m7844i(String str) {
        if (C1698t.m7991a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: j */
    public static <T> T m7845j(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: k */
    public static <T> T m7846k(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m7847l(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: m */
    public static void m7848m(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public static void m7849n(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
