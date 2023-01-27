package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: g.d.a.c.f.f.w8 */
final class C4842w8 {

    /* renamed from: c */
    private static final C4842w8 f14612c = new C4842w8();

    /* renamed from: a */
    private final C4490c9 f14613a = new C4858x7();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C4453a9<?>> f14614b = new ConcurrentHashMap();

    private C4842w8() {
    }

    /* renamed from: a */
    public static C4842w8 m20540a() {
        return f14612c;
    }

    /* renamed from: b */
    public final <T> C4453a9<T> mo14699b(Class<T> cls) {
        C4470b7.m18818f(cls, "messageType");
        C4453a9<T> a9Var = (C4453a9) this.f14614b.get(cls);
        if (a9Var != null) {
            return a9Var;
        }
        C4453a9<T> a = this.f14613a.mo13894a(cls);
        C4470b7.m18818f(cls, "messageType");
        C4470b7.m18818f(a, "schema");
        C4453a9<T> putIfAbsent = this.f14614b.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: c */
    public final <T> C4453a9<T> mo14700c(T t) {
        return mo14699b(t.getClass());
    }
}
