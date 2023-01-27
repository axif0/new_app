package p048d.p049a.p050a.p051a.p075r.p077b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.Iterator;
import p048d.p049a.p050a.p051a.p052c.C2815k;
import p048d.p049a.p050a.p051a.p057f.C2858x;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2969b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p064k.C2974g;
import p048d.p049a.p050a.p051a.p067n.p068a.C2991c;
import p048d.p049a.p050a.p051a.p067n.p069b.C3002j;
import p048d.p049a.p050a.p051a.p067n.p070c.C3007d;
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

/* renamed from: d.a.a.a.r.b.q */
public class C3079q extends C2961b implements C2974g {

    /* renamed from: d0 */
    private C2971d f9804d0;

    /* renamed from: e0 */
    private Context f9805e0;

    /* renamed from: f0 */
    private C5648d0 f9806f0;

    /* renamed from: g0 */
    private C5782q0<C3007d> f9807g0;

    /* renamed from: h0 */
    private ArrayList<Long> f9808h0;

    /* renamed from: i0 */
    private int f9809i0 = 0;

    /* renamed from: j0 */
    private C2969b f9810j0;

    /* renamed from: k0 */
    private C2815k f9811k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C2858x f9812l0;

    /* renamed from: d.a.a.a.r.b.q$a */
    class C3080a implements C6314d<C3048x> {
        C3080a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3048x> bVar, C6372r<C3048x> rVar) {
            C3048x a;
            C3079q.this.mo10294J1();
            if (!rVar.mo17995d() || (a = rVar.mo17993a()) == null || a.mo10624a().size() <= 0) {
                C3079q.this.f9812l0.f9234g.setVisibility(0);
                return;
            }
            C3079q.this.m13193S1(a);
            C3079q.this.f9812l0.f9234g.setVisibility(8);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3048x> bVar, Throwable th) {
            C3079q.this.mo10294J1();
            C3079q.this.f9812l0.f9234g.setVisibility(0);
            th.printStackTrace();
        }
    }

    /* renamed from: d.a.a.a.r.b.q$b */
    class C3081b implements C6314d<C3039p0> {
        C3081b() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3039p0> bVar, C6372r<C3039p0> rVar) {
            C3039p0 a;
            C3079q.this.mo10294J1();
            if (rVar.mo17995d() && (a = rVar.mo17993a()) != null && a.mo10589a().booleanValue()) {
                C3079q.this.m13197a2();
                C3079q.this.m13194X1();
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3039p0> bVar, Throwable th) {
            C3079q.this.mo10294J1();
            th.printStackTrace();
        }
    }

    static {
        Class<C3079q> cls = C3079q.class;
        Class<C3079q> cls2 = C3079q.class;
    }

    /* renamed from: Q1 */
    private void m13191Q1(int i) {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10643m(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), String.valueOf(i), "received").mo17940X(new C3080a());
    }

    /* renamed from: R1 */
    private void m13192R1() {
        this.f9812l0.f9230c.setOnClickListener(new C3058c(this));
        this.f9812l0.f9229b.setOnClickListener(new C3059d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public void m13193S1(C3048x xVar) {
        Button button;
        this.f9806f0.mo16275m0(new C3061f(this, xVar));
        this.f9810j0.mo428t();
        int i = this.f9809i0 + 1;
        C5782q0<C3007d> b = C3002j.m12812k(this.f9805e0).mo10348b(C3097j.f9871c.mo10614e().longValue(), (long) i, (long) (i * 11));
        this.f9811k0.mo10333D(new C2991c(this.f9805e0, b, true));
        this.f9812l0.f9233f.setAdapter(this.f9811k0);
        if (b.size() > 10) {
            this.f9812l0.f9232e.setVisibility(0);
            this.f9812l0.f9229b.setEnabled(true);
            if (this.f9809i0 > 0) {
                this.f9812l0.f9230c.setEnabled(true);
                return;
            }
            button = this.f9812l0.f9230c;
        } else if (this.f9809i0 > 0) {
            button = this.f9812l0.f9229b;
        } else {
            this.f9812l0.f9232e.setVisibility(8);
            return;
        }
        button.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public void m13194X1() {
        Button button;
        int i = this.f9809i0 + 1;
        C5782q0<C3007d> b = C3002j.m12812k(this.f9805e0).mo10348b(C3097j.f9871c.mo10614e().longValue(), (long) i, (long) (i * 11));
        mo10294J1();
        if (b == null || b.size() <= 0) {
            this.f9812l0.f9234g.setVisibility(0);
        } else {
            this.f9812l0.f9234g.setVisibility(8);
        }
        this.f9811k0.mo10333D(new C2991c(this.f9805e0, b, true));
        this.f9812l0.f9233f.setAdapter(this.f9811k0);
        if (b.size() > 10) {
            this.f9812l0.f9232e.setVisibility(0);
            this.f9812l0.f9229b.setEnabled(true);
            if (this.f9809i0 > 0) {
                this.f9812l0.f9230c.setEnabled(true);
                return;
            }
            button = this.f9812l0.f9230c;
        } else if (this.f9809i0 > 0) {
            button = this.f9812l0.f9229b;
        } else {
            this.f9812l0.f9232e.setVisibility(8);
            return;
        }
        button.setEnabled(false);
    }

    /* renamed from: Y1 */
    public static C3079q m13195Y1() {
        return new C3079q();
    }

    /* renamed from: Z1 */
    private void m13196Z1() {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10633c(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), this.f9808h0.toString()).mo17940X(new C3081b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public void m13197a2() {
        this.f9806f0.mo16275m0(new C3060e(this));
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() == C2722R.C2724id.action_refresh) {
            if (!C3101n.m13328w(this.f9805e0)) {
                C3101n.m13303R(this.f9805e0);
                return true;
            }
            m13191Q1(0);
            return true;
        } else if (menuItem.getItemId() == C2722R.C2724id.action_sync) {
            return true;
        } else {
            return super.mo396D0(menuItem);
        }
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f9806f0 = C3002j.m12812k(this.f9805e0).mo10351e();
        m13192R1();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f9805e0, 1, false);
        this.f9812l0.f9233f.setHasFixedSize(true);
        this.f9812l0.f9233f.setLayoutManager(linearLayoutManager);
        this.f9812l0.f9233f.mo4191h(new C3100m(mo3158M().getDrawable(C2722R.C2723drawable.rv_horizontal_divider_gray)));
        this.f9807g0 = C3002j.m12812k(this.f9805e0).mo10350d(C3097j.f9871c.mo10614e().longValue());
        this.f9811k0 = new C2815k(this.f9805e0, this);
        if (this.f9807g0.size() > 0) {
            this.f9808h0 = new ArrayList<>();
            Iterator<C3007d> it = this.f9807g0.iterator();
            while (it.hasNext()) {
                this.f9808h0.add(Long.valueOf(it.next().mo10431V()));
            }
            if (C3101n.m13328w(this.f9805e0)) {
                m13196Z1();
                return;
            }
        }
        m13194X1();
    }

    /* renamed from: T1 */
    public /* synthetic */ void mo10669T1(View view) {
        if (this.f9809i0 <= 0) {
            this.f9809i0 = 0;
            this.f9812l0.f9230c.setEnabled(false);
        }
        this.f9809i0--;
        if (C3101n.m13328w(this.f9805e0)) {
            m13191Q1(this.f9809i0);
        } else {
            C3101n.m13303R(this.f9805e0);
        }
    }

    /* renamed from: U1 */
    public /* synthetic */ void mo10670U1(View view) {
        this.f9809i0++;
        if (C3101n.m13328w(this.f9805e0)) {
            m13191Q1(this.f9809i0);
        } else {
            C3101n.m13303R(this.f9805e0);
        }
    }

    /* renamed from: V1 */
    public /* synthetic */ void mo10671V1(C3048x xVar, C5648d0 d0Var) {
        for (C3041q0 next : xVar.mo10624a()) {
            if (next.mo10596e() != null && !next.mo10596e().isEmpty() && next.mo10595d() != null && !next.mo10595d().isEmpty() && !C3002j.m12812k(this.f9805e0).mo10352f(next.mo10592a().longValue())) {
                next.mo10597f(next.mo10594c() + " 00:00:00");
                C3007d a = C3002j.m12812k(this.f9805e0).mo10347a(C3097j.f9871c.mo10614e().longValue(), next);
                if (a != null) {
                    d0Var.mo16272g0(a, new C5781q[0]);
                }
            }
        }
    }

    /* renamed from: W1 */
    public /* synthetic */ void mo10672W1(C5648d0 d0Var) {
        Iterator<C3007d> it = this.f9807g0.iterator();
        while (it.hasNext()) {
            it.next().mo10460o0(true);
        }
    }

    /* renamed from: f */
    public void mo10237f() {
        C2969b bVar = this.f9810j0;
        if (bVar != null) {
            bVar.mo428t();
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9804d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.received_messages));
            if (context instanceof C2969b) {
                this.f9810j0 = (C2969b) context;
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
        this.f9812l0 = C2858x.m12421c(layoutInflater);
        this.f9805e0 = mo3242y();
        return this.f9812l0.mo10184b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9804d0 = null;
        this.f9810j0 = null;
    }
}
