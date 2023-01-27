package p086f.p132m.p133a.p134a;

import android.view.animation.Interpolator;

/* renamed from: f.m.a.a.d */
abstract class C3456d implements Interpolator {

    /* renamed from: a */
    private final float[] f10850a;

    /* renamed from: b */
    private final float f10851b;

    protected C3456d(float[] fArr) {
        this.f10850a = fArr;
        this.f10851b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f10850a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f10851b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f10850a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
