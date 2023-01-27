package com.bumptech.glide.load.p014q.p017f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p008o.C1141v;

/* renamed from: com.bumptech.glide.load.q.f.c */
final class C1288c extends C1287b<Drawable> {
    private C1288c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: f */
    static C1141v<Drawable> m6456f(Drawable drawable) {
        if (drawable != null) {
            return new C1288c(drawable);
        }
        return null;
    }

    /* renamed from: b */
    public int mo5420b() {
        return Math.max(1, this.f4507f.getIntrinsicWidth() * this.f4507f.getIntrinsicHeight() * 4);
    }

    /* renamed from: c */
    public Class<Drawable> mo5421c() {
        return this.f4507f.getClass();
    }

    /* renamed from: d */
    public void mo5422d() {
    }
}
