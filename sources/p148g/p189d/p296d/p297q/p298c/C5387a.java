package p148g.p189d.p296d.p297q.p298c;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.List;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.p297q.C5385a;
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5415e;
import p148g.p189d.p296d.p304s.p306n.C5425a;
import p148g.p189d.p296d.p304s.p306n.C5427c;
import p148g.p189d.p296d.p304s.p306n.C5428d;

/* renamed from: g.d.d.q.c.a */
public final class C5387a {

    /* renamed from: b */
    private static final String[] f15580b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f15581c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f15582d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f15583e = {BuildConfig.FLAVOR, "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f15584f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C5385a f15585a;

    /* renamed from: g.d.d.q.c.a$a */
    static /* synthetic */ class C5388a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15586a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                g.d.d.q.c.a$b[] r0 = p148g.p189d.p296d.p297q.p298c.C5387a.C5389b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15586a = r0
                g.d.d.q.c.a$b r1 = p148g.p189d.p296d.p297q.p298c.C5387a.C5389b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15586a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.d.d.q.c.a$b r1 = p148g.p189d.p296d.p297q.p298c.C5387a.C5389b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15586a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.d.d.q.c.a$b r1 = p148g.p189d.p296d.p297q.p298c.C5387a.C5389b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15586a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.d.d.q.c.a$b r1 = p148g.p189d.p296d.p297q.p298c.C5387a.C5389b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15586a     // Catch:{ NoSuchFieldError -> 0x003e }
                g.d.d.q.c.a$b r1 = p148g.p189d.p296d.p297q.p298c.C5387a.C5389b.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p297q.p298c.C5387a.C5388a.<clinit>():void");
        }
    }

    /* renamed from: g.d.d.q.c.a$b */
    private enum C5389b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m22220a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m22226h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m22221b(boolean[] zArr) throws C5374f {
        C5425a aVar;
        int i = 8;
        if (this.f15585a.mo15624d() <= 2) {
            i = 6;
            aVar = C5425a.f15710j;
        } else if (this.f15585a.mo15624d() <= 8) {
            aVar = C5425a.f15714n;
        } else if (this.f15585a.mo15624d() <= 22) {
            i = 10;
            aVar = C5425a.f15709i;
        } else {
            i = 12;
            aVar = C5425a.f15708h;
        }
        int c = this.f15585a.mo15623c();
        int length = zArr.length / i;
        if (length >= c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m22227i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C5427c(aVar).mo15724a(iArr, length - c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw C5374f.m22179a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[((c * i) - i4)];
                int i7 = 0;
                for (int i8 = 0; i8 < c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        Arrays.fill(zArr2, i7, (i7 + i) - 1, i9 > 1);
                        i7 += i - 1;
                    } else {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            zArr2[i7] = ((1 << i10) & i9) != 0;
                            i10--;
                            i7 = i11;
                        }
                    }
                }
                return zArr2;
            } catch (C5428d e) {
                throw C5374f.m22180b(e);
            }
        } else {
            throw C5374f.m22179a();
        }
    }

    /* renamed from: d */
    private boolean[] m22222d(C5412b bVar) {
        C5412b bVar2 = bVar;
        boolean e = this.f15585a.mo15625e();
        int d = this.f15585a.mo15624d();
        int i = (e ? 11 : 14) + (d << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m22228j(d, e)];
        int i2 = 2;
        if (e) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < d) {
            int i10 = ((d - i8) << i2) + (e ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = bVar2.mo15665e(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = bVar2.mo15665e(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = bVar2.mo15665e(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = bVar2.mo15665e(iArr[i20], iArr[i16]);
                    i15++;
                    d = d;
                    e = e;
                    i2 = 2;
                }
                boolean z = e;
                int i21 = d;
                i13++;
                i2 = 2;
            }
            boolean z2 = e;
            int i22 = d;
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    /* renamed from: e */
    private static String m22223e(C5389b bVar, int i) {
        int i2 = C5388a.f15586a[bVar.ordinal()];
        if (i2 == 1) {
            return f15580b[i];
        }
        if (i2 == 2) {
            return f15581c[i];
        }
        if (i2 == 3) {
            return f15582d[i];
        }
        if (i2 == 4) {
            return f15583e[i];
        }
        if (i2 == 5) {
            return f15584f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: f */
    private static String m22224f(boolean[] zArr) {
        int length = zArr.length;
        C5389b bVar = C5389b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        C5389b bVar2 = bVar;
        int i = 0;
        while (i < length) {
            if (bVar == C5389b.BINARY) {
                if (length - i < 5) {
                    break;
                }
                int i2 = m22227i(zArr, i, 5);
                i += 5;
                if (i2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    i2 = m22227i(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    } else if (length - i < 8) {
                        i = length;
                        break;
                    } else {
                        sb.append((char) m22227i(zArr, i, 8));
                        i += 8;
                        i3++;
                    }
                }
            } else {
                int i4 = bVar == C5389b.DIGIT ? 4 : 5;
                if (length - i < i4) {
                    break;
                }
                int i5 = m22227i(zArr, i, i4);
                i += i4;
                String e = m22223e(bVar, i5);
                if (e.startsWith("CTRL_")) {
                    bVar2 = m22225g(e.charAt(5));
                    if (e.charAt(6) != 'L') {
                        C5389b bVar3 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar3;
                    }
                } else {
                    sb.append(e);
                }
            }
            bVar = bVar2;
        }
        return sb.toString();
    }

    /* renamed from: g */
    private static C5389b m22225g(char c) {
        return c != 'B' ? c != 'D' ? c != 'P' ? c != 'L' ? c != 'M' ? C5389b.UPPER : C5389b.MIXED : C5389b.LOWER : C5389b.PUNCT : C5389b.DIGIT : C5389b.BINARY;
    }

    /* renamed from: h */
    private static byte m22226h(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return (byte) (length >= 8 ? m22227i(zArr, i, 8) : m22227i(zArr, i, length) << (8 - length));
    }

    /* renamed from: i */
    private static int m22227i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: j */
    private static int m22228j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: c */
    public C5415e mo15626c(C5385a aVar) throws C5374f {
        this.f15585a = aVar;
        boolean[] b = m22221b(m22222d(aVar.mo15699a()));
        C5415e eVar = new C5415e(m22220a(b), m22224f(b), (List<byte[]>) null, (String) null);
        eVar.mo15695l(b.length);
        return eVar;
    }
}
