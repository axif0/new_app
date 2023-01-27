package p048d.p049a.p050a.p051a.p060i.p062b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.vipulasri.timelineview.p031d.C1430b;
import com.github.vipulasri.timelineview.p031d.p032d.C1434a;
import com.github.vipulasri.timelineview.p031d.p033e.C1436b;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p057f.C2849o;
import p048d.p049a.p050a.p051a.p059h.C2883f;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p071o.p072a.C3013c0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3044t;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p048d.p049a.p050a.p051a.p078s.C3105o;
import p086f.p111h.p112e.C3267a;
import p148g.p189d.p289c.C5221f;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.i.b.h0 */
public class C2913h0 extends C2961b {
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public Context f9371d0;

    /* renamed from: e0 */
    private C2971d f9372e0;

    /* renamed from: f0 */
    private List<C3013c0> f9373f0;

    /* renamed from: g0 */
    private C1436b f9374g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C5221f f9375h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public String f9376i0;

    /* renamed from: j0 */
    private C2849o f9377j0;

    /* renamed from: d.a.a.a.i.b.h0$a */
    class C2914a implements C6314d<C3044t> {
        C2914a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3044t> bVar, C6372r<C3044t> rVar) {
            boolean z;
            C2913h0 h0Var;
            C2913h0.this.mo10294J1();
            if (rVar.mo17995d()) {
                C3044t a = rVar.mo17993a();
                if (a == null || a.mo10606a().booleanValue()) {
                    h0Var = C2913h0.this;
                    z = true;
                } else {
                    C2913h0.this.m12523U1(a);
                    C3001i.m12806f(C2913h0.this.f9371d0).mo10346e(C3097j.f9871c.mo10614e().longValue(), C2913h0.this.f9376i0, C2913h0.this.f9375h0.mo15349r(a));
                    return;
                }
            } else {
                h0Var = C2913h0.this;
                z = false;
            }
            h0Var.m12525W1(z);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3044t> bVar, Throwable th) {
            C2913h0.this.mo10294J1();
            th.printStackTrace();
            C2913h0.this.m12525W1(false);
        }
    }

    /* renamed from: d.a.a.a.i.b.h0$b */
    class C2915b extends HashMap<Integer, Boolean> {
        C2915b(C2913h0 h0Var, int i) {
            super(i);
            put(1, Boolean.FALSE);
            put(2, Boolean.FALSE);
            put(3, Boolean.FALSE);
            put(4, Boolean.FALSE);
            put(5, Boolean.FALSE);
            put(6, Boolean.FALSE);
            put(7, Boolean.FALSE);
        }
    }

    static {
        Class<C2913h0> cls = C2913h0.class;
    }

    /* renamed from: R1 */
    private void m12521R1() {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10642l(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e()).mo17940X(new C2914a());
    }

    /* renamed from: S1 */
    static /* synthetic */ int m12522S1(C3013c0 c0Var, C3013c0 c0Var2) {
        return c0Var.mo10478c() - c0Var2.mo10478c();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public void m12523U1(C3044t tVar) {
        this.f9377j0.f9137c.setVisibility(8);
        List<C3013c0> b = tVar.mo10607b();
        C2915b bVar = new C2915b(this, 7);
        int a = C3105o.m13337a();
        Calendar instance = Calendar.getInstance();
        for (C3013c0 next : b) {
            int c = C3105o.m13339c(next.mo10477b());
            next.mo10483h(c);
            bVar.put(Integer.valueOf(c), Boolean.TRUE);
        }
        for (int i = 1; i <= bVar.size(); i++) {
            if (!((Boolean) bVar.get(Integer.valueOf(i))).booleanValue()) {
                C3013c0 c0Var = new C3013c0();
                c0Var.mo10483h(i);
                c0Var.mo10482g(C3105o.m13338b(i));
                b.add(c0Var);
            }
        }
        Collections.sort(b, C2900b.f9355f);
        for (C3013c0 next2 : b) {
            int c2 = next2.mo10478c();
            next2.mo10486k(c2 == a ? C2883f.ACTIVE : c2 > a ? C2883f.INACTIVE : C2883f.COMPLETED);
            instance.setTime(C3101n.m13317k(a - c2));
            next2.mo10484i(instance.get(5));
            next2.mo10485j(new SimpleDateFormat("MMM", Locale.getDefault()).format(instance.getTime()));
        }
        this.f9373f0 = b;
        this.f9377j0.f9136b.setAdapter(new C1430b(this.f9371d0, b, this.f9374g0));
        try {
            new Handler().postDelayed(new C2898a(this, a), 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: V1 */
    public static C2913h0 m12524V1() {
        return new C2913h0();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public void m12525W1(boolean z) {
        this.f9377j0.f9137c.setVisibility(0);
        if (!z) {
            C3101n.m13300N(this.f9371d0, "Sorry, Class schedule can not be loaded");
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_refresh) {
            return super.mo396D0(menuItem);
        }
        if (!C3101n.m13328w(this.f9371d0)) {
            C3101n.m13303R(this.f9371d0);
            return true;
        }
        m12521R1();
        return true;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f9375h0 = new C5221f();
        this.f9376i0 = mo3169S(C2722R.string.base_url).concat(mo3169S(C2722R.string.endpoint_faculty_class_schedule));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f9371d0, 1, false);
        this.f9377j0.f9136b.setHasFixedSize(true);
        this.f9377j0.f9136b.setLayoutManager(linearLayoutManager);
        this.f9374g0 = new C1436b(C1434a.m7107b(mo3158M(), 20.0f), C1434a.m7108c(this.f9371d0, C2722R.color.colorAccent), true, C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 2.0f), C3267a.m14074d(this.f9371d0, C2722R.color.colorAccent), C3267a.m14074d(this.f9371d0, C2722R.color.colorAccent), 0, C1434a.m7107b(mo3158M(), 2.0f), C1434a.m7107b(mo3158M(), 4.0f), C1434a.m7107b(mo3158M(), 2.0f));
        C3006c b = C3001i.m12806f(this.f9371d0).mo10345b(C3097j.f9871c.mo10614e().longValue(), this.f9376i0, 7);
        if (b == null || C3101n.m13319m(b.mo10417V()) > C3101n.m13319m(C3101n.m13317k(0))) {
            m12521R1();
        } else {
            m12523U1((C3044t) this.f9375h0.mo15341i(b.mo10416U(), C3044t.class));
        }
    }

    /* renamed from: T1 */
    public /* synthetic */ void mo10232T1(int i) {
        this.f9377j0.f9136b.mo4225q1(i - 1);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9372e0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.class_schedule));
            return;
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
        this.f9377j0 = C2849o.m12385c(layoutInflater);
        this.f9371d0 = mo3242y();
        return this.f9377j0.mo10175b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9372e0 = null;
    }
}
