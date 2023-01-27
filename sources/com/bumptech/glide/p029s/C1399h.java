package com.bumptech.glide.p029s;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.s.h */
public class C1399h extends FilterInputStream {

    /* renamed from: f */
    private int f4794f = Integer.MIN_VALUE;

    public C1399h(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private long m6966a(long j) {
        int i = this.f4794f;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: h */
    private void m6967h(long j) {
        int i = this.f4794f;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f4794f = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f4794f;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f4794f = i;
    }

    public int read() throws IOException {
        if (m6966a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m6967h(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) m6966a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m6967h((long) read);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f4794f = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long a = m6966a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m6967h(skip);
        return skip;
    }
}
