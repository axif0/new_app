package com.bumptech.glide.load.p014q.p019h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C0993b;
import com.bumptech.glide.load.C0997f;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p014q.C1234c;
import com.bumptech.glide.p021m.C1318a;
import com.bumptech.glide.p021m.C1321c;
import com.bumptech.glide.p021m.C1322d;
import com.bumptech.glide.p021m.C1323e;
import com.bumptech.glide.p029s.C1397f;
import com.bumptech.glide.p029s.C1402k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.q.h.a */
public class C1293a implements C1004k<ByteBuffer, C1297c> {

    /* renamed from: f */
    private static final C1294a f4509f = new C1294a();

    /* renamed from: g */
    private static final C1295b f4510g = new C1295b();

    /* renamed from: a */
    private final Context f4511a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f4512b;

    /* renamed from: c */
    private final C1295b f4513c;

    /* renamed from: d */
    private final C1294a f4514d;

    /* renamed from: e */
    private final C1296b f4515e;

    /* renamed from: com.bumptech.glide.load.q.h.a$a */
    static class C1294a {
        C1294a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1318a mo5615a(C1318a.C1319a aVar, C1321c cVar, ByteBuffer byteBuffer, int i) {
            return new C1323e(aVar, cVar, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.q.h.a$b */
    static class C1295b {

        /* renamed from: a */
        private final Queue<C1322d> f4516a = C1402k.m6978e(0);

        C1295b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C1322d mo5616a(ByteBuffer byteBuffer) {
            C1322d poll;
            poll = this.f4516a.poll();
            if (poll == null) {
                poll = new C1322d();
            }
            poll.mo5692p(byteBuffer);
            return poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo5617b(C1322d dVar) {
            dVar.mo5690a();
            this.f4516a.offer(dVar);
        }
    }

    public C1293a(Context context, List<ImageHeaderParser> list, C1047e eVar, C1042b bVar) {
        this(context, list, eVar, bVar, f4510g, f4509f);
    }

    C1293a(Context context, List<ImageHeaderParser> list, C1047e eVar, C1042b bVar, C1295b bVar2, C1294a aVar) {
        this.f4511a = context.getApplicationContext();
        this.f4512b = list;
        this.f4514d = aVar;
        this.f4515e = new C1296b(eVar, bVar);
        this.f4513c = bVar2;
    }

    /* renamed from: c */
    private C1300e m6476c(ByteBuffer byteBuffer, int i, int i2, C1322d dVar, C1002i iVar) {
        long b = C1397f.m6956b();
        try {
            C1321c c = dVar.mo5691c();
            if (c.mo5687b() > 0) {
                if (c.mo5688c() == 0) {
                    Bitmap.Config config = iVar.mo5154c(C1308i.f4556a) == C0993b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    C1318a a = this.f4514d.mo5615a(this.f4515e, c, byteBuffer, m6477e(c, i, i2));
                    a.mo5683g(config);
                    a.mo5678c();
                    Bitmap b2 = a.mo5677b();
                    if (b2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1397f.m6955a(b));
                        }
                        return null;
                    }
                    C1300e eVar = new C1300e(new C1297c(this.f4511a, a, C1234c.m6260c(), i, i2, b2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1397f.m6955a(b));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1397f.m6955a(b));
            }
        }
    }

    /* renamed from: e */
    private static int m6477e(C1321c cVar, int i, int i2) {
        int min = Math.min(cVar.mo5686a() / i2, cVar.mo5689d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.mo5689d() + "x" + cVar.mo5686a() + "]");
        }
        return max;
    }

    /* renamed from: d */
    public C1300e mo5158a(ByteBuffer byteBuffer, int i, int i2, C1002i iVar) {
        C1322d a = this.f4513c.mo5616a(byteBuffer);
        try {
            return m6476c(byteBuffer, i, i2, a, iVar);
        } finally {
            this.f4513c.mo5617b(a);
        }
    }

    /* renamed from: f */
    public boolean mo5159b(ByteBuffer byteBuffer, C1002i iVar) throws IOException {
        return !((Boolean) iVar.mo5154c(C1308i.f4557b)).booleanValue() && C0997f.m5540c(this.f4512b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
