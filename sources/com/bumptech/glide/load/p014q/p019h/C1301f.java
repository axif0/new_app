package com.bumptech.glide.load.p014q.p019h;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p014q.p015d.C1239e;
import com.bumptech.glide.p029s.C1401j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.h.f */
public class C1301f implements C1006m<C1297c> {

    /* renamed from: b */
    private final C1006m<Bitmap> f4531b;

    public C1301f(C1006m<Bitmap> mVar) {
        C1401j.m6972d(mVar);
        this.f4531b = mVar;
    }

    /* renamed from: a */
    public C1141v<C1297c> mo5161a(Context context, C1141v<C1297c> vVar, int i, int i2) {
        C1297c cVar = vVar.get();
        C1239e eVar = new C1239e(cVar.mo5627e(), C0963b.m5388c(context).mo5039f());
        C1141v<Bitmap> a = this.f4531b.mo5161a(context, eVar, i, i2);
        if (!eVar.equals(a)) {
            eVar.mo5422d();
        }
        cVar.mo5637m(this.f4531b, a.get());
        return vVar;
    }

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        this.f4531b.mo5145b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1301f) {
            return this.f4531b.equals(((C1301f) obj).f4531b);
        }
        return false;
    }

    public int hashCode() {
        return this.f4531b.hashCode();
    }
}
