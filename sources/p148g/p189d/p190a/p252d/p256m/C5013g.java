package p148g.p189d.p190a.p252d.p256m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: g.d.a.d.m.g */
public class C5013g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f14957a = new float[9];

    /* renamed from: b */
    private final float[] f14958b = new float[9];

    /* renamed from: c */
    private final Matrix f14959c = new Matrix();

    /* renamed from: a */
    public Matrix mo8439a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f14957a);
        matrix2.getValues(this.f14958b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f14958b;
            float f2 = fArr[i];
            float[] fArr2 = this.f14957a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f14959c.setValues(this.f14958b);
        return this.f14959c;
    }
}
