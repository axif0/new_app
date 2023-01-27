package p148g.p189d.p289c.p295z;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p148g.p189d.p289c.p291y.C5253a;
import p148g.p189d.p289c.p291y.C5254b;

/* renamed from: g.d.c.z.a */
public class C5368a<T> {

    /* renamed from: a */
    final Class<? super T> f15506a;

    /* renamed from: b */
    final Type f15507b;

    /* renamed from: c */
    final int f15508c = this.f15507b.hashCode();

    protected C5368a() {
        Type d = m22163d(C5368a.class);
        this.f15507b = d;
        this.f15506a = C5254b.m21872k(d);
    }

    C5368a(Type type) {
        C5253a.m21861b(type);
        Type b = C5254b.m21863b(type);
        this.f15507b = b;
        this.f15506a = C5254b.m21872k(b);
    }

    /* renamed from: a */
    public static <T> C5368a<T> m22161a(Class<T> cls) {
        return new C5368a<>(cls);
    }

    /* renamed from: b */
    public static C5368a<?> m22162b(Type type) {
        return new C5368a<>(type);
    }

    /* renamed from: d */
    static Type m22163d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C5254b.m21863b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: c */
    public final Class<? super T> mo15578c() {
        return this.f15506a;
    }

    /* renamed from: e */
    public final Type mo15579e() {
        return this.f15507b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5368a) && C5254b.m21867f(this.f15507b, ((C5368a) obj).f15507b);
    }

    public final int hashCode() {
        return this.f15508c;
    }

    public final String toString() {
        return C5254b.m21882u(this.f15507b);
    }
}
