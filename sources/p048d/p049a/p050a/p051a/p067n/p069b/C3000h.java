package p048d.p049a.p050a.p051a.p067n.p069b;

import android.content.Context;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p059h.C2880c;
import p048d.p049a.p050a.p051a.p067n.p070c.C3005b;
import p048d.p049a.p050a.p051a.p071o.p072a.C3041q0;
import p340io.realm.C5648d0;
import p340io.realm.C5782q0;
import p340io.realm.C5793t0;
import p340io.realm.RealmQuery;

/* renamed from: d.a.a.a.n.b.h */
public class C3000h {

    /* renamed from: b */
    private static C3000h f9556b;

    /* renamed from: a */
    private final C5648d0 f9557a = C5648d0.m23427o0();

    private C3000h(Context context) {
    }

    /* renamed from: j */
    public static C3000h m12796j(Context context) {
        if (f9556b == null) {
            f9556b = new C3000h(context.getApplicationContext());
        }
        return f9556b;
    }

    /* renamed from: a */
    public C3005b mo10337a(long j, C3041q0 q0Var, C2880c cVar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Number u = this.f9557a.mo16277u0(C3005b.class).mo16168u("id");
        long intValue = u == null ? 1 : (long) (u.intValue() + 1);
        C3005b bVar = new C3005b();
        bVar.mo10401i0(intValue);
        bVar.mo10410p0(j);
        bVar.mo10404k0(q0Var.mo10592a().longValue());
        bVar.mo10412r0(q0Var.mo10596e());
        bVar.mo10403j0(q0Var.mo10595d());
        bVar.mo10411q0(q0Var.mo10594c());
        try {
            bVar.mo10406l0(simpleDateFormat.parse(q0Var.mo10594c()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (cVar == C2880c.SENT) {
            bVar.mo10407m0(true);
            bVar.mo10409o0(true);
            bVar.mo10408n0(false);
        } else {
            bVar.mo10407m0(q0Var.mo10593b().booleanValue());
            bVar.mo10409o0(q0Var.mo10593b().booleanValue());
            bVar.mo10408n0(true);
        }
        return bVar;
    }

    /* renamed from: b */
    public C5782q0<C3005b> mo10338b(long j, C2880c cVar, long j2) {
        long j3 = j2 - 10;
        if (j3 < 0) {
            j3 = 0;
        }
        boolean z = cVar == C2880c.INBOX;
        RealmQuery<E> u0 = this.f9557a.mo16277u0(C3005b.class);
        u0.mo16158d("is_received", Boolean.valueOf(z));
        u0.mo16160f("system_user_id", Long.valueOf(j));
        u0.mo16166q("id", j3);
        u0.mo16157a();
        u0.mo16167t("id", j2);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        u0.mo16158d("is_received", Boolean.valueOf(z));
        return u0.mo16163m().mo16836i("notification_id", C5793t0.DESCENDING);
    }

    /* renamed from: c */
    public C5782q0<C3005b> mo10339c(long j) {
        RealmQuery<E> u0 = this.f9557a.mo16277u0(C3005b.class);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        u0.mo16158d("is_read", Boolean.FALSE);
        return u0.mo16163m();
    }

    /* renamed from: d */
    public C5782q0<C3005b> mo10340d(long j) {
        RealmQuery<E> u0 = this.f9557a.mo16277u0(C3005b.class);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        u0.mo16158d("is_read", Boolean.TRUE);
        u0.mo16157a();
        u0.mo16158d("synced", Boolean.FALSE);
        u0.mo16160f("system_user_id", Long.valueOf(j));
        return u0.mo16163m();
    }

    /* renamed from: e */
    public boolean mo10341e(long j) {
        RealmQuery<E> u0 = this.f9557a.mo16277u0(C3005b.class);
        u0.mo16160f("notification_id", Long.valueOf(j));
        return ((C3005b) u0.mo16164n()) != null;
    }

    /* renamed from: h */
    public void mo10342h(C3005b bVar) {
        this.f9557a.mo16275m0(new C2994b(bVar));
    }

    /* renamed from: i */
    public void mo10343i(C3005b bVar) {
        this.f9557a.mo16275m0(new C2993a(bVar));
    }
}
