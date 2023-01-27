package p335h.p336a;

/* renamed from: h.a.d */
public final class C5601d {
    /* renamed from: a */
    public static <T> void m23198a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m23199b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m23200c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
