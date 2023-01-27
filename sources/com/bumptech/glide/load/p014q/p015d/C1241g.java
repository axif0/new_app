package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.p029s.C1388a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.q.d.g */
public class C1241g implements C1004k<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C1256m f4433a;

    public C1241g(C1256m mVar) {
        this.f4433a = mVar;
    }

    /* renamed from: c */
    public C1141v<Bitmap> mo5158a(ByteBuffer byteBuffer, int i, int i2, C1002i iVar) throws IOException {
        return this.f4433a.mo5562d(C1388a.m6943f(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo5159b(ByteBuffer byteBuffer, C1002i iVar) {
        return this.f4433a.mo5565n(byteBuffer);
    }
}
