package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C4999e;
import p148g.p189d.p190a.p252d.C5004j;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p256m.C5007a;
import p148g.p189d.p190a.p252d.p262r.C5035a;

/* renamed from: com.google.android.material.textfield.d */
class C2283d extends C2295e {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final boolean f7607q = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f7608d = new C2284a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View.OnFocusChangeListener f7609e = new C2287c();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TextInputLayout.C2266e f7610f = new C2288d(this.f7634a);

    /* renamed from: g */
    private final TextInputLayout.C2267f f7611g = new C2289e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    private final TextInputLayout.C2268g f7612h = new C2290f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7613i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f7614j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f7615k = Long.MAX_VALUE;

    /* renamed from: l */
    private StateListDrawable f7616l;

    /* renamed from: m */
    private C4972g f7617m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AccessibilityManager f7618n;

    /* renamed from: o */
    private ValueAnimator f7619o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ValueAnimator f7620p;

    /* renamed from: com.google.android.material.textfield.d$a */
    class C2284a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        class C2285a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ AutoCompleteTextView f7622f;

            C2285a(AutoCompleteTextView autoCompleteTextView) {
                this.f7622f = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f7622f.isPopupShowing();
                C2283d.this.m10647C(isPopupShowing);
                boolean unused = C2283d.this.f7613i = isPopupShowing;
            }
        }

        C2284a() {
        }

        public void afterTextChanged(Editable editable) {
            C2283d dVar = C2283d.this;
            AutoCompleteTextView e = dVar.m10670x(dVar.f7634a.getEditText());
            e.post(new C2285a(e));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    class C2286b implements ValueAnimator.AnimatorUpdateListener {
        C2286b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2283d.this.f7636c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    class C2287c implements View.OnFocusChangeListener {
        C2287c() {
        }

        public void onFocusChange(View view, boolean z) {
            C2283d.this.f7634a.setEndIconActivated(z);
            if (!z) {
                C2283d.this.m10647C(false);
                boolean unused = C2283d.this.f7613i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    class C2288d extends TextInputLayout.C2266e {
        C2288d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            if (C2283d.this.f7634a.getEditText().getKeyListener() == null) {
                cVar.mo11621b0(Spinner.class.getName());
            }
            if (cVar.mo11609M()) {
                cVar.mo11640m0((CharSequence) null);
            }
        }

        /* renamed from: h */
        public void mo4825h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4825h(view, accessibilityEvent);
            C2283d dVar = C2283d.this;
            AutoCompleteTextView e = dVar.m10670x(dVar.f7634a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C2283d.this.f7618n.isTouchExplorationEnabled()) {
                C2283d.this.m10650F(e);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    class C2289e implements TextInputLayout.C2267f {
        C2289e() {
        }

        /* renamed from: a */
        public void mo9004a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e = C2283d.this.m10670x(textInputLayout.getEditText());
            C2283d.this.m10648D(e);
            C2283d.this.m10667u(e);
            C2283d.this.m10649E(e);
            e.setThreshold(0);
            e.removeTextChangedListener(C2283d.this.f7608d);
            e.addTextChangedListener(C2283d.this.f7608d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C2283d.this.f7610f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    class C2290f implements TextInputLayout.C2268g {
        C2290f() {
        }

        /* renamed from: a */
        public void mo9005a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.removeTextChangedListener(C2283d.this.f7608d);
                if (autoCompleteTextView.getOnFocusChangeListener() == C2283d.this.f7609e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (C2283d.f7607q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    class C2291g implements View.OnClickListener {
        C2291g() {
        }

        public void onClick(View view) {
            C2283d.this.m10650F((AutoCompleteTextView) C2283d.this.f7634a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    class C2292h implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ AutoCompleteTextView f7630f;

        C2292h(AutoCompleteTextView autoCompleteTextView) {
            this.f7630f = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C2283d.this.m10646B()) {
                    boolean unused = C2283d.this.f7613i = false;
                }
                C2283d.this.m10650F(this.f7630f);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    class C2293i implements AutoCompleteTextView.OnDismissListener {
        C2293i() {
        }

        public void onDismiss() {
            boolean unused = C2283d.this.f7613i = true;
            long unused2 = C2283d.this.f7615k = System.currentTimeMillis();
            C2283d.this.m10647C(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$j */
    class C2294j extends AnimatorListenerAdapter {
        C2294j() {
        }

        public void onAnimationEnd(Animator animator) {
            C2283d dVar = C2283d.this;
            dVar.f7636c.setChecked(dVar.f7614j);
            C2283d.this.f7620p.start();
        }
    }

    C2283d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: A */
    private void m10645A() {
        this.f7620p = m10671y(67, 0.0f, 1.0f);
        ValueAnimator y = m10671y(50, 1.0f, 0.0f);
        this.f7619o = y;
        y.addListener(new C2294j());
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public boolean m10646B() {
        long currentTimeMillis = System.currentTimeMillis() - this.f7615k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m10647C(boolean z) {
        if (this.f7614j != z) {
            this.f7614j = z;
            this.f7620p.cancel();
            this.f7619o.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m10648D(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f7607q) {
            int boxBackgroundMode = this.f7634a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f7617m;
            } else if (boxBackgroundMode == 1) {
                drawable = this.f7616l;
            } else {
                return;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: E */
    public void m10649E(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C2292h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f7609e);
        if (f7607q) {
            autoCompleteTextView.setOnDismissListener(new C2293i());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m10650F(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m10646B()) {
                this.f7613i = false;
            }
            if (!this.f7613i) {
                if (f7607q) {
                    m10647C(!this.f7614j);
                } else {
                    this.f7614j = !this.f7614j;
                    this.f7636c.toggle();
                }
                if (this.f7614j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f7613i = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m10667u(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f7634a.getBoxBackgroundMode();
            C4972g boxBackground = this.f7634a.getBoxBackground();
            int c = C5035a.m21305c(autoCompleteTextView, C4965b.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m10669w(autoCompleteTextView, c, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m10668v(autoCompleteTextView, c, iArr, boxBackground);
            }
        }
    }

    /* renamed from: v */
    private void m10668v(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C4972g gVar) {
        int boxBackgroundColor = this.f7634a.getBoxBackgroundColor();
        int[] iArr2 = {C5035a.m21308f(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f7607q) {
            C3403t.m14649l0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        C4972g gVar2 = new C4972g(gVar.mo14914D());
        gVar2.mo14926X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int D = C3403t.m14603D(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int C = C3403t.m14602C(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C3403t.m14649l0(autoCompleteTextView, layerDrawable);
        C3403t.m14669v0(autoCompleteTextView, D, paddingTop, C, paddingBottom);
    }

    /* renamed from: w */
    private void m10669w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C4972g gVar) {
        LayerDrawable layerDrawable;
        int c = C5035a.m21305c(autoCompleteTextView, C4965b.colorSurface);
        C4972g gVar2 = new C4972g(gVar.mo14914D());
        int f = C5035a.m21308f(i, c, 0.1f);
        gVar2.mo14926X(new ColorStateList(iArr, new int[]{f, 0}));
        if (f7607q) {
            gVar2.setTint(c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f, c});
            C4972g gVar3 = new C4972g(gVar.mo14914D());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C3403t.m14649l0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public AutoCompleteTextView m10670x(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: y */
    private ValueAnimator m10671y(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5007a.f14947a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C2286b());
        return ofFloat;
    }

    /* renamed from: z */
    private C4972g m10672z(float f, float f2, float f3, int i) {
        C4979k.C4981b a = C4979k.m21072a();
        a.mo14992z(f);
        a.mo14978D(f);
        a.mo14984r(f2);
        a.mo14988v(f2);
        C4979k m = a.mo14980m();
        C4972g m2 = C4972g.m21020m(this.f7635b, f3);
        m2.setShapeAppearanceModel(m);
        m2.mo14928Z(0, i, 0, i);
        return m2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9013a() {
        float dimensionPixelOffset = (float) this.f7635b.getResources().getDimensionPixelOffset(C4998d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f7635b.getResources().getDimensionPixelOffset(C4998d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f7635b.getResources().getDimensionPixelOffset(C4998d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C4972g z = m10672z(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C4972g z2 = m10672z(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f7617m = z;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f7616l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, z);
        this.f7616l.addState(new int[0], z2);
        this.f7634a.setEndIconDrawable(C3133a.m13388d(this.f7635b, f7607q ? C4999e.mtrl_dropdown_arrow : C4999e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f7634a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C5004j.exposed_dropdown_menu_content_description));
        this.f7634a.setEndIconOnClickListener(new C2291g());
        this.f7634a.mo8861e(this.f7611g);
        this.f7634a.mo8862f(this.f7612h);
        m10645A();
        C3403t.m14663s0(this.f7636c, 2);
        this.f7618n = (AccessibilityManager) this.f7635b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9028b(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9029d() {
        return true;
    }
}
