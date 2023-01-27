package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.ra */
public final class C4761ra implements C4778sa {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14455a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14456b;

    /* renamed from: c */
    private static final C4558g2<Boolean> f14457c;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14455a = p2Var.mo14511d("measurement.client.ad_impression.dev", false);
        f14456b = p2Var.mo14511d("measurement.service.separate_public_internal_event_blacklisting", false);
        f14457c = p2Var.mo14511d("measurement.service.ad_impression", false);
        p2Var.mo14509b("measurement.id.service.ad_impression", 0);
    }

    /* renamed from: a */
    public final boolean mo14579a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo14580b() {
        return f14455a.mo14175o().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo14581c() {
        return f14456b.mo14175o().booleanValue();
    }

    /* renamed from: d */
    public final boolean mo14582d() {
        return f14457c.mo14175o().booleanValue();
    }
}
