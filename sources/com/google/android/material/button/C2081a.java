package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0588a;
import com.google.android.material.internal.C2206p;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p254b0.C4994n;
import p148g.p189d.p190a.p252d.p262r.C5035a;
import p148g.p189d.p190a.p252d.p269y.C5046c;
import p148g.p189d.p190a.p252d.p270z.C5052a;
import p148g.p189d.p190a.p252d.p270z.C5055b;

/* renamed from: com.google.android.material.button.a */
class C2081a {

    /* renamed from: s */
    private static final boolean f6796s = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f6797a;

    /* renamed from: b */
    private C4979k f6798b;

    /* renamed from: c */
    private int f6799c;

    /* renamed from: d */
    private int f6800d;

    /* renamed from: e */
    private int f6801e;

    /* renamed from: f */
    private int f6802f;

    /* renamed from: g */
    private int f6803g;

    /* renamed from: h */
    private int f6804h;

    /* renamed from: i */
    private PorterDuff.Mode f6805i;

    /* renamed from: j */
    private ColorStateList f6806j;

    /* renamed from: k */
    private ColorStateList f6807k;

    /* renamed from: l */
    private ColorStateList f6808l;

    /* renamed from: m */
    private Drawable f6809m;

    /* renamed from: n */
    private boolean f6810n = false;

    /* renamed from: o */
    private boolean f6811o = false;

    /* renamed from: p */
    private boolean f6812p = false;

    /* renamed from: q */
    private boolean f6813q;

    /* renamed from: r */
    private LayerDrawable f6814r;

    C2081a(MaterialButton materialButton, C4979k kVar) {
        this.f6797a = materialButton;
        this.f6798b = kVar;
    }

    /* renamed from: A */
    private void m9520A(C4979k kVar) {
        if (mo7754d() != null) {
            mo7754d().setShapeAppearanceModel(kVar);
        }
        if (m9525l() != null) {
            m9525l().setShapeAppearanceModel(kVar);
        }
        if (mo7753c() != null) {
            mo7753c().setShapeAppearanceModel(kVar);
        }
    }

