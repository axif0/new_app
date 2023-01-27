package p086f.p144s;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: f.s.e0 */
class C3514e0 extends C3508d0 {

    /* renamed from: f */
    private static boolean f10945f = true;

    /* renamed from: g */
    private static boolean f10946g = true;

    C3514e0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo11926h(View view, Matrix matrix) {
        if (f10945f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f10945f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo11927i(View view, Matrix matrix) {
        if (f10946g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f10946g = false;
            }
        }
    }
}
