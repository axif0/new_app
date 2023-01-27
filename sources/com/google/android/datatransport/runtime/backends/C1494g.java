package com.google.android.datatransport.runtime.backends;

/* renamed from: com.google.android.datatransport.runtime.backends.g */
public abstract class C1494g {

    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    public enum C1495a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* renamed from: a */
    public static C1494g m7262a() {
        return new C1488b(C1495a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C1494g m7263d(long j) {
        return new C1488b(C1495a.OK, j);
    }

    /* renamed from: e */
    public static C1494g m7264e() {
        return new C1488b(C1495a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo6126b();

    /* renamed from: c */
    public abstract C1495a mo6127c();
}
