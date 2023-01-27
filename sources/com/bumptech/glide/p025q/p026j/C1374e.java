package com.bumptech.glide.p025q.p026j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p025q.p027k.C1383b;

/* renamed from: com.bumptech.glide.q.j.e */
public abstract class C1374e<Z> extends C1378i<ImageView, Z> implements C1383b.C1384a {

    /* renamed from: l */
    private Animatable f4758l;

    public C1374e(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: p */
    private void m6889p(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f4758l = animatable;
            animatable.start();
            return;
        }
        this.f4758l = null;
    }

    /* renamed from: s */
    private void m6890s(Z z) {
        mo5839r(z);
        m6889p(z);
    }

    /* renamed from: a */
    public void mo5093a() {
        Animatable animatable = this.f4758l;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: c */
    public void mo5661c(Z z, C1383b<? super Z> bVar) {
        if (bVar == null || !bVar.mo5854a(z, this)) {
            m6890s(z);
        } else {
            m6889p(z);
        }
    }

    /* renamed from: d */
    public void mo5837d(Drawable drawable) {
        super.mo5837d(drawable);
        m6890s((Object) null);
        mo5846q(drawable);
    }

    /* renamed from: e */
    public void mo5094e() {
        Animatable animatable = this.f4758l;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: f */
    public void mo5838f(Drawable drawable) {
        super.mo5838f(drawable);
        m6890s((Object) null);
        mo5846q(drawable);
    }

    /* renamed from: h */
    public void mo5662h(Drawable drawable) {
        super.mo5662h(drawable);
        Animatable animatable = this.f4758l;
        if (animatable != null) {
            animatable.stop();
        }
        m6890s((Object) null);
        mo5846q(drawable);
    }

    /* renamed from: q */
    public void mo5846q(Drawable drawable) {
        ((ImageView) this.f4760f).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo5839r(Z z);
}
