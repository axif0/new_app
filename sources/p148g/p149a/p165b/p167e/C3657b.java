package p148g.p149a.p165b.p167e;

import p148g.p149a.p165b.C3649a;

/* renamed from: g.a.b.e.b */
public class C3657b extends C3649a {

    /* renamed from: c */
    private C3658c f11272c;

    /* renamed from: d */
    private C3656a f11273d;

    /* renamed from: b */
    public Float mo12190b(float f, float f2, float f3, float f4) {
        return Float.valueOf((f < f4 / 2.0f ? this.f11273d.mo12190b(f * 2.0f, 0.0f, f3, f4).floatValue() * 0.5f : (this.f11272c.mo12190b((f * 2.0f) - f4, 0.0f, f3, f4).floatValue() * 0.5f) + (f3 * 0.5f)) + f2);
    }
}
