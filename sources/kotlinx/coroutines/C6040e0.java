package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.p368c1.C6015h;
import kotlinx.coroutines.p368c1.C6030q;
import kotlinx.coroutines.p368c1.C6031r;
import p351k.C5856n;
import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.e0 */
public abstract class C6040e0 extends C6044f0 {

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f17000i;

    /* renamed from: j */
    private static final AtomicReferenceFieldUpdater f17001j;
    private volatile Object _delayed = null;
    private volatile Object _queue = null;
    /* access modifiers changed from: private */
    public volatile boolean isCompleted;

    /* renamed from: kotlinx.coroutines.e0$a */
    public static abstract class C6041a implements Runnable, Comparable<C6041a>, C5996b0, C6031r {

        /* renamed from: f */
        private Object f17002f;

        /* renamed from: g */
        private int f17003g;

        /* renamed from: h */
        public long f17004h;

        /* renamed from: e */
        public void mo17091e(int i) {
            this.f17003g = i;
        }

        /* renamed from: g */
        public int mo17092g() {
            return this.f17003g;
        }

        /* renamed from: h */
        public final synchronized void mo17041h() {
            Object obj = this.f17002f;
            if (obj != C6048h0.f17012a) {
                if (!(obj instanceof C6042b)) {
                    obj = null;
                }
                C6042b bVar = (C6042b) obj;
                if (bVar != null) {
                    bVar.mo17088g(this);
                }
                this.f17002f = C6048h0.f17012a;
            }
        }

