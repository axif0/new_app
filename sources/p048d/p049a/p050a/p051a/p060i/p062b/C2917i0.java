package p048d.p049a.p050a.p051a.p060i.p062b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.Iterator;
import p048d.p049a.p050a.p051a.p052c.C2809h;
import p048d.p049a.p050a.p051a.p057f.C2850p;
import p048d.p049a.p050a.p051a.p059h.C2880c;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2969b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p064k.C2974g;
import p048d.p049a.p050a.p051a.p067n.p068a.C2989a;
import p048d.p049a.p050a.p051a.p067n.p069b.C3000h;
import p048d.p049a.p050a.p051a.p067n.p069b.C3002j;
import p048d.p049a.p050a.p051a.p067n.p070c.C3005b;
import p048d.p049a.p050a.p051a.p071o.p072a.C3039p0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3041q0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3048x;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3100m;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p340io.realm.C5648d0;
import p340io.realm.C5781q;
import p340io.realm.C5782q0;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.i.b.i0 */
public class C2917i0 extends C2961b implements C2974g {

    /* renamed from: d0 */
    private C2971d f9380d0;

    /* renamed from: e0 */
    private Context f9381e0;

    /* renamed from: f0 */
    private C5648d0 f9382f0;

    /* renamed from: g0 */
    private C5782q0<C3005b> f9383g0;

    /* renamed from: h0 */
    private ArrayList<Long> f9384h0;

    /* renamed from: i0 */
    private int f9385i0 = 0;

    /* renamed from: j0 */
    private C2880c f9386j0;

    /* renamed from: k0 */
    private String f9387k0;

    /* renamed from: l0 */
    private String f9388l0;

    /* renamed from: m0 */
    private C2809h f9389m0;

    /* renamed from: n0 */
    private C2969b f9390n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C2850p f9391o0;

