package p335h.p336a;

/* renamed from: h.a.c */
public final class C5600c<T> implements C5599b<T> {

    /* renamed from: a */
    private final T f16174a;

    private C5600c(T t) {
        this.f16174a = t;
    }

    /* renamed from: a */
    public static <T> C5599b<T> m23197a(T t) {
        C5601d.m23200c(t, "instance cannot be null");
        return new C5600c(t);
    }

    public T get() {
        return this.f16174a;
    }
}
