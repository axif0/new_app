package com.bumptech.glide.load;

import com.bumptech.glide.load.p008o.p009a0.C1042b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: f */
        private final boolean f3939f;

        private ImageType(boolean z) {
            this.f3939f = z;
        }

        public boolean hasAlpha() {
            return this.f3939f;
        }
    }

    /* renamed from: a */
    ImageType mo5140a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: b */
    int mo5141b(InputStream inputStream, C1042b bVar) throws IOException;

    /* renamed from: c */
    ImageType mo5142c(InputStream inputStream) throws IOException;
}
