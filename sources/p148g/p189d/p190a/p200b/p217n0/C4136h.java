package p148g.p189d.p190a.p200b.p217n0;

import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.n0.h */
final class C4136h {

    /* renamed from: a */
    private int f13106a = 1000;

    /* renamed from: b */
    private int[] f13107b = new int[1000];

    /* renamed from: c */
    private long[] f13108c = new long[1000];

    /* renamed from: d */
    private int[] f13109d = new int[1000];

    /* renamed from: e */
    private int[] f13110e = new int[1000];

    /* renamed from: f */
    private long[] f13111f = new long[1000];

    /* renamed from: g */
    private C3927n.C3928a[] f13112g = new C3927n.C3928a[1000];

    /* renamed from: h */
    private C4109n[] f13113h = new C4109n[1000];

    /* renamed from: i */
    private int f13114i;

    /* renamed from: j */
    private int f13115j;

    /* renamed from: k */
    private int f13116k;

    /* renamed from: l */
    private int f13117l;

    /* renamed from: m */
    private long f13118m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f13119n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f13120o = true;

    /* renamed from: p */
    private boolean f13121p = true;

    /* renamed from: q */
    private C4109n f13122q;

    /* renamed from: r */
    private int f13123r;

    /* renamed from: g.d.a.b.n0.h$a */
    public static final class C4137a {

        /* renamed from: a */
        public int f13124a;

        /* renamed from: b */
        public long f13125b;

        /* renamed from: c */
        public C3927n.C3928a f13126c;
    }

    /* renamed from: f */
    private long m17493f(int i) {
        this.f13118m = Math.max(this.f13118m, m17495m(i));
        this.f13114i -= i;
        this.f13115j += i;
        int i2 = this.f13116k + i;
        this.f13116k = i2;
        int i3 = this.f13106a;
        if (i2 >= i3) {
            this.f13116k = i2 - i3;
        }
        int i4 = this.f13117l - i;
        this.f13117l = i4;
        if (i4 < 0) {
            this.f13117l = 0;
        }
        if (this.f13114i != 0) {
            return this.f13108c[this.f13116k];
        }
        int i5 = this.f13116k;
        if (i5 == 0) {
            i5 = this.f13106a;
        }
        int i6 = i5 - 1;
        return this.f13108c[i6] + ((long) this.f13109d[i6]);
    }

