package p148g.p189d.p190a.p191a.p192i.p193t;

import android.util.Log;

/* renamed from: g.d.a.a.i.t.a */
public final class C3765a {
    /* renamed from: a */
    public static void m15704a(String str, String str2, Object obj) {
        Log.d(m15707d(str), String.format(str2, new Object[]{obj}));
    }

    /* renamed from: b */
    public static void m15705b(String str, String str2, Object... objArr) {
        Log.d(m15707d(str), String.format(str2, objArr));
    }

    /* renamed from: c */
    public static void m15706c(String str, String str2, Throwable th) {
        Log.e(m15707d(str), str2, th);
    }

    /* renamed from: d */
    private static String m15707d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m15708e(String str, String str2) {
        Log.i(m15707d(str), str2);
    }

    /* renamed from: f */
    public static void m15709f(String str, String str2, Object obj) {
        Log.w(m15707d(str), String.format(str2, new Object[]{obj}));
    }
}
