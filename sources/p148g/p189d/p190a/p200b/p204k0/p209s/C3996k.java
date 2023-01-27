package p148g.p189d.p190a.p200b.p204k0.p209s;

import android.util.Log;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.s.k */
final class C3996k {

    /* renamed from: g.d.a.b.k0.s.k$a */
    public static final class C3997a {
        public C3997a(int i, int i2, long[] jArr, int i3, boolean z) {
        }
    }

    /* renamed from: g.d.a.b.k0.s.k$b */
    public static final class C3998b {
        public C3998b(String str, String[] strArr, int i) {
        }
    }

    /* renamed from: g.d.a.b.k0.s.k$c */
    public static final class C3999c {

        /* renamed from: a */
        public final boolean f12448a;

        public C3999c(boolean z, int i, int i2, int i3) {
            this.f12448a = z;
        }
    }

    /* renamed from: g.d.a.b.k0.s.k$d */
    public static final class C4000d {

        /* renamed from: a */
        public final int f12449a;

        /* renamed from: b */
        public final long f12450b;

        /* renamed from: c */
        public final int f12451c;

        /* renamed from: d */
        public final int f12452d;

        /* renamed from: e */
        public final int f12453e;

        /* renamed from: f */
        public final byte[] f12454f;

        public C4000d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f12449a = i;
            this.f12450b = j2;
            this.f12451c = i3;
            this.f12452d = i5;
            this.f12453e = i6;
            this.f12454f = bArr;
        }
    }

    /* renamed from: a */
    public static int m16833a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    private static long m16834b(long j, long j2) {
        double d = (double) j2;
        Double.isNaN(d);
        return (long) Math.floor(Math.pow((double) j, 1.0d / d));
    }

    /* renamed from: c */
    private static C3997a m16835c(C3993i iVar) throws C4313u {
        if (iVar.mo12844d(24) == 5653314) {
            int d = iVar.mo12844d(16);
            int d2 = iVar.mo12844d(24);
            long[] jArr = new long[d2];
            boolean c = iVar.mo12843c();
            long j = 0;
            if (!c) {
                boolean c2 = iVar.mo12843c();
                for (int i = 0; i < d2; i++) {
                    if (!c2) {
                        jArr[i] = (long) (iVar.mo12844d(5) + 1);
                    } else if (iVar.mo12843c()) {
                        jArr[i] = (long) (iVar.mo12844d(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int d3 = iVar.mo12844d(5) + 1;
                int i2 = 0;
                while (i2 < d2) {
                    int d4 = iVar.mo12844d(m16833a(d2 - i2));
                    for (int i3 = 0; i3 < d4 && i2 < d2; i3++) {
                        jArr[i2] = (long) d3;
                        i2++;
                    }
                    d3++;
                }
            }
            int d5 = iVar.mo12844d(4);
            if (d5 <= 2) {
                if (d5 == 1 || d5 == 2) {
                    iVar.mo12845e(32);
                    iVar.mo12845e(32);
                    int d6 = iVar.mo12844d(4) + 1;
                    iVar.mo12845e(1);
                    if (d5 != 1) {
                        j = (long) (d2 * d);
                    } else if (d != 0) {
                        j = m16834b((long) d2, (long) d);
                    }
                    iVar.mo12845e((int) (j * ((long) d6)));
                }
                return new C3997a(d, d2, jArr, d5, c);
            }
            throw new C4313u("lookup type greater than 2 not decodable: " + d5);
        }
        throw new C4313u("expected code book to start with [0x56, 0x43, 0x42] at " + iVar.mo12842b());
    }

    /* renamed from: d */
    private static void m16836d(C3993i iVar) throws C4313u {
        int d = iVar.mo12844d(6) + 1;
        for (int i = 0; i < d; i++) {
            int d2 = iVar.mo12844d(16);
            if (d2 == 0) {
                iVar.mo12845e(8);
                iVar.mo12845e(16);
                iVar.mo12845e(16);
                iVar.mo12845e(6);
                iVar.mo12845e(8);
                int d3 = iVar.mo12844d(4) + 1;
                for (int i2 = 0; i2 < d3; i2++) {
                    iVar.mo12845e(8);
                }
            } else if (d2 == 1) {
                int d4 = iVar.mo12844d(5);
                int i3 = -1;
                int[] iArr = new int[d4];
                for (int i4 = 0; i4 < d4; i4++) {
                    iArr[i4] = iVar.mo12844d(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = iVar.mo12844d(3) + 1;
                    int d5 = iVar.mo12844d(2);
                    if (d5 > 0) {
                        iVar.mo12845e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d5); i7++) {
                        iVar.mo12845e(8);
                    }
                }
                iVar.mo12845e(2);
                int d6 = iVar.mo12844d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        iVar.mo12845e(d6);
                        i9++;
                    }
                }
            } else {
                throw new C4313u("floor type greater than 1 not decodable: " + d2);
            }
        }
    }

    /* renamed from: e */
    private static void m16837e(int i, C3993i iVar) throws C4313u {
        int d = iVar.mo12844d(6) + 1;
        for (int i2 = 0; i2 < d; i2++) {
            int d2 = iVar.mo12844d(16);
            if (d2 != 0) {
                Log.e("VorbisUtil", "mapping type other than 0 not supported: " + d2);
            } else {
                int d3 = iVar.mo12843c() ? iVar.mo12844d(4) + 1 : 1;
                if (iVar.mo12843c()) {
                    int d4 = iVar.mo12844d(8) + 1;
                    for (int i3 = 0; i3 < d4; i3++) {
                        int i4 = i - 1;
                        iVar.mo12845e(m16833a(i4));
                        iVar.mo12845e(m16833a(i4));
                    }
                }
                if (iVar.mo12844d(2) == 0) {
                    if (d3 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            iVar.mo12845e(4);
                        }
                    }
                    for (int i6 = 0; i6 < d3; i6++) {
                        iVar.mo12845e(8);
                        iVar.mo12845e(8);
                        iVar.mo12845e(8);
                    }
                } else {
                    throw new C4313u("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: f */
    private static C3999c[] m16838f(C3993i iVar) {
        int d = iVar.mo12844d(6) + 1;
        C3999c[] cVarArr = new C3999c[d];
        for (int i = 0; i < d; i++) {
            cVarArr[i] = new C3999c(iVar.mo12843c(), iVar.mo12844d(16), iVar.mo12844d(16), iVar.mo12844d(8));
        }
        return cVarArr;
    }

    /* renamed from: g */
    private static void m16839g(C3993i iVar) throws C4313u {
        int d = iVar.mo12844d(6) + 1;
        int i = 0;
        while (i < d) {
            if (iVar.mo12844d(16) <= 2) {
                iVar.mo12845e(24);
                iVar.mo12845e(24);
                iVar.mo12845e(24);
                int d2 = iVar.mo12844d(6) + 1;
                iVar.mo12845e(8);
                int[] iArr = new int[d2];
                for (int i2 = 0; i2 < d2; i2++) {
                    iArr[i2] = ((iVar.mo12843c() ? iVar.mo12844d(5) : 0) * 8) + iVar.mo12844d(3);
                }
                for (int i3 = 0; i3 < d2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            iVar.mo12845e(8);
                        }
                    }
                }
                i++;
            } else {
                throw new C4313u("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: h */
    public static C3998b m16840h(C4274m mVar) throws C4313u {
        m16843k(3, mVar, false);
        String u = mVar.mo13476u((int) mVar.mo13469n());
        int length = 11 + u.length();
        long n = mVar.mo13469n();
        String[] strArr = new String[((int) n)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < n; i2++) {
            strArr[i2] = mVar.mo13476u((int) mVar.mo13469n());
            i = i + 4 + strArr[i2].length();
        }
        if ((mVar.mo13479x() & 1) != 0) {
            return new C3998b(u, strArr, i + 1);
        }
        throw new C4313u("framing bit expected to be set");
    }

    /* renamed from: i */
    public static C4000d m16841i(C4274m mVar) throws C4313u {
        C4274m mVar2 = mVar;
        m16843k(1, mVar2, false);
        long n = mVar.mo13469n();
        int x = mVar.mo13479x();
        long n2 = mVar.mo13469n();
        int l = mVar.mo13467l();
        int l2 = mVar.mo13467l();
        int l3 = mVar.mo13467l();
        int x2 = mVar.mo13479x();
        return new C4000d(n, x, n2, l, l2, l3, (int) Math.pow(2.0d, (double) (x2 & 15)), (int) Math.pow(2.0d, (double) ((x2 & 240) >> 4)), (mVar.mo13479x() & 1) > 0, Arrays.copyOf(mVar2.f13643a, mVar.mo13459d()));
    }

    /* renamed from: j */
    public static C3999c[] m16842j(C4274m mVar, int i) throws C4313u {
        int i2 = 0;
        m16843k(5, mVar, false);
        int x = mVar.mo13479x() + 1;
        C3993i iVar = new C3993i(mVar.f13643a);
        iVar.mo12845e(mVar.mo13458c() * 8);
        for (int i3 = 0; i3 < x; i3++) {
            m16835c(iVar);
        }
        int d = iVar.mo12844d(6) + 1;
        while (i2 < d) {
            if (iVar.mo12844d(16) == 0) {
                i2++;
            } else {
                throw new C4313u("placeholder of time domain transforms not zeroed out");
            }
        }
        m16836d(iVar);
        m16839g(iVar);
        m16837e(i, iVar);
        C3999c[] f = m16838f(iVar);
        if (iVar.mo12843c()) {
            return f;
        }
        throw new C4313u("framing bit after modes not set as expected");
    }

    /* renamed from: k */
    public static boolean m16843k(int i, C4274m mVar, boolean z) throws C4313u {
        if (mVar.mo13456a() < 7) {
            if (z) {
                return false;
            }
            throw new C4313u("too short header: " + mVar.mo13456a());
        } else if (mVar.mo13479x() != i) {
            if (z) {
                return false;
            }
            throw new C4313u("expected header type " + Integer.toHexString(i));
        } else if (mVar.mo13479x() == 118 && mVar.mo13479x() == 111 && mVar.mo13479x() == 114 && mVar.mo13479x() == 98 && mVar.mo13479x() == 105 && mVar.mo13479x() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C4313u("expected characters 'vorbis'");
        }
    }
}
