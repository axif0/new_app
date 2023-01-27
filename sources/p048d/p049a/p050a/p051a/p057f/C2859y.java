package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import com.karumi.dexter.C2722R;
import p081de.hdodenhof.circleimageview.CircleImageView;

/* renamed from: d.a.a.a.f.y */
public final class C2859y {

    /* renamed from: A */
    public final TextView f9235A;

    /* renamed from: B */
    public final TextView f9236B;

    /* renamed from: C */
    public final TextView f9237C;

    /* renamed from: D */
    public final TextView f9238D;

    /* renamed from: E */
    public final TextView f9239E;

    /* renamed from: F */
    public final TextView f9240F;

    /* renamed from: G */
    public final TextView f9241G;

    /* renamed from: H */
    public final TextView f9242H;

    /* renamed from: I */
    public final TextView f9243I;

    /* renamed from: a */
    private final RelativeLayout f9244a;

    /* renamed from: b */
    public final CardView f9245b;

    /* renamed from: c */
    public final ImageView f9246c;

    /* renamed from: d */
    public final ImageView f9247d;

    /* renamed from: e */
    public final ImageView f9248e;

    /* renamed from: f */
    public final CircleImageView f9249f;

    /* renamed from: g */
    public final LinearLayout f9250g;

    /* renamed from: h */
    public final LinearLayout f9251h;

    /* renamed from: i */
    public final LinearLayout f9252i;

    /* renamed from: j */
    public final LinearLayout f9253j;

    /* renamed from: k */
    public final LinearLayout f9254k;

    /* renamed from: l */
    public final LinearLayout f9255l;

    /* renamed from: m */
    public final LinearLayout f9256m;

    /* renamed from: n */
    public final LinearLayout f9257n;

    /* renamed from: o */
    public final LinearLayout f9258o;

    /* renamed from: p */
    public final ListView f9259p;

    /* renamed from: q */
    public final ListView f9260q;

    /* renamed from: r */
    public final ListView f9261r;

    /* renamed from: s */
    public final NestedScrollView f9262s;

    /* renamed from: t */
    public final TextView f9263t;

    /* renamed from: u */
    public final TextView f9264u;

    /* renamed from: v */
    public final TextView f9265v;

    /* renamed from: w */
    public final TextView f9266w;

    /* renamed from: x */
    public final TextView f9267x;

    /* renamed from: y */
    public final TextView f9268y;

    /* renamed from: z */
    public final TextView f9269z;

    private C2859y(RelativeLayout relativeLayout, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, CircleImageView circleImageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, ListView listView, ListView listView2, ListView listView3, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16) {
        this.f9244a = relativeLayout;
        this.f9245b = cardView;
        this.f9246c = imageView;
        this.f9247d = imageView2;
        this.f9248e = imageView3;
        this.f9249f = circleImageView;
        this.f9250g = linearLayout;
        this.f9251h = linearLayout2;
        this.f9252i = linearLayout3;
        this.f9253j = linearLayout4;
        this.f9254k = linearLayout5;
        this.f9255l = linearLayout6;
        this.f9256m = linearLayout7;
        this.f9257n = linearLayout8;
        this.f9258o = linearLayout9;
        this.f9259p = listView;
        this.f9260q = listView2;
        this.f9261r = listView3;
        this.f9262s = nestedScrollView;
        this.f9263t = textView;
        this.f9264u = textView2;
        this.f9265v = textView3;
        this.f9266w = textView4;
        this.f9267x = textView5;
        this.f9268y = textView6;
        this.f9269z = textView7;
        this.f9235A = textView8;
        this.f9236B = textView9;
        this.f9237C = textView10;
        this.f9238D = textView11;
        this.f9239E = textView12;
        this.f9240F = textView13;
        this.f9241G = textView14;
        this.f9242H = textView15;
        this.f9243I = textView16;
    }

