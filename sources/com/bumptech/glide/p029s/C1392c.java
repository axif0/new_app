package com.bumptech.glide.p029s;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.s.c */
public final class C1392c extends FilterInputStream {

    /* renamed from: f */
    private final long f4782f;

    /* renamed from: g */
    private int f4783g;

    private C1392c(InputStream inputStream, long j) {
        super(inputStream);
        this.f4782f = j;
    }

    /* renamed from: a */
    private int m6947a(int i) throws IOException {
        if (i >= 0) {
            this.f4783g += i;
        } else if (this.f4782f - ((long) this.f4783g) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f4782f + ", but read: " + this.f4783g);
        }
        return i;
    }

    /* renamed from: h */
    public static InputStream m6948h(InputStream inputStream, long j) {
        return new C1392c(inputStream, j);
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f4782f - ((long) this.f4783g), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m6947a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        m6947a(read);
        return read;
    }
}
