package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.g */
public final class C6045g extends C6049i {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f17010c = AtomicIntegerFieldUpdater.newUpdater(C6045g.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6045g(p351k.p355t.C5895d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "continuation"
            p351k.p361v.p363d.C5956g.m24501f(r3, r0)
            if (r4 == 0) goto L_0x0008
            goto L_0x0023
        L_0x0008:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x0023:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6045g.<init>(k.t.d, java.lang.Throwable, boolean):void");
    }

    /* renamed from: b */
    public final boolean mo17130b() {
        return f17010c.compareAndSet(this, 0, 1);
    }
}
