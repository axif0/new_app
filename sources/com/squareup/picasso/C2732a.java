package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.C2776t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
abstract class C2732a<T> {

    /* renamed from: a */
    final C2776t f8719a;

    /* renamed from: b */
    final C2789w f8720b;

    /* renamed from: c */
    final WeakReference<T> f8721c;

    /* renamed from: d */
    final boolean f8722d;

    /* renamed from: e */
    final int f8723e;

    /* renamed from: f */
    final int f8724f;

    /* renamed from: g */
    final int f8725g;

    /* renamed from: h */
    final Drawable f8726h;

    /* renamed from: i */
    final String f8727i;

    /* renamed from: j */
    final Object f8728j;

    /* renamed from: k */
    boolean f8729k;

    /* renamed from: l */
    boolean f8730l;

    /* renamed from: com.squareup.picasso.a$a */
    static class C2733a<M> extends WeakReference<M> {

        /* renamed from: a */
        final C2732a f8731a;

        C2733a(C2732a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f8731a = aVar;
        }
    }

    C2732a(C2776t tVar, T t, C2789w wVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.f8719a = tVar;
        this.f8720b = wVar;
        this.f8721c = t == null ? null : new C2733a(this, t, tVar.f8868k);
        this.f8723e = i;
        this.f8724f = i2;
        this.f8722d = z;
        this.f8725g = i3;
        this.f8726h = drawable;
        this.f8727i = str;
        this.f8728j = obj == null ? this : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9982a() {
        this.f8730l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo9983b(Bitmap bitmap, C2776t.C2782e eVar);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo9984c(Exception exc);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9985d() {
        return this.f8727i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9986e() {
        return this.f8723e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9987f() {
        return this.f8724f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2776t mo9988g() {
        return this.f8719a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2776t.C2783f mo9989h() {
        return this.f8720b.f8925t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2789w mo9990i() {
        return this.f8720b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Object mo9991j() {
        return this.f8728j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public T mo9992k() {
        WeakReference<T> weakReference = this.f8721c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo9993l() {
        return this.f8730l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9994m() {
        return this.f8729k;
    }
}
