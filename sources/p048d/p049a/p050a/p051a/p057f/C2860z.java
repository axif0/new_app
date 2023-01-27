package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.z */
public final class C2860z {

    /* renamed from: a */
    private final RelativeLayout f9270a;

    /* renamed from: b */
    public final LinearLayout f9271b;

    /* renamed from: c */
    public final ListView f9272c;

    /* renamed from: d */
    public final TextView f9273d;

    /* renamed from: e */
    public final TextView f9274e;

    /* renamed from: f */
    public final TextView f9275f;

    private C2860z(RelativeLayout relativeLayout, LinearLayout linearLayout, ListView listView, TextView textView, TextView textView2, TextView textView3) {
        this.f9270a = relativeLayout;
        this.f9271b = linearLayout;
        this.f9272c = listView;
        this.f9273d = textView;
        this.f9274e = textView2;
        this.f9275f = textView3;
    }

    /* renamed from: a */
    public static C2860z m12428a(View view) {
        int i = C2722R.C2724id.ll_student_result_info;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C2722R.C2724id.ll_student_result_info);
        if (linearLayout != null) {
            i = C2722R.C2724id.lv_student_result_list;
            ListView listView = (ListView) view.findViewById(C2722R.C2724id.lv_student_result_list);
            if (listView != null) {
                i = C2722R.C2724id.tv_student_full_name;
                TextView textView = (TextView) view.findViewById(C2722R.C2724id.tv_student_full_name);
                if (textView != null) {
                    i = C2722R.C2724id.tv_student_id;
                    TextView textView2 = (TextView) view.findViewById(C2722R.C2724id.tv_student_id);
                    if (textView2 != null) {
                        i = C2722R.C2724id.tv_unavailable_message;
                        TextView textView3 = (TextView) view.findViewById(C2722R.C2724id.tv_unavailable_message);
                        if (textView3 != null) {
                            return new C2860z((RelativeLayout) view, linearLayout, listView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2860z m12429c(LayoutInflater layoutInflater) {
        return m12430d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2860z m12430d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_student_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12428a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10186b() {
        return this.f9270a;
    }
}
