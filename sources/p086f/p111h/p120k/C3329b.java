package p086f.p111h.p120k;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: f.h.k.b */
public final class C3329b {

    /* renamed from: a */
    private static Method f10612a;

    /* renamed from: b */
    private static Method f10613b;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                if (cls2 != null) {
                    f10612a = cls2.getMethod("getScript", new Class[]{cls});
                    f10613b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
                }
            } catch (Exception e) {
                f10612a = null;
                f10613b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f10613b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m14321a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f10613b != null) {
                return (String) f10613b.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m14322b(String str) {
        try {
            if (f10612a != null) {
                return (String) f10612a.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    /* renamed from: c */
    public static String m14323c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f10613b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            }
        } else {
            String a = m14321a(locale);
            if (a != null) {
                return m14322b(a);
            }
            return null;
        }
    }
}
