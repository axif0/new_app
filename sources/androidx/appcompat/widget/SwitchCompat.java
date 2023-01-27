package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.widget.C0608i;
import p086f.p087a.C3123a;
import p086f.p087a.C3132j;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p087a.p093n.C3153a;
import p086f.p111h.p122m.C3403t;

public class SwitchCompat extends CompoundButton {

    /* renamed from: S */
    private static final Property<SwitchCompat, Float> f1500S = new C0391a(Float.class, "thumbPos");

    /* renamed from: T */
    private static final int[] f1501T = {16842912};

    /* renamed from: A */
    private VelocityTracker f1502A;

    /* renamed from: B */
    private int f1503B;

    /* renamed from: C */
    float f1504C;

    /* renamed from: D */
    private int f1505D;

    /* renamed from: E */
    private int f1506E;

    /* renamed from: F */
    private int f1507F;

    /* renamed from: G */
    private int f1508G;

    /* renamed from: H */
    private int f1509H;

    /* renamed from: I */
    private int f1510I;

    /* renamed from: J */
    private int f1511J;

    /* renamed from: K */
    private final TextPaint f1512K;

    /* renamed from: L */
    private ColorStateList f1513L;

    /* renamed from: M */
    private Layout f1514M;

    /* renamed from: N */
    private Layout f1515N;

    /* renamed from: O */
    private TransformationMethod f1516O;

    /* renamed from: P */
    ObjectAnimator f1517P;

    /* renamed from: Q */
    private final C0497x f1518Q;

    /* renamed from: R */
    private final Rect f1519R;

    /* renamed from: f */
    private Drawable f1520f;

    /* renamed from: g */
    private ColorStateList f1521g;

    /* renamed from: h */
    private PorterDuff.Mode f1522h;

    /* renamed from: i */
    private boolean f1523i;

    /* renamed from: j */
    private boolean f1524j;

    /* renamed from: k */
    private Drawable f1525k;

    /* renamed from: l */
    private ColorStateList f1526l;

    /* renamed from: m */
    private PorterDuff.Mode f1527m;

    /* renamed from: n */
    private boolean f1528n;

    /* renamed from: o */
    private boolean f1529o;

    /* renamed from: p */
    private int f1530p;

    /* renamed from: q */
    private int f1531q;

    /* renamed from: r */
    private int f1532r;

    /* renamed from: s */
    private boolean f1533s;

    /* renamed from: t */
    private CharSequence f1534t;

    /* renamed from: u */
    private CharSequence f1535u;

    /* renamed from: v */
    private boolean f1536v;

    /* renamed from: w */
    private int f1537w;

    /* renamed from: x */
    private int f1538x;

    /* renamed from: y */
    private float f1539y;

