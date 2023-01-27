package p148g.p189d.p190a.p200b.p202i0;

import java.lang.Exception;
import java.util.LinkedList;
import p148g.p189d.p190a.p200b.p202i0.C3895e;
import p148g.p189d.p190a.p200b.p202i0.C3896f;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.i0.g */
public abstract class C3897g<I extends C3895e, O extends C3896f, E extends Exception> implements C3893c<I, O, E> {

    /* renamed from: a */
    private final Thread f11827a;

    /* renamed from: b */
    private final Object f11828b = new Object();

    /* renamed from: c */
    private final LinkedList<I> f11829c = new LinkedList<>();

    /* renamed from: d */
    private final LinkedList<O> f11830d = new LinkedList<>();

    /* renamed from: e */
    private final I[] f11831e;

    /* renamed from: f */
    private final O[] f11832f;

    /* renamed from: g */
    private int f11833g;

    /* renamed from: h */
    private int f11834h;

    /* renamed from: i */
    private I f11835i;

    /* renamed from: j */
    private E f11836j;

    /* renamed from: k */
    private boolean f11837k;

    /* renamed from: l */
    private boolean f11838l;

    /* renamed from: m */
    private int f11839m;

    /* renamed from: g.d.a.b.i0.g$a */
    class C3898a extends Thread {
        C3898a() {
        }

        public void run() {
            C3897g.this.m16353u();
        }
    }

    protected C3897g(I[] iArr, O[] oArr) {
        this.f11831e = iArr;
        this.f11833g = iArr.length;
        for (int i = 0; i < this.f11833g; i++) {
            this.f11831e[i] = mo12674h();
        }
        this.f11832f = oArr;
        this.f11834h = oArr.length;
        for (int i2 = 0; i2 < this.f11834h; i2++) {
            this.f11832f[i2] = mo12675i();
        }
        C3898a aVar = new C3898a();
        this.f11827a = aVar;
        aVar.start();
    }

