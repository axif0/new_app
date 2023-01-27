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
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p057f.C2860z;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p071o.p072a.C3015d0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3033m0;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p075r.p076a.C3054a;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p148g.p189d.p289c.C5221f;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.r.b.s */
public class C3086s extends C2961b {

    /* renamed from: d0 */
    private C2971d f9845d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Context f9846e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public String f9847f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C5221f f9848g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C2860z f9849h0;

    /* renamed from: d.a.a.a.r.b.s$a */
    class C3087a implements C6314d<C3033m0> {
        C3087a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3033m0> bVar, C6372r<C3033m0> rVar) {
            boolean z;
            C3086s sVar;
            C3086s.this.mo10294J1();
            if (rVar.mo17995d()) {
                C3033m0 a = rVar.mo17993a();
                if (a == null || a.mo10553a().booleanValue()) {
                    sVar = C3086s.this;
                    z = true;
                } else {
                    C3086s.this.m13264T1(a);
                    C3001i.m12806f(C3086s.this.f9846e0).mo10346e(C3097j.f9871c.mo10614e().longValue(), C3086s.this.f9847f0, C3086s.this.f9848g0.mo15349r(a));
                    C3086s.this.f9849h0.f9275f.setVisibility(8);
                    return;
                }
            } else {
                sVar = C3086s.this;
                z = false;
            }
            sVar.m13266V1(z);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3033m0> bVar, Throwable th) {
            C3086s.this.mo10294J1();
            th.printStackTrace();
            C3086s.this.m13266V1(false);
        }
    }

    /* renamed from: S1 */
    private void m13263S1() {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10634d(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e()).mo17940X(new C3087a());
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public void m13264T1(C3033m0 m0Var) {
        this.f9849h0.f9275f.setVisibility(8);
        C3015d0 d0Var = m0Var.mo10554b().get(0);
        this.f9849h0.f9274e.setText("Student ID: " + d0Var.mo10490b());
        this.f9849h0.f9273d.setText("Student Name: " + d0Var.mo10489a());
        this.f9849h0.f9272c.setAdapter(new C3054a(this.f9846e0, d0Var.mo10491c()));
    }

    /* renamed from: U1 */
    public static C3086s m13265U1() {
        return new C3086s();
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public void m13266V1(boolean z) {
        this.f9849h0.f9275f.setVisibility(0);
        if (z) {
            Toast.makeText(this.f9846e0, mo3169S(C2722R.string.no_data_found), 1).show();
        } else {
            C3101n.m13300N(this.f9846e0, "Sorry, Semester Result Can't be loaded");
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_refresh) {
            return super.mo396D0(menuItem);
        }
        if (!C3101n.m13328w(this.f9846e0)) {
            C3101n.m13303R(this.f9846e0);
            return true;
        }
        m13263S1();
        return true;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f9847f0 = mo3169S(C2722R.string.base_url).concat(mo3169S(C2722R.string.endpoint_student_result_for_android));
        this.f9848g0 = new C5221f();
        C3006c b = C3001i.m12806f(this.f9846e0).mo10345b(C3097j.f9871c.mo10614e().longValue(), this.f9847f0, 7);
        if (b == null || C3101n.m13319m(b.mo10417V()) > C3101n.m13319m(C3101n.m13317k(0))) {
            m13263S1();
        } else {
            m13264T1((C3033m0) this.f9848g0.mo15341i(b.mo10416U(), C3033m0.class));
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9845d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_semester_result));
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
        this.f9849h0 = C2860z.m12429c(layoutInflater);
        this.f9846e0 = mo3242y();
        return this.f9849h0.mo10186b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9845d0 = null;
    }
}
