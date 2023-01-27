package p374m.p375g0.p377f;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import p374m.C6098a;
import p374m.C6120e;
import p374m.C6122e0;
import p374m.C6238j;
import p374m.C6248p;
import p374m.C6259u;
import p374m.C6265x;
import p374m.p375g0.C6128a;
import p374m.p375g0.C6130c;
import p374m.p375g0.p377f.C6153f;
import p374m.p375g0.p378g.C6160c;

/* renamed from: m.g0.f.g */
public final class C6155g {

    /* renamed from: a */
    public final C6098a f17308a;

    /* renamed from: b */
    private C6153f.C6154a f17309b;

    /* renamed from: c */
    private C6122e0 f17310c;

    /* renamed from: d */
    private final C6238j f17311d;

    /* renamed from: e */
    public final C6120e f17312e;

    /* renamed from: f */
    public final C6248p f17313f;

    /* renamed from: g */
    private final Object f17314g;

    /* renamed from: h */
    private final C6153f f17315h;

    /* renamed from: i */
    private int f17316i;

    /* renamed from: j */
    private C6150c f17317j;

    /* renamed from: k */
    private boolean f17318k;

    /* renamed from: l */
    private boolean f17319l;

    /* renamed from: m */
    private boolean f17320m;

    /* renamed from: n */
    private C6160c f17321n;

    /* renamed from: m.g0.f.g$a */
    public static final class C6156a extends WeakReference<C6155g> {

        /* renamed from: a */
        public final Object f17322a;

        C6156a(C6155g gVar, Object obj) {
            super(gVar);
            this.f17322a = obj;
        }
    }

    public C6155g(C6238j jVar, C6098a aVar, C6120e eVar, C6248p pVar, Object obj) {
        this.f17311d = jVar;
        this.f17308a = aVar;
        this.f17312e = eVar;
        this.f17313f = pVar;
        this.f17315h = new C6153f(aVar, m25165p(), eVar, pVar);
        this.f17314g = obj;
    }

