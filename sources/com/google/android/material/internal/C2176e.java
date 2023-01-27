package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0431g0;
import p148g.p189d.p190a.p252d.C5006l;

/* renamed from: com.google.android.material.internal.e */
public class C2176e extends C0431g0 {

    /* renamed from: u */
    private Drawable f7240u;

    /* renamed from: v */
    private final Rect f7241v;

    /* renamed from: w */
    private final Rect f7242w;

    /* renamed from: x */
    private int f7243x;

    /* renamed from: y */
    protected boolean f7244y;

    /* renamed from: z */
    boolean f7245z;

    public C2176e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2176e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7241v = new Rect();
        this.f7242w = new Rect();
        this.f7243x = 119;
        this.f7244y = true;
        this.f7245z = false;
        TypedArray h = C2205o.m10305h(context, attributeSet, C5006l.ForegroundLinearLayout, i, 0, new int[0]);
        this.f7243x = h.getInt(C5006l.ForegroundLinearLayout_android_foregroundGravity, this.f7243x);
        Drawable drawable = h.getDrawable(C5006l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f7244y = h.getBoolean(C5006l.ForegroundLinearLayout_foregroundInsidePadding, true);
        h.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f7240u;
        if (drawable != null) {
            if (this.f7245z) {
                this.f7245z = false;
                Rect rect = this.f7241v;
                Rect rect2 = this.f7242w;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f7244y) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f7243x, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f7240u;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7240u;
        if (drawable != null && drawable.isStateful()) {
            this.f7240u.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f7240u;
    }

    public int getForegroundGravity() {
        return this.f7243x;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7240u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f7245z = z | this.f7245z;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7245z = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f7240u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f7240u);
            }
            this.f7240u = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f7243x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f7243x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f7243x = i;
            if (i == 119 && this.f7240u != null) {
                this.f7240u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7240u;
    }
}
