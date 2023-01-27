package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.C2776t;

/* renamed from: com.squareup.picasso.l */
class C2763l extends C2732a<ImageView> {

    /* renamed from: m */
    C2752e f8822m;

    C2763l(C2776t tVar, ImageView imageView, C2789w wVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, C2752e eVar, boolean z) {
        super(tVar, imageView, wVar, i, i2, i3, drawable, str, obj, z);
        this.f8822m = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9982a() {
        super.mo9982a();
        if (this.f8822m != null) {
            this.f8822m = null;
        }
    }

    /* renamed from: b */
    public void mo9983b(Bitmap bitmap, C2776t.C2782e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f8721c.get();
            if (imageView != null) {
                C2776t tVar = this.f8719a;
                Bitmap bitmap2 = bitmap;
                C2776t.C2782e eVar2 = eVar;
                C2786u.m12243c(imageView, tVar.f8862e, bitmap2, eVar2, this.f8722d, tVar.f8870m);
                C2752e eVar3 = this.f8822m;
                if (eVar3 != null) {
                    eVar3.mo10046b();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: c */
    public void mo9984c(Exception exc) {
        ImageView imageView = (ImageView) this.f8721c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i = this.f8725g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable2 = this.f8726h;
                if (drawable2 != null) {
                    imageView.setImageDrawable(drawable2);
                }
            }
            C2752e eVar = this.f8822m;
            if (eVar != null) {
                eVar.mo10045a(exc);
            }
        }
    }
}
