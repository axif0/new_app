package p048d.p049a.p050a.p051a.p060i.p062b;

import academia.bracu.com.academia.service.C0175b;
import academia.bracu.com.academia.service.C0176c;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p057f.C2852r;
import p048d.p049a.p050a.p051a.p059h.C2880c;
import p048d.p049a.p050a.p051a.p059h.C2882e;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2969b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p067n.p069b.C3000h;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p069b.C3002j;
import p048d.p049a.p050a.p051a.p067n.p070c.C3005b;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p071o.p072a.C3041q0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3042r;
import p048d.p049a.p050a.p051a.p071o.p072a.C3043s;
import p048d.p049a.p050a.p051a.p071o.p072a.C3048x;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p148g.p189d.p289c.C5221f;
import p340io.realm.C5648d0;
import p340io.realm.C5781q;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.i.b.k0 */
public class C2925k0 extends C2961b {
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public Context f9408d0;

    /* renamed from: e0 */
    private C2971d f9409e0;

    /* renamed from: f0 */
    private C2969b f9410f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public String f9411g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C5221f f9412h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C2852r f9413i0;

    /* renamed from: d.a.a.a.i.b.k0$a */
    class C2926a implements C6314d<C3043s> {

        /* renamed from: a */
        final /* synthetic */ boolean f9414a;

        C2926a(boolean z) {
            this.f9414a = z;
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3043s> bVar, C6372r<C3043s> rVar) {
            if (this.f9414a) {
                C2925k0.this.m12609V1(true);
            } else {
                C2925k0.this.mo10294J1();
            }
            if (rVar.mo17995d()) {
                C3043s a = rVar.mo17993a();
                if (a == null || a.mo10605b().booleanValue() || a.mo10604a() == null || a.mo10604a().size() <= 0) {
                    C2925k0.this.f9413i0.f9173m.setVisibility(0);
                    C2925k0.this.f9413i0.f9167g.setVisibility(8);
                    C2925k0.this.m12614b2(true);
                    return;
                }
                C3001i.m12806f(C2925k0.this.f9408d0).mo10346e(C3097j.f9871c.mo10614e().longValue(), C2925k0.this.f9411g0, C2925k0.this.f9412h0.mo15349r(a));
                C2925k0.this.m12612Z1(a.mo10604a().get(0));
                C2925k0.this.f9413i0.f9167g.setVisibility(0);
                return;
            }
            C2925k0.this.f9413i0.f9173m.setVisibility(0);
            C2925k0.this.f9413i0.f9167g.setVisibility(8);
            C2925k0.this.m12614b2(false);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3043s> bVar, Throwable th) {
            if (this.f9414a) {
                C2925k0.this.m12609V1(true);
            } else {
                C2925k0.this.mo10294J1();
            }
            th.printStackTrace();
            C2925k0.this.m12614b2(false);
        }
    }

    /* renamed from: d.a.a.a.i.b.k0$b */
    class C2927b implements C6314d<C3048x> {

        /* renamed from: a */
        final /* synthetic */ boolean f9416a;

        C2927b(boolean z) {
            this.f9416a = z;
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3048x> bVar, C6372r<C3048x> rVar) {
            C3048x a;
            if (this.f9416a) {
                C2925k0.this.mo10294J1();
            }
            if (rVar.mo17995d() && (a = rVar.mo17993a()) != null && a.mo10624a() != null && a.mo10624a().size() > 0) {
                C2925k0.this.m12610W1(a);
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3048x> bVar, Throwable th) {
            if (this.f9416a) {
                C2925k0.this.mo10294J1();
            }
            th.printStackTrace();
        }
    }

    static {
        Class<C2925k0> cls = C2925k0.class;
    }

