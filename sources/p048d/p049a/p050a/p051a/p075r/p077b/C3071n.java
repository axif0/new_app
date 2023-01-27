package p048d.p049a.p050a.p051a.p075r.p077b;

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
import com.github.vipulasri.timelineview.p031d.C1432c;
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
import p048d.p049a.p050a.p051a.p057f.C2847m;
import p048d.p049a.p050a.p051a.p059h.C2883f;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p071o.p072a.C3035n0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3037o0;
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

/* renamed from: d.a.a.a.r.b.n */
public class C3071n extends C2961b {

    /* renamed from: d0 */
    private C2971d f9783d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Context f9784e0;

    /* renamed from: f0 */
    private C1436b f9785f0;

    /* renamed from: g0 */
    private List<C3037o0> f9786g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public String f9787h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C5221f f9788i0;

    /* renamed from: j0 */
    private C2847m f9789j0;

    /* renamed from: d.a.a.a.r.b.n$a */
    class C3072a implements C6314d<C3035n0> {
        C3072a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3035n0> bVar, C6372r<C3035n0> rVar) {
            boolean z;
            C3071n nVar;
            C3071n.this.mo10294J1();
            if (rVar.mo17995d()) {
                C3035n0 a = rVar.mo17993a();
                if (a == null || a.mo10559a().booleanValue()) {
                    nVar = C3071n.this;
                    z = true;
                } else {
                    C3071n.this.m13145U1(a);
                    C3001i.m12806f(C3071n.this.f9784e0).mo10346e(C3097j.f9871c.mo10614e().longValue(), C3071n.this.f9787h0, C3071n.this.f9788i0.mo15349r(a));
                    return;
                }
            } else {
                nVar = C3071n.this;
                z = false;
            }
            nVar.m13147W1(z);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3035n0> bVar, Throwable th) {
            C3071n.this.mo10294J1();
            th.printStackTrace();
            C3071n.this.m13147W1(false);
        }
    }

    /* renamed from: d.a.a.a.r.b.n$b */
    class C3073b extends HashMap<Integer, Boolean> {
        C3073b(C3071n nVar, int i) {
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

    /* renamed from: R1 */
    private void m13143R1() {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10636f(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e()).mo17940X(new C3072a());
    }

    /* renamed from: S1 */
    static /* synthetic */ int m13144S1(C3037o0 o0Var, C3037o0 o0Var2) {
        return o0Var.mo10576c() - o0Var2.mo10576c();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public void m13145U1(C3035n0 n0Var) {
        this.f9789j0.f9130c.setVisibility(8);
        List<C3037o0> b = n0Var.mo10560b();
        C3073b bVar = new C3073b(this, 7);
        int a = C3105o.m13337a();
        Calendar instance = Calendar.getInstance();
        for (C3037o0 next : b) {
            int c = C3105o.m13339c(next.mo10575b());
            next.mo10581h(c);
            bVar.put(Integer.valueOf(c), Boolean.TRUE);
        }
        for (int i = 1; i <= bVar.size(); i++) {
            if (!((Boolean) bVar.get(Integer.valueOf(i))).booleanValue()) {
                C3037o0 o0Var = new C3037o0();
                o0Var.mo10581h(i);
                o0Var.mo10580g(C3105o.m13338b(i));
                b.add(o0Var);
            }
        }
        Collections.sort(b, C3056a.f9760f);
        for (C3037o0 next2 : b) {
            int c2 = next2.mo10576c();
            next2.mo10584k(c2 == a ? C2883f.ACTIVE : c2 > a ? C2883f.INACTIVE : C2883f.COMPLETED);
            instance.setTime(C3101n.m13317k(a - c2));
            next2.mo10582i(instance.get(5));
            next2.mo10583j(new SimpleDateFormat("MMM", Locale.getDefault()).format(instance.getTime()));
        }
        this.f9786g0 = b;
        this.f9789j0.f9129b.setAdapter(new C1432c(this.f9784e0, b, this.f9785f0));
        try {
            new Handler().postDelayed(new C3057b(this, a), 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: V1 */
    public static C3071n m13146V1() {
        return new C3071n();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public void m13147W1(boolean z) {
        this.f9789j0.f9130c.setVisibility(0);
        if (!z) {
            C3101n.m13300N(this.f9784e0, "Sorry, Class schedule can not be loaded");
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_refresh) {
            return super.mo396D0(menuItem);
        }
        if (!C3101n.m13328w(this.f9784e0)) {
            C3101n.m13303R(this.f9784e0);
            return true;
        }
        m13143R1();
        return true;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f9788i0 = new C5221f();
        this.f9787h0 = mo3169S(C2722R.string.base_url).concat(mo3169S(C2722R.string.endpoint_show_class_schedule));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f9784e0, 1, false);
        this.f9789j0.f9129b.setHasFixedSize(true);
        this.f9789j0.f9129b.setLayoutManager(linearLayoutManager);
        this.f9785f0 = new C1436b(C1434a.m7107b(mo3158M(), 20.0f), C1434a.m7108c(this.f9784e0, C2722R.color.colorAccent), true, C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 2.0f), C3267a.m14074d(this.f9784e0, C2722R.color.colorAccent), C3267a.m14074d(this.f9784e0, C2722R.color.colorAccent), 0, C1434a.m7107b(mo3158M(), 2.0f), C1434a.m7107b(mo3158M(), 4.0f), C1434a.m7107b(mo3158M(), 2.0f));
        C3006c b = C3001i.m12806f(this.f9784e0).mo10345b(C3097j.f9871c.mo10614e().longValue(), this.f9787h0, 7);
        if (b == null || C3101n.m13319m(b.mo10417V()) > C3101n.m13319m(C3101n.m13317k(0))) {
            m13143R1();
        } else {
            m13145U1((C3035n0) this.f9788i0.mo15341i(b.mo10416U(), C3035n0.class));
        }
    }

    /* renamed from: T1 */
    public /* synthetic */ void mo10663T1(int i) {
        this.f9789j0.f9129b.mo4225q1(i - 1);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9783d0 = dVar;
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
        this.f9789j0 = C2847m.m12377c(layoutInflater);
        this.f9784e0 = mo3242y();
        return this.f9789j0.mo10173b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9783d0 = null;
    }
}
