package p385n;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: n.a */
public class C6272a extends C6301t {

    /* renamed from: h */
    private static final long f17764h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i */
    private static final long f17765i = TimeUnit.MILLISECONDS.toNanos(f17764h);

    /* renamed from: j */
    static C6272a f17766j;

    /* renamed from: e */
    private boolean f17767e;

    /* renamed from: f */
    private C6272a f17768f;

    /* renamed from: g */
    private long f17769g;

    /* renamed from: n.a$a */
    class C6273a implements C6299r {

        /* renamed from: f */
        final /* synthetic */ C6299r f17770f;

        C6273a(C6299r rVar) {
            this.f17770f = rVar;
        }

        public void close() throws IOException {
            C6272a.this.mo17785k();
            try {
                this.f17770f.close();
                C6272a.this.mo17787m(true);
            } catch (IOException e) {
                throw C6272a.this.mo17786l(e);
            } catch (Throwable th) {
                C6272a.this.mo17787m(false);
                throw th;
            }
        }

        /* renamed from: f */
        public void mo17384f(C6277c cVar, long j) throws IOException {
            C6303u.m26019b(cVar.f17777g, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C6296o oVar = cVar.f17776f;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (oVar.f17812c - oVar.f17811b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        oVar = oVar.f17815f;
                    }
                    C6272a.this.mo17785k();
                    try {
                        this.f17770f.mo17384f(cVar, j2);
                        j -= j2;
                        C6272a.this.mo17787m(true);
                    } catch (IOException e) {
                        throw C6272a.this.mo17786l(e);
                    } catch (Throwable th) {
                        C6272a.this.mo17787m(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public void flush() throws IOException {
            C6272a.this.mo17785k();
            try {
                this.f17770f.flush();
                C6272a.this.mo17787m(true);
            } catch (IOException e) {
                throw C6272a.this.mo17786l(e);
            } catch (Throwable th) {
                C6272a.this.mo17787m(false);
                throw th;
            }
        }

        public C6301t timeout() {
            return C6272a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f17770f + ")";
        }
    }

    /* renamed from: n.a$b */
    class C6274b implements C6300s {

        /* renamed from: f */
        final /* synthetic */ C6300s f17772f;

        C6274b(C6300s sVar) {
            this.f17772f = sVar;
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            C6272a.this.mo17785k();
            try {
                long O = this.f17772f.mo17355O(cVar, j);
                C6272a.this.mo17787m(true);
                return O;
            } catch (IOException e) {
                throw C6272a.this.mo17786l(e);
            } catch (Throwable th) {
                C6272a.this.mo17787m(false);
                throw th;
            }
        }

        public void close() throws IOException {
            try {
                this.f17772f.close();
                C6272a.this.mo17787m(true);
            } catch (IOException e) {
                throw C6272a.this.mo17786l(e);
            } catch (Throwable th) {
                C6272a.this.mo17787m(false);
                throw th;
            }
        }

        public C6301t timeout() {
            return C6272a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f17772f + ")";
        }
    }

    /* renamed from: n.a$c */
    private static final class C6275c extends Thread {
        C6275c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo17531t();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<n.a> r0 = p385n.C6272a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                n.a r1 = p385n.C6272a.m25781i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                n.a r2 = p385n.C6272a.f17766j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                p385n.C6272a.f17766j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo17531t()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: p385n.C6272a.C6275c.run():void");
        }
    }

    /* renamed from: i */
    static C6272a m25781i() throws InterruptedException {
        Class<C6272a> cls = C6272a.class;
        C6272a aVar = f17766j.f17768f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            cls.wait(f17764h);
            if (f17766j.f17768f != null || System.nanoTime() - nanoTime < f17765i) {
                return null;
            }
            return f17766j;
        }
        long p = aVar.m25783p(nanoTime);
        if (p > 0) {
            long j = p / 1000000;
            cls.wait(j, (int) (p - (1000000 * j)));
            return null;
        }
        f17766j.f17768f = aVar.f17768f;
        aVar.f17768f = null;
        return aVar;
    }

    /* renamed from: j */
    private static synchronized boolean m25782j(C6272a aVar) {
        boolean z;
        synchronized (C6272a.class) {
            C6272a aVar2 = f17766j;
            while (true) {
                if (aVar2 == null) {
                    z = true;
                    break;
                } else if (aVar2.f17768f == aVar) {
                    aVar2.f17768f = aVar.f17768f;
                    aVar.f17768f = null;
                    z = false;
                    break;
                } else {
                    aVar2 = aVar2.f17768f;
                }
            }
        }
        return z;
    }

    /* renamed from: p */
    private long m25783p(long j) {
        return this.f17769g - j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054 A[EDGE_INSN: B:34:0x0054->B:23:0x0054 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m25784q(p385n.C6272a r6, long r7, boolean r9) {
        /*
            java.lang.Class<n.a> r0 = p385n.C6272a.class
            monitor-enter(r0)
            n.a r1 = f17766j     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0016
            n.a r1 = new n.a     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            f17766j = r1     // Catch:{ all -> 0x0069 }
            n.a$c r1 = new n.a$c     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            r1.start()     // Catch:{ all -> 0x0069 }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0069 }
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x002f
            long r3 = r6.mo17900c()     // Catch:{ all -> 0x0069 }
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x0069 }
        L_0x002b:
            long r7 = r7 + r1
            r6.f17769g = r7     // Catch:{ all -> 0x0069 }
            goto L_0x003c
        L_0x002f:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            goto L_0x002b
        L_0x0034:
            if (r9 == 0) goto L_0x0063
            long r7 = r6.mo17900c()     // Catch:{ all -> 0x0069 }
            r6.f17769g = r7     // Catch:{ all -> 0x0069 }
        L_0x003c:
            long r7 = r6.m25783p(r1)     // Catch:{ all -> 0x0069 }
            n.a r9 = f17766j     // Catch:{ all -> 0x0069 }
        L_0x0042:
            n.a r3 = r9.f17768f     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0054
            n.a r3 = r9.f17768f     // Catch:{ all -> 0x0069 }
            long r3 = r3.m25783p(r1)     // Catch:{ all -> 0x0069 }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            n.a r9 = r9.f17768f     // Catch:{ all -> 0x0069 }
            goto L_0x0042
        L_0x0054:
            n.a r7 = r9.f17768f     // Catch:{ all -> 0x0069 }
            r6.f17768f = r7     // Catch:{ all -> 0x0069 }
            r9.f17768f = r6     // Catch:{ all -> 0x0069 }
            n.a r6 = f17766j     // Catch:{ all -> 0x0069 }
            if (r9 != r6) goto L_0x0061
            r0.notify()     // Catch:{ all -> 0x0069 }
        L_0x0061:
            monitor-exit(r0)
            return
        L_0x0063:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x0069 }
            r6.<init>()     // Catch:{ all -> 0x0069 }
            throw r6     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x006d
        L_0x006c:
            throw r6
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: p385n.C6272a.m25784q(n.a, long, boolean):void");
    }

    /* renamed from: k */
    public final void mo17785k() {
        if (!this.f17767e) {
            long h = mo17905h();
            boolean e = mo17902e();
            if (h != 0 || e) {
                this.f17767e = true;
                m25784q(this, h, e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final IOException mo17786l(IOException iOException) throws IOException {
        return !mo17788n() ? iOException : mo17530o(iOException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo17787m(boolean z) throws IOException {
        if (mo17788n() && z) {
            throw mo17530o((IOException) null);
        }
    }

    /* renamed from: n */
    public final boolean mo17788n() {
        if (!this.f17767e) {
            return false;
        }
        this.f17767e = false;
        return m25782j(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public IOException mo17530o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: r */
    public final C6299r mo17789r(C6299r rVar) {
        return new C6273a(rVar);
    }

    /* renamed from: s */
    public final C6300s mo17790s(C6300s sVar) {
        return new C6274b(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo17531t() {
    }
}
