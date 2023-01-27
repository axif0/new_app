package p086f.p111h.p118i;

/* renamed from: f.h.i.a */
public final class C3307a {

    /* renamed from: a */
    private boolean f10545a;

    /* renamed from: b */
    private C3308a f10546b;

    /* renamed from: c */
    private Object f10547c;

    /* renamed from: d */
    private boolean f10548d;

    /* renamed from: f.h.i.a$a */
    public interface C3308a {
        /* renamed from: a */
        void mo3325a();
    }

    /* renamed from: d */
    private void m14256d() {
        while (this.f10548d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.mo3325a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f10548d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f10548d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11469a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f10545a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.f10545a = r0     // Catch:{ all -> 0x003e }
            r4.f10548d = r0     // Catch:{ all -> 0x003e }
            f.h.i.a$a r0 = r4.f10546b     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.f10547c     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.mo3325a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.f10548d = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.f10548d = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p118i.C3307a.mo11469a():void");
    }

    /* renamed from: b */
    public boolean mo11470b() {
        boolean z;
        synchronized (this) {
            z = this.f10545a;
        }
        return z;
    }

    /* renamed from: c */
    public void mo11471c(C3308a aVar) {
        synchronized (this) {
            m14256d();
            if (this.f10546b != aVar) {
                this.f10546b = aVar;
                if (this.f10545a) {
                    if (aVar != null) {
                        aVar.mo3325a();
                    }
                }
            }
        }
    }
}
