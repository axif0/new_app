package p148g.p189d.p296d.p322y.p324c;

import p148g.p189d.p296d.C5383o;

/* renamed from: g.d.d.y.c.d */
public final class C5539d extends C5383o {

    /* renamed from: c */
    private final float f16019c;

    /* renamed from: d */
    private final int f16020d;

    C5539d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private C5539d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f16019c = f3;
        this.f16020d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo15946f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo15619d()) > f || Math.abs(f3 - mo15618c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f16019c);
        return abs <= 1.0f || abs <= this.f16019c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C5539d mo15947g(float f, float f2, float f3) {
        int i = this.f16020d;
        int i2 = i + 1;
        float c = (((float) i) * mo15618c()) + f2;
        float f4 = (float) i2;
        return new C5539d(c / f4, ((((float) this.f16020d) * mo15619d()) + f) / f4, ((((float) this.f16020d) * this.f16019c) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo15948h() {
        return this.f16020d;
    }

    /* renamed from: i */
    public float mo15949i() {
        return this.f16019c;
    }
}
