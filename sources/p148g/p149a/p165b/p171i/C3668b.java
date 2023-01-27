package p148g.p149a.p165b.p171i;

import p148g.p149a.p165b.C3649a;

/* renamed from: g.a.b.i.b */
public class C3668b extends C3649a {
    /* renamed from: b */
    public Float mo12190b(float f, float f2, float f3, float f4) {
        if (f == 0.0f) {
            return Float.valueOf(f2);
        }
        if (f == f4) {
            return Float.valueOf(f2 + f3);
        }
        float f5 = f / (f4 / 2.0f);
        float f6 = f3 / 2.0f;
        return f5 < 1.0f ? Float.valueOf((f6 * ((float) Math.pow(2.0d, (double) ((f5 - 1.0f) * 10.0f)))) + f2) : Float.valueOf((f6 * ((-((float) Math.pow(2.0d, (double) ((f5 - 1.0f) * -10.0f)))) + 2.0f)) + f2);
    }
}
