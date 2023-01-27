package p048d.p049a.p050a.p051a.p067n.p069b;

import android.content.Context;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p340io.realm.C5648d0;
import p340io.realm.C5781q;
import p340io.realm.RealmQuery;

/* renamed from: d.a.a.a.n.b.i */
public class C3001i {

    /* renamed from: b */
    private static C3001i f9558b;

    /* renamed from: a */
    private final C5648d0 f9559a = C5648d0.m23427o0();

    private C3001i(Context context) {
    }

    /* renamed from: c */
    static /* synthetic */ void m12804c(C3006c cVar, C5648d0 d0Var) {
        C3006c cVar2 = (C3006c) d0Var.mo16272g0(cVar, new C5781q[0]);
    }

    /* renamed from: d */
    static /* synthetic */ void m12805d(C3006c cVar, String str, C5648d0 d0Var) {
        cVar.mo10425c0(C3101n.m13317k(0));
        cVar.mo10424b0(str);
    }

    /* renamed from: f */
    public static C3001i m12806f(Context context) {
        if (f9558b == null) {
            f9558b = new C3001i(context.getApplicationContext());
        }
        return f9558b;
    }

    /* renamed from: a */
    public C3006c mo10344a(long j, String str) {
        RealmQuery<E> u0 = this.f9559a.mo16277u0(C3006c.class);
        u0.mo16160f("user_system_id", Long.valueOf(j));
        u0.mo16161g("endpoint", str);
        return (C3006c) u0.mo16164n();
    }

    /* renamed from: b */
    public C3006c mo10345b(long j, String str, int i) {
        if (i == -1) {
            i = C3097j.f9869a;
        }
        RealmQuery<E> u0 = this.f9559a.mo16277u0(C3006c.class);
        u0.mo16160f("user_system_id", Long.valueOf(j));
        u0.mo16161g("endpoint", str);
        u0.mo16165p("data_date", C3101n.m13317k(i));
        return (C3006c) u0.mo16164n();
    }

    /* renamed from: e */
    public void mo10346e(long j, String str, String str2) {
        C5648d0.C5649a aVar;
        C5648d0 d0Var;
        C3006c a = mo10344a(j, str);
        if (a == null) {
            Number u = this.f9559a.mo16277u0(C3006c.class).mo16168u("id");
            long intValue = u == null ? 1 : (long) (u.intValue() + 1);
            C3006c cVar = new C3006c();
            cVar.mo10427e0(intValue);
            cVar.mo10428f0(j);
            cVar.mo10426d0(str);
            cVar.mo10424b0(str2);
            cVar.mo10425c0(C3101n.m13317k(0));
            d0Var = this.f9559a;
            aVar = new C2995c(cVar);
        } else {
            d0Var = this.f9559a;
            aVar = new C2996d(a, str2);
        }
        d0Var.mo16275m0(aVar);
    }
}
