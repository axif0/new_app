package com.flaviofaria.kenburnsview;

import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Random;

/* renamed from: com.flaviofaria.kenburnsview.c */
public class C1419c implements C1421e {

    /* renamed from: a */
    private final Random f4816a;

    /* renamed from: b */
    private long f4817b;

    /* renamed from: c */
    private Interpolator f4818c;

    /* renamed from: d */
    private C1420d f4819d;

    /* renamed from: e */
    private RectF f4820e;

    public C1419c() {
        this(10000, new AccelerateDecelerateInterpolator());
    }

    public C1419c(long j, Interpolator interpolator) {
        this.f4816a = new Random(System.currentTimeMillis());
        mo5928c(j);
        mo5929d(interpolator);
    }

    /* renamed from: b */
    private RectF m7033b(RectF rectF, RectF rectF2) {
        RectF rectF3 = C1418b.m7030a(rectF) > C1418b.m7030a(rectF2) ? new RectF(0.0f, 0.0f, (rectF.height() / rectF2.height()) * rectF2.width(), rectF.height()) : new RectF(0.0f, 0.0f, rectF.width(), (rectF.width() / rectF2.width()) * rectF2.height());
        float c = (C1418b.m7032c(this.f4816a.nextFloat(), 2) * 0.25f) + 0.75f;
        float width = rectF3.width() * c;
        float height = c * rectF3.height();
        int width2 = (int) (rectF.width() - width);
        int height2 = (int) (rectF.height() - height);
        int i = 0;
        int nextInt = width2 > 0 ? this.f4816a.nextInt(width2) : 0;
        if (height2 > 0) {
            i = this.f4816a.nextInt(height2);
        }
        float f = (float) nextInt;
        float f2 = (float) i;
        return new RectF(f, f2, width + f, height + f2);
    }

    /* renamed from: a */
    public C1420d mo5927a(RectF rectF, RectF rectF2) {
        boolean z;
        boolean z2 = true;
        RectF rectF3 = null;
        if (!(this.f4819d == null)) {
            rectF3 = this.f4819d.mo5930a();
            boolean b = true ^ C1418b.m7031b(rectF3, rectF2);
            z2 = !rectF.equals(this.f4820e);
            z = b;
        } else {
            z = true;
        }
        if (rectF3 == null || z2 || z) {
            rectF3 = m7033b(rectF, rectF2);
        }
        this.f4819d = new C1420d(rectF3, m7033b(rectF, rectF2), this.f4817b, this.f4818c);
        this.f4820e = new RectF(rectF);
        return this.f4819d;
    }

    /* renamed from: c */
    public void mo5928c(long j) {
        this.f4817b = j;
    }

    /* renamed from: d */
    public void mo5929d(Interpolator interpolator) {
        this.f4818c = interpolator;
    }
}
