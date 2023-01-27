package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.p029s.C1388a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.q.d.s */
public final class C1265s implements C1004k<InputStream, Bitmap> {

    /* renamed from: a */
    private final C1238d f4476a = new C1238d();

    /* renamed from: c */
    public C1141v<Bitmap> mo5158a(InputStream inputStream, int i, int i2, C1002i iVar) throws IOException {
        return this.f4476a.mo5158a(ImageDecoder.createSource(C1388a.m6939b(inputStream)), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo5159b(InputStream inputStream, C1002i iVar) throws IOException {
        return true;
    }
}
