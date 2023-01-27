package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.pb */
public final class C4730pb implements C4679mb {

    /* renamed from: a */
    private static final C4558g2<Boolean> f14405a;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14405a = p2Var.mo14511d("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        p2Var.mo14511d("measurement.collection.init_params_control_enabled", true);
        p2Var.mo14511d("measurement.sdk.dynamite.use_dynamite3", true);
        p2Var.mo14509b("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    /* renamed from: a */
    public final boolean mo14465a() {
        return f14405a.mo14175o().booleanValue();
    }
}
