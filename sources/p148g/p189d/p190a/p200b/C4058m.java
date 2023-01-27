package p148g.p189d.p190a.p200b;

import java.util.HashSet;

/* renamed from: g.d.a.b.m */
public final class C4058m {

    /* renamed from: a */
    private static final HashSet<String> f12842a = new HashSet<>();

    /* renamed from: b */
    private static String f12843b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m17235a(String str) {
        synchronized (C4058m.class) {
            if (f12842a.add(str)) {
                f12843b += ", " + str;
            }
        }
    }
}
