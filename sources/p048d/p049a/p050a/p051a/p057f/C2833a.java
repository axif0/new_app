package p048d.p049a.p050a.p051a.p057f;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.a */
public final class C2833a {

    /* renamed from: a */
    private final AppBarLayout f9047a;

    /* renamed from: b */
    public final Toolbar f9048b;

    private C2833a(AppBarLayout appBarLayout, Toolbar toolbar) {
        this.f9047a = appBarLayout;
        this.f9048b = toolbar;
    }

    /* renamed from: a */
    public static C2833a m12338a(View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(C2722R.C2724id.toolbar);
        if (toolbar != null) {
            return new C2833a((AppBarLayout) view, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C2722R.C2724id.toolbar)));
    }
}
