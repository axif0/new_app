package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3415u;

/* renamed from: androidx.appcompat.widget.x0 */
class C0499x0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: o */
    private static C0499x0 f1936o;

    /* renamed from: p */
    private static C0499x0 f1937p;

    /* renamed from: f */
    private final View f1938f;

    /* renamed from: g */
    private final CharSequence f1939g;

    /* renamed from: h */
    private final int f1940h;

    /* renamed from: i */
    private final Runnable f1941i = new C0500a();

    /* renamed from: j */
    private final Runnable f1942j = new C0501b();

    /* renamed from: k */
    private int f1943k;

    /* renamed from: l */
    private int f1944l;

    /* renamed from: m */
    private C0506y0 f1945m;

    /* renamed from: n */
    private boolean f1946n;

    /* renamed from: androidx.appcompat.widget.x0$a */
    class C0500a implements Runnable {
        C0500a() {
        }

        public void run() {
            C0499x0.this.mo2460g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$b */
    class C0501b implements Runnable {
        C0501b() {
        }

        public void run() {
            C0499x0.this.mo2459c();
        }
    }

    private C0499x0(View view, CharSequence charSequence) {
        this.f1938f = view;
        this.f1939g = charSequence;
        this.f1940h = C3415u.m14719c(ViewConfiguration.get(view.getContext()));
        m2282b();
        this.f1938f.setOnLongClickListener(this);
        this.f1938f.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m2281a() {
        this.f1938f.removeCallbacks(this.f1941i);
    }

    /* renamed from: b */
    private void m2282b() {
        this.f1943k = Integer.MAX_VALUE;
        this.f1944l = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m2283d() {
        this.f1938f.postDelayed(this.f1941i, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m2284e(C0499x0 x0Var) {
        C0499x0 x0Var2 = f1936o;
        if (x0Var2 != null) {
            x0Var2.m2281a();
        }
        f1936o = x0Var;
        if (x0Var != null) {
            x0Var.m2283d();
        }
    }

    /* renamed from: f */
    public static void m2285f(View view, CharSequence charSequence) {
        C0499x0 x0Var = f1936o;
        if (x0Var != null && x0Var.f1938f == view) {
            m2284e((C0499x0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0499x0 x0Var2 = f1937p;
            if (x0Var2 != null && x0Var2.f1938f == view) {
                x0Var2.mo2459c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0499x0(view, charSequence);
    }

    /* renamed from: h */
    private boolean m2286h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1943k) <= this.f1940h && Math.abs(y - this.f1944l) <= this.f1940h) {
            return false;
        }
        this.f1943k = x;
        this.f1944l = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2459c() {
        if (f1937p == this) {
            f1937p = null;
            C0506y0 y0Var = this.f1945m;
            if (y0Var != null) {
                y0Var.mo2483c();
                this.f1945m = null;
                m2282b();
                this.f1938f.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1936o == this) {
            m2284e((C0499x0) null);
        }
        this.f1938f.removeCallbacks(this.f1942j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2460g(boolean z) {
        long j;
        if (C3403t.m14613N(this.f1938f)) {
            m2284e((C0499x0) null);
            C0499x0 x0Var = f1937p;
            if (x0Var != null) {
                x0Var.mo2459c();
            }
            f1937p = this;
            this.f1946n = z;
            C0506y0 y0Var = new C0506y0(this.f1938f.getContext());
            this.f1945m = y0Var;
            y0Var.mo2485e(this.f1938f, this.f1943k, this.f1944l, this.f1946n, this.f1939g);
            this.f1938f.addOnAttachStateChangeListener(this);
            if (this.f1946n) {
                j = 2500;
            } else {
                j = ((C3403t.m14607H(this.f1938f) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1938f.removeCallbacks(this.f1942j);
            this.f1938f.postDelayed(this.f1942j, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1945m != null && this.f1946n) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1938f.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m2282b();
                mo2459c();
            }
        } else if (this.f1938f.isEnabled() && this.f1945m == null && m2286h(motionEvent)) {
            m2284e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1943k = view.getWidth() / 2;
        this.f1944l = view.getHeight() / 2;
        mo2460g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2459c();
    }
}
