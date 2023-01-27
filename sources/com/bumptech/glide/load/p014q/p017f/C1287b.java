package com.bumptech.glide.load.p014q.p017f;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p008o.C1136r;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p014q.p019h.C1297c;
import com.bumptech.glide.p029s.C1401j;

/* renamed from: com.bumptech.glide.load.q.f.b */
public abstract class C1287b<T extends Drawable> implements C1141v<T>, C1136r {

    /* renamed from: f */
    protected final T f4507f;

    public C1287b(T t) {
        C1401j.m6972d(t);
        this.f4507f = (Drawable) t;
    }

    /* renamed from: a */
    public void mo5442a() {
        Bitmap e;
        T t = this.f4507f;
        if (t instanceof BitmapDrawable) {
            e = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof C1297c) {
            e = ((C1297c) t).mo5627e();
        } else {
            return;
        }
        e.prepareToDraw();
    }

    /* renamed from: e */
    public final T get() {
        Drawable.ConstantState constantState = this.f4507f.getConstantState();
        return constantState == null ? this.f4507f : constantState.newDrawable();
    }
}
