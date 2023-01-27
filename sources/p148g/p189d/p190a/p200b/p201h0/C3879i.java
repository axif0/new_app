package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p230r0.C4273l;

/* renamed from: g.d.a.b.h0.i */
public final class C3879i {

    /* renamed from: a */
    private static final int[] f11721a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f11722b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f11723c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m16212a(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004a
            r2 = -1
            if (r1 == r2) goto L_0x0032
            r2 = 31
            if (r1 == r2) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p201h0.C3879i.m16212a(byte[]):int");
    }

    /* renamed from: b */
    private static C4273l m16213b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C4273l(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m16214c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        C4273l lVar = new C4273l(copyOf);
        if (copyOf[0] == 31) {
            C4273l lVar2 = new C4273l(copyOf);
            while (lVar2.mo13430b() >= 16) {
                lVar2.mo13443o(2);
                lVar.mo13434f(lVar2.mo13436h(14), 14);
            }
        }
        lVar.mo13439k(copyOf);
        return lVar;
    }

    /* renamed from: c */
    private static boolean m16214c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    /* renamed from: d */
    public static boolean m16215d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: e */
    public static int m16216e(ByteBuffer byteBuffer) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int position = byteBuffer.position();
        byte b2 = byteBuffer.get(position);
        if (b2 != -2) {
            if (b2 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                i4 = position + 7;
            } else if (b2 != 31) {
                i3 = (byteBuffer.get(position + 4) & 1) << 6;
                i2 = position + 5;
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                i4 = position + 6;
            }
            b = byteBuffer.get(i4) & 60;
            return (((b >> 2) | i) + 1) * 32;
        }
        i3 = (byteBuffer.get(position + 5) & 1) << 6;
        i2 = position + 4;
        b = byteBuffer.get(i2) & 252;
        return (((b >> 2) | i) + 1) * 32;
    }

    /* renamed from: f */
    public static int m16217f(byte[] bArr) {
        byte b;
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            b = b3 & 60;
            return (((b >> 2) | i) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        b = b2 & 252;
        return (((b >> 2) | i) + 1) * 32;
    }

    /* renamed from: g */
    public static C4109n m16218g(byte[] bArr, String str, String str2, C3900a aVar) {
        C4273l b = m16213b(bArr);
        b.mo13443o(60);
        int i = f11721a[b.mo13436h(6)];
        int i2 = f11722b[b.mo13436h(4)];
        int h = b.mo13436h(5);
        int[] iArr = f11723c;
        int i3 = h >= iArr.length ? -1 : (iArr[h] * 1000) / 2;
        b.mo13443o(10);
        return C4109n.m17338h(str, "audio/vnd.dts", (String) null, i3, -1, i + (b.mo13436h(2) > 0 ? 1 : 0), i2, (List<byte[]>) null, aVar, 0, str2);
    }
}
