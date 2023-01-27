package com.bumptech.glide.load.p014q.p015d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.o */
public class C1261o implements C1006m<Drawable> {

    /* renamed from: b */
    private final C1006m<Bitmap> f4466b;

    /* renamed from: c */
    private final boolean f4467c;

    public C1261o(C1006m<Bitmap> mVar, boolean z) {
        this.f4466b = mVar;
        this.f4467c = z;
    }

    /* renamed from: d */
    private C1141v<Drawable> m6364d(Context context, C1141v<Bitmap> vVar) {
        return C1266t.m6382f(context.getResources(), vVar);
    }

    /* renamed from: a */
    public C1141v<Drawable> mo5161a(Context context, C1141v<Drawable> vVar, int i, int i2) {
        C1047e f = C0963b.m5388c(context).mo5039f();
        Drawable drawable = vVar.get();
        C1141v<Bitmap> a = C1259n.m6361a(f, drawable, i, i2);
        if (a != null) {
            C1141v<Bitmap> a2 = this.f4466b.mo5161a(context, a, i, i2);
            if (!a2.equals(a)) {
                return m6364d(context, a2);
            }
            a2.mo5422d();
            return vVar;
        } else if (!this.f4467c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        this.f4466b.mo5145b(messageDigest);
    }

    /* renamed from: c */
    public C1006m<BitmapDrawable> mo5568c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1261o) {
            return this.f4466b.equals(((C1261o) obj).f4466b);
        }
        return false;
    }

    public int hashCode() {
        return this.f4466b.hashCode();
    }
}
