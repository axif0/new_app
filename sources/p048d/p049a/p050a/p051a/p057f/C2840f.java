package p048d.p049a.p050a.p051a.p057f;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.f */
public final class C2840f {

    /* renamed from: a */
    private final LinearLayout f9077a;

    /* renamed from: b */
    public final C2833a f9078b;

    /* renamed from: c */
    public final RelativeLayout f9079c;

    private C2840f(LinearLayout linearLayout, C2833a aVar, RelativeLayout relativeLayout) {
        this.f9077a = linearLayout;
        this.f9078b = aVar;
        this.f9079c = relativeLayout;
    }

    /* renamed from: a */
    public static C2840f m12360a(View view) {
        int i = C2722R.C2724id.action_bar;
        View findViewById = view.findViewById(C2722R.C2724id.action_bar);
        if (findViewById != null) {
            C2833a a = C2833a.m12338a(findViewById);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2722R.C2724id.rl_common_header);
            if (relativeLayout != null) {
                return new C2840f((LinearLayout) view, a, relativeLayout);
            }
            i = C2722R.C2724id.rl_common_header;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
