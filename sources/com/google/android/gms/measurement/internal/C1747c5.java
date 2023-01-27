package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
final class C1747c5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f5698a;

    /* renamed from: b */
    private final /* synthetic */ C1723a5 f5699b;

    public C1747c5(C1723a5 a5Var, String str) {
        this.f5699b = a5Var;
        C1658o.m7845j(str);
        this.f5698a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f5699b.mo6709i().mo6764E().mo6886b(this.f5698a, th);
    }
}
