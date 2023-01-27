package com.journeyapps.barcodescanner.p047o;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.C2692l;

/* renamed from: com.journeyapps.barcodescanner.o.i */
public class C2714i extends C2717l {

    /* renamed from: b */
    private static final String f8694b = "i";

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo9879c(C2692l lVar, C2692l lVar2) {
        if (lVar.f8612f <= 0 || lVar.f8613g <= 0) {
            return 0.0f;
        }
        C2692l i = lVar.mo9820i(lVar2);
        float f = (((float) i.f8612f) * 1.0f) / ((float) lVar.f8612f);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) lVar2.f8612f) * 1.0f) / ((float) i.f8612f)) * ((((float) lVar2.f8613g) * 1.0f) / ((float) i.f8613g));
        return f * (((1.0f / f2) / f2) / f2);
    }

    /* renamed from: d */
    public Rect mo9880d(C2692l lVar, C2692l lVar2) {
        C2692l i = lVar.mo9820i(lVar2);
        String str = f8694b;
        Log.i(str, "Preview: " + lVar + "; Scaled: " + i + "; Want: " + lVar2);
        int i2 = (i.f8612f - lVar2.f8612f) / 2;
        int i3 = (i.f8613g - lVar2.f8613g) / 2;
        return new Rect(-i2, -i3, i.f8612f - i2, i.f8613g - i3);
    }
}
