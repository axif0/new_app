package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.C2205o;
import com.google.android.material.theme.p040a.C2306a;
import p086f.p087a.p088k.p089a.C3133a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4976h;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p254b0.C4994n;

public class MaterialCardView extends CardView implements Checkable, C4994n {

    /* renamed from: t */
    private static final int[] f6815t = {16842911};

    /* renamed from: u */
    private static final int[] f6816u = {16842912};

    /* renamed from: v */
    private static final int[] f6817v = {C4965b.state_dragged};

    /* renamed from: w */
    private static final int f6818w = C5005k.Widget_MaterialComponents_CardView;

    /* renamed from: o */
    private final C2083a f6819o;

    /* renamed from: p */
    private boolean f6820p;

    /* renamed from: q */
    private boolean f6821q;

    /* renamed from: r */
    private boolean f6822r;

    /* renamed from: s */
    private C2082a f6823s;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C2082a {
        /* renamed from: a */
        void mo7812a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f6818w), attributeSet, i);
        this.f6821q = false;
        this.f6822r = false;
        this.f6820p = true;
        TypedArray h = C2205o.m10305h(getContext(), attributeSet, C5006l.MaterialCardView, i, f6818w, new int[0]);
        C2083a aVar = new C2083a(this, attributeSet, i, f6818w);
        this.f6819o = aVar;
        aVar.mo7818F(super.getCardBackgroundColor());
        this.f6819o.mo7829Q(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        this.f6819o.mo7815C(h);
        h.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f6819o.mo7836k().getBounds());
        return rectF;
    }

    /* renamed from: h */
    private void m9551h() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f6819o.mo7835j();
        }
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f6819o.mo7837l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f6819o.mo7838m();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f6819o.mo7839n();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f6819o.mo7840o();
    }

    public int getContentPaddingBottom() {
        return this.f6819o.mo7848y().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f6819o.mo7848y().left;
    }

    public int getContentPaddingRight() {
        return this.f6819o.mo7848y().right;
    }

    public int getContentPaddingTop() {
        return this.f6819o.mo7848y().top;
    }

    public float getProgress() {
        return this.f6819o.mo7842s();
    }

    public float getRadius() {
        return this.f6819o.mo7841q();
    }

    public ColorStateList getRippleColor() {
        return this.f6819o.mo7843t();
    }

    public C4979k getShapeAppearanceModel() {
        return this.f6819o.mo7844u();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f6819o.mo7845v();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f6819o.mo7846w();
    }

    public int getStrokeWidth() {
        return this.f6819o.mo7847x();
    }

    /* renamed from: i */
    public boolean mo7785i() {
        C2083a aVar = this.f6819o;
        return aVar != null && aVar.mo7814B();
    }

    public boolean isChecked() {
        return this.f6821q;
    }

    /* renamed from: j */
    public boolean mo7787j() {
        return this.f6822r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7788k(int i, int i2, int i3, int i4) {
        super.mo2489f(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4976h.m21069f(this, this.f6819o.mo7836k());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo7785i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f6815t);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f6816u);
        }
        if (mo7787j()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f6817v);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo7785i());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f6819o.mo7816D(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f6820p) {
            if (!this.f6819o.mo7813A()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f6819o.mo7817E(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.f6819o.mo7818F(ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f6819o.mo7818F(colorStateList);
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f6819o.mo7832V();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f6819o.mo7819G(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f6819o.mo7820H(z);
    }

    public void setChecked(boolean z) {
        if (this.f6821q != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f6819o.mo7821I(drawable);
    }

    public void setCheckedIconResource(int i) {
        this.f6819o.mo7821I(C3133a.m13388d(getContext(), i));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f6819o.mo7822J(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C2083a aVar = this.f6819o;
        if (aVar != null) {
            aVar.mo7830T();
        }
    }

    public void setDragged(boolean z) {
        if (this.f6822r != z) {
            this.f6822r = z;
            refreshDrawableState();
            m9551h();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f6819o.mo7833X();
    }

    public void setOnCheckedChangeListener(C2082a aVar) {
        this.f6823s = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f6819o.mo7833X();
        this.f6819o.mo7831U();
    }

    public void setProgress(float f) {
        this.f6819o.mo7824L(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f6819o.mo7823K(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f6819o.mo7825M(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f6819o.mo7825M(C3133a.m13387c(getContext(), i));
    }

    public void setShapeAppearanceModel(C4979k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.mo14971u(getBoundsAsRectF()));
        }
        this.f6819o.mo7826N(kVar);
    }

    public void setStrokeColor(int i) {
        this.f6819o.mo7827O(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f6819o.mo7827O(colorStateList);
    }

    public void setStrokeWidth(int i) {
        this.f6819o.mo7828P(i);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f6819o.mo7833X();
        this.f6819o.mo7831U();
    }

    public void toggle() {
        if (mo7785i() && isEnabled()) {
            this.f6821q = !this.f6821q;
            refreshDrawableState();
            m9551h();
            C2082a aVar = this.f6823s;
            if (aVar != null) {
                aVar.mo7812a(this, this.f6821q);
            }
        }
    }
}
