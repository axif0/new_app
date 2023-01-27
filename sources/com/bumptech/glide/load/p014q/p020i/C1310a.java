package com.bumptech.glide.load.p014q.p020i;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p014q.p016e.C1285b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.q.i.a */
public class C1310a implements C1314e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f4561a;

    /* renamed from: b */
    private final int f4562b;

    public C1310a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C1310a(Bitmap.CompressFormat compressFormat, int i) {
        this.f4561a = compressFormat;
        this.f4562b = i;
    }

    /* renamed from: a */
    public C1141v<byte[]> mo5671a(C1141v<Bitmap> vVar, C1002i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f4561a, this.f4562b, byteArrayOutputStream);
        vVar.mo5422d();
        return new C1285b(byteArrayOutputStream.toByteArray());
    }
}