    /* renamed from: z */
    private float f1540z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C0391a extends Property<SwitchCompat, Float> {
        C0391a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1504C);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1521g = null;
        this.f1522h = null;
        this.f1523i = false;
        this.f1524j = false;
        this.f1526l = null;
        this.f1527m = null;
        this.f1528n = false;
        this.f1529o = false;
        this.f1502A = VelocityTracker.obtain();
        this.f1519R = new Rect();
        C0469p0.m2126a(this, getContext());
        this.f1512K = new TextPaint(1);
        Resources resources = getResources();
        this.f1512K.density = resources.getDisplayMetrics().density;
        C0479u0 v = C0479u0.m2148v(context, attributeSet, C3132j.SwitchCompat, i, 0);
        C3403t.m14639g0(this, context, C3132j.SwitchCompat, attributeSet, v.mo2360r(), i, 0);
        Drawable g = v.mo2349g(C3132j.SwitchCompat_android_thumb);
        this.f1520f = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.mo2349g(C3132j.SwitchCompat_track);
        this.f1525k = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        this.f1534t = v.mo2358p(C3132j.SwitchCompat_android_textOn);
        this.f1535u = v.mo2358p(C3132j.SwitchCompat_android_textOff);
        this.f1536v = v.mo2343a(C3132j.SwitchCompat_showText, true);
        this.f1530p = v.mo2348f(C3132j.SwitchCompat_thumbTextPadding, 0);
        this.f1531q = v.mo2348f(C3132j.SwitchCompat_switchMinWidth, 0);
        this.f1532r = v.mo2348f(C3132j.SwitchCompat_switchPadding, 0);
        this.f1533s = v.mo2343a(C3132j.SwitchCompat_splitTrack, false);
        ColorStateList c = v.mo2345c(C3132j.SwitchCompat_thumbTint);
        if (c != null) {
            this.f1521g = c;
            this.f1523i = true;
        }
        PorterDuff.Mode e = C0418c0.m1905e(v.mo2353k(C3132j.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1522h != e) {
            this.f1522h = e;
            this.f1524j = true;
        }
        if (this.f1523i || this.f1524j) {
            m1737b();
        }
        ColorStateList c2 = v.mo2345c(C3132j.SwitchCompat_trackTint);
        if (c2 != null) {
            this.f1526l = c2;
            this.f1528n = true;
        }
        PorterDuff.Mode e2 = C0418c0.m1905e(v.mo2353k(C3132j.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1527m != e2) {
            this.f1527m = e2;
            this.f1529o = true;
        }
        if (this.f1528n || this.f1529o) {
            m1738c();
        }
        int n = v.mo2356n(C3132j.SwitchCompat_switchTextAppearance, 0);
        if (n != 0) {
            mo1787i(context, n);
        }
        C0497x xVar = new C0497x(this);
        this.f1518Q = xVar;
        xVar.mo2445m(attributeSet, i);
        v.mo2362w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1538x = viewConfiguration.getScaledTouchSlop();
        this.f1503B = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private void m1736a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1500S, new float[]{z ? 1.0f : 0.0f});
        this.f1517P = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1517P.setAutoCancel(true);
        }
        this.f1517P.start();
    }

    /* renamed from: b */
    private void m1737b() {
        if (this.f1520f == null) {
            return;
        }
        if (this.f1523i || this.f1524j) {
            Drawable mutate = C0588a.m2775r(this.f1520f).mutate();
            this.f1520f = mutate;
            if (this.f1523i) {
                C0588a.m2772o(mutate, this.f1521g);
            }
            if (this.f1524j) {
                C0588a.m2773p(this.f1520f, this.f1522h);
            }
            if (this.f1520f.isStateful()) {
                this.f1520f.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m1738c() {
        if (this.f1525k == null) {
            return;
        }
        if (this.f1528n || this.f1529o) {
            Drawable mutate = C0588a.m2775r(this.f1525k).mutate();
            this.f1525k = mutate;
            if (this.f1528n) {
                C0588a.m2772o(mutate, this.f1526l);
            }
            if (this.f1529o) {
                C0588a.m2773p(this.f1525k, this.f1527m);
            }
            if (this.f1525k.isStateful()) {
                this.f1525k.setState(getDrawableState());
            }
        }
    }

    /* renamed from: d */
    private void m1739d() {
        ObjectAnimator objectAnimator = this.f1517P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m1740e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m1741f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: g */
    private boolean m1742g(float f, float f2) {
        if (this.f1520f == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1520f.getPadding(this.f1519R);
        int i = this.f1509H;
        int i2 = this.f1538x;
        int i3 = i - i2;
        int i4 = (this.f1508G + thumbOffset) - i2;
        Rect rect = this.f1519R;
        return f > ((float) i4) && f < ((float) ((((this.f1507F + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f1511J + i2));
    }

    private boolean getTargetCheckedState() {
        return this.f1504C > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0404a1.m1828b(this) ? 1.0f - this.f1504C : this.f1504C) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1525k;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1519R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1520f;
        Rect d = drawable2 != null ? C0418c0.m1904d(drawable2) : C0418c0.f1640c;
        return ((((this.f1505D - this.f1507F) - rect.left) - rect.right) - d.left) - d.right;
    }

    /* renamed from: h */
    private Layout m1743h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1516O;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1512K;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: k */
    private void m1744k(int i, int i2) {
        mo1788j(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: l */
    private void m1745l(MotionEvent motionEvent) {
        this.f1537w = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1502A.computeCurrentVelocity(1000);
            float xVelocity = this.f1502A.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1503B)) {
                z = getTargetCheckedState();
            } else if (!C0404a1.m1828b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m1740e(motionEvent);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1519R;
        int i3 = this.f1508G;
        int i4 = this.f1509H;
        int i5 = this.f1510I;
        int i6 = this.f1511J;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1520f;
        Rect d = drawable != null ? C0418c0.m1904d(drawable) : C0418c0.f1640c;
        Drawable drawable2 = this.f1525k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1525k.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1525k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1520f;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1507F + rect.right;
            this.f1520f.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0588a.m2769l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1520f;
        if (drawable != null) {
            C0588a.m2768k(drawable, f, f2);
        }
        Drawable drawable2 = this.f1525k;
        if (drawable2 != null) {
            C0588a.m2768k(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1520f;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1525k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0404a1.m1828b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1505D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1532r : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0404a1.m1828b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1505D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1532r : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1536v;
    }

    public boolean getSplitTrack() {
        return this.f1533s;
    }

    public int getSwitchMinWidth() {
        return this.f1531q;
    }

    public int getSwitchPadding() {
        return this.f1532r;
    }

    public CharSequence getTextOff() {
        return this.f1535u;
    }

    public CharSequence getTextOn() {
        return this.f1534t;
    }

    public Drawable getThumbDrawable() {
        return this.f1520f;
    }

    public int getThumbTextPadding() {
        return this.f1530p;
    }

    public ColorStateList getThumbTintList() {
        return this.f1521g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1522h;
    }

    public Drawable getTrackDrawable() {
        return this.f1525k;
    }

    public ColorStateList getTrackTintList() {
        return this.f1526l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1527m;
    }

    /* renamed from: i */
    public void mo1787i(Context context, int i) {
        C0479u0 t = C0479u0.m2146t(context, i, C3132j.TextAppearance);
        ColorStateList c = t.mo2345c(C3132j.TextAppearance_android_textColor);
        if (c == null) {
            c = getTextColors();
        }
        this.f1513L = c;
        int f = t.mo2348f(C3132j.TextAppearance_android_textSize, 0);
        if (f != 0) {
            float f2 = (float) f;
            if (f2 != this.f1512K.getTextSize()) {
                this.f1512K.setTextSize(f2);
                requestLayout();
            }
        }
        m1744k(t.mo2353k(C3132j.TextAppearance_android_typeface, -1), t.mo2353k(C3132j.TextAppearance_android_textStyle, -1));
        this.f1516O = t.mo2343a(C3132j.TextAppearance_textAllCaps, false) ? new C3153a(getContext()) : null;
        t.mo2362w();
    }

    /* renamed from: j */
    public void mo1788j(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f1512K;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1512K;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1512K.setFakeBoldText(false);
        this.f1512K.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1520f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1525k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1517P;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1517P.end();
            this.f1517P = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1501T);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1519R;
        Drawable drawable = this.f1525k;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1509H;
        int i3 = this.f1511J;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1520f;
        if (drawable != null) {
            if (!this.f1533s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0418c0.m1904d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1514M : this.f1515N;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1513L;
            if (colorStateList != null) {
                this.f1512K.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1512K.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1534t : this.f1535u;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1520f != null) {
            Rect rect = this.f1519R;
            Drawable drawable = this.f1525k;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0418c0.m1904d(this.f1520f);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0404a1.m1828b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1505D + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1505D) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f1506E;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1506E;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1506E;
            this.f1508G = i7;
            this.f1509H = i9;
            this.f1511J = i8;
            this.f1510I = i6;
        }
        i8 = i10 + i9;
        this.f1508G = i7;
        this.f1509H = i9;
        this.f1511J = i8;
        this.f1510I = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1536v) {
            if (this.f1514M == null) {
                this.f1514M = m1743h(this.f1534t);
            }
            if (this.f1515N == null) {
                this.f1515N = m1743h(this.f1535u);
            }
        }
        Rect rect = this.f1519R;
        Drawable drawable = this.f1520f;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1520f.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1520f.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1507F = Math.max(this.f1536v ? Math.max(this.f1514M.getWidth(), this.f1515N.getWidth()) + (this.f1530p * 2) : 0, i4);
        Drawable drawable2 = this.f1525k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1525k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1520f;
        if (drawable3 != null) {
            Rect d = C0418c0.m1904d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f1531q, (this.f1507F * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f1505D = max;
        this.f1506E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1534t : this.f1535u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1502A
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f1537w
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1539y
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.C0404a1.m1828b(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f1504C
            float r0 = r0 + r2
            float r0 = m1741f(r0, r4, r3)
            float r2 = r6.f1504C
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.f1539y = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1539y
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1538x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f1540z
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1538x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f1537w = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1539y = r0
            r6.f1540z = r3
            return r1
        L_0x008b:
            int r0 = r6.f1537w
            if (r0 != r2) goto L_0x0096
            r6.m1745l(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f1537w = r0
            android.view.VelocityTracker r0 = r6.f1502A
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.m1742g(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.f1537w = r1
            r6.f1539y = r0
            r6.f1540z = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C3403t.m14614O(this)) {
            m1739d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m1736a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0608i.m2905s(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1536v != z) {
            this.f1536v = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1533s = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1531q = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1532r = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1512K.getTypeface() != null && !this.f1512K.getTypeface().equals(typeface)) || (this.f1512K.getTypeface() == null && typeface != null)) {
            this.f1512K.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1535u = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1534t = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1520f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1520f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f1504C = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C3133a.m13388d(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1530p = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1521g = colorStateList;
        this.f1523i = true;
        m1737b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1522h = mode;
        this.f1524j = true;
        m1737b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1525k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1525k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C3133a.m13388d(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1526l = colorStateList;
        this.f1528n = true;
        m1738c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1527m = mode;
        this.f1529o = true;
        m1738c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1520f || drawable == this.f1525k;
    }
}
