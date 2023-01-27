package p148g.p149a.p165b.p168f;

import p148g.p149a.p165b.C3649a;

/* renamed from: g.a.b.f.b */
public class C3660b extends C3649a {
    /* renamed from: b */
    public Float mo12190b(float f, float f2, float f3, float f4) {
        float f5;
        float sqrt;
        float f6 = f / (f4 / 2.0f);
        if (f6 < 1.0f) {
            f5 = (-f3) / 2.0f;
            sqrt = ((float) Math.sqrt((double) (1.0f - (f6 * f6)))) - 1.0f;
        } else {
            f5 = f3 / 2.0f;
            float f7 = f6 - 2.0f;
            sqrt = ((float) Math.sqrt((double) (1.0f - (f7 * f7)))) + 1.0f;
        }
        return Float.valueOf((f5 * sqrt) + f2);
    }
}
