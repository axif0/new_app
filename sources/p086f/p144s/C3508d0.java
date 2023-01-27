package p086f.p144s;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: f.s.d0 */
class C3508d0 extends C3522i0 {

    /* renamed from: e */
    private static boolean f10935e = true;

    C3508d0() {
    }

    /* renamed from: a */
    public void mo11921a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo11922c(View view) {
        if (f10935e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f10935e = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo11923d(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo11924f(View view, float f) {
        if (f10935e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f10935e = false;
            }
        }
        view.setAlpha(f);
    }
}
