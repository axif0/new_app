package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.cb */
public final class C4492cb implements C4905za {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14020a;

    /* renamed from: b */
    private static final C4558g2<Long> f14021b;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14020a = p2Var.mo14511d("measurement.sdk.attribution.cache", true);
        f14021b = p2Var.mo14509b("measurement.sdk.attribution.cache.ttl", 604800000);
    }

    /* renamed from: a */
    public final boolean mo13899a() {
        return f14020a.mo14175o().booleanValue();
    }

    /* renamed from: b */
    public final long mo13900b() {
        return f14021b.mo14175o().longValue();
    }
}
