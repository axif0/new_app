package com.bumptech.glide.p025q.p026j;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p025q.C1361c;
import com.bumptech.glide.p029s.C1402k;

/* renamed from: com.bumptech.glide.q.j.c */
public abstract class C1372c<T> implements C1377h<T> {

    /* renamed from: f */
    private final int f4755f;

    /* renamed from: g */
    private final int f4756g;

    /* renamed from: h */
    private C1361c f4757h;

    public C1372c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C1372c(int i, int i2) {
        if (C1402k.m6991r(i, i2)) {
            this.f4755f = i;
            this.f4756g = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    /* renamed from: a */
    public void mo5093a() {
    }

    /* renamed from: b */
    public final void mo5841b(C1376g gVar) {
    }

    /* renamed from: d */
    public void mo5837d(Drawable drawable) {
    }

    /* renamed from: e */
    public void mo5094e() {
    }

    /* renamed from: f */
    public void mo5838f(Drawable drawable) {
    }

    /* renamed from: g */
    public final C1361c mo5842g() {
        return this.f4757h;
    }

    /* renamed from: i */
    public final void mo5843i(C1376g gVar) {
        gVar.mo5835d(this.f4755f, this.f4756g);
    }

    /* renamed from: j */
    public final void mo5844j(C1361c cVar) {
        this.f4757h = cVar;
    }

    /* renamed from: k */
    public void mo5095k() {
    }
}