    /* renamed from: d.a.a.a.i.b.i0$a */
    class C2918a implements C6314d<C3048x> {
        C2918a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3048x> bVar, C6372r<C3048x> rVar) {
            C3048x a;
            C2917i0.this.mo10294J1();
            if (!rVar.mo17995d() || (a = rVar.mo17993a()) == null || a.mo10624a() == null || a.mo10624a().size() <= 0) {
                C2917i0.this.f9391o0.f9144g.setVisibility(0);
                return;
            }
            C2917i0.this.m12544T1(a);
            C2917i0.this.f9391o0.f9144g.setVisibility(8);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3048x> bVar, Throwable th) {
            C2917i0.this.mo10294J1();
            C2917i0.this.f9391o0.f9144g.setVisibility(0);
            th.printStackTrace();
        }
    }

    /* renamed from: d.a.a.a.i.b.i0$b */
    class C2919b implements C6314d<C3039p0> {
        C2919b() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3039p0> bVar, C6372r<C3039p0> rVar) {
            C3039p0 a;
            C2917i0.this.mo10294J1();
            if (rVar.mo17995d() && (a = rVar.mo17993a()) != null && a.mo10589a().booleanValue()) {
                C2917i0.this.m12549c2();
                C2917i0.this.m12545Y1();
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3039p0> bVar, Throwable th) {
            C2917i0.this.mo10294J1();
            th.printStackTrace();
        }
    }

    static {
        Class<C2917i0> cls = C2917i0.class;
    }

    /* renamed from: Q1 */
    private void m12541Q1(int i) {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10643m(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), String.valueOf(i), this.f9388l0).mo17940X(new C2918a());
    }

    /* renamed from: R1 */
    private C5782q0<C3005b> m12542R1() {
        Number u = this.f9382f0.mo16277u0(C3005b.class).mo16168u("id");
        int intValue = u != null ? u.intValue() : 0;
        int i = this.f9385i0;
        if (i > 0) {
            intValue -= i * 10;
        }
        return C3000h.m12796j(this.f9381e0).mo10338b(C3097j.f9871c.mo10614e().longValue(), this.f9386j0, (long) intValue);
    }

    /* renamed from: S1 */
    private void m12543S1() {
        this.f9391o0.f9140c.setOnClickListener(new C2908f(this));
        this.f9391o0.f9139b.setOnClickListener(new C2902c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public void m12544T1(C3048x xVar) {
        this.f9382f0.mo16275m0(new C2904d(this, xVar));
        this.f9390n0.mo428t();
        m12545Y1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m12545Y1() {
        if (this.f9389m0 == null) {
            this.f9389m0 = new C2809h(this.f9381e0, this);
        }
        C5782q0<C3005b> R1 = m12542R1();
        if (R1 == null || R1.size() <= 0) {
            this.f9391o0.f9144g.setVisibility(0);
        } else {
            this.f9391o0.f9144g.setVisibility(8);
        }
        this.f9389m0.mo10333D(new C2989a(this.f9381e0, R1, true));
        this.f9391o0.f9143f.setAdapter(this.f9389m0);
        if ((R1 != null ? R1.size() : 0) > 10) {
            this.f9391o0.f9142e.setVisibility(0);
            this.f9391o0.f9139b.setEnabled(true);
            if (this.f9385i0 <= 0) {
                this.f9391o0.f9140c.setEnabled(false);
                return;
            }
        } else if (this.f9385i0 > 0) {
            this.f9391o0.f9139b.setEnabled(false);
        } else {
            this.f9391o0.f9142e.setVisibility(8);
            return;
        }
        this.f9391o0.f9140c.setEnabled(true);
    }

    /* renamed from: Z1 */
    public static C2917i0 m12546Z1(C2880c cVar) {
        C2917i0 i0Var = new C2917i0();
        i0Var.m12547a2(cVar);
        return i0Var;
    }

    /* renamed from: a2 */
    private void m12547a2(C2880c cVar) {
        this.f9386j0 = cVar;
    }

    /* renamed from: b2 */
    private void m12548b2() {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10633c(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), this.f9384h0.toString()).mo17940X(new C2919b());
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public void m12549c2() {
        this.f9382f0.mo16275m0(new C2906e(this));
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() == C2722R.C2724id.action_refresh) {
            if (!C3101n.m13328w(this.f9381e0)) {
                C3101n.m13303R(this.f9381e0);
                return true;
            }
            m12541Q1(0);
            return true;
        } else if (menuItem.getItemId() == C2722R.C2724id.action_sync) {
            return true;
        } else {
            return super.mo396D0(menuItem);
        }
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        String str;
        super.mo341O0(view, bundle);
        if (this.f9386j0 == C2880c.INBOX) {
            this.f9387k0 = mo3169S(C2722R.string.received_messages);
            str = "received";
        } else {
            this.f9387k0 = mo3169S(C2722R.string.sent_messages);
            str = "delivered";
        }
        this.f9388l0 = str;
        this.f9380d0.mo301e(this.f9387k0);
        this.f9382f0 = C3002j.m12812k(this.f9381e0).mo10351e();
        m12543S1();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f9381e0, 1, false);
        this.f9391o0.f9143f.setHasFixedSize(true);
        this.f9391o0.f9143f.setLayoutManager(linearLayoutManager);
        this.f9391o0.f9143f.mo4191h(new C3100m(mo3158M().getDrawable(C2722R.C2723drawable.rv_horizontal_divider_gray)));
        C5782q0<C3005b> d = C3000h.m12796j(this.f9381e0).mo10340d(C3097j.f9871c.mo10614e().longValue());
        this.f9383g0 = d;
        if (d.size() > 0) {
            this.f9384h0 = new ArrayList<>();
            Iterator<C3005b> it = this.f9383g0.iterator();
            while (it.hasNext()) {
                this.f9384h0.add(Long.valueOf(it.next().mo10380V()));
            }
            if (C3101n.m13328w(this.f9381e0)) {
                m12548b2();
            } else {
                C3101n.m13303R(this.f9381e0);
            }
        } else {
            C5782q0<C3005b> R1 = m12542R1();
            if (R1 == null || R1.size() <= 0) {
                m12541Q1(0);
            } else {
                m12545Y1();
            }
        }
    }

    /* renamed from: U1 */
    public /* synthetic */ void mo10233U1(View view) {
        if (this.f9385i0 <= 0) {
            this.f9385i0 = 0;
            this.f9391o0.f9140c.setEnabled(false);
        }
        int i = this.f9385i0 - 1;
        this.f9385i0 = i;
        m12541Q1(i);
    }

    /* renamed from: V1 */
    public /* synthetic */ void mo10234V1(View view) {
        int i = this.f9385i0 + 1;
        this.f9385i0 = i;
        m12541Q1(i);
    }

    /* renamed from: W1 */
    public /* synthetic */ void mo10235W1(C3048x xVar, C5648d0 d0Var) {
        for (C3041q0 next : xVar.mo10624a()) {
            if (next.mo10596e() != null && !next.mo10596e().isEmpty() && next.mo10595d() != null && !next.mo10595d().isEmpty() && !C3000h.m12796j(this.f9381e0).mo10341e(next.mo10592a().longValue())) {
                next.mo10597f(next.mo10594c() + " 00:00:00");
                C3005b a = C3000h.m12796j(this.f9381e0).mo10337a(C3097j.f9871c.mo10614e().longValue(), next, this.f9386j0);
                if (a != null) {
                    d0Var.mo16272g0(a, new C5781q[0]);
                }
            }
        }
    }

    /* renamed from: X1 */
    public /* synthetic */ void mo10236X1(C5648d0 d0Var) {
        Iterator<C3005b> it = this.f9383g0.iterator();
        while (it.hasNext()) {
            it.next().mo10409o0(true);
        }
    }

    /* renamed from: f */
    public void mo10237f() {
        C2969b bVar = this.f9390n0;
        if (bVar != null) {
            bVar.mo428t();
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            this.f9380d0 = (C2971d) context;
            if (context instanceof C2969b) {
                this.f9390n0 = (C2969b) context;
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
        menuInflater.inflate(C2722R.C2725menu.menu_notification, menu);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9391o0 = C2850p.m12389c(layoutInflater);
        this.f9381e0 = mo3242y();
        return this.f9391o0.mo10176b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9380d0 = null;
        this.f9390n0 = null;
    }

    /* renamed from: z0 */
    public void mo3246z0(boolean z) {
        C2971d dVar;
        super.mo3246z0(z);
        if (!z && (dVar = this.f9380d0) != null) {
            try {
                dVar.mo301e(this.f9387k0);
            } catch (Exception unused) {
            }
        }
    }
}
