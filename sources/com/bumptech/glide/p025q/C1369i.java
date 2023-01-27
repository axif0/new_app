package com.bumptech.glide.p025q;

import com.bumptech.glide.p025q.C1362d;

/* renamed from: com.bumptech.glide.q.i */
public class C1369i implements C1362d, C1361c {

    /* renamed from: a */
    private final C1362d f4748a;

    /* renamed from: b */
    private final Object f4749b;

    /* renamed from: c */
    private volatile C1361c f4750c;

    /* renamed from: d */
    private volatile C1361c f4751d;

    /* renamed from: e */
    private C1362d.C1363a f4752e;

    /* renamed from: f */
    private C1362d.C1363a f4753f;

    /* renamed from: g */
    private boolean f4754g;

    public C1369i(Object obj, C1362d dVar) {
        C1362d.C1363a aVar = C1362d.C1363a.CLEARED;
        this.f4752e = aVar;
        this.f4753f = aVar;
        this.f4749b = obj;
        this.f4748a = dVar;
    }

    /* renamed from: l */
    private boolean m6853l() {
        boolean z;
        synchronized (this.f4749b) {
            if (this.f4752e != C1362d.C1363a.SUCCESS) {
                if (this.f4753f != C1362d.C1363a.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    private boolean m6854m() {
        C1362d dVar = this.f4748a;
        return dVar == null || dVar.mo5829k(this);
    }

    /* renamed from: n */
    private boolean m6855n() {
        C1362d dVar = this.f4748a;
        return dVar == null || dVar.mo5819c(this);
    }

    /* renamed from: o */
    private boolean m6856o() {
        C1362d dVar = this.f4748a;
        return dVar == null || dVar.mo5821d(this);
    }

    /* renamed from: p */
    private boolean m6857p() {
        C1362d dVar = this.f4748a;
        return dVar != null && dVar.mo5818b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5817a(com.bumptech.glide.p025q.C1361c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4749b
            monitor-enter(r0)
            com.bumptech.glide.q.c r1 = r2.f4750c     // Catch:{ all -> 0x0020 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0020 }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.q.d$a r3 = com.bumptech.glide.p025q.C1362d.C1363a.FAILED     // Catch:{ all -> 0x0020 }
            r2.f4753f = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0011:
            com.bumptech.glide.q.d$a r3 = com.bumptech.glide.p025q.C1362d.C1363a.FAILED     // Catch:{ all -> 0x0020 }
            r2.f4752e = r3     // Catch:{ all -> 0x0020 }
            com.bumptech.glide.q.d r3 = r2.f4748a     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            com.bumptech.glide.q.d r3 = r2.f4748a     // Catch:{ all -> 0x0020 }
            r3.mo5817a(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025q.C1369i.mo5817a(com.bumptech.glide.q.c):void");
    }

    /* renamed from: b */
    public boolean mo5818b() {
        boolean z;
        synchronized (this.f4749b) {
            if (!m6857p()) {
                if (!m6853l()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo5819c(C1361c cVar) {
        boolean z;
        synchronized (this.f4749b) {
            z = m6855n() && cVar.equals(this.f4750c) && !m6853l();
        }
        return z;
    }

    public void clear() {
        synchronized (this.f4749b) {
            this.f4754g = false;
            this.f4752e = C1362d.C1363a.CLEARED;
            this.f4753f = C1362d.C1363a.CLEARED;
            this.f4751d.clear();
            this.f4750c.clear();
        }
    }

    /* renamed from: d */
    public boolean mo5821d(C1361c cVar) {
        boolean z;
        synchronized (this.f4749b) {
            z = m6856o() && (cVar.equals(this.f4750c) || this.f4752e != C1362d.C1363a.SUCCESS);
        }
        return z;
    }

    /* renamed from: e */
    public void mo5822e() {
        synchronized (this.f4749b) {
            if (!this.f4753f.mo5831e()) {
                this.f4753f = C1362d.C1363a.PAUSED;
                this.f4751d.mo5822e();
            }
            if (!this.f4752e.mo5831e()) {
                this.f4752e = C1362d.C1363a.PAUSED;
                this.f4750c.mo5822e();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5823f(com.bumptech.glide.p025q.C1361c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.p025q.C1369i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.q.i r4 = (com.bumptech.glide.p025q.C1369i) r4
            com.bumptech.glide.q.c r0 = r3.f4750c
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.q.c r0 = r4.f4750c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.bumptech.glide.q.c r0 = r3.f4750c
            com.bumptech.glide.q.c r2 = r4.f4750c
            boolean r0 = r0.mo5823f(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.bumptech.glide.q.c r0 = r3.f4751d
            if (r0 != 0) goto L_0x0023
            com.bumptech.glide.q.c r4 = r4.f4751d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.bumptech.glide.q.c r0 = r3.f4751d
            com.bumptech.glide.q.c r4 = r4.f4751d
            boolean r4 = r0.mo5823f(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025q.C1369i.mo5823f(com.bumptech.glide.q.c):boolean");
    }

    /* renamed from: g */
    public boolean mo5824g() {
        boolean z;
        synchronized (this.f4749b) {
            z = this.f4752e == C1362d.C1363a.CLEARED;
        }
        return z;
    }

    /* renamed from: h */
    public void mo5825h() {
        synchronized (this.f4749b) {
            this.f4754g = true;
            try {
                if (!(this.f4752e == C1362d.C1363a.SUCCESS || this.f4753f == C1362d.C1363a.RUNNING)) {
                    this.f4753f = C1362d.C1363a.RUNNING;
                    this.f4751d.mo5825h();
                }
                if (this.f4754g && this.f4752e != C1362d.C1363a.RUNNING) {
                    this.f4752e = C1362d.C1363a.RUNNING;
                    this.f4750c.mo5825h();
                }
            } finally {
                this.f4754g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5826i(com.bumptech.glide.p025q.C1361c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4749b
            monitor-enter(r0)
            com.bumptech.glide.q.c r1 = r2.f4751d     // Catch:{ all -> 0x002d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.q.d$a r3 = com.bumptech.glide.p025q.C1362d.C1363a.SUCCESS     // Catch:{ all -> 0x002d }
            r2.f4753f = r3     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0011:
            com.bumptech.glide.q.d$a r3 = com.bumptech.glide.p025q.C1362d.C1363a.SUCCESS     // Catch:{ all -> 0x002d }
            r2.f4752e = r3     // Catch:{ all -> 0x002d }
            com.bumptech.glide.q.d r3 = r2.f4748a     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x001e
            com.bumptech.glide.q.d r3 = r2.f4748a     // Catch:{ all -> 0x002d }
            r3.mo5826i(r2)     // Catch:{ all -> 0x002d }
        L_0x001e:
            com.bumptech.glide.q.d$a r3 = r2.f4753f     // Catch:{ all -> 0x002d }
            boolean r3 = r3.mo5831e()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002b
            com.bumptech.glide.q.c r3 = r2.f4751d     // Catch:{ all -> 0x002d }
            r3.clear()     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025q.C1369i.mo5826i(com.bumptech.glide.q.c):void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f4749b) {
            z = this.f4752e == C1362d.C1363a.RUNNING;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo5828j() {
        boolean z;
        synchronized (this.f4749b) {
            z = this.f4752e == C1362d.C1363a.SUCCESS;
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo5829k(C1361c cVar) {
        boolean z;
        synchronized (this.f4749b) {
            z = m6854m() && cVar.equals(this.f4750c) && this.f4752e != C1362d.C1363a.PAUSED;
        }
        return z;
    }

    /* renamed from: q */
    public void mo5836q(C1361c cVar, C1361c cVar2) {
        this.f4750c = cVar;
        this.f4751d = cVar2;
    }
}
