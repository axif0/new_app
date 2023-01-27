package com.bumptech.glide.p025q;

import com.bumptech.glide.p025q.C1362d;

/* renamed from: com.bumptech.glide.q.b */
public final class C1360b implements C1362d, C1361c {

    /* renamed from: a */
    private final Object f4698a;

    /* renamed from: b */
    private final C1362d f4699b;

    /* renamed from: c */
    private volatile C1361c f4700c;

    /* renamed from: d */
    private volatile C1361c f4701d;

    /* renamed from: e */
    private C1362d.C1363a f4702e;

    /* renamed from: f */
    private C1362d.C1363a f4703f;

    public C1360b(Object obj, C1362d dVar) {
        C1362d.C1363a aVar = C1362d.C1363a.CLEARED;
        this.f4702e = aVar;
        this.f4703f = aVar;
        this.f4698a = obj;
        this.f4699b = dVar;
    }

    /* renamed from: l */
    private boolean m6789l(C1361c cVar) {
        return cVar.equals(this.f4700c) || (this.f4702e == C1362d.C1363a.FAILED && cVar.equals(this.f4701d));
    }

    /* renamed from: m */
    private boolean m6790m() {
        C1362d dVar = this.f4699b;
        return dVar == null || dVar.mo5829k(this);
    }

    /* renamed from: n */
    private boolean m6791n() {
        C1362d dVar = this.f4699b;
        return dVar == null || dVar.mo5819c(this);
    }

    /* renamed from: o */
    private boolean m6792o() {
        C1362d dVar = this.f4699b;
        return dVar == null || dVar.mo5821d(this);
    }

    /* renamed from: p */
    private boolean m6793p() {
        C1362d dVar = this.f4699b;
        return dVar != null && dVar.mo5818b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5817a(com.bumptech.glide.p025q.C1361c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4698a
            monitor-enter(r0)
            com.bumptech.glide.q.c r1 = r2.f4701d     // Catch:{ all -> 0x002f }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x0020
            com.bumptech.glide.q.d$a r3 = com.bumptech.glide.p025q.C1362d.C1363a.FAILED     // Catch:{ all -> 0x002f }
            r2.f4702e = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.q.d$a r3 = r2.f4703f     // Catch:{ all -> 0x002f }
            com.bumptech.glide.q.d$a r1 = com.bumptech.glide.p025q.C1362d.C1363a.RUNNING     // Catch:{ all -> 0x002f }
            if (r3 == r1) goto L_0x001e
            com.bumptech.glide.q.d$a r3 = com.bumptech.glide.p025q.C1362d.C1363a.RUNNING     // Catch:{ all -> 0x002f }
            r2.f4703f = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.q.c r3 = r2.f4701d     // Catch:{ all -> 0x002f }
            r3.mo5825h()     // Catch:{ all -> 0x002f }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0020:
            com.bumptech.glide.q.d$a r3 = com.bumptech.glide.p025q.C1362d.C1363a.FAILED     // Catch:{ all -> 0x002f }
            r2.f4703f = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.q.d r3 = r2.f4699b     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            com.bumptech.glide.q.d r3 = r2.f4699b     // Catch:{ all -> 0x002f }
            r3.mo5817a(r2)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025q.C1360b.mo5817a(com.bumptech.glide.q.c):void");
    }

    /* renamed from: b */
    public boolean mo5818b() {
        boolean z;
        synchronized (this.f4698a) {
            if (!m6793p()) {
                if (!mo5828j()) {
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
        synchronized (this.f4698a) {
            z = m6791n() && m6789l(cVar);
        }
        return z;
    }

    public void clear() {
        synchronized (this.f4698a) {
            this.f4702e = C1362d.C1363a.CLEARED;
            this.f4700c.clear();
            if (this.f4703f != C1362d.C1363a.CLEARED) {
                this.f4703f = C1362d.C1363a.CLEARED;
                this.f4701d.clear();
            }
        }
    }

    /* renamed from: d */
    public boolean mo5821d(C1361c cVar) {
        boolean z;
        synchronized (this.f4698a) {
            z = m6792o() && m6789l(cVar);
        }
        return z;
    }

    /* renamed from: e */
    public void mo5822e() {
        synchronized (this.f4698a) {
            if (this.f4702e == C1362d.C1363a.RUNNING) {
                this.f4702e = C1362d.C1363a.PAUSED;
                this.f4700c.mo5822e();
            }
            if (this.f4703f == C1362d.C1363a.RUNNING) {
                this.f4703f = C1362d.C1363a.PAUSED;
                this.f4701d.mo5822e();
            }
        }
    }

    /* renamed from: f */
    public boolean mo5823f(C1361c cVar) {
        if (!(cVar instanceof C1360b)) {
            return false;
        }
        C1360b bVar = (C1360b) cVar;
        return this.f4700c.mo5823f(bVar.f4700c) && this.f4701d.mo5823f(bVar.f4701d);
    }

    /* renamed from: g */
    public boolean mo5824g() {
        boolean z;
        synchronized (this.f4698a) {
            z = this.f4702e == C1362d.C1363a.CLEARED && this.f4703f == C1362d.C1363a.CLEARED;
        }
        return z;
    }

    /* renamed from: h */
    public void mo5825h() {
        synchronized (this.f4698a) {
            if (this.f4702e != C1362d.C1363a.RUNNING) {
                this.f4702e = C1362d.C1363a.RUNNING;
                this.f4700c.mo5825h();
            }
        }
    }

    /* renamed from: i */
    public void mo5826i(C1361c cVar) {
        synchronized (this.f4698a) {
            if (cVar.equals(this.f4700c)) {
                this.f4702e = C1362d.C1363a.SUCCESS;
            } else if (cVar.equals(this.f4701d)) {
                this.f4703f = C1362d.C1363a.SUCCESS;
            }
            if (this.f4699b != null) {
                this.f4699b.mo5826i(this);
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f4698a) {
            if (this.f4702e != C1362d.C1363a.RUNNING) {
                if (this.f4703f != C1362d.C1363a.RUNNING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo5828j() {
        boolean z;
        synchronized (this.f4698a) {
            if (this.f4702e != C1362d.C1363a.SUCCESS) {
                if (this.f4703f != C1362d.C1363a.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo5829k(C1361c cVar) {
        boolean z;
        synchronized (this.f4698a) {
            z = m6790m() && m6789l(cVar);
        }
        return z;
    }

    /* renamed from: q */
    public void mo5830q(C1361c cVar, C1361c cVar2) {
        this.f4700c = cVar;
        this.f4701d = cVar2;
    }
}
