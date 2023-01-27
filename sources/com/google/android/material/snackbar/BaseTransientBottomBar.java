package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0588a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C2205o;
import com.google.android.material.internal.C2206p;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C2244b;
import com.google.android.material.theme.p040a.C2306a;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3399p;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5002h;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p256m.C5007a;
import p148g.p189d.p190a.p252d.p262r.C5035a;
import p148g.p189d.p190a.p252d.p269y.C5046c;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: s */
    static final Handler f7333s = new Handler(Looper.getMainLooper(), new C2225i());
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final boolean f7334t;

    /* renamed from: u */
    private static final int[] f7335u = {C4965b.snackbarStyle};
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final String f7336v = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: a */
    private final ViewGroup f7337a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f7338b;

    /* renamed from: c */
    protected final C2239v f7339c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2243a f7340d;

    /* renamed from: e */
    private int f7341e;

    /* renamed from: f */
    private boolean f7342f;

    /* renamed from: g */
    private View f7343g;

    /* renamed from: h */
    private final Runnable f7344h = new C2226j();

    /* renamed from: i */
    private Rect f7345i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f7346j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f7347k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f7348l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f7349m;

    /* renamed from: n */
    private int f7350n;

    /* renamed from: o */
    private List<C2235r<B>> f7351o;

    /* renamed from: p */
    private Behavior f7352p;

    /* renamed from: q */
    private final AccessibilityManager f7353q;

    /* renamed from: r */
    C2244b.C2246b f7354r = new C2229m();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C2236s f7355k = new C2236s(this);

        /* access modifiers changed from: private */
        /* renamed from: P */
        public void m10382P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f7355k.mo8694c(baseTransientBottomBar);
        }

        /* renamed from: E */
        public boolean mo7590E(View view) {
            return this.f7355k.mo8692a(view);
        }

        /* renamed from: k */
        public boolean mo2746k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f7355k.mo8693b(coordinatorLayout, view, motionEvent);
            return super.mo2746k(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C2217a extends AnimatorListenerAdapter {
        C2217a() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo8660K();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C2218b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7357a;

        C2218b(int i) {
            this.f7357a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo8659J(this.f7357a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    class C2219c implements ValueAnimator.AnimatorUpdateListener {
        C2219c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f7339c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C2220d implements ValueAnimator.AnimatorUpdateListener {
        C2220d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f7339c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f7339c.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C2221e extends AnimatorListenerAdapter {
        C2221e() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo8660K();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f7340d.mo8715a(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C2222f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f7362a = this.f7363b;

        /* renamed from: b */
        final /* synthetic */ int f7363b;

        C2222f(int i) {
            this.f7363b = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f7334t) {
                C3403t.m14620U(BaseTransientBottomBar.this.f7339c, intValue - this.f7362a);
            } else {
                BaseTransientBottomBar.this.f7339c.setTranslationY((float) intValue);
            }
            this.f7362a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C2223g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7365a;

        C2223g(int i) {
            this.f7365a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo8659J(this.f7365a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f7340d.mo8716b(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C2224h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f7367a = 0;

        C2224h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f7334t) {
                C3403t.m14620U(BaseTransientBottomBar.this.f7339c, intValue - this.f7367a);
            } else {
                BaseTransientBottomBar.this.f7339c.setTranslationY((float) intValue);
            }
            this.f7367a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    static class C2225i implements Handler.Callback {
        C2225i() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo8664Q();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo8656F(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class C2226j implements Runnable {
        C2226j() {
        }

        public void run() {
            int b;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f7339c != null && baseTransientBottomBar.f7338b != null && (b = (BaseTransientBottomBar.this.m10362z() - BaseTransientBottomBar.this.m10333D()) + ((int) BaseTransientBottomBar.this.f7339c.getTranslationY())) < BaseTransientBottomBar.this.f7349m) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f7339c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f7336v, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f7349m - b;
                BaseTransientBottomBar.this.f7339c.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C2227k implements C3399p {
        C2227k() {
        }

        /* renamed from: a */
        public C3356b0 mo923a(View view, C3356b0 b0Var) {
            int unused = BaseTransientBottomBar.this.f7346j = b0Var.mo11561e();
            int unused2 = BaseTransientBottomBar.this.f7347k = b0Var.mo11563f();
            int unused3 = BaseTransientBottomBar.this.f7348l = b0Var.mo11564g();
            BaseTransientBottomBar.this.m10342W();
            return b0Var;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C2228l extends C3350a {
        C2228l() {
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            cVar.mo11618a(1048576);
            cVar.mo11630g0(true);
        }

        /* renamed from: j */
        public boolean mo2998j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo2998j(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo8667t();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class C2229m implements C2244b.C2246b {
        C2229m() {
        }

        /* renamed from: a */
        public void mo8683a() {
            Handler handler = BaseTransientBottomBar.f7333s;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        /* renamed from: b */
        public void mo8684b(int i) {
            Handler handler = BaseTransientBottomBar.f7333s;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C2230n implements C2237t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        class C2231a implements Runnable {
            C2231a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo8659J(3);
            }
        }

        C2230n() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f7339c.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.f7349m = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.m10342W();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo8658H()) {
                BaseTransientBottomBar.f7333s.post(new C2231a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    class C2232o implements C2238u {
        C2232o() {
        }

        /* renamed from: a */
        public void mo8688a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f7339c.setOnLayoutChangeListener((C2238u) null);
            BaseTransientBottomBar.this.m10337R();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C2233p implements SwipeDismissBehavior.C2047c {
        C2233p() {
        }

        /* renamed from: a */
        public void mo7595a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.mo8668u(0);
        }

        /* renamed from: b */
        public void mo7596b(int i) {
            if (i == 0) {
                C2244b.m10418c().mo8730l(BaseTransientBottomBar.this.f7354r);
            } else if (i == 1 || i == 2) {
                C2244b.m10418c().mo8729k(BaseTransientBottomBar.this.f7354r);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    class C2234q implements Runnable {
        C2234q() {
        }

        public void run() {
            C2239v vVar = BaseTransientBottomBar.this.f7339c;
            if (vVar != null) {
                vVar.setVisibility(0);
                if (BaseTransientBottomBar.this.f7339c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.m10338S();
                } else {
                    BaseTransientBottomBar.this.m10340U();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static abstract class C2235r<B> {
        /* renamed from: a */
        public void mo8690a(B b, int i) {
        }

        /* renamed from: b */
        public void mo8691b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static class C2236s {

        /* renamed from: a */
        private C2244b.C2246b f7378a;

        public C2236s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo7593L(0.1f);
            swipeDismissBehavior.mo7591J(0.6f);
            swipeDismissBehavior.mo7594M(0);
        }

        /* renamed from: a */
        public boolean mo8692a(View view) {
            return view instanceof C2239v;
        }

        /* renamed from: b */
        public void mo8693b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C2244b.m10418c().mo8730l(this.f7378a);
                }
            } else if (coordinatorLayout.mo2680B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C2244b.m10418c().mo8729k(this.f7378a);
            }
        }

        /* renamed from: c */
        public void mo8694c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f7378a = baseTransientBottomBar.f7354r;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    protected interface C2237t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    protected interface C2238u {
        /* renamed from: a */
        void mo8688a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    protected static class C2239v extends FrameLayout {

        /* renamed from: m */
        private static final View.OnTouchListener f7379m = new C2240a();

        /* renamed from: f */
        private C2238u f7380f;

        /* renamed from: g */
        private C2237t f7381g;

        /* renamed from: h */
        private int f7382h;

        /* renamed from: i */
        private final float f7383i;

        /* renamed from: j */
        private final float f7384j;

        /* renamed from: k */
        private ColorStateList f7385k;

        /* renamed from: l */
        private PorterDuff.Mode f7386l;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        static class C2240a implements View.OnTouchListener {
            C2240a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C2239v(Context context, AttributeSet attributeSet) {
            super(C2306a.m10749c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C5006l.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C5006l.SnackbarLayout_elevation)) {
                C3403t.m14657p0(this, (float) obtainStyledAttributes.getDimensionPixelSize(C5006l.SnackbarLayout_elevation, 0));
            }
            this.f7382h = obtainStyledAttributes.getInt(C5006l.SnackbarLayout_animationMode, 0);
            this.f7383i = obtainStyledAttributes.getFloat(C5006l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C5046c.m21335a(context2, obtainStyledAttributes, C5006l.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C2206p.m10311e(obtainStyledAttributes.getInt(C5006l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f7384j = obtainStyledAttributes.getFloat(C5006l.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f7379m);
            setFocusable(true);
            if (getBackground() == null) {
                C3403t.m14649l0(this, m10399a());
            }
        }

        /* renamed from: a */
        private Drawable m10399a() {
            float dimension = getResources().getDimension(C4998d.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C5035a.m21309g(this, C4965b.colorSurface, C4965b.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f7385k == null) {
                return C0588a.m2775r(gradientDrawable);
            }
            Drawable r = C0588a.m2775r(gradientDrawable);
            C0588a.m2772o(r, this.f7385k);
            return r;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f7384j;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f7382h;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f7383i;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C2237t tVar = this.f7381g;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            C3403t.m14637f0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C2237t tVar = this.f7381g;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C2238u uVar = this.f7380f;
            if (uVar != null) {
                uVar.mo8688a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f7382h = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f7385k == null)) {
                drawable = C0588a.m2775r(drawable.mutate());
                C0588a.m2772o(drawable, this.f7385k);
                C0588a.m2773p(drawable, this.f7386l);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f7385k = colorStateList;
            if (getBackground() != null) {
                Drawable r = C0588a.m2775r(getBackground().mutate());
                C0588a.m2772o(r, colorStateList);
                C0588a.m2773p(r, this.f7386l);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f7386l = mode;
            if (getBackground() != null) {
                Drawable r = C0588a.m2775r(getBackground().mutate());
                C0588a.m2773p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(C2237t tVar) {
            this.f7381g = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f7379m);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(C2238u uVar) {
            this.f7380f = uVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f7334t = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, C2243a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f7337a = viewGroup;
            this.f7340d = aVar;
            Context context = viewGroup.getContext();
            this.f7338b = context;
            C2205o.m10298a(context);
            C2239v vVar = (C2239v) LayoutInflater.from(this.f7338b).inflate(mo8653A(), this.f7337a, false);
            this.f7339c = vVar;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo8717c(vVar.getActionTextColorAlpha());
            }
            this.f7339c.addView(view);
            ViewGroup.LayoutParams layoutParams = this.f7339c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f7345i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C3403t.m14647k0(this.f7339c, 1);
            C3403t.m14663s0(this.f7339c, 1);
            C3403t.m14659q0(this.f7339c, true);
            C3403t.m14667u0(this.f7339c, new C2227k());
            C3403t.m14643i0(this.f7339c, new C2228l());
            this.f7353q = (AccessibilityManager) this.f7338b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: B */
    private int m10332B() {
        int height = this.f7339c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f7339c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public int m10333D() {
        int[] iArr = new int[2];
        this.f7339c.getLocationOnScreen(iArr);
        return iArr[1] + this.f7339c.getHeight();
    }

    /* renamed from: I */
    private boolean m10334I() {
        ViewGroup.LayoutParams layoutParams = this.f7339c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0551f) && (((CoordinatorLayout.C0551f) layoutParams).mo2770f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: M */
    private void m10335M(CoordinatorLayout.C0551f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f7352p;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo8670x();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m10382P(this);
        }
        swipeDismissBehavior.mo7592K(new C2233p());
        fVar.mo2778o(swipeDismissBehavior);
        if (this.f7343g == null) {
            fVar.f2304g = 80;
        }
    }

    /* renamed from: O */
    private boolean m10336O() {
        return this.f7349m > 0 && !this.f7342f && m10334I();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m10337R() {
        if (mo8662N()) {
            mo8666q();
            return;
        }
        this.f7339c.setVisibility(0);
        mo8660K();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m10338S() {
        ValueAnimator v = m10360v(0.0f, 1.0f);
        ValueAnimator y = m10361y(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{v, y});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C2217a());
        animatorSet.start();
    }

    /* renamed from: T */
    private void m10339T(int i) {
        ValueAnimator v = m10360v(1.0f, 0.0f);
        v.setDuration(75);
        v.addListener(new C2218b(i));
        v.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m10340U() {
        int B = m10332B();
        if (f7334t) {
            C3403t.m14620U(this.f7339c, B);
        } else {
            this.f7339c.setTranslationY((float) B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{B, 0});
        valueAnimator.setInterpolator(C5007a.f14948b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C2221e());
        valueAnimator.addUpdateListener(new C2222f(B));
        valueAnimator.start();
    }

    /* renamed from: V */
    private void m10341V(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m10332B()});
        valueAnimator.setInterpolator(C5007a.f14948b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C2223g(i));
        valueAnimator.addUpdateListener(new C2224h());
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m10342W() {
        ViewGroup.LayoutParams layoutParams = this.f7339c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f7345i == null) {
            Log.w(f7336v, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        int i = this.f7343g != null ? this.f7350n : this.f7346j;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = this.f7345i;
        marginLayoutParams.bottomMargin = rect.bottom + i;
        marginLayoutParams.leftMargin = rect.left + this.f7347k;
        marginLayoutParams.rightMargin = rect.right + this.f7348l;
        this.f7339c.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m10336O()) {
            this.f7339c.removeCallbacks(this.f7344h);
            this.f7339c.post(this.f7344h);
        }
    }

    /* renamed from: r */
    private void m10358r(int i) {
        if (this.f7339c.getAnimationMode() == 1) {
            m10339T(i);
        } else {
            m10341V(i);
        }
    }

    /* renamed from: s */
    private int m10359s() {
        View view = this.f7343g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f7337a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f7337a.getHeight()) - i;
    }

    /* renamed from: v */
    private ValueAnimator m10360v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5007a.f14947a);
        ofFloat.addUpdateListener(new C2219c());
        return ofFloat;
    }

    /* renamed from: y */
    private ValueAnimator m10361y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5007a.f14950d);
        ofFloat.addUpdateListener(new C2220d());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public int m10362z() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f7338b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo8653A() {
        return mo8655E() ? C5002h.mtrl_layout_snackbar : C5002h.design_layout_snackbar;
    }

    /* renamed from: C */
    public View mo8654C() {
        return this.f7339c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo8655E() {
        TypedArray obtainStyledAttributes = this.f7338b.obtainStyledAttributes(f7335u);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo8656F(int i) {
        if (!mo8662N() || this.f7339c.getVisibility() != 0) {
            mo8659J(i);
        } else {
            m10358r(i);
        }
    }

    /* renamed from: G */
    public boolean mo8657G() {
        return C2244b.m10418c().mo8725e(this.f7354r);
    }

    /* renamed from: H */
    public boolean mo8658H() {
        return C2244b.m10418c().mo8726f(this.f7354r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo8659J(int i) {
        C2244b.m10418c().mo8727i(this.f7354r);
        List<C2235r<B>> list = this.f7351o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f7351o.get(size).mo8690a(this, i);
            }
        }
        ViewParent parent = this.f7339c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f7339c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo8660K() {
        C2244b.m10418c().mo8728j(this.f7354r);
        List<C2235r<B>> list = this.f7351o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f7351o.get(size).mo8691b(this);
            }
        }
    }

    /* renamed from: L */
    public B mo8661L(int i) {
        this.f7341e = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo8662N() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f7353q.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: P */
    public void mo8663P() {
        C2244b.m10418c().mo8731n(mo8669w(), this.f7354r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo8664Q() {
        this.f7339c.setOnAttachStateChangeListener(new C2230n());
        if (this.f7339c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f7339c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0551f) {
                m10335M((CoordinatorLayout.C0551f) layoutParams);
            }
            this.f7350n = m10359s();
            m10342W();
            this.f7339c.setVisibility(4);
            this.f7337a.addView(this.f7339c);
        }
        if (C3403t.m14614O(this.f7339c)) {
            m10337R();
        } else {
            this.f7339c.setOnLayoutChangeListener(new C2232o());
        }
    }

    /* renamed from: p */
    public B mo8665p(C2235r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f7351o == null) {
            this.f7351o = new ArrayList();
        }
        this.f7351o.add(rVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo8666q() {
        this.f7339c.post(new C2234q());
    }

    /* renamed from: t */
    public void mo8667t() {
        mo8668u(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo8668u(int i) {
        C2244b.m10418c().mo8723b(this.f7354r, i);
    }

    /* renamed from: w */
    public int mo8669w() {
        return this.f7341e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public SwipeDismissBehavior<? extends View> mo8670x() {
        return new Behavior();
    }
}