        /* renamed from: i */
        public void mo17093i(C6030q<?> qVar) {
            if (this.f17002f != C6048h0.f17012a) {
                this.f17002f = qVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: j */
        public C6030q<?> mo17094j() {
            Object obj = this.f17002f;
            if (!(obj instanceof C6030q)) {
                obj = null;
            }
            return (C6030q) obj;
        }

        /* renamed from: k */
        public int compareTo(C6041a aVar) {
            C5956g.m24501f(aVar, "other");
            long j = this.f17004h - aVar.f17004h;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x004a  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo17118l(long r8, kotlinx.coroutines.C6040e0.C6042b r10, kotlinx.coroutines.C6040e0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.String r0 = "delayed"
                p351k.p361v.p363d.C5956g.m24501f(r10, r0)     // Catch:{ all -> 0x0057 }
                java.lang.String r0 = "eventLoop"
                p351k.p361v.p363d.C5956g.m24501f(r11, r0)     // Catch:{ all -> 0x0057 }
                java.lang.Object r0 = r7.f17002f     // Catch:{ all -> 0x0057 }
                kotlinx.coroutines.c1.l r1 = kotlinx.coroutines.C6048h0.f17012a     // Catch:{ all -> 0x0057 }
                if (r0 != r1) goto L_0x0016
                r8 = 2
            L_0x0014:
                monitor-exit(r7)
                return r8
            L_0x0016:
                monitor-enter(r10)     // Catch:{ all -> 0x0057 }
                kotlinx.coroutines.c1.r r0 = r10.mo17084b()     // Catch:{ all -> 0x0054 }
                kotlinx.coroutines.e0$a r0 = (kotlinx.coroutines.C6040e0.C6041a) r0     // Catch:{ all -> 0x0054 }
                boolean r11 = r11.isCompleted     // Catch:{ all -> 0x0054 }
                if (r11 == 0) goto L_0x0027
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                monitor-exit(r7)
                return r8
            L_0x0027:
                r1 = 0
                if (r0 != 0) goto L_0x002e
            L_0x002b:
                r10.f17005b = r8     // Catch:{ all -> 0x0054 }
                goto L_0x0041
            L_0x002e:
                long r3 = r0.f17004h     // Catch:{ all -> 0x0054 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r8 = r3
            L_0x0038:
                long r3 = r10.f17005b     // Catch:{ all -> 0x0054 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0041
                goto L_0x002b
            L_0x0041:
                long r8 = r7.f17004h     // Catch:{ all -> 0x0054 }
                long r3 = r10.f17005b     // Catch:{ all -> 0x0054 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x004e
                long r8 = r10.f17005b     // Catch:{ all -> 0x0054 }
                r7.f17004h = r8     // Catch:{ all -> 0x0054 }
            L_0x004e:
                r10.mo17083a(r7)     // Catch:{ all -> 0x0054 }
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                r8 = 0
                goto L_0x0014
            L_0x0054:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                throw r8     // Catch:{ all -> 0x0057 }
            L_0x0057:
                r8 = move-exception
                monitor-exit(r7)
                goto L_0x005b
            L_0x005a:
                throw r8
            L_0x005b:
                goto L_0x005a
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6040e0.C6041a.mo17118l(long, kotlinx.coroutines.e0$b, kotlinx.coroutines.e0):int");
        }

        /* renamed from: m */
        public final boolean mo17119m(long j) {
            return j - this.f17004h >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f17004h + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.e0$b */
    public static final class C6042b extends C6030q<C6041a> {

        /* renamed from: b */
        public long f17005b;

        public C6042b(long j) {
            this.f17005b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C6040e0> cls2 = C6040e0.class;
        f17000i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f17001j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: B */
    private final boolean m24693B(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f17000i.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C6015h) {
                if (obj != null) {
                    C6015h hVar = (C6015h) obj;
                    int d = hVar.mo17068d(runnable);
                    if (d == 0) {
                        return true;
                    }
                    if (d == 1) {
                        f17000i.compareAndSet(this, obj, hVar.mo17071k());
                    } else if (d == 2) {
                        return false;
                    }
                } else {
                    throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C6048h0.f17013b) {
                return false;
            } else {
                C6015h hVar2 = new C6015h(8, true);
                if (obj != null) {
                    hVar2.mo17068d((Runnable) obj);
                    hVar2.mo17068d(runnable);
                    if (f17000i.compareAndSet(this, obj, hVar2)) {
                        return true;
                    }
                } else {
                    throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: E */
    private final void m24694E() {
        C6041a aVar;
        C6090z0 a = C5994a1.m24562a();
        long b = a != null ? a.mo17183b() : System.nanoTime();
        while (true) {
            C6042b bVar = (C6042b) this._delayed;
            if (bVar != null && (aVar = (C6041a) bVar.mo17090i()) != null) {
                mo17128v(b, aVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    private final int m24695H(long j, C6041a aVar) {
        if (this.isCompleted) {
            return 1;
        }
        C6042b bVar = (C6042b) this._delayed;
        if (bVar == null) {
            f17001j.compareAndSet(this, (Object) null, new C6042b(j));
            Object obj = this._delayed;
            if (obj != null) {
                bVar = (C6042b) obj;
            } else {
                C5956g.m24506k();
                throw null;
            }
        }
        return aVar.mo17118l(j, bVar, this);
    }

    /* renamed from: I */
    private final boolean m24696I(C6041a aVar) {
        C6042b bVar = (C6042b) this._delayed;
        return (bVar != null ? (C6041a) bVar.mo17087e() : null) == aVar;
    }

    /* renamed from: y */
    private final void m24698y() {
        if (!C6080v.m24813a() || this.isCompleted) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f17000i.compareAndSet(this, (Object) null, C6048h0.f17013b)) {
                        return;
                    }
                } else if (obj instanceof C6015h) {
                    ((C6015h) obj).mo17069g();
                    return;
                } else if (obj != C6048h0.f17013b) {
                    C6015h hVar = new C6015h(8, true);
                    if (obj != null) {
                        hVar.mo17068d((Runnable) obj);
                        if (f17000i.compareAndSet(this, obj, hVar)) {
                            return;
                        }
                    } else {
                        throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: z */
    private final Runnable m24699z() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C6015h) {
                if (obj != null) {
                    C6015h hVar = (C6015h) obj;
                    Object l = hVar.mo17072l();
                    if (l != C6015h.f16970g) {
                        return (Runnable) l;
                    }
                    f17000i.compareAndSet(this, obj, hVar.mo17071k());
                } else {
                    throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C6048h0.f17013b) {
                return null;
            } else {
                if (f17000i.compareAndSet(this, obj, (Object) null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new C5856n("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: A */
    public final void mo17110A(Runnable runnable) {
        C5956g.m24501f(runnable, "task");
        if (m24693B(runnable)) {
            mo17129w();
        } else {
            C6084x.f17042l.mo17110A(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo17111C() {
        if (!mo17105r()) {
            return false;
        }
        C6042b bVar = (C6042b) this._delayed;
        if (bVar != null && !bVar.mo17086d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            return obj instanceof C6015h ? ((C6015h) obj).mo17070i() : obj == C6048h0.f17013b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0053  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo17112D() {
        /*
            r7 = this;
            boolean r0 = r7.mo17106s()
            if (r0 == 0) goto L_0x000b
            long r0 = r7.mo17102n()
            return r0
        L_0x000b:
            java.lang.Object r0 = r7._delayed
            kotlinx.coroutines.e0$b r0 = (kotlinx.coroutines.C6040e0.C6042b) r0
            if (r0 == 0) goto L_0x004d
            boolean r1 = r0.mo17086d()
            if (r1 != 0) goto L_0x004d
            kotlinx.coroutines.z0 r1 = kotlinx.coroutines.C5994a1.m24562a()
            if (r1 == 0) goto L_0x0022
            long r1 = r1.mo17183b()
            goto L_0x0026
        L_0x0022:
            long r1 = java.lang.System.nanoTime()
        L_0x0026:
            monitor-enter(r0)
            kotlinx.coroutines.c1.r r3 = r0.mo17084b()     // Catch:{ all -> 0x004a }
            r4 = 0
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.e0$a r3 = (kotlinx.coroutines.C6040e0.C6041a) r3     // Catch:{ all -> 0x004a }
            boolean r5 = r3.mo17119m(r1)     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 == 0) goto L_0x003c
            boolean r3 = r7.m24693B(r3)     // Catch:{ all -> 0x004a }
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.c1.r r3 = r0.mo17089h(r6)     // Catch:{ all -> 0x004a }
            r4 = r3
        L_0x0044:
            monitor-exit(r0)
            kotlinx.coroutines.e0$a r4 = (kotlinx.coroutines.C6040e0.C6041a) r4
            if (r4 == 0) goto L_0x004d
            goto L_0x0026
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r7.m24699z()
            if (r0 == 0) goto L_0x0056
            r0.run()
        L_0x0056:
            long r0 = r7.mo17102n()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6040e0.mo17112D():long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo17113F() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: G */
    public final void mo17114G(long j, C6041a aVar) {
        C5956g.m24501f(aVar, "delayedTask");
        int H = m24695H(j, aVar);
        if (H != 0) {
            if (H == 1) {
                mo17128v(j, aVar);
            } else if (H != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m24696I(aVar)) {
            mo17129w();
        }
    }

    /* renamed from: h */
    public final void mo17115h(C5899f fVar, Runnable runnable) {
        C5956g.m24501f(fVar, "context");
        C5956g.m24501f(runnable, "block");
        mo17110A(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public long mo17102n() {
        C6041a aVar;
        if (super.mo17102n() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C6015h)) {
                return obj == C6048h0.f17013b ? Long.MAX_VALUE : 0;
            }
            if (!((C6015h) obj).mo17070i()) {
                return 0;
            }
        }
        C6042b bVar = (C6042b) this._delayed;
        if (bVar == null || (aVar = (C6041a) bVar.mo17087e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = aVar.f17004h;
        C6090z0 a = C5994a1.m24562a();
        return C5974f.m24543b(j - (a != null ? a.mo17183b() : System.nanoTime()), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo17107t() {
        C6088y0.f17049b.mo17180b();
        this.isCompleted = true;
        m24698y();
        do {
        } while (mo17112D() <= 0);
        m24694E();
    }
}
