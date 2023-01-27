package p340io.realm.internal;

import android.os.Build;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import p340io.realm.C5763l0;
import p340io.realm.C5771n0;
import p340io.realm.log.RealmLog;

/* renamed from: io.realm.internal.Util */
public class Util {
    /* renamed from: a */
    public static boolean m23788a(String str, File file, String str2) {
        boolean z;
        File file2 = new File(file, str2 + ".management");
        File file3 = new File(str);
        File file4 = new File(str + ".note");
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            for (File file5 : listFiles) {
                if (!file5.delete()) {
                    RealmLog.m24088n(String.format(Locale.ENGLISH, "Realm temporary file at %s cannot be deleted", new Object[]{file5.getAbsolutePath()}), new Object[0]);
                }
            }
        }
        if (file2.exists() && !file2.delete()) {
            RealmLog.m24088n(String.format(Locale.ENGLISH, "Realm temporary folder at %s cannot be deleted", new Object[]{file2.getAbsolutePath()}), new Object[0]);
        }
        if (file3.exists()) {
            z = file3.delete();
            if (!z) {
                RealmLog.m24088n(String.format(Locale.ENGLISH, "Realm file at %s cannot be deleted", new Object[]{file3.getAbsolutePath()}), new Object[0]);
            }
        } else {
            z = true;
        }
        if (file4.exists() && !file4.delete()) {
            RealmLog.m24088n(String.format(Locale.ENGLISH, ".note file at %s cannot be deleted", new Object[]{file4.getAbsolutePath()}), new Object[0]);
        }
        return z;
    }

    /* renamed from: b */
    public static Class<? extends C5763l0> m23789b(Class<? extends C5763l0> cls) {
        Class<C5771n0> cls2 = C5771n0.class;
        if (cls.equals(C5763l0.class) || cls.equals(cls2)) {
            throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
        }
        Class<? super Object> superclass = cls.getSuperclass();
        return (superclass.equals(Object.class) || superclass.equals(cls2)) ? cls : superclass;
    }

    /* renamed from: c */
    public static String m23790c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    /* renamed from: d */
    public static String m23791d() {
        return nativeGetTablePrefix();
    }

    /* renamed from: e */
    public static boolean m23792e(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: f */
    public static boolean m23793f() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    /* renamed from: g */
    public static <T> Set<T> m23794g(T... tArr) {
        if (tArr == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : tArr) {
            if (t != null) {
                linkedHashSet.add(t);
            }
        }
        return linkedHashSet;
    }

    static native String nativeGetTablePrefix();
}
