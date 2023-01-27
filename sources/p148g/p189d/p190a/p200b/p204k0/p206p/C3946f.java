package p148g.p189d.p190a.p200b.p204k0.p206p;

import java.io.IOException;
import p148g.p189d.p190a.p200b.p204k0.C3916f;

/* renamed from: g.d.a.b.k0.p.f */
final class C3946f {

    /* renamed from: d */
    private static final long[] f12066d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f12067a = new byte[8];

    /* renamed from: b */
    private int f12068b;

    /* renamed from: c */
    private int f12069c;

    /* renamed from: a */
    public static long m16583a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f12066d[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m16584c(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f12066d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: b */
    public int mo12789b() {
        return this.f12069c;
    }

    /* renamed from: d */
    public long mo12790d(C3916f fVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f12068b == 0) {
            if (!fVar.mo12721c(this.f12067a, 0, 1, z)) {
                return -1;
            }
            int c = m16584c(this.f12067a[0] & 255);
            this.f12069c = c;
            if (c != -1) {
                this.f12068b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f12069c;
        if (i2 > i) {
            this.f12068b = 0;
            return -2;
        }
        if (i2 != 1) {
            fVar.readFully(this.f12067a, 1, i2 - 1);
        }
        this.f12068b = 0;
        return m16583a(this.f12067a, this.f12069c, z2);
    }

    /* renamed from: e */
    public void mo12791e() {
        this.f12068b = 0;
        this.f12069c = 0;
    }
}
