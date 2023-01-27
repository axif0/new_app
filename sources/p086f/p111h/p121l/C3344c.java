package p086f.p111h.p121l;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: f.h.l.c */
public class C3344c {
    /* renamed from: a */
    public static boolean m14350a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m14351b(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }
}
