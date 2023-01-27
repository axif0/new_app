package p148g.p189d.p190a.p271e.p272a.p274b.p275e;

import com.karumi.dexter.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.d.a.e.a.b.e.a */
public final class C5089a {

    /* renamed from: a */
    private static final Map<Integer, String> f15127a = new HashMap();

    /* renamed from: b */
    private static final Map<Integer, String> f15128b = new HashMap();

    static {
        f15127a.put(-2, "An unknown error occurred.");
        f15127a.put(-3, "The API is not available on this device.");
        f15127a.put(-4, "The request that was sent by the app is malformed.");
        f15127a.put(-5, "The install is unavailable to this user or device.");
        f15127a.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        f15127a.put(-7, "The install/update has not been (fully) downloaded yet.");
        f15127a.put(-8, "The install is already in progress and there is no UI flow to resume.");
        f15127a.put(-9, "The Play Store app is either not installed or not the official version.");
        f15127a.put(-10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        f15127a.put(-100, "An internal error happened in the Play Store.");
        f15128b.put(-2, "ERROR_UNKNOWN");
        f15128b.put(-3, "ERROR_API_NOT_AVAILABLE");
        f15128b.put(-4, "ERROR_INVALID_REQUEST");
        f15128b.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        f15128b.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        f15128b.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        f15128b.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        f15128b.put(-100, "ERROR_INTERNAL_ERROR");
        f15128b.put(-9, "ERROR_PLAY_STORE_NOT_FOUND");
        f15128b.put(-10, "ERROR_APP_NOT_OWNED");
    }

    /* renamed from: a */
    public static String m21465a(int i) {
        Map<Integer, String> map = f15127a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !f15128b.containsKey(valueOf)) {
            return BuildConfig.FLAVOR;
        }
        String str = f15127a.get(valueOf);
        String str2 = f15128b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
