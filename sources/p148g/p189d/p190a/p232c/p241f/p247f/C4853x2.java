package p148g.p189d.p190a.p232c.p241f.p247f;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.x2 */
final class C4853x2<T> extends C4465b3<T> {

    /* renamed from: f */
    static final C4853x2<Object> f14626f = new C4853x2<>();

    private C4853x2() {
    }

    /* renamed from: b */
    public final boolean mo13836b() {
        return false;
    }

    /* renamed from: c */
    public final T mo13837c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