    /* renamed from: g */
    private boolean m16347g() {
        return !this.f11829c.isEmpty() && this.f11834h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.mo12659o() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.mo12654j(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.mo12658n() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.mo12654j(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.f11836j = mo12677k(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r6.f11836j = mo12676j(r0);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16348l() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11828b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f11838l     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.m16347g()     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f11828b     // Catch:{ all -> 0x008d }
            r1.wait()     // Catch:{ all -> 0x008d }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f11838l     // Catch:{ all -> 0x008d }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return r2
        L_0x001a:
            java.util.LinkedList<I> r1 = r6.f11829c     // Catch:{ all -> 0x008d }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x008d }
            g.d.a.b.i0.e r1 = (p148g.p189d.p190a.p200b.p202i0.C3895e) r1     // Catch:{ all -> 0x008d }
            O[] r3 = r6.f11832f     // Catch:{ all -> 0x008d }
            int r4 = r6.f11834h     // Catch:{ all -> 0x008d }
            r5 = 1
            int r4 = r4 - r5
            r6.f11834h = r4     // Catch:{ all -> 0x008d }
            r3 = r3[r4]     // Catch:{ all -> 0x008d }
            boolean r4 = r6.f11837k     // Catch:{ all -> 0x008d }
            r6.f11837k = r2     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            boolean r0 = r1.mo12659o()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.mo12654j(r0)
            goto L_0x0063
        L_0x003c:
            boolean r0 = r1.mo12658n()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo12654j(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.mo12677k(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0050, OutOfMemoryError -> 0x004e }
            r6.f11836j = r0     // Catch:{ RuntimeException -> 0x0050, OutOfMemoryError -> 0x004e }
            goto L_0x0057
        L_0x004e:
            r0 = move-exception
            goto L_0x0051
        L_0x0050:
            r0 = move-exception
        L_0x0051:
            java.lang.Exception r0 = r6.mo12676j(r0)
            r6.f11836j = r0
        L_0x0057:
            E r0 = r6.f11836j
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r6.f11828b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return r2
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        L_0x0063:
            java.lang.Object r4 = r6.f11828b
            monitor-enter(r4)
            boolean r0 = r6.f11837k     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x006e
        L_0x006a:
            r6.m16352t(r3)     // Catch:{ all -> 0x008a }
            goto L_0x0085
        L_0x006e:
            boolean r0 = r3.mo12658n()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x007a
            int r0 = r6.f11839m     // Catch:{ all -> 0x008a }
            int r0 = r0 + r5
            r6.f11839m = r0     // Catch:{ all -> 0x008a }
            goto L_0x006a
        L_0x007a:
            int r0 = r6.f11839m     // Catch:{ all -> 0x008a }
            r3.f11826h = r0     // Catch:{ all -> 0x008a }
            r6.f11839m = r2     // Catch:{ all -> 0x008a }
            java.util.LinkedList<O> r0 = r6.f11830d     // Catch:{ all -> 0x008a }
            r0.addLast(r3)     // Catch:{ all -> 0x008a }
        L_0x0085:
            r6.m16351r(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r4)     // Catch:{ all -> 0x008a }
            return r5
        L_0x008a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008a }
            throw r0
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x0090:
            throw r1
        L_0x0091:
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p202i0.C3897g.m16348l():boolean");
    }

    /* renamed from: o */
    private void m16349o() {
        if (m16347g()) {
            this.f11828b.notify();
        }
    }

    /* renamed from: p */
    private void m16350p() throws Exception {
        E e = this.f11836j;
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: r */
    private void m16351r(I i) {
        i.mo12655k();
        I[] iArr = this.f11831e;
        int i2 = this.f11833g;
        this.f11833g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: t */
    private void m16352t(O o) {
        o.mo12655k();
        O[] oArr = this.f11832f;
        int i = this.f11834h;
        this.f11834h = i + 1;
        oArr[i] = o;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m16353u() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m16348l());
    }

    /* renamed from: a */
    public void mo12664a() {
        synchronized (this.f11828b) {
            this.f11838l = true;
            this.f11828b.notify();
        }
        try {
            this.f11827a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void flush() {
        synchronized (this.f11828b) {
            this.f11837k = true;
            this.f11839m = 0;
            if (this.f11835i != null) {
                m16351r(this.f11835i);
                this.f11835i = null;
            }
            while (!this.f11829c.isEmpty()) {
                m16351r((C3895e) this.f11829c.removeFirst());
            }
            while (!this.f11830d.isEmpty()) {
                m16352t((C3896f) this.f11830d.removeFirst());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract I mo12674h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract O mo12675i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract E mo12676j(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract E mo12677k(I i, O o, boolean z);

    /* renamed from: m */
    public final I mo12667e() throws Exception {
        I i;
        synchronized (this.f11828b) {
            m16350p();
            C4260a.m18074f(this.f11835i == null);
            if (this.f11833g == 0) {
                i = null;
            } else {
                I[] iArr = this.f11831e;
                int i2 = this.f11833g - 1;
                this.f11833g = i2;
                i = iArr[i2];
            }
            this.f11835i = i;
        }
        return i;
    }

    /* renamed from: n */
    public final O mo12666d() throws Exception {
        synchronized (this.f11828b) {
            m16350p();
            if (this.f11830d.isEmpty()) {
                return null;
            }
            O o = (C3896f) this.f11830d.removeFirst();
            return o;
        }
    }

    /* renamed from: q */
    public final void mo12665c(I i) throws Exception {
        synchronized (this.f11828b) {
            m16350p();
            C4260a.m18069a(i == this.f11835i);
            this.f11829c.addLast(i);
            m16349o();
            this.f11835i = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo12681s(O o) {
        synchronized (this.f11828b) {
            m16352t(o);
            m16349o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo12682v(int i) {
        C4260a.m18074f(this.f11833g == this.f11831e.length);
        for (I t : this.f11831e) {
            t.mo12670t(i);
        }
    }
}