    /* renamed from: a */
    public static C2859y m12424a(View view) {
        View view2 = view;
        int i = C2722R.C2724id.cv_result_layout;
        CardView cardView = (CardView) view2.findViewById(C2722R.C2724id.cv_result_layout);
        if (cardView != null) {
            i = C2722R.C2724id.imv_class_list_collapse;
            ImageView imageView = (ImageView) view2.findViewById(C2722R.C2724id.imv_class_list_collapse);
            if (imageView != null) {
                i = C2722R.C2724id.imv_exam_list_collapse;
                ImageView imageView2 = (ImageView) view2.findViewById(C2722R.C2724id.imv_exam_list_collapse);
                if (imageView2 != null) {
                    i = C2722R.C2724id.imv_payment_list_collapse;
                    ImageView imageView3 = (ImageView) view2.findViewById(C2722R.C2724id.imv_payment_list_collapse);
                    if (imageView3 != null) {
                        i = C2722R.C2724id.imv_profile_picture;
                        CircleImageView circleImageView = (CircleImageView) view2.findViewById(C2722R.C2724id.imv_profile_picture);
                        if (circleImageView != null) {
                            i = C2722R.C2724id.ll_additional_info_layout;
                            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_additional_info_layout);
                            if (linearLayout != null) {
                                i = C2722R.C2724id.ll_credit_completed;
                                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_credit_completed);
                                if (linearLayout2 != null) {
                                    i = C2722R.C2724id.ll_current_cgpa;
                                    LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_current_cgpa);
                                    if (linearLayout3 != null) {
                                        i = C2722R.C2724id.ll_exam_layout;
                                        LinearLayout linearLayout4 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_exam_layout);
                                        if (linearLayout4 != null) {
                                            i = C2722R.C2724id.ll_notification_layout;
                                            LinearLayout linearLayout5 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_notification_layout);
                                            if (linearLayout5 != null) {
                                                i = C2722R.C2724id.ll_payment_history_parent;
                                                LinearLayout linearLayout6 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_payment_history_parent);
                                                if (linearLayout6 != null) {
                                                    i = C2722R.C2724id.ll_payment_layout;
                                                    LinearLayout linearLayout7 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_payment_layout);
                                                    if (linearLayout7 != null) {
                                                        i = C2722R.C2724id.ll_profile_brief;
                                                        LinearLayout linearLayout8 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_profile_brief);
                                                        if (linearLayout8 != null) {
                                                            i = C2722R.C2724id.ll_todays_class_layout;
                                                            LinearLayout linearLayout9 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_todays_class_layout);
                                                            if (linearLayout9 != null) {
                                                                i = C2722R.C2724id.lv_exam_list;
                                                                ListView listView = (ListView) view2.findViewById(C2722R.C2724id.lv_exam_list);
                                                                if (listView != null) {
                                                                    i = C2722R.C2724id.lv_payment_status;
                                                                    ListView listView2 = (ListView) view2.findViewById(C2722R.C2724id.lv_payment_status);
                                                                    if (listView2 != null) {
                                                                        i = C2722R.C2724id.lv_todays_class;
                                                                        ListView listView3 = (ListView) view2.findViewById(C2722R.C2724id.lv_todays_class);
                                                                        if (listView3 != null) {
                                                                            i = C2722R.C2724id.nsv_profile_parent_layout;
                                                                            NestedScrollView nestedScrollView = (NestedScrollView) view2.findViewById(C2722R.C2724id.nsv_profile_parent_layout);
                                                                            if (nestedScrollView != null) {
                                                                                i = C2722R.C2724id.tv_credit_attempted;
                                                                                TextView textView = (TextView) view2.findViewById(C2722R.C2724id.tv_credit_attempted);
                                                                                if (textView != null) {
                                                                                    i = C2722R.C2724id.tv_credit_completed;
                                                                                    TextView textView2 = (TextView) view2.findViewById(C2722R.C2724id.tv_credit_completed);
                                                                                    if (textView2 != null) {
                                                                                        i = C2722R.C2724id.tv_current_cgpa;
                                                                                        TextView textView3 = (TextView) view2.findViewById(C2722R.C2724id.tv_current_cgpa);
                                                                                        if (textView3 != null) {
                                                                                            i = C2722R.C2724id.tv_email;
                                                                                            TextView textView4 = (TextView) view2.findViewById(C2722R.C2724id.tv_email);
                                                                                            if (textView4 != null) {
                                                                                                i = C2722R.C2724id.tv_exam_unavailable_message;
                                                                                                TextView textView5 = (TextView) view2.findViewById(C2722R.C2724id.tv_exam_unavailable_message);
                                                                                                if (textView5 != null) {
                                                                                                    i = C2722R.C2724id.tv_mobile;
                                                                                                    TextView textView6 = (TextView) view2.findViewById(C2722R.C2724id.tv_mobile);
                                                                                                    if (textView6 != null) {
                                                                                                        i = C2722R.C2724id.tv_notification_message;
                                                                                                        TextView textView7 = (TextView) view2.findViewById(C2722R.C2724id.tv_notification_message);
                                                                                                        if (textView7 != null) {
                                                                                                            i = C2722R.C2724id.tv_notification_time;
                                                                                                            TextView textView8 = (TextView) view2.findViewById(C2722R.C2724id.tv_notification_time);
                                                                                                            if (textView8 != null) {
                                                                                                                i = C2722R.C2724id.tv_notification_title;
                                                                                                                TextView textView9 = (TextView) view2.findViewById(C2722R.C2724id.tv_notification_title);
                                                                                                                if (textView9 != null) {
                                                                                                                    i = C2722R.C2724id.tv_notification_unavailable_message;
                                                                                                                    TextView textView10 = (TextView) view2.findViewById(C2722R.C2724id.tv_notification_unavailable_message);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i = C2722R.C2724id.tv_payment_unavailable_message;
                                                                                                                        TextView textView11 = (TextView) view2.findViewById(C2722R.C2724id.tv_payment_unavailable_message);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i = C2722R.C2724id.tv_profile_data_warning;
                                                                                                                            TextView textView12 = (TextView) view2.findViewById(C2722R.C2724id.tv_profile_data_warning);
                                                                                                                            if (textView12 != null) {
                                                                                                                                i = C2722R.C2724id.tv_profile_name;
                                                                                                                                TextView textView13 = (TextView) view2.findViewById(C2722R.C2724id.tv_profile_name);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    i = C2722R.C2724id.tv_program_name;
                                                                                                                                    TextView textView14 = (TextView) view2.findViewById(C2722R.C2724id.tv_program_name);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i = C2722R.C2724id.tv_student_id;
                                                                                                                                        TextView textView15 = (TextView) view2.findViewById(C2722R.C2724id.tv_student_id);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i = C2722R.C2724id.tv_todays_class_unavailable_message;
                                                                                                                                            TextView textView16 = (TextView) view2.findViewById(C2722R.C2724id.tv_todays_class_unavailable_message);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                return new C2859y((RelativeLayout) view2, cardView, imageView, imageView2, imageView3, circleImageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, listView, listView2, listView3, nestedScrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16);
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
    public static C2859y m12425c(LayoutInflater layoutInflater) {
        return m12426d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2859y m12426d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_student_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12424a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10185b() {
        return this.f9244a;
    }
}
