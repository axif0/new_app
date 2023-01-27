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

/* renamed from: g.d.d.w.c */
public final class C5449c extends C5457k {

    /* renamed from: e */
    static final int[] f15787e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    private final boolean f15788a;

    /* renamed from: b */
    private final boolean f15789b;

    /* renamed from: c */
    private final StringBuilder f15790c;

    /* renamed from: d */
    private final int[] f15791d;

    public C5449c() {
        this(false);
    }

    public C5449c(boolean z) {
        this(z, false);
    }

    public C5449c(boolean z, boolean z2) {
        this.f15788a = z;
        this.f15789b = z2;
        this.f15790c = new StringBuilder(20);
        this.f15791d = new int[9];
    }

    /* renamed from: i */
    private static String m22473i(CharSequence charSequence) throws C5374f {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    charAt = ':';
                                } else {
                                    throw C5374f.m22179a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw C5374f.m22179a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            charAt = '@';
                        } else if (charAt2 == 'W') {
                            charAt = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            charAt = 127;
                        } else {
                            throw C5374f.m22179a();
                        }
                    }
                    charAt = 0;
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw C5374f.m22179a();
                } else {
                    i = charAt2 - '@';
                }
                charAt = (char) i;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: j */
    private static int[] m22474j(C5411a aVar, int[] iArr) throws C5377i {
        int i = aVar.mo15656i();
        int f = aVar.mo15653f(0);
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
                } else if (m22476l(iArr) != 148 || !aVar.mo15657k(Math.max(0, i2 - ((f - i2) / 2)), i2, false)) {
                    i2 += iArr[0] + iArr[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i3--;
                } else {
                    return new int[]{i2, f};
                }
                iArr[i3] = 1;
                z = !z;
            }
            f++;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: k */
    private static char m22475k(int i) throws C5377i {
        int i2 = 0;
        while (true) {
            int[] iArr = f15787e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw C5377i.m22193a();
            }
        }
    }

    /* renamed from: l */
    private static int m22476l(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i, C5372d, C5374f {
        int[] iArr = this.f15791d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f15790c;
        sb.setLength(0);
        int[] j = m22474j(aVar, iArr);
        int f = aVar.mo15653f(j[1]);
        int i2 = aVar.mo15656i();
        while (true) {
            C5457k.m22507g(aVar, f, iArr);
            int l = m22476l(iArr);
            if (l >= 0) {
                char k = m22475k(l);
                sb.append(k);
                int i3 = f;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int f2 = aVar.mo15653f(i3);
                if (k == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (f2 - f) - i5;
                    if (f2 == i2 || (i7 << 1) >= i5) {
                        if (this.f15788a) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f15790c.charAt(i9));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw C5372d.m22177a();
                            }
                        }
                        if (sb.length() != 0) {
                            float f3 = (float) i;
                            return new C5381m(this.f15789b ? m22473i(sb) : sb.toString(), (byte[]) null, new C5383o[]{new C5383o(((float) (j[1] + j[0])) / 2.0f, f3), new C5383o(((float) f) + (((float) i5) / 2.0f), f3)}, C5369a.CODE_39);
                        }
                        throw C5377i.m22193a();
                    }
                    throw C5377i.m22193a();
                }
                f = f2;
            } else {
                throw C5377i.m22193a();
            }
        }
    }
}
