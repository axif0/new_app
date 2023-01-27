package p148g.p189d.p296d.p314w;

import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.q */
public final class C5463q extends C5462p {

    /* renamed from: i */
    private static final int[] f15827i = {1, 1, 1, 1, 1, 1};

    /* renamed from: j */
    static final int[][] f15828j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h */
    private final int[] f15829h = new int[4];

    /* renamed from: t */
    public static String m22542t(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    /* renamed from: u */
    private static void m22543u(StringBuilder sb, int i) throws C5377i {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f15828j[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C5377i.m22193a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo15760i(String str) throws C5374f {
        return super.mo15760i(m22542t(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int[] mo15761l(C5411a aVar, int i) throws C5377i {
        return C5462p.m22532o(aVar, i, true, f15827i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo15753m(C5411a aVar, int[] iArr, StringBuilder sb) throws C5377i {
        int[] iArr2 = this.f15829h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = aVar.mo15656i();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < i; i4++) {
            int k = C5462p.m22531k(aVar, iArr2, i2, C5462p.f15823g);
            sb.append((char) ((k % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (k >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        m22543u(sb, i3);
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5369a mo15754r() {
        return C5369a.UPC_E;
    }
}
