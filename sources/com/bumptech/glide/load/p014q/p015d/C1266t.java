package com.bumptech.glide.load.p014q.p015d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.p008o.C1136r;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.p029s.C1401j;

/* renamed from: com.bumptech.glide.load.q.d.t */
public final class C1266t implements C1141v<BitmapDrawable>, C1136r {

    /* renamed from: f */
    private final Resources f4477f;

    /* renamed from: g */
    private final C1141v<Bitmap> f4478g;

    private C1266t(Resources resources, C1141v<Bitmap> vVar) {
        C1401j.m6972d(resources);
        this.f4477f = resources;
        C1401j.m6972d(vVar);
        this.f4478g = vVar;
    }

    /* renamed from: f */
    public static C1141v<BitmapDrawable> m6382f(Resources resources, C1141v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new C1266t(resources, vVar);
    }

    /* renamed from: a */
    public void mo5442a() {
        C1141v<Bitmap> vVar = this.f4478g;
        if (vVar instanceof C1136r) {
            ((C1136r) vVar).mo5442a();
        }
    }

    /* renamed from: b */
    public int mo5420b() {
        return this.f4478g.mo5420b();
    }

    /* renamed from: c */
    public Class<BitmapDrawable> mo5421c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public void mo5422d() {
        this.f4478g.mo5422d();
    }

    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f4477f, this.f4478g.get());
    }
}
