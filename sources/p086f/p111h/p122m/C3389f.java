package p086f.p111h.p122m;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: f.h.m.f */
public final class C3389f {

    /* renamed from: a */
    private static Field f10693a;

    /* renamed from: b */
    private static boolean f10694b;

    /* renamed from: a */
    private static void m14552a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f10694b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f10693a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f10694b = true;
        }
        Field field = f10693a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m14553b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m14552a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m14552a(layoutInflater, factory2);
            }
        }
    }
}
