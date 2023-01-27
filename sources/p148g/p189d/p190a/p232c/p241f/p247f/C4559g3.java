package p148g.p189d.p190a.p232c.p241f.p247f;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.g3 */
final class C4559g3<T> implements C4539f3<T> {

    /* renamed from: f */
    private volatile C4539f3<T> f14138f;

    /* renamed from: g */
    private volatile boolean f14139g;
    @NullableDecl

    /* renamed from: h */
    private T f14140h;

    C4559g3(C4539f3<T> f3Var) {
        C4447a3.m18701b(f3Var);
        this.f14138f = f3Var;
    }

    /* renamed from: a */
    public final T mo13805a() {
        if (!this.f14139g) {
            synchronized (this) {
                if (!this.f14139g) {
                    T a = this.f14138f.mo13805a();
                    this.f14140h = a;
                    this.f14139g = true;
                    this.f14138f = null;
                    return a;
                }
            }
        }
        return this.f14140h;
    }

    public final String toString() {
        Object obj = this.f14138f;
        if (obj == null) {
            String valueOf = String.valueOf(this.f14140h);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
