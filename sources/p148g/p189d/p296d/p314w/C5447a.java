package p148g.p189d.p296d.p314w;

import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.a */
public final class C5447a extends C5457k {

    /* renamed from: d */
    static final char[] f15780d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f15781e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f15782f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f15783a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f15784b = new int[80];

    /* renamed from: c */
    private int f15785c = 0;

    /* renamed from: i */
    static boolean m22463i(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m22464j(int i) {
        int[] iArr = this.f15784b;
        int i2 = this.f15785c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f15785c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f15784b = iArr2;
        }
    }

    /* renamed from: k */
    private int m22465k() throws C5377i {
        for (int i = 1; i < this.f15785c; i += 2) {
            int m = m22467m(i);
            if (m != -1 && m22463i(f15782f, f15780d[m])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f15784b[i3];
                }
                if (i == 1 || this.f15784b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw C5377i.m22193a();
    }

    /* renamed from: l */
    private void m22466l(C5411a aVar) throws C5377i {
        int i = 0;
        this.f15785c = 0;
        int g = aVar.mo15654g(0);
        int i2 = aVar.mo15656i();
        if (g < i2) {
            boolean z = true;
            while (g < i2) {
                if (aVar.mo15650d(g) != z) {
                    i++;
                } else {
                    m22464j(i);
                    z = !z;
                    i = 1;
                }
                g++;
            }
            m22464j(i);
            return;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: m */
    private int m22467m(int i) {
        int i2 = i + 7;
        if (i2 >= this.f15785c) {
            return -1;
        }
        int[] iArr = this.f15784b;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f15781e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    /* renamed from: n */
    private void m22468n(int i) throws C5377i {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f15783a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f15781e[this.f15783a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f15784b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((((float) iArr[i8]) / ((float) iArr2[i8])) + (((float) iArr[i9]) / ((float) iArr2[i9]))) / 2.0f;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((((float) iArr[i9]) * 2.0f) + 1.5f) / ((float) iArr2[i9]);
        }
        loop3:
        while (true) {
            int i10 = f15781e[this.f15783a.charAt(i2)];
            int i11 = 6;
            while (i11 >= 0) {
                int i12 = (i11 & 1) + ((i10 & 1) << 1);
                float f = (float) this.f15784b[i + i11];
                if (f >= fArr2[i12] && f <= fArr[i12]) {
                    i10 >>= 1;
                    i11--;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw C5377i.m22193a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0103 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p148g.p189d.p296d.C5381m mo15752d(int r11, p148g.p189d.p296d.p304s.C5411a r12, java.util.Map<p148g.p189d.p296d.C5373e, ?> r13) throws p148g.p189d.p296d.C5377i {
        /*
            r10 = this;
            int[] r0 = r10.f15784b
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.m22466l(r12)
            int r12 = r10.m22465k()
            java.lang.StringBuilder r0 = r10.f15783a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.m22467m(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0103
            java.lang.StringBuilder r4 = r10.f15783a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f15783a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f15782f
            char[] r6 = f15780d
            char r2 = r6[r2]
            boolean r2 = m22463i(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f15785c
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f15784b
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = 0
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f15784b
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f15785c
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            g.d.d.i r11 = p148g.p189d.p296d.C5377i.m22193a()
            throw r11
        L_0x005d:
            r10.m22468n(r12)
            r0 = 0
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f15783a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f15783a
            char[] r3 = f15780d
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f15783a
            char r0 = r0.charAt(r1)
            char[] r2 = f15782f
            boolean r0 = m22463i(r2, r0)
            if (r0 == 0) goto L_0x00fe
            java.lang.StringBuilder r0 = r10.f15783a
            int r2 = r0.length()
            int r2 = r2 - r5
            char r0 = r0.charAt(r2)
            char[] r2 = f15782f
            boolean r0 = m22463i(r2, r0)
            if (r0 == 0) goto L_0x00f9
            java.lang.StringBuilder r0 = r10.f15783a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f4
            if (r13 == 0) goto L_0x00ad
            g.d.d.e r0 = p148g.p189d.p296d.C5373e.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00bc
        L_0x00ad:
            java.lang.StringBuilder r13 = r10.f15783a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f15783a
            r13.deleteCharAt(r1)
        L_0x00bc:
            r13 = 0
            r0 = 0
        L_0x00be:
            if (r13 >= r12) goto L_0x00c8
            int[] r2 = r10.f15784b
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00be
        L_0x00c8:
            float r13 = (float) r0
        L_0x00c9:
            if (r12 >= r4) goto L_0x00d3
            int[] r2 = r10.f15784b
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c9
        L_0x00d3:
            float r12 = (float) r0
            g.d.d.m r0 = new g.d.d.m
            java.lang.StringBuilder r2 = r10.f15783a
            java.lang.String r2 = r2.toString()
            r3 = 0
            g.d.d.o[] r4 = new p148g.p189d.p296d.C5383o[r6]
            g.d.d.o r6 = new g.d.d.o
            float r11 = (float) r11
            r6.<init>(r13, r11)
            r4[r1] = r6
            g.d.d.o r13 = new g.d.d.o
            r13.<init>(r12, r11)
            r4[r5] = r13
            g.d.d.a r11 = p148g.p189d.p296d.C5369a.CODABAR
            r0.<init>(r2, r3, r4, r11)
            return r0
        L_0x00f4:
            g.d.d.i r11 = p148g.p189d.p296d.C5377i.m22193a()
            throw r11
        L_0x00f9:
            g.d.d.i r11 = p148g.p189d.p296d.C5377i.m22193a()
            throw r11
        L_0x00fe:
            g.d.d.i r11 = p148g.p189d.p296d.C5377i.m22193a()
            throw r11
        L_0x0103:
            g.d.d.i r11 = p148g.p189d.p296d.C5377i.m22193a()
            goto L_0x0109
        L_0x0108:
            throw r11
        L_0x0109:
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p314w.C5447a.mo15752d(int, g.d.d.s.a, java.util.Map):g.d.d.m");
    }
}
