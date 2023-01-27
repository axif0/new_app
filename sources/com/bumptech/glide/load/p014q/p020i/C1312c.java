package com.bumptech.glide.load.p014q.p020i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p014q.p015d.C1239e;
import com.bumptech.glide.load.p014q.p019h.C1297c;

/* renamed from: com.bumptech.glide.load.q.i.c */
public final class C1312c implements C1314e<Drawable, byte[]> {

    /* renamed from: a */
    private final C1047e f4564a;

    /* renamed from: b */
    private final C1314e<Bitmap, byte[]> f4565b;

    /* renamed from: c */
    private final C1314e<C1297c, byte[]> f4566c;

    public C1312c(C1047e eVar, C1314e<Bitmap, byte[]> eVar2, C1314e<C1297c, byte[]> eVar3) {
        this.f4564a = eVar;
        this.f4565b = eVar2;
        this.f4566c = eVar3;
    }

    /* renamed from: b */
    private static C1141v<C1297c> m6551b(C1141v<Drawable> vVar) {
        return vVar;
    }

    /* renamed from: a */
    public C1141v<byte[]> mo5671a(C1141v<Drawable> vVar, C1002i iVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f4565b.mo5671a(C1239e.m6273f(((BitmapDrawable) drawable).getBitmap(), this.f4564a), iVar);
        }
        if (!(drawable instanceof C1297c)) {
            return null;
        }
        C1314e<C1297c, byte[]> eVar = this.f4566c;
        m6551b(vVar);
        return eVar.mo5671a(vVar, iVar);
    }
}
