package com.github.florent37.shapeofview.shapes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import p148g.p179c.p180a.p181a.C3706a;
import p148g.p179c.p180a.p181a.C3707b;
import p148g.p179c.p180a.p181a.p182c.C3710b;

public class ArcView extends C3707b {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f4830n = 2;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f4831o = 0.0f;

    /* renamed from: com.github.florent37.shapeofview.shapes.ArcView$a */
    class C1422a implements C3710b.C3711a {
        C1422a() {
        }

        /* renamed from: a */
        public boolean mo5940a() {
            return false;
        }

        /* renamed from: b */
        public Path mo5941b(int i, int i2) {
            float f;
            float f2;
            float f3;
            float f4;
            Path path = new Path();
            boolean z = ArcView.this.getCropDirection() == 1;
            float abs = Math.abs(ArcView.this.f4831o);
            int i3 = ArcView.this.f4830n;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            path.moveTo(0.0f, 0.0f);
                            float f5 = (float) i;
                            if (z) {
                                path.lineTo(f5, 0.0f);
                                f2 = (float) i2;
                                path.quadTo(f5 - (abs * 2.0f), (float) (i2 / 2), f5, f2);
                            } else {
                                float f6 = f5 - abs;
                                path.lineTo(f6, 0.0f);
                                f2 = (float) i2;
                                path.quadTo(f5 + abs, (float) (i2 / 2), f6, f2);
                            }
                            path.lineTo(0.0f, f2);
                        }
                        return path;
                    }
                    f4 = (float) i;
                    path.moveTo(f4, 0.0f);
                    if (z) {
                        path.lineTo(0.0f, 0.0f);
                        f3 = (float) i2;
                        path.quadTo(abs * 2.0f, (float) (i2 / 2), 0.0f, f3);
                    } else {
                        path.lineTo(abs, 0.0f);
                        f3 = (float) i2;
                        path.quadTo(-abs, (float) (i2 / 2), abs, f3);
                    }
                } else if (z) {
                    f3 = (float) i2;
                    path.moveTo(0.0f, f3);
                    path.lineTo(0.0f, 0.0f);
                    f4 = (float) i;
                    path.quadTo((float) (i / 2), abs * 2.0f, f4, 0.0f);
                } else {
                    path.moveTo(0.0f, abs);
                    float f7 = (float) i;
                    path.quadTo((float) (i / 2), -abs, f7, abs);
                    f2 = (float) i2;
                    path.lineTo(f7, f2);
                    path.lineTo(0.0f, f2);
                }
                path.lineTo(f4, f3);
            } else {
                path.moveTo(0.0f, 0.0f);
                float f8 = (float) i2;
                if (z) {
                    path.lineTo(0.0f, f8);
                    f = (float) i;
                    path.quadTo((float) (i / 2), f8 - (abs * 2.0f), f, f8);
                } else {
                    float f9 = f8 - abs;
                    path.lineTo(0.0f, f9);
                    f = (float) i;
                    path.quadTo((float) (i / 2), f8 + abs, f, f9);
                }
                path.lineTo(f, 0.0f);
            }
            path.close();
            return path;
        }
    }

    public ArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7041d(context, attributeSet);
    }

    /* renamed from: d */
    private void m7041d(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3706a.ArcView);
            this.f4831o = (float) obtainStyledAttributes.getDimensionPixelSize(C3706a.ArcView_shape_arc_height, (int) this.f4831o);
            this.f4830n = obtainStyledAttributes.getInteger(C3706a.ArcView_shape_arc_position, this.f4830n);
            obtainStyledAttributes.recycle();
        }
        super.setClipPathCreator(new C1422a());
    }

    public float getArcHeight() {
        return this.f4831o;
    }

    public float getArcHeightDp() {
        return mo12226e(this.f4831o);
    }

    public int getArcPosition() {
        return this.f4830n;
    }

    public int getCropDirection() {
        return this.f4831o > 0.0f ? 2 : 1;
    }

    public void setArcHeight(float f) {
        this.f4831o = f;
        mo12227g();
    }

    public void setArcHeightDp(float f) {
        setArcHeight(mo12225c(f));
    }

    public void setArcPosition(int i) {
        this.f4830n = i;
        mo12227g();
    }
}
