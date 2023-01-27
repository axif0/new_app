package com.google.android.play.core.assetpacks.p041a3;

import com.karumi.dexter.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.a3.a */
public final class C2321a {

    /* renamed from: a */
    private static final Map<Integer, String> f7716a = new HashMap();

    /* renamed from: b */
    private static final Map<Integer, String> f7717b = new HashMap();

    static {
        f7716a.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        f7716a.put(-2, "The requested pack is not available.");
        f7716a.put(-3, "The request is invalid.");
        f7716a.put(-4, "The requested download is not found.");
        f7716a.put(-5, "The Asset Delivery API is not available.");
        f7716a.put(-6, "Network error. Unable to obtain the asset pack details.");
        f7716a.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        f7716a.put(-10, "Asset pack download failed due to insufficient storage.");
        f7716a.put(-11, "The Play Store app is either not installed or not the official version.");
        f7716a.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        f7716a.put(-13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        f7716a.put(-100, "Unknown error downloading an asset pack.");
        f7717b.put(-1, "APP_UNAVAILABLE");
        f7717b.put(-2, "PACK_UNAVAILABLE");
        f7717b.put(-3, "INVALID_REQUEST");
        f7717b.put(-4, "DOWNLOAD_NOT_FOUND");
        f7717b.put(-5, "API_NOT_AVAILABLE");
        f7717b.put(-6, "NETWORK_ERROR");
        f7717b.put(-7, "ACCESS_DENIED");
        f7717b.put(-10, "INSUFFICIENT_STORAGE");
        f7717b.put(-11, "PLAY_STORE_NOT_FOUND");
        f7717b.put(-12, "NETWORK_UNRESTRICTED");
        f7717b.put(-13, "APP_NOT_OWNED");
        f7717b.put(-100, "INTERNAL_ERROR");
    }

    /* renamed from: a */
    public static String m10800a(int i) {
        Map<Integer, String> map = f7716a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return BuildConfig.FLAVOR;
        }
        String str = f7716a.get(valueOf);
        String str2 = f7717b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
