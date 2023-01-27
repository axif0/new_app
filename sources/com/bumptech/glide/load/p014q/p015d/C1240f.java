package com.bumptech.glide.load.p014q.p015d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.p029s.C1402k;

/* renamed from: com.bumptech.glide.load.q.d.f */
public abstract class C1240f implements C1006m<Bitmap> {
    /* renamed from: a */
    public final C1141v<Bitmap> mo5161a(Context context, C1141v<Bitmap> vVar, int i, int i2) {
        if (C1402k.m6991r(i, i2)) {
            C1047e f = C0963b.m5388c(context).mo5039f();
            Bitmap bitmap = vVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo5546c(f, bitmap, i, i2);
            return bitmap.equals(c) ? vVar : C1239e.m6273f(c, f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Bitmap mo5546c(C1047e eVar, Bitmap bitmap, int i, int i2);
}
