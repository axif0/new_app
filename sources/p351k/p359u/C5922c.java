package p351k.p359u;

/* renamed from: k.u.c */
public final class C5922c {
    /* renamed from: a */
    private static final int m24475a(int i, int i2, int i3) {
        return m24477c(m24477c(i, i3) - m24477c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m24476b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m24475a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m24475a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    private static final int m24477c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
