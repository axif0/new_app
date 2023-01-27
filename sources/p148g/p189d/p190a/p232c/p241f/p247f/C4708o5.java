package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;

/* renamed from: g.d.a.c.f.f.o5 */
final class C4708o5 {
    /* renamed from: a */
    static int m20034a(int i, byte[] bArr, int i2, int i3, C4756r5 r5Var) throws C4636k7 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m20044k(bArr, i2, r5Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m20042i(bArr, i2, r5Var) + r5Var.f14444a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m20042i(bArr, i2, r5Var);
                    i6 = r5Var.f14444a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m20034a(i6, bArr, i2, i3, r5Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C4636k7.m19827e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C4636k7.m19825c();
            }
        } else {
            throw C4636k7.m19825c();
        }
    }

    /* renamed from: b */
    static int m20035b(int i, byte[] bArr, int i2, int i3, C4581h7<?> h7Var, C4756r5 r5Var) {
        C4488c7 c7Var = (C4488c7) h7Var;
        int i4 = m20042i(bArr, i2, r5Var);
        while (true) {
            c7Var.mo13886h(r5Var.f14444a);
            if (i4 >= i3) {
                break;
            }
            int i5 = m20042i(bArr, i4, r5Var);
            if (i != r5Var.f14444a) {
                break;
            }
            i4 = m20042i(bArr, i5, r5Var);
        }
        return i4;
    }

    /* renamed from: c */
    static int m20036c(int i, byte[] bArr, int i2, int i3, C4827v9 v9Var, C4756r5 r5Var) throws C4636k7 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int k = m20044k(bArr, i2, r5Var);
                v9Var.mo14684c(i, Long.valueOf(r5Var.f14445b));
                return k;
            } else if (i4 == 1) {
                v9Var.mo14684c(i, Long.valueOf(m20045l(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int i5 = m20042i(bArr, i2, r5Var);
                int i6 = r5Var.f14444a;
                if (i6 < 0) {
                    throw C4636k7.m19824b();
                } else if (i6 <= bArr.length - i5) {
                    v9Var.mo14684c(i, i6 == 0 ? C4773s5.f14473g : C4773s5.m20338m(bArr, i5, i6));
                    return i5 + i6;
                } else {
                    throw C4636k7.m19823a();
                }
            } else if (i4 == 3) {
                C4827v9 g = C4827v9.m20505g();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i9 = m20042i(bArr, i2, r5Var);
                    int i10 = r5Var.f14444a;
                    i8 = i10;
                    if (i10 == i7) {
                        i2 = i9;
                        break;
                    }
                    int c = m20036c(i8, bArr, i9, i3, g, r5Var);
                    i8 = i10;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw C4636k7.m19827e();
                }
                v9Var.mo14684c(i, g);
                return i2;
            } else if (i4 == 5) {
                v9Var.mo14684c(i, Integer.valueOf(m20041h(bArr, i2)));
                return i2 + 4;
            } else {
                throw C4636k7.m19825c();
            }
        } else {
            throw C4636k7.m19825c();
        }
    }

    /* renamed from: d */
    static int m20037d(int i, byte[] bArr, int i2, C4756r5 r5Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                r5Var.f14444a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            r5Var.f14444a = i7 | i3;
            return i8;
        }
        r5Var.f14444a = i5 | i4;
        return i6;
    }

    /* renamed from: e */
    static int m20038e(C4453a9<?> a9Var, int i, byte[] bArr, int i2, int i3, C4581h7<?> h7Var, C4756r5 r5Var) throws IOException {
        int g = m20040g(a9Var, bArr, i2, i3, r5Var);
        while (true) {
            h7Var.add(r5Var.f14446c);
            if (g >= i3) {
                break;
            }
            int i4 = m20042i(bArr, g, r5Var);
            if (i != r5Var.f14444a) {
                break;
            }
            g = m20040g(a9Var, bArr, i4, i3, r5Var);
        }
        return g;
    }

    /* renamed from: f */
    static int m20039f(C4453a9 a9Var, byte[] bArr, int i, int i2, int i3, C4756r5 r5Var) throws IOException {
        C4727p8 p8Var = (C4727p8) a9Var;
        Object a = p8Var.mo13795a();
        int o = p8Var.mo14536o(a, bArr, i, i2, i3, r5Var);
        p8Var.mo13799e(a);
        r5Var.f14446c = a;
        return o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m20040g(p148g.p189d.p190a.p232c.p241f.p247f.C4453a9 r6, byte[] r7, int r8, int r9, p148g.p189d.p190a.p232c.p241f.p247f.C4756r5 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m20037d(r8, r7, r0, r10)
            int r8 = r10.f14444a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo13795a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo13801g(r1, r2, r3, r4, r5)
            r6.mo13799e(r9)
            r10.f14446c = r9
            return r8
        L_0x0025:
            g.d.a.c.f.f.k7 r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19823a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20040g(g.d.a.c.f.f.a9, byte[], int, int, g.d.a.c.f.f.r5):int");
    }

    /* renamed from: h */
    static int m20041h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    static int m20042i(byte[] bArr, int i, C4756r5 r5Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m20037d(b, bArr, i2, r5Var);
        }
        r5Var.f14444a = b;
        return i2;
    }

    /* renamed from: j */
    static int m20043j(byte[] bArr, int i, C4581h7<?> h7Var, C4756r5 r5Var) throws IOException {
        C4488c7 c7Var = (C4488c7) h7Var;
        int i2 = m20042i(bArr, i, r5Var);
        int i3 = r5Var.f14444a + i2;
        while (i2 < i3) {
            i2 = m20042i(bArr, i2, r5Var);
            c7Var.mo13886h(r5Var.f14444a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw C4636k7.m19823a();
    }

    /* renamed from: k */
    static int m20044k(byte[] bArr, int i, C4756r5 r5Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            r5Var.f14445b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        r5Var.f14445b = j2;
        return i3;
    }

    /* renamed from: l */
    static long m20045l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: m */
    static double m20046m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m20045l(bArr, i));
    }

    /* renamed from: n */
    static int m20047n(byte[] bArr, int i, C4756r5 r5Var) throws C4636k7 {
        int i2 = m20042i(bArr, i, r5Var);
        int i3 = r5Var.f14444a;
        if (i3 < 0) {
            throw C4636k7.m19824b();
        } else if (i3 == 0) {
            r5Var.f14446c = BuildConfig.FLAVOR;
            return i2;
        } else {
            r5Var.f14446c = new String(bArr, i2, i3, C4470b7.f13993a);
            return i2 + i3;
        }
    }

    /* renamed from: o */
    static float m20048o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m20041h(bArr, i));
    }

    /* renamed from: p */
    static int m20049p(byte[] bArr, int i, C4756r5 r5Var) throws C4636k7 {
        int i2 = m20042i(bArr, i, r5Var);
        int i3 = r5Var.f14444a;
        if (i3 < 0) {
            throw C4636k7.m19824b();
        } else if (i3 == 0) {
            r5Var.f14446c = BuildConfig.FLAVOR;
            return i2;
        } else {
            r5Var.f14446c = C4473ba.m18889k(bArr, i2, i3);
            return i2 + i3;
        }
    }

    /* renamed from: q */
    static int m20050q(byte[] bArr, int i, C4756r5 r5Var) throws C4636k7 {
        int i2 = m20042i(bArr, i, r5Var);
        int i3 = r5Var.f14444a;
        if (i3 < 0) {
            throw C4636k7.m19824b();
        } else if (i3 > bArr.length - i2) {
            throw C4636k7.m19823a();
        } else if (i3 == 0) {
            r5Var.f14446c = C4773s5.f14473g;
            return i2;
        } else {
            r5Var.f14446c = C4773s5.m20338m(bArr, i2, i3);
            return i2 + i3;
        }
    }
}
