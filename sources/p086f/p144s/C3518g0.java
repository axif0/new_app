package p086f.p144s;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: f.s.g0 */
class C3518g0 extends C3516f0 {

    /* renamed from: i */
    private static boolean f10948i = true;

    C3518g0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo11930g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo11930g(view, i);
        } else if (f10948i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f10948i = false;
            }
        }
    }
}
