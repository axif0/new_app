package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p086f.p111h.p122m.C3390g;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5006l;

/* renamed from: com.google.android.material.internal.d */
public class C2175d extends ViewGroup {

    /* renamed from: f */
    private int f7236f;

    /* renamed from: g */
    private int f7237g;

    /* renamed from: h */
    private boolean f7238h;

    /* renamed from: i */
    private int f7239i;

    public C2175d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2175d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7238h = false;
        m10201d(context, attributeSet);
    }

    /* renamed from: a */
    private static int m10200a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: d */
    private void m10201d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C5006l.FlowLayout, 0, 0);
        this.f7236f = obtainStyledAttributes.getDimensionPixelSize(C5006l.FlowLayout_lineSpacing, 0);
        this.f7237g = obtainStyledAttributes.getDimensionPixelSize(C5006l.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int mo8520b(View view) {
        Object tag = view.getTag(C5000f.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo8003c() {
        return this.f7238h;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f7237g;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f7236f;
    }

    /* access modifiers changed from: protected */
    public int getRowCount() {
        return this.f7239i;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f7239i = 0;
            return;
        }
        this.f7239i = 1;
        boolean z2 = C3403t.m14674y(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C5000f.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = C3390g.m14555b(marginLayoutParams);
                    i6 = C3390g.m14554a(marginLayoutParams);
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                if (!this.f7238h && measuredWidth > i7) {
                    i9 = this.f7236f + paddingTop;
                    this.f7239i++;
                    i8 = paddingRight;
                }
                childAt.setTag(C5000f.row_index_key, Integer.valueOf(this.f7239i - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i5;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f7237g;
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo8003c()) {
                    i5 = i12;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f7236f + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f7237g;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m10200a(size, mode, i8 + getPaddingRight()), m10200a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f7237g = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f7236f = i;
    }

    public void setSingleLine(boolean z) {
        this.f7238h = z;
    }
}
