package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.widget.C0601b;
import androidx.core.widget.C0608i;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p086f.p087a.C3132j;
import p086f.p111h.p112e.p113c.C3279f;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.widget.x */
class C0497x {

    /* renamed from: a */
    private final TextView f1919a;

    /* renamed from: b */
    private C0475s0 f1920b;

    /* renamed from: c */
    private C0475s0 f1921c;

    /* renamed from: d */
    private C0475s0 f1922d;

    /* renamed from: e */
    private C0475s0 f1923e;

    /* renamed from: f */
    private C0475s0 f1924f;

    /* renamed from: g */
    private C0475s0 f1925g;

    /* renamed from: h */
    private C0475s0 f1926h;

    /* renamed from: i */
    private final C0502y f1927i;

    /* renamed from: j */
    private int f1928j = 0;

    /* renamed from: k */
    private int f1929k = -1;

    /* renamed from: l */
    private Typeface f1930l;

    /* renamed from: m */
    private boolean f1931m;

    /* renamed from: androidx.appcompat.widget.x$a */
    class C0498a extends C3279f.C3280a {

        /* renamed from: a */
        final /* synthetic */ int f1932a;

        /* renamed from: b */
        final /* synthetic */ int f1933b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1934c;

        C0498a(int i, int i2, WeakReference weakReference) {
            this.f1932a = i;
            this.f1933b = i2;
            this.f1934c = weakReference;
        }

        /* renamed from: c */
        public void mo2457c(int i) {
        }

