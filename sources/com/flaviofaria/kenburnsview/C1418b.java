package com.flaviofaria.kenburnsview;

import android.graphics.RectF;

/* renamed from: com.flaviofaria.kenburnsview.b */
public final class C1418b {
    /* renamed from: a */
    protected static float m7030a(RectF rectF) {
        return rectF.width() / rectF.height();
    }

    /* renamed from: b */
    protected static boolean m7031b(RectF rectF, RectF rectF2) {
        return Math.abs(m7032c(m7030a(rectF), 3) - m7032c(m7030a(rectF2), 3)) <= 0.01f;
    }

    /* renamed from: c */
    protected static float m7032c(float f, int i) {
        float pow = (float) Math.pow(10.0d, (double) i);
        return ((float) Math.round(f * pow)) / pow;
    }
}
