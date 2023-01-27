package p086f.p144s;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: f.s.x */
class C3554x {

    /* renamed from: a */
    private static boolean f11050a = true;

    /* renamed from: a */
    static C3553w m15253a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C3552v(viewGroup) : C3551u.m15244g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m15254b(ViewGroup viewGroup, boolean z) {
        if (f11050a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f11050a = false;
            }
        }
    }

    /* renamed from: c */
    static void m15255c(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m15254b(viewGroup, z);
        } else {
            C3555y.m15257b(viewGroup, z);
        }
    }
}
