package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0608i;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.p256m.C5007a;
import p148g.p189d.p190a.p252d.p256m.C5008b;

/* renamed from: com.google.android.material.textfield.f */
final class C2296f {

    /* renamed from: a */
    private final Context f7637a;

    /* renamed from: b */
    private final TextInputLayout f7638b;

    /* renamed from: c */
    private LinearLayout f7639c;

    /* renamed from: d */
    private int f7640d;

    /* renamed from: e */
    private FrameLayout f7641e;

    /* renamed from: f */
    private int f7642f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animator f7643g;

    /* renamed from: h */
    private final float f7644h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f7645i;

    /* renamed from: j */
    private int f7646j;

    /* renamed from: k */
    private CharSequence f7647k;

    /* renamed from: l */
    private boolean f7648l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f7649m;

    /* renamed from: n */
    private CharSequence f7650n;

    /* renamed from: o */
    private int f7651o;

    /* renamed from: p */
    private ColorStateList f7652p;

    /* renamed from: q */
    private CharSequence f7653q;

    /* renamed from: r */
    private boolean f7654r;

    /* renamed from: s */
    private TextView f7655s;

    /* renamed from: t */
    private int f7656t;

    /* renamed from: u */
    private ColorStateList f7657u;

    /* renamed from: v */
    private Typeface f7658v;

    /* renamed from: com.google.android.material.textfield.f$a */
    class C2297a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7659a;

        /* renamed from: b */
        final /* synthetic */ TextView f7660b;

        /* renamed from: c */
        final /* synthetic */ int f7661c;

        /* renamed from: d */
        final /* synthetic */ TextView f7662d;

        C2297a(int i, TextView textView, int i2, TextView textView2) {
            this.f7659a = i;
            this.f7660b = textView;
            this.f7661c = i2;
            this.f7662d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C2296f.this.f7645i = this.f7659a;
            Animator unused2 = C2296f.this.f7643g = null;
            TextView textView = this.f7660b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f7661c == 1 && C2296f.this.f7649m != null) {
                    C2296f.this.f7649m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f7662d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f7662d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f7662d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C2296f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7637a = context;
        this.f7638b = textInputLayout;
        this.f7644h = (float) context.getResources().getDimensionPixelSize(C4998d.design_textinput_caption_translate_y);
    }

