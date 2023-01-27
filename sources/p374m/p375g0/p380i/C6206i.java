package p374m.p375g0.p380i;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import p374m.C6255s;
import p374m.p375g0.C6130c;
import p374m.p375g0.p380i.C6180c;
import p385n.C6272a;
import p385n.C6277c;
import p385n.C6281e;
import p385n.C6299r;
import p385n.C6300s;
import p385n.C6301t;

/* renamed from: m.g0.i.i */
public final class C6206i {

    /* renamed from: a */
    long f17502a = 0;

    /* renamed from: b */
    long f17503b;

    /* renamed from: c */
    final int f17504c;

    /* renamed from: d */
    final C6188g f17505d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Deque<C6255s> f17506e = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6180c.C6181a f17507f;

    /* renamed from: g */
    private boolean f17508g;

    /* renamed from: h */
    private final C6208b f17509h;

    /* renamed from: i */
    final C6207a f17510i;

    /* renamed from: j */
    final C6209c f17511j = new C6209c();

    /* renamed from: k */
    final C6209c f17512k = new C6209c();

    /* renamed from: l */
    C6179b f17513l = null;

    /* renamed from: m.g0.i.i$a */
    final class C6207a implements C6299r {

        /* renamed from: f */
        private final C6277c f17514f = new C6277c();

        /* renamed from: g */
        boolean f17515g;

        /* renamed from: h */
        boolean f17516h;

