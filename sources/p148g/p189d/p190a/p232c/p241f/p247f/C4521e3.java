package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.e3 */
public final class C4521e3 {
    /* renamed from: a */
    public static <T> C4539f3<T> m19304a(C4539f3<T> f3Var) {
        return ((f3Var instanceof C4559g3) || (f3Var instanceof C4577h3)) ? f3Var : f3Var instanceof Serializable ? new C4577h3(f3Var) : new C4559g3(f3Var);
    }

    /* renamed from: b */
    public static <T> C4539f3<T> m19305b(@NullableDecl T t) {
        return new C4612j3(t);
    }
}
