package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.helper.Validate;

public final class ConstrainableInputStream extends BufferedInputStream {

    /* renamed from: f */
    private final boolean f18065f;

    /* renamed from: g */
    private final int f18066g;

    /* renamed from: h */
    private long f18067h;

    /* renamed from: i */
    private long f18068i = 0;

    /* renamed from: j */
    private int f18069j;

    /* renamed from: k */
    private boolean f18070k;

    private ConstrainableInputStream(InputStream inputStream, int i, int i2) {
        super(inputStream, i);
        boolean z = true;
        Validate.isTrue(i2 >= 0);
        this.f18066g = i2;
        this.f18069j = i2;
        this.f18065f = i2 == 0 ? false : z;
        this.f18067h = System.nanoTime();
    }

    /* renamed from: a */
    private boolean m26276a() {
        return this.f18068i != 0 && System.nanoTime() - this.f18067h > this.f18068i;
    }

    public static ConstrainableInputStream wrap(InputStream inputStream, int i, int i2) {
        return inputStream instanceof ConstrainableInputStream ? (ConstrainableInputStream) inputStream : new ConstrainableInputStream(inputStream, i, i2);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f18070k || (this.f18065f && this.f18069j <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.f18070k = true;
            return -1;
        } else if (!m26276a()) {
            if (this.f18065f && i2 > (i3 = this.f18069j)) {
                i2 = i3;
            }
            try {
                int read = super.read(bArr, i, i2);
                this.f18069j -= read;
                return read;
            } catch (SocketTimeoutException unused) {
                return 0;
            }
        } else {
            throw new SocketTimeoutException("Read timeout");
        }
    }

    public ByteBuffer readToByteBuffer(int i) throws IOException {
        boolean z = true;
        Validate.isTrue(i >= 0, "maxSize must be 0 (unlimited) or larger");
        if (i <= 0) {
            z = false;
        }
        int i2 = 32768;
        if (z && i < 32768) {
            i2 = i;
        }
        byte[] bArr = new byte[i2];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        while (true) {
            int read = read(bArr);
            if (read == -1) {
                break;
            }
            if (z) {
                if (read >= i) {
                    byteArrayOutputStream.write(bArr, 0, i);
                    break;
                }
                i -= read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    public void reset() throws IOException {
        super.reset();
        this.f18069j = this.f18066g - this.markpos;
    }

    public ConstrainableInputStream timeout(long j, long j2) {
        this.f18067h = j;
        this.f18068i = j2 * 1000000;
        return this;
    }
}
