package com.bumptech.glide.load.p014q;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.C0993b;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1003j;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p014q.p015d.C1250l;
import com.bumptech.glide.load.p014q.p015d.C1256m;
import com.bumptech.glide.load.p014q.p015d.C1264r;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.q.a */
public abstract class C1230a<T> implements C1004k<ImageDecoder.Source, T> {

    /* renamed from: a */
    final C1264r f4413a = C1264r.m6373a();

    /* renamed from: com.bumptech.glide.load.q.a$a */
    class C1231a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f4414a;

        /* renamed from: b */
        final /* synthetic */ int f4415b;

        /* renamed from: c */
        final /* synthetic */ boolean f4416c;

        /* renamed from: d */
        final /* synthetic */ C0993b f4417d;

        /* renamed from: e */
        final /* synthetic */ C1250l f4418e;

        /* renamed from: f */
        final /* synthetic */ C1003j f4419f;

        /* renamed from: com.bumptech.glide.load.q.a$a$a */
        class C1232a implements ImageDecoder.OnPartialImageListener {
            C1232a(C1231a aVar) {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C1231a(int i, int i2, boolean z, C0993b bVar, C1250l lVar, C1003j jVar) {
            this.f4414a = i;
            this.f4415b = i2;
            this.f4416c = z;
            this.f4417d = bVar;
            this.f4418e = lVar;
            this.f4419f = jVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (C1230a.this.f4413a.mo5569c(this.f4414a, this.f4415b, this.f4416c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f4417d == C0993b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C1232a(this));
            Size size = imageInfo.getSize();
            int i = this.f4414a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f4415b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f4418e.mo5561b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f4419f == C1003j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i3 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C1141v<T> mo5538c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    /* renamed from: d */
    public final C1141v<T> mo5158a(ImageDecoder.Source source, int i, int i2, C1002i iVar) throws IOException {
        return mo5538c(source, i, i2, new C1231a(i, i2, iVar.mo5154c(C1256m.f4455i) != null && ((Boolean) iVar.mo5154c(C1256m.f4455i)).booleanValue(), (C0993b) iVar.mo5154c(C1256m.f4452f), (C1250l) iVar.mo5154c(C1250l.f4447f), (C1003j) iVar.mo5154c(C1256m.f4453g)));
    }

    /* renamed from: e */
    public final boolean mo5159b(ImageDecoder.Source source, C1002i iVar) {
        return true;
    }
}
