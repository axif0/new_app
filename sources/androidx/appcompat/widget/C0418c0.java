package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.graphics.drawable.C0590c;
import java.lang.reflect.Field;
import p086f.p087a.p090l.p091a.C3147c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.c0 */
public class C0418c0 {

    /* renamed from: a */
    private static final int[] f1638a = {16842912};

    /* renamed from: b */
    private static final int[] f1639b = new int[0];

    /* renamed from: c */
    public static final Rect f1640c = new Rect();

    /* renamed from: d */
    private static Class<?> f1641d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1641d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1901a(Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m1901a(a)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof C0590c) {
            drawable2 = ((C0590c) drawable).mo2891b();
        } else if (drawable instanceof C3147c) {
            drawable2 = ((C3147c) drawable).mo10856a();
        } else if (!(drawable instanceof ScaleDrawable)) {
            return true;
        } else {
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return m1901a(drawable2);
    }

    /* renamed from: b */
    static void m1902b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m1903c(drawable);
        }
    }

    /* renamed from: c */
    private static void m1903c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1638a);
        } else {
            drawable.setState(f1639b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m1904d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1641d != null) {
            try {
                Drawable q = C0588a.m2774q(drawable);
                Object invoke = q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1641d.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1640c;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m1905e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
