package p335h.p336a;

import p349j.p350a.C5825a;

/* renamed from: h.a.a */
public final class C5598a<T> implements C5825a<T> {

    /* renamed from: c */
    private static final Object f16171c = new Object();

    /* renamed from: a */
    private volatile C5825a<T> f16172a;

    /* renamed from: b */
    private volatile Object f16173b = f16171c;

    private C5598a(C5825a<T> aVar) {
        this.f16172a = aVar;
    }

    /* renamed from: a */
    public static <P extends C5825a<T>, T> C5825a<T> m23195a(P p) {
        C5601d.m23199b(p);
        return p instanceof C5598a ? p : new C5598a(p);
    }

    /* renamed from: b */
    public static Object m23196b(Object obj, Object obj2) {
        if (!(obj != f16171c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f16173b;
        if (t == f16171c) {
            synchronized (this) {
                t = this.f16173b;
                if (t == f16171c) {
                    t = this.f16172a.get();
                    m23196b(this.f16173b, t);
                    this.f16173b = t;
                    this.f16172a = null;
                }
            }
        }
        return t;
    }
}
