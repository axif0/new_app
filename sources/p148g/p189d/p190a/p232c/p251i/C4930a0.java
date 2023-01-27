package p148g.p189d.p190a.p232c.p251i;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: g.d.a.c.i.a0 */
final class C4930a0<TResult> {

    /* renamed from: a */
    private final Object f14746a = new Object();

    /* renamed from: b */
    private Queue<C4961z<TResult>> f14747b;

    /* renamed from: c */
    private boolean f14748c;

    C4930a0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f14746a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f14747b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f14748c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo14891a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14859a(p148g.p189d.p190a.p232c.p251i.C4940h<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f14746a
            monitor-enter(r0)
            java.util.Queue<g.d.a.c.i.z<TResult>> r1 = r2.f14747b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f14748c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f14748c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f14746a
            monitor-enter(r1)
            java.util.Queue<g.d.a.c.i.z<TResult>> r0 = r2.f14747b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            g.d.a.c.i.z r0 = (p148g.p189d.p190a.p232c.p251i.C4961z) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f14748c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo14891a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002f:
            throw r3
        L_0x0030:
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p251i.C4930a0.mo14859a(g.d.a.c.i.h):void");
    }

    /* renamed from: b */
    public final void mo14860b(C4961z<TResult> zVar) {
        synchronized (this.f14746a) {
            if (this.f14747b == null) {
                this.f14747b = new ArrayDeque();
            }
            this.f14747b.add(zVar);
        }
    }
}