    /* renamed from: e */
    private Socket m25160e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f17321n = null;
        }
        if (z2) {
            this.f17319l = true;
        }
        C6150c cVar = this.f17317j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.f17290k = true;
        }
        if (this.f17321n != null) {
            return null;
        }
        if (!this.f17319l && !this.f17317j.f17290k) {
            return null;
        }
        m25163l(this.f17317j);
        if (this.f17317j.f17293n.isEmpty()) {
            this.f17317j.f17294o = System.nanoTime();
            if (C6128a.f17195a.mo17343e(this.f17311d, this.f17317j)) {
                socket = this.f17317j.mo17398q();
                this.f17317j = null;
                return socket;
            }
        }
        socket = null;
        this.f17317j = null;
        return socket;
    }

    /* renamed from: f */
    private C6150c m25161f(int i, int i2, int i3, int i4, boolean z) throws IOException {
        Socket n;
        Socket socket;
        C6150c cVar;
        C6150c cVar2;
        boolean z2;
        C6122e0 e0Var;
        boolean z3;
        C6153f.C6154a aVar;
        synchronized (this.f17311d) {
            if (this.f17319l) {
                throw new IllegalStateException("released");
            } else if (this.f17321n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f17320m) {
                C6150c cVar3 = this.f17317j;
                n = m25164n();
                socket = null;
                if (this.f17317j != null) {
                    cVar2 = this.f17317j;
                    cVar = null;
                } else {
                    cVar = cVar3;
                    cVar2 = null;
                }
                if (!this.f17318k) {
                    cVar = null;
                }
                if (cVar2 == null) {
                    C6128a.f17195a.mo17346h(this.f17311d, this.f17308a, this, (C6122e0) null);
                    if (this.f17317j != null) {
                        cVar2 = this.f17317j;
                        e0Var = null;
                        z2 = true;
                    } else {
                        e0Var = this.f17310c;
                    }
                } else {
                    e0Var = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        C6130c.m25045h(n);
        if (cVar != null) {
            this.f17313f.mo17658h(this.f17312e, cVar);
        }
        if (z2) {
            this.f17313f.mo17657g(this.f17312e, cVar2);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (e0Var != null || ((aVar = this.f17309b) != null && aVar.mo17411b())) {
            z3 = false;
        } else {
            this.f17309b = this.f17315h.mo17409e();
            z3 = true;
        }
        synchronized (this.f17311d) {
            if (!this.f17320m) {
                if (z3) {
                    List<C6122e0> a = this.f17309b.mo17410a();
                    int size = a.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        C6122e0 e0Var2 = a.get(i5);
                        C6128a.f17195a.mo17346h(this.f17311d, this.f17308a, this, e0Var2);
                        if (this.f17317j != null) {
                            cVar2 = this.f17317j;
                            this.f17310c = e0Var2;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (!z2) {
                    if (e0Var == null) {
                        e0Var = this.f17309b.mo17412c();
                    }
                    this.f17310c = e0Var;
                    this.f17316i = 0;
                    cVar2 = new C6150c(this.f17311d, e0Var);
                    mo17413a(cVar2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z2) {
            cVar2.mo17391d(i, i2, i3, i4, z, this.f17312e, this.f17313f);
            m25165p().mo17401a(cVar2.mo17397p());
            synchronized (this.f17311d) {
                this.f17318k = true;
                C6128a.f17195a.mo17347i(this.f17311d, cVar2);
                if (cVar2.mo17395n()) {
                    socket = C6128a.f17195a.mo17344f(this.f17311d, this.f17308a, this);
                    cVar2 = this.f17317j;
                }
            }
            C6130c.m25045h(socket);
        }
        this.f17313f.mo17657g(this.f17312e, cVar2);
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo17394m(r9) != false) goto L_0x0018;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p374m.p375g0.p377f.C6150c m25162g(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            m.g0.f.c r0 = r3.m25161f(r4, r5, r6, r7, r8)
            m.j r1 = r3.f17311d
            monitor-enter(r1)
            int r2 = r0.f17291l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.mo17394m(r9)
            if (r1 != 0) goto L_0x0018
            r3.mo17419j()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001d
        L_0x001c:
            throw r4
        L_0x001d:
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p377f.C6155g.m25162g(int, int, int, int, boolean, boolean):m.g0.f.c");
    }

    /* renamed from: l */
    private void m25163l(C6150c cVar) {
        int size = cVar.f17293n.size();
        for (int i = 0; i < size; i++) {
            if (cVar.f17293n.get(i).get() == this) {
                cVar.f17293n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    private Socket m25164n() {
        C6150c cVar = this.f17317j;
        if (cVar == null || !cVar.f17290k) {
            return null;
        }
        return m25160e(false, false, true);
    }

    /* renamed from: p */
    private C6151d m25165p() {
        return C6128a.f17195a.mo17348j(this.f17311d);
    }

    /* renamed from: a */
    public void mo17413a(C6150c cVar, boolean z) {
        if (this.f17317j == null) {
            this.f17317j = cVar;
            this.f17318k = z;
            cVar.f17293n.add(new C6156a(this, this.f17314g));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void mo17414b() {
        C6160c cVar;
        C6150c cVar2;
        synchronized (this.f17311d) {
            this.f17320m = true;
            cVar = this.f17321n;
            cVar2 = this.f17317j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.mo17390c();
        }
    }

    /* renamed from: c */
    public C6160c mo17415c() {
        C6160c cVar;
        synchronized (this.f17311d) {
            cVar = this.f17321n;
        }
        return cVar;
    }

    /* renamed from: d */
    public synchronized C6150c mo17416d() {
        return this.f17317j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f17309b;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17417h() {
        /*
            r1 = this;
            m.e0 r0 = r1.f17310c
            if (r0 != 0) goto L_0x0019
            m.g0.f.f$a r0 = r1.f17309b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.mo17411b()
            if (r0 != 0) goto L_0x0019
        L_0x000e:
            m.g0.f.f r0 = r1.f17315h
            boolean r0 = r0.mo17408c()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p377f.C6155g.mo17417h():boolean");
    }

    /* renamed from: i */
    public C6160c mo17418i(C6265x xVar, C6259u.C6260a aVar, boolean z) {
        try {
            C6160c o = m25162g(aVar.mo17435a(), aVar.mo17436b(), aVar.mo17437c(), xVar.mo17739A(), xVar.mo17745G(), z).mo17396o(xVar, aVar, this);
            synchronized (this.f17311d) {
                this.f17321n = o;
            }
            return o;
        } catch (IOException e) {
            throw new C6152e(e);
        }
    }

    /* renamed from: j */
    public void mo17419j() {
        C6150c cVar;
        Socket e;
        synchronized (this.f17311d) {
            cVar = this.f17317j;
            e = m25160e(true, false, false);
            if (this.f17317j != null) {
                cVar = null;
            }
        }
        C6130c.m25045h(e);
        if (cVar != null) {
            this.f17313f.mo17658h(this.f17312e, cVar);
        }
    }

    /* renamed from: k */
    public void mo17420k() {
        C6150c cVar;
        Socket e;
        synchronized (this.f17311d) {
            cVar = this.f17317j;
            e = m25160e(false, true, false);
            if (this.f17317j != null) {
                cVar = null;
            }
        }
        C6130c.m25045h(e);
        if (cVar != null) {
            C6128a.f17195a.mo17349k(this.f17312e, (IOException) null);
            this.f17313f.mo17658h(this.f17312e, cVar);
            this.f17313f.mo17651a(this.f17312e);
        }
    }

    /* renamed from: m */
    public Socket mo17421m(C6150c cVar) {
        if (this.f17321n == null && this.f17317j.f17293n.size() == 1) {
            Socket e = m25160e(true, false, false);
            this.f17317j = cVar;
            cVar.f17293n.add(this.f17317j.f17293n.get(0));
            return e;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public C6122e0 mo17422o() {
        return this.f17310c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r7 != p374m.p375g0.p380i.C6179b.f17379l) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17423q(java.io.IOException r7) {
        /*
            r6 = this;
            m.j r0 = r6.f17311d
            monitor-enter(r0)
            boolean r1 = r7 instanceof p374m.p375g0.p380i.C6216n     // Catch:{ all -> 0x0066 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            m.g0.i.n r7 = (p374m.p375g0.p380i.C6216n) r7     // Catch:{ all -> 0x0066 }
            m.g0.i.b r7 = r7.f17542f     // Catch:{ all -> 0x0066 }
            m.g0.i.b r1 = p374m.p375g0.p380i.C6179b.REFUSED_STREAM     // Catch:{ all -> 0x0066 }
            if (r7 != r1) goto L_0x001a
            int r7 = r6.f17316i     // Catch:{ all -> 0x0066 }
            int r7 = r7 + r4
            r6.f17316i = r7     // Catch:{ all -> 0x0066 }
            if (r7 <= r4) goto L_0x0047
            goto L_0x001e
        L_0x001a:
            m.g0.i.b r1 = p374m.p375g0.p380i.C6179b.CANCEL     // Catch:{ all -> 0x0066 }
            if (r7 == r1) goto L_0x0047
        L_0x001e:
            r6.f17310c = r3     // Catch:{ all -> 0x0066 }
            goto L_0x0045
        L_0x0021:
            m.g0.f.c r1 = r6.f17317j     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0047
            m.g0.f.c r1 = r6.f17317j     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.mo17395n()     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r7 instanceof p374m.p375g0.p380i.C6178a     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0047
        L_0x0031:
            m.g0.f.c r1 = r6.f17317j     // Catch:{ all -> 0x0066 }
            int r1 = r1.f17291l     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0045
            m.e0 r1 = r6.f17310c     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x001e
            if (r7 == 0) goto L_0x001e
            m.g0.f.f r1 = r6.f17315h     // Catch:{ all -> 0x0066 }
            m.e0 r5 = r6.f17310c     // Catch:{ all -> 0x0066 }
            r1.mo17407a(r5, r7)     // Catch:{ all -> 0x0066 }
            goto L_0x001e
        L_0x0045:
            r7 = 1
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            m.g0.f.c r1 = r6.f17317j     // Catch:{ all -> 0x0066 }
            java.net.Socket r7 = r6.m25160e(r7, r2, r4)     // Catch:{ all -> 0x0066 }
            m.g0.f.c r2 = r6.f17317j     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0058
            boolean r2 = r6.f17318k     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            p374m.p375g0.C6130c.m25045h(r7)
            if (r3 == 0) goto L_0x0065
            m.p r7 = r6.f17313f
            m.e r0 = r6.f17312e
            r7.mo17658h(r0, r3)
        L_0x0065:
            return
        L_0x0066:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r7
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p377f.C6155g.mo17423q(java.io.IOException):void");
    }

    /* renamed from: r */
    public void mo17424r(boolean z, C6160c cVar, long j, IOException iOException) {
        C6150c cVar2;
        Socket e;
        boolean z2;
        this.f17313f.mo17665p(this.f17312e, j);
        synchronized (this.f17311d) {
            if (cVar != null) {
                if (cVar == this.f17321n) {
                    if (!z) {
                        this.f17317j.f17291l++;
                    }
                    cVar2 = this.f17317j;
                    e = m25160e(z, false, true);
                    if (this.f17317j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f17319l;
                }
            }
            throw new IllegalStateException("expected " + this.f17321n + " but was " + cVar);
        }
        C6130c.m25045h(e);
        if (cVar2 != null) {
            this.f17313f.mo17658h(this.f17312e, cVar2);
        }
        if (iOException != null) {
            this.f17313f.mo17652b(this.f17312e, C6128a.f17195a.mo17349k(this.f17312e, iOException));
        } else if (z2) {
            C6128a.f17195a.mo17349k(this.f17312e, (IOException) null);
            this.f17313f.mo17651a(this.f17312e);
        }
    }

    public String toString() {
        C6150c d = mo17416d();
        return d != null ? d.toString() : this.f17308a.toString();
    }
}
