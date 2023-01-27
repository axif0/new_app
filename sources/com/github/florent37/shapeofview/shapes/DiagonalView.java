package com.github.florent37.shapeofview.shapes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import p148g.p179c.p180a.p181a.C3706a;
import p148g.p179c.p180a.p181a.C3707b;
import p148g.p179c.p180a.p181a.p182c.C3710b;

public class DiagonalView extends C3707b {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f4837n = 2;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f4838o = 0.0f;

    /* renamed from: com.github.florent37.shapeofview.shapes.DiagonalView$a */
    class C1424a implements C3710b.C3711a {
        C1424a() {
        }

        /* renamed from: a */
        public boolean mo5940a() {
            return false;
        }

        /* renamed from: b */
        public Path mo5941b(int i, int i2) {
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            int i4;
            Path path = new Path();
            float abs = Math.abs(DiagonalView.this.f4838o);
            boolean z = DiagonalView.this.getDiagonalDirection() == 1;
            double d = (double) i;
            double tan = Math.tan(Math.toRadians((double) abs));
            Double.isNaN(d);
            float f5 = (float) (d * tan);
            int i5 = DiagonalView.this.f4837n;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            if (z) {
                                path.moveTo((float) DiagonalView.this.getPaddingLeft(), (float) DiagonalView.this.getPaddingTop());
                                path.lineTo((float) (i - DiagonalView.this.getPaddingRight()), (float) DiagonalView.this.getPaddingTop());
                                f4 = ((float) (i - DiagonalView.this.getPaddingRight())) - f5;
                                i4 = i2 - DiagonalView.this.getPaddingBottom();
                            } else {
                                path.moveTo((float) DiagonalView.this.getPaddingLeft(), (float) DiagonalView.this.getPaddingTop());
                                path.lineTo(((float) (i - DiagonalView.this.getPaddingRight())) - f5, (float) DiagonalView.this.getPaddingTop());
                            }
                        }
                        return path;
                    } else if (z) {
                        path.moveTo(((float) DiagonalView.this.getPaddingLeft()) + f5, (float) DiagonalView.this.getPaddingTop());
                        path.lineTo((float) (i - DiagonalView.this.getPaddingRight()), (float) DiagonalView.this.getPaddingTop());
                    } else {
                        path.moveTo((float) DiagonalView.this.getPaddingLeft(), (float) DiagonalView.this.getPaddingTop());
                        path.lineTo((float) (i - DiagonalView.this.getPaddingRight()), (float) DiagonalView.this.getPaddingTop());
                        path.lineTo((float) (i - DiagonalView.this.getPaddingRight()), (float) (i2 - DiagonalView.this.getPaddingBottom()));
                        f = ((float) DiagonalView.this.getPaddingLeft()) + f5;
                        i3 = i2 - DiagonalView.this.getPaddingBottom();
                        path.lineTo(f, (float) i3);
                        path.close();
                        return path;
                    }
                    f4 = (float) (i - DiagonalView.this.getPaddingRight());
                    i4 = i2 - DiagonalView.this.getPaddingBottom();
                } else if (z) {
                    path.moveTo((float) (i - DiagonalView.this.getPaddingRight()), (float) (i2 - DiagonalView.this.getPaddingBottom()));
                    path.lineTo((float) (i - DiagonalView.this.getPaddingRight()), ((float) DiagonalView.this.getPaddingTop()) + f5);
                    f4 = (float) DiagonalView.this.getPaddingLeft();
                    i4 = DiagonalView.this.getPaddingTop();
                } else {
                    path.moveTo((float) (i - DiagonalView.this.getPaddingRight()), (float) (i2 - DiagonalView.this.getPaddingBottom()));
                    path.lineTo((float) (i - DiagonalView.this.getPaddingRight()), (float) DiagonalView.this.getPaddingTop());
                    f2 = (float) DiagonalView.this.getPaddingLeft();
                    f3 = ((float) DiagonalView.this.getPaddingTop()) + f5;
                }
                path.lineTo(f4, (float) i4);
                f = (float) DiagonalView.this.getPaddingLeft();
                i3 = i2 - DiagonalView.this.getPaddingBottom();
                path.lineTo(f, (float) i3);
                path.close();
                return path;
            } else if (z) {
                path.moveTo((float) DiagonalView.this.getPaddingLeft(), (float) DiagonalView.this.getPaddingRight());
                path.lineTo((float) (i - DiagonalView.this.getPaddingRight()), (float) DiagonalView.this.getPaddingTop());
                f2 = (float) (i - DiagonalView.this.getPaddingRight());
                f3 = (((float) i2) - f5) - ((float) DiagonalView.this.getPaddingBottom());
            } else {
                path.moveTo((float) (i - DiagonalView.this.getPaddingRight()), (float) (i2 - DiagonalView.this.getPaddingBottom()));
                path.lineTo((float) DiagonalView.this.getPaddingLeft(), (((float) i2) - f5) - ((float) DiagonalView.this.getPaddingBottom()));
                path.lineTo((float) DiagonalView.this.getPaddingLeft(), (float) DiagonalView.this.getPaddingTop());
                f = (float) (i - DiagonalView.this.getPaddingRight());
                i3 = DiagonalView.this.getPaddingTop();
                path.lineTo(f, (float) i3);
                path.close();
                return path;
            }
            path.lineTo(f2, f3);
            f = (float) DiagonalView.this.getPaddingLeft();
            i3 = i2 - DiagonalView.this.getPaddingBottom();
            path.lineTo(f, (float) i3);
            path.close();
            return path;
        }
    }

    public DiagonalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7049d(context, attributeSet);
    }

    /* renamed from: d */
    private void m7049d(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3706a.DiagonalView);
            this.f4838o = obtainStyledAttributes.getFloat(C3706a.DiagonalView_shape_diagonal_angle, this.f4838o);
            this.f4837n = obtainStyledAttributes.getInteger(C3706a.DiagonalView_shape_diagonal_position, this.f4837n);
            obtainStyledAttributes.recycle();
        }
        super.setClipPathCreator(new C1424a());
    }

    public float getDiagonalAngle() {
        return this.f4838o;
    }

    public int getDiagonalDirection() {
        return this.f4838o > 0.0f ? 1 : 2;
    }

    public int getDiagonalPosition() {
        return this.f4837n;
    }

    public void setDiagonalAngle(float f) {
        this.f4838o = f;
        mo12227g();
    }

    public void setDiagonalPosition(int i) {
        this.f4837n = i;
        mo12227g();
    }
}
