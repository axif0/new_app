package p148g.p149a.p165b.p170h;

import p148g.p149a.p165b.C3649a;

/* renamed from: g.a.b.h.a */
public class C3665a extends C3649a {
    /* renamed from: b */
    public Float mo12190b(float f, float f2, float f3, float f4) {
        if (f == 0.0f) {
            return Float.valueOf(f2);
        }
        float f5 = f / f4;
        if (f5 == 1.0f) {
            return Float.valueOf(f2 + f3);
        }
        float f6 = 0.3f * f4;
        float f7 = f5 - 1.0f;
        return Float.valueOf((-(f3 * ((float) Math.pow(2.0d, (double) (10.0f * f7))) * ((float) Math.sin((double) ((((f7 * f4) - (f6 / 4.0f)) * 6.2831855f) / f6))))) + f2);
    }
}
