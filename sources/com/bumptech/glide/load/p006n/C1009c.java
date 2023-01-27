package com.bumptech.glide.load.p006n;

import com.bumptech.glide.load.p008o.p009a0.C1042b;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.n.c */
public final class C1009c extends OutputStream {

    /* renamed from: f */
    private final OutputStream f3967f;

    /* renamed from: g */
    private byte[] f3968g;

    /* renamed from: h */
    private C1042b f3969h;

    /* renamed from: i */
    private int f3970i;

    public C1009c(OutputStream outputStream, C1042b bVar) {
        this(outputStream, bVar, 65536);
    }

    C1009c(OutputStream outputStream, C1042b bVar, int i) {
        this.f3967f = outputStream;
        this.f3969h = bVar;
        this.f3968g = (byte[]) bVar.mo5228e(i, byte[].class);
    }

    /* renamed from: a */
    private void m5570a() throws IOException {
        int i = this.f3970i;
        if (i > 0) {
            this.f3967f.write(this.f3968g, 0, i);
            this.f3970i = 0;
        }
    }

    /* renamed from: h */
    private void m5571h() throws IOException {
        if (this.f3970i == this.f3968g.length) {
            m5570a();
        }
    }

    /* renamed from: j */
    private void m5572j() {
        byte[] bArr = this.f3968g;
        if (bArr != null) {
            this.f3969h.mo5227d(bArr);
            this.f3968g = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f3967f.close();
            m5572j();
        } catch (Throwable th) {
            this.f3967f.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        m5570a();
        this.f3967f.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f3968g;
        int i2 = this.f3970i;
        this.f3970i = i2 + 1;
        bArr[i2] = (byte) i;
        m5571h();
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f3970i != 0 || i4 < this.f3968g.length) {
                int min = Math.min(i4, this.f3968g.length - this.f3970i);
                System.arraycopy(bArr, i5, this.f3968g, this.f3970i, min);
                this.f3970i += min;
                i3 += min;
                m5571h();
            } else {
                this.f3967f.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
