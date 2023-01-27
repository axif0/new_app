package p148g.p189d.p289c.p291y;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: g.d.c.y.j */
public class C5287j {
    /* renamed from: a */
    private static String m21938a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: b */
    private static String m21939b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: c */
    public static DateFormat m21940c(int i, int i2) {
        return new SimpleDateFormat(m21938a(i) + " " + m21939b(i2), Locale.US);
    }
}
