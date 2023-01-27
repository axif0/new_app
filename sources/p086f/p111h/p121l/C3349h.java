package p086f.p111h.p121l;

/* renamed from: f.h.l.h */
public final class C3349h {
    /* renamed from: a */
    public static void m14359a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m14360b(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static <T> T m14361c(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: d */
    public static <T> T m14362d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
