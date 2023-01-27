package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.l0 */
final class C2373l0 extends FilterInputStream {

    /* renamed from: f */
    private final C2428y1 f7843f = new C2428y1();

    /* renamed from: g */
    private byte[] f7844g = new byte[4096];

    /* renamed from: h */
    private long f7845h;

    /* renamed from: i */
    private boolean f7846i = false;

    /* renamed from: j */
    private boolean f7847j = false;

    C2373l0(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private final int m10915a(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* renamed from: j */
    private final boolean m10916j(int i) throws IOException {
        int a = m10915a(this.f7844g, 0, i);
        if (a != i) {
            int i2 = i - a;
            if (m10915a(this.f7844g, a, i2) != i2) {
                this.f7843f.mo9268b(this.f7844g, 0, a);
                return false;
            }
        }
        this.f7843f.mo9268b(this.f7844g, 0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C2405s2 mo9168h() throws IOException {
        byte[] bArr;
        if (this.f7845h > 0) {
            do {
                bArr = this.f7844g;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f7846i || this.f7847j) {
            return new C2405s2((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!m10916j(30)) {
            this.f7846i = true;
            return this.f7843f.mo9269c();
        }
        C2405s2 c = this.f7843f.mo9269c();
        if (c.mo9240h()) {
            this.f7847j = true;
            return c;
        } else if (c.mo9236e() != 4294967295L) {
            int d = this.f7843f.mo9270d() - 30;
            long j = (long) d;
            int length = this.f7844g.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f7844g = Arrays.copyOf(this.f7844g, length);
            }
            if (!m10916j(d)) {
                this.f7846i = true;
                return this.f7843f.mo9269c();
            }
            C2405s2 c2 = this.f7843f.mo9269c();
            this.f7845h = c2.mo9236e();
            return c2;
        } else {
            throw new C2411u0("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo9169m() {
        return this.f7846i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo9170o() {
        return this.f7847j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final long mo9171q() {
        return this.f7845h;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f7845h;
        if (j <= 0 || this.f7846i) {
            return -1;
        }
        int a = m10915a(bArr, i, (int) Math.min(j, (long) i2));
        this.f7845h -= (long) a;
        if (a != 0) {
            return a;
        }
        this.f7846i = true;
        return 0;
    }
}
