package p148g.p189d.p190a.p200b.p230r0;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: g.d.a.b.r0.k */
public final class C4270k {

    /* renamed from: a */
    public static final byte[] f13622a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f13623b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f13624c = new Object();

    /* renamed from: d */
    private static int[] f13625d = new int[10];

    /* renamed from: g.d.a.b.r0.k$a */
    public static final class C4271a {

        /* renamed from: a */
        public final int f13626a;

        /* renamed from: b */
        public final int f13627b;

        /* renamed from: c */
        public final boolean f13628c;

        public C4271a(int i, int i2, boolean z) {
            this.f13626a = i;
            this.f13627b = i2;
            this.f13628c = z;
        }
    }

    /* renamed from: g.d.a.b.r0.k$b */
    public static final class C4272b {

        /* renamed from: a */
        public final int f13629a;

        /* renamed from: b */
        public final int f13630b;

        /* renamed from: c */
        public final int f13631c;

        /* renamed from: d */
        public final float f13632d;

        /* renamed from: e */
        public final boolean f13633e;

        /* renamed from: f */
        public final boolean f13634f;

        /* renamed from: g */
        public final int f13635g;

        /* renamed from: h */
        public final int f13636h;

        /* renamed from: i */
        public final int f13637i;

        /* renamed from: j */
        public final boolean f13638j;

