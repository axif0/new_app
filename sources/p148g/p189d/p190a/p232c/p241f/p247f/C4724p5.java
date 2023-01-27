package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.p5 */
final class C4724p5 {

    /* renamed from: a */
    private static final Class<?> f14380a = m20109a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f14381b = (m20109a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m20109a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m20110b() {
        return f14380a != null && !f14381b;
    }

    /* renamed from: c */
    static Class<?> m20111c() {
        return f14380a;
    }
}
