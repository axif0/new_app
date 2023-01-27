package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.j */
public final class C2844j {

    /* renamed from: a */
    private final LinearLayout f9099a;

    /* renamed from: b */
    public final Button f9100b;

    /* renamed from: c */
    public final Button f9101c;

    /* renamed from: d */
    public final AppCompatCheckBox f9102d;

    /* renamed from: e */
    public final AppCompatCheckBox f9103e;

    /* renamed from: f */
    public final TextInputEditText f9104f;

    /* renamed from: g */
    public final TextInputEditText f9105g;

    /* renamed from: h */
    public final TextInputLayout f9106h;

    /* renamed from: i */
    public final TextInputLayout f9107i;

    /* renamed from: j */
    public final TextView f9108j;

    private C2844j(LinearLayout linearLayout, Button button, Button button2, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView) {
        this.f9099a = linearLayout;
        this.f9100b = button;
        this.f9101c = button2;
        this.f9102d = appCompatCheckBox;
        this.f9103e = appCompatCheckBox2;
        this.f9104f = textInputEditText;
        this.f9105g = textInputEditText2;
        this.f9106h = textInputLayout;
        this.f9107i = textInputLayout2;
        this.f9108j = textView;
    }

    /* renamed from: a */
    public static C2844j m12364a(View view) {
        int i = C2722R.C2724id.btn_cancel;
        Button button = (Button) view.findViewById(C2722R.C2724id.btn_cancel);
        if (button != null) {
            i = C2722R.C2724id.btn_send_notification;
            Button button2 = (Button) view.findViewById(C2722R.C2724id.btn_send_notification);
            if (button2 != null) {
                i = C2722R.C2724id.cb_notification;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view.findViewById(C2722R.C2724id.cb_notification);
                if (appCompatCheckBox != null) {
                    i = C2722R.C2724id.cb_sms;
                    AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view.findViewById(C2722R.C2724id.cb_sms);
                    if (appCompatCheckBox2 != null) {
                        i = C2722R.C2724id.et_notification_message;
                        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C2722R.C2724id.et_notification_message);
                        if (textInputEditText != null) {
                            i = C2722R.C2724id.et_notification_title;
                            TextInputEditText textInputEditText2 = (TextInputEditText) view.findViewById(C2722R.C2724id.et_notification_title);
                            if (textInputEditText2 != null) {
                                i = C2722R.C2724id.til_notification_message;
                                TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C2722R.C2724id.til_notification_message);
                                if (textInputLayout != null) {
                                    i = C2722R.C2724id.til_notification_title;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(C2722R.C2724id.til_notification_title);
                                    if (textInputLayout2 != null) {
                                        i = C2722R.C2724id.tv_dialog_title;
                                        TextView textView = (TextView) view.findViewById(C2722R.C2724id.tv_dialog_title);
                                        if (textView != null) {
                                            return new C2844j((LinearLayout) view, button, button2, appCompatCheckBox, appCompatCheckBox2, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, textView);
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
    public static C2844j m12365c(LayoutInflater layoutInflater) {
        return m12366d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2844j m12366d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.dialog_send_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12364a(inflate);
    }

    /* renamed from: b */
    public LinearLayout mo10170b() {
        return this.f9099a;
    }
}
