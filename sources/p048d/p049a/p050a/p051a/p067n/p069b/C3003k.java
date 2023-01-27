package p048d.p049a.p050a.p051a.p067n.p069b;

import android.content.Context;
import p048d.p049a.p050a.p051a.p079t.p080b.C3112d;
import p340io.realm.C5648d0;
import p340io.realm.RealmQuery;

/* renamed from: d.a.a.a.n.b.k */
public class C3003k {

    /* renamed from: b */
    private static C3003k f9562b;

    /* renamed from: a */
    private final C5648d0 f9563a = C5648d0.m23427o0();

    private C3003k(Context context) {
    }

    /* renamed from: c */
    public static C3003k m12821c(Context context) {
        if (f9562b == null) {
            f9562b = new C3003k(context.getApplicationContext());
        }
        return f9562b;
    }

    /* renamed from: a */
    public C5648d0 mo10355a() {
        return this.f9563a;
    }

    /* renamed from: b */
    public boolean mo10356b(long j) {
        RealmQuery<E> u0 = this.f9563a.mo16277u0(C3112d.class);
        u0.mo16160f("id", Long.valueOf(j));
        return ((C3112d) u0.mo16164n()) == null;
    }
}
