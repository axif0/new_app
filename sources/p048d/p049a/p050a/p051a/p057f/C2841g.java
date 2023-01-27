package p048d.p049a.p050a.p051a.p057f;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.g */
public final class C2841g {

    /* renamed from: a */
    private final LinearLayout f9080a;

    /* renamed from: b */
    public final C2833a f9081b;

    /* renamed from: c */
    public final RelativeLayout f9082c;

    private C2841g(LinearLayout linearLayout, C2833a aVar, RelativeLayout relativeLayout) {
        this.f9080a = linearLayout;
        this.f9081b = aVar;
        this.f9082c = relativeLayout;
    }

    /* renamed from: a */
    public static C2841g m12361a(View view) {
        int i = C2722R.C2724id.action_bar;
        View findViewById = view.findViewById(C2722R.C2724id.action_bar);
        if (findViewById != null) {
            C2833a a = C2833a.m12338a(findViewById);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2722R.C2724id.header_layout_main);
            if (relativeLayout != null) {
                return new C2841g((LinearLayout) view, a, relativeLayout);
            }
            i = C2722R.C2724id.header_layout_main;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
