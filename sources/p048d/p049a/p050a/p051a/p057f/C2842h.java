package p048d.p049a.p050a.p051a.p057f;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.h */
public final class C2842h {

    /* renamed from: a */
    private final LinearLayout f9083a;

    /* renamed from: b */
    public final C2833a f9084b;

    /* renamed from: c */
    public final RelativeLayout f9085c;

    private C2842h(LinearLayout linearLayout, C2833a aVar, RelativeLayout relativeLayout) {
        this.f9083a = linearLayout;
        this.f9084b = aVar;
        this.f9085c = relativeLayout;
    }

    /* renamed from: a */
    public static C2842h m12362a(View view) {
        int i = C2722R.C2724id.action_bar;
        View findViewById = view.findViewById(C2722R.C2724id.action_bar);
        if (findViewById != null) {
            C2833a a = C2833a.m12338a(findViewById);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2722R.C2724id.rl_student_header);
            if (relativeLayout != null) {
                return new C2842h((LinearLayout) view, a, relativeLayout);
            }
            i = C2722R.C2724id.rl_student_header;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
