package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p086f.p111h.p122m.C3386d;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.core.widget.h */
public final class C0607h {

    /* renamed from: a */
    private static Method f2521a;

    /* renamed from: b */
    private static boolean f2522b;

    /* renamed from: c */
    private static Field f2523c;

    /* renamed from: d */
    private static boolean f2524d;

    /* renamed from: a */
    public static void m2884a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            if (!f2524d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2523c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f2524d = true;
            }
            Field field = f2523c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m2885b(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f2522b) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f2521a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2522b = true;
        }
        Method method = f2521a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m2886c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C3386d.m14544b(i3, C3403t.m14674y(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }
}
