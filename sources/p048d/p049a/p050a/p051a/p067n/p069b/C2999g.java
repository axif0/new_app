package p048d.p049a.p050a.p051a.p067n.p069b;

import android.content.Context;
import com.karumi.dexter.BuildConfig;
import p048d.p049a.p050a.p051a.p067n.p070c.C3004a;
import p340io.realm.C5648d0;
import p340io.realm.C5782q0;
import p340io.realm.RealmQuery;

/* renamed from: d.a.a.a.n.b.g */
public class C2999g {

    /* renamed from: b */
    private static C2999g f9554b;

    /* renamed from: a */
    private final C5648d0 f9555a = C5648d0.m23427o0();

    private C2999g(Context context) {
    }

    /* renamed from: d */
    public static C2999g m12790d(Context context) {
        if (f9554b == null) {
            f9554b = new C2999g(context.getApplicationContext());
        }
        return f9554b;
    }

    /* renamed from: a */
    public C5782q0<C3004a> mo10334a(String str) {
        RealmQuery<E> u0 = this.f9555a.mo16277u0(C3004a.class);
        u0.mo16161g("semester", str);
        return u0.mo16163m();
    }

    /* renamed from: b */
    public String mo10335b() {
        C3004a aVar = (C3004a) this.f9555a.mo16277u0(C3004a.class).mo16164n();
        return aVar != null ? aVar.mo10363X() : BuildConfig.FLAVOR;
    }

    /* renamed from: c */
    public C5648d0 mo10336c() {
        return this.f9555a;
    }
}
