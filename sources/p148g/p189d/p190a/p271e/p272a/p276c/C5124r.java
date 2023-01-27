package p148g.p189d.p190a.p271e.p272a.p276c;

import com.karumi.dexter.BuildConfig;
import java.io.File;

/* renamed from: g.d.a.e.a.c.r */
public final class C5124r {
    /* renamed from: a */
    public static String m21531a(File file) {
        if (file.getName().endsWith(".apk")) {
            String name = file.getName();
            String str = BuildConfig.FLAVOR;
            String replaceFirst = name.replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: b */
    public static <T> void m21532b(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }

    /* renamed from: c */
    public static void m21533c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
