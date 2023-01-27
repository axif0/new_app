package p148g.p149a.p165b.p173k;

import p148g.p149a.p165b.C3649a;

/* renamed from: g.a.b.k.b */
public class C3672b extends C3649a {
    /* renamed from: b */
    public Float mo12190b(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f / (f4 / 2.0f);
        if (f6 < 1.0f) {
            f5 = (f3 / 2.0f) * f6;
        } else {
            f5 = (-f3) / 2.0f;
            float f7 = f6 - 1.0f;
            f6 = (f7 * (f7 - 2.0f)) - 1.0f;
        }
        return Float.valueOf((f5 * f6) + f2);
    }
}
