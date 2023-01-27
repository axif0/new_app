package p148g.p189d.p190a.p200b.p230r0;

import android.util.Pair;
import p148g.p189d.p190a.p200b.C4313u;

/* renamed from: g.d.a.b.r0.c */
public final class C4262c {

    /* renamed from: a */
    private static final byte[] f13608a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f13609b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f13610c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static byte[] m18079a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: b */
    public static byte[] m18080b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f13608a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f13608a.length, i2);
        return bArr3;
    }

    /* renamed from: c */
    private static int m18081c(C4273l lVar) {
        int h = lVar.mo13436h(5);
        return h == 31 ? lVar.mo13436h(6) + 32 : h;
    }

    /* renamed from: d */
    private static int m18082d(C4273l lVar) {
        int h = lVar.mo13436h(4);
        if (h == 15) {
            return lVar.mo13436h(24);
        }
        C4260a.m18069a(h < 13);
        return f13609b[h];
    }

    /* renamed from: e */
    public static Pair<Integer, Integer> m18083e(C4273l lVar, boolean z) throws C4313u {
        int c = m18081c(lVar);
        int d = m18082d(lVar);
        int h = lVar.mo13436h(4);
        if (c == 5 || c == 29) {
            d = m18082d(lVar);
            c = m18081c(lVar);
            if (c == 22) {
                h = lVar.mo13436h(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(c == 1 || c == 2 || c == 3 || c == 4 || c == 6 || c == 7 || c == 17)) {
                switch (c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C4313u("Unsupported audio object type: " + c);
                }
            }
            m18085g(lVar, c, h);
            switch (c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = lVar.mo13436h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw new C4313u("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = f13610c[h];
        if (i == -1) {
            z2 = false;
        }
        C4260a.m18069a(z2);
        return Pair.create(Integer.valueOf(d), Integer.valueOf(i));
    }

    /* renamed from: f */
    public static Pair<Integer, Integer> m18084f(byte[] bArr) throws C4313u {
        return m18083e(new C4273l(bArr), false);
    }

    /* renamed from: g */
    private static void m18085g(C4273l lVar, int i, int i2) {
        lVar.mo13443o(1);
        if (lVar.mo13435g()) {
            lVar.mo13443o(14);
        }
        boolean g = lVar.mo13435g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                lVar.mo13443o(3);
            }
            if (g) {
                if (i == 22) {
                    lVar.mo13443o(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    lVar.mo13443o(3);
                }
                lVar.mo13443o(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
