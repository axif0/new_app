package p148g.p149a.p165b.p169g;

import p148g.p149a.p165b.C3649a;

/* renamed from: g.a.b.g.b */
public class C3663b extends C3649a {
    /* renamed from: b */
    public Float mo12190b(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f / (f4 / 2.0f);
        float f7 = f3 / 2.0f;
        if (f6 < 1.0f) {
            f5 = f7 * f6 * f6 * f6;
        } else {
            float f8 = f6 - 2.0f;
            f5 = f7 * ((f8 * f8 * f8) + 2.0f);
        }
        return Float.valueOf(f5 + f2);
    }
}
