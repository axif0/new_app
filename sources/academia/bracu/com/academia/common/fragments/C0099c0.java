package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.fragment.app.C0675u;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.review.C2440a;
import com.google.android.play.core.review.C2441b;
import com.google.android.play.core.review.ReviewInfo;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p057f.C2857w;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p148g.p189d.p190a.p271e.p272a.p280g.C5152e;

/* renamed from: academia.bracu.com.academia.common.fragments.c0 */
public class C0099c0 extends Fragment {

    /* renamed from: b0 */
    private Context f404b0;

    /* renamed from: c0 */
    private C2857w f405c0;

    /* renamed from: d0 */
    private C2440a f406d0;

    /* renamed from: e0 */
    private ReviewInfo f407e0;

    /* renamed from: J1 */
    private void m384J1() {
        if (this.f407e0 != null) {
            C5152e<Void> a = this.f406d0.mo9285a(mo3214n1(), this.f407e0);
            a.mo15247b(new C0116n(this));
            a.mo15246a(new C0117o(this));
        }
    }

    /* renamed from: K1 */
    private void m385K1() {
        C2440a a = C2441b.m11102a(this.f404b0);
        this.f406d0 = a;
        a.mo9286b().mo15246a(new C0114l(this));
    }

    /* renamed from: Q1 */
    public static C0099c0 m386Q1() {
        return new C0099c0();
    }

    /* renamed from: L1 */
    public /* synthetic */ void mo365L1(Exception exc) {
        Toast.makeText(this.f404b0, "Failed", 0).show();
        exc.printStackTrace();
    }

    /* renamed from: M1 */
    public /* synthetic */ void mo366M1(C5152e eVar) {
        Toast.makeText(this.f404b0, "Thank you", 0).show();
    }

    /* renamed from: N1 */
    public /* synthetic */ void mo367N1(C5152e eVar) {
        if (eVar.mo15254i()) {
            this.f407e0 = (ReviewInfo) eVar.mo15252g();
        } else {
            Toast.makeText(this.f404b0, "Something went wrong", 0).show();
        }
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        C0675u i = mo3240x().mo3440i();
        i.mo3561b(C2722R.C2724id.settings_container, new C0101d0());
        i.mo3262i();
        this.f405c0.f9226c.setChecked(C3099l.m13277b(this.f404b0).mo10689a("enable_show_cgpa"));
        this.f405c0.f9226c.setOnCheckedChangeListener(new C0113k(this));
        m385K1();
        this.f405c0.f9225b.setOnClickListener(new C0115m(this));
    }

    /* renamed from: O1 */
    public /* synthetic */ void mo368O1(CompoundButton compoundButton, boolean z) {
        C3099l.m13277b(this.f404b0).mo10694g("enable_show_cgpa", z);
    }

    /* renamed from: P1 */
    public /* synthetic */ void mo369P1(View view) {
        m384J1();
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f405c0 = C2857w.m12417c(layoutInflater);
        this.f404b0 = mo3242y();
        return this.f405c0.mo10183b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
    }
}
