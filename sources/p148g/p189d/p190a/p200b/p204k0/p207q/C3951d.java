package p148g.p189d.p190a.p200b.p204k0.p207q;

import android.util.Log;
import p148g.p189d.p190a.p200b.p204k0.C3921j;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3926m;
import p148g.p189d.p190a.p200b.p204k0.p207q.C3948b;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.q.d */
final class C3951d implements C3948b.C3949a {

    /* renamed from: a */
    private final long f12094a;

    /* renamed from: b */
    private final int f12095b;

    /* renamed from: c */
    private final long f12096c;

    /* renamed from: d */
    private final long f12097d;

    /* renamed from: e */
    private final long[] f12098e;

    private C3951d(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    private C3951d(long j, int i, long j2, long j3, long[] jArr) {
        this.f12094a = j;
        this.f12095b = i;
        this.f12096c = j2;
        this.f12097d = j3;
        this.f12098e = jArr;
    }

    /* renamed from: a */
    public static C3951d m16610a(long j, long j2, C3921j jVar, C4274m mVar) {
        int B;
        long j3 = j;
        C3921j jVar2 = jVar;
        int i = jVar2.f11908g;
        int i2 = jVar2.f11905d;
        int i3 = mVar.mo13464i();
        if ((i3 & 1) != 1 || (B = mVar.mo13446B()) == 0) {
            return null;
        }
        long B2 = C4284w.m18229B((long) B, ((long) i) * 1000000, (long) i2);
        if ((i3 & 6) != 6) {
            return new C3951d(j2, jVar2.f11904c, B2);
        }
        long B3 = (long) mVar.mo13446B();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = (long) mVar.mo13479x();
        }
        if (j3 != -1) {
            long j4 = j2 + B3;
            if (j3 != j4) {
                Log.w("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new C3951d(j2, jVar2.f11904c, B2, B3, jArr);
    }

    /* renamed from: b */
    private long m16611b(int i) {
        return (this.f12096c * ((long) i)) / 100;
    }

    /* renamed from: e */
    public boolean mo12716e() {
        return this.f12098e != null;
    }

    /* renamed from: f */
    public long mo12792f(long j) {
        double d;
        long j2 = j - this.f12094a;
        if (!mo12716e() || j2 <= ((long) this.f12095b)) {
            return 0;
        }
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = (double) this.f12097d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int d5 = C4284w.m18238d(this.f12098e, (long) d4, true, true);
        long b = m16611b(d5);
        long j3 = this.f12098e[d5];
        int i = d5 + 1;
        long b2 = m16611b(i);
        long j4 = d5 == 99 ? 256 : this.f12098e[i];
        if (j3 == j4) {
            d = 0.0d;
        } else {
            double d6 = (double) j3;
            Double.isNaN(d6);
            double d7 = (double) (j4 - j3);
            Double.isNaN(d7);
            d = (d4 - d6) / d7;
        }
        double d8 = (double) (b2 - b);
        Double.isNaN(d8);
        return b + Math.round(d * d8);
    }

    /* renamed from: g */
    public C3923l.C3924a mo12717g(long j) {
        if (!mo12716e()) {
            return new C3923l.C3924a(new C3926m(0, this.f12094a + ((long) this.f12095b)));
        }
        long j2 = C4284w.m18244j(j, 0, this.f12096c);
        double d = (double) j2;
        Double.isNaN(d);
        double d2 = (double) this.f12096c;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                long[] jArr = this.f12098e;
                double d5 = (double) jArr[i];
                double d6 = i == 99 ? 256.0d : (double) jArr[i + 1];
                double d7 = (double) i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = (double) this.f12097d;
        Double.isNaN(d8);
        return new C3923l.C3924a(new C3926m(j2, this.f12094a + C4284w.m18244j(Math.round((d4 / 256.0d) * d8), (long) this.f12095b, this.f12097d - 1)));
    }

    /* renamed from: i */
    public long mo12718i() {
        return this.f12096c;
    }
}
