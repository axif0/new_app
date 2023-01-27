package p048d.p049a.p050a.p051a.p057f;

import academia.bracu.com.academia.spinner.SearchableSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.t */
public final class C2854t {

    /* renamed from: a */
    private final LinearLayout f9189a;

    /* renamed from: b */
    public final Button f9190b;

    /* renamed from: c */
    public final Button f9191c;

    /* renamed from: d */
    public final LinearLayout f9192d;

    /* renamed from: e */
    public final LinearLayout f9193e;

    /* renamed from: f */
    public final ListView f9194f;

    /* renamed from: g */
    public final ProgressBar f9195g;

    /* renamed from: h */
    public final ProgressBar f9196h;

    /* renamed from: i */
    public final ProgressBar f9197i;

    /* renamed from: j */
    public final ProgressBar f9198j;

    /* renamed from: k */
    public final SearchableSpinner f9199k;

    /* renamed from: l */
    public final SearchableSpinner f9200l;

    /* renamed from: m */
    public final SearchableSpinner f9201m;

    /* renamed from: n */
    public final SearchableSpinner f9202n;

    /* renamed from: o */
    public final TextView f9203o;

    /* renamed from: p */
    public final TextView f9204p;

    private C2854t(LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2, LinearLayout linearLayout3, ListView listView, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, SearchableSpinner searchableSpinner, SearchableSpinner searchableSpinner2, SearchableSpinner searchableSpinner3, SearchableSpinner searchableSpinner4, TextView textView, TextView textView2) {
        this.f9189a = linearLayout;
        this.f9190b = button;
        this.f9191c = button2;
        this.f9192d = linearLayout2;
        this.f9193e = linearLayout3;
        this.f9194f = listView;
        this.f9195g = progressBar;
        this.f9196h = progressBar2;
        this.f9197i = progressBar3;
        this.f9198j = progressBar4;
        this.f9199k = searchableSpinner;
        this.f9200l = searchableSpinner2;
        this.f9201m = searchableSpinner3;
        this.f9202n = searchableSpinner4;
        this.f9203o = textView;
        this.f9204p = textView2;
    }

    /* renamed from: a */
    public static C2854t m12404a(View view) {
        View view2 = view;
        int i = C2722R.C2724id.btn_checkbox_selection;
        Button button = (Button) view2.findViewById(C2722R.C2724id.btn_checkbox_selection);
        if (button != null) {
            i = C2722R.C2724id.btn_send_notification;
            Button button2 = (Button) view2.findViewById(C2722R.C2724id.btn_send_notification);
            if (button2 != null) {
                i = C2722R.C2724id.ll_student_list_label;
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_student_list_label);
                if (linearLayout != null) {
                    i = C2722R.C2724id.ll_top_layout;
                    LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_top_layout);
                    if (linearLayout2 != null) {
                        i = C2722R.C2724id.lv_student_list_details;
                        ListView listView = (ListView) view2.findViewById(C2722R.C2724id.lv_student_list_details);
                        if (listView != null) {
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
                                                                i = C2722R.C2724id.tv_student_name;
                                                                TextView textView2 = (TextView) view2.findViewById(C2722R.C2724id.tv_student_name);
                                                                if (textView2 != null) {
                                                                    return new C2854t((LinearLayout) view2, button, button2, linearLayout, linearLayout2, listView, progressBar, progressBar2, progressBar3, progressBar4, searchableSpinner, searchableSpinner2, searchableSpinner3, searchableSpinner4, textView, textView2);
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
    public static C2854t m12405c(LayoutInflater layoutInflater) {
        return m12406d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2854t m12406d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_faculty_send_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12404a(inflate);
    }

    /* renamed from: b */
    public LinearLayout mo10180b() {
        return this.f9189a;
    }
}
