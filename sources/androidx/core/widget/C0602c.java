package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
public final class C0602c {

    /* renamed from: a */
    private static Field f2518a;

    /* renamed from: b */
    private static boolean f2519b;

    /* renamed from: a */
    public static Drawable m2871a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f2519b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2518a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f2519b = true;
        }
        Field field = f2518a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f2518a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ColorStateList m2872b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof C0610j) {
            return ((C0610j) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: c */
    public static void m2873c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C0610j) {
            ((C0610j) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m2874d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof C0610j) {
            ((C0610j) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
