package p086f.p111h.p112e.p113c;

import java.lang.reflect.Array;

/* renamed from: f.h.e.c.e */
final class C3278e {
    /* renamed from: a */
    public static int[] m14123a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m14125c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* renamed from: b */
    public static <T> T[] m14124b(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m14125c(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: c */
    public static int m14125c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
