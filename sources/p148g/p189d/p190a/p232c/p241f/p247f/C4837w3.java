package p148g.p189d.p190a.p232c.p241f.p247f;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.f.w3 */
final class C4837w3 {
    /* renamed from: a */
    static int m20522a(int i, int i2, int i3) {
        return (i & (i3 ^ -1)) | (i2 & i3);
    }

    /* renamed from: b */
    static int m20523b(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* renamed from: c */
    static int m20524c(@NullableDecl Object obj, @NullableDecl Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i2;
        int i3;
        int b = C4871y3.m20622b(obj);
        int i4 = b & i;
        int b2 = m20523b(obj3, i4);
        if (b2 == 0) {
            return -1;
        }
        int i5 = i ^ -1;
        int i6 = b & i5;
        int i7 = -1;
        while (true) {
            i2 = b2 - 1;
            i3 = iArr[i2];
            if ((i3 & i5) != i6 || !C4870y2.m20620a(obj, objArr[i2]) || (objArr2 != null && !C4870y2.m20620a(obj2, objArr2[i2]))) {
                int i8 = i3 & i;
                if (i8 == 0) {
                    return -1;
                }
                int i9 = i8;
                i7 = i2;
                b2 = i9;
            }
        }
        int i10 = i3 & i;
        if (i7 == -1) {
            m20526e(obj3, i4, i10);
        } else {
            iArr[i7] = m20522a(iArr[i7], i10, i);
        }
        return i2;
    }

    /* renamed from: d */
    static Object m20525d(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    static void m20526e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: f */
    static int m20527f(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }
}
