package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.assetpacks.x0 */
final class C2423x0 extends OutputStream {

    /* renamed from: f */
    private final C2428y1 f8032f = new C2428y1();

    /* renamed from: g */
    private final File f8033g;

    /* renamed from: h */
    private final C2380m2 f8034h;

    /* renamed from: i */
    private long f8035i;

    /* renamed from: j */
    private long f8036j;

    /* renamed from: k */
    private FileOutputStream f8037k;

    /* renamed from: l */
    private C2405s2 f8038l;

    C2423x0(File file, C2380m2 m2Var) {
        this.f8033g = file;
        this.f8034h = m2Var;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.f8035i == 0 && this.f8036j == 0) {
                int b = this.f8032f.mo9268b(bArr, i, i2);
                if (b != -1) {
                    i += b;
                    i2 -= b;
                    C2405s2 c = this.f8032f.mo9269c();
                    this.f8038l = c;
                    if (c.mo9240h()) {
                        this.f8035i = 0;
                        this.f8034h.mo9221k(this.f8038l.mo9242i(), this.f8038l.mo9242i().length);
                        this.f8036j = (long) this.f8038l.mo9242i().length;
                    } else if (!this.f8038l.mo9234c() || this.f8038l.mo9233b()) {
                        byte[] i4 = this.f8038l.mo9242i();
                        this.f8034h.mo9221k(i4, i4.length);
                        this.f8035i = this.f8038l.mo9236e();
                    } else {
                        this.f8034h.mo9216f(this.f8038l.mo9242i());
                        File file = new File(this.f8033g, this.f8038l.mo9235d());
                        file.getParentFile().mkdirs();
                        this.f8035i = this.f8038l.mo9236e();
                        this.f8037k = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f8038l.mo9233b()) {
                if (this.f8038l.mo9240h()) {
                    this.f8034h.mo9213c(this.f8036j, bArr, i, i2);
                    this.f8036j += (long) i2;
                    i3 = i2;
                } else if (this.f8038l.mo9234c()) {
                    i3 = (int) Math.min((long) i2, this.f8035i);
                    this.f8037k.write(bArr, i, i3);
                    long j = this.f8035i - ((long) i3);
                    this.f8035i = j;
                    if (j == 0) {
                        this.f8037k.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f8035i);
                    int length = this.f8038l.mo9242i().length;
                    this.f8034h.mo9213c((((long) length) + this.f8038l.mo9236e()) - this.f8035i, bArr, i, i3);
                    this.f8035i -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
