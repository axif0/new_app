package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0588a;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4969d;
import p148g.p189d.p190a.p252d.p254b0.C4970e;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4978j;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p262r.C5035a;
import p148g.p189d.p190a.p252d.p269y.C5046c;
import p148g.p189d.p190a.p252d.p270z.C5055b;

/* renamed from: com.google.android.material.card.a */
class C2083a {

    /* renamed from: t */
    private static final int[] f6824t = {16842912};

    /* renamed from: u */
    private static final double f6825u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    private final MaterialCardView f6826a;

    /* renamed from: b */
    private final Rect f6827b = new Rect();

    /* renamed from: c */
    private final C4972g f6828c;

    /* renamed from: d */
    private final C4972g f6829d;

    /* renamed from: e */
    private final int f6830e;

    /* renamed from: f */
    private final int f6831f;

    /* renamed from: g */
    private int f6832g;

    /* renamed from: h */
    private Drawable f6833h;

    /* renamed from: i */
    private Drawable f6834i;

    /* renamed from: j */
    private ColorStateList f6835j;

    /* renamed from: k */
    private ColorStateList f6836k;

    /* renamed from: l */
    private C4979k f6837l;

    /* renamed from: m */
    private ColorStateList f6838m;

    /* renamed from: n */
    private Drawable f6839n;

    /* renamed from: o */
    private LayerDrawable f6840o;

    /* renamed from: p */
    private C4972g f6841p;

    /* renamed from: q */
    private C4972g f6842q;

    /* renamed from: r */
    private boolean f6843r = false;

    /* renamed from: s */
    private boolean f6844s;

    /* renamed from: com.google.android.material.card.a$a */
    class C2084a extends InsetDrawable {
        C2084a(C2083a aVar, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C2083a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f6826a = materialCardView;
        C4972g gVar = new C4972g(materialCardView.getContext(), attributeSet, i, i2);
        this.f6828c = gVar;
        gVar.mo14920N(materialCardView.getContext());
        this.f6828c.mo14931c0(-12303292);
        C4979k.C4981b v = this.f6828c.mo14914D().mo14972v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C5006l.CardView, i, C5005k.CardView);
        if (obtainStyledAttributes.hasValue(C5006l.CardView_cardCornerRadius)) {
            v.mo14981o(obtainStyledAttributes.getDimension(C5006l.CardView_cardCornerRadius, 0.0f));
        }
        this.f6829d = new C4972g();
        mo7826N(v.mo14980m());
        Resources resources = materialCardView.getResources();
        this.f6830e = resources.getDimensionPixelSize(C4998d.mtrl_card_checked_icon_margin);
        this.f6831f = resources.getDimensionPixelSize(C4998d.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: R */
    private boolean m9556R() {
        return this.f6826a.getPreventCornerOverlap() && !m9564e();
    }

    /* renamed from: S */
    private boolean m9557S() {
        return this.f6826a.getPreventCornerOverlap() && m9564e() && this.f6826a.getUseCompatPadding();
    }

    /* renamed from: W */
    private void m9558W(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f6826a.getForeground() instanceof InsetDrawable)) {
            this.f6826a.setForeground(m9571z(drawable));
        } else {
            ((InsetDrawable) this.f6826a.getForeground()).setDrawable(drawable);
        }
    }

