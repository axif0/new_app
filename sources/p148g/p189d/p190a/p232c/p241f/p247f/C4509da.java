package p148g.p189d.p190a.p232c.p241f.p247f;

import p340io.realm.internal.OsSharedRealm;

/* renamed from: g.d.a.c.f.f.da */
final class C4509da {
    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m19244f(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C4636k7 {
        if (m19253o(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m19253o(b3) || m19253o(b4)) {
            throw C4636k7.m19828f();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + OsSharedRealm.FILE_EXCEPTION_KIND_ACCESS_ERROR);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m19245g(byte b, byte b2, byte b3, char[] cArr, int i) throws C4636k7 {
        if (m19253o(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m19253o(b3)))) {
            throw C4636k7.m19828f();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m19246h(byte b, byte b2, char[] cArr, int i) throws C4636k7 {
        if (b < -62 || m19253o(b2)) {
            throw C4636k7.m19828f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m19247i(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m19250l(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m19251m(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m19252n(byte b) {
        return b < -16;
    }

    /* renamed from: o */
    private static boolean m19253o(byte b) {
        return b > -65;
    }
}
