package com.google.android.gms.common.util.p038q;

import com.google.android.gms.common.internal.C1658o;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.q.a */
public class C1694a implements ThreadFactory {

    /* renamed from: a */
    private final String f5577a;

    /* renamed from: b */
    private final ThreadFactory f5578b;

    public C1694a(String str) {
        this(str, 0);
    }

    private C1694a(String str, int i) {
        this.f5578b = Executors.defaultThreadFactory();
        C1658o.m7846k(str, "Name must not be null");
        this.f5577a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f5578b.newThread(new C1695b(runnable, 0));
        newThread.setName(this.f5577a);
        return newThread;
    }
}
