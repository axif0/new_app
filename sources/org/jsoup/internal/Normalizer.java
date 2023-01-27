package org.jsoup.internal;

import com.karumi.dexter.BuildConfig;
import java.util.Locale;

public final class Normalizer {
    public static String lowerCase(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.FLAVOR;
    }

    public static String normalize(String str) {
        return lowerCase(str).trim();
    }
}
