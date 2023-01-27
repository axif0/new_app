package p048d.p049a.p050a.p051a.p057f;

import academia.bracu.com.academia.spinner.SearchableSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.s */
public final class C2853s {

    /* renamed from: a */
    private final LinearLayout f9174a;

    /* renamed from: b */
    public final LinearLayout f9175b;

    /* renamed from: c */
    public final LinearLayout f9176c;

    /* renamed from: d */
    public final ProgressBar f9177d;

    /* renamed from: e */
    public final ProgressBar f9178e;

    /* renamed from: f */
    public final ProgressBar f9179f;

    /* renamed from: g */
    public final ProgressBar f9180g;

    /* renamed from: h */
    public final RelativeLayout f9181h;

    /* renamed from: i */
    public final RecyclerView f9182i;

    /* renamed from: j */
    public final C2836b0 f9183j;

    /* renamed from: k */
    public final SearchableSpinner f9184k;

    /* renamed from: l */
    public final SearchableSpinner f9185l;

    /* renamed from: m */
    public final SearchableSpinner f9186m;

    /* renamed from: n */
    public final SearchableSpinner f9187n;

    /* renamed from: o */
    public final TextView f9188o;

    private C2853s(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, RelativeLayout relativeLayout, RecyclerView recyclerView, C2836b0 b0Var, SearchableSpinner searchableSpinner, SearchableSpinner searchableSpinner2, SearchableSpinner searchableSpinner3, SearchableSpinner searchableSpinner4, TextView textView) {
        this.f9174a = linearLayout;
        this.f9175b = linearLayout2;
        this.f9176c = linearLayout3;
        this.f9177d = progressBar;
        this.f9178e = progressBar2;
        this.f9179f = progressBar3;
        this.f9180g = progressBar4;
        this.f9181h = relativeLayout;
        this.f9182i = recyclerView;
        this.f9183j = b0Var;
        this.f9184k = searchableSpinner;
        this.f9185l = searchableSpinner2;
        this.f9186m = searchableSpinner3;
        this.f9187n = searchableSpinner4;
        this.f9188o = textView;
    }

    /* renamed from: a */
    public static C2853s m12400a(View view) {
        View view2 = view;
        int i = C2722R.C2724id.ll_student_list_label;
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_student_list_label);
        if (linearLayout != null) {
            i = C2722R.C2724id.ll_top_layout;
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_top_layout);
            if (linearLayout2 != null) {
                i = C2722R.C2724id.pb_academic_course;
                ProgressBar progressBar = (ProgressBar) view2.findViewById(C2722R.C2724id.pb_academic_course);
                if (progressBar != null) {
                    i = C2722R.C2724id.pb_academic_section;
                    ProgressBar progressBar2 = (ProgressBar) view2.findViewById(C2722R.C2724id.pb_academic_section);
                    if (progressBar2 != null) {
                        i = C2722R.C2724id.pb_academic_session;
                        ProgressBar progressBar3 = (ProgressBar) view2.findViewById(C2722R.C2724id.pb_academic_session);
                        if (progressBar3 != null) {
                            i = C2722R.C2724id.pb_academic_year;
                            ProgressBar progressBar4 = (ProgressBar) view2.findViewById(C2722R.C2724id.pb_academic_year);
                            if (progressBar4 != null) {
                                i = C2722R.C2724id.rl_search_layout;
                                RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2722R.C2724id.rl_search_layout);
                                if (relativeLayout != null) {
                                    i = C2722R.C2724id.rv_result_list;
                                    RecyclerView recyclerView = (RecyclerView) view2.findViewById(C2722R.C2724id.rv_result_list);
                                    if (recyclerView != null) {
                                        i = C2722R.C2724id.search_parent;
                                        View findViewById = view2.findViewById(C2722R.C2724id.search_parent);
                                        if (findViewById != null) {
                                            C2836b0 a = C2836b0.m12347a(findViewById);
                                            i = C2722R.C2724id.sp_academic_course;
                                            SearchableSpinner searchableSpinner = (SearchableSpinner) view2.findViewById(C2722R.C2724id.sp_academic_course);
                                            if (searchableSpinner != null) {
                                                i = C2722R.C2724id.sp_academic_section;
                                                SearchableSpinner searchableSpinner2 = (SearchableSpinner) view2.findViewById(C2722R.C2724id.sp_academic_section);
                                                if (searchableSpinner2 != null) {
                                                    i = C2722R.C2724id.sp_academic_session;
                                                    SearchableSpinner searchableSpinner3 = (SearchableSpinner) view2.findViewById(C2722R.C2724id.sp_academic_session);
                                                    if (searchableSpinner3 != null) {
                                                        i = C2722R.C2724id.sp_academic_year;
                                                        SearchableSpinner searchableSpinner4 = (SearchableSpinner) view2.findViewById(C2722R.C2724id.sp_academic_year);
                                                        if (searchableSpinner4 != null) {
                                                            i = C2722R.C2724id.tv_student_list_details;
                                                            TextView textView = (TextView) view2.findViewById(C2722R.C2724id.tv_student_list_details);
                                                            if (textView != null) {
                                                                return new C2853s((LinearLayout) view2, linearLayout, linearLayout2, progressBar, progressBar2, progressBar3, progressBar4, relativeLayout, recyclerView, a, searchableSpinner, searchableSpinner2, searchableSpinner3, searchableSpinner4, textView);
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
    public static C2853s m12401c(LayoutInflater layoutInflater) {
        return m12402d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2853s m12402d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_faculty_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12400a(inflate);
    }

    /* renamed from: b */
    public LinearLayout mo10179b() {
        return this.f9174a;
    }
}
