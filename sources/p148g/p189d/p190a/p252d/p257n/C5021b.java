package p148g.p189d.p190a.p252d.p257n;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: g.d.a.d.n.b */
public class C5021b {

    /* renamed from: a */
    public static final boolean f14999a = (Build.VERSION.SDK_INT < 18);

    /* renamed from: a */
    public static void m21274a(C5018a aVar, View view, FrameLayout frameLayout) {
        m21276c(aVar, view, frameLayout);
        if (f14999a) {
            frameLayout.setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    /* renamed from: b */
    public static void m21275b(C5018a aVar, View view, FrameLayout frameLayout) {
        if (aVar != null) {
            if (f14999a) {
                frameLayout.setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(aVar);
            }
        }
    }

    /* renamed from: c */
    public static void m21276c(C5018a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f14999a ? frameLayout : view).getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.mo15069v(view, frameLayout);
    }

    /* renamed from: d */
    public static void m21277d(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
