package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.jb */
public final class C4622jb implements C4547fb {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14202a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14203b;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14202a = p2Var.mo14511d("measurement.service.configurable_service_limits", true);
        f14203b = p2Var.mo14511d("measurement.client.configurable_service_limits", true);
        p2Var.mo14509b("measurement.id.service.configurable_service_limits", 0);
    }

    /* renamed from: a */
    public final boolean mo14135a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo14136b() {
        return f14202a.mo14175o().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo14137c() {
        return f14203b.mo14175o().booleanValue();
    }
}
