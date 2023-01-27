package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import p081de.hdodenhof.circleimageview.CircleImageView;

/* renamed from: d.a.a.a.f.k */
public final class C2845k {

    /* renamed from: a */
    private final RelativeLayout f9109a;

    /* renamed from: b */
    public final CircleImageView f9110b;

    /* renamed from: c */
    public final LinearLayout f9111c;

    /* renamed from: d */
    public final LinearLayout f9112d;

    /* renamed from: e */
    public final RelativeLayout f9113e;

    /* renamed from: f */
    public final ProgressBar f9114f;

    /* renamed from: g */
    public final LinearLayout f9115g;

    /* renamed from: h */
    public final TextView f9116h;

    /* renamed from: i */
    public final TextView f9117i;

    /* renamed from: j */
    public final TextView f9118j;

    /* renamed from: k */
    public final TextView f9119k;

    /* renamed from: l */
    public final TextView f9120l;

    /* renamed from: m */
    public final TextView f9121m;

    /* renamed from: n */
    public final TextView f9122n;

    private C2845k(RelativeLayout relativeLayout, CircleImageView circleImageView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, ProgressBar progressBar, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f9109a = relativeLayout;
        this.f9110b = circleImageView;
        this.f9111c = linearLayout;
        this.f9112d = linearLayout2;
        this.f9113e = relativeLayout2;
        this.f9114f = progressBar;
        this.f9115g = linearLayout3;
        this.f9116h = textView;
        this.f9117i = textView2;
        this.f9118j = textView3;
        this.f9119k = textView4;
        this.f9120l = textView5;
        this.f9121m = textView6;
        this.f9122n = textView7;
    }

    /* renamed from: a */
    public static C2845k m12368a(View view) {
        View view2 = view;
        int i = C2722R.C2724id.imv_profile_picture;
        CircleImageView circleImageView = (CircleImageView) view2.findViewById(C2722R.C2724id.imv_profile_picture);
        if (circleImageView != null) {
            i = C2722R.C2724id.ll_loader_layout;
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_loader_layout);
            if (linearLayout != null) {
                i = C2722R.C2724id.ll_real_data;
                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_real_data);
                if (linearLayout2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view2;
                    i = C2722R.C2724id.pb_loading_data;
                    ProgressBar progressBar = (ProgressBar) view2.findViewById(C2722R.C2724id.pb_loading_data);
                    if (progressBar != null) {
                        i = C2722R.C2724id.popUpLayout;
                        LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(C2722R.C2724id.popUpLayout);
                        if (linearLayout3 != null) {
                            i = C2722R.C2724id.tv_action_close;
                            TextView textView = (TextView) view2.findViewById(C2722R.C2724id.tv_action_close);
                            if (textView != null) {
                                i = C2722R.C2724id.tv_progress_message;
                                TextView textView2 = (TextView) view2.findViewById(C2722R.C2724id.tv_progress_message);
                                if (textView2 != null) {
                                    i = C2722R.C2724id.tv_student_email;
                                    TextView textView3 = (TextView) view2.findViewById(C2722R.C2724id.tv_student_email);
                                    if (textView3 != null) {
                                        i = C2722R.C2724id.tv_student_intake;
                                        TextView textView4 = (TextView) view2.findViewById(C2722R.C2724id.tv_student_intake);
                                        if (textView4 != null) {
                                            i = C2722R.C2724id.tv_student_mobile;
                                            TextView textView5 = (TextView) view2.findViewById(C2722R.C2724id.tv_student_mobile);
                                            if (textView5 != null) {
                                                i = C2722R.C2724id.tv_student_name;
                                                TextView textView6 = (TextView) view2.findViewById(C2722R.C2724id.tv_student_name);
                                                if (textView6 != null) {
                                                    i = C2722R.C2724id.tv_student_program;
                                                    TextView textView7 = (TextView) view2.findViewById(C2722R.C2724id.tv_student_program);
                                                    if (textView7 != null) {
                                                        return new C2845k(relativeLayout, circleImageView, linearLayout, linearLayout2, relativeLayout, progressBar, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static C2845k m12369c(LayoutInflater layoutInflater) {
        return m12370d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2845k m12370d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.dialog_student_brief, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12368a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10171b() {
        return this.f9109a;
    }
}
