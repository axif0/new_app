package p351k.p352a0;

import p351k.p361v.p363d.C5956g;

/* renamed from: k.a0.l */
class C5838l extends C5837k {
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24335a(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            p351k.p361v.p363d.C5956g.m24500e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            k.x.c r0 = p351k.p352a0.C5839m.m24339e(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            k.r.v r3 = (p351k.p353r.C5882v) r3
            int r3 = r3.mo16953c()
            char r3 = r4.charAt(r3)
            boolean r3 = p351k.p352a0.C5827a.m24327a(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p351k.p352a0.C5838l.m24335a(java.lang.CharSequence):boolean");
    }

    /* renamed from: b */
    public static final boolean m24336b(String str, int i, String str2, int i2, int i3, boolean z) {
        C5956g.m24500e(str, "$this$regionMatches");
        C5956g.m24500e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: c */
    public static final boolean m24337c(String str, String str2, boolean z) {
        C5956g.m24500e(str, "$this$startsWith");
        C5956g.m24500e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m24336b(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m24338d(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24337c(str, str2, z);
    }
}
