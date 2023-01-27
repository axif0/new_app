package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0426f;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.widget.C0608i;
import com.google.android.material.internal.C2205o;
import com.google.android.material.internal.C2206p;
import com.google.android.material.theme.p040a.C2306a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3403t;
import p086f.p126j.p127a.C3430a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4976h;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p254b0.C4994n;
import p148g.p189d.p190a.p252d.p269y.C5046c;

public class MaterialButton extends C0426f implements Checkable, C4994n {

    /* renamed from: t */
    private static final int[] f6780t = {16842911};

    /* renamed from: u */
    private static final int[] f6781u = {16842912};

    /* renamed from: v */
    private static final int f6782v = C5005k.Widget_MaterialComponents_Button;

    /* renamed from: h */
    private final C2081a f6783h;

    /* renamed from: i */
    private final LinkedHashSet<C2077a> f6784i;

    /* renamed from: j */
    private C2078b f6785j;

    /* renamed from: k */
    private PorterDuff.Mode f6786k;

    /* renamed from: l */
    private ColorStateList f6787l;

    /* renamed from: m */
    private Drawable f6788m;

    /* renamed from: n */
    private int f6789n;

    /* renamed from: o */
    private int f6790o;

    /* renamed from: p */
    private int f6791p;

    /* renamed from: q */
    private boolean f6792q;

    /* renamed from: r */
    private boolean f6793r;

