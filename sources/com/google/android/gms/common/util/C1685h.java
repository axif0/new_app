package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public class C1685h implements C1682e {

    /* renamed from: a */
    private static final C1685h f5565a = new C1685h();

    private C1685h() {
    }

    /* renamed from: d */
    public static C1682e m7946d() {
        return f5565a;
    }

    /* renamed from: a */
    public long mo6585a() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public long mo6586b() {
        return System.nanoTime();
    }

    /* renamed from: c */
    public long mo6587c() {
        return System.currentTimeMillis();
    }
}
