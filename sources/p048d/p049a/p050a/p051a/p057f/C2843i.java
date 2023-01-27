package p048d.p049a.p050a.p051a.p057f;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.i */
public final class C2843i {

    /* renamed from: a */
    private final ScrollView f9086a;

    /* renamed from: b */
    public final MaterialButton f9087b;

    /* renamed from: c */
    public final TextInputEditText f9088c;

    /* renamed from: d */
    public final TextInputEditText f9089d;

    /* renamed from: e */
    public final ImageView f9090e;

    /* renamed from: f */
    public final LinearLayout f9091f;

    /* renamed from: g */
    public final TextInputLayout f9092g;

    /* renamed from: h */
    public final TextInputLayout f9093h;

    /* renamed from: i */
    public final TextView f9094i;

    /* renamed from: j */
    public final TextView f9095j;

    /* renamed from: k */
    public final TextView f9096k;

    /* renamed from: l */
    public final TextView f9097l;

    /* renamed from: m */
    public final TextView f9098m;

    private C2843i(ScrollView scrollView, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ImageView imageView, LinearLayout linearLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f9086a = scrollView;
        this.f9087b = materialButton;
        this.f9088c = textInputEditText;
        this.f9089d = textInputEditText2;
        this.f9090e = imageView;
        this.f9091f = linearLayout;
        this.f9092g = textInputLayout;
        this.f9093h = textInputLayout2;
        this.f9094i = textView;
        this.f9095j = textView2;
        this.f9096k = textView3;
        this.f9097l = textView4;
        this.f9098m = textView5;
    }

    /* renamed from: a */
    public static C2843i m12363a(View view) {
        View view2 = view;
        int i = C2722R.C2724id.btn_confirm_new_password;
        MaterialButton materialButton = (MaterialButton) view2.findViewById(C2722R.C2724id.btn_confirm_new_password);
        if (materialButton != null) {
            i = C2722R.C2724id.et_confirm_password;
            TextInputEditText textInputEditText = (TextInputEditText) view2.findViewById(C2722R.C2724id.et_confirm_password);
            if (textInputEditText != null) {
                i = C2722R.C2724id.et_new_password;
                TextInputEditText textInputEditText2 = (TextInputEditText) view2.findViewById(C2722R.C2724id.et_new_password);
                if (textInputEditText2 != null) {
                    i = C2722R.C2724id.imv_app_logo;
                    ImageView imageView = (ImageView) view2.findViewById(C2722R.C2724id.imv_app_logo);
                    if (imageView != null) {
                        i = C2722R.C2724id.ll_password_hints;
                        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_password_hints);
                        if (linearLayout != null) {
                            i = C2722R.C2724id.til_confirm_password;
                            TextInputLayout textInputLayout = (TextInputLayout) view2.findViewById(C2722R.C2724id.til_confirm_password);
                            if (textInputLayout != null) {
                                i = C2722R.C2724id.til_new_password;
                                TextInputLayout textInputLayout2 = (TextInputLayout) view2.findViewById(C2722R.C2724id.til_new_password);
                                if (textInputLayout2 != null) {
                                    i = C2722R.C2724id.tv_warning_length;
                                    TextView textView = (TextView) view2.findViewById(C2722R.C2724id.tv_warning_length);
                                    if (textView != null) {
                                        i = C2722R.C2724id.tv_warning_lowercase;
                                        TextView textView2 = (TextView) view2.findViewById(C2722R.C2724id.tv_warning_lowercase);
                                        if (textView2 != null) {
                                            i = C2722R.C2724id.tv_warning_number;
                                            TextView textView3 = (TextView) view2.findViewById(C2722R.C2724id.tv_warning_number);
                                            if (textView3 != null) {
                                                i = C2722R.C2724id.tv_warning_special;
                                                TextView textView4 = (TextView) view2.findViewById(C2722R.C2724id.tv_warning_special);
                                                if (textView4 != null) {
                                                    i = C2722R.C2724id.tv_warning_uppercase;
                                                    TextView textView5 = (TextView) view2.findViewById(C2722R.C2724id.tv_warning_uppercase);
                                                    if (textView5 != null) {
                                                        return new C2843i((ScrollView) view2, materialButton, textInputEditText, textInputEditText2, imageView, linearLayout, textInputLayout, textInputLayout2, textView, textView2, textView3, textView4, textView5);
                                                    }
                                                }
                                            }
                                        }
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
}
