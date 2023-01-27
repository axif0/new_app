package p048d.p049a.p050a.p051a.p075r.p077b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.vipulasri.timelineview.p031d.C1428a;
import com.github.vipulasri.timelineview.p031d.p032d.C1434a;
import com.github.vipulasri.timelineview.p031d.p033e.C1436b;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p057f.C2848n;
import p048d.p049a.p050a.p051a.p059h.C2883f;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p071o.p072a.C3036o;
import p048d.p049a.p050a.p051a.p071o.p072a.C3040q;
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

/* renamed from: d.a.a.a.r.b.o */
public class C3074o extends C2961b {

    /* renamed from: d0 */
    private C2971d f9791d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Context f9792e0;

    /* renamed from: f0 */
    private C1436b f9793f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public String f9794g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C5221f f9795h0;

    /* renamed from: i0 */
    private C2848n f9796i0;

    /* renamed from: d.a.a.a.r.b.o$a */
    class C3075a implements C6314d<C3040q> {
        C3075a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3040q> bVar, C6372r<C3040q> rVar) {
            boolean z;
            C3074o oVar;
            C3074o.this.mo10294J1();
            if (rVar.mo17995d()) {
                C3040q a = rVar.mo17993a();
                if (a == null || a.mo10591b().booleanValue() || a.mo10590a() == null || a.mo10590a().size() <= 0) {
                    oVar = C3074o.this;
                    z = true;
                } else {
                    C3001i.m12806f(C3074o.this.f9792e0).mo10346e(C3097j.f9871c.mo10614e().longValue(), C3074o.this.f9794g0, C3074o.this.f9795h0.mo15349r(a));
                    C3074o.this.m13164S1(a);
                    return;
                }
            } else {
                oVar = C3074o.this;
                z = false;
            }
            oVar.m13166U1(z);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3040q> bVar, Throwable th) {
            C3074o.this.mo10294J1();
            C3074o.this.m13166U1(false);
            th.printStackTrace();
        }
    }

    static {
        Class<C3074o> cls = C3074o.class;
    }

    /* renamed from: R1 */
    private void m13163R1() {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10635e(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e()).mo17940X(new C3075a());
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public void m13164S1(C3040q qVar) {
        this.f9796i0.f9134d.setVisibility(8);
        List<C3036o> a = qVar.mo10590a();
        this.f9796i0.f9133c.setText(a.get(0).mo10569i());
        Calendar instance = Calendar.getInstance();
        Date i = C3101n.m13315i(new Date(), "yyyy-MM-dd HH:mm:ss");
        for (C3036o next : a) {
            Date i2 = C3101n.m13315i(C3101n.m13316j(next.mo10565e() + " 00:00:00", "yyyy-MM-dd HH:mm:ss"), "yyyy-MM-dd HH:mm:ss");
            next.mo10573m(i2.after(i) ? C2883f.INACTIVE : i2.before(i) ? C2883f.COMPLETED : C2883f.ACTIVE);
            instance.setTime(i2);
            next.mo10570j(C3105o.m13338b(instance.get(7) + 1));
            next.mo10571k(instance.get(5));
            next.mo10572l(new SimpleDateFormat("MMM", Locale.getDefault()).format(instance.getTime()));
        }
        this.f9796i0.f9132b.setAdapter(new C1428a(this.f9792e0, a, this.f9793f0));
    }

    /* renamed from: T1 */
    public static C3074o m13165T1() {
        return new C3074o();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public void m13166U1(boolean z) {
        this.f9796i0.f9134d.setVisibility(0);
        if (z) {
            Toast.makeText(this.f9792e0, mo3169S(C2722R.string.no_data_found), 1).show();
        } else {
            C3101n.m13300N(this.f9792e0, "Sorry, Exam Schedule Can not be loaded");
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_refresh) {
            return super.mo396D0(menuItem);
        }
        if (!C3101n.m13328w(this.f9792e0)) {
            C3101n.m13303R(this.f9792e0);
            return true;
        }
        m13163R1();
        return true;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        C3040q qVar;
        super.mo341O0(view, bundle);
        this.f9795h0 = new C5221f();
        this.f9794g0 = mo3169S(C2722R.string.base_url).concat(mo3169S(C2722R.string.endpoint_show_exam_schedule));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f9792e0, 1, false);
        this.f9796i0.f9132b.setHasFixedSize(true);
        this.f9796i0.f9132b.setLayoutManager(linearLayoutManager);
        this.f9793f0 = new C1436b(C1434a.m7107b(mo3158M(), 20.0f), C1434a.m7108c(this.f9792e0, C2722R.color.colorAccent), true, C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 0.0f), C1434a.m7107b(mo3158M(), 2.0f), C3267a.m14074d(this.f9792e0, C2722R.color.colorAccent), C3267a.m14074d(this.f9792e0, C2722R.color.colorAccent), 0, C1434a.m7107b(mo3158M(), 2.0f), C1434a.m7107b(mo3158M(), 4.0f), C1434a.m7107b(mo3158M(), 2.0f));
        C3006c b = C3001i.m12806f(this.f9792e0).mo10345b(C3097j.f9871c.mo10614e().longValue(), this.f9794g0, 7);
        if (b == null || C3101n.m13319m(b.mo10417V()) > C3101n.m13319m(C3101n.m13317k(0)) || (qVar = (C3040q) this.f9795h0.mo15341i(b.mo10416U(), C3040q.class)) == null || qVar.mo10590a() == null || qVar.mo10591b().booleanValue() || qVar.mo10590a().size() <= 0) {
            m13163R1();
            return;
        }
        C3001i.m12806f(this.f9792e0).mo10346e(C3097j.f9871c.mo10614e().longValue(), this.f9794g0, this.f9795h0.mo15349r(qVar));
        m13164S1(qVar);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9791d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.exam_schedule));
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
        this.f9796i0 = C2848n.m12381c(layoutInflater);
        this.f9792e0 = mo3242y();
        return this.f9796i0.mo10174b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9791d0 = null;
    }
}
