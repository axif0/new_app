package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p014q.p015d.C1267u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.f */
public final class C0997f {
    /* renamed from: a */
    public static int m5538a(List<ImageHeaderParser> list, InputStream inputStream, C1042b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1267u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int b = list.get(i).mo5141b(inputStream, bVar);
                if (b != -1) {
                    return b;
                }
                i++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static ImageHeaderParser.ImageType m5539b(List<ImageHeaderParser> list, InputStream inputStream, C1042b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1267u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                ImageHeaderParser.ImageType c = list.get(i).mo5142c(inputStream);
                if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c;
                }
                i++;
            } finally {
                inputStream.reset();
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public static ImageHeaderParser.ImageType m5540c(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = list.get(i).mo5140a(byteBuffer);
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
