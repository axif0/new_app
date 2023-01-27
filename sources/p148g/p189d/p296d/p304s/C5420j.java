package p148g.p189d.p296d.p304s;

import java.lang.reflect.Array;
import p148g.p189d.p296d.C5375g;
import p148g.p189d.p296d.C5377i;

/* renamed from: g.d.d.s.j */
public final class C5420j extends C5418h {

    /* renamed from: e */
    private C5412b f15689e;

    public C5420j(C5375g gVar) {
        super(gVar);
    }

    /* renamed from: h */
    private static int[][] m22344h(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = 8;
        int i8 = i4 - 8;
        int i9 = i3 - 8;
        int[] iArr = new int[2];
        iArr[1] = i5;
        iArr[0] = i6;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i10 = 0;
        while (i10 < i6) {
            int i11 = i10 << 3;
            if (i11 > i8) {
                i11 = i8;
            }
            int i12 = 0;
            while (i12 < i5) {
                int i13 = i12 << 3;
                if (i13 > i9) {
                    i13 = i9;
                }
                int i14 = (i11 * i3) + i13;
                byte b = 255;
                int i15 = 0;
                int i16 = 0;
                byte b2 = 0;
                while (i15 < i7) {
                    byte b3 = b2;
                    int i17 = 0;
                    while (i17 < i7) {
                        byte b4 = bArr[i14 + i17] & 255;
                        i16 += b4;
                        if (b4 < b) {
                            b = b4;
                        }
                        if (b4 > b3) {
                            b3 = b4;
                        }
                        i17++;
                        i7 = 8;
                    }
                    if (b3 - b <= 24) {
                        i15++;
                        i14 += i3;
                        b2 = b3;
                        i7 = 8;
                    }
                    while (true) {
                        i15++;
                        i14 += i3;
                        if (i15 >= 8) {
                            break;
                        }
                        int i18 = 0;
                        for (int i19 = 8; i18 < i19; i19 = 8) {
                            i16 += bArr[i14 + i18] & 255;
                            i18++;
                        }
                    }
                    i15++;
                    i14 += i3;
                    b2 = b3;
                    i7 = 8;
                }
                int i20 = i16 >> 6;
                if (b2 - b <= 24) {
                    i20 = b / 2;
                    if (i10 > 0 && i12 > 0) {
                        int i21 = i10 - 1;
                        int i22 = i12 - 1;
                        int i23 = ((iArr2[i21][i12] + (iArr2[i10][i22] * 2)) + iArr2[i21][i22]) / 4;
                        if (b < i23) {
                            i20 = i23;
                        }
                        iArr2[i10][i12] = i20;
                        i12++;
                        i7 = 8;
                    }
                }
                iArr2[i10][i12] = i20;
                i12++;
                i7 = 8;
            }
            i10++;
            i7 = 8;
        }
        return iArr2;
    }

    /* renamed from: i */
    private static void m22345i(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C5412b bVar) {
        int i5 = i;
        int i6 = i2;
        int i7 = i4 - 8;
        int i8 = i3 - 8;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = i9 << 3;
            int i11 = i10 > i7 ? i7 : i10;
            int j = m22346j(i9, i6 - 3);
            for (int i12 = 0; i12 < i5; i12++) {
                int i13 = i12 << 3;
                int i14 = i13 > i8 ? i8 : i13;
                int j2 = m22346j(i12, i5 - 3);
                int i15 = 0;
                for (int i16 = -2; i16 <= 2; i16++) {
                    int[] iArr2 = iArr[j + i16];
                    i15 += iArr2[j2 - 2] + iArr2[j2 - 1] + iArr2[j2] + iArr2[j2 + 1] + iArr2[2 + j2];
                }
                m22347k(bArr, i14, i11, i15 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: j */
    private static int m22346j(int i, int i2) {
        if (i < 2) {
            return 2;
        }
        return i > i2 ? i2 : i;
    }

    /* renamed from: k */
    private static void m22347k(byte[] bArr, int i, int i2, int i3, int i4, C5412b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo15675q(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    public C5412b mo15583a() throws C5377i {
        C5412b bVar;
        C5412b bVar2 = this.f15689e;
        if (bVar2 != null) {
            return bVar2;
        }
        C5375g d = mo15586d();
        int d2 = d.mo15599d();
        int a = d.mo15596a();
        if (d2 < 40 || a < 40) {
            bVar = super.mo15583a();
        } else {
            byte[] b = d.mo15597b();
            int i = d2 >> 3;
            if ((d2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] h = m22344h(b, i2, i4, d2, a);
            bVar = new C5412b(d2, a);
            m22345i(b, i2, i4, d2, a, h, bVar);
        }
        this.f15689e = bVar;
        return this.f15689e;
    }
}
