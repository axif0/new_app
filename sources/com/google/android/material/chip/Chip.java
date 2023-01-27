package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.C2093a;
import com.google.android.material.internal.C2205o;
import com.google.android.material.internal.C2206p;
import com.google.android.material.theme.p040a.C2306a;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p126j.p128b.C3433a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5004j;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4976h;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p254b0.C4994n;
import p148g.p189d.p190a.p252d.p256m.C5014h;
import p148g.p189d.p190a.p252d.p269y.C5046c;
import p148g.p189d.p190a.p252d.p269y.C5047d;
import p148g.p189d.p190a.p252d.p269y.C5051f;
import p148g.p189d.p190a.p252d.p270z.C5055b;

public class Chip extends AppCompatCheckBox implements C2093a.C2094a, C4994n {

    /* renamed from: A */
    private static final int[] f6845A = {16842913};

    /* renamed from: B */
    private static final int[] f6846B = {16842911};

    /* renamed from: y */
    private static final int f6847y = C5005k.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final Rect f6848z = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2093a f6849i;

    /* renamed from: j */
    private InsetDrawable f6850j;

    /* renamed from: k */
    private RippleDrawable f6851k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public View.OnClickListener f6852l;

    /* renamed from: m */
    private CompoundButton.OnCheckedChangeListener f6853m;

    /* renamed from: n */
    private boolean f6854n;

    /* renamed from: o */
    private boolean f6855o;

    /* renamed from: p */
    private boolean f6856p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f6857q;

    /* renamed from: r */
    private boolean f6858r;

    /* renamed from: s */
    private int f6859s;

    /* renamed from: t */
    private int f6860t;

    /* renamed from: u */
    private final C2087c f6861u;

    /* renamed from: v */
    private final Rect f6862v;

    /* renamed from: w */
    private final RectF f6863w;

