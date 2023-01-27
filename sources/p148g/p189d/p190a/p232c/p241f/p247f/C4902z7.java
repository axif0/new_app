package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.z7 */
final class C4902z7 implements C4599i8 {

    /* renamed from: a */
    private C4599i8[] f14692a;

    C4902z7(C4599i8... i8VarArr) {
        this.f14692a = i8VarArr;
    }

    /* renamed from: a */
    public final boolean mo13793a(Class<?> cls) {
        for (C4599i8 a : this.f14692a) {
            if (a.mo13793a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C4619j8 mo13794b(Class<?> cls) {
        for (C4599i8 i8Var : this.f14692a) {
            if (i8Var.mo13793a(cls)) {
                return i8Var.mo13794b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
