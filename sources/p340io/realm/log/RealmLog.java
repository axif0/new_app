package p340io.realm.log;

import android.util.Log;
import java.util.Locale;

/* renamed from: io.realm.log.RealmLog */
public final class RealmLog {

    /* renamed from: a */
    private static String f16612a = "REALM_JAVA";

    /* renamed from: a */
    public static void m24075a(String str, Object... objArr) {
        m24076b((Throwable) null, str, objArr);
    }

    /* renamed from: b */
    public static void m24076b(Throwable th, String str, Object... objArr) {
        m24085k(3, th, str, objArr);
    }

    /* renamed from: c */
    public static void m24077c(String str, Object... objArr) {
        m24079e((Throwable) null, str, objArr);
    }

    /* renamed from: d */
    public static void m24078d(Throwable th) {
        m24079e(th, (String) null, new Object[0]);
    }

    /* renamed from: e */
    public static void m24079e(Throwable th, String str, Object... objArr) {
        m24085k(6, th, str, objArr);
    }

    /* renamed from: f */
    public static void m24080f(String str, Object... objArr) {
        m24081g((Throwable) null, str, objArr);
    }

    /* renamed from: g */
    public static void m24081g(Throwable th, String str, Object... objArr) {
        m24085k(7, th, str, objArr);
    }

    /* renamed from: h */
    public static int m24082h() {
        return nativeGetLogLevel();
    }

    /* renamed from: i */
    public static void m24083i(String str, Object... objArr) {
        m24084j((Throwable) null, str, objArr);
    }

    /* renamed from: j */
    public static void m24084j(Throwable th, String str, Object... objArr) {
        m24085k(4, th, str, objArr);
    }

    /* renamed from: k */
    private static void m24085k(int i, Throwable th, String str, Object... objArr) {
        if (i >= m24082h()) {
            StringBuilder sb = new StringBuilder();
            if (!(str == null || objArr == null || objArr.length <= 0)) {
                str = String.format(Locale.US, str, objArr);
            }
            if (th != null) {
                sb.append(Log.getStackTraceString(th));
            }
            if (str != null) {
                if (th != null) {
                    sb.append("\n");
                }
                sb.append(str);
            }
            nativeLog(i, f16612a, th, sb.toString());
        }
    }

    /* renamed from: l */
    public static void m24086l(String str, Object... objArr) {
        m24087m((Throwable) null, str, objArr);
    }

    /* renamed from: m */
    public static void m24087m(Throwable th, String str, Object... objArr) {
        m24085k(2, th, str, objArr);
    }

    /* renamed from: n */
    public static void m24088n(String str, Object... objArr) {
        m24089o((Throwable) null, str, objArr);
    }

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i, String str, Throwable th, String str2);

    /* renamed from: o */
    public static void m24089o(Throwable th, String str, Object... objArr) {
        m24085k(5, th, str, objArr);
    }
}
