package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.j3 */
final class C4612j3<T> implements C4539f3<T>, Serializable {
    @NullableDecl

    /* renamed from: f */
    private final T f14193f;

    C4612j3(@NullableDecl T t) {
        this.f14193f = t;
    }

    /* renamed from: a */
    public final T mo13805a() {
        return this.f14193f;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C4612j3) {
            return C4870y2.m20620a(this.f14193f, ((C4612j3) obj).f14193f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14193f});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14193f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
