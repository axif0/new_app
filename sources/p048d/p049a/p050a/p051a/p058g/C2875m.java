package p048d.p049a.p050a.p051a.p058g;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.C0632c;
import androidx.fragment.app.C0636d;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.List;
import java.util.Objects;
import p048d.p049a.p050a.p051a.p057f.C2844j;
import p048d.p049a.p050a.p051a.p058g.C2871k;
import p048d.p049a.p050a.p051a.p059h.C2881d;
import p048d.p049a.p050a.p051a.p064k.C2977j;
import p048d.p049a.p050a.p051a.p071o.p072a.C3019f0;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.g.m */
public class C2875m extends C0632c {

    /* renamed from: p0 */
    private Context f9302p0;

    /* renamed from: q0 */
    private C0636d f9303q0;

    /* renamed from: r0 */
    private List<Integer> f9304r0;

    /* renamed from: s0 */
    private List<String> f9305s0;

    /* renamed from: t0 */
    private String f9306t0;

    /* renamed from: u0 */
    private String f9307u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public C2977j f9308v0;

    /* renamed from: w0 */
    private C2844j f9309w0;

    /* renamed from: d.a.a.a.g.m$a */
    class C2876a implements C6314d<C3019f0> {
        C2876a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3019f0> bVar, C6372r<C3019f0> rVar) {
            C3019f0 a;
            C3101n.m13313g();
            if (!rVar.mo17995d() || (a = rVar.mo17993a()) == null || a.mo10504b().booleanValue()) {
                C2875m.this.m12454d2(C2881d.PUSH_FAILED, (C3019f0) null);
            } else {
                C2875m.this.m12454d2(C2881d.PUSH_SUCCESSFUL, a);
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3019f0> bVar, Throwable th) {
            C2875m.this.m12454d2(C2881d.PUSH_FAILED, (C3019f0) null);
            C3101n.m13313g();
            th.printStackTrace();
        }
    }

    /* renamed from: d.a.a.a.g.m$b */
    class C2877b implements C2871k.C2872a {

        /* renamed from: a */
        final /* synthetic */ boolean f9311a;

        /* renamed from: b */
        final /* synthetic */ C2881d f9312b;

        C2877b(boolean z, C2881d dVar) {
            this.f9311a = z;
            this.f9312b = dVar;
        }

        /* renamed from: a */
        public void mo430a(Dialog dialog) {
            C2875m.this.f9308v0.mo10268b(this.f9312b);
            dialog.dismiss();
            C2875m.this.mo3284L1();
        }

        /* renamed from: b */
        public void mo431b(Dialog dialog) {
            dialog.dismiss();
            if (this.f9311a) {
                C2875m.this.m12456f2();
                return;
            }
            C2875m.this.f9308v0.mo10268b(this.f9312b);
            C2875m.this.mo3284L1();
        }
    }

    static {
        Class<C2875m> cls = C2875m.class;
    }

    /* renamed from: c2 */
    public static C2875m m12453c2(List<Integer> list, List<String> list2, C2977j jVar) {
        C2875m mVar = new C2875m();
        mVar.m12457g2(list, list2, jVar);
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public void m12454d2(C2881d dVar, C3019f0 f0Var) {
        boolean z;
        String str;
        String str2;
        if (dVar == C2881d.PUSH_SUCCESSFUL) {
            str2 = f0Var != null ? f0Var.mo10503a() : mo3169S(C2722R.string.notification_sent_successfully);
            str = mo3169S(C2722R.string.text_ok);
            z = false;
        } else {
            str2 = mo3169S(C2722R.string.notification_sent_failed);
            str = mo3169S(C2722R.string.text_retry);
            z = true;
        }
        new C2871k(this.f9302p0, BuildConfig.FLAVOR, str2, str, z, new C2877b(z, dVar)).mo10199c();
    }

    /* renamed from: e2 */
    private void m12455e2(View view) {
        if (view.requestFocus()) {
            this.f9303q0.getWindow().setSoftInputMode(5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public void m12456f2() {
        C3101n.m13304S(this.f9302p0, mo3169S(C2722R.string.sending_notification));
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10641k(C3097j.f9871c.mo10610a(), C3097j.f9871c.mo10611b(), BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), this.f9304r0.toString(), this.f9305s0.toString().replace("[", BuildConfig.FLAVOR).replace("]", BuildConfig.FLAVOR), this.f9306t0, this.f9307u0, BuildConfig.FLAVOR + this.f9309w0.f9103e.isChecked(), BuildConfig.FLAVOR + this.f9309w0.f9102d.isChecked()).mo17940X(new C2876a());
    }

    /* renamed from: g2 */
    private void m12457g2(List<Integer> list, List<String> list2, C2977j jVar) {
        this.f9304r0 = list;
        this.f9305s0 = list2;
        this.f9308v0 = jVar;
    }

    /* renamed from: h2 */
    private boolean m12458h2() {
        String obj = this.f9309w0.f9105g.getText().toString();
        this.f9306t0 = obj;
        if (TextUtils.isEmpty(obj)) {
            this.f9309w0.f9105g.setError(mo3169S(C2722R.string.text_edit_field_error));
            m12455e2(this.f9309w0.f9105g);
            return false;
        }
        String obj2 = this.f9309w0.f9104f.getText().toString();
        this.f9307u0 = obj2;
        if (TextUtils.isEmpty(obj2)) {
            this.f9309w0.f9104f.setError(mo3169S(C2722R.string.text_edit_field_error));
            m12455e2(this.f9309w0.f9104f);
            return false;
        } else if (this.f9309w0.f9103e.isChecked() || this.f9309w0.f9102d.isChecked()) {
            return true;
        } else {
            C3101n.m13300N(this.f9302p0, mo3169S(C2722R.string.check_sms_or_notification));
            return false;
        }
    }

    /* renamed from: K0 */
    public void mo540K0() {
        super.mo540K0();
        double d = (double) this.f9302p0.getResources().getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        int i = this.f9302p0.getResources().getDisplayMetrics().heightPixels;
        Dialog O1 = mo3286O1();
        ((Window) Objects.requireNonNull(O1.getWindow())).setLayout((int) (d * 0.75d), i);
        Window window = O1.getWindow();
        window.setLayout(-1, -2);
        window.setGravity(17);
        O1.getWindow().setSoftInputMode(2);
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f9309w0.f9100b.setOnClickListener(new C2869i(this));
        this.f9309w0.f9101c.setOnClickListener(new C2870j(this));
    }

    /* renamed from: Q1 */
    public Dialog mo542Q1(Bundle bundle) {
        return super.mo542Q1(bundle);
    }

    /* renamed from: a2 */
    public /* synthetic */ void mo10207a2(View view) {
        mo3284L1();
    }

    /* renamed from: b2 */
    public /* synthetic */ void mo10208b2(View view) {
        if (m12458h2()) {
            m12456f2();
        }
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        this.f9302p0 = mo3242y();
        this.f9303q0 = mo3215o();
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9309w0 = C2844j.m12365c(layoutInflater);
        Dialog O1 = mo3286O1();
        if (O1 != null) {
            O1.requestWindowFeature(1);
        }
        mo3289S1(false);
        return this.f9309w0.mo10170b();
    }
}
