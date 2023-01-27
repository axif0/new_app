package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.ba */
final class C4473ba {

    /* renamed from: a */
    private static final C4491ca f14003a = ((!(C4877y9.m20675m() && C4877y9.m20680r()) || C4724p5.m20110b()) ? new C4566ga() : new C4601ia());

    /* renamed from: d */
    static int m18882d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C4528ea(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    static int m18883e(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f14003a.mo13896b(charSequence, bArr, i, i2);
    }

    /* renamed from: f */
    public static boolean m18884f(byte[] bArr) {
        return f14003a.mo13897c(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static boolean m18885g(byte[] bArr, int i, int i2) {
        return f14003a.mo13897c(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m18886h(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static int m18887i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static int m18888j(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: k */
    static String m18889k(byte[] bArr, int i, int i2) throws C4636k7 {
        return f14003a.mo13898d(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m18891m(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m18886h(b);
        }
        if (i3 == 1) {
            return m18887i(b, bArr[i]);
        }
        if (i3 == 2) {
            return m18888j(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
