package p385n;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: n.f */
public class C6282f implements Serializable, Comparable<C6282f> {

    /* renamed from: i */
    static final char[] f17780i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: j */
    public static final C6282f f17781j = m25892s(new byte[0]);

    /* renamed from: f */
    final byte[] f17782f;

    /* renamed from: g */
    transient int f17783g;

    /* renamed from: h */
    transient String f17784h;

    C6282f(byte[] bArr) {
        this.f17782f = bArr;
    }

    /* renamed from: g */
    static int m25886g(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: j */
    public static C6282f m25887j(String str) {
        if (str != null) {
            byte[] a = C6276b.m25795a(str);
            if (a != null) {
                return new C6282f(a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: k */
    public static C6282f m25888k(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m25889l(str.charAt(i2)) << 4) + m25889l(str.charAt(i2 + 1)));
            }
            return m25892s(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    /* renamed from: l */
    private static int m25889l(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: m */
    private C6282f m25890m(String str) {
        try {
            return m25892s(MessageDigest.getInstance(str).digest(this.f17782f));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: n */
    public static C6282f m25891n(String str) {
        if (str != null) {
            C6282f fVar = new C6282f(str.getBytes(C6303u.f17825a));
            fVar.f17784h = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: s */
    public static C6282f m25892s(byte... bArr) {
        if (bArr != null) {
            return new C6282f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: A */
    public C6282f mo17875A() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f17782f;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C6282f(bArr2);
            }
        }
    }

    /* renamed from: B */
    public byte[] mo17876B() {
        return (byte[]) this.f17782f.clone();
    }

    /* renamed from: D */
    public String mo17877D() {
        String str = this.f17784h;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f17782f, C6303u.f17825a);
        this.f17784h = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo17878E(C6277c cVar) {
        byte[] bArr = this.f17782f;
        cVar.mo17843r0(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public String mo17880e() {
        return C6276b.m25796b(this.f17782f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6282f) {
            C6282f fVar = (C6282f) obj;
            int x = fVar.mo17892x();
            byte[] bArr = this.f17782f;
            return x == bArr.length && fVar.mo17889u(0, bArr, 0, bArr.length);
        }
    }

    /* renamed from: h */
    public int compareTo(C6282f fVar) {
        int x = mo17892x();
        int x2 = fVar.mo17892x();
        int min = Math.min(x, x2);
        for (int i = 0; i < min; i++) {
            byte o = mo17884o(i) & 255;
            byte o2 = fVar.mo17884o(i) & 255;
            if (o != o2) {
                return o < o2 ? -1 : 1;
            }
        }
        if (x == x2) {
            return 0;
        }
        return x < x2 ? -1 : 1;
    }

    public int hashCode() {
        int i = this.f17783g;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f17782f);
        this.f17783g = hashCode;
        return hashCode;
    }

    /* renamed from: o */
    public byte mo17884o(int i) {
        return this.f17782f[i];
    }

    /* renamed from: q */
    public String mo17885q() {
        byte[] bArr = this.f17782f;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f17780i;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: r */
    public C6282f mo17886r() {
        return m25890m("MD5");
    }

    /* renamed from: t */
    public boolean mo17887t(int i, C6282f fVar, int i2, int i3) {
        return fVar.mo17889u(i2, this.f17782f, i, i3);
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f17782f.length == 0) {
            return "[size=0]";
        }
        String D = mo17877D();
        int g = m25886g(D, 64);
        if (g == -1) {
            if (this.f17782f.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(mo17885q());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f17782f.length);
                sb2.append(" hex=");
                sb2.append(mo17894z(0, 64).mo17885q());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = D.substring(0, g).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (g < D.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f17782f.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo17889u(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f17782f;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C6303u.m26018a(bArr2, i, bArr, i2, i3);
        }
    }

    /* renamed from: v */
    public C6282f mo17890v() {
        return m25890m("SHA-1");
    }

    /* renamed from: w */
    public C6282f mo17891w() {
        return m25890m("SHA-256");
    }

    /* renamed from: x */
    public int mo17892x() {
        return this.f17782f.length;
    }

    /* renamed from: y */
    public final boolean mo17893y(C6282f fVar) {
        return mo17887t(0, fVar, 0, fVar.mo17892x());
    }

    /* renamed from: z */
    public C6282f mo17894z(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f17782f;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f17782f, i, bArr2, 0, i3);
                    return new C6282f(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f17782f.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }
}
