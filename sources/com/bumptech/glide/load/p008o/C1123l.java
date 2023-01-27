package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p008o.C1101h;
import com.bumptech.glide.load.p008o.C1132p;
import com.bumptech.glide.load.p008o.p011c0.C1089a;
import com.bumptech.glide.p025q.C1366g;
import com.bumptech.glide.p029s.C1394e;
import com.bumptech.glide.p029s.C1401j;
import com.bumptech.glide.p029s.p030l.C1404a;
import com.bumptech.glide.p029s.p030l.C1413c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.o.l */
class C1123l<R> implements C1101h.C1103b<R>, C1404a.C1410f {

    /* renamed from: D */
    private static final C1126c f4223D = new C1126c();

    /* renamed from: A */
    C1132p<?> f4224A;

    /* renamed from: B */
    private C1101h<R> f4225B;

    /* renamed from: C */
    private volatile boolean f4226C;

    /* renamed from: f */
    final C1128e f4227f;

    /* renamed from: g */
    private final C1413c f4228g;

    /* renamed from: h */
    private final C1132p.C1133a f4229h;

    /* renamed from: i */
    private final C3346e<C1123l<?>> f4230i;

    /* renamed from: j */
    private final C1126c f4231j;

    /* renamed from: k */
    private final C1129m f4232k;

    /* renamed from: l */
    private final C1089a f4233l;

    /* renamed from: m */
    private final C1089a f4234m;

    /* renamed from: n */
    private final C1089a f4235n;

    /* renamed from: o */
    private final C1089a f4236o;

    /* renamed from: p */
    private final AtomicInteger f4237p;

    /* renamed from: q */
    private C0998g f4238q;

    /* renamed from: r */
    private boolean f4239r;

    /* renamed from: s */
    private boolean f4240s;

    /* renamed from: t */
    private boolean f4241t;

    /* renamed from: u */
    private boolean f4242u;

    /* renamed from: v */
    private C1141v<?> f4243v;

    /* renamed from: w */
    C0992a f4244w;

    /* renamed from: x */
    private boolean f4245x;

    /* renamed from: y */
    C1134q f4246y;

    /* renamed from: z */
    private boolean f4247z;

    /* renamed from: com.bumptech.glide.load.o.l$a */
    private class C1124a implements Runnable {

        /* renamed from: f */
        private final C1366g f4248f;

        C1124a(C1366g gVar) {
            this.f4248f = gVar;
        }

