package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: androidx.coordinatorlayout.widget.b */
public class C0557b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f2321a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f2322b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m2630a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m2632c(viewGroup, view, rect);
    }

    /* renamed from: b */
    private static void m2631b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2631b(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: c */
    static void m2632c(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f2321a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f2321a.set(matrix);
        } else {
            matrix.reset();
        }
        m2631b(viewGroup, view, matrix);
        RectF rectF = f2322b.get();
        if (rectF == null) {
            rectF = new RectF();
            f2322b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
