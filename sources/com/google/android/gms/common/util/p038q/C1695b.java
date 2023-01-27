package com.google.android.gms.common.util.p038q;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.q.b */
final class C1695b implements Runnable {

    /* renamed from: f */
    private final Runnable f5579f;

    /* renamed from: g */
    private final int f5580g;

    public C1695b(Runnable runnable, int i) {
        this.f5579f = runnable;
        this.f5580g = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f5580g);
        this.f5579f.run();
    }
}
