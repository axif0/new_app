package p148g.p325e.p327b;

/* renamed from: g.e.b.c */
public abstract class C5590c<T, V> {

    /* renamed from: a */
    private final String f16135a;

    public C5590c(Class<V> cls, String str) {
        this.f16135a = str;
    }

    /* renamed from: a */
    public abstract V mo16005a(T t);

    /* renamed from: b */
    public String mo16068b() {
        return this.f16135a;
    }

    /* renamed from: c */
    public void mo16065c(T t, V v) {
        throw new UnsupportedOperationException("Property " + mo16068b() + " is read-only");
    }
}
