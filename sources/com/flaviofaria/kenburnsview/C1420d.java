package com.flaviofaria.kenburnsview;

import android.graphics.RectF;
import android.view.animation.Interpolator;

/* renamed from: com.flaviofaria.kenburnsview.d */
public class C1420d {

    /* renamed from: a */
    private RectF f4821a;

    /* renamed from: b */
    private RectF f4822b;

    /* renamed from: c */
    private final RectF f4823c = new RectF();

    /* renamed from: d */
    private float f4824d;

    /* renamed from: e */
    private float f4825e;

    /* renamed from: f */
    private float f4826f;

    /* renamed from: g */
    private float f4827g;

    /* renamed from: h */
    private long f4828h;

    /* renamed from: i */
    private Interpolator f4829i;

    public C1420d(RectF rectF, RectF rectF2, long j, Interpolator interpolator) {
        if (C1418b.m7031b(rectF, rectF2)) {
            this.f4821a = rectF;
            this.f4822b = rectF2;
            this.f4828h = j;
            this.f4829i = interpolator;
            this.f4824d = rectF2.width() - rectF.width();
            this.f4825e = rectF2.height() - rectF.height();
            this.f4826f = rectF2.centerX() - rectF.centerX();
            this.f4827g = rectF2.centerY() - rectF.centerY();
            return;
        }
        throw new C1417a();
    }

    /* renamed from: a */
    public RectF mo5930a() {
        return this.f4822b;
    }

    /* renamed from: b */
    public long mo5931b() {
        return this.f4828h;
    }

    /* renamed from: c */
    public RectF mo5932c(long j) {
        float interpolation = this.f4829i.getInterpolation(Math.min(((float) j) / ((float) this.f4828h), 1.0f));
        float width = this.f4821a.width() + (this.f4824d * interpolation);
        float height = this.f4821a.height() + (this.f4825e * interpolation);
        float centerX = (this.f4821a.centerX() + (this.f4826f * interpolation)) - (width / 2.0f);
        float centerY = (this.f4821a.centerY() + (interpolation * this.f4827g)) - (height / 2.0f);
        this.f4823c.set(centerX, centerY, width + centerX, height + centerY);
        return this.f4823c;
    }
}
