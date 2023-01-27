package p340io.realm.internal.p343u;

import p340io.realm.C5765m;
import p340io.realm.internal.p343u.C5739a;

/* renamed from: io.realm.internal.u.c */
public abstract class C5741c<T extends C5739a> implements Runnable {

    /* renamed from: f */
    private final int f16581f;

    public C5741c() {
        this(2147483646);
    }

    public C5741c(int i) {
        this.f16581f = i;
    }

    /* renamed from: a */
    private static long m23997a(int i, long j) {
        double pow = ((Math.pow(2.0d, (double) i) - 1.0d) / 2.0d) * 1000.0d * 1.0d;
        return ((double) j) < pow ? j : (long) pow;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo16195b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo16681c(T t) {
        return t != null && t.mo16678b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo16196d(T t);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo16197e(T t);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo16682f(T t) {
        if (Thread.interrupted()) {
            return true;
        }
        return !t.mo16678b() && t.mo16677a().mo16804a() != C5765m.IO_EXCEPTION;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0008  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x0047
            int r1 = r1 + 1
            int r2 = r1 + -1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            r4 = 5
            long r3 = r3.toMillis(r4)
            long r2 = m23997a(r2, r3)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x002a
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Incremental backoff was interrupted."
            p340io.realm.log.RealmLog.m24075a(r1, r0)
            return
        L_0x002a:
            io.realm.internal.u.a r2 = r7.mo16195b()
            boolean r3 = r7.mo16681c(r2)
            if (r3 == 0) goto L_0x0038
            r7.mo16197e(r2)
            goto L_0x0047
        L_0x0038:
            boolean r3 = r7.mo16682f(r2)
            if (r3 != 0) goto L_0x0044
            int r3 = r7.f16581f
            int r3 = r3 + 1
            if (r1 != r3) goto L_0x0002
        L_0x0044:
            r7.mo16196d(r2)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.internal.p343u.C5741c.run():void");
    }
}
