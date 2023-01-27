package com.bumptech.glide.p029s;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.s.a */
public final class C1388a {

    /* renamed from: a */
    private static final AtomicReference<byte[]> f4775a = new AtomicReference<>();

    /* renamed from: com.bumptech.glide.s.a$a */
    private static class C1389a extends InputStream {

        /* renamed from: f */
        private final ByteBuffer f4776f;

        /* renamed from: g */
        private int f4777g = -1;

        C1389a(ByteBuffer byteBuffer) {
            this.f4776f = byteBuffer;
        }

        public int available() {
            return this.f4776f.remaining();
        }

        public synchronized void mark(int i) {
            this.f4777g = this.f4776f.position();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f4776f.hasRemaining()) {
                return -1;
            }
            return this.f4776f.get() & 255;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f4776f.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f4776f.get(bArr, i, min);
            return min;
        }

        public synchronized void reset() throws IOException {
            if (this.f4777g != -1) {
                this.f4776f.position(this.f4777g);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j) throws IOException {
            if (!this.f4776f.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.f4776f;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.s.a$b */
    static final class C1390b {

        /* renamed from: a */
        final int f4778a;

        /* renamed from: b */
        final int f4779b;

        /* renamed from: c */
        final byte[] f4780c;

        C1390b(byte[] bArr, int i, int i2) {
            this.f4780c = bArr;
            this.f4778a = i;
            this.f4779b = i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|(2:10|11)|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[SYNTHETIC, Splitter:B:25:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC, Splitter:B:29:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m6938a(java.io.File r8) throws java.io.IOException {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0045 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x003d
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0045 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r7.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r8
        L_0x0033:
            r8 = move-exception
            goto L_0x0047
        L_0x0035:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r8     // Catch:{ all -> 0x0045 }
        L_0x003d:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r8     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r8 = move-exception
            r7 = r0
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            if (r7 == 0) goto L_0x0053
            r7.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p029s.C1388a.m6938a(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: b */
    public static ByteBuffer m6939b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f4775a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                f4775a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    /* renamed from: c */
    private static C1390b m6940c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C1390b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static byte[] m6941d(ByteBuffer byteBuffer) {
        C1390b c = m6940c(byteBuffer);
        if (c != null && c.f4778a == 0 && c.f4779b == c.f4780c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|(2:6|7)|8|9|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[SYNTHETIC, Splitter:B:15:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6942e(java.nio.ByteBuffer r4, java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0027 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0025 }
            r1.write(r4)     // Catch:{ all -> 0x0025 }
            r1.force(r0)     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0029
        L_0x0027:
            r4 = move-exception
            r2 = r1
        L_0x0029:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p029s.C1388a.m6942e(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: f */
    public static InputStream m6943f(ByteBuffer byteBuffer) {
        return new C1389a(byteBuffer);
    }
}
