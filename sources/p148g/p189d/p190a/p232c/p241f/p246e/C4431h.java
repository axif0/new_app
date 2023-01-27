package p148g.p189d.p190a.p232c.p241f.p246e;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: g.d.a.c.f.e.h */
public final class C4431h {
    static {
        new C4430g();
    }

    /* renamed from: a */
    public static InputStream m18677a(InputStream inputStream, long j) {
        return new C4433j(inputStream, 1048577);
    }

    /* renamed from: b */
    public static byte[] m18678b(InputStream inputStream) throws IOException {
        C4428e.m18676a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m18679c(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            i = C4436l.m18684a(i, 2);
        }
        if (inputStream.read() == -1) {
            return m18679c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: c */
    private static byte[] m18679c(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
