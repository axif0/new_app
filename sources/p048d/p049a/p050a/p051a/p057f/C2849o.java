package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.o */
public final class C2849o {

    /* renamed from: a */
    private final RelativeLayout f9135a;

    /* renamed from: b */
    public final RecyclerView f9136b;

    /* renamed from: c */
    public final TextView f9137c;

    private C2849o(RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView) {
        this.f9135a = relativeLayout;
        this.f9136b = recyclerView;
        this.f9137c = textView;
    }

    /* renamed from: a */
    public static C2849o m12384a(View view) {
        int i = C2722R.C2724id.rv_class_schedule;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C2722R.C2724id.rv_class_schedule);
        if (recyclerView != null) {
            i = C2722R.C2724id.tv_unavailable_message;
            TextView textView = (TextView) view.findViewById(C2722R.C2724id.tv_unavailable_message);
            if (textView != null) {
                return new C2849o((RelativeLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2849o m12385c(LayoutInflater layoutInflater) {
        return m12386d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2849o m12386d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_faculty_class_schedule, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12384a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10175b() {
        return this.f9135a;
    }
}
