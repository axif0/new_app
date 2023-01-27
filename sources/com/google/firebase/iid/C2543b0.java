package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p148g.p189d.p190a.p232c.p250h.C4927a;

/* renamed from: com.google.firebase.iid.b0 */
public final class C2543b0 {

    /* renamed from: a */
    private static final long f8252a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f8253b = new Object();

    /* renamed from: c */
    private static C4927a f8254c;

    /* renamed from: a */
    private static void m11399a(Context context) {
        if (f8254c == null) {
            C4927a aVar = new C4927a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f8254c = aVar;
            aVar.mo14857c(true);
        }
    }

    /* renamed from: b */
    public static void m11400b(Intent intent) {
        synchronized (f8253b) {
            if (f8254c != null && m11401c(intent)) {
                m11402d(intent, false);
                f8254c.mo14856b();
            }
        }
    }

    /* renamed from: c */
    static boolean m11401c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    private static void m11402d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m11403e(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = f8253b
            monitor-enter(r0)
            m11399a(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m11401c(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m11402d(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            g.d.a.c.h.a r4 = f8254c     // Catch:{ all -> 0x0022 }
            long r1 = f8252a     // Catch:{ all -> 0x0022 }
            r4.mo14855a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2543b0.m11403e(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
