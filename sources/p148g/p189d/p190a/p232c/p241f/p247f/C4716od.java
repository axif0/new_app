package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.od */
public final class C4716od implements C4732pd {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14356a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14357b;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14356a = p2Var.mo14511d("measurement.sdk.screen.manual_screen_view_logging", true);
        f14357b = p2Var.mo14511d("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    /* renamed from: a */
    public final boolean mo14505a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo14506b() {
        return f14356a.mo14175o().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo14507c() {
        return f14357b.mo14175o().booleanValue();
    }
}
