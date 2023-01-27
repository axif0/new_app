package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p086f.p087a.p088k.p089a.C3133a;
import p148g.p189d.p190a.p252d.C4999e;
import p148g.p189d.p190a.p252d.C5004j;

/* renamed from: com.google.android.material.textfield.i */
class C2301i extends C2295e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f7668d = new C2302a();

    /* renamed from: e */
    private final TextInputLayout.C2267f f7669e = new C2303b();

    /* renamed from: f */
    private final TextInputLayout.C2268g f7670f = new C2304c();

    /* renamed from: com.google.android.material.textfield.i$a */
    class C2302a implements TextWatcher {
        C2302a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C2301i iVar = C2301i.this;
            iVar.f7636c.setChecked(!iVar.m10732g());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.i$b */
    class C2303b implements TextInputLayout.C2267f {
        C2303b() {
        }

        /* renamed from: a */
        public void mo9004a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C2301i iVar = C2301i.this;
            iVar.f7636c.setChecked(!iVar.m10732g());
            editText.removeTextChangedListener(C2301i.this.f7668d);
            editText.addTextChangedListener(C2301i.this.f7668d);
        }
    }

    /* renamed from: com.google.android.material.textfield.i$c */
    class C2304c implements TextInputLayout.C2268g {
        C2304c() {
        }

        /* renamed from: a */
        public void mo9005a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.removeTextChangedListener(C2301i.this.f7668d);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.i$d */
    class C2305d implements View.OnClickListener {
        C2305d() {
        }

        public void onClick(View view) {
            EditText editText = C2301i.this.f7634a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(C2301i.this.m10732g() ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    C2301i(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m10732g() {
        EditText editText = this.f7634a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m10733h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9013a() {
        this.f7634a.setEndIconDrawable(C3133a.m13388d(this.f7635b, C4999e.design_password_eye));
        TextInputLayout textInputLayout = this.f7634a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C5004j.password_toggle_content_description));
        this.f7634a.setEndIconOnClickListener(new C2305d());
        this.f7634a.mo8861e(this.f7669e);
        this.f7634a.mo8862f(this.f7670f);
        EditText editText = this.f7634a.getEditText();
        if (m10733h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
