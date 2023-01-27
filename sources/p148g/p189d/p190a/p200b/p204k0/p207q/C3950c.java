package p148g.p189d.p190a.p200b.p204k0.p207q;

import android.util.Log;
import p148g.p189d.p190a.p200b.p204k0.C3921j;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3926m;
import p148g.p189d.p190a.p200b.p204k0.p207q.C3948b;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.q.c */
final class C3950c implements C3948b.C3949a {

    /* renamed from: a */
    private final long[] f12091a;

    /* renamed from: b */
    private final long[] f12092b;

    /* renamed from: c */
    private final long f12093c;

    private C3950c(long[] jArr, long[] jArr2, long j) {
        this.f12091a = jArr;
        this.f12092b = jArr2;
        this.f12093c = j;
    }

    /* renamed from: a */
    public static C3950c m16605a(long j, long j2, C3921j jVar, C4274m mVar) {
        int i;
        long j3 = j;
        C3921j jVar2 = jVar;
        C4274m mVar2 = mVar;
        mVar2.mo13455K(10);
        int i2 = mVar.mo13464i();
        if (i2 <= 0) {
            return null;
        }
        int i3 = jVar2.f11905d;
        long B = C4284w.m18229B((long) i2, 1000000 * ((long) (i3 >= 32000 ? 1152 : 576)), (long) i3);
        int D = mVar.mo13448D();
        int D2 = mVar.mo13448D();
        int D3 = mVar.mo13448D();
        mVar2.mo13455K(2);
        long j4 = j2 + ((long) jVar2.f11904c);
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long j5 = j2;
        int i4 = 0;
        while (i4 < D) {
            long j6 = B;
            jArr[i4] = (((long) i4) * B) / ((long) D);
            long j7 = j4;
            jArr2[i4] = Math.max(j5, j7);
            if (D3 == 1) {
                i = mVar.mo13479x();
            } else if (D3 == 2) {
                i = mVar.mo13448D();
            } else if (D3 == 3) {
                i = mVar.mo13445A();
            } else if (D3 != 4) {
                return null;
            } else {
                i = mVar.mo13446B();
            }
            j5 += (long) (i * D2);
            i4++;
            j4 = j7;
            B = j6;
        }
        long j8 = B;
        if (!(j3 == -1 || j3 == j5)) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new C3950c(jArr, jArr2, j8);
    }

    /* renamed from: e */
    public boolean mo12716e() {
        return true;
    }

    /* renamed from: f */
    public long mo12792f(long j) {
        return this.f12091a[C4284w.m18238d(this.f12092b, j, true, true)];
    }

    /* renamed from: g */
    public C3923l.C3924a mo12717g(long j) {
        int d = C4284w.m18238d(this.f12091a, j, true, true);
        C3926m mVar = new C3926m(this.f12091a[d], this.f12092b[d]);
        if (mVar.f11915a >= j || d == this.f12091a.length - 1) {
            return new C3923l.C3924a(mVar);
        }
        int i = d + 1;
        return new C3923l.C3924a(mVar, new C3926m(this.f12091a[i], this.f12092b[i]));
    }

    /* renamed from: i */
    public long mo12718i() {
        return this.f12093c;
    }
}
