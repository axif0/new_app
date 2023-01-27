package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.f */
public class C0538f extends ViewGroup {

    /* renamed from: f */
    C0532e f2250f;

    /* renamed from: androidx.constraintlayout.widget.f$a */
    public static class C0539a extends ConstraintLayout.C0521b {

        /* renamed from: A0 */
        public float f2251A0;

        /* renamed from: o0 */
        public float f2252o0;

        /* renamed from: p0 */
        public boolean f2253p0;

        /* renamed from: q0 */
        public float f2254q0;

        /* renamed from: r0 */
        public float f2255r0;

        /* renamed from: s0 */
        public float f2256s0;

        /* renamed from: t0 */
        public float f2257t0;

        /* renamed from: u0 */
        public float f2258u0;

        /* renamed from: v0 */
        public float f2259v0;

        /* renamed from: w0 */
        public float f2260w0;

        /* renamed from: x0 */
        public float f2261x0;

        /* renamed from: y0 */
        public float f2262y0;

        /* renamed from: z0 */
        public float f2263z0;

        public C0539a(int i, int i2) {
            super(i, i2);
            this.f2252o0 = 1.0f;
            this.f2253p0 = false;
            this.f2254q0 = 0.0f;
            this.f2255r0 = 0.0f;
            this.f2256s0 = 0.0f;
            this.f2257t0 = 0.0f;
            this.f2258u0 = 1.0f;
            this.f2259v0 = 1.0f;
            this.f2260w0 = 0.0f;
            this.f2261x0 = 0.0f;
            this.f2262y0 = 0.0f;
            this.f2263z0 = 0.0f;
            this.f2251A0 = 0.0f;
        }

        public C0539a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2252o0 = 1.0f;
            this.f2253p0 = false;
            this.f2254q0 = 0.0f;
            this.f2255r0 = 0.0f;
            this.f2256s0 = 0.0f;
            this.f2257t0 = 0.0f;
            this.f2258u0 = 1.0f;
            this.f2259v0 = 1.0f;
            this.f2260w0 = 0.0f;
            this.f2261x0 = 0.0f;
            this.f2262y0 = 0.0f;
            this.f2263z0 = 0.0f;
            this.f2251A0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0544k.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0544k.ConstraintSet_android_alpha) {
                    this.f2252o0 = obtainStyledAttributes.getFloat(index, this.f2252o0);
                } else if (index == C0544k.ConstraintSet_android_elevation) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2254q0 = obtainStyledAttributes.getFloat(index, this.f2254q0);
                        this.f2253p0 = true;
                    }
                } else if (index == C0544k.ConstraintSet_android_rotationX) {
                    this.f2256s0 = obtainStyledAttributes.getFloat(index, this.f2256s0);
                } else if (index == C0544k.ConstraintSet_android_rotationY) {
                    this.f2257t0 = obtainStyledAttributes.getFloat(index, this.f2257t0);
                } else if (index == C0544k.ConstraintSet_android_rotation) {
                    this.f2255r0 = obtainStyledAttributes.getFloat(index, this.f2255r0);
                } else if (index == C0544k.ConstraintSet_android_scaleX) {
                    this.f2258u0 = obtainStyledAttributes.getFloat(index, this.f2258u0);
                } else if (index == C0544k.ConstraintSet_android_scaleY) {
                    this.f2259v0 = obtainStyledAttributes.getFloat(index, this.f2259v0);
                } else if (index == C0544k.ConstraintSet_android_transformPivotX) {
                    this.f2260w0 = obtainStyledAttributes.getFloat(index, this.f2260w0);
                } else if (index == C0544k.ConstraintSet_android_transformPivotY) {
                    this.f2261x0 = obtainStyledAttributes.getFloat(index, this.f2261x0);
                } else if (index == C0544k.ConstraintSet_android_translationX) {
                    this.f2262y0 = obtainStyledAttributes.getFloat(index, this.f2262y0);
                } else if (index == C0544k.ConstraintSet_android_translationY) {
                    this.f2263z0 = obtainStyledAttributes.getFloat(index, this.f2263z0);
                } else if (index == C0544k.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
                    this.f2251A0 = obtainStyledAttributes.getFloat(index, this.f2251A0);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0539a generateDefaultLayoutParams() {
        return new C0539a(-2, -2);
    }

    /* renamed from: b */
    public C0539a generateLayoutParams(AttributeSet attributeSet) {
        return new C0539a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0521b(layoutParams);
    }

    public C0532e getConstraintSet() {
        if (this.f2250f == null) {
            this.f2250f = new C0532e();
        }
        this.f2250f.mo2643f(this);
        return this.f2250f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
