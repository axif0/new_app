package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.d */
public final class C2838d {

    /* renamed from: a */
    private final LinearLayout f9070a;

    /* renamed from: b */
    public final C2843i f9071b;

    /* renamed from: c */
    public final Toolbar f9072c;

    private C2838d(LinearLayout linearLayout, C2843i iVar, Toolbar toolbar) {
        this.f9070a = linearLayout;
        this.f9071b = iVar;
        this.f9072c = toolbar;
    }

    /* renamed from: a */
    public static C2838d m12352a(View view) {
        int i = C2722R.C2724id.content;
        View findViewById = view.findViewById(C2722R.C2724id.content);
        if (findViewById != null) {
            C2843i a = C2843i.m12363a(findViewById);
            Toolbar toolbar = (Toolbar) view.findViewById(C2722R.C2724id.toolbar);
            if (toolbar != null) {
                return new C2838d((LinearLayout) view, a, toolbar);
            }
            i = C2722R.C2724id.toolbar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2838d m12353c(LayoutInflater layoutInflater) {
        return m12354d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2838d m12354d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.activity_reset_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12352a(inflate);
    }

    /* renamed from: b */
    public LinearLayout mo10168b() {
        return this.f9070a;
    }
}
