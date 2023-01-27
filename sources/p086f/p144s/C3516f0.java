package p086f.p144s;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: f.s.f0 */
class C3516f0 extends C3514e0 {

    /* renamed from: h */
    private static boolean f10947h = true;

    C3516f0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo11928e(View view, int i, int i2, int i3, int i4) {
        if (f10947h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f10947h = false;
            }
        }
    }
}
