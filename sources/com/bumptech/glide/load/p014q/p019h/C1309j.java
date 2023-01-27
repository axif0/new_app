package com.bumptech.glide.load.p014q.p019h;

import android.util.Log;
import com.bumptech.glide.load.C0997f;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.h.j */
public class C1309j implements C1004k<InputStream, C1297c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f4558a;

    /* renamed from: b */
    private final C1004k<ByteBuffer, C1297c> f4559b;

    /* renamed from: c */
    private final C1042b f4560c;

    public C1309j(List<ImageHeaderParser> list, C1004k<ByteBuffer, C1297c> kVar, C1042b bVar) {
        this.f4558a = list;
        this.f4559b = kVar;
        this.f4560c = bVar;
    }

    /* renamed from: e */
    private static byte[] m6544e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: c */
    public C1141v<C1297c> mo5158a(InputStream inputStream, int i, int i2, C1002i iVar) throws IOException {
        byte[] e = m6544e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f4559b.mo5158a(ByteBuffer.wrap(e), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo5159b(InputStream inputStream, C1002i iVar) throws IOException {
        return !((Boolean) iVar.mo5154c(C1308i.f4557b)).booleanValue() && C0997f.m5539b(this.f4558a, inputStream, this.f4560c) == ImageHeaderParser.ImageType.GIF;
    }
}
