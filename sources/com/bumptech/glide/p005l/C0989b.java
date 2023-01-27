package com.bumptech.glide.p005l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.l.b */
class C0989b implements Closeable {

    /* renamed from: f */
    private final InputStream f3932f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Charset f3933g;

    /* renamed from: h */
    private byte[] f3934h;

    /* renamed from: i */
    private int f3935i;

    /* renamed from: j */
    private int f3936j;

    /* renamed from: com.bumptech.glide.l.b$a */
    class C0990a extends ByteArrayOutputStream {
        C0990a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C0989b.this.f3933g.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C0989b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C0991c.f3938a)) {
            this.f3932f = inputStream;
            this.f3933g = charset;
            this.f3934h = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public C0989b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: h */
    private void m5529h() throws IOException {
        InputStream inputStream = this.f3932f;
        byte[] bArr = this.f3934h;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f3935i = 0;
            this.f3936j = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f3932f) {
            if (this.f3934h != null) {
                this.f3934h = null;
                this.f3932f.close();
            }
        }
    }

    /* renamed from: j */
    public boolean mo5137j() {
        return this.f3936j == -1;
    }

    /* renamed from: m */
    public String mo5138m() throws IOException {
        int i;
        int i2;
        synchronized (this.f3932f) {
            if (this.f3934h != null) {
                if (this.f3935i >= this.f3936j) {
                    m5529h();
                }
                for (int i3 = this.f3935i; i3 != this.f3936j; i3++) {
                    if (this.f3934h[i3] == 10) {
                        if (i3 != this.f3935i) {
                            i2 = i3 - 1;
                            if (this.f3934h[i2] == 13) {
                                String str = new String(this.f3934h, this.f3935i, i2 - this.f3935i, this.f3933g.name());
                                this.f3935i = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f3934h, this.f3935i, i2 - this.f3935i, this.f3933g.name());
                        this.f3935i = i3 + 1;
                        return str2;
                    }
                }
                C0990a aVar = new C0990a((this.f3936j - this.f3935i) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f3934h, this.f3935i, this.f3936j - this.f3935i);
                    this.f3936j = -1;
                    m5529h();
                    i = this.f3935i;
                    while (true) {
                        if (i != this.f3936j) {
                            if (this.f3934h[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f3935i) {
                    aVar.write(this.f3934h, this.f3935i, i - this.f3935i);
                }
                this.f3935i = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
