package p148g.p189d.p190a.p200b.p204k0.p206p;

import java.io.IOException;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.p.e */
final class C3945e {

    /* renamed from: a */
    private final C4274m f12064a = new C4274m(8);

    /* renamed from: b */
    private int f12065b;

    /* renamed from: a */
    private long m16581a(C3916f fVar) throws IOException, InterruptedException {
        int i = 0;
        fVar.mo12727i(this.f12064a.f13643a, 0, 1);
        byte b = this.f12064a.f13643a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        fVar.mo12727i(this.f12064a.f13643a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f12064a.f13643a[i] & 255) + (i4 << 8);
        }
        this.f12065b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: b */
    public boolean mo12788b(C3916f fVar) throws IOException, InterruptedException {
        C3916f fVar2 = fVar;
        long d = fVar.mo12722d();
        long j = 1024;
        if (d != -1 && d <= 1024) {
            j = d;
        }
        int i = (int) j;
        fVar2.mo12727i(this.f12064a.f13643a, 0, 4);
        this.f12065b = 4;
        for (long z = this.f12064a.mo13481z(); z != 440786851; z = ((z << 8) & -256) | ((long) (this.f12064a.f13643a[0] & 255))) {
            int i2 = this.f12065b + 1;
            this.f12065b = i2;
            if (i2 == i) {
                return false;
            }
            fVar2.mo12727i(this.f12064a.f13643a, 0, 1);
        }
        long a = m16581a(fVar);
        long j2 = (long) this.f12065b;
        if (a == Long.MIN_VALUE) {
            return false;
        }
        if (d != -1 && j2 + a >= d) {
            return false;
        }
        while (true) {
            int i3 = this.f12065b;
            long j3 = j2 + a;
            if (((long) i3) >= j3) {
                return ((long) i3) == j3;
            }
            if (m16581a(fVar) == Long.MIN_VALUE) {
                return false;
            }
            long a2 = m16581a(fVar);
            if (a2 < 0 || a2 > 2147483647L) {
                return false;
            }
            if (a2 != 0) {
                fVar2.mo12728j((int) a2);
                this.f12065b = (int) (((long) this.f12065b) + a2);
            }
        }
        return false;
    }
}
