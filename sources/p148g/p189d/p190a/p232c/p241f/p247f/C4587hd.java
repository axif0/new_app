package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.hd */
public final class C4587hd implements C4624jd {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14170a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14171b;

    /* renamed from: c */
    private static final C4558g2<Boolean> f14172c;

    /* renamed from: d */
    private static final C4558g2<Boolean> f14173d;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14170a = p2Var.mo14511d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f14171b = p2Var.mo14511d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f14172c = p2Var.mo14511d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f14173d = p2Var.mo14511d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        p2Var.mo14509b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    /* renamed from: a */
    public final boolean mo14230a() {
        return f14170a.mo14175o().booleanValue();
    }

    /* renamed from: b */
    public final boolean mo14231b() {
        return f14171b.mo14175o().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo14232c() {
        return f14172c.mo14175o().booleanValue();
    }

    /* renamed from: d */
    public final boolean mo14233d() {
        return f14173d.mo14175o().booleanValue();
    }
}
