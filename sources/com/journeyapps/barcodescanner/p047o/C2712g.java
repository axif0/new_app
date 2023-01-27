package com.journeyapps.barcodescanner.p047o;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.C2692l;

/* renamed from: com.journeyapps.barcodescanner.o.g */
public class C2712g extends C2717l {

    /* renamed from: b */
    private static final String f8690b = "g";

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo9879c(C2692l lVar, C2692l lVar2) {
        if (lVar.f8612f <= 0 || lVar.f8613g <= 0) {
            return 0.0f;
        }
        C2692l h = lVar.mo9818h(lVar2);
        float f = (((float) h.f8612f) * 1.0f) / ((float) lVar.f8612f);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) h.f8612f) * 1.0f) / ((float) lVar2.f8612f)) + ((((float) h.f8613g) * 1.0f) / ((float) lVar2.f8613g));
        return f * ((1.0f / f2) / f2);
    }

    /* renamed from: d */
    public Rect mo9880d(C2692l lVar, C2692l lVar2) {
        C2692l h = lVar.mo9818h(lVar2);
        String str = f8690b;
        Log.i(str, "Preview: " + lVar + "; Scaled: " + h + "; Want: " + lVar2);
        int i = (h.f8612f - lVar2.f8612f) / 2;
        int i2 = (h.f8613g - lVar2.f8613g) / 2;
        return new Rect(-i, -i2, h.f8612f - i, h.f8613g - i2);
    }
}
