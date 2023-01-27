package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.kb */
public final class C4640kb implements C4658lb {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14238a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14239b;

    /* renamed from: c */
    private static final C4558g2<Long> f14240c;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14238a = p2Var.mo14511d("measurement.client.consent_state_v1", false);
        f14239b = p2Var.mo14511d("measurement.service.consent_state_v1_W33", false);
        f14240c = p2Var.mo14509b("measurement.service.storage_consent_support_version", 203290);
    }

    /* renamed from: a */
    public final boolean mo14361a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo14362b() {
        return f14238a.mo14175o().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo14363c() {
        return f14239b.mo14175o().booleanValue();
    }

    /* renamed from: d */
    public final long mo14364d() {
        return f14240c.mo14175o().longValue();
    }
}
