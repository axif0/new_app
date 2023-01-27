package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.n */
final class C2767n extends InputStream {

    /* renamed from: f */
    private final InputStream f8826f;

    /* renamed from: g */
    private long f8827g;

    /* renamed from: h */
    private long f8828h;

    /* renamed from: i */
    private long f8829i;

    /* renamed from: j */
    private long f8830j;

    /* renamed from: k */
    private boolean f8831k;

    /* renamed from: l */
    private int f8832l;

    C2767n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    C2767n(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    private C2767n(InputStream inputStream, int i, int i2) {
        this.f8830j = -1;
        this.f8831k = true;
        this.f8832l = -1;
        this.f8826f = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
        this.f8832l = i2;
    }

    /* renamed from: m */
    private void m12202m(long j) {
        try {
            if (this.f8828h >= this.f8827g || this.f8827g > this.f8829i) {
                this.f8828h = this.f8827g;
                this.f8826f.mark((int) (j - this.f8827g));
            } else {
                this.f8826f.reset();
                this.f8826f.mark((int) (j - this.f8828h));
                m12203o(this.f8828h, this.f8827g);
            }
            this.f8829i = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    /* renamed from: o */
    private void m12203o(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f8826f.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    /* renamed from: a */
    public void mo10077a(boolean z) {
        this.f8831k = z;
    }

    public int available() throws IOException {
        return this.f8826f.available();
    }

    public void close() throws IOException {
        this.f8826f.close();
    }

    /* renamed from: h */
    public void mo10080h(long j) throws IOException {
        if (this.f8827g > this.f8829i || j < this.f8828h) {
            throw new IOException("Cannot reset");
        }
        this.f8826f.reset();
        m12203o(this.f8828h, j);
        this.f8827g = j;
    }

    /* renamed from: j */
    public long mo10081j(int i) {
        long j = this.f8827g + ((long) i);
        if (this.f8829i < j) {
            m12202m(j);
        }
        return this.f8827g;
    }

    public void mark(int i) {
        this.f8830j = mo10081j(i);
    }

    public boolean markSupported() {
        return this.f8826f.markSupported();
    }

    public int read() throws IOException {
        if (!this.f8831k) {
            long j = this.f8829i;
            if (this.f8827g + 1 > j) {
                m12202m(j + ((long) this.f8832l));
            }
        }
        int read = this.f8826f.read();
        if (read != -1) {
            this.f8827g++;
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        if (!this.f8831k) {
            long j = this.f8827g;
            if (((long) bArr.length) + j > this.f8829i) {
                m12202m(j + ((long) bArr.length) + ((long) this.f8832l));
            }
        }
        int read = this.f8826f.read(bArr);
        if (read != -1) {
            this.f8827g += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f8831k) {
            long j = this.f8827g;
            long j2 = (long) i2;
            if (j + j2 > this.f8829i) {
                m12202m(j + j2 + ((long) this.f8832l));
            }
        }
        int read = this.f8826f.read(bArr, i, i2);
        if (read != -1) {
            this.f8827g += (long) read;
        }
        return read;
    }

    public void reset() throws IOException {
        mo10080h(this.f8830j);
    }

    public long skip(long j) throws IOException {
        if (!this.f8831k) {
            long j2 = this.f8827g;
            if (j2 + j > this.f8829i) {
                m12202m(j2 + j + ((long) this.f8832l));
            }
        }
        long skip = this.f8826f.skip(j);
        this.f8827g += skip;
        return skip;
    }
}
