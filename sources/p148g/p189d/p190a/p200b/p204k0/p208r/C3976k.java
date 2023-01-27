package p148g.p189d.p190a.p200b.p204k0.p208r;

import android.util.Log;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.k0.r.k */
public final class C3976k {

    /* renamed from: a */
    public final String f12350a;

    /* renamed from: b */
    public final C3927n.C3928a f12351b;

    /* renamed from: c */
    public final int f12352c;

    /* renamed from: d */
    public final byte[] f12353d;

    public C3976k(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        C4260a.m18069a((bArr2 != null ? false : z2) ^ (i == 0));
        this.f12350a = str;
        this.f12352c = i;
        this.f12353d = bArr2;
        this.f12351b = new C3927n.C3928a(m16739a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    private static int m16739a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        if (c == 2 || c == 3) {
            return 2;
        }
        Log.w("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        return 1;
    }
}
