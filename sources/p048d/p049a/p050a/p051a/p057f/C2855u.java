package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.u */
public final class C2855u {

    /* renamed from: a */
    private final ScrollView f9205a;

    /* renamed from: b */
    public final MaterialButton f9206b;

    /* renamed from: c */
    public final TextInputEditText f9207c;

    /* renamed from: d */
    public final TextInputEditText f9208d;

    /* renamed from: e */
    public final TextInputEditText f9209e;

    /* renamed from: f */
    public final TextInputEditText f9210f;

    /* renamed from: g */
    public final TextView f9211g;

    /* renamed from: h */
    public final TextInputLayout f9212h;

    /* renamed from: i */
    public final TextInputLayout f9213i;

    /* renamed from: j */
    public final TextInputLayout f9214j;

    /* renamed from: k */
    public final TextInputLayout f9215k;

    /* renamed from: l */
    public final TextView f9216l;

    private C2855u(ScrollView scrollView, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextView textView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView2) {
        this.f9205a = scrollView;
        this.f9206b = materialButton;
        this.f9207c = textInputEditText;
        this.f9208d = textInputEditText2;
        this.f9209e = textInputEditText3;
        this.f9210f = textInputEditText4;
        this.f9211g = textView;
        this.f9212h = textInputLayout;
        this.f9213i = textInputLayout2;
        this.f9214j = textInputLayout3;
        this.f9215k = textInputLayout4;
        this.f9216l = textView2;
    }

    /* renamed from: a */
    public static C2855u m12408a(View view) {
        int i = C2722R.C2724id.btn_send_feedback;
        MaterialButton materialButton = (MaterialButton) view.findViewById(C2722R.C2724id.btn_send_feedback);
        if (materialButton != null) {
            i = C2722R.C2724id.et_email;
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C2722R.C2724id.et_email);
            if (textInputEditText != null) {
                i = C2722R.C2724id.et_feedback;
                TextInputEditText textInputEditText2 = (TextInputEditText) view.findViewById(C2722R.C2724id.et_feedback);
                if (textInputEditText2 != null) {
                    i = C2722R.C2724id.et_full_name;
                    TextInputEditText textInputEditText3 = (TextInputEditText) view.findViewById(C2722R.C2724id.et_full_name);
                    if (textInputEditText3 != null) {
                        i = C2722R.C2724id.et_mobile_number;
                        TextInputEditText textInputEditText4 = (TextInputEditText) view.findViewById(C2722R.C2724id.et_mobile_number);
                        if (textInputEditText4 != null) {
                            i = C2722R.C2724id.textView8;
                            TextView textView = (TextView) view.findViewById(C2722R.C2724id.textView8);
                            if (textView != null) {
                                i = C2722R.C2724id.til_email;
                                TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C2722R.C2724id.til_email);
                                if (textInputLayout != null) {
                                    i = C2722R.C2724id.til_feedback;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(C2722R.C2724id.til_feedback);
                                    if (textInputLayout2 != null) {
                                        i = C2722R.C2724id.til_full_name;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(C2722R.C2724id.til_full_name);
                                        if (textInputLayout3 != null) {
                                            i = C2722R.C2724id.til_mobile_number;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(C2722R.C2724id.til_mobile_number);
                                            if (textInputLayout4 != null) {
                                                i = C2722R.C2724id.tv_email_feedback;
                                                TextView textView2 = (TextView) view.findViewById(C2722R.C2724id.tv_email_feedback);
                                                if (textView2 != null) {
                                                    return new C2855u((ScrollView) view, materialButton, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textView, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView2);
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

    /* renamed from: c */
    public static C2855u m12409c(LayoutInflater layoutInflater) {
        return m12410d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2855u m12410d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12408a(inflate);
    }

    /* renamed from: b */
    public ScrollView mo10181b() {
        return this.f9205a;
    }
}
