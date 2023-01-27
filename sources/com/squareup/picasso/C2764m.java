package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: com.squareup.picasso.m */
public final class C2764m implements C2747d {

    /* renamed from: a */
    final LruCache<String, C2766b> f8823a;

    /* renamed from: com.squareup.picasso.m$a */
    class C2765a extends LruCache<String, C2766b> {
        C2765a(C2764m mVar, int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, C2766b bVar) {
            return bVar.f8825b;
        }
    }

    /* renamed from: com.squareup.picasso.m$b */
    static final class C2766b {

        /* renamed from: a */
        final Bitmap f8824a;

        /* renamed from: b */
        final int f8825b;

        C2766b(Bitmap bitmap, int i) {
            this.f8824a = bitmap;
            this.f8825b = i;
        }
    }

    public C2764m(int i) {
        this.f8823a = new C2765a(this, i);
    }

    public C2764m(Context context) {
        this(C2748d0.m12139b(context));
    }

    /* renamed from: a */
    public Bitmap mo10038a(String str) {
        C2766b bVar = this.f8823a.get(str);
        if (bVar != null) {
            return bVar.f8824a;
        }
        return null;
    }

    /* renamed from: b */
    public int mo10039b() {
        return this.f8823a.maxSize();
    }

    /* renamed from: c */
    public void mo10040c(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int i = C2748d0.m12146i(bitmap);
        if (i > mo10039b()) {
            this.f8823a.remove(str);
        } else {
            this.f8823a.put(str, new C2766b(bitmap, i));
        }
    }

    public int size() {
        return this.f8823a.size();
    }
}
