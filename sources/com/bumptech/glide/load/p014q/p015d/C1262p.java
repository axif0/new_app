package com.bumptech.glide.load.p014q.p015d;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.q.d.p */
public final class C1262p implements ImageHeaderParser {
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo5140a(ByteBuffer byteBuffer) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public int mo5141b(InputStream inputStream, C1042b bVar) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    /* renamed from: c */
    public ImageHeaderParser.ImageType mo5142c(InputStream inputStream) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
