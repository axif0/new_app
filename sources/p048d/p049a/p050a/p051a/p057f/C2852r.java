package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.florent37.shapeofview.shapes.CircleView;
import com.github.florent37.shapeofview.shapes.DiagonalView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.r */
public final class C2852r {

    /* renamed from: a */
    private final RelativeLayout f9161a;

    /* renamed from: b */
    public final CircleView f9162b;

    /* renamed from: c */
    public final DiagonalView f9163c;

    /* renamed from: d */
    public final TextView f9164d;

    /* renamed from: e */
    public final TextView f9165e;

    /* renamed from: f */
    public final LinearLayout f9166f;

    /* renamed from: g */
    public final ScrollView f9167g;

    /* renamed from: h */
    public final TextView f9168h;

    /* renamed from: i */
    public final TextView f9169i;

    /* renamed from: j */
    public final TextView f9170j;

    /* renamed from: k */
    public final TextView f9171k;

    /* renamed from: l */
    public final TextView f9172l;

    /* renamed from: m */
    public final TextView f9173m;

    private C2852r(RelativeLayout relativeLayout, CircleView circleView, DiagonalView diagonalView, TextView textView, TextView textView2, LinearLayout linearLayout, ScrollView scrollView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f9161a = relativeLayout;
        this.f9162b = circleView;
        this.f9163c = diagonalView;
        this.f9164d = textView;
        this.f9165e = textView2;
        this.f9166f = linearLayout;
        this.f9167g = scrollView;
        this.f9168h = textView3;
        this.f9169i = textView4;
        this.f9170j = textView5;
        this.f9171k = textView6;
        this.f9172l = textView7;
        this.f9173m = textView8;
    }

    /* renamed from: a */
    public static C2852r m12396a(View view) {
        View view2 = view;
        int i = C2722R.C2724id.avatar;
        CircleView circleView = (CircleView) view2.findViewById(C2722R.C2724id.avatar);
        if (circleView != null) {
            i = C2722R.C2724id.diagonalLayout;
            DiagonalView diagonalView = (DiagonalView) view2.findViewById(C2722R.C2724id.diagonalLayout);
            if (diagonalView != null) {
                i = C2722R.C2724id.profileEmail3;
                TextView textView = (TextView) view2.findViewById(C2722R.C2724id.profileEmail3);
                if (textView != null) {
                    i = C2722R.C2724id.profileNumber2;
                    TextView textView2 = (TextView) view2.findViewById(C2722R.C2724id.profileNumber2);
                    if (textView2 != null) {
                        i = C2722R.C2724id.relativeLayout4;
                        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2722R.C2724id.relativeLayout4);
                        if (linearLayout != null) {
                            i = C2722R.C2724id.sv_profile_info;
                            ScrollView scrollView = (ScrollView) view2.findViewById(C2722R.C2724id.sv_profile_info);
                            if (scrollView != null) {
                                i = C2722R.C2724id.tv_department;
                                TextView textView3 = (TextView) view2.findViewById(C2722R.C2724id.tv_department);
                                if (textView3 != null) {
                                    i = C2722R.C2724id.tv_email;
                                    TextView textView4 = (TextView) view2.findViewById(C2722R.C2724id.tv_email);
                                    if (textView4 != null) {
                                        i = C2722R.C2724id.tv_full_name;
                                        TextView textView5 = (TextView) view2.findViewById(C2722R.C2724id.tv_full_name);
                                        if (textView5 != null) {
                                            i = C2722R.C2724id.tv_mobile;
                                            TextView textView6 = (TextView) view2.findViewById(C2722R.C2724id.tv_mobile);
                                            if (textView6 != null) {
                                                i = C2722R.C2724id.tv_short_name;
                                                TextView textView7 = (TextView) view2.findViewById(C2722R.C2724id.tv_short_name);
                                                if (textView7 != null) {
                                                    i = C2722R.C2724id.tv_unavailable_message;
                                                    TextView textView8 = (TextView) view2.findViewById(C2722R.C2724id.tv_unavailable_message);
                                                    if (textView8 != null) {
                                                        return new C2852r((RelativeLayout) view2, circleView, diagonalView, textView, textView2, linearLayout, scrollView, textView3, textView4, textView5, textView6, textView7, textView8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2852r m12397c(LayoutInflater layoutInflater) {
        return m12398d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2852r m12398d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_faculty_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12396a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10178b() {
        return this.f9161a;
    }
}
