package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: com.google.android.play.core.assetpacks.x1 */
public final class C2424x1 extends InputStream {

    /* renamed from: f */
    private final Enumeration<File> f8039f;

    /* renamed from: g */
    private InputStream f8040g;

    public C2424x1(Enumeration<File> enumeration) throws IOException {
        this.f8039f = enumeration;
        mo9261a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9261a() throws IOException {
        InputStream inputStream = this.f8040g;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f8040g = this.f8039f.hasMoreElements() ? new FileInputStream(this.f8039f.nextElement()) : null;
    }

    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f8040g;
        if (inputStream != null) {
            inputStream.close();
            this.f8040g = null;
        }
    }

    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f8040g;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo9261a();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f8040g == null) {
            return -1;
        }
        if (bArr == null) {
            throw null;
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f8040g.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo9261a();
            } while (this.f8040g != null);
            return -1;
        }
    }
}
