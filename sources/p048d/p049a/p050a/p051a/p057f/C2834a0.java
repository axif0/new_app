package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.a0 */
public final class C2834a0 {

    /* renamed from: a */
    private final ScrollView f9049a;

    /* renamed from: b */
    public final MaterialButton f9050b;

    /* renamed from: c */
    public final AppCompatCheckBox f9051c;

    /* renamed from: d */
    public final TextInputEditText f9052d;

    /* renamed from: e */
    public final TextInputEditText f9053e;

    /* renamed from: f */
    public final ImageView f9054f;

    /* renamed from: g */
    public final TextInputLayout f9055g;

    /* renamed from: h */
    public final TextInputLayout f9056h;

    /* renamed from: i */
    public final TextView f9057i;

    private C2834a0(ScrollView scrollView, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ImageView imageView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView) {
        this.f9049a = scrollView;
        this.f9050b = materialButton;
        this.f9051c = appCompatCheckBox;
        this.f9052d = textInputEditText;
        this.f9053e = textInputEditText2;
        this.f9054f = imageView;
        this.f9055g = textInputLayout;
        this.f9056h = textInputLayout2;
        this.f9057i = textView;
    }

    /* renamed from: a */
    public static C2834a0 m12339a(View view) {
        int i = C2722R.C2724id.btn_attempt_login;
        MaterialButton materialButton = (MaterialButton) view.findViewById(C2722R.C2724id.btn_attempt_login);
        if (materialButton != null) {
            i = C2722R.C2724id.cb_remember_me;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view.findViewById(C2722R.C2724id.cb_remember_me);
            if (appCompatCheckBox != null) {
                i = C2722R.C2724id.et_password;
                TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C2722R.C2724id.et_password);
                if (textInputEditText != null) {
                    i = C2722R.C2724id.et_username;
                    TextInputEditText textInputEditText2 = (TextInputEditText) view.findViewById(C2722R.C2724id.et_username);
                    if (textInputEditText2 != null) {
                        i = C2722R.C2724id.imv_app_logo;
                        ImageView imageView = (ImageView) view.findViewById(C2722R.C2724id.imv_app_logo);
                        if (imageView != null) {
                            i = C2722R.C2724id.til_password;
                            TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C2722R.C2724id.til_password);
                            if (textInputLayout != null) {
                                i = C2722R.C2724id.til_username;
                                TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(C2722R.C2724id.til_username);
                                if (textInputLayout2 != null) {
                                    i = C2722R.C2724id.tv_recover_password;
                                    TextView textView = (TextView) view.findViewById(C2722R.C2724id.tv_recover_password);
                                    if (textView != null) {
                                        return new C2834a0((ScrollView) view, materialButton, appCompatCheckBox, textInputEditText, textInputEditText2, imageView, textInputLayout, textInputLayout2, textView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2834a0 m12340c(LayoutInflater layoutInflater) {
        return m12341d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2834a0 m12341d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_user_login, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12339a(inflate);
    }

    /* renamed from: b */
    public ScrollView mo10165b() {
        return this.f9049a;
    }
}
