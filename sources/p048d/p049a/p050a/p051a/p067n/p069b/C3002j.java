package p048d.p049a.p050a.p051a.p067n.p069b;

import android.content.Context;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p067n.p070c.C3007d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3041q0;
import p340io.realm.C5648d0;
import p340io.realm.C5782q0;
import p340io.realm.C5793t0;
import p340io.realm.RealmQuery;

/* renamed from: d.a.a.a.n.b.j */
public class C3002j {

    /* renamed from: b */
    private static C3002j f9560b;

    /* renamed from: a */
    private final C5648d0 f9561a = C5648d0.m23427o0();

    private C3002j(Context context) {
    }

    /* renamed from: k */
    public static C3002j m12812k(Context context) {
        if (f9560b == null) {
            f9560b = new C3002j(context.getApplicationContext());
        }
        return f9560b;
    }

    /* renamed from: a */
    public C3007d mo10347a(long j, C3041q0 q0Var) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Number u = this.f9561a.mo16277u0(C3007d.class).mo16168u("id");
        long intValue = u == null ? 1 : (long) (u.intValue() + 1);
        C3007d dVar = new C3007d();
        dVar.mo10452i0(intValue);
        dVar.mo10461p0(j);
        dVar.mo10455k0(q0Var.mo10592a().longValue());
        dVar.mo10463r0(q0Var.mo10596e());
        dVar.mo10454j0(q0Var.mo10595d());
        dVar.mo10462q0(q0Var.mo10594c());
        try {
            dVar.mo10457l0(simpleDateFormat.parse(q0Var.mo10594c()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        dVar.mo10458m0(q0Var.mo10593b().booleanValue());
        dVar.mo10460o0(q0Var.mo10593b().booleanValue());
        dVar.mo10459n0(q0Var.mo10593b().booleanValue());
        return dVar;
    }

    /* renamed from: b */
    public C5782q0<C3007d> mo10348b(long j, long j2, long j3) {
        RealmQuery<E> u0 = this.f9561a.mo16277u0(C3007d.class);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        u0.mo16166q("id", j2);
        u0.mo16157a();
        u0.mo16167t("id", j3);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        return u0.mo16163m().mo16836i("notification_id", C5793t0.DESCENDING);
    }

    /* renamed from: c */
    public C5782q0<C3007d> mo10349c(long j) {
        RealmQuery<E> u0 = this.f9561a.mo16277u0(C3007d.class);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        u0.mo16158d("is_read", Boolean.FALSE);
        return u0.mo16163m();
    }

    /* renamed from: d */
    public C5782q0<C3007d> mo10350d(long j) {
        RealmQuery<E> u0 = this.f9561a.mo16277u0(C3007d.class);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        u0.mo16158d("is_read", Boolean.TRUE);
        u0.mo16157a();
        u0.mo16158d("synced", Boolean.FALSE);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        return u0.mo16163m();
    }

    /* renamed from: e */
    public C5648d0 mo10351e() {
        return this.f9561a;
    }

    /* renamed from: f */
    public boolean mo10352f(long j) {
        RealmQuery<E> u0 = this.f9561a.mo16277u0(C3007d.class);
        u0.mo16160f("notification_id", Long.valueOf(j));
        return ((C3007d) u0.mo16164n()) != null;
    }

    /* renamed from: i */
    public void mo10353i(C3007d dVar) {
        this.f9561a.mo16275m0(new C2997e(dVar));
    }

    /* renamed from: j */
    public void mo10354j(C3007d dVar) {
        this.f9561a.mo16275m0(new C2998f(dVar));
    }
}
