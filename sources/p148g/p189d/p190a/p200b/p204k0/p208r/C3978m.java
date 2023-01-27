package p148g.p189d.p190a.p200b.p204k0.p208r;

import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.r.m */
final class C3978m {

    /* renamed from: a */
    public final int f12373a;

    /* renamed from: b */
    public final long[] f12374b;

    /* renamed from: c */
    public final int[] f12375c;

    /* renamed from: d */
    public final int f12376d;

    /* renamed from: e */
    public final long[] f12377e;

    /* renamed from: f */
    public final int[] f12378f;

    /* renamed from: g */
    public final long f12379g;

    public C3978m(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = true;
        C4260a.m18069a(iArr.length == jArr2.length);
        C4260a.m18069a(jArr.length == jArr2.length);
        C4260a.m18069a(iArr2.length != jArr2.length ? false : z);
        this.f12374b = jArr;
        this.f12375c = iArr;
        this.f12376d = i;
        this.f12377e = jArr2;
        this.f12378f = iArr2;
        this.f12379g = j;
        this.f12373a = jArr.length;
    }

    /* renamed from: a */
    public int mo12812a(long j) {
        for (int d = C4284w.m18238d(this.f12377e, j, true, false); d >= 0; d--) {
            if ((this.f12378f[d] & 1) != 0) {
                return d;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo12813b(long j) {
        for (int c = C4284w.m18237c(this.f12377e, j, true, false); c < this.f12377e.length; c++) {
            if ((this.f12378f[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }
}
