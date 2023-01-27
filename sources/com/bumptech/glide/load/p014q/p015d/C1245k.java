package com.bumptech.glide.load.p014q.p015d;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.p029s.C1401j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.q.d.k */
public final class C1245k implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f4437a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f4438b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.q.d.k$a */
    private static final class C1246a implements C1248c {

        /* renamed from: a */
        private final ByteBuffer f4439a;

        C1246a(ByteBuffer byteBuffer) {
            this.f4439a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: c */
        public long mo5551c(long j) {
            int min = (int) Math.min((long) this.f4439a.remaining(), j);
            ByteBuffer byteBuffer = this.f4439a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        /* renamed from: d */
        public int mo5552d(byte[] bArr, int i) {
            int min = Math.min(i, this.f4439a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f4439a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: e */
        public short mo5553e() {
            return (short) (mo5555g() & 255);
        }

        /* renamed from: f */
        public int mo5554f() {
            return ((mo5555g() << 8) & 65280) | (mo5555g() & 255);
        }

        /* renamed from: g */
        public int mo5555g() {
            if (this.f4439a.remaining() < 1) {
                return -1;
            }
            return this.f4439a.get();
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.k$b */
    private static final class C1247b {

        /* renamed from: a */
        private final ByteBuffer f4440a;

        C1247b(byte[] bArr, int i) {
            this.f4440a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m6309c(int i, int i2) {
            return this.f4440a.remaining() - i >= i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public short mo5556a(int i) {
            if (m6309c(i, 2)) {
                return this.f4440a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5557b(int i) {
            if (m6309c(i, 4)) {
                return this.f4440a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo5558d() {
            return this.f4440a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5559e(ByteOrder byteOrder) {
            this.f4440a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.k$c */
    private interface C1248c {
        /* renamed from: c */
        long mo5551c(long j) throws IOException;

        /* renamed from: d */
        int mo5552d(byte[] bArr, int i) throws IOException;

        /* renamed from: e */
        short mo5553e() throws IOException;

        /* renamed from: f */
        int mo5554f() throws IOException;

        /* renamed from: g */
        int mo5555g() throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.q.d.k$d */
    private static final class C1249d implements C1248c {

        /* renamed from: a */
        private final InputStream f4441a;

        C1249d(InputStream inputStream) {
            this.f4441a = inputStream;
        }

        /* renamed from: c */
        public long mo5551c(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f4441a.skip(j2);
                if (skip <= 0) {
                    if (this.f4441a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: d */
        public int mo5552d(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f4441a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        /* renamed from: e */
        public short mo5553e() throws IOException {
            return (short) (this.f4441a.read() & 255);
        }

        /* renamed from: f */
        public int mo5554f() throws IOException {
            return ((this.f4441a.read() << 8) & 65280) | (this.f4441a.read() & 255);
        }

        /* renamed from: g */
        public int mo5555g() throws IOException {
            return this.f4441a.read();
        }
    }

    /* renamed from: d */
    private static int m6293d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m6294e(C1248c cVar, C1042b bVar) throws IOException {
        int f = cVar.mo5554f();
        if (!m6296g(f)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + f);
            }
            return -1;
        }
        int i = m6298i(cVar);
        if (i == -1) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) bVar.mo5228e(i, byte[].class);
        try {
            return m6300k(cVar, bArr, i);
        } finally {
            bVar.mo5227d(bArr);
        }
    }

    /* renamed from: f */
    private ImageHeaderParser.ImageType m6295f(C1248c cVar) throws IOException {
        int f = cVar.mo5554f();
        if (f == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int f2 = ((f << 16) & -65536) | (cVar.mo5554f() & 65535);
        if (f2 == -1991225785) {
            cVar.mo5551c(21);
            return cVar.mo5555g() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        } else if ((f2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        } else {
            if (f2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.mo5551c(4);
            if ((((cVar.mo5554f() << 16) & -65536) | (cVar.mo5554f() & 65535)) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int f3 = ((cVar.mo5554f() << 16) & -65536) | (cVar.mo5554f() & 65535);
            if ((f3 & -256) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = f3 & 255;
            if (i == 88) {
                cVar.mo5551c(4);
                return (cVar.mo5555g() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            } else if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            } else {
                cVar.mo5551c(4);
                return (cVar.mo5555g() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
        }
    }

    /* renamed from: g */
    private static boolean m6296g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: h */
    private boolean m6297h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f4437a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f4437a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private int m6298i(C1248c cVar) throws IOException {
        short e;
        int f;
        long j;
        long c;
        do {
            short e2 = cVar.mo5553e();
            if (e2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + e2);
                }
                return -1;
            }
            e = cVar.mo5553e();
            if (e == 218) {
                return -1;
            }
            if (e == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            f = cVar.mo5554f() - 2;
            if (e == 225) {
                return f;
            }
            j = (long) f;
            c = cVar.mo5551c(j);
        } while (c == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + e + ", wanted to skip: " + f + ", but actually skipped: " + c);
        }
        return -1;
    }

    /* renamed from: j */
    private static int m6299j(C1247b bVar) {
        ByteOrder byteOrder;
        String str;
        StringBuilder sb;
        String str2;
        short a = bVar.mo5556a(6);
        if (a != 18761) {
            if (a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.mo5559e(byteOrder);
        int b = bVar.mo5557b(10) + 6;
        short a2 = bVar.mo5556a(b);
        for (int i = 0; i < a2; i++) {
            int d = m6293d(b, i);
            short a3 = bVar.mo5556a(d);
            if (a3 == 274) {
                short a4 = bVar.mo5556a(d + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo5557b(d + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + a3 + " formatCode=" + a4 + " componentCount=" + b2);
                        }
                        int i2 = b2 + f4438b[a4];
                        if (i2 <= 4) {
                            int i3 = d + 8;
                            if (i3 < 0 || i3 > bVar.mo5558d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    str = "Illegal tagValueOffset=" + i3 + " tagType=" + a3;
                                    Log.d("DfltImageHeaderParser", str);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo5558d()) {
                                return bVar.mo5556a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append(a3);
                                    str = sb.toString();
                                    Log.d("DfltImageHeaderParser", str);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        str = "Negative tiff component count";
                        Log.d("DfltImageHeaderParser", str);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str2 = "Got invalid format code = ";
                }
                sb.append(str2);
                sb.append(a4);
                str = sb.toString();
                Log.d("DfltImageHeaderParser", str);
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m6300k(C1248c cVar, byte[] bArr, int i) throws IOException {
        int d = cVar.mo5552d(bArr, i);
        if (d != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + d);
            }
            return -1;
        } else if (m6297h(bArr, i)) {
            return m6299j(new C1247b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ImageHeaderParser.ImageType mo5140a(ByteBuffer byteBuffer) throws IOException {
        C1401j.m6972d(byteBuffer);
        return m6295f(new C1246a(byteBuffer));
    }

    /* renamed from: b */
    public int mo5141b(InputStream inputStream, C1042b bVar) throws IOException {
        C1401j.m6972d(inputStream);
        C1249d dVar = new C1249d(inputStream);
        C1401j.m6972d(bVar);
        return m6294e(dVar, bVar);
    }

    /* renamed from: c */
    public ImageHeaderParser.ImageType mo5142c(InputStream inputStream) throws IOException {
        C1401j.m6972d(inputStream);
        return m6295f(new C1249d(inputStream));
    }
}
