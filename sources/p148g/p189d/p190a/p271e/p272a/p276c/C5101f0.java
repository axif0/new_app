package p148g.p189d.p190a.p271e.p272a.p276c;

/* renamed from: g.d.a.e.a.c.f0 */
public final class C5101f0<T> implements C5105h0<T> {

    /* renamed from: a */
    private C5105h0<T> f15132a;

    /* renamed from: a */
    public static <T> void m21483a(C5105h0<T> h0Var, C5105h0<T> h0Var2) {
        C5126s.m21543c(h0Var2);
        C5101f0 f0Var = (C5101f0) h0Var;
        if (f0Var.f15132a == null) {
            f0Var.f15132a = h0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final T mo9098d() {
        C5105h0<T> h0Var = this.f15132a;
        if (h0Var != null) {
            return h0Var.mo9098d();
        }
        throw new IllegalStateException();
    }
}
