package p148g.p189d.p296d.p304s;

/* renamed from: g.d.d.s.k */
public final class C5421k {

    /* renamed from: a */
    private final float f15690a;

    /* renamed from: b */
    private final float f15691b;

    /* renamed from: c */
    private final float f15692c;

    /* renamed from: d */
    private final float f15693d;

    /* renamed from: e */
    private final float f15694e;

    /* renamed from: f */
    private final float f15695f;

    /* renamed from: g */
    private final float f15696g;

    /* renamed from: h */
    private final float f15697h;

    /* renamed from: i */
    private final float f15698i;

    private C5421k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f15690a = f;
        this.f15691b = f4;
        this.f15692c = f7;
        this.f15693d = f2;
        this.f15694e = f5;
        this.f15695f = f8;
        this.f15696g = f3;
        this.f15697h = f6;
        this.f15698i = f9;
    }

    /* renamed from: b */
    public static C5421k m22349b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m22351d(f9, f10, f11, f12, f13, f14, f15, f16).mo15702e(m22350c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C5421k m22350c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m22351d(f, f2, f3, f4, f5, f6, f7, f8).mo15701a();
    }

    /* renamed from: d */
    public static C5421k m22351d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C5421k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C5421k((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5421k mo15701a() {
        float f = this.f15694e;
        float f2 = this.f15698i;
        float f3 = this.f15695f;
        float f4 = this.f15697h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f15696g;
        float f7 = this.f15693d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f15692c;
        float f11 = this.f15691b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f15690a;
        return new C5421k(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5421k mo15702e(C5421k kVar) {
        C5421k kVar2 = kVar;
        float f = this.f15690a;
        float f2 = kVar2.f15690a;
        float f3 = this.f15693d;
        float f4 = kVar2.f15691b;
        float f5 = this.f15696g;
        float f6 = kVar2.f15692c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = kVar2.f15693d;
        float f9 = kVar2.f15694e;
        float f10 = kVar2.f15695f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = kVar2.f15696g;
        float f13 = kVar2.f15697h;
        float f14 = kVar2.f15698i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f15691b;
        float f17 = f15;
        float f18 = this.f15694e;
        float f19 = f11;
        float f20 = this.f15697h;
        float f21 = (f16 * f2) + (f18 * f4) + (f20 * f6);
        float f22 = (f20 * f14) + (f16 * f12) + (f18 * f13);
        float f23 = this.f15692c;
        float f24 = this.f15695f;
        float f25 = (f2 * f23) + (f4 * f24);
        float f26 = this.f15698i;
        float f27 = (f23 * f12) + (f24 * f13) + (f26 * f14);
        return new C5421k(f7, f19, f17, f21, (f16 * f8) + (f18 * f9) + (f20 * f10), f22, (f6 * f26) + f25, (f8 * f23) + (f9 * f24) + (f10 * f26), f27);
    }

    /* renamed from: f */
    public void mo15703f(float[] fArr) {
        float[] fArr2 = fArr;
        float f = this.f15690a;
        float f2 = this.f15691b;
        float f3 = this.f15692c;
        float f4 = this.f15693d;
        float f5 = this.f15694e;
        float f6 = this.f15695f;
        float f7 = this.f15696g;
        float f8 = this.f15697h;
        float f9 = this.f15698i;
        int length = fArr2.length - 1;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr2[i];
            int i2 = i + 1;
            float f11 = fArr2[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr2[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr2[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
