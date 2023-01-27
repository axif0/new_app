package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.bd */
public final class C4476bd implements C4494cd {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14009a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14010b;

    /* renamed from: c */
    private static final C4558g2<Boolean> f14011c;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14009a = p2Var.mo14511d("measurement.client.global_params", true);
        f14010b = p2Var.mo14511d("measurement.service.global_params_in_payload", true);
        f14011c = p2Var.mo14511d("measurement.service.global_params", true);
        p2Var.mo14509b("measurement.id.service.global_params", 0);
    }

    /* renamed from: a */
    public final boolean mo13866a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo13867b() {
        return f14009a.mo14175o().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo13868c() {
        return f14010b.mo14175o().booleanValue();
    }

    /* renamed from: d */
    public final boolean mo13869d() {
        return f14011c.mo14175o().booleanValue();
    }
}
