package com.bumptech.glide.load.p014q.p015d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.p029s.C1401j;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.q.d.a */
public class C1235a<DataType> implements C1004k<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C1004k<DataType, Bitmap> f4423a;

    /* renamed from: b */
    private final Resources f4424b;

    public C1235a(Resources resources, C1004k<DataType, Bitmap> kVar) {
        C1401j.m6972d(resources);
        this.f4424b = resources;
        C1401j.m6972d(kVar);
        this.f4423a = kVar;
    }

    /* renamed from: a */
    public C1141v<BitmapDrawable> mo5158a(DataType datatype, int i, int i2, C1002i iVar) throws IOException {
        return C1266t.m6382f(this.f4424b, this.f4423a.mo5158a(datatype, i, i2, iVar));
    }

    /* renamed from: b */
    public boolean mo5159b(DataType datatype, C1002i iVar) throws IOException {
        return this.f4423a.mo5159b(datatype, iVar);
    }
}
