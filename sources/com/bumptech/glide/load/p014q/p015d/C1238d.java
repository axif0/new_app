package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p008o.p009a0.C1048f;
import com.bumptech.glide.load.p014q.C1230a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.q.d.d */
public final class C1238d extends C1230a<Bitmap> {

    /* renamed from: b */
    private final C1047e f4430b = new C1048f();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1141v<Bitmap> mo5538c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C1239e(decodeBitmap, this.f4430b);
    }
}
