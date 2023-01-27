package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.l */
public final class C2846l {

    /* renamed from: a */
    private final RelativeLayout f9123a;

    /* renamed from: b */
    public final LinearLayout f9124b;

    /* renamed from: c */
    public final ListView f9125c;

    /* renamed from: d */
    public final TextView f9126d;

    /* renamed from: e */
    public final TextView f9127e;

    private C2846l(RelativeLayout relativeLayout, LinearLayout linearLayout, ListView listView, TextView textView, TextView textView2) {
        this.f9123a = relativeLayout;
        this.f9124b = linearLayout;
        this.f9125c = listView;
        this.f9126d = textView;
        this.f9127e = textView2;
    }

    /* renamed from: a */
    public static C2846l m12372a(View view) {
        int i = C2722R.C2724id.ll_advised_courses_info;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C2722R.C2724id.ll_advised_courses_info);
        if (linearLayout != null) {
            i = C2722R.C2724id.lv_advised_courses;
            ListView listView = (ListView) view.findViewById(C2722R.C2724id.lv_advised_courses);
            if (listView != null) {
                i = C2722R.C2724id.tv_semester_name_label;
                TextView textView = (TextView) view.findViewById(C2722R.C2724id.tv_semester_name_label);
                if (textView != null) {
                    i = C2722R.C2724id.tv_unavailable_message;
                    TextView textView2 = (TextView) view.findViewById(C2722R.C2724id.tv_unavailable_message);
                    if (textView2 != null) {
                        return new C2846l((RelativeLayout) view, linearLayout, listView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2846l m12373c(LayoutInflater layoutInflater) {
        return m12374d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2846l m12374d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_advised_courses, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12372a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10172b() {
        return this.f9123a;
    }
}
