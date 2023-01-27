package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.t2 */
public final class C4787t2 {

    /* renamed from: a */
    private final boolean f14490a;

    public C4787t2(C4770s2 s2Var) {
        C4447a3.m18702c(s2Var, "BuildInfo must be non-null");
        this.f14490a = !s2Var.mo14234a();
    }

    /* renamed from: a */
    public final boolean mo14652a(String str) {
        C4447a3.m18702c(str, "flagName must not be null");
        if (!this.f14490a) {
            return true;
        }
        return C4820v2.f14581a.mo13805a().mo14242b(str);
    }
}
