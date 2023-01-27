package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.p029s.C1402k;

/* renamed from: com.bumptech.glide.load.q.d.y */
public final class C1274y implements C1004k<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.q.d.y$a */
    private static final class C1275a implements C1141v<Bitmap> {

        /* renamed from: f */
        private final Bitmap f4495f;

        C1275a(Bitmap bitmap) {
            this.f4495f = bitmap;
        }

        /* renamed from: a */
        public Bitmap get() {
            return this.f4495f;
        }

        /* renamed from: b */
        public int mo5420b() {
            return C1402k.m6980g(this.f4495f);
        }

        /* renamed from: c */
        public Class<Bitmap> mo5421c() {
            return Bitmap.class;
        }

        /* renamed from: d */
        public void mo5422d() {
        }
    }

    /* renamed from: c */
    public C1141v<Bitmap> mo5158a(Bitmap bitmap, int i, int i2, C1002i iVar) {
        return new C1275a(bitmap);
    }

    /* renamed from: d */
    public boolean mo5159b(Bitmap bitmap, C1002i iVar) {
        return true;
    }
}