        /* renamed from: d */
        public void mo2458d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1932a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1933b & 2) != 0);
            }
            C0497x.this.mo2446n(this.f1934c, typeface);
        }
    }

    C0497x(TextView textView) {
        this.f1919a = textView;
        this.f1927i = new C0502y(this.f1919a);
    }

    /* renamed from: A */
    private void m2251A(int i, float f) {
        this.f1927i.mo2480y(i, f);
    }

    /* renamed from: B */
    private void m2252B(Context context, C0479u0 u0Var) {
        String o;
        Typeface typeface;
        Typeface typeface2;
        this.f1928j = u0Var.mo2353k(C3132j.TextAppearance_android_textStyle, this.f1928j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int k = u0Var.mo2353k(C3132j.TextAppearance_android_textFontWeight, -1);
            this.f1929k = k;
            if (k != -1) {
                this.f1928j = (this.f1928j & 2) | 0;
            }
        }
        if (u0Var.mo2361s(C3132j.TextAppearance_android_fontFamily) || u0Var.mo2361s(C3132j.TextAppearance_fontFamily)) {
            this.f1930l = null;
            int i = u0Var.mo2361s(C3132j.TextAppearance_fontFamily) ? C3132j.TextAppearance_fontFamily : C3132j.TextAppearance_android_fontFamily;
            int i2 = this.f1929k;
            int i3 = this.f1928j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = u0Var.mo2352j(i, this.f1928j, new C0498a(i2, i3, new WeakReference(this.f1919a)));
                    if (j != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.f1929k != -1) {
                            j = Typeface.create(Typeface.create(j, 0), this.f1929k, (this.f1928j & 2) != 0);
                        }
                        this.f1930l = j;
                    }
                    this.f1931m = this.f1930l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1930l == null && (o = u0Var.mo2357o(i)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1929k == -1) {
                    typeface = Typeface.create(o, this.f1928j);
                } else {
                    Typeface create = Typeface.create(o, 0);
                    int i4 = this.f1929k;
                    if ((this.f1928j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i4, z);
                }
                this.f1930l = typeface;
            }
        } else if (u0Var.mo2361s(C3132j.TextAppearance_android_typeface)) {
            this.f1931m = false;
            int k2 = u0Var.mo2353k(C3132j.TextAppearance_android_typeface, 1);
            if (k2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (k2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1930l = typeface2;
        }
    }

    /* renamed from: a */
    private void m2253a(Drawable drawable, C0475s0 s0Var) {
        if (drawable != null && s0Var != null) {
            C0441i.m2012i(drawable, s0Var, this.f1919a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0475s0 m2254d(Context context, C0441i iVar, int i) {
        ColorStateList f = iVar.mo2164f(context, i);
        if (f == null) {
            return null;
        }
        C0475s0 s0Var = new C0475s0();
        s0Var.f1854d = true;
        s0Var.f1851a = f;
        return s0Var;
    }

    /* renamed from: x */
    private void m2255x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1919a.getCompoundDrawablesRelative();
            TextView textView = this.f1919a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1919a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1919a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1919a.getCompoundDrawables();
            TextView textView3 = this.f1919a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: y */
    private void m2256y() {
        C0475s0 s0Var = this.f1926h;
        this.f1920b = s0Var;
        this.f1921c = s0Var;
        this.f1922d = s0Var;
        this.f1923e = s0Var;
        this.f1924f = s0Var;
        this.f1925g = s0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2435b() {
        if (!(this.f1920b == null && this.f1921c == null && this.f1922d == null && this.f1923e == null)) {
            Drawable[] compoundDrawables = this.f1919a.getCompoundDrawables();
            m2253a(compoundDrawables[0], this.f1920b);
            m2253a(compoundDrawables[1], this.f1921c);
            m2253a(compoundDrawables[2], this.f1922d);
            m2253a(compoundDrawables[3], this.f1923e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1924f != null || this.f1925g != null) {
            Drawable[] compoundDrawablesRelative = this.f1919a.getCompoundDrawablesRelative();
            m2253a(compoundDrawablesRelative[0], this.f1924f);
            m2253a(compoundDrawablesRelative[2], this.f1925g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2436c() {
        this.f1927i.mo2467b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo2437e() {
        return this.f1927i.mo2469j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2438f() {
        return this.f1927i.mo2470k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2439g() {
        return this.f1927i.mo2471l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo2440h() {
        return this.f1927i.mo2472m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo2441i() {
        return this.f1927i.mo2473n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo2442j() {
        C0475s0 s0Var = this.f1926h;
        if (s0Var != null) {
            return s0Var.f1851a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo2443k() {
        C0475s0 s0Var = this.f1926h;
        if (s0Var != null) {
            return s0Var.f1852b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo2444l() {
        return this.f1927i.mo2475s();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: m */
    public void mo2445m(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        String str;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        String str2;
        ColorStateList colorStateList3;
        boolean z3;
        int i2;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        Context context = this.f1919a.getContext();
        C0441i b = C0441i.m2009b();
        C0479u0 v = C0479u0.m2148v(context, attributeSet2, C3132j.AppCompatTextHelper, i3, 0);
        TextView textView = this.f1919a;
        C3403t.m14639g0(textView, textView.getContext(), C3132j.AppCompatTextHelper, attributeSet, v.mo2360r(), i, 0);
        int n = v.mo2356n(C3132j.AppCompatTextHelper_android_textAppearance, -1);
        if (v.mo2361s(C3132j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1920b = m2254d(context, b, v.mo2356n(C3132j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (v.mo2361s(C3132j.AppCompatTextHelper_android_drawableTop)) {
            this.f1921c = m2254d(context, b, v.mo2356n(C3132j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (v.mo2361s(C3132j.AppCompatTextHelper_android_drawableRight)) {
            this.f1922d = m2254d(context, b, v.mo2356n(C3132j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (v.mo2361s(C3132j.AppCompatTextHelper_android_drawableBottom)) {
            this.f1923e = m2254d(context, b, v.mo2356n(C3132j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (v.mo2361s(C3132j.AppCompatTextHelper_android_drawableStart)) {
                this.f1924f = m2254d(context, b, v.mo2356n(C3132j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (v.mo2361s(C3132j.AppCompatTextHelper_android_drawableEnd)) {
                this.f1925g = m2254d(context, b, v.mo2356n(C3132j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        v.mo2362w();
        boolean z4 = this.f1919a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n != -1) {
            C0479u0 t = C0479u0.m2146t(context, n, C3132j.TextAppearance);
            if (z4 || !t.mo2361s(C3132j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = t.mo2343a(C3132j.TextAppearance_textAllCaps, false);
                z = true;
            }
            m2252B(context, t);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = t.mo2361s(C3132j.TextAppearance_android_textColor) ? t.mo2345c(C3132j.TextAppearance_android_textColor) : null;
                colorStateList3 = t.mo2361s(C3132j.TextAppearance_android_textColorHint) ? t.mo2345c(C3132j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = t.mo2361s(C3132j.TextAppearance_android_textColorLink) ? t.mo2345c(C3132j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str = t.mo2361s(C3132j.TextAppearance_textLocale) ? t.mo2357o(C3132j.TextAppearance_textLocale) : null;
            str2 = (Build.VERSION.SDK_INT < 26 || !t.mo2361s(C3132j.TextAppearance_fontVariationSettings)) ? null : t.mo2357o(C3132j.TextAppearance_fontVariationSettings);
            t.mo2362w();
        } else {
            colorStateList3 = null;
            str2 = null;
            z2 = false;
            z = false;
            colorStateList2 = null;
            str = null;
            colorStateList = null;
        }
        C0479u0 v2 = C0479u0.m2148v(context, attributeSet2, C3132j.TextAppearance, i3, 0);
        if (z4 || !v2.mo2361s(C3132j.TextAppearance_textAllCaps)) {
            z3 = z;
        } else {
            z2 = v2.mo2343a(C3132j.TextAppearance_textAllCaps, false);
            z3 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (v2.mo2361s(C3132j.TextAppearance_android_textColor)) {
                colorStateList = v2.mo2345c(C3132j.TextAppearance_android_textColor);
            }
            if (v2.mo2361s(C3132j.TextAppearance_android_textColorHint)) {
                colorStateList3 = v2.mo2345c(C3132j.TextAppearance_android_textColorHint);
            }
            if (v2.mo2361s(C3132j.TextAppearance_android_textColorLink)) {
                colorStateList2 = v2.mo2345c(C3132j.TextAppearance_android_textColorLink);
            }
        }
        if (v2.mo2361s(C3132j.TextAppearance_textLocale)) {
            str = v2.mo2357o(C3132j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && v2.mo2361s(C3132j.TextAppearance_fontVariationSettings)) {
            str2 = v2.mo2357o(C3132j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && v2.mo2361s(C3132j.TextAppearance_android_textSize) && v2.mo2348f(C3132j.TextAppearance_android_textSize, -1) == 0) {
            this.f1919a.setTextSize(0, 0.0f);
        }
        m2252B(context, v2);
        v2.mo2362w();
        if (colorStateList != null) {
            this.f1919a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.f1919a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f1919a.setLinkTextColor(colorStateList2);
        }
        if (!z4 && z3) {
            mo2450r(z2);
        }
        Typeface typeface = this.f1930l;
        if (typeface != null) {
            if (this.f1929k == -1) {
                this.f1919a.setTypeface(typeface, this.f1928j);
            } else {
                this.f1919a.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            this.f1919a.setFontVariationSettings(str2);
        }
        if (str != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 24) {
                this.f1919a.setTextLocales(LocaleList.forLanguageTags(str));
            } else if (i4 >= 21) {
                this.f1919a.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
            }
        }
        this.f1927i.mo2476t(attributeSet2, i3);
        if (C0601b.f2517a && this.f1927i.mo2473n() != 0) {
            int[] m = this.f1927i.mo2472m();
            if (m.length > 0) {
                if (((float) this.f1919a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f1919a.setAutoSizeTextTypeUniformWithConfiguration(this.f1927i.mo2470k(), this.f1927i.mo2469j(), this.f1927i.mo2471l(), 0);
                } else {
                    this.f1919a.setAutoSizeTextTypeUniformWithPresetSizes(m, 0);
                }
            }
        }
        C0479u0 u = C0479u0.m2147u(context, attributeSet2, C3132j.AppCompatTextView);
        int n2 = u.mo2356n(C3132j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable c = n2 != -1 ? b.mo2162c(context, n2) : null;
        int n3 = u.mo2356n(C3132j.AppCompatTextView_drawableTopCompat, -1);
        Drawable c2 = n3 != -1 ? b.mo2162c(context, n3) : null;
        int n4 = u.mo2356n(C3132j.AppCompatTextView_drawableRightCompat, -1);
        Drawable c3 = n4 != -1 ? b.mo2162c(context, n4) : null;
        int n5 = u.mo2356n(C3132j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable c4 = n5 != -1 ? b.mo2162c(context, n5) : null;
        int n6 = u.mo2356n(C3132j.AppCompatTextView_drawableStartCompat, -1);
        Drawable c5 = n6 != -1 ? b.mo2162c(context, n6) : null;
        int n7 = u.mo2356n(C3132j.AppCompatTextView_drawableEndCompat, -1);
        m2255x(c, c2, c3, c4, c5, n7 != -1 ? b.mo2162c(context, n7) : null);
        if (u.mo2361s(C3132j.AppCompatTextView_drawableTint)) {
            C0608i.m2896j(this.f1919a, u.mo2345c(C3132j.AppCompatTextView_drawableTint));
        }
        if (u.mo2361s(C3132j.AppCompatTextView_drawableTintMode)) {
            i2 = -1;
            C0608i.m2897k(this.f1919a, C0418c0.m1905e(u.mo2353k(C3132j.AppCompatTextView_drawableTintMode, -1), (PorterDuff.Mode) null));
        } else {
            i2 = -1;
        }
        int f = u.mo2348f(C3132j.AppCompatTextView_firstBaselineToTopHeight, i2);
        int f2 = u.mo2348f(C3132j.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int f3 = u.mo2348f(C3132j.AppCompatTextView_lineHeight, i2);
        u.mo2362w();
        if (f != i2) {
            C0608i.m2899m(this.f1919a, f);
        }
        if (f2 != i2) {
            C0608i.m2900n(this.f1919a, f2);
        }
        if (f3 != i2) {
            C0608i.m2901o(this.f1919a, f3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2446n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1931m) {
            this.f1930l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1928j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2447o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0601b.f2517a) {
            mo2436c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2448p() {
        mo2435b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2449q(Context context, int i) {
        String o;
        ColorStateList c;
        C0479u0 t = C0479u0.m2146t(context, i, C3132j.TextAppearance);
        if (t.mo2361s(C3132j.TextAppearance_textAllCaps)) {
            mo2450r(t.mo2343a(C3132j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && t.mo2361s(C3132j.TextAppearance_android_textColor) && (c = t.mo2345c(C3132j.TextAppearance_android_textColor)) != null) {
            this.f1919a.setTextColor(c);
        }
        if (t.mo2361s(C3132j.TextAppearance_android_textSize) && t.mo2348f(C3132j.TextAppearance_android_textSize, -1) == 0) {
            this.f1919a.setTextSize(0, 0.0f);
        }
        m2252B(context, t);
        if (Build.VERSION.SDK_INT >= 26 && t.mo2361s(C3132j.TextAppearance_fontVariationSettings) && (o = t.mo2357o(C3132j.TextAppearance_fontVariationSettings)) != null) {
            this.f1919a.setFontVariationSettings(o);
        }
        t.mo2362w();
        Typeface typeface = this.f1930l;
        if (typeface != null) {
            this.f1919a.setTypeface(typeface, this.f1928j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2450r(boolean z) {
        this.f1919a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2451s(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1927i.mo2477u(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2452t(int[] iArr, int i) throws IllegalArgumentException {
        this.f1927i.mo2478v(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2453u(int i) {
        this.f1927i.mo2479w(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2454v(ColorStateList colorStateList) {
        if (this.f1926h == null) {
            this.f1926h = new C0475s0();
        }
        C0475s0 s0Var = this.f1926h;
        s0Var.f1851a = colorStateList;
        s0Var.f1854d = colorStateList != null;
        m2256y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2455w(PorterDuff.Mode mode) {
        if (this.f1926h == null) {
            this.f1926h = new C0475s0();
        }
        C0475s0 s0Var = this.f1926h;
        s0Var.f1852b = mode;
        s0Var.f1853c = mode != null;
        m2256y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo2456z(int i, float f) {
        if (!C0601b.f2517a && !mo2444l()) {
            m2251A(i, f);
        }
    }
}
