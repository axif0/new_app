package p148g.p189d.p190a.p232c.p241f.p246e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.d.a.c.f.e.j */
final class C4433j extends FilterInputStream {

    /* renamed from: f */
    private long f13957f;

    /* renamed from: g */
    private long f13958g = -1;

    C4433j(InputStream inputStream, long j) {
        super(inputStream);
        C4428e.m18676a(inputStream);
        this.f13957f = 1048577;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f13957f);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f13958g = this.f13957f;
    }

    public final int read() throws IOException {
        if (this.f13957f == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f13957f--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f13957f;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f13957f -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f13958g != -1) {
            this.in.reset();
            this.f13957f = this.f13958g;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.f13957f));
        this.f13957f -= skip;
        return skip;
    }
}
