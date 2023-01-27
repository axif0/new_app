package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p014q.p017f.C1289d;

/* renamed from: com.bumptech.glide.load.q.d.v */
public class C1269v implements C1004k<Uri, Bitmap> {

    /* renamed from: a */
    private final C1289d f4485a;

    /* renamed from: b */
    private final C1047e f4486b;

    public C1269v(C1289d dVar, C1047e eVar) {
        this.f4485a = dVar;
        this.f4486b = eVar;
    }

    /* renamed from: c */
    public C1141v<Bitmap> mo5158a(Uri uri, int i, int i2, C1002i iVar) {
        C1141v<Drawable> c = this.f4485a.mo5158a(uri, i, i2, iVar);
        if (c == null) {
            return null;
        }
        return C1259n.m6361a(this.f4486b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo5159b(Uri uri, C1002i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
