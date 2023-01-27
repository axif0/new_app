package com.github.florent37.shapeofview.shapes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import p148g.p179c.p180a.p181a.C3706a;
import p148g.p179c.p180a.p181a.C3707b;
import p148g.p179c.p180a.p181a.p182c.C3710b;

public class CircleView extends C3707b {

    /* renamed from: n */
    private float f4833n = 0.0f;

    /* renamed from: o */
    private int f4834o = -1;

    /* renamed from: p */
    private final Paint f4835p = new Paint(1);

    /* renamed from: com.github.florent37.shapeofview.shapes.CircleView$a */
    class C1423a implements C3710b.C3711a {
        C1423a() {
        }

        /* renamed from: a */
        public boolean mo5940a() {
            return false;
        }

        /* renamed from: b */
        public Path mo5941b(int i, int i2) {
            Path path = new Path();
            float f = ((float) i) / 2.0f;
            float f2 = ((float) i2) / 2.0f;
            path.addCircle(f, f2, Math.min(f, f2), Path.Direction.CW);
            return path;
        }
    }

    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7046d(context, attributeSet);
    }

    /* renamed from: d */
    private void m7046d(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3706a.CircleView);
            this.f4833n = (float) obtainStyledAttributes.getDimensionPixelSize(C3706a.CircleView_shape_circle_borderWidth, (int) this.f4833n);
            this.f4834o = obtainStyledAttributes.getColor(C3706a.CircleView_shape_circle_borderColor, this.f4834o);
            obtainStyledAttributes.recycle();
        }
        this.f4835p.setAntiAlias(true);
        this.f4835p.setStyle(Paint.Style.STROKE);
        super.setClipPathCreator(new C1423a());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.f4833n;
        if (f > 0.0f) {
            this.f4835p.setStrokeWidth(f);
            this.f4835p.setColor(this.f4834o);
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, Math.min((((float) getWidth()) - this.f4833n) / 2.0f, (((float) getHeight()) - this.f4833n) / 2.0f), this.f4835p);
        }
    }

    public int getBorderColor() {
        return this.f4834o;
    }

    public float getBorderWidth() {
        return this.f4833n;
    }

    public float getBorderWidthDp() {
        return mo12226e(getBorderWidth());
    }

    public void setBorderColor(int i) {
        this.f4834o = i;
        mo12227g();
    }

    public void setBorderWidth(float f) {
        this.f4833n = f;
        mo12227g();
    }

    public void setBorderWidthDp(float f) {
        setBorderWidth(mo12225c(f));
    }
}
