package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.w */
public final class C2857w {

    /* renamed from: a */
    private final LinearLayout f9224a;

    /* renamed from: b */
    public final LinearLayout f9225b;

    /* renamed from: c */
    public final SwitchCompat f9226c;

    /* renamed from: d */
    public final FrameLayout f9227d;

    private C2857w(LinearLayout linearLayout, LinearLayout linearLayout2, SwitchCompat switchCompat, FrameLayout frameLayout) {
        this.f9224a = linearLayout;
        this.f9225b = linearLayout2;
        this.f9226c = switchCompat;
        this.f9227d = frameLayout;
    }

    /* renamed from: a */
    public static C2857w m12416a(View view) {
        int i = C2722R.C2724id.ll_rate_app;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C2722R.C2724id.ll_rate_app);
        if (linearLayout != null) {
            i = C2722R.C2724id.sc_show_cgpa;
            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C2722R.C2724id.sc_show_cgpa);
            if (switchCompat != null) {
                i = C2722R.C2724id.settings_container;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(C2722R.C2724id.settings_container);
                if (frameLayout != null) {
                    return new C2857w((LinearLayout) view, linearLayout, switchCompat, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2857w m12417c(LayoutInflater layoutInflater) {
        return m12418d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2857w m12418d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_setting_holder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12416a(inflate);
    }

    /* renamed from: b */
    public LinearLayout mo10183b() {
        return this.f9224a;
    }
}
