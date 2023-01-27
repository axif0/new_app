package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.n */
public final class C2848n {

    /* renamed from: a */
    private final RelativeLayout f9131a;

    /* renamed from: b */
    public final RecyclerView f9132b;

    /* renamed from: c */
    public final TextView f9133c;

    /* renamed from: d */
    public final TextView f9134d;

    private C2848n(RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f9131a = relativeLayout;
        this.f9132b = recyclerView;
        this.f9133c = textView;
        this.f9134d = textView2;
    }

    /* renamed from: a */
    public static C2848n m12380a(View view) {
        int i = C2722R.C2724id.rv_exam_schedule;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C2722R.C2724id.rv_exam_schedule);
        if (recyclerView != null) {
            i = C2722R.C2724id.tv_semester_name;
            TextView textView = (TextView) view.findViewById(C2722R.C2724id.tv_semester_name);
            if (textView != null) {
                i = C2722R.C2724id.tv_unavailable_message;
                TextView textView2 = (TextView) view.findViewById(C2722R.C2724id.tv_unavailable_message);
                if (textView2 != null) {
                    return new C2848n((RelativeLayout) view, recyclerView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2848n m12381c(LayoutInflater layoutInflater) {
        return m12382d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2848n m12382d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_exam_schedule, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12380a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10174b() {
        return this.f9131a;
    }
}