    /* renamed from: C */
    private void m9521C() {
        C4972g d = mo7754d();
        C4972g l = m9525l();
        if (d != null) {
            d.mo14934f0((float) this.f6804h, this.f6807k);
            if (l != null) {
                l.mo14933e0((float) this.f6804h, this.f6810n ? C5035a.m21305c(this.f6797a, C4965b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: D */
    private InsetDrawable m9522D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f6799c, this.f6801e, this.f6800d, this.f6802f);
    }

    /* renamed from: a */
    private Drawable m9523a() {
        C4972g gVar = new C4972g(this.f6798b);
        gVar.mo14920N(this.f6797a.getContext());
        C0588a.m2772o(gVar, this.f6806j);
        PorterDuff.Mode mode = this.f6805i;
        if (mode != null) {
            C0588a.m2773p(gVar, mode);
        }
        gVar.mo14934f0((float) this.f6804h, this.f6807k);
        C4972g gVar2 = new C4972g(this.f6798b);
        gVar2.setTint(0);
        gVar2.mo14933e0((float) this.f6804h, this.f6810n ? C5035a.m21305c(this.f6797a, C4965b.colorSurface) : 0);
        if (f6796s) {
            C4972g gVar3 = new C4972g(this.f6798b);
            this.f6809m = gVar3;
            C0588a.m2771n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C5055b.m21364d(this.f6808l), m9522D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f6809m);
            this.f6814r = rippleDrawable;
            return rippleDrawable;
        }
        C5052a aVar = new C5052a(this.f6798b);
        this.f6809m = aVar;
        C0588a.m2772o(aVar, C5055b.m21364d(this.f6808l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f6809m});
        this.f6814r = layerDrawable;
        return m9522D(layerDrawable);
    }

    /* renamed from: e */
    private C4972g m9524e(boolean z) {
        LayerDrawable layerDrawable = this.f6814r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C4972g) (f6796s ? (LayerDrawable) ((InsetDrawable) this.f6814r.getDrawable(0)).getDrawable() : this.f6814r).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: l */
    private C4972g m9525l() {
        return m9524e(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo7751B(int i, int i2) {
        Drawable drawable = this.f6809m;
        if (drawable != null) {
            drawable.setBounds(this.f6799c, this.f6801e, i2 - this.f6800d, i - this.f6802f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo7752b() {
        return this.f6803g;
    }

    /* renamed from: c */
    public C4994n mo7753c() {
        LayerDrawable layerDrawable = this.f6814r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (C4994n) (this.f6814r.getNumberOfLayers() > 2 ? this.f6814r.getDrawable(2) : this.f6814r.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4972g mo7754d() {
        return m9524e(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo7755f() {
        return this.f6808l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C4979k mo7756g() {
        return this.f6798b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo7757h() {
        return this.f6807k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo7758i() {
        return this.f6804h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo7759j() {
        return this.f6806j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo7760k() {
        return this.f6805i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo7761m() {
        return this.f6811o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo7762n() {
        return this.f6813q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo7763o(TypedArray typedArray) {
        this.f6799c = typedArray.getDimensionPixelOffset(C5006l.MaterialButton_android_insetLeft, 0);
        this.f6800d = typedArray.getDimensionPixelOffset(C5006l.MaterialButton_android_insetRight, 0);
        this.f6801e = typedArray.getDimensionPixelOffset(C5006l.MaterialButton_android_insetTop, 0);
        this.f6802f = typedArray.getDimensionPixelOffset(C5006l.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C5006l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C5006l.MaterialButton_cornerRadius, -1);
            this.f6803g = dimensionPixelSize;
            mo7769u(this.f6798b.mo14973w((float) dimensionPixelSize));
            this.f6812p = true;
        }
        this.f6804h = typedArray.getDimensionPixelSize(C5006l.MaterialButton_strokeWidth, 0);
        this.f6805i = C2206p.m10311e(typedArray.getInt(C5006l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f6806j = C5046c.m21335a(this.f6797a.getContext(), typedArray, C5006l.MaterialButton_backgroundTint);
        this.f6807k = C5046c.m21335a(this.f6797a.getContext(), typedArray, C5006l.MaterialButton_strokeColor);
        this.f6808l = C5046c.m21335a(this.f6797a.getContext(), typedArray, C5006l.MaterialButton_rippleColor);
        this.f6813q = typedArray.getBoolean(C5006l.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C5006l.MaterialButton_elevation, 0);
        int D = C3403t.m14603D(this.f6797a);
        int paddingTop = this.f6797a.getPaddingTop();
        int C = C3403t.m14602C(this.f6797a);
        int paddingBottom = this.f6797a.getPaddingBottom();
        if (typedArray.hasValue(C5006l.MaterialButton_android_background)) {
            mo7765q();
        } else {
            this.f6797a.setInternalBackground(m9523a());
            C4972g d = mo7754d();
            if (d != null) {
                d.mo14925W((float) dimensionPixelSize2);
            }
        }
        C3403t.m14669v0(this.f6797a, D + this.f6799c, paddingTop + this.f6801e, C + this.f6800d, paddingBottom + this.f6802f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo7764p(int i) {
        if (mo7754d() != null) {
            mo7754d().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo7765q() {
        this.f6811o = true;
        this.f6797a.setSupportBackgroundTintList(this.f6806j);
        this.f6797a.setSupportBackgroundTintMode(this.f6805i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo7766r(boolean z) {
        this.f6813q = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo7767s(int i) {
        if (!this.f6812p || this.f6803g != i) {
            this.f6803g = i;
            this.f6812p = true;
            mo7769u(this.f6798b.mo14973w((float) i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo7768t(ColorStateList colorStateList) {
        if (this.f6808l != colorStateList) {
            this.f6808l = colorStateList;
            if (f6796s && (this.f6797a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f6797a.getBackground()).setColor(C5055b.m21364d(colorStateList));
            } else if (!f6796s && (this.f6797a.getBackground() instanceof C5052a)) {
                ((C5052a) this.f6797a.getBackground()).setTintList(C5055b.m21364d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo7769u(C4979k kVar) {
        this.f6798b = kVar;
        m9520A(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo7770v(boolean z) {
        this.f6810n = z;
        m9521C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo7771w(ColorStateList colorStateList) {
        if (this.f6807k != colorStateList) {
            this.f6807k = colorStateList;
            m9521C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo7772x(int i) {
        if (this.f6804h != i) {
            this.f6804h = i;
            m9521C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo7773y(ColorStateList colorStateList) {
        if (this.f6806j != colorStateList) {
            this.f6806j = colorStateList;
            if (mo7754d() != null) {
                C0588a.m2772o(mo7754d(), this.f6806j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo7774z(PorterDuff.Mode mode) {
        if (this.f6805i != mode) {
            this.f6805i = mode;
            if (mo7754d() != null && this.f6805i != null) {
                C0588a.m2773p(mo7754d(), this.f6805i);
            }
        }
    }
}
