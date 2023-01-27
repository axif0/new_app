package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p052c.C2821m;
import p048d.p049a.p050a.p051a.p064k.C2971d;

/* renamed from: academia.bracu.com.academia.common.fragments.e0 */
public class C0103e0 extends Fragment {

    /* renamed from: b0 */
    private C2971d f411b0;

    /* renamed from: c0 */
    private Context f412c0;

    /* renamed from: J1 */
    public static C0103e0 m398J1() {
        return new C0103e0();
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        C2821m mVar = new C2821m(this.f412c0, mo3240x());
        ViewPager viewPager = (ViewPager) view.findViewById(C2722R.C2724id.view_pager);
        viewPager.setAdapter(mVar);
        ((TabLayout) view.findViewById(C2722R.C2724id.tabs)).setupWithViewPager(viewPager);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f411b0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.social));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_social_media, viewGroup, false);
        this.f412c0 = mo3242y();
        return inflate;
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f411b0 = null;
    }
}
