package p086f.p144s;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.s.i0 */
class C3522i0 {

    /* renamed from: a */
    private static Method f10955a;

    /* renamed from: b */
    private static boolean f10956b;

    /* renamed from: c */
    private static Field f10957c;

    /* renamed from: d */
    private static boolean f10958d;

    C3522i0() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    private void m15099b() {
        if (!f10956b) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f10955a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f10956b = true;
        }
    }

    /* renamed from: a */
    public void mo11921a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C3523j.save_non_transition_alpha, (Object) null);
        }
    }

    /* renamed from: c */
    public float mo11922c(View view) {
        Float f = (Float) view.getTag(C3523j.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: d */
    public void mo11923d(View view) {
        if (view.getTag(C3523j.save_non_transition_alpha) == null) {
            view.setTag(C3523j.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo11928e(View view, int i, int i2, int i3, int i4) {
        m15099b();
        Method method = f10955a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo11924f(View view, float f) {
        Float f2 = (Float) view.getTag(C3523j.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: g */
    public void mo11930g(View view, int i) {
        if (!f10958d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f10957c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f10958d = true;
        }
        Field field = f10957c;
        if (field != null) {
            try {
                f10957c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo11926h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo11926h(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: i */
    public void mo11927i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo11927i(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
