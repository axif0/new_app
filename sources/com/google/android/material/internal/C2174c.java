package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.google.android.material.internal.c */
public class C2174c {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f7234a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f7235b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m10197a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m10199c(viewGroup, view, rect);
    }

    /* renamed from: b */
    private static void m10198b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m10198b(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: c */
    public static void m10199c(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f7234a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f7234a.set(matrix);
        } else {
            matrix.reset();
        }
        m10198b(viewGroup, view, matrix);
        RectF rectF = f7235b.get();
        if (rectF == null) {
            rectF = new RectF();
            f7235b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
