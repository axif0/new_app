package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.uc */
public final class C4814uc implements C4763rc {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14572a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14573b;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14572a = p2Var.mo14511d("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f14573b = p2Var.mo14511d("measurement.collection.redundant_engagement_removal_enabled", false);
        p2Var.mo14509b("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    /* renamed from: a */
    public final boolean mo14583a() {
        return f14572a.mo14175o().booleanValue();
    }

    /* renamed from: b */
    public final boolean mo14584b() {
        return f14573b.mo14175o().booleanValue();
    }
}
