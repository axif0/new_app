package com.bumptech.glide.load.p006n.p007o;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.n.o.b */
public final class C1029b {
    /* renamed from: a */
    public static boolean m5635a(Uri uri) {
        return m5636b(uri) && !m5639e(uri);
    }

    /* renamed from: b */
    public static boolean m5636b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m5637c(Uri uri) {
        return m5636b(uri) && m5639e(uri);
    }

    /* renamed from: d */
    public static boolean m5638d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m5639e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
