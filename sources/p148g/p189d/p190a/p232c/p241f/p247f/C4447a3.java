package p148g.p189d.p190a.p232c.p241f.p247f;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.a3 */
public final class C4447a3 {
    /* renamed from: a */
    public static int m18700a(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = C4484c3.m18946b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str = C4484c3.m18946b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    @NonNullDecl
    /* renamed from: b */
    public static <T> T m18701b(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    @NonNullDecl
    /* renamed from: c */
    public static <T> T m18702c(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: d */
    private static String m18703d(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C4484c3.m18946b("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C4484c3.m18946b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e */
    public static void m18704e(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m18703d(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m18703d(i2, i3, "end index");
            } else {
                str = C4484c3.m18946b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: f */
    public static void m18705f(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: g */
    public static int m18706g(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m18703d(i, i2, "index"));
    }

    /* renamed from: h */
    public static void m18707h(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
