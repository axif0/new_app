package p086f.p111h.p120k;

import android.os.Build;
import android.text.TextUtils;
import com.karumi.dexter.BuildConfig;
import java.util.Locale;

/* renamed from: f.h.k.f */
public final class C3341f {

    /* renamed from: a */
    private static final Locale f10635a = new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    /* renamed from: a */
    private static int m14346a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m14347b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f10635a)) {
            return 0;
        }
        String c = C3329b.m14323c(locale);
        return c == null ? m14346a(locale) : (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
