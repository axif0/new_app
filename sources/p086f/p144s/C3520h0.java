package p086f.p144s;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: f.s.h0 */
class C3520h0 extends C3518g0 {
    C3520h0() {
    }

    /* renamed from: c */
    public float mo11922c(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo11928e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: f */
    public void mo11924f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: g */
    public void mo11930g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: h */
    public void mo11926h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: i */
    public void mo11927i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
