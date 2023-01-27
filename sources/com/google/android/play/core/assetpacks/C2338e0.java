package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.e0 */
final class C2338e0 extends InputStream {

    /* renamed from: f */
    private final InputStream f7738f;

    /* renamed from: g */
    private long f7739g;

    C2338e0(InputStream inputStream, long j) {
        this.f7738f = inputStream;
        this.f7739g = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f7738f.close();
        this.f7739g = 0;
    }

    public final int read() throws IOException {
        long j = this.f7739g;
        if (j <= 0) {
            return -1;
        }
        this.f7739g = j - 1;
        return this.f7738f.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f7739g;
        if (j <= 0) {
            return -1;
        }
        int read = this.f7738f.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f7739g -= (long) read;
        }
        return read;
    }
}
