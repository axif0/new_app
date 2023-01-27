package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.nd */
public final class C4698nd implements C4642kd {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14335a;

    /* renamed from: b */
    private static final C4558g2<Boolean> f14336b;

    /* renamed from: c */
    private static final C4558g2<Boolean> f14337c;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        p2Var.mo14509b("measurement.id.lifecycle.app_in_background_parameter", 0);
        f14335a = p2Var.mo14511d("measurement.lifecycle.app_backgrounded_engagement", false);
        f14336b = p2Var.mo14511d("measurement.lifecycle.app_backgrounded_tracking", true);
        f14337c = p2Var.mo14511d("measurement.lifecycle.app_in_background_parameter", false);
        p2Var.mo14509b("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    /* renamed from: a */
    public final boolean mo14365a() {
        return f14335a.mo14175o().booleanValue();
    }

    /* renamed from: b */
    public final boolean mo14366b() {
        return f14336b.mo14175o().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo14367c() {
        return f14337c.mo14175o().booleanValue();
    }
}
