package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C0994c;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1005l;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.q.d.b */
public class C1236b implements C1005l<BitmapDrawable> {

    /* renamed from: a */
    private final C1047e f4425a;

    /* renamed from: b */
    private final C1005l<Bitmap> f4426b;

    public C1236b(C1047e eVar, C1005l<Bitmap> lVar) {
        this.f4425a = eVar;
        this.f4426b = lVar;
    }

    /* renamed from: b */
    public C0994c mo5160b(C1002i iVar) {
        return this.f4426b.mo5160b(iVar);
    }

    /* renamed from: c */
    public boolean mo5144a(C1141v<BitmapDrawable> vVar, File file, C1002i iVar) {
        return this.f4426b.mo5144a(new C1239e(vVar.get().getBitmap(), this.f4425a), file, iVar);
    }
}
