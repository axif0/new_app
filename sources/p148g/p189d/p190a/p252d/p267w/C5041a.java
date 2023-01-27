package p148g.p189d.p190a.p252d.p267w;

/* renamed from: g.d.a.d.w.a */
public final class C5041a {
    /* renamed from: a */
    public static float m21322a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m21323b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m21325d(m21322a(f, f2, f3, f4), m21322a(f, f2, f5, f4), m21322a(f, f2, f5, f6), m21322a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m21324c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m21325d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