        public C4272b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f13629a = i;
            this.f13630b = i2;
            this.f13631c = i3;
            this.f13632d = f;
            this.f13633e = z;
            this.f13634f = z2;
            this.f13635g = i4;
            this.f13636h = i5;
            this.f13637i = i6;
            this.f13638j = z3;
        }
    }

    /* renamed from: a */
    public static void m18118a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m18119b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0097, code lost:
        r8 = true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m18120c(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            m18118a(r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            m18118a(r10)
            int r8 = r8 - r3
            return r8
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r10[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r7[r8]
            if (r4 != 0) goto L_0x0040
            int r4 = r8 + 1
            byte r4 = r7[r4]
            if (r4 != r2) goto L_0x0040
            m18118a(r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0067
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0062
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0062
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0062
            if (r10 == 0) goto L_0x0061
            m18118a(r10)
        L_0x0061:
            return r5
        L_0x0062:
            int r8 = r8 + -2
        L_0x0064:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0067:
            if (r10 == 0) goto L_0x00bb
            if (r0 <= r3) goto L_0x007e
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
            goto L_0x0097
        L_0x007c:
            r8 = 0
            goto L_0x0098
        L_0x007e:
            if (r0 != r3) goto L_0x008f
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x007c
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
            goto L_0x0097
        L_0x008f:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
        L_0x0097:
            r8 = 1
        L_0x0098:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00a7
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
            goto L_0x00af
        L_0x00a7:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
        L_0x00af:
            r8 = 1
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00b9
            r1 = 1
        L_0x00b9:
            r10[r3] = r1
        L_0x00bb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p230r0.C4270k.m18120c(byte[], int, int, boolean[]):int");
    }

    /* renamed from: d */
    private static int m18121d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m18122e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m18123f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m18124g(String str, byte b) {
        if (!"video/avc".equals(str) || (b & 31) != 6) {
            return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
        }
        return true;
    }

    /* renamed from: h */
    public static C4271a m18125h(byte[] bArr, int i, int i2) {
        C4275n nVar = new C4275n(bArr, i, i2);
        nVar.mo13490l(8);
        int h = nVar.mo13487h();
        int h2 = nVar.mo13487h();
        nVar.mo13489k();
        return new C4271a(h, h2, nVar.mo13484d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0146  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p148g.p189d.p190a.p200b.p230r0.C4270k.C4272b m18126i(byte[] r18, int r19, int r20) {
        /*
            g.d.a.b.r0.n r0 = new g.d.a.b.r0.n
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo13490l(r1)
            int r2 = r0.mo13485e(r1)
            r3 = 16
            r0.mo13490l(r3)
            int r5 = r0.mo13487h()
            r4 = 3
            r6 = 0
            r7 = 1
            r8 = 100
            if (r2 == r8) goto L_0x004c
            r8 = 110(0x6e, float:1.54E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 122(0x7a, float:1.71E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 244(0xf4, float:3.42E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 44
            if (r2 == r8) goto L_0x004c
            r8 = 83
            if (r2 == r8) goto L_0x004c
            r8 = 86
            if (r2 == r8) goto L_0x004c
            r8 = 118(0x76, float:1.65E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 128(0x80, float:1.794E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 138(0x8a, float:1.93E-43)
            if (r2 != r8) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2 = 1
            r9 = 0
            goto L_0x0086
        L_0x004c:
            int r2 = r0.mo13487h()
            if (r2 != r4) goto L_0x0057
            boolean r8 = r0.mo13484d()
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            r0.mo13487h()
            r0.mo13487h()
            r0.mo13489k()
            boolean r9 = r0.mo13484d()
            if (r9 == 0) goto L_0x0085
            if (r2 == r4) goto L_0x006c
            r9 = 8
            goto L_0x006e
        L_0x006c:
            r9 = 12
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 >= r9) goto L_0x0085
            boolean r11 = r0.mo13484d()
            if (r11 == 0) goto L_0x0082
            r11 = 6
            if (r10 >= r11) goto L_0x007d
            r11 = 16
            goto L_0x007f
        L_0x007d:
            r11 = 64
        L_0x007f:
            m18127j(r0, r11)
        L_0x0082:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x0085:
            r9 = r8
        L_0x0086:
            int r8 = r0.mo13487h()
            int r11 = r8 + 4
            int r12 = r0.mo13487h()
            if (r12 != 0) goto L_0x009c
            int r8 = r0.mo13487h()
            int r8 = r8 + 4
            r18 = r5
            r13 = r8
            goto L_0x00c1
        L_0x009c:
            if (r12 != r7) goto L_0x00be
            boolean r8 = r0.mo13484d()
            r0.mo13486g()
            r0.mo13486g()
            int r10 = r0.mo13487h()
            long r13 = (long) r10
            r18 = r5
            r10 = 0
        L_0x00b0:
            long r4 = (long) r10
            int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00bb
            r0.mo13487h()
            int r10 = r10 + 1
            goto L_0x00b0
        L_0x00bb:
            r14 = r8
            r13 = 0
            goto L_0x00c2
        L_0x00be:
            r18 = r5
            r13 = 0
        L_0x00c1:
            r14 = 0
        L_0x00c2:
            r0.mo13487h()
            r0.mo13489k()
            int r4 = r0.mo13487h()
            int r4 = r4 + r7
            int r5 = r0.mo13487h()
            int r5 = r5 + r7
            boolean r10 = r0.mo13484d()
            int r6 = 2 - r10
            int r6 = r6 * r5
            if (r10 != 0) goto L_0x00df
            r0.mo13489k()
        L_0x00df:
            r0.mo13489k()
            int r4 = r4 * 16
            int r6 = r6 * 16
            boolean r5 = r0.mo13484d()
            if (r5 == 0) goto L_0x011a
            int r5 = r0.mo13487h()
            int r8 = r0.mo13487h()
            int r15 = r0.mo13487h()
            int r16 = r0.mo13487h()
            if (r2 != 0) goto L_0x0101
            int r2 = 2 - r10
            goto L_0x0111
        L_0x0101:
            r17 = 2
            r3 = 3
            if (r2 != r3) goto L_0x0108
            r3 = 1
            goto L_0x0109
        L_0x0108:
            r3 = 2
        L_0x0109:
            if (r2 != r7) goto L_0x010c
            r7 = 2
        L_0x010c:
            int r2 = 2 - r10
            int r2 = r2 * r7
            r7 = r3
        L_0x0111:
            int r5 = r5 + r8
            int r5 = r5 * r7
            int r4 = r4 - r5
            int r15 = r15 + r16
            int r15 = r15 * r2
            int r6 = r6 - r15
        L_0x011a:
            r7 = r6
            r6 = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.mo13484d()
            if (r3 == 0) goto L_0x0165
            boolean r3 = r0.mo13484d()
            if (r3 == 0) goto L_0x0165
            int r1 = r0.mo13485e(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0146
            r3 = 16
            int r1 = r0.mo13485e(r3)
            int r0 = r0.mo13485e(r3)
            if (r1 == 0) goto L_0x0144
            if (r0 == 0) goto L_0x0144
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = r1 / r0
        L_0x0144:
            r8 = r2
            goto L_0x0167
        L_0x0146:
            float[] r0 = f13623b
            int r3 = r0.length
            if (r1 >= r3) goto L_0x014f
            r0 = r0[r1]
            r8 = r0
            goto L_0x0167
        L_0x014f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected aspect_ratio_idc value: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NalUnitUtil"
            android.util.Log.w(r1, r0)
        L_0x0165:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0167:
            g.d.a.b.r0.k$b r0 = new g.d.a.b.r0.k$b
            r4 = r0
            r5 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p230r0.C4270k.m18126i(byte[], int, int):g.d.a.b.r0.k$b");
    }

    /* renamed from: j */
    private static void m18127j(C4275n nVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((nVar.mo13486g() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: k */
    public static int m18128k(byte[] bArr, int i) {
        int i2;
        synchronized (f13624c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m18121d(bArr, i3, i);
                    if (i3 < i) {
                        if (f13625d.length <= i4) {
                            f13625d = Arrays.copyOf(f13625d, f13625d.length * 2);
                        }
                        f13625d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f13625d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
