package p148g.p149a.p165b.p166d;

import p148g.p149a.p165b.C3649a;

/* renamed from: g.a.b.d.b */
public class C3654b extends C3649a {

    /* renamed from: c */
    private float f11269c;

    /* renamed from: b */
    public Float mo12190b(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f / (f4 / 2.0f);
        float f7 = f3 / 2.0f;
        if (f6 < 1.0f) {
            double d = (double) this.f11269c;
            Double.isNaN(d);
            float f8 = (float) (d * 1.525d);
            this.f11269c = f8;
            f5 = f7 * f6 * f6 * (((1.0f + f8) * f6) - f8);
        } else {
            float f9 = f6 - 2.0f;
            double d2 = (double) this.f11269c;
            Double.isNaN(d2);
            float f10 = (float) (d2 * 1.525d);
            this.f11269c = f10;
            f5 = f7 * ((f9 * f9 * (((1.0f + f10) * f9) + f10)) + 2.0f);
        }
        return Float.valueOf(f5 + f2);
    }
}
