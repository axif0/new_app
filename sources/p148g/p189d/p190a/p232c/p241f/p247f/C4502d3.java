package p148g.p189d.p190a.p232c.p241f.p247f;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.d3 */
final class C4502d3<T> extends C4465b3<T> {

    /* renamed from: f */
    private final T f14027f;

    C4502d3(T t) {
        this.f14027f = t;
    }

    /* renamed from: b */
    public final boolean mo13836b() {
        return true;
    }

    /* renamed from: c */
    public final T mo13837c() {
        return this.f14027f;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C4502d3) {
            return this.f14027f.equals(((C4502d3) obj).f14027f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14027f.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14027f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
