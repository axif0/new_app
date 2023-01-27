package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0604e;
import p086f.p087a.C3132j;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.widget.m */
public class C0457m {

    /* renamed from: a */
    private final ImageView f1776a;

    /* renamed from: b */
    private C0475s0 f1777b;

    /* renamed from: c */
    private C0475s0 f1778c;

    /* renamed from: d */
    private C0475s0 f1779d;

    public C0457m(ImageView imageView) {
        this.f1776a = imageView;
    }

    /* renamed from: a */
    private boolean m2075a(Drawable drawable) {
        if (this.f1779d == null) {
            this.f1779d = new C0475s0();
        }
        C0475s0 s0Var = this.f1779d;
        s0Var.mo2335a();
        ColorStateList a = C0604e.m2876a(this.f1776a);
        if (a != null) {
            s0Var.f1854d = true;
            s0Var.f1851a = a;
        }
        PorterDuff.Mode b = C0604e.m2877b(this.f1776a);
        if (b != null) {
            s0Var.f1853c = true;
            s0Var.f1852b = b;
        }
        if (!s0Var.f1854d && !s0Var.f1853c) {
            return false;
        }
        C0441i.m2012i(drawable, s0Var, this.f1776a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m2076j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1777b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2253b() {
        Drawable drawable = this.f1776a.getDrawable();
        if (drawable != null) {
            C0418c0.m1902b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m2076j() || !m2075a(drawable)) {
            C0475s0 s0Var = this.f1778c;
            if (s0Var != null) {
                C0441i.m2012i(drawable, s0Var, this.f1776a.getDrawableState());
                return;
            }
            C0475s0 s0Var2 = this.f1777b;
            if (s0Var2 != null) {
                C0441i.m2012i(drawable, s0Var2, this.f1776a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2254c() {
        C0475s0 s0Var = this.f1778c;
        if (s0Var != null) {
            return s0Var.f1851a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2255d() {
        C0475s0 s0Var = this.f1778c;
        if (s0Var != null) {
            return s0Var.f1852b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo2256e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1776a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void mo2257f(AttributeSet attributeSet, int i) {
        int n;
        C0479u0 v = C0479u0.m2148v(this.f1776a.getContext(), attributeSet, C3132j.AppCompatImageView, i, 0);
        ImageView imageView = this.f1776a;
        C3403t.m14639g0(imageView, imageView.getContext(), C3132j.AppCompatImageView, attributeSet, v.mo2360r(), i, 0);
        try {
            Drawable drawable = this.f1776a.getDrawable();
            if (!(drawable != null || (n = v.mo2356n(C3132j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C3133a.m13388d(this.f1776a.getContext(), n)) == null)) {
                this.f1776a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0418c0.m1902b(drawable);
            }
            if (v.mo2361s(C3132j.AppCompatImageView_tint)) {
                C0604e.m2878c(this.f1776a, v.mo2345c(C3132j.AppCompatImageView_tint));
            }
            if (v.mo2361s(C3132j.AppCompatImageView_tintMode)) {
                C0604e.m2879d(this.f1776a, C0418c0.m1905e(v.mo2353k(C3132j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo2362w();
        }
    }

    /* renamed from: g */
    public void mo2258g(int i) {
        if (i != 0) {
            Drawable d = C3133a.m13388d(this.f1776a.getContext(), i);
            if (d != null) {
                C0418c0.m1902b(d);
            }
            this.f1776a.setImageDrawable(d);
        } else {
            this.f1776a.setImageDrawable((Drawable) null);
        }
        mo2253b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2259h(ColorStateList colorStateList) {
        if (this.f1778c == null) {
            this.f1778c = new C0475s0();
        }
        C0475s0 s0Var = this.f1778c;
        s0Var.f1851a = colorStateList;
        s0Var.f1854d = true;
        mo2253b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2260i(PorterDuff.Mode mode) {
        if (this.f1778c == null) {
            this.f1778c = new C0475s0();
        }
        C0475s0 s0Var = this.f1778c;
        s0Var.f1852b = mode;
        s0Var.f1853c = true;
        mo2253b();
    }
}
