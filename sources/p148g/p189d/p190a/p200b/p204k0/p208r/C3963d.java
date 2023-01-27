package p148g.p189d.p190a.p200b.p204k0.p208r;

import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.r.d */
final class C3963d {

    /* renamed from: g.d.a.b.k0.r.d$b */
    public static final class C3965b {

        /* renamed from: a */
        public final long[] f12231a;

        /* renamed from: b */
        public final int[] f12232b;

        /* renamed from: c */
        public final int f12233c;

        /* renamed from: d */
        public final long[] f12234d;

        /* renamed from: e */
        public final int[] f12235e;

        /* renamed from: f */
        public final long f12236f;

        private C3965b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f12231a = jArr;
            this.f12232b = iArr;
            this.f12233c = i;
            this.f12234d = jArr2;
            this.f12235e = iArr2;
            this.f12236f = j;
        }
    }

    /* renamed from: a */
    public static C3965b m16658a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int e : iArr2) {
            i3 += C4284w.m18239e(e, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        return new C3965b(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
    }
}
