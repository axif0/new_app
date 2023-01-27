package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.p6 */
final class C4725p6 {

    /* renamed from: a */
    private static final C4709o6<?> f14382a = new C4741q6();

    /* renamed from: b */
    private static final C4709o6<?> f14383b = m20114c();

    /* renamed from: a */
    static C4709o6<?> m20112a() {
        return f14382a;
    }

    /* renamed from: b */
    static C4709o6<?> m20113b() {
        C4709o6<?> o6Var = f14383b;
        if (o6Var != null) {
            return o6Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static C4709o6<?> m20114c() {
        try {
            return (C4709o6) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
