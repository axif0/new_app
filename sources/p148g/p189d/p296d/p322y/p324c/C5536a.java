package p148g.p189d.p296d.p322y.p324c;

import p148g.p189d.p296d.C5383o;

/* renamed from: g.d.d.y.c.a */
public final class C5536a extends C5383o {

    /* renamed from: c */
    private final float f16007c;

    C5536a(float f, float f2, float f3) {
        super(f, f2);
        this.f16007c = f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo15939f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo15619d()) > f || Math.abs(f3 - mo15618c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f16007c);
        return abs <= 1.0f || abs <= this.f16007c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C5536a mo15940g(float f, float f2, float f3) {
        return new C5536a((mo15618c() + f2) / 2.0f, (mo15619d() + f) / 2.0f, (this.f16007c + f3) / 2.0f);
    }
}
