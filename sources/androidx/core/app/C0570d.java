package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.d */
public final class C0570d {

    /* renamed from: androidx.core.app.d$a */
    static class C0571a {

        /* renamed from: a */
        private static Method f2351a;

        /* renamed from: b */
        private static boolean f2352b;

        /* renamed from: c */
        private static Method f2353c;

        /* renamed from: d */
        private static boolean f2354d;

        /* renamed from: a */
        public static IBinder m2657a(Bundle bundle, String str) {
            if (!f2352b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2351a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f2352b = true;
            }
            Method method2 = f2351a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f2351a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m2658b(Bundle bundle, String str, IBinder iBinder) {
            if (!f2354d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2353c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f2354d = true;
            }
            Method method2 = f2353c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f2353c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m2655a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0571a.m2657a(bundle, str);
    }

    /* renamed from: b */
    public static void m2656b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0571a.m2658b(bundle, str, iBinder);
        }
    }
}