    /* renamed from: H */
    private void m10684H(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: J */
    private void m10685J(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: K */
    private boolean m10686K(TextView textView, CharSequence charSequence) {
        return C3403t.m14614O(this.f7638b) && this.f7638b.isEnabled() && (this.f7646j != this.f7645i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: N */
    private void m10687N(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f7643g = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m10692h(arrayList2, this.f7654r, this.f7655s, 2, i3, i4);
                m10692h(arrayList2, this.f7648l, this.f7649m, 1, i3, i4);
                C5008b.m21202a(animatorSet, arrayList);
                animatorSet.addListener(new C2297a(i2, m10695l(i), i, m10695l(i2)));
                animatorSet.start();
            } else {
                m10697z(i, i2);
            }
            this.f7638b.mo8912k0();
            this.f7638b.mo8913o0(z2);
            this.f7638b.mo8997y0();
        }
    }

    /* renamed from: f */
    private boolean m10691f() {
        return (this.f7639c == null || this.f7638b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m10692h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m10693i(textView, i3 == i));
                if (i3 == i) {
                    list.add(m10694j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m10693i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C5007a.f14947a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m10694j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f7644h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C5007a.f14950d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m10695l(int i) {
        if (i == 1) {
            return this.f7649m;
        }
        if (i != 2) {
            return null;
        }
        return this.f7655s;
    }

    /* renamed from: u */
    private boolean m10696u(int i) {
        return i == 1 && this.f7649m != null && !TextUtils.isEmpty(this.f7647k);
    }

    /* renamed from: z */
    private void m10697z(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = m10695l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = m10695l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.f7645i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo9040A(CharSequence charSequence) {
        this.f7650n = charSequence;
        TextView textView = this.f7649m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo9041B(boolean z) {
        if (this.f7648l != z) {
            mo9052g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f7637a);
                this.f7649m = appCompatTextView;
                appCompatTextView.setId(C5000f.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f7649m.setTextAlignment(5);
                }
                Typeface typeface = this.f7658v;
                if (typeface != null) {
                    this.f7649m.setTypeface(typeface);
                }
                mo9042C(this.f7651o);
                mo9043D(this.f7652p);
                mo9040A(this.f7650n);
                this.f7649m.setVisibility(4);
                C3403t.m14647k0(this.f7649m, 1);
                mo9050d(this.f7649m, 0);
            } else {
                mo9060s();
                mo9065y(this.f7649m, 0);
                this.f7649m = null;
                this.f7638b.mo8912k0();
                this.f7638b.mo8997y0();
            }
            this.f7648l = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo9042C(int i) {
        this.f7651o = i;
        TextView textView = this.f7649m;
        if (textView != null) {
            this.f7638b.mo8855Y(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo9043D(ColorStateList colorStateList) {
        this.f7652p = colorStateList;
        TextView textView = this.f7649m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo9044E(int i) {
        this.f7656t = i;
        TextView textView = this.f7655s;
        if (textView != null) {
            C0608i.m2903q(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo9045F(boolean z) {
        if (this.f7654r != z) {
            mo9052g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f7637a);
                this.f7655s = appCompatTextView;
                appCompatTextView.setId(C5000f.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f7655s.setTextAlignment(5);
                }
                Typeface typeface = this.f7658v;
                if (typeface != null) {
                    this.f7655s.setTypeface(typeface);
                }
                this.f7655s.setVisibility(4);
                C3403t.m14647k0(this.f7655s, 1);
                mo9044E(this.f7656t);
                mo9046G(this.f7657u);
                mo9050d(this.f7655s, 1);
            } else {
                mo9061t();
                mo9065y(this.f7655s, 1);
                this.f7655s = null;
                this.f7638b.mo8912k0();
                this.f7638b.mo8997y0();
            }
            this.f7654r = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo9046G(ColorStateList colorStateList) {
        this.f7657u = colorStateList;
        TextView textView = this.f7655s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo9047I(Typeface typeface) {
        if (typeface != this.f7658v) {
            this.f7658v = typeface;
            m10684H(this.f7649m, typeface);
            m10684H(this.f7655s, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo9048L(CharSequence charSequence) {
        mo9052g();
        this.f7647k = charSequence;
        this.f7649m.setText(charSequence);
        if (this.f7645i != 1) {
            this.f7646j = 1;
        }
        m10687N(this.f7645i, this.f7646j, m10686K(this.f7649m, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo9049M(CharSequence charSequence) {
        mo9052g();
        this.f7653q = charSequence;
        this.f7655s.setText(charSequence);
        if (this.f7645i != 2) {
            this.f7646j = 2;
        }
        m10687N(this.f7645i, this.f7646j, m10686K(this.f7655s, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9050d(TextView textView, int i) {
        if (this.f7639c == null && this.f7641e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f7637a);
            this.f7639c = linearLayout;
            linearLayout.setOrientation(0);
            this.f7638b.addView(this.f7639c, -1, -2);
            this.f7641e = new FrameLayout(this.f7637a);
            this.f7639c.addView(this.f7641e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f7638b.getEditText() != null) {
                mo9051e();
            }
        }
        if (mo9062v(i)) {
            this.f7641e.setVisibility(0);
            this.f7641e.addView(textView);
            this.f7642f++;
        } else {
            this.f7639c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7639c.setVisibility(0);
        this.f7640d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9051e() {
        if (m10691f()) {
            C3403t.m14669v0(this.f7639c, C3403t.m14603D(this.f7638b.getEditText()), 0, C3403t.m14602C(this.f7638b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9052g() {
        Animator animator = this.f7643g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo9053k() {
        return m10696u(this.f7646j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence mo9054m() {
        return this.f7650n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence mo9055n() {
        return this.f7647k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo9056o() {
        TextView textView = this.f7649m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public ColorStateList mo9057p() {
        TextView textView = this.f7649m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence mo9058q() {
        return this.f7653q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo9059r() {
        TextView textView = this.f7655s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo9060s() {
        this.f7647k = null;
        mo9052g();
        if (this.f7645i == 1) {
            this.f7646j = (!this.f7654r || TextUtils.isEmpty(this.f7653q)) ? 0 : 2;
        }
        m10687N(this.f7645i, this.f7646j, m10686K(this.f7649m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo9061t() {
        mo9052g();
        if (this.f7645i == 2) {
            this.f7646j = 0;
        }
        m10687N(this.f7645i, this.f7646j, m10686K(this.f7655s, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo9062v(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo9063w() {
        return this.f7648l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo9064x() {
        return this.f7654r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo9065y(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f7639c != null) {
            if (!mo9062v(i) || (frameLayout = this.f7641e) == null) {
                this.f7639c.removeView(textView);
            } else {
                int i2 = this.f7642f - 1;
                this.f7642f = i2;
                m10685J(frameLayout, i2);
                this.f7641e.removeView(textView);
            }
            int i3 = this.f7640d - 1;
            this.f7640d = i3;
            m10685J(this.f7639c, i3);
        }
    }
}