    /* renamed from: x */
    private final C5051f f6864x;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C2085a extends C5051f {
        C2085a() {
        }

        /* renamed from: a */
        public void mo7993a(int i) {
        }

        /* renamed from: b */
        public void mo7994b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f6849i.mo8065K2() ? Chip.this.f6849i.mo8109g1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C2086b extends ViewOutlineProvider {
        C2086b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f6849i != null) {
                Chip.this.f6849i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C2087c extends C3433a {
        C2087c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public int mo7996B(float f, float f2) {
            return (!Chip.this.m9622n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo7997C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m9622n() && Chip.this.mo7896s() && Chip.this.f6852l != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public boolean mo7998J(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo7991t();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M */
        public void mo7999M(C3369c cVar) {
            cVar.mo11617Z(Chip.this.mo7895r());
            cVar.mo11623c0(Chip.this.isClickable());
            cVar.mo11621b0((Chip.this.mo7895r() || Chip.this.isClickable()) ? Chip.this.mo7895r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo11595A0(text);
            } else {
                cVar.mo11629f0(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: N */
        public void mo8000N(int i, C3369c cVar) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C5004j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                cVar.mo11629f0(closeIconContentDescription);
                cVar.mo11615X(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo11620b(C3369c.C3370a.f10673g);
                cVar.mo11631h0(Chip.this.isEnabled());
                return;
            }
            cVar.mo11629f0(charSequence);
            cVar.mo11615X(Chip.f6848z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo8001O(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f6857q = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f6847y), attributeSet, i);
        this.f6862v = new Rect();
        this.f6863w = new RectF();
        this.f6864x = new C2085a();
        Context context2 = getContext();
        m9610C(attributeSet);
        C2093a w0 = C2093a.m9689w0(context2, attributeSet, i, f6847y);
        m9623o(context2, attributeSet, i);
        setChipDrawable(w0);
        w0.mo14925W(C3403t.m14664t(this));
        TypedArray h = C2205o.m10305h(context2, attributeSet, C5006l.Chip, i, f6847y, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C5046c.m21335a(context2, h, C5006l.Chip_android_textColor));
        }
        boolean hasValue = h.hasValue(C5006l.Chip_shapeAppearance);
        h.recycle();
        this.f6861u = new C2087c(this);
        m9628x();
        if (!hasValue) {
            m9624p();
        }
        setChecked(this.f6854n);
        setText(w0.mo8109g1());
        setEllipsize(w0.mo8097a1());
        m9609B();
        if (!this.f6849i.mo8065K2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m9608A();
        if (mo7992v()) {
            setMinHeight(this.f6860t);
        }
        this.f6859s = C3403t.m14674y(this);
    }

    /* renamed from: A */
    private void m9608A() {
        C2093a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f6849i) != null) {
            int K0 = (int) (aVar.mo8063K0() + this.f6849i.mo8119i1() + this.f6849i.mo8140r0());
            int P0 = (int) (this.f6849i.mo8074P0() + this.f6849i.mo8123j1() + this.f6849i.mo8129n0());
            if (this.f6850j != null) {
                Rect rect = new Rect();
                this.f6850j.getPadding(rect);
                P0 += rect.left;
                K0 += rect.right;
            }
            C3403t.m14669v0(this, P0, getPaddingTop(), K0, getPaddingBottom());
        }
    }

    /* renamed from: B */
    private void m9609B() {
        TextPaint paint = getPaint();
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C5047d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo15131i(getContext(), paint, this.f6864x);
        }
    }

    /* renamed from: C */
    private void m9610C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f6863w.setEmpty();
        if (m9622n()) {
            this.f6849i.mo8094Z0(this.f6863w);
        }
        return this.f6863w;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f6862v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f6862v;
    }

    private C5047d getTextAppearance() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8117h1();
        }
        return null;
    }

    /* renamed from: i */
    private void m9618i(C2093a aVar) {
        aVar.mo8133o2(this);
    }

    /* renamed from: j */
    private int[] m9619j() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f6857q) {
            i2++;
        }
        if (this.f6856p) {
            i2++;
        }
        if (this.f6855o) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f6857q) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f6856p) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f6855o) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m9620l() {
        if (getBackgroundDrawable() == this.f6850j && this.f6849i.getCallback() == null) {
            this.f6849i.setCallback(this.f6850j);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: m */
    private boolean m9621m(MotionEvent motionEvent) {
        Class<C3433a> cls = C3433a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f6861u)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("V", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f6861u, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m9622n() {
        C2093a aVar = this.f6849i;
        return (aVar == null || aVar.mo8080S0() == null) ? false : true;
    }

    /* renamed from: o */
    private void m9623o(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = C2205o.m10305h(context, attributeSet, C5006l.Chip, i, f6847y, new int[0]);
        this.f6858r = h.getBoolean(C5006l.Chip_ensureMinTouchTargetSize, false);
        this.f6860t = (int) Math.ceil((double) h.getDimension(C5006l.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) C2206p.m10308b(getContext(), 48))));
        h.recycle();
    }

    /* renamed from: p */
    private void m9624p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C2086b());
        }
    }

    /* renamed from: q */
    private void m9625q(int i, int i2, int i3, int i4) {
        this.f6850j = new InsetDrawable(this.f6849i, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f6856p != z) {
            this.f6856p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f6855o != z) {
            this.f6855o = z;
            refreshDrawableState();
        }
    }

    /* renamed from: u */
    private void m9626u() {
        if (this.f6850j != null) {
            this.f6850j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m9629y();
        }
    }

    /* renamed from: w */
    private void m9627w(C2093a aVar) {
        if (aVar != null) {
            aVar.mo8133o2((C2093a.C2094a) null);
        }
    }

    /* renamed from: x */
    private void m9628x() {
        C3403t.m14643i0(this, (!m9622n() || !mo7896s() || this.f6852l == null) ? null : this.f6861u);
    }

    /* renamed from: y */
    private void m9629y() {
        if (C5055b.f15051a) {
            m9630z();
            return;
        }
        this.f6849i.mo8062J2(true);
        C3403t.m14649l0(this, getBackgroundDrawable());
        m9608A();
        m9620l();
    }

    /* renamed from: z */
    private void m9630z() {
        this.f6851k = new RippleDrawable(C5055b.m21364d(this.f6849i.mo8105e1()), getBackgroundDrawable(), (Drawable) null);
        this.f6849i.mo8062J2(false);
        C3403t.m14649l0(this, this.f6851k);
        m9608A();
    }

    /* renamed from: a */
    public void mo7852a() {
        mo7886k(this.f6860t);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m9621m(motionEvent) || this.f6861u.mo11777v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6861u.mo11778w(keyEvent) || this.f6861u.mo11768A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2093a aVar = this.f6849i;
        if ((aVar == null || !aVar.mo8132o1()) ? false : this.f6849i.mo8125k2(m9619j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6850j;
        return insetDrawable == null ? this.f6849i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8051G0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8054H0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8057I0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo8060J0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6849i;
    }

    public float getChipEndPadding() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8063K0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8066L0();
        }
        return null;
    }

    public float getChipIconSize() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8068M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8070N0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8072O0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8074P0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8076Q0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8078R0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8080S0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8082T0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8084U0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8086V0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8088W0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8092Y0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8097a1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f6861u.mo11768A() == 1 || this.f6861u.mo11779x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C5014h getHideMotionSpec() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8098b1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8100c1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8102d1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8105e1();
        }
        return null;
    }

    public C4979k getShapeAppearanceModel() {
        return this.f6849i.mo14914D();
    }

    public C5014h getShowMotionSpec() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8107f1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8119i1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            return aVar.mo8123j1();
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (getMinWidth() != r6) goto L_0x0083;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7886k(int r6) {
        /*
            r5 = this;
            r5.f6860t = r6
            boolean r0 = r5.mo7992v()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            android.graphics.drawable.InsetDrawable r6 = r5.f6850j
            if (r6 == 0) goto L_0x0011
            r5.m9626u()
            goto L_0x0014
        L_0x0011:
            r5.m9629y()
        L_0x0014:
            return r1
        L_0x0015:
            com.google.android.material.chip.a r0 = r5.f6849i
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r5.f6849i
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x003d
            if (r0 > 0) goto L_0x003d
            android.graphics.drawable.InsetDrawable r6 = r5.f6850j
            if (r6 == 0) goto L_0x0039
            r5.m9626u()
            goto L_0x003c
        L_0x0039:
            r5.m9629y()
        L_0x003c:
            return r1
        L_0x003d:
            if (r2 <= 0) goto L_0x0042
            int r2 = r2 / 2
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r0 <= 0) goto L_0x0047
            int r1 = r0 / 2
        L_0x0047:
            android.graphics.drawable.InsetDrawable r0 = r5.f6850j
            r3 = 1
            if (r0 == 0) goto L_0x006a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.f6850j
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L_0x006a
            int r4 = r0.bottom
            if (r4 != r1) goto L_0x006a
            int r4 = r0.left
            if (r4 != r2) goto L_0x006a
            int r0 = r0.right
            if (r0 != r2) goto L_0x006a
            r5.m9629y()
            return r3
        L_0x006a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r0 < r4) goto L_0x0080
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L_0x0079
            r5.setMinHeight(r6)
        L_0x0079:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L_0x0086
            goto L_0x0083
        L_0x0080:
            r5.setMinHeight(r6)
        L_0x0083:
            r5.setMinWidth(r6)
        L_0x0086:
            r5.m9625q(r2, r1, r2, r1)
            r5.m9629y()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.mo7886k(int):boolean");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4976h.m21069f(this, this.f6849i);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f6845A);
        }
        if (mo7895r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f6846B);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f6861u.mo11770I(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((mo7895r() || isClickable()) ? mo7895r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(mo7895r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C3369c.m14440D0(accessibilityNodeInfo).mo11626e0(C3369c.C3372c.m14527f(chipGroup.mo8520b(this), 1, chipGroup.mo8003c() ? chipGroup.mo8013n(this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f6859s != i) {
            this.f6859s = i;
            m9608A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f6855o
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f6855o
            if (r0 == 0) goto L_0x0034
            r5.mo7991t()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean mo7895r() {
        C2093a aVar = this.f6849i;
        return aVar != null && aVar.mo8130n1();
    }

    /* renamed from: s */
    public boolean mo7896s() {
        C2093a aVar = this.f6849i;
        return aVar != null && aVar.mo8137p1();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6851k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6851k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8153w1(z);
        }
    }

    public void setCheckableResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8155x1(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C2093a aVar = this.f6849i;
        if (aVar == null) {
            this.f6854n = z;
        } else if (aVar.mo8130n1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f6853m) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8157y1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8159z1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8039A1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8041B1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8043C1(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8045D1(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8047E1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8049F1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8052G1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8055H1(i);
        }
    }

    public void setChipDrawable(C2093a aVar) {
        C2093a aVar2 = this.f6849i;
        if (aVar2 != aVar) {
            m9627w(aVar2);
            this.f6849i = aVar;
            aVar.mo8160z2(false);
            m9618i(this.f6849i);
            mo7886k(this.f6860t);
        }
    }

    public void setChipEndPadding(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8058I1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8061J1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8064K1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8067L1(i);
        }
    }

    public void setChipIconSize(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8069M1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8071N1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8073O1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8075P1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8077Q1(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8079R1(z);
        }
    }

    public void setChipMinHeight(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8081S1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8083T1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8085U1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8087V1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8089W1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8091X1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8093Y1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8095Z1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8099b2(drawable);
        }
        m9628x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8101c2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8103d2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8106e2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8108f2(i);
        }
        m9628x();
    }

    public void setCloseIconSize(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8110g2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8118h2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8120i2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8124j2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8127l2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8128m2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8131n2(z);
        }
        m9628x();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo14925W(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6849i != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C2093a aVar = this.f6849i;
                if (aVar != null) {
                    aVar.mo8138p2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f6858r = z;
        mo7886k(this.f6860t);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C5014h hVar) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8139q2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8141r2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8142s2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8147t2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8150u2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8152v2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f6849i != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8154w2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6853m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6852l = onClickListener;
        m9628x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8156x2(colorStateList);
        }
        if (!this.f6849i.mo8126l1()) {
            m9630z();
        }
    }

    public void setRippleColorResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8158y2(i);
            if (!this.f6849i.mo8126l1()) {
                m9630z();
            }
        }
    }

    public void setShapeAppearanceModel(C4979k kVar) {
        this.f6849i.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C5014h hVar) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8040A2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8042B2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f6849i != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            super.setText(this.f6849i.mo8065K2() ? null : charSequence, bufferType);
            C2093a aVar = this.f6849i;
            if (aVar != null) {
                aVar.mo8044C2(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8048E2(i);
        }
        m9609B();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8048E2(i);
        }
        m9609B();
    }

    public void setTextAppearance(C5047d dVar) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8046D2(dVar);
        }
        m9609B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8050F2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8053G2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8056H2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C2093a aVar = this.f6849i;
        if (aVar != null) {
            aVar.mo8059I2(i);
        }
    }

    /* renamed from: t */
    public boolean mo7991t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f6852l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f6861u.mo11775U(1, 1);
        return z;
    }

    /* renamed from: v */
    public boolean mo7992v() {
        return this.f6858r;
    }
}
