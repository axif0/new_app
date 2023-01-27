package p086f.p111h.p122m;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: f.h.m.d */
public final class C3386d {
    /* renamed from: a */
    public static void m14543a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: b */
    public static int m14544b(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
