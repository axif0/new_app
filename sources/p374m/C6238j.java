package p374m;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p374m.p375g0.C6130c;
import p374m.p375g0.p377f.C6150c;
import p374m.p375g0.p377f.C6151d;
import p374m.p375g0.p377f.C6155g;
import p374m.p375g0.p382k.C6228f;

/* renamed from: m.j */
public final class C6238j {

    /* renamed from: g */
    private static final Executor f17595g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C6130c.m25034G("OkHttp ConnectionPool", true));

    /* renamed from: a */
    private final int f17596a;

    /* renamed from: b */
    private final long f17597b;

    /* renamed from: c */
    private final Runnable f17598c;

    /* renamed from: d */
    private final Deque<C6150c> f17599d;

    /* renamed from: e */
    final C6151d f17600e;

    /* renamed from: f */
    boolean f17601f;

    /* renamed from: m.j$a */
    class C6239a implements Runnable {
        C6239a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                m.j r0 = p374m.C6238j.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.mo17615a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                m.j r2 = p374m.C6238j.this
                monitor-enter(r2)
                m.j r3 = p374m.C6238j.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0030
            L_0x002f:
                throw r0
            L_0x0030:
                goto L_0x002f
            */
            throw new UnsupportedOperationException("Method not decompiled: p374m.C6238j.C6239a.run():void");
        }
    }

    public C6238j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C6238j(int i, long j, TimeUnit timeUnit) {
        this.f17598c = new C6239a();
        this.f17599d = new ArrayDeque();
        this.f17600e = new C6151d();
        this.f17596a = i;
        this.f17597b = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    /* renamed from: e */
    private int m25547e(C6150c cVar, long j) {
        List<Reference<C6155g>> list = cVar.f17293n;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C6228f.m25514j().mo17583r("A connection to " + cVar.mo17397p().mo17319a().mo17210l() + " was leaked. Did you forget to close a response body?", ((C6155g.C6156a) reference).f17322a);
                list.remove(i);
                cVar.f17290k = true;
                if (list.isEmpty()) {
                    cVar.f17294o = j - this.f17597b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo17615a(long j) {
        synchronized (this) {
            C6150c cVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C6150c next : this.f17599d) {
                if (m25547e(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.f17294o;
                    if (j3 > j2) {
                        cVar = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f17597b) {
                if (i <= this.f17596a) {
                    if (i > 0) {
                        long j4 = this.f17597b - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.f17597b;
                        return j5;
                    } else {
                        this.f17601f = false;
                        return -1;
                    }
                }
            }
            this.f17599d.remove(cVar);
            C6130c.m25045h(cVar.mo17398q());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo17616b(C6150c cVar) {
        if (cVar.f17290k || this.f17596a == 0) {
            this.f17599d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Socket mo17617c(C6098a aVar, C6155g gVar) {
        for (C6150c next : this.f17599d) {
            if (next.mo17393l(aVar, (C6122e0) null) && next.mo17395n() && next != gVar.mo17416d()) {
                return gVar.mo17421m(next);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6150c mo17618d(C6098a aVar, C6155g gVar, C6122e0 e0Var) {
        for (C6150c next : this.f17599d) {
            if (next.mo17393l(aVar, e0Var)) {
                gVar.mo17413a(next, true);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo17619f(C6150c cVar) {
        if (!this.f17601f) {
            this.f17601f = true;
            f17595g.execute(this.f17598c);
        }
        this.f17599d.add(cVar);
    }
}
