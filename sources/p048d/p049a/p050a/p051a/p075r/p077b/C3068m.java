package p048d.p049a.p050a.p051a.p075r.p077b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.List;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p057f.C2846l;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p071o.p072a.C3023h0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3028k;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p148g.p189d.p289c.C5221f;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.r.b.m */
public class C3068m extends C2961b {

    /* renamed from: d0 */
    private C2971d f9775d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Context f9776e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public String f9777f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C5221f f9778g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C2846l f9779h0;

    /* renamed from: d.a.a.a.r.b.m$a */
    class C3069a implements C6314d<C3023h0> {
        C3069a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3023h0> bVar, C6372r<C3023h0> rVar) {
            boolean z;
            C3068m mVar;
            C3068m.this.mo10294J1();
            if (rVar.mo17995d()) {
                C3023h0 a = rVar.mo17993a();
                if (a == null || a.mo10513a() == null || a.mo10513a().size() <= 0) {
                    mVar = C3068m.this;
                    z = true;
                } else {
                    C3068m.this.m13126T1(a);
                    C3001i.m12806f(C3068m.this.f9776e0).mo10346e(C3097j.f9871c.mo10614e().longValue(), C3068m.this.f9777f0, C3068m.this.f9778g0.mo15349r(a));
                    C3068m.this.f9779h0.f9127e.setVisibility(8);
                    return;
                }
            } else {
                mVar = C3068m.this;
                z = false;
            }
            mVar.m13128V1(z);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3023h0> bVar, Throwable th) {
            C3068m.this.mo10294J1();
            th.printStackTrace();
            C3068m.this.m13128V1(false);
        }
    }

    /* renamed from: d.a.a.a.r.b.m$b */
    private class C3070b extends ArrayAdapter<C3028k> {

        /* renamed from: f */
        private List<C3028k> f9781f;

        private C3070b(List<C3028k> list) {
            super(C3068m.this.f9776e0, C2722R.layout.rv_advised_course_item);
            this.f9781f = list;
        }

        /* synthetic */ C3070b(C3068m mVar, List list, C3069a aVar) {
            this(list);
        }

        public int getCount() {
            List<C3028k> list = this.f9781f;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C3068m.this.mo3143F().inflate(C2722R.layout.rv_advised_course_item, viewGroup, false);
            }
            C3028k kVar = this.f9781f.get(i);
            ((TextView) view.findViewById(C2722R.C2724id.tv_course_name)).setText(kVar.mo10529a());
            ((TextView) view.findViewById(C2722R.C2724id.tv_course_credit)).setText(String.format(Locale.getDefault(), "%s", new Object[]{kVar.mo10530b()}));
            return view;
        }
    }

    /* renamed from: S1 */
    private void m13125S1() {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10639i(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e()).mo17940X(new C3069a());
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public void m13126T1(C3023h0 h0Var) {
        List<C3028k> a = h0Var.mo10513a();
        if (a == null || a.size() <= 0) {
            m13128V1(true);
            return;
        }
        String c = a.get(0).mo10531c();
        this.f9779h0.f9126d.setText(String.format("Session: %s", new Object[]{c}));
        this.f9779h0.f9124b.setVisibility(0);
        this.f9779h0.f9125c.setAdapter(new C3070b(this, a, (C3069a) null));
        this.f9779h0.f9127e.setVisibility(8);
    }

    /* renamed from: U1 */
    public static C3068m m13127U1() {
        return new C3068m();
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public void m13128V1(boolean z) {
        this.f9779h0.f9127e.setVisibility(0);
        if (z) {
            Toast.makeText(this.f9776e0, mo3169S(C2722R.string.no_advised_courses_available), 1).show();
        } else {
            C3101n.m13300N(this.f9776e0, "Sorry, Advised Course Can't be loaded");
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_refresh) {
            return super.mo396D0(menuItem);
        }
        if (!C3101n.m13328w(this.f9776e0)) {
            C3101n.m13303R(this.f9776e0);
            return true;
        }
        m13125S1();
        return true;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        C3023h0 h0Var;
        super.mo341O0(view, bundle);
        this.f9777f0 = mo3169S(C2722R.string.base_url).concat(mo3169S(C2722R.string.endpoint_show_advised_courses));
        this.f9778g0 = new C5221f();
        C3006c b = C3001i.m12806f(this.f9776e0).mo10345b(C3097j.f9871c.mo10614e().longValue(), this.f9777f0, 7);
        if (b == null || C3101n.m13319m(b.mo10417V()) > C3101n.m13319m(C3101n.m13317k(0)) || (h0Var = (C3023h0) this.f9778g0.mo15341i(b.mo10416U(), C3023h0.class)) == null) {
            m13125S1();
        } else {
            m13126T1(h0Var);
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9775d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.advised_courses));
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
        this.f9779h0 = C2846l.m12373c(layoutInflater);
        this.f9776e0 = mo3242y();
        return this.f9779h0.mo10172b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9775d0 = null;
    }
}
