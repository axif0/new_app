package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p086f.p087a.p088k.p089a.C3133a;
import p148g.p189d.p190a.p252d.C4999e;
import p148g.p189d.p190a.p252d.C5004j;
import p148g.p189d.p190a.p252d.p256m.C5007a;

/* renamed from: com.google.android.material.textfield.a */
class C2271a extends C2295e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f7589d = new C2272a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View.OnFocusChangeListener f7590e = new C2273b();

    /* renamed from: f */
    private final TextInputLayout.C2267f f7591f = new C2274c();

    /* renamed from: g */
    private final TextInputLayout.C2268g f7592g = new C2275d();

    /* renamed from: h */
    private AnimatorSet f7593h;

    /* renamed from: i */
    private ValueAnimator f7594i;

    /* renamed from: com.google.android.material.textfield.a$a */
    class C2272a implements TextWatcher {
        C2272a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C2271a.this.f7634a.getSuffixText() == null) {
                C2271a.this.m10626i(C2271a.m10629l(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    class C2273b implements View.OnFocusChangeListener {
        C2273b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C2271a aVar = C2271a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.m10626i(z2);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    class C2274c implements TextInputLayout.C2267f {
        C2274c() {
        }

        /* renamed from: a */
        public void mo9004a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && C2271a.m10629l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C2271a.this.f7590e);
            editText.removeTextChangedListener(C2271a.this.f7589d);
            editText.addTextChangedListener(C2271a.this.f7589d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    class C2275d implements TextInputLayout.C2268g {
        C2275d() {
        }

        /* renamed from: a */
        public void mo9005a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.removeTextChangedListener(C2271a.this.f7589d);
                if (editText.getOnFocusChangeListener() == C2271a.this.f7590e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    class C2276e implements View.OnClickListener {
        C2276e() {
        }

        public void onClick(View view) {
            Editable text = C2271a.this.f7634a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    class C2277f extends AnimatorListenerAdapter {
        C2277f() {
        }

        public void onAnimationStart(Animator animator) {
            C2271a.this.f7634a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    class C2278g extends AnimatorListenerAdapter {
        C2278g() {
        }

        public void onAnimationEnd(Animator animator) {
            C2271a.this.f7634a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$h */
    class C2279h implements ValueAnimator.AnimatorUpdateListener {
        C2279h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2271a.this.f7636c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$i */
    class C2280i implements ValueAnimator.AnimatorUpdateListener {
        C2280i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2271a.this.f7636c.setScaleX(floatValue);
            C2271a.this.f7636c.setScaleY(floatValue);
        }
    }

    C2271a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m10626i(boolean z) {
        boolean z2 = this.f7634a.mo8850J() == z;
        if (z) {
            this.f7594i.cancel();
            this.f7593h.start();
            if (z2) {
                this.f7593h.end();
                return;
            }
            return;
        }
        this.f7593h.cancel();
        this.f7594i.start();
        if (z2) {
            this.f7594i.end();
        }
    }

    /* renamed from: j */
    private ValueAnimator m10627j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5007a.f14947a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C2279h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m10628k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C5007a.f14950d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2280i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m10629l(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: m */
    private void m10630m() {
        ValueAnimator k = m10628k();
        ValueAnimator j = m10627j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7593h = animatorSet;
        animatorSet.playTogether(new Animator[]{k, j});
        this.f7593h.addListener(new C2277f());
        ValueAnimator j2 = m10627j(1.0f, 0.0f);
        this.f7594i = j2;
        j2.addListener(new C2278g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9013a() {
        this.f7634a.setEndIconDrawable(C3133a.m13388d(this.f7635b, C4999e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f7634a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C5004j.clear_text_end_icon_content_description));
        this.f7634a.setEndIconOnClickListener(new C2276e());
        this.f7634a.mo8861e(this.f7591f);
        this.f7634a.mo8862f(this.f7592g);
        m10630m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9014c(boolean z) {
        if (this.f7634a.getSuffixText() != null) {
            m10626i(z);
        }
    }
}
