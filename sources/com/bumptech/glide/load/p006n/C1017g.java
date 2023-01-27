package com.bumptech.glide.load.p006n;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.g */
public final class C1017g extends FilterInputStream {

    /* renamed from: h */
    private static final byte[] f3974h;

    /* renamed from: i */
    private static final int f3975i;

    /* renamed from: j */
    private static final int f3976j;

    /* renamed from: f */
    private final byte f3977f;

    /* renamed from: g */
    private int f3978g;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f3974h = bArr;
        int length = bArr.length;
        f3975i = length;
        f3976j = length + 2;
    }

    public C1017g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f3977f = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i;
        int i2 = this.f3978g;
        int read = (i2 < 2 || i2 > (i = f3976j)) ? super.read() : i2 == i ? this.f3977f : f3974h[i2 - 2] & 255;
        if (read != -1) {
            this.f3978g++;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f3978g;
        int i5 = f3976j;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f3977f;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f3974h, this.f3978g - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f3978g += i3;
        }
        return i3;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f3978g = (int) (((long) this.f3978g) + skip);
        }
        return skip;
    }
}