    /* renamed from: s */
    private int f6794s;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C2077a {
        /* renamed from: a */
        void mo7743a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C2078b {
        /* renamed from: a */
        void mo7744a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    static class C2079c extends C3430a {
        public static final Parcelable.Creator<C2079c> CREATOR = new C2080a();

        /* renamed from: h */
        boolean f6795h;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        static class C2080a implements Parcelable.ClassLoaderCreator<C2079c> {
            C2080a() {
            }

            /* renamed from: a */
            public C2079c createFromParcel(Parcel parcel) {
                return new C2079c(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C2079c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2079c(parcel, classLoader);
            }

            /* renamed from: c */
            public C2079c[] newArray(int i) {
                return new C2079c[i];
            }
        }

        public C2079c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C2079c.class.getClassLoader();
            }
            m9516b(parcel);
        }

        public C2079c(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m9516b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f6795h = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6795h ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f6782v), attributeSet, i);
        this.f6784i = new LinkedHashSet<>();
        boolean z = false;
        this.f6792q = false;
        this.f6793r = false;
        Context context2 = getContext();
        TypedArray h = C2205o.m10305h(context2, attributeSet, C5006l.MaterialButton, i, f6782v, new int[0]);
        this.f6791p = h.getDimensionPixelSize(C5006l.MaterialButton_iconPadding, 0);
        this.f6786k = C2206p.m10311e(h.getInt(C5006l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f6787l = C5046c.m21335a(getContext(), h, C5006l.MaterialButton_iconTint);
        this.f6788m = C5046c.m21338d(getContext(), h, C5006l.MaterialButton_icon);
        this.f6794s = h.getInteger(C5006l.MaterialButton_iconGravity, 1);
        this.f6789n = h.getDimensionPixelSize(C5006l.MaterialButton_iconSize, 0);
        C2081a aVar = new C2081a(this, C4979k.m21076e(context2, attributeSet, i, f6782v).mo14980m());
        this.f6783h = aVar;
        aVar.mo7763o(h);
        h.recycle();
        setCompoundDrawablePadding(this.f6791p);
        m9511e(this.f6788m != null ? true : z);
    }

    /* renamed from: b */
    private boolean m9508b() {
        return C3403t.m14674y(this) == 1;
    }

    /* renamed from: c */
    private boolean m9509c() {
        C2081a aVar = this.f6783h;
        return aVar != null && !aVar.mo7761m();
    }

    /* renamed from: d */
    private void m9510d(boolean z) {
        if (z) {
            C0608i.m2898l(this, this.f6788m, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            C0608i.m2898l(this, (Drawable) null, (Drawable) null, this.f6788m, (Drawable) null);
        }
    }

    /* renamed from: e */
    private void m9511e(boolean z) {
        Drawable drawable = this.f6788m;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C0588a.m2775r(drawable).mutate();
            this.f6788m = mutate;
            C0588a.m2772o(mutate, this.f6787l);
            PorterDuff.Mode mode = this.f6786k;
            if (mode != null) {
                C0588a.m2773p(this.f6788m, mode);
            }
            int i = this.f6789n;
            if (i == 0) {
                i = this.f6788m.getIntrinsicWidth();
            }
            int i2 = this.f6789n;
            if (i2 == 0) {
                i2 = this.f6788m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6788m;
            int i3 = this.f6790o;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f6794s;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            m9510d(z3);
            return;
        }
        Drawable[] a = C0608i.m2887a(this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[2];
        if ((z3 && drawable3 != this.f6788m) || (!z3 && drawable4 != this.f6788m)) {
            z2 = true;
        }
        if (z2) {
            m9510d(z3);
        }
    }

    /* renamed from: f */
    private void m9512f() {
        if (this.f6788m != null && getLayout() != null) {
            int i = this.f6794s;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f6790o = 0;
                m9511e(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f6789n;
            if (i2 == 0) {
                i2 = this.f6788m.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C3403t.m14602C(this)) - i2) - this.f6791p) - C3403t.m14603D(this)) / 2;
            boolean b = m9508b();
            if (this.f6794s != 4) {
                z = false;
            }
            if (b != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f6790o != measuredWidth) {
                this.f6790o = measuredWidth;
                m9511e(false);
            }
        }
    }

    private String getA11yClassName() {
        return (mo7693a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean mo7693a() {
        C2081a aVar = this.f6783h;
        return aVar != null && aVar.mo7762n();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m9509c()) {
            return this.f6783h.mo7752b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6788m;
    }

    public int getIconGravity() {
        return this.f6794s;
    }

    public int getIconPadding() {
        return this.f6791p;
    }

    public int getIconSize() {
        return this.f6789n;
    }

    public ColorStateList getIconTint() {
        return this.f6787l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6786k;
    }

    public ColorStateList getRippleColor() {
        if (m9509c()) {
            return this.f6783h.mo7755f();
        }
        return null;
    }

    public C4979k getShapeAppearanceModel() {
        if (m9509c()) {
            return this.f6783h.mo7756g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m9509c()) {
            return this.f6783h.mo7757h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m9509c()) {
            return this.f6783h.mo7758i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return m9509c() ? this.f6783h.mo7759j() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m9509c() ? this.f6783h.mo7760k() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f6792q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m9509c()) {
            C4976h.m21069f(this, this.f6783h.mo7754d());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo7693a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f6780t);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f6781u);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo7693a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2081a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f6783h) != null) {
            aVar.mo7751B(i4 - i2, i3 - i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m9512f();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2079c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2079c cVar = (C2079c) parcelable;
        super.onRestoreInstanceState(cVar.mo11760a());
        setChecked(cVar.f6795h);
    }

    public Parcelable onSaveInstanceState() {
        C2079c cVar = new C2079c(super.onSaveInstanceState());
        cVar.f6795h = this.f6792q;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m9512f();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m9509c()) {
            this.f6783h.mo7764p(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (m9509c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f6783h.mo7765q();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C3133a.m13388d(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m9509c()) {
            this.f6783h.mo7766r(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo7693a() && isEnabled() && this.f6792q != z) {
            this.f6792q = z;
            refreshDrawableState();
            if (!this.f6793r) {
                this.f6793r = true;
                Iterator it = this.f6784i.iterator();
                while (it.hasNext()) {
                    ((C2077a) it.next()).mo7743a(this, this.f6792q);
                }
                this.f6793r = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m9509c()) {
            this.f6783h.mo7767s(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m9509c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m9509c()) {
            this.f6783h.mo7754d().mo14925W(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6788m != drawable) {
            this.f6788m = drawable;
            m9511e(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f6794s != i) {
            this.f6794s = i;
            m9512f();
        }
    }

    public void setIconPadding(int i) {
        if (this.f6791p != i) {
            this.f6791p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C3133a.m13388d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f6789n != i) {
            this.f6789n = i;
            m9511e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6787l != colorStateList) {
            this.f6787l = colorStateList;
            m9511e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6786k != mode) {
            this.f6786k = mode;
            m9511e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C3133a.m13387c(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(C2078b bVar) {
        this.f6785j = bVar;
    }

    public void setPressed(boolean z) {
        C2078b bVar = this.f6785j;
        if (bVar != null) {
            bVar.mo7744a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m9509c()) {
            this.f6783h.mo7768t(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m9509c()) {
            setRippleColor(C3133a.m13387c(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C4979k kVar) {
        if (m9509c()) {
            this.f6783h.mo7769u(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m9509c()) {
            this.f6783h.mo7770v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m9509c()) {
            this.f6783h.mo7771w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m9509c()) {
            setStrokeColor(C3133a.m13387c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m9509c()) {
            this.f6783h.mo7772x(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m9509c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m9509c()) {
            this.f6783h.mo7773y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m9509c()) {
            this.f6783h.mo7774z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f6792q);
    }
}
