package p148g.p189d.p190a.p232c.p248g;

import com.google.android.gms.common.api.C1547a;
import com.google.android.gms.common.api.Scope;
import p148g.p189d.p190a.p232c.p248g.p249b.C4911a;

/* renamed from: g.d.a.c.g.c */
public final class C4923c {

    /* renamed from: a */
    private static final C1547a.C1556g<C4911a> f14729a = new C1547a.C1556g<>();

    /* renamed from: b */
    private static final C1547a.C1556g<C4911a> f14730b = new C1547a.C1556g<>();

    /* renamed from: c */
    public static final C1547a.C1548a<C4911a, C4910a> f14731c = new C4924d();

    /* renamed from: d */
    private static final C1547a.C1548a<C4911a, Object> f14732d = new C4925e();

    static {
        new Scope("profile");
        new Scope("email");
        new C1547a("SignIn.API", f14731c, f14729a);
        new C1547a("SignIn.INTERNAL_API", f14732d, f14730b);
    }
}
