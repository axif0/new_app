package com.google.android.exoplayer2.p035ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: f */
    private float f5140f;

    /* renamed from: g */
    private int f5141g = 0;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1541g.AspectRatioFrameLayout, 0, 0);
            try {
                this.f5141g = obtainStyledAttributes.getInt(C1541g.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public int getResizeMode() {
        return this.f5141g;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5141g != 3 && this.f5140f > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            float f3 = (this.f5140f / (f / f2)) - 1.0f;
            if (Math.abs(f3) > 0.01f) {
                int i3 = this.f5141g;
                if (i3 != 1) {
                    if (i3 != 2) {
                        int i4 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                        if (i3 == 4) {
                        }
                    }
                    measuredWidth = (int) (f2 * this.f5140f);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                }
                measuredHeight = (int) (f / this.f5140f);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public void setAspectRatio(float f) {
        if (this.f5140f != f) {
            this.f5140f = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f5141g != i) {
            this.f5141g = i;
            requestLayout();
        }
    }
}
