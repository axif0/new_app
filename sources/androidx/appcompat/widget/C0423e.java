package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p086f.p087a.C3132j;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.widget.e */
class C0423e {

    /* renamed from: a */
    private final View f1661a;

    /* renamed from: b */
    private final C0441i f1662b;

    /* renamed from: c */
    private int f1663c = -1;

    /* renamed from: d */
    private C0475s0 f1664d;

    /* renamed from: e */
    private C0475s0 f1665e;

    /* renamed from: f */
    private C0475s0 f1666f;

    C0423e(View view) {
        this.f1661a = view;
        this.f1662b = C0441i.m2009b();
    }

    /* renamed from: a */
    private boolean m1920a(Drawable drawable) {
        if (this.f1666f == null) {
            this.f1666f = new C0475s0();
        }
        C0475s0 s0Var = this.f1666f;
        s0Var.mo2335a();
        ColorStateList p = C3403t.m14656p(this.f1661a);
        if (p != null) {
            s0Var.f1854d = true;
            s0Var.f1851a = p;
        }
        PorterDuff.Mode q = C3403t.m14658q(this.f1661a);
        if (q != null) {
            s0Var.f1853c = true;
            s0Var.f1852b = q;
        }
        if (!s0Var.f1854d && !s0Var.f1853c) {
            return false;
        }
        C0441i.m2012i(drawable, s0Var, this.f1661a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1921k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1664d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2034b() {
        Drawable background = this.f1661a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1921k() || !m1920a(background)) {
            C0475s0 s0Var = this.f1665e;
            if (s0Var != null) {
                C0441i.m2012i(background, s0Var, this.f1661a.getDrawableState());
                return;
            }
            C0475s0 s0Var2 = this.f1664d;
            if (s0Var2 != null) {
                C0441i.m2012i(background, s0Var2, this.f1661a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2035c() {
        C0475s0 s0Var = this.f1665e;
        if (s0Var != null) {
            return s0Var.f1851a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2036d() {
        C0475s0 s0Var = this.f1665e;
        if (s0Var != null) {
            return s0Var.f1852b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2037e(AttributeSet attributeSet, int i) {
        C0479u0 v = C0479u0.m2148v(this.f1661a.getContext(), attributeSet, C3132j.ViewBackgroundHelper, i, 0);
        View view = this.f1661a;
        C3403t.m14639g0(view, view.getContext(), C3132j.ViewBackgroundHelper, attributeSet, v.mo2360r(), i, 0);
        try {
            if (v.mo2361s(C3132j.ViewBackgroundHelper_android_background)) {
                this.f1663c = v.mo2356n(C3132j.ViewBackgroundHelper_android_background, -1);
                ColorStateList f = this.f1662b.mo2164f(this.f1661a.getContext(), this.f1663c);
                if (f != null) {
                    mo2040h(f);
                }
            }
            if (v.mo2361s(C3132j.ViewBackgroundHelper_backgroundTint)) {
                C3403t.m14651m0(this.f1661a, v.mo2345c(C3132j.ViewBackgroundHelper_backgroundTint));
            }
            if (v.mo2361s(C3132j.ViewBackgroundHelper_backgroundTintMode)) {
                C3403t.m14653n0(this.f1661a, C0418c0.m1905e(v.mo2353k(C3132j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo2362w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2038f(Drawable drawable) {
        this.f1663c = -1;
        mo2040h((ColorStateList) null);
        mo2034b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2039g(int i) {
        this.f1663c = i;
        C0441i iVar = this.f1662b;
        mo2040h(iVar != null ? iVar.mo2164f(this.f1661a.getContext(), i) : null);
        mo2034b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2040h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1664d == null) {
                this.f1664d = new C0475s0();
            }
            C0475s0 s0Var = this.f1664d;
            s0Var.f1851a = colorStateList;
            s0Var.f1854d = true;
        } else {
            this.f1664d = null;
        }
        mo2034b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2041i(ColorStateList colorStateList) {
        if (this.f1665e == null) {
            this.f1665e = new C0475s0();
        }
        C0475s0 s0Var = this.f1665e;
        s0Var.f1851a = colorStateList;
        s0Var.f1854d = true;
        mo2034b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2042j(PorterDuff.Mode mode) {
        if (this.f1665e == null) {
            this.f1665e = new C0475s0();
        }
        C0475s0 s0Var = this.f1665e;
        s0Var.f1852b = mode;
        s0Var.f1853c = true;
        mo2034b();
    }
}
