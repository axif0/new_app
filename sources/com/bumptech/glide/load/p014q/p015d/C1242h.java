package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.q.d.h */
public final class C1242h implements C1004k<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C1238d f4434a = new C1238d();

    /* renamed from: c */
    public C1141v<Bitmap> mo5158a(ByteBuffer byteBuffer, int i, int i2, C1002i iVar) throws IOException {
        return this.f4434a.mo5158a(ImageDecoder.createSource(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo5159b(ByteBuffer byteBuffer, C1002i iVar) throws IOException {
        return true;
    }
}
