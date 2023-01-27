package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p014q.p015d.C1256m;
import com.bumptech.glide.p029s.C1393d;
import com.bumptech.glide.p029s.C1399h;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.q.d.w */
public class C1270w implements C1004k<InputStream, Bitmap> {

    /* renamed from: a */
    private final C1256m f4487a;

    /* renamed from: b */
    private final C1042b f4488b;

    /* renamed from: com.bumptech.glide.load.q.d.w$a */
    static class C1271a implements C1256m.C1258b {

        /* renamed from: a */
        private final C1267u f4489a;

        /* renamed from: b */
        private final C1393d f4490b;

        C1271a(C1267u uVar, C1393d dVar) {
            this.f4489a = uVar;
            this.f4490b = dVar;
        }

        /* renamed from: a */
        public void mo5566a(C1047e eVar, Bitmap bitmap) throws IOException {
            IOException a = this.f4490b.mo5875a();
            if (a != null) {
                if (bitmap != null) {
                    eVar.mo5249d(bitmap);
                }
                throw a;
            }
        }

        /* renamed from: b */
        public void mo5567b() {
            this.f4489a.mo5576h();
        }
    }

    public C1270w(C1256m mVar, C1042b bVar) {
        this.f4487a = mVar;
        this.f4488b = bVar;
    }

    /* renamed from: c */
    public C1141v<Bitmap> mo5158a(InputStream inputStream, int i, int i2, C1002i iVar) throws IOException {
        C1267u uVar;
        boolean z;
        if (inputStream instanceof C1267u) {
            uVar = (C1267u) inputStream;
            z = false;
        } else {
            uVar = new C1267u(inputStream, this.f4488b);
            z = true;
        }
        C1393d h = C1393d.m6949h(uVar);
        try {
            return this.f4487a.mo5563e(new C1399h(h), i, i2, iVar, new C1271a(uVar, h));
        } finally {
            h.mo5878j();
            if (z) {
                uVar.mo5577j();
            }
        }
    }

    /* renamed from: d */
    public boolean mo5159b(InputStream inputStream, C1002i iVar) {
        return this.f4487a.mo5564m(inputStream);
    }
}
