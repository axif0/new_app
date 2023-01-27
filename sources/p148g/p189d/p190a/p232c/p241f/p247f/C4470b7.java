package p148g.p189d.p190a.p232c.p241f.p247f;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: g.d.a.c.f.f.b7 */
public final class C4470b7 {

    /* renamed from: a */
    static final Charset f13993a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f13994b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f13994b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f13994b;
        C4505d6.m19227b(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    static int m18813a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: b */
    public static int m18814b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static int m18815c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    static <T> T m18816d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: e */
    static Object m18817e(Object obj, Object obj2) {
        C4637k8 d = ((C4655l8) obj).mo14432d();
        d.mo14349S((C4655l8) obj2);
        return d.mo14351m();
    }

    /* renamed from: f */
    static <T> T m18818f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    static boolean m18819g(C4655l8 l8Var) {
        if (!(l8Var instanceof C4634k5)) {
            return false;
        }
        C4634k5 k5Var = (C4634k5) l8Var;
        return false;
    }

    /* renamed from: h */
    public static boolean m18820h(byte[] bArr) {
        return C4473ba.m18884f(bArr);
    }

    /* renamed from: i */
    public static String m18821i(byte[] bArr) {
        return new String(bArr, f13993a);
    }

    /* renamed from: j */
    public static int m18822j(byte[] bArr) {
        int length = bArr.length;
        int a = m18813a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
