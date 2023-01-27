package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.bc */
public final class C4475bc implements C4883yb {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14006a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14007b;

    /* renamed from: c */
    private static final C4558g2<Boolean> f14008c;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        p2Var.mo14511d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f14006a = p2Var.mo14511d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f14007b = p2Var.mo14511d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f14008c = p2Var.mo14511d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo13862a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo13863b() {
        return f14006a.mo14175o().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo13864c() {
        return f14007b.mo14175o().booleanValue();
    }

    /* renamed from: d */
    public final boolean mo13865d() {
        return f14008c.mo14175o().booleanValue();
    }
}
