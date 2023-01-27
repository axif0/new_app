package com.bumptech.glide.load.p014q.p015d;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C0999h;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.z */
public class C1276z<T> implements C1004k<T, Bitmap> {

    /* renamed from: d */
    public static final C0999h<Long> f4496d = C0999h.m5542a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1277a());

    /* renamed from: e */
    public static final C0999h<Integer> f4497e = C0999h.m5542a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1278b());

    /* renamed from: f */
    private static final C1280d f4498f = new C1280d();

    /* renamed from: a */
    private final C1281e<T> f4499a;

    /* renamed from: b */
    private final C1047e f4500b;

    /* renamed from: c */
    private final C1280d f4501c;

    /* renamed from: com.bumptech.glide.load.q.d.z$a */
    class C1277a implements C0999h.C1001b<Long> {

        /* renamed from: a */
        private final ByteBuffer f4502a = ByteBuffer.allocate(8);

        C1277a() {
        }

        /* renamed from: b */
        public void mo5153a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f4502a) {
                this.f4502a.position(0);
                messageDigest.update(this.f4502a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.z$b */
    class C1278b implements C0999h.C1001b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f4503a = ByteBuffer.allocate(4);

        C1278b() {
        }

        /* renamed from: b */
        public void mo5153a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f4503a) {
                    this.f4503a.position(0);
                    messageDigest.update(this.f4503a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.z$c */
    private static final class C1279c implements C1281e<AssetFileDescriptor> {
        private C1279c() {
        }

        /* synthetic */ C1279c(C1277a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo5599a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.z$d */
    static class C1280d {
        C1280d() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo5601a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.z$e */
    interface C1281e<T> {
        /* renamed from: a */
        void mo5599a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.q.d.z$f */
    static final class C1282f implements C1281e<ParcelFileDescriptor> {
        C1282f() {
        }

        /* renamed from: b */
        public void mo5599a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C1276z(C1047e eVar, C1281e<T> eVar2) {
        this(eVar, eVar2, f4498f);
    }

    C1276z(C1047e eVar, C1281e<T> eVar2, C1280d dVar) {
        this.f4500b = eVar;
        this.f4499a = eVar2;
        this.f4501c = dVar;
    }

    /* renamed from: c */
    public static C1004k<AssetFileDescriptor, Bitmap> m6422c(C1047e eVar) {
        return new C1276z(eVar, new C1279c((C1277a) null));
    }

    /* renamed from: d */
    private static Bitmap m6423d(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C1250l lVar) {
        Bitmap f = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || lVar == C1250l.f4445d) ? null : m6425f(mediaMetadataRetriever, j, i, i2, i3, lVar);
        return f == null ? m6424e(mediaMetadataRetriever, j, i) : f;
    }

    /* renamed from: e */
    private static Bitmap m6424e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* renamed from: f */
    private static Bitmap m6425f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C1250l lVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = lVar.mo5561b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    /* renamed from: g */
    public static C1004k<ParcelFileDescriptor, Bitmap> m6426g(C1047e eVar) {
        return new C1276z(eVar, new C1282f());
    }

    /* renamed from: a */
    public C1141v<Bitmap> mo5158a(T t, int i, int i2, C1002i iVar) throws IOException {
        long longValue = ((Long) iVar.mo5154c(f4496d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.mo5154c(f4497e);
            if (num == null) {
                num = 2;
            }
            C1250l lVar = (C1250l) iVar.mo5154c(C1250l.f4447f);
            if (lVar == null) {
                lVar = C1250l.f4446e;
            }
            C1250l lVar2 = lVar;
            MediaMetadataRetriever a = this.f4501c.mo5601a();
            try {
                this.f4499a.mo5599a(a, t);
                Bitmap d = m6423d(a, longValue, num.intValue(), i, i2, lVar2);
                a.release();
                return C1239e.m6273f(d, this.f4500b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    /* renamed from: b */
    public boolean mo5159b(T t, C1002i iVar) {
        return true;
    }
}