    /* renamed from: j */
    private int m17494j(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f13111f[i] <= j; i4++) {
            if (!z || (this.f13110e[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f13106a) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: m */
    private long m17495m(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int o = m17496o(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f13111f[o]);
            if ((this.f13110e[o] & 1) != 0) {
                break;
            }
            o--;
            if (o == -1) {
                o = this.f13106a - 1;
            }
        }
        return j;
    }

    /* renamed from: o */
    private int m17496o(int i) {
        int i2 = this.f13116k + i;
        int i3 = this.f13106a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo13139a(long r9, boolean r11, boolean r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f13117l     // Catch:{ all -> 0x0039 }
            int r2 = r8.m17496o(r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r8.mo13152r()     // Catch:{ all -> 0x0039 }
            r7 = -1
            if (r0 == 0) goto L_0x0037
            long[] r0 = r8.f13111f     // Catch:{ all -> 0x0039 }
            r3 = r0[r2]     // Catch:{ all -> 0x0039 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            long r0 = r8.f13119n     // Catch:{ all -> 0x0039 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x001f
            if (r12 != 0) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            int r12 = r8.f13114i     // Catch:{ all -> 0x0039 }
            int r0 = r8.f13117l     // Catch:{ all -> 0x0039 }
            int r3 = r12 - r0
            r1 = r8
            r4 = r9
            r6 = r11
            int r9 = r1.m17494j(r2, r3, r4, r6)     // Catch:{ all -> 0x0039 }
            if (r9 != r7) goto L_0x0030
            monitor-exit(r8)
            return r7
        L_0x0030:
            int r10 = r8.f13117l     // Catch:{ all -> 0x0039 }
            int r10 = r10 + r9
            r8.f13117l = r10     // Catch:{ all -> 0x0039 }
            monitor-exit(r8)
            return r9
        L_0x0037:
            monitor-exit(r8)
            return r7
        L_0x0039:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p217n0.C4136h.mo13139a(long, boolean, boolean):int");
    }

    /* renamed from: b */
    public synchronized int mo13140b() {
        int i;
        i = this.f13114i - this.f13117l;
        this.f13117l = this.f13114i;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo13141c(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f13114i     // Catch:{ all -> 0x004a }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            long r3 = r7.f13118m     // Catch:{ all -> 0x004a }
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            r1 = 1
        L_0x000e:
            monitor-exit(r7)
            return r1
        L_0x0010:
            long r3 = r7.f13118m     // Catch:{ all -> 0x004a }
            int r0 = r7.f13117l     // Catch:{ all -> 0x004a }
            long r5 = r7.m17495m(r0)     // Catch:{ all -> 0x004a }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x004a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            monitor-exit(r7)
            return r1
        L_0x0022:
            int r0 = r7.f13114i     // Catch:{ all -> 0x004a }
            int r1 = r7.f13114i     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            int r1 = r7.m17496o(r1)     // Catch:{ all -> 0x004a }
        L_0x002b:
            int r3 = r7.f13117l     // Catch:{ all -> 0x004a }
            if (r0 <= r3) goto L_0x0042
            long[] r3 = r7.f13111f     // Catch:{ all -> 0x004a }
            r4 = r3[r1]     // Catch:{ all -> 0x004a }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0042
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x002b
            int r1 = r7.f13106a     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            goto L_0x002b
        L_0x0042:
            int r8 = r7.f13115j     // Catch:{ all -> 0x004a }
            int r8 = r8 + r0
            r7.mo13146i(r8)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r2
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x004e
        L_0x004d:
            throw r8
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p217n0.C4136h.mo13141c(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cf, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo13142d(long r6, int r8, long r9, int r11, p148g.p189d.p190a.p200b.p204k0.C3927n.C3928a r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f13120o     // Catch:{ all -> 0x00d0 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f13120o = r1     // Catch:{ all -> 0x00d0 }
        L_0x000e:
            boolean r0 = r5.f13121p     // Catch:{ all -> 0x00d0 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r0)     // Catch:{ all -> 0x00d0 }
            r5.mo13143e(r6)     // Catch:{ all -> 0x00d0 }
            int r0 = r5.f13114i     // Catch:{ all -> 0x00d0 }
            int r0 = r5.m17496o(r0)     // Catch:{ all -> 0x00d0 }
            long[] r3 = r5.f13111f     // Catch:{ all -> 0x00d0 }
            r3[r0] = r6     // Catch:{ all -> 0x00d0 }
            long[] r6 = r5.f13108c     // Catch:{ all -> 0x00d0 }
            r6[r0] = r9     // Catch:{ all -> 0x00d0 }
            int[] r6 = r5.f13109d     // Catch:{ all -> 0x00d0 }
            r6[r0] = r11     // Catch:{ all -> 0x00d0 }
            int[] r6 = r5.f13110e     // Catch:{ all -> 0x00d0 }
            r6[r0] = r8     // Catch:{ all -> 0x00d0 }
            g.d.a.b.k0.n$a[] r6 = r5.f13112g     // Catch:{ all -> 0x00d0 }
            r6[r0] = r12     // Catch:{ all -> 0x00d0 }
            g.d.a.b.n[] r6 = r5.f13113h     // Catch:{ all -> 0x00d0 }
            g.d.a.b.n r7 = r5.f13122q     // Catch:{ all -> 0x00d0 }
            r6[r0] = r7     // Catch:{ all -> 0x00d0 }
            int[] r6 = r5.f13107b     // Catch:{ all -> 0x00d0 }
            int r7 = r5.f13123r     // Catch:{ all -> 0x00d0 }
            r6[r0] = r7     // Catch:{ all -> 0x00d0 }
            int r6 = r5.f13114i     // Catch:{ all -> 0x00d0 }
            int r6 = r6 + r2
            r5.f13114i = r6     // Catch:{ all -> 0x00d0 }
            int r7 = r5.f13106a     // Catch:{ all -> 0x00d0 }
            if (r6 != r7) goto L_0x00ce
            int r6 = r5.f13106a     // Catch:{ all -> 0x00d0 }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00d0 }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00d0 }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00d0 }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00d0 }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00d0 }
            g.d.a.b.k0.n$a[] r12 = new p148g.p189d.p190a.p200b.p204k0.C3927n.C3928a[r6]     // Catch:{ all -> 0x00d0 }
            g.d.a.b.n[] r0 = new p148g.p189d.p190a.p200b.C4109n[r6]     // Catch:{ all -> 0x00d0 }
            int r2 = r5.f13106a     // Catch:{ all -> 0x00d0 }
            int r3 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            int r2 = r2 - r3
            long[] r3 = r5.f13108c     // Catch:{ all -> 0x00d0 }
            int r4 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00d0 }
            long[] r3 = r5.f13111f     // Catch:{ all -> 0x00d0 }
            int r4 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00d0 }
            int[] r3 = r5.f13110e     // Catch:{ all -> 0x00d0 }
            int r4 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00d0 }
            int[] r3 = r5.f13109d     // Catch:{ all -> 0x00d0 }
            int r4 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00d0 }
            g.d.a.b.k0.n$a[] r3 = r5.f13112g     // Catch:{ all -> 0x00d0 }
            int r4 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00d0 }
            g.d.a.b.n[] r3 = r5.f13113h     // Catch:{ all -> 0x00d0 }
            int r4 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00d0 }
            int[] r3 = r5.f13107b     // Catch:{ all -> 0x00d0 }
            int r4 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00d0 }
            int r3 = r5.f13116k     // Catch:{ all -> 0x00d0 }
            long[] r4 = r5.f13108c     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00d0 }
            long[] r4 = r5.f13111f     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00d0 }
            int[] r4 = r5.f13110e     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00d0 }
            int[] r4 = r5.f13109d     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00d0 }
            g.d.a.b.k0.n$a[] r4 = r5.f13112g     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00d0 }
            g.d.a.b.n[] r4 = r5.f13113h     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00d0 }
            int[] r4 = r5.f13107b     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00d0 }
            r5.f13108c = r8     // Catch:{ all -> 0x00d0 }
            r5.f13111f = r9     // Catch:{ all -> 0x00d0 }
            r5.f13110e = r10     // Catch:{ all -> 0x00d0 }
            r5.f13109d = r11     // Catch:{ all -> 0x00d0 }
            r5.f13112g = r12     // Catch:{ all -> 0x00d0 }
            r5.f13113h = r0     // Catch:{ all -> 0x00d0 }
            r5.f13107b = r7     // Catch:{ all -> 0x00d0 }
            r5.f13116k = r1     // Catch:{ all -> 0x00d0 }
            int r7 = r5.f13106a     // Catch:{ all -> 0x00d0 }
            r5.f13114i = r7     // Catch:{ all -> 0x00d0 }
            r5.f13106a = r6     // Catch:{ all -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r5)
            return
        L_0x00d0:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p217n0.C4136h.mo13142d(long, int, long, int, g.d.a.b.k0.n$a):void");
    }

    /* renamed from: e */
    public synchronized void mo13143e(long j) {
        this.f13119n = Math.max(this.f13119n, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo13144g(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f13114i     // Catch:{ all -> 0x0038 }
            r1 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r9.f13111f     // Catch:{ all -> 0x0038 }
            int r3 = r9.f13116k     // Catch:{ all -> 0x0038 }
            r3 = r0[r3]     // Catch:{ all -> 0x0038 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            if (r13 == 0) goto L_0x001f
            int r13 = r9.f13117l     // Catch:{ all -> 0x0038 }
            int r0 = r9.f13114i     // Catch:{ all -> 0x0038 }
            if (r13 == r0) goto L_0x001f
            int r13 = r9.f13117l     // Catch:{ all -> 0x0038 }
            int r13 = r13 + 1
            goto L_0x0021
        L_0x001f:
            int r13 = r9.f13114i     // Catch:{ all -> 0x0038 }
        L_0x0021:
            r5 = r13
            int r4 = r9.f13116k     // Catch:{ all -> 0x0038 }
            r3 = r9
            r6 = r10
            r8 = r12
            int r10 = r3.m17494j(r4, r5, r6, r8)     // Catch:{ all -> 0x0038 }
            r11 = -1
            if (r10 != r11) goto L_0x0030
            monitor-exit(r9)
            return r1
        L_0x0030:
            long r10 = r9.m17493f(r10)     // Catch:{ all -> 0x0038 }
            monitor-exit(r9)
            return r10
        L_0x0036:
            monitor-exit(r9)
            return r1
        L_0x0038:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p217n0.C4136h.mo13144g(long, boolean, boolean):long");
    }

    /* renamed from: h */
    public synchronized long mo13145h() {
        if (this.f13114i == 0) {
            return -1;
        }
        return m17493f(this.f13114i);
    }

    /* renamed from: i */
    public long mo13146i(int i) {
        int q = mo13151q() - i;
        C4260a.m18069a(q >= 0 && q <= this.f13114i - this.f13117l);
        int i2 = this.f13114i - q;
        this.f13114i = i2;
        this.f13119n = Math.max(this.f13118m, m17495m(i2));
        int i3 = this.f13114i;
        if (i3 == 0) {
            return 0;
        }
        int o = m17496o(i3 - 1);
        return this.f13108c[o] + ((long) this.f13109d[o]);
    }

    /* renamed from: k */
    public synchronized boolean mo13147k(C4109n nVar) {
        if (nVar == null) {
            this.f13121p = true;
            return false;
        }
        this.f13121p = false;
        if (C4284w.m18236b(nVar, this.f13122q)) {
            return false;
        }
        this.f13122q = nVar;
        return true;
    }

    /* renamed from: l */
    public synchronized long mo13148l() {
        return this.f13119n;
    }

    /* renamed from: n */
    public int mo13149n() {
        return this.f13115j + this.f13117l;
    }

    /* renamed from: p */
    public synchronized C4109n mo13150p() {
        return this.f13121p ? null : this.f13122q;
    }

    /* renamed from: q */
    public int mo13151q() {
        return this.f13115j + this.f13114i;
    }

    /* renamed from: r */
    public synchronized boolean mo13152r() {
        return this.f13117l != this.f13114i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        return -3;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo13153s(p148g.p189d.p190a.p200b.C4150o r5, p148g.p189d.p190a.p200b.p202i0.C3895e r6, boolean r7, boolean r8, p148g.p189d.p190a.p200b.C4109n r9, p148g.p189d.p190a.p200b.p217n0.C4136h.C4137a r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo13152r()     // Catch:{ all -> 0x006a }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0024
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.mo12661r(r5)     // Catch:{ all -> 0x006a }
            monitor-exit(r4)
            return r3
        L_0x0012:
            g.d.a.b.n r6 = r4.f13122q     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x0022
            if (r7 != 0) goto L_0x001c
            g.d.a.b.n r6 = r4.f13122q     // Catch:{ all -> 0x006a }
            if (r6 == r9) goto L_0x0022
        L_0x001c:
            g.d.a.b.n r6 = r4.f13122q     // Catch:{ all -> 0x006a }
            r5.f13171a = r6     // Catch:{ all -> 0x006a }
            monitor-exit(r4)
            return r1
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            int r8 = r4.f13117l     // Catch:{ all -> 0x006a }
            int r8 = r4.m17496o(r8)     // Catch:{ all -> 0x006a }
            if (r7 != 0) goto L_0x0062
            g.d.a.b.n[] r7 = r4.f13113h     // Catch:{ all -> 0x006a }
            r7 = r7[r8]     // Catch:{ all -> 0x006a }
            if (r7 == r9) goto L_0x0033
            goto L_0x0062
        L_0x0033:
            boolean r5 = r6.mo12673w()     // Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x003b
            monitor-exit(r4)
            return r2
        L_0x003b:
            long[] r5 = r4.f13111f     // Catch:{ all -> 0x006a }
            r0 = r5[r8]     // Catch:{ all -> 0x006a }
            r6.f11823i = r0     // Catch:{ all -> 0x006a }
            int[] r5 = r4.f13110e     // Catch:{ all -> 0x006a }
            r5 = r5[r8]     // Catch:{ all -> 0x006a }
            r6.mo12661r(r5)     // Catch:{ all -> 0x006a }
            int[] r5 = r4.f13109d     // Catch:{ all -> 0x006a }
            r5 = r5[r8]     // Catch:{ all -> 0x006a }
            r10.f13124a = r5     // Catch:{ all -> 0x006a }
            long[] r5 = r4.f13108c     // Catch:{ all -> 0x006a }
            r6 = r5[r8]     // Catch:{ all -> 0x006a }
            r10.f13125b = r6     // Catch:{ all -> 0x006a }
            g.d.a.b.k0.n$a[] r5 = r4.f13112g     // Catch:{ all -> 0x006a }
            r5 = r5[r8]     // Catch:{ all -> 0x006a }
            r10.f13126c = r5     // Catch:{ all -> 0x006a }
            int r5 = r4.f13117l     // Catch:{ all -> 0x006a }
            int r5 = r5 + 1
            r4.f13117l = r5     // Catch:{ all -> 0x006a }
            monitor-exit(r4)
            return r3
        L_0x0062:
            g.d.a.b.n[] r6 = r4.f13113h     // Catch:{ all -> 0x006a }
            r6 = r6[r8]     // Catch:{ all -> 0x006a }
            r5.f13171a = r6     // Catch:{ all -> 0x006a }
            monitor-exit(r4)
            return r1
        L_0x006a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p217n0.C4136h.mo13153s(g.d.a.b.o, g.d.a.b.i0.e, boolean, boolean, g.d.a.b.n, g.d.a.b.n0.h$a):int");
    }

    /* renamed from: t */
    public void mo13154t(boolean z) {
        this.f13114i = 0;
        this.f13115j = 0;
        this.f13116k = 0;
        this.f13117l = 0;
        this.f13120o = true;
        this.f13118m = Long.MIN_VALUE;
        this.f13119n = Long.MIN_VALUE;
        if (z) {
            this.f13122q = null;
            this.f13121p = true;
        }
    }

    /* renamed from: u */
    public synchronized void mo13155u() {
        this.f13117l = 0;
    }
}
