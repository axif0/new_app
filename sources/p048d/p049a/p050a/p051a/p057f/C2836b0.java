package p048d.p049a.p050a.p051a.p057f;

import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.b0 */
public final class C2836b0 {

    /* renamed from: a */
    private final RelativeLayout f9062a;

    /* renamed from: b */
    public final TextInputEditText f9063b;

    /* renamed from: c */
    public final RelativeLayout f9064c;

    /* renamed from: d */
    public final TextInputLayout f9065d;

    private C2836b0(RelativeLayout relativeLayout, TextInputEditText textInputEditText, RelativeLayout relativeLayout2, TextInputLayout textInputLayout) {
        this.f9062a = relativeLayout;
        this.f9063b = textInputEditText;
        this.f9064c = relativeLayout2;
        this.f9065d = textInputLayout;
    }

    /* renamed from: a */
    public static C2836b0 m12347a(View view) {
        int i = C2722R.C2724id.et_search;
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C2722R.C2724id.et_search);
        if (textInputEditText != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C2722R.C2724id.til_search);
            if (textInputLayout != null) {
                return new C2836b0(relativeLayout, textInputEditText, relativeLayout, textInputLayout);
            }
            i = C2722R.C2724id.til_search;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
