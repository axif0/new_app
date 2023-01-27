package p148g.p189d.p190a.p232c.p236c;

import android.os.IBinder;

/* renamed from: g.d.a.c.c.o */
final /* synthetic */ class C4352o implements Runnable {

    /* renamed from: f */
    private final C4347j f13872f;

    /* renamed from: g */
    private final IBinder f13873g;

    C4352o(C4347j jVar, IBinder iBinder) {
        this.f13872f = jVar;
        this.f13873g = iBinder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r0.mo13647c(0, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000a, B:9:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            g.d.a.c.c.j r0 = r4.f13872f
            android.os.IBinder r1 = r4.f13873g
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "Null service connection"
            r0.mo13647c(r2, r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x000f:
            g.d.a.c.c.s r3 = new g.d.a.c.c.s     // Catch:{ RemoteException -> 0x0020 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0020 }
            r0.f13865c = r3     // Catch:{ RemoteException -> 0x0020 }
            r1 = 2
            r0.f13863a = r1     // Catch:{ all -> 0x001e }
            r0.mo13645a()     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r1 = move-exception
            goto L_0x002a
        L_0x0020:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x001e }
            r0.mo13647c(r2, r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p236c.C4352o.run():void");
    }
}
