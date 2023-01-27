package p148g.p189d.p190a.p271e.p272a.p276c;

/* renamed from: g.d.a.e.a.c.g0 */
public final class C5103g0<T> implements C5105h0, C5099e0 {

    /* renamed from: c */
    private static final Object f15134c = new Object();

    /* renamed from: a */
    private volatile C5105h0<T> f15135a;

    /* renamed from: b */
    private volatile Object f15136b = f15134c;

    private C5103g0(C5105h0<T> h0Var) {
        this.f15135a = h0Var;
    }

    /* renamed from: a */
    public static <P extends C5105h0<T>, T> C5105h0<T> m21487a(P p) {
        C5126s.m21543c(p);
        return p instanceof C5103g0 ? p : new C5103g0(p);
    }

    /* renamed from: b */
    public static <P extends C5105h0<T>, T> C5099e0<T> m21488b(P p) {
        if (p instanceof C5099e0) {
            return (C5099e0) p;
        }
        C5126s.m21543c(p);
        return new C5103g0(p);
    }

    /* renamed from: d */
    public final T mo9098d() {
        T t = this.f15136b;
        if (t == f15134c) {
            synchronized (this) {
                t = this.f15136b;
                if (t == f15134c) {
                    t = this.f15135a.mo9098d();
                    T t2 = this.f15136b;
                    if (t2 != f15134c) {
                        if (t2 != t) {
                            String valueOf = String.valueOf(t2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f15136b = t;
                    this.f15135a = null;
                }
            }
        }
        return t;
    }
}
