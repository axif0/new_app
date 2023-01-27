package p148g.p189d.p296d.p314w;

import java.util.Arrays;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.d */
public final class C5450d extends C5457k {

    /* renamed from: c */
    private static final char[] f15792c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f15793d;

    /* renamed from: e */
    static final int f15794e;

    /* renamed from: a */
    private final StringBuilder f15795a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f15796b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f15793d = iArr;
        f15794e = iArr[47];
    }

    /* renamed from: i */
    private static void m22478i(CharSequence charSequence) throws C5372d {
        int length = charSequence.length();
        m22479j(charSequence, length - 2, 20);
        m22479j(charSequence, length - 1, 15);
    }

    /* renamed from: j */
    private static void m22479j(CharSequence charSequence, int i, int i2) throws C5372d {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f15792c[i3 % 47]) {
            throw C5372d.m22177a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r4 = 0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m22480k(java.lang.CharSequence r9) throws p148g.p189d.p296d.C5374f {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x00b0
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x00a9
            r5 = 100
            if (r4 > r5) goto L_0x00a9
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x00a4
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0097;
                case 98: goto L_0x004e;
                case 99: goto L_0x003c;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x00a9
        L_0x002f:
            if (r5 < r8) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            int r5 = r5 + 32
            goto L_0x009d
        L_0x0037:
            g.d.d.f r9 = p148g.p189d.p296d.C5374f.m22179a()
            throw r9
        L_0x003c:
            if (r5 < r8) goto L_0x0043
            if (r5 > r6) goto L_0x0043
            int r5 = r5 + -32
            goto L_0x009d
        L_0x0043:
            if (r5 != r7) goto L_0x0049
            r4 = 58
            goto L_0x00a9
        L_0x0049:
            g.d.d.f r9 = p148g.p189d.p296d.C5374f.m22179a()
            throw r9
        L_0x004e:
            if (r5 < r8) goto L_0x0057
            r4 = 69
            if (r5 > r4) goto L_0x0057
            int r5 = r5 + -38
            goto L_0x009d
        L_0x0057:
            r4 = 70
            if (r5 < r4) goto L_0x0062
            r4 = 74
            if (r5 > r4) goto L_0x0062
            int r5 = r5 + -11
            goto L_0x009d
        L_0x0062:
            r4 = 75
            if (r5 < r4) goto L_0x006b
            if (r5 > r6) goto L_0x006b
            int r5 = r5 + 16
            goto L_0x009d
        L_0x006b:
            r4 = 80
            if (r5 < r4) goto L_0x0076
            r4 = 84
            if (r5 > r4) goto L_0x0076
            int r5 = r5 + 43
            goto L_0x009d
        L_0x0076:
            r4 = 85
            if (r5 != r4) goto L_0x007b
            goto L_0x002c
        L_0x007b:
            r4 = 86
            if (r5 != r4) goto L_0x0082
            r4 = 64
            goto L_0x00a9
        L_0x0082:
            r4 = 87
            if (r5 != r4) goto L_0x0089
            r4 = 96
            goto L_0x00a9
        L_0x0089:
            r4 = 88
            if (r5 < r4) goto L_0x0092
            if (r5 > r7) goto L_0x0092
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x00a9
        L_0x0092:
            g.d.d.f r9 = p148g.p189d.p296d.C5374f.m22179a()
            throw r9
        L_0x0097:
            if (r5 < r8) goto L_0x009f
            if (r5 > r7) goto L_0x009f
            int r5 = r5 + -64
        L_0x009d:
            char r4 = (char) r5
            goto L_0x00a9
        L_0x009f:
            g.d.d.f r9 = p148g.p189d.p296d.C5374f.m22179a()
            throw r9
        L_0x00a4:
            g.d.d.f r9 = p148g.p189d.p296d.C5374f.m22179a()
            throw r9
        L_0x00a9:
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x00b0:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p314w.C5450d.m22480k(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: l */
    private int[] m22481l(C5411a aVar) throws C5377i {
        int i = aVar.mo15656i();
        int f = aVar.mo15653f(0);
        Arrays.fill(this.f15796b, 0);
        int[] iArr = this.f15796b;
        int length = iArr.length;
        int i2 = f;
        boolean z = false;
        int i3 = 0;
        while (f < i) {
            if (aVar.mo15650d(f) != z) {
                iArr[i3] = iArr[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (m22483n(iArr) == f15794e) {
                    return new int[]{i2, f};
                } else {
                    i2 += iArr[0] + iArr[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i3--;
                }
                iArr[i3] = 1;
                z = !z;
            }
            f++;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: m */
    private static char m22482m(int i) throws C5377i {
        int i2 = 0;
        while (true) {
            int[] iArr = f15793d;
            if (i2 >= iArr.length) {
                throw C5377i.m22193a();
            } else if (iArr[i2] == i) {
                return f15792c[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: n */
    private static int m22483n(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i, C5372d, C5374f {
        int[] l = m22481l(aVar);
        int f = aVar.mo15653f(l[1]);
        int i2 = aVar.mo15656i();
        int[] iArr = this.f15796b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f15795a;
        sb.setLength(0);
        while (true) {
            C5457k.m22507g(aVar, f, iArr);
            int n = m22483n(iArr);
            if (n >= 0) {
                char m = m22482m(n);
                sb.append(m);
                int i3 = f;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int f2 = aVar.mo15653f(i3);
                if (m == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    if (f2 == i2 || !aVar.mo15650d(f2)) {
                        throw C5377i.m22193a();
                    } else if (sb.length() >= 2) {
                        m22478i(sb);
                        sb.setLength(sb.length() - 2);
                        float f3 = (float) i;
                        return new C5381m(m22480k(sb), (byte[]) null, new C5383o[]{new C5383o(((float) (l[1] + l[0])) / 2.0f, f3), new C5383o(((float) f) + (((float) i5) / 2.0f), f3)}, C5369a.CODE_93);
                    } else {
                        throw C5377i.m22193a();
                    }
                } else {
                    f = f2;
                }
            } else {
                throw C5377i.m22193a();
            }
        }
    }
}
