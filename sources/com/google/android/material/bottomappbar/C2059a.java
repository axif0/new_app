package com.google.android.material.bottomappbar;

import p148g.p189d.p190a.p252d.p254b0.C4971f;
import p148g.p189d.p190a.p252d.p254b0.C4986m;

/* renamed from: com.google.android.material.bottomappbar.a */
public class C2059a extends C4971f implements Cloneable {

    /* renamed from: f */
    private float f6702f;

    /* renamed from: g */
    private float f6703g;

    /* renamed from: h */
    private float f6704h;

    /* renamed from: i */
    private float f6705i;

    /* renamed from: j */
    private float f6706j;

    /* renamed from: c */
    public void mo7637c(float f, float f2, float f3, C4986m mVar) {
        float f4 = f;
        C4986m mVar2 = mVar;
        float f5 = this.f6704h;
        if (f5 == 0.0f) {
            mVar2.mo15003m(f4, 0.0f);
            return;
        }
        float f6 = ((this.f6703g * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f6702f;
        float f8 = f2 + this.f6706j;
        float f9 = (this.f6705i * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar2.mo15003m(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        mVar2.mo15003m(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        mVar.mo14995a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.mo14995a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.mo14995a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        mVar2.mo15003m(f4, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo7638d() {
        return this.f6705i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo7639e() {
        return this.f6703g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo7640f() {
        return this.f6702f;
    }

    /* renamed from: g */
    public float mo7641g() {
        return this.f6704h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7642i(float f) {
        if (f >= 0.0f) {
            this.f6705i = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7643k(float f) {
        this.f6703g = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo7644l(float f) {
        this.f6702f = f;
    }

    /* renamed from: n */
    public void mo7645n(float f) {
        this.f6704h = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo7646p(float f) {
        this.f6706j = f;
    }
}