    /* renamed from: U1 */
    private void m12608U1(boolean z) {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10632b(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e()).mo17940X(new C2926a(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public void m12609V1(boolean z) {
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10643m(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), "0", "received").mo17940X(new C2927b(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public void m12610W1(C3048x xVar) {
        C5648d0 e = C3002j.m12812k(this.f9408d0).mo10351e();
        for (C3041q0 next : xVar.mo10624a()) {
            if (next.mo10596e() != null && !next.mo10596e().isEmpty() && next.mo10595d() != null && !next.mo10595d().isEmpty() && !C3000h.m12796j(this.f9408d0).mo10341e(next.mo10592a().longValue())) {
                next.mo10597f(next.mo10594c() + " 00:00:00");
                C3005b a = C3000h.m12796j(this.f9408d0).mo10337a(C3097j.f9871c.mo10614e().longValue(), next, C2880c.INBOX);
                if (a != null) {
                    e.mo16275m0(new C2951r(a));
                }
            }
        }
        C2969b bVar = this.f9410f0;
        if (bVar != null) {
            bVar.mo428t();
        }
    }

    /* renamed from: X1 */
    static /* synthetic */ void m12611X1(C3005b bVar, C5648d0 d0Var) {
        C3005b bVar2 = (C3005b) d0Var.mo16272g0(bVar, new C5781q[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m12612Z1(C3042r rVar) {
        this.f9413i0.f9173m.setVisibility(8);
        this.f9413i0.f9167g.setVisibility(0);
        this.f9413i0.f9171k.setText(rVar.mo10601d());
        this.f9413i0.f9169i.setText(rVar.mo10598a());
        this.f9413i0.f9168h.setText(rVar.mo10599b());
        this.f9413i0.f9172l.setText(rVar.mo10602e());
        this.f9413i0.f9170j.setText(rVar.mo10600c());
        this.f9410f0.mo424n(C2882e.PROFILE);
    }

    /* renamed from: a2 */
    public static C2925k0 m12613a2() {
        return new C2925k0();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public void m12614b2(boolean z) {
        if (z) {
            Toast.makeText(this.f9408d0, mo3169S(C2722R.string.no_data_found), 1).show();
        } else {
            C3101n.m13300N(this.f9408d0, "Sorry, Profile info can not be loaded");
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_refresh) {
            return super.mo396D0(menuItem);
        }
        if (!C3101n.m13328w(this.f9408d0)) {
            C3101n.m13303R(this.f9408d0);
            return true;
        }
        m12608U1(false);
        return true;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        C3043s sVar;
        super.mo341O0(view, bundle);
        this.f9412h0 = new C5221f();
        this.f9411g0 = mo3169S(C2722R.string.endpoint_faculty_profile);
        C3006c a = C3001i.m12806f(this.f9408d0).mo10344a(C3097j.f9871c.mo10614e().longValue(), this.f9411g0);
        if (a == null || (sVar = (C3043s) this.f9412h0.mo15341i(a.mo10416U(), C3043s.class)) == null || sVar.mo10605b().booleanValue() || sVar.mo10604a() == null || sVar.mo10604a().size() <= 0) {
            m12608U1(true);
        } else {
            m12612Z1(sVar.mo10604a().get(0));
            m12609V1(false);
        }
        new Handler().postDelayed(new C2952s(this), 200);
    }

    /* renamed from: Y1 */
    public /* synthetic */ void mo10249Y1() {
        C0176c cVar;
        String d = C3099l.m13277b(this.f9408d0).mo10691d(mo3169S(C2722R.string.single_push_notification));
        if (!d.isEmpty() && (cVar = (C0176c) new C5221f().mo15341i(d, C0176c.class)) != null) {
            C3099l.m13277b(this.f9408d0).mo10696i(mo3169S(C2722R.string.single_push_notification), BuildConfig.FLAVOR);
            C0175b c2 = C0175b.m634c2(cVar);
            c2.mo3289S1(false);
            c2.mo3292W1(mo3240x(), C0175b.f608r0);
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9409e0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.menu_my_profile));
            if (context instanceof C2969b) {
                this.f9410f0 = (C2969b) context;
                return;
            }
            throw new RuntimeException(context.toString() + " must implement OnDataChangedListener");
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        mo3236v1(true);
    }

    /* renamed from: s0 */
    public void mo397s0(Menu menu, MenuInflater menuInflater) {
        super.mo397s0(menu, menuInflater);
        menuInflater.inflate(C2722R.C2725menu.menu_refresh, menu);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9413i0 = C2852r.m12397c(layoutInflater);
        this.f9408d0 = mo3242y();
        return this.f9413i0.mo10178b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9409e0 = null;
        this.f9410f0 = null;
    }
}