        public void run() {
            synchronized (this.f4248f.mo5834c()) {
                synchronized (C1123l.this) {
                    if (C1123l.this.f4227f.mo5411d(this.f4248f)) {
                        C1123l.this.mo5393e(this.f4248f);
                    }
                    C1123l.this.mo5396h();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.l$b */
    private class C1125b implements Runnable {

        /* renamed from: f */
        private final C1366g f4250f;

        C1125b(C1366g gVar) {
            this.f4250f = gVar;
        }

        public void run() {
            synchronized (this.f4250f.mo5834c()) {
                synchronized (C1123l.this) {
                    if (C1123l.this.f4227f.mo5411d(this.f4250f)) {
                        C1123l.this.f4224A.mo5419a();
                        C1123l.this.mo5394f(this.f4250f);
                        C1123l.this.mo5402r(this.f4250f);
                    }
                    C1123l.this.mo5396h();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.l$c */
    static class C1126c {
        C1126c() {
        }

        /* renamed from: a */
        public <R> C1132p<R> mo5406a(C1141v<R> vVar, boolean z, C0998g gVar, C1132p.C1133a aVar) {
            return new C1132p(vVar, z, true, gVar, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.l$d */
    static final class C1127d {

        /* renamed from: a */
        final C1366g f4252a;

        /* renamed from: b */
        final Executor f4253b;

        C1127d(C1366g gVar, Executor executor) {
            this.f4252a = gVar;
            this.f4253b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1127d) {
                return this.f4252a.equals(((C1127d) obj).f4252a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4252a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.l$e */
    static final class C1128e implements Iterable<C1127d> {

        /* renamed from: f */
        private final List<C1127d> f4254f;

        C1128e() {
            this(new ArrayList(2));
        }

        C1128e(List<C1127d> list) {
            this.f4254f = list;
        }

        /* renamed from: h */
        private static C1127d m5978h(C1366g gVar) {
            return new C1127d(gVar, C1394e.m6953a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5409c(C1366g gVar, Executor executor) {
            this.f4254f.add(new C1127d(gVar, executor));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f4254f.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5411d(C1366g gVar) {
            return this.f4254f.contains(m5978h(gVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1128e mo5412f() {
            return new C1128e(new ArrayList(this.f4254f));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo5413i(C1366g gVar) {
            this.f4254f.remove(m5978h(gVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f4254f.isEmpty();
        }

        public Iterator<C1127d> iterator() {
            return this.f4254f.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f4254f.size();
        }
    }

    C1123l(C1089a aVar, C1089a aVar2, C1089a aVar3, C1089a aVar4, C1129m mVar, C1132p.C1133a aVar5, C3346e<C1123l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f4223D);
    }

    C1123l(C1089a aVar, C1089a aVar2, C1089a aVar3, C1089a aVar4, C1129m mVar, C1132p.C1133a aVar5, C3346e<C1123l<?>> eVar, C1126c cVar) {
        this.f4227f = new C1128e();
        this.f4228g = C1413c.m7013a();
        this.f4237p = new AtomicInteger();
        this.f4233l = aVar;
        this.f4234m = aVar2;
        this.f4235n = aVar3;
        this.f4236o = aVar4;
        this.f4232k = mVar;
        this.f4229h = aVar5;
        this.f4230i = eVar;
        this.f4231j = cVar;
    }

    /* renamed from: j */
    private C1089a m5958j() {
        return this.f4240s ? this.f4235n : this.f4241t ? this.f4236o : this.f4234m;
    }

    /* renamed from: m */
    private boolean m5959m() {
        return this.f4247z || this.f4245x || this.f4226C;
    }

    /* renamed from: q */
    private synchronized void m5960q() {
        if (this.f4238q != null) {
            this.f4227f.clear();
            this.f4238q = null;
            this.f4224A = null;
            this.f4243v = null;
            this.f4247z = false;
            this.f4226C = false;
            this.f4245x = false;
            this.f4225B.mo5356C(false);
            this.f4225B = null;
            this.f4246y = null;
            this.f4244w = null;
            this.f4230i.mo5908a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo5363a(C1134q qVar) {
        synchronized (this) {
            this.f4246y = qVar;
        }
        mo5399n();
    }

    /* renamed from: b */
    public void mo5364b(C1141v<R> vVar, C0992a aVar) {
        synchronized (this) {
            this.f4243v = vVar;
            this.f4244w = aVar;
        }
        mo5400o();
    }

    /* renamed from: c */
    public void mo5365c(C1101h<?> hVar) {
        m5958j().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo5392d(C1366g gVar, Executor executor) {
        Runnable aVar;
        this.f4228g.mo5911c();
        this.f4227f.mo5409c(gVar, executor);
        boolean z = true;
        if (this.f4245x) {
            mo5397k(1);
            aVar = new C1125b(gVar);
        } else if (this.f4247z) {
            mo5397k(1);
            aVar = new C1124a(gVar);
        } else {
            if (this.f4226C) {
                z = false;
            }
            C1401j.m6969a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5393e(C1366g gVar) {
        try {
            gVar.mo5832a(this.f4246y);
        } catch (Throwable th) {
            throw new C1065b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5394f(C1366g gVar) {
        try {
            gVar.mo5833b(this.f4224A, this.f4244w);
        } catch (Throwable th) {
            throw new C1065b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5395g() {
        if (!m5959m()) {
            this.f4226C = true;
            this.f4225B.mo5359j();
            this.f4232k.mo5383c(this, this.f4238q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo5396h() {
        C1132p<?> pVar;
        synchronized (this) {
            this.f4228g.mo5911c();
            C1401j.m6969a(m5959m(), "Not yet complete!");
            int decrementAndGet = this.f4237p.decrementAndGet();
            C1401j.m6969a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f4224A;
                m5960q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.mo5425g();
        }
    }

    /* renamed from: i */
    public C1413c mo5306i() {
        return this.f4228g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo5397k(int i) {
        C1401j.m6969a(m5959m(), "Not yet complete!");
        if (this.f4237p.getAndAdd(i) == 0 && this.f4224A != null) {
            this.f4224A.mo5419a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C1123l<R> mo5398l(C0998g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4238q = gVar;
        this.f4239r = z;
        this.f4240s = z2;
        this.f4241t = z3;
        this.f4242u = z4;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f4232k.mo5382b(r4, r1, (com.bumptech.glide.load.p008o.C1132p<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f4253b.execute(new com.bumptech.glide.load.p008o.C1123l.C1124a(r4, r1.f4252a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo5396h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5399n() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.s.l.c r0 = r4.f4228g     // Catch:{ all -> 0x0066 }
            r0.mo5911c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f4226C     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m5960q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.o.l$e r0 = r4.f4227f     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f4247z     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f4247z = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.g r1 = r4.f4238q     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.o.l$e r2 = r4.f4227f     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.o.l$e r2 = r2.mo5412f()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo5397k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.o.m r0 = r4.f4232k
            r3 = 0
            r0.mo5382b(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.o.l$d r1 = (com.bumptech.glide.load.p008o.C1123l.C1127d) r1
            java.util.concurrent.Executor r2 = r1.f4253b
            com.bumptech.glide.load.o.l$a r3 = new com.bumptech.glide.load.o.l$a
            com.bumptech.glide.q.g r1 = r1.f4252a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo5396h()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r0
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p008o.C1123l.mo5399n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f4232k.mo5382b(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f4253b.execute(new com.bumptech.glide.load.p008o.C1123l.C1125b(r5, r1.f4252a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo5396h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5400o() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.s.l.c r0 = r5.f4228g     // Catch:{ all -> 0x007c }
            r0.mo5911c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f4226C     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            com.bumptech.glide.load.o.v<?> r0 = r5.f4243v     // Catch:{ all -> 0x007c }
            r0.mo5422d()     // Catch:{ all -> 0x007c }
            r5.m5960q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.o.l$e r0 = r5.f4227f     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f4245x     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.o.l$c r0 = r5.f4231j     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.v<?> r1 = r5.f4243v     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f4239r     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r3 = r5.f4238q     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.p$a r4 = r5.f4229h     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.p r0 = r0.mo5406a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f4224A = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f4245x = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.l$e r1 = r5.f4227f     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.l$e r1 = r1.mo5412f()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo5397k(r2)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r0 = r5.f4238q     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.p<?> r2 = r5.f4224A     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.m r3 = r5.f4232k
            r3.mo5382b(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.o.l$d r1 = (com.bumptech.glide.load.p008o.C1123l.C1127d) r1
            java.util.concurrent.Executor r2 = r1.f4253b
            com.bumptech.glide.load.o.l$b r3 = new com.bumptech.glide.load.o.l$b
            com.bumptech.glide.q.g r1 = r1.f4252a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo5396h()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007f:
            throw r0
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p008o.C1123l.mo5400o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5401p() {
        return this.f4242u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo5402r(C1366g gVar) {
        boolean z;
        this.f4228g.mo5911c();
        this.f4227f.mo5413i(gVar);
        if (this.f4227f.isEmpty()) {
            mo5395g();
            if (!this.f4245x) {
                if (!this.f4247z) {
                    z = false;
                    if (z && this.f4237p.get() == 0) {
                        m5960q();
                    }
                }
            }
            z = true;
            m5960q();
        }
    }

    /* renamed from: s */
    public synchronized void mo5403s(C1101h<R> hVar) {
        this.f4225B = hVar;
        (hVar.mo5357J() ? this.f4233l : m5958j()).execute(hVar);
    }
}
