package p148g.p189d.p190a.p200b.p230r0;

import android.text.TextUtils;

/* renamed from: g.d.a.b.r0.a */
public final class C4260a {
    /* renamed from: a */
    public static void m18069a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m18070b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m18071c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: d */
    public static String m18072d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static <T> T m18073e(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: f */
    public static void m18074f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: g */
    public static void m18075g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
