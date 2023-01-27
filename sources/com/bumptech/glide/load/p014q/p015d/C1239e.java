package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p008o.C1136r;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.p029s.C1401j;
import com.bumptech.glide.p029s.C1402k;

/* renamed from: com.bumptech.glide.load.q.d.e */
public class C1239e implements C1141v<Bitmap>, C1136r {

    /* renamed from: f */
    private final Bitmap f4431f;

    /* renamed from: g */
    private final C1047e f4432g;

    public C1239e(Bitmap bitmap, C1047e eVar) {
        C1401j.m6973e(bitmap, "Bitmap must not be null");
        this.f4431f = bitmap;
        C1401j.m6973e(eVar, "BitmapPool must not be null");
        this.f4432g = eVar;
    }

    /* renamed from: f */
    public static C1239e m6273f(Bitmap bitmap, C1047e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1239e(bitmap, eVar);
    }

    /* renamed from: a */
    public void mo5442a() {
        this.f4431f.prepareToDraw();
    }

    /* renamed from: b */
    public int mo5420b() {
        return C1402k.m6980g(this.f4431f);
    }

    /* renamed from: c */
    public Class<Bitmap> mo5421c() {
        return Bitmap.class;
    }

    /* renamed from: d */
    public void mo5422d() {
        this.f4432g.mo5249d(this.f4431f);
    }

    /* renamed from: e */
    public Bitmap get() {
        return this.f4431f;
    }
}
