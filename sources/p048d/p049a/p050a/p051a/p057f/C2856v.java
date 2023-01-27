package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.v */
public final class C2856v {

    /* renamed from: a */
    private final RelativeLayout f9217a;

    /* renamed from: b */
    public final MaterialButton f9218b;

    /* renamed from: c */
    public final TextInputEditText f9219c;

    /* renamed from: d */
    public final TextInputEditText f9220d;

    /* renamed from: e */
    public final LinearLayout f9221e;

    /* renamed from: f */
    public final TextInputLayout f9222f;

    /* renamed from: g */
    public final TextInputLayout f9223g;

    private C2856v(RelativeLayout relativeLayout, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, LinearLayout linearLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.f9217a = relativeLayout;
        this.f9218b = materialButton;
        this.f9219c = textInputEditText;
        this.f9220d = textInputEditText2;
        this.f9221e = linearLayout;
        this.f9222f = textInputLayout;
        this.f9223g = textInputLayout2;
    }

    /* renamed from: a */
    public static C2856v m12412a(View view) {
        int i = C2722R.C2724id.btn_recover_password;
        MaterialButton materialButton = (MaterialButton) view.findViewById(C2722R.C2724id.btn_recover_password);
        if (materialButton != null) {
            i = C2722R.C2724id.et_recovery_birthday;
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C2722R.C2724id.et_recovery_birthday);
            if (textInputEditText != null) {
                i = C2722R.C2724id.et_recovery_email;
                TextInputEditText textInputEditText2 = (TextInputEditText) view.findViewById(C2722R.C2724id.et_recovery_email);
                if (textInputEditText2 != null) {
                    i = C2722R.C2724id.ll_fields_layout;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(C2722R.C2724id.ll_fields_layout);
                    if (linearLayout != null) {
                        i = C2722R.C2724id.til_recovery_birthday;
                        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C2722R.C2724id.til_recovery_birthday);
                        if (textInputLayout != null) {
                            i = C2722R.C2724id.til_recovery_email;
                            TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(C2722R.C2724id.til_recovery_email);
                            if (textInputLayout2 != null) {
                                return new C2856v((RelativeLayout) view, materialButton, textInputEditText, textInputEditText2, linearLayout, textInputLayout, textInputLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2856v m12413c(LayoutInflater layoutInflater) {
        return m12414d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2856v m12414d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_recover_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12412a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10182b() {
        return this.f9217a;
    }
}