    /* renamed from: Y */
    private void m9559Y() {
        Drawable drawable;
        if (!C5055b.f15051a || (drawable = this.f6839n) == null) {
            C4972g gVar = this.f6841p;
            if (gVar != null) {
                gVar.mo14926X(this.f6835j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f6835j);
    }

    /* renamed from: a */
    private float m9560a() {
        return Math.max(Math.max(m9561b(this.f6837l.mo14967q(), this.f6828c.mo14916G()), m9561b(this.f6837l.mo14969s(), this.f6828c.mo14917H())), Math.max(m9561b(this.f6837l.mo14962k(), this.f6828c.mo14946t()), m9561b(this.f6837l.mo14960i(), this.f6828c.mo14945s())));
    }

    /* renamed from: b */
    private float m9561b(C4969d dVar, float f) {
        if (dVar instanceof C4978j) {
            double d = (double) f;
            Double.isNaN(d);
            return (float) ((1.0d - f6825u) * d);
        } else if (dVar instanceof C4970e) {
            return f / 2.0f;
        } else {
            return 0.0f;
        }
    }

    /* renamed from: c */
    private float m9562c() {
        return this.f6826a.getMaxCardElevation() + (m9557S() ? m9560a() : 0.0f);
    }

    /* renamed from: d */
    private float m9563d() {
        return (this.f6826a.getMaxCardElevation() * 1.5f) + (m9557S() ? m9560a() : 0.0f);
    }

    /* renamed from: e */
    private boolean m9564e() {
        return Build.VERSION.SDK_INT >= 21 && this.f6828c.mo14922Q();
    }

    /* renamed from: f */
    private Drawable m9565f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f6834i;
        if (drawable != null) {
            stateListDrawable.addState(f6824t, drawable);
        }
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m9566g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C4972g i = m9568i();
        this.f6841p = i;
        i.mo14926X(this.f6835j);
        stateListDrawable.addState(new int[]{16842919}, this.f6841p);
        return stateListDrawable;
    }

    /* renamed from: h */
    private Drawable m9567h() {
        if (!C5055b.f15051a) {
            return m9566g();
        }
        this.f6842q = m9568i();
        return new RippleDrawable(this.f6835j, (Drawable) null, this.f6842q);
    }

    /* renamed from: i */
    private C4972g m9568i() {
        return new C4972g(this.f6837l);
    }

    /* renamed from: p */
    private Drawable m9569p() {
        if (this.f6839n == null) {
            this.f6839n = m9567h();
        }
        if (this.f6840o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f6839n, this.f6829d, m9565f()});
            this.f6840o = layerDrawable;
            layerDrawable.setId(2, C5000f.mtrl_card_checked_layer_id);
        }
        return this.f6840o;
    }

    /* renamed from: r */
    private float m9570r() {
        if (!this.f6826a.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 21 && !this.f6826a.getUseCompatPadding()) {
            return 0.0f;
        }
        double d = 1.0d - f6825u;
        double cardViewRadius = (double) this.f6826a.getCardViewRadius();
        Double.isNaN(cardViewRadius);
        return (float) (d * cardViewRadius);
    }

    /* renamed from: z */
    private Drawable m9571z(Drawable drawable) {
        int i;
        int i2;
        if ((Build.VERSION.SDK_INT < 21) || this.f6826a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) m9563d());
            i2 = (int) Math.ceil((double) m9562c());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new C2084a(this, drawable, i2, i, i2, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo7813A() {
        return this.f6843r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo7814B() {
        return this.f6844s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo7815C(TypedArray typedArray) {
        ColorStateList a = C5046c.m21335a(this.f6826a.getContext(), typedArray, C5006l.MaterialCardView_strokeColor);
        this.f6838m = a;
        if (a == null) {
            this.f6838m = ColorStateList.valueOf(-1);
        }
        this.f6832g = typedArray.getDimensionPixelSize(C5006l.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C5006l.MaterialCardView_android_checkable, false);
        this.f6844s = z;
        this.f6826a.setLongClickable(z);
        this.f6836k = C5046c.m21335a(this.f6826a.getContext(), typedArray, C5006l.MaterialCardView_checkedIconTint);
        mo7821I(C5046c.m21338d(this.f6826a.getContext(), typedArray, C5006l.MaterialCardView_checkedIcon));
        ColorStateList a2 = C5046c.m21335a(this.f6826a.getContext(), typedArray, C5006l.MaterialCardView_rippleColor);
        this.f6835j = a2;
        if (a2 == null) {
            this.f6835j = ColorStateList.valueOf(C5035a.m21305c(this.f6826a, C4965b.colorControlHighlight));
        }
        mo7819G(C5046c.m21335a(this.f6826a.getContext(), typedArray, C5006l.MaterialCardView_cardForegroundColor));
        m9559Y();
        mo7832V();
        mo7834Z();
        this.f6826a.setBackgroundInternal(m9571z(this.f6828c));
        Drawable p = this.f6826a.isClickable() ? m9569p() : this.f6829d;
        this.f6833h = p;
        this.f6826a.setForeground(m9571z(p));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo7816D(int i, int i2) {
        int i3;
        int i4;
        if (this.f6840o != null) {
            int i5 = this.f6830e;
            int i6 = this.f6831f;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            if ((Build.VERSION.SDK_INT < 21) || this.f6826a.getUseCompatPadding()) {
                i8 -= (int) Math.ceil((double) (m9563d() * 2.0f));
                i7 -= (int) Math.ceil((double) (m9562c() * 2.0f));
            }
            int i9 = i8;
            int i10 = this.f6830e;
            if (C3403t.m14674y(this.f6826a) == 1) {
                i3 = i7;
                i4 = i10;
            } else {
                i4 = i7;
                i3 = i10;
            }
            this.f6840o.setLayerInset(2, i4, this.f6830e, i3, i9);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo7817E(boolean z) {
        this.f6843r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo7818F(ColorStateList colorStateList) {
        this.f6828c.mo14926X(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo7819G(ColorStateList colorStateList) {
        C4972g gVar = this.f6829d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.mo14926X(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo7820H(boolean z) {
        this.f6844s = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo7821I(Drawable drawable) {
        this.f6834i = drawable;
        if (drawable != null) {
            Drawable r = C0588a.m2775r(drawable.mutate());
            this.f6834i = r;
            C0588a.m2772o(r, this.f6836k);
        }
        if (this.f6840o != null) {
            this.f6840o.setDrawableByLayerId(C5000f.mtrl_card_checked_layer_id, m9565f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo7822J(ColorStateList colorStateList) {
        this.f6836k = colorStateList;
        Drawable drawable = this.f6834i;
        if (drawable != null) {
            C0588a.m2772o(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo7823K(float f) {
        mo7826N(this.f6837l.mo14973w(f));
        this.f6833h.invalidateSelf();
        if (m9557S() || m9556R()) {
            mo7831U();
        }
        if (m9557S()) {
            mo7833X();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo7824L(float f) {
        this.f6828c.mo14927Y(f);
        C4972g gVar = this.f6829d;
        if (gVar != null) {
            gVar.mo14927Y(f);
        }
        C4972g gVar2 = this.f6842q;
        if (gVar2 != null) {
            gVar2.mo14927Y(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo7825M(ColorStateList colorStateList) {
        this.f6835j = colorStateList;
        m9559Y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo7826N(C4979k kVar) {
        this.f6837l = kVar;
        this.f6828c.setShapeAppearanceModel(kVar);
        C4972g gVar = this.f6828c;
        gVar.mo14930b0(!gVar.mo14922Q());
        C4972g gVar2 = this.f6829d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        C4972g gVar3 = this.f6842q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        C4972g gVar4 = this.f6841p;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo7827O(ColorStateList colorStateList) {
        if (this.f6838m != colorStateList) {
            this.f6838m = colorStateList;
            mo7834Z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo7828P(int i) {
        if (i != this.f6832g) {
            this.f6832g = i;
            mo7834Z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo7829Q(int i, int i2, int i3, int i4) {
        this.f6827b.set(i, i2, i3, i4);
        mo7831U();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo7830T() {
        Drawable drawable = this.f6833h;
        Drawable p = this.f6826a.isClickable() ? m9569p() : this.f6829d;
        this.f6833h = p;
        if (drawable != p) {
            m9558W(p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo7831U() {
        int a = (int) ((m9556R() || m9557S() ? m9560a() : 0.0f) - m9570r());
        MaterialCardView materialCardView = this.f6826a;
        Rect rect = this.f6827b;
        materialCardView.mo7788k(rect.left + a, rect.top + a, rect.right + a, rect.bottom + a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo7832V() {
        this.f6828c.mo14925W(this.f6826a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo7833X() {
        if (!mo7813A()) {
            this.f6826a.setBackgroundInternal(m9571z(this.f6828c));
        }
        this.f6826a.setForeground(m9571z(this.f6833h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo7834Z() {
        this.f6829d.mo14934f0((float) this.f6832g, this.f6838m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo7835j() {
        Drawable drawable = this.f6839n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f6839n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f6839n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C4972g mo7836k() {
        return this.f6828c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo7837l() {
        return this.f6828c.mo14949x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public ColorStateList mo7838m() {
        return this.f6829d.mo14949x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Drawable mo7839n() {
        return this.f6834i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ColorStateList mo7840o() {
        return this.f6836k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo7841q() {
        return this.f6828c.mo14916G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo7842s() {
        return this.f6828c.mo14950y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public ColorStateList mo7843t() {
        return this.f6835j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C4979k mo7844u() {
        return this.f6837l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public int mo7845v() {
        ColorStateList colorStateList = this.f6838m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public ColorStateList mo7846w() {
        return this.f6838m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo7847x() {
        return this.f6832g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public Rect mo7848y() {
        return this.f6827b;
    }
}
