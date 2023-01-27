package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.Calendar;
import p048d.p049a.p050a.p051a.p052c.C2801d;
import p048d.p049a.p050a.p051a.p064k.C2971d;

/* renamed from: academia.bracu.com.academia.common.fragments.w */
public class C0130w extends Fragment {

    /* renamed from: b0 */
    private String f459b0;

    /* renamed from: c0 */
    private int f460c0;

    /* renamed from: d0 */
    private Calendar f461d0;

    /* renamed from: e0 */
    private int f462e0;

    /* renamed from: f0 */
    private int f463f0 = 12;

    /* renamed from: g0 */
    private C2971d f464g0;

    static {
        Class<C0130w> cls = C0130w.class;
    }

    public C0130w() {
        Calendar instance = Calendar.getInstance();
        this.f461d0 = instance;
        this.f462e0 = instance.get(1);
    }

    /* renamed from: J1 */
    public static C0130w m458J1() {
        return new C0130w();
    }

    /* renamed from: K1 */
    private void m459K1(ViewPager viewPager) {
        C2801d dVar = new C2801d(mo3240x());
        Bundle bundle = new Bundle();
        bundle.putString("semester", "spring");
        bundle.putString("year", BuildConfig.FLAVOR + this.f462e0);
        C0125v R1 = C0125v.m450R1(bundle);
        dVar.mo10143v(R1, "Spring " + this.f459b0);
        Bundle bundle2 = new Bundle();
        bundle2.putString("semester", "summer");
        bundle2.putString("year", BuildConfig.FLAVOR + this.f462e0);
        C0125v R12 = C0125v.m450R1(bundle2);
        dVar.mo10143v(R12, "Summer " + this.f459b0);
        Bundle bundle3 = new Bundle();
        bundle3.putString("semester", "fall");
        bundle3.putString("year", BuildConfig.FLAVOR + this.f462e0);
        C0125v R13 = C0125v.m450R1(bundle3);
        dVar.mo10143v(R13, "Fall " + this.f459b0);
        viewPager.setAdapter(dVar);
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f463f0 = Calendar.getInstance().get(2) + 1;
        this.f459b0 = Integer.toString(this.f462e0);
        int i = this.f463f0;
        if (i < 1 || i > 4) {
            int i2 = this.f463f0;
            if (i2 < 5 || i2 > 8) {
                int i3 = this.f463f0;
                if (i3 >= 9 && i3 <= 12) {
                    this.f460c0 = 2;
                }
            } else {
                this.f460c0 = 1;
            }
        } else {
            this.f460c0 = 0;
        }
        ViewPager viewPager = (ViewPager) view.findViewById(C2722R.C2724id.view_pager);
        m459K1(viewPager);
        TabLayout tabLayout = (TabLayout) view.findViewById(C2722R.C2724id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        TabLayout.C2256g v = tabLayout.mo8791v(this.f460c0);
        if (v != null) {
            v.mo8823k();
            View childAt = tabLayout.getChildAt(0);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                linearLayout.setShowDividers(2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(mo3158M().getColor(C2722R.color.colorRegularTextHint));
                gradientDrawable.setSize(2, 1);
                linearLayout.setDividerPadding(10);
                linearLayout.setDividerDrawable(gradientDrawable);
            }
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f464g0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_calendar));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2722R.layout.fragment_calendar_holder, viewGroup, false);
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f464g0 = null;
    }
}
