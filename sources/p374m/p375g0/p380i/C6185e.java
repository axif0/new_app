package p374m.p375g0.p380i;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import p374m.p375g0.C6130c;
import p385n.C6282f;

/* renamed from: m.g0.i.e */
public final class C6185e {

    /* renamed from: a */
    static final C6282f f17415a = C6282f.m25891n("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f17416b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f17417c = new String[64];

    /* renamed from: d */
    static final String[] f17418d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f17418d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C6130c.m25055r("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f17417c;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            f17417c[i4 | 8] = f17417c[i4] + "|PADDED";
        }
        String[] strArr3 = f17417c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr4 = f17417c;
                int i9 = i8 | i6;
                strArr4[i9] = f17417c[i8] + '|' + f17417c[i6];
                f17417c[i9 | 8] = f17417c[i8] + '|' + f17417c[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr5 = f17417c;
            if (i < strArr5.length) {
                if (strArr5[i] == null) {
                    strArr5[i] = f17418d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C6185e() {
    }

    /* renamed from: a */
    static String m25290a(byte b, byte b2) {
        if (b2 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f17418d[b2];
            }
            if (!(b == 7 || b == 8)) {
                String[] strArr = f17417c;
                String str = b2 < strArr.length ? strArr[b2] : f17418d[b2];
                return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f17418d[b2];
    }

    /* renamed from: b */
    static String m25291b(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f17416b;
        String r = b < strArr.length ? strArr[b] : C6130c.m25055r("0x%02x", Byte.valueOf(b));
        String a = m25290a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = r;
        objArr[4] = a;
        return C6130c.m25055r("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: c */
    static IllegalArgumentException m25292c(String str, Object... objArr) {
        throw new IllegalArgumentException(C6130c.m25055r(str, objArr));
    }

    /* renamed from: d */
    static IOException m25293d(String str, Object... objArr) throws IOException {
        throw new IOException(C6130c.m25055r(str, objArr));
    }
}
