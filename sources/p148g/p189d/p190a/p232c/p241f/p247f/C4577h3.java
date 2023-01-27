package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.h3 */
final class C4577h3<T> implements C4539f3<T>, Serializable {

    /* renamed from: f */
    private final C4539f3<T> f14160f;

    /* renamed from: g */
    private volatile transient boolean f14161g;
    @NullableDecl

    /* renamed from: h */
    private transient T f14162h;

    C4577h3(C4539f3<T> f3Var) {
        C4447a3.m18701b(f3Var);
        this.f14160f = f3Var;
    }

    /* renamed from: a */
    public final T mo13805a() {
        if (!this.f14161g) {
            synchronized (this) {
                if (!this.f14161g) {
                    T a = this.f14160f.mo13805a();
                    this.f14162h = a;
                    this.f14161g = true;
                    return a;
                }
            }
        }
        return this.f14162h;
    }

    public final String toString() {
        Object obj;
        if (this.f14161g) {
            String valueOf = String.valueOf(this.f14162h);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f14160f;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