        C6207a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m25408a(boolean z) throws IOException {
            long min;
            synchronized (C6206i.this) {
                C6206i.this.f17512k.mo17785k();
                while (C6206i.this.f17503b <= 0 && !this.f17516h && !this.f17515g && C6206i.this.f17513l == null) {
                    try {
                        C6206i.this.mo17527t();
                    } catch (Throwable th) {
                        C6206i.this.f17512k.mo17532u();
                        throw th;
                    }
                }
                C6206i.this.f17512k.mo17532u();
                C6206i.this.mo17513e();
                min = Math.min(C6206i.this.f17503b, this.f17514f.mo17834l0());
                C6206i.this.f17503b -= min;
            }
            C6206i.this.f17512k.mo17785k();
            try {
                C6206i.this.f17505d.mo17484h0(C6206i.this.f17504c, z && min == this.f17514f.mo17834l0(), this.f17514f, min);
            } finally {
                C6206i.this.f17512k.mo17532u();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f17514f.mo17834l0() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f17514f.mo17834l0() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            m25408a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f17517i;
            r0.f17505d.mo17484h0(r0.f17504c, true, (p385n.C6277c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f17517i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f17515g = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f17517i.f17505d.flush();
            r8.f17517i.mo17512d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f17517i.f17510i.f17516h != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                m.g0.i.i r0 = p374m.p375g0.p380i.C6206i.this
                monitor-enter(r0)
                boolean r1 = r8.f17515g     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                m.g0.i.i r0 = p374m.p375g0.p380i.C6206i.this
                m.g0.i.i$a r0 = r0.f17510i
                boolean r0 = r0.f17516h
                r1 = 1
                if (r0 != 0) goto L_0x003a
                n.c r0 = r8.f17514f
                long r2 = r0.mo17834l0()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                n.c r0 = r8.f17514f
                long r2 = r0.mo17834l0()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.m25408a(r1)
                goto L_0x001f
            L_0x002d:
                m.g0.i.i r0 = p374m.p375g0.p380i.C6206i.this
                m.g0.i.g r2 = r0.f17505d
                int r3 = r0.f17504c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo17484h0(r3, r4, r5, r6)
            L_0x003a:
                m.g0.i.i r2 = p374m.p375g0.p380i.C6206i.this
                monitor-enter(r2)
                r8.f17515g = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                m.g0.i.i r0 = p374m.p375g0.p380i.C6206i.this
                m.g0.i.g r0 = r0.f17505d
                r0.flush()
                m.g0.i.i r0 = p374m.p375g0.p380i.C6206i.this
                r0.mo17512d()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                goto L_0x0054
            L_0x0053:
                throw r1
            L_0x0054:
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p380i.C6206i.C6207a.close():void");
        }

        /* renamed from: f */
        public void mo17384f(C6277c cVar, long j) throws IOException {
            this.f17514f.mo17384f(cVar, j);
            while (this.f17514f.mo17834l0() >= 16384) {
                m25408a(false);
            }
        }

        public void flush() throws IOException {
            synchronized (C6206i.this) {
                C6206i.this.mo17513e();
            }
            while (this.f17514f.mo17834l0() > 0) {
                m25408a(false);
                C6206i.this.f17505d.flush();
            }
        }

        public C6301t timeout() {
            return C6206i.this.f17512k;
        }
    }

    /* renamed from: m.g0.i.i$b */
    private final class C6208b implements C6300s {

        /* renamed from: f */
        private final C6277c f17518f = new C6277c();

        /* renamed from: g */
        private final C6277c f17519g = new C6277c();

        /* renamed from: h */
        private final long f17520h;

        /* renamed from: i */
        boolean f17521i;

        /* renamed from: j */
        boolean f17522j;

        C6208b(long j) {
            this.f17520h = j;
        }

        /* renamed from: h */
        private void m25410h(long j) {
            C6206i.this.f17505d.mo17483g0(j);
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            C6179b bVar;
            long j2;
            C6180c.C6181a aVar;
            C6255s sVar;
            long j3 = j;
            if (j3 >= 0) {
                while (true) {
                    synchronized (C6206i.this) {
                        C6206i.this.f17511j.mo17785k();
                        try {
                            bVar = C6206i.this.f17513l != null ? C6206i.this.f17513l : null;
                            if (!this.f17521i) {
                                if (C6206i.this.f17506e.isEmpty() || C6206i.this.f17507f == null) {
                                    if (this.f17519g.mo17834l0() > 0) {
                                        j2 = this.f17519g.mo17355O(cVar, Math.min(j3, this.f17519g.mo17834l0()));
                                        C6206i.this.f17502a += j2;
                                        if (bVar == null && C6206i.this.f17502a >= ((long) (C6206i.this.f17505d.f17443s.mo17559d() / 2))) {
                                            C6206i.this.f17505d.mo17488l0(C6206i.this.f17504c, C6206i.this.f17502a);
                                            C6206i.this.f17502a = 0;
                                        }
                                    } else {
                                        C6277c cVar2 = cVar;
                                        if (this.f17522j || bVar != null) {
                                            j2 = -1;
                                        } else {
                                            C6206i.this.mo17527t();
                                        }
                                    }
                                    sVar = null;
                                    aVar = null;
                                } else {
                                    sVar = (C6255s) C6206i.this.f17506e.removeFirst();
                                    aVar = C6206i.this.f17507f;
                                    C6277c cVar3 = cVar;
                                    j2 = -1;
                                }
                                C6206i.this.f17511j.mo17532u();
                                if (sVar != null && aVar != null) {
                                    aVar.mo17463a(sVar);
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            C6206i.this.f17511j.mo17532u();
                        }
                    }
                }
                if (j2 != -1) {
                    m25410h(j2);
                    return j2;
                } else if (bVar == null) {
                    return -1;
                } else {
                    throw new C6216n(bVar);
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j3);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17529a(C6281e eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C6206i.this) {
                    z = this.f17522j;
                    z2 = true;
                    z3 = this.f17519g.mo17834l0() + j > this.f17520h;
                }
                if (z3) {
                    eVar.mo17815c(j);
                    C6206i.this.mo17515h(C6179b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.mo17815c(j);
                    return;
                } else {
                    long O = eVar.mo17355O(this.f17518f, j);
                    if (O != -1) {
                        j -= O;
                        synchronized (C6206i.this) {
                            if (this.f17519g.mo17834l0() != 0) {
                                z2 = false;
                            }
                            this.f17519g.mo17850s0(this.f17518f);
                            if (z2) {
                                C6206i.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() throws IOException {
            long l0;
            C6180c.C6181a aVar;
            ArrayList<C6255s> arrayList;
            synchronized (C6206i.this) {
                this.f17521i = true;
                l0 = this.f17519g.mo17834l0();
                this.f17519g.mo17840q();
                aVar = null;
                if (C6206i.this.f17506e.isEmpty() || C6206i.this.f17507f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(C6206i.this.f17506e);
                    C6206i.this.f17506e.clear();
                    ArrayList arrayList3 = arrayList2;
                    aVar = C6206i.this.f17507f;
                    arrayList = arrayList3;
                }
                C6206i.this.notifyAll();
            }
            if (l0 > 0) {
                m25410h(l0);
            }
            C6206i.this.mo17512d();
            if (aVar != null) {
                for (C6255s a : arrayList) {
                    aVar.mo17463a(a);
                }
            }
        }

        public C6301t timeout() {
            return C6206i.this.f17511j;
        }
    }

    /* renamed from: m.g0.i.i$c */
    class C6209c extends C6272a {
        C6209c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo17530o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo17531t() {
            C6206i.this.mo17515h(C6179b.CANCEL);
        }

        /* renamed from: u */
        public void mo17532u() throws IOException {
            if (mo17788n()) {
                throw mo17530o((IOException) null);
            }
        }
    }

    C6206i(int i, C6188g gVar, boolean z, boolean z2, C6255s sVar) {
        if (gVar != null) {
            this.f17504c = i;
            this.f17505d = gVar;
            this.f17503b = (long) gVar.f17444t.mo17559d();
            this.f17509h = new C6208b((long) gVar.f17443s.mo17559d());
            C6207a aVar = new C6207a();
            this.f17510i = aVar;
            this.f17509h.f17522j = z2;
            aVar.f17516h = z;
            if (sVar != null) {
                this.f17506e.add(sVar);
            }
            if (mo17519l() && sVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo17519l() && sVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: g */
    private boolean m25389g(C6179b bVar) {
        synchronized (this) {
            if (this.f17513l != null) {
                return false;
            }
            if (this.f17509h.f17522j && this.f17510i.f17516h) {
                return false;
            }
            this.f17513l = bVar;
            notifyAll();
            this.f17505d.mo17477X(this.f17504c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17511c(long j) {
        this.f17503b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo17512d() throws IOException {
        boolean z;
        boolean m;
        synchronized (this) {
            z = !this.f17509h.f17522j && this.f17509h.f17521i && (this.f17510i.f17516h || this.f17510i.f17515g);
            m = mo17520m();
        }
        if (z) {
            mo17514f(C6179b.CANCEL);
        } else if (!m) {
            this.f17505d.mo17477X(this.f17504c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17513e() throws IOException {
        C6207a aVar = this.f17510i;
        if (aVar.f17515g) {
            throw new IOException("stream closed");
        } else if (aVar.f17516h) {
            throw new IOException("stream finished");
        } else if (this.f17513l != null) {
            throw new C6216n(this.f17513l);
        }
    }

    /* renamed from: f */
    public void mo17514f(C6179b bVar) throws IOException {
        if (m25389g(bVar)) {
            this.f17505d.mo17486j0(this.f17504c, bVar);
        }
    }

    /* renamed from: h */
    public void mo17515h(C6179b bVar) {
        if (m25389g(bVar)) {
            this.f17505d.mo17487k0(this.f17504c, bVar);
        }
    }

    /* renamed from: i */
    public int mo17516i() {
        return this.f17504c;
    }

    /* renamed from: j */
    public C6299r mo17517j() {
        synchronized (this) {
            if (!this.f17508g) {
                if (!mo17519l()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f17510i;
    }

    /* renamed from: k */
    public C6300s mo17518k() {
        return this.f17509h;
    }

    /* renamed from: l */
    public boolean mo17519l() {
        return this.f17505d.f17430f == ((this.f17504c & 1) == 1);
    }

    /* renamed from: m */
    public synchronized boolean mo17520m() {
        if (this.f17513l != null) {
            return false;
        }
        return (!this.f17509h.f17522j && !this.f17509h.f17521i) || (!this.f17510i.f17516h && !this.f17510i.f17515g) || !this.f17508g;
    }

    /* renamed from: n */
    public C6301t mo17521n() {
        return this.f17511j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo17522o(C6281e eVar, int i) throws IOException {
        this.f17509h.mo17529a(eVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo17523p() {
        boolean m;
        synchronized (this) {
            this.f17509h.f17522j = true;
            m = mo17520m();
            notifyAll();
        }
        if (!m) {
            this.f17505d.mo17477X(this.f17504c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo17524q(List<C6180c> list) {
        boolean m;
        synchronized (this) {
            this.f17508g = true;
            this.f17506e.add(C6130c.m25035H(list));
            m = mo17520m();
            notifyAll();
        }
        if (!m) {
            this.f17505d.mo17477X(this.f17504c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo17525r(C6179b bVar) {
        if (this.f17513l == null) {
            this.f17513l = bVar;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2.f17511j.mo17532u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p374m.C6255s mo17526s() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            m.g0.i.i$c r0 = r2.f17511j     // Catch:{ all -> 0x003c }
            r0.mo17785k()     // Catch:{ all -> 0x003c }
        L_0x0006:
            java.util.Deque<m.s> r0 = r2.f17506e     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0016
            m.g0.i.b r0 = r2.f17513l     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            r2.mo17527t()     // Catch:{ all -> 0x0035 }
            goto L_0x0006
        L_0x0016:
            m.g0.i.i$c r0 = r2.f17511j     // Catch:{ all -> 0x003c }
            r0.mo17532u()     // Catch:{ all -> 0x003c }
            java.util.Deque<m.s> r0 = r2.f17506e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<m.s> r0 = r2.f17506e     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x003c }
            m.s r0 = (p374m.C6255s) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r0
        L_0x002d:
            m.g0.i.n r0 = new m.g0.i.n     // Catch:{ all -> 0x003c }
            m.g0.i.b r1 = r2.f17513l     // Catch:{ all -> 0x003c }
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r0 = move-exception
            m.g0.i.i$c r1 = r2.f17511j     // Catch:{ all -> 0x003c }
            r1.mo17532u()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0040
        L_0x003f:
            throw r0
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p380i.C6206i.mo17526s():m.s");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo17527t() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: u */
    public C6301t mo17528u() {
        return this.f17512k;
    }
}
