package com.journeyapps.barcodescanner.p047o;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C2692l;

/* renamed from: com.journeyapps.barcodescanner.o.j */
public class C2715j extends C2717l {
    /* renamed from: e */
    private static float m12065e(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo9879c(C2692l lVar, C2692l lVar2) {
        int i = lVar.f8612f;
        if (i <= 0 || lVar.f8613g <= 0) {
            return 0.0f;
        }
        float e = (1.0f / m12065e((((float) i) * 1.0f) / ((float) lVar2.f8612f))) / m12065e((((float) lVar.f8613g) * 1.0f) / ((float) lVar2.f8613g));
        float e2 = m12065e(((((float) lVar.f8612f) * 1.0f) / ((float) lVar.f8613g)) / ((((float) lVar2.f8612f) * 1.0f) / ((float) lVar2.f8613g)));
        return e * (((1.0f / e2) / e2) / e2);
    }

    /* renamed from: d */
    public Rect mo9880d(C2692l lVar, C2692l lVar2) {
        return new Rect(0, 0, lVar2.f8612f, lVar2.f8613g);
    }
}
