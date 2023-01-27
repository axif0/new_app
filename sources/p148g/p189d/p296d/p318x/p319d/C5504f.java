package p148g.p189d.p296d.p318x.p319d;

/* renamed from: g.d.d.x.d.f */
final class C5504f {

    /* renamed from: a */
    private final C5497a f15931a;

    /* renamed from: b */
    private final C5505g[] f15932b;

    /* renamed from: c */
    private C5499c f15933c;

    /* renamed from: d */
    private final int f15934d;

    C5504f(C5497a aVar, C5499c cVar) {
        this.f15931a = aVar;
        int a = aVar.mo15840a();
        this.f15934d = a;
        this.f15933c = cVar;
        this.f15932b = new C5505g[(a + 2)];
    }

    /* renamed from: a */
    private void m22724a(C5505g gVar) {
        if (gVar != null) {
            ((C5506h) gVar).mo15883g(this.f15931a);
        }
    }

    /* renamed from: b */
    private static boolean m22725b(C5500d dVar, C5500d dVar2) {
        if (dVar2 == null || !dVar2.mo15862g() || dVar2.mo15856a() != dVar.mo15856a()) {
            return false;
        }
        dVar.mo15864i(dVar2.mo15858c());
        return true;
    }

    /* renamed from: c */
    private static int m22726c(int i, int i2, C5500d dVar) {
        if (dVar == null || dVar.mo15862g()) {
            return i2;
        }
        if (!dVar.mo15863h(i)) {
            return i2 + 1;
        }
        dVar.mo15864i(i);
        return 0;
    }

    /* renamed from: d */
    private int m22727d() {
        int f = m22729f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f15934d + 1; i++) {
            C5500d[] d = this.f15932b[i].mo15879d();
            for (int i2 = 0; i2 < d.length; i2++) {
                if (d[i2] != null && !d[i2].mo15862g()) {
                    m22728e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    private void m22728e(int i, int i2, C5500d[] dVarArr) {
        C5500d dVar = dVarArr[i2];
        C5500d[] d = this.f15932b[i - 1].mo15879d();
        C5505g[] gVarArr = this.f15932b;
        int i3 = i + 1;
        C5500d[] d2 = gVarArr[i3] != null ? gVarArr[i3].mo15879d() : d;
        C5500d[] dVarArr2 = new C5500d[14];
        dVarArr2[2] = d[i2];
        dVarArr2[3] = d2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = d[i5];
            dVarArr2[5] = d2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = d[i6];
            dVarArr2[11] = d2[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = d[i7];
            dVarArr2[7] = d2[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = d[i8];
            dVarArr2[13] = d2[i8];
        }
        while (i4 < 14 && !m22725b(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: f */
    private int m22729f() {
        m22730g();
        return m22731h() + m22732i();
    }

    /* renamed from: g */
    private void m22730g() {
        C5505g[] gVarArr = this.f15932b;
        if (gVarArr[0] != null && gVarArr[this.f15934d + 1] != null) {
            C5500d[] d = gVarArr[0].mo15879d();
            C5500d[] d2 = this.f15932b[this.f15934d + 1].mo15879d();
            for (int i = 0; i < d.length; i++) {
                if (!(d[i] == null || d2[i] == null || d[i].mo15858c() != d2[i].mo15858c())) {
                    for (int i2 = 1; i2 <= this.f15934d; i2++) {
                        C5500d dVar = this.f15932b[i2].mo15879d()[i];
                        if (dVar != null) {
                            dVar.mo15864i(d[i].mo15858c());
                            if (!dVar.mo15862g()) {
                                this.f15932b[i2].mo15879d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m22731h() {
        C5505g[] gVarArr = this.f15932b;
        if (gVarArr[0] == null) {
            return 0;
        }
        C5500d[] d = gVarArr[0].mo15879d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            if (d[i2] != null) {
                int c = d[i2].mo15858c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f15934d + 1 && i3 < 2; i4++) {
                    C5500d dVar = this.f15932b[i4].mo15879d()[i2];
                    if (dVar != null) {
                        i3 = m22726c(c, i3, dVar);
                        if (!dVar.mo15862g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m22732i() {
        C5505g[] gVarArr = this.f15932b;
        int i = this.f15934d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C5500d[] d = gVarArr[i + 1].mo15879d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3] != null) {
                int c = d[i3].mo15858c();
                int i4 = 0;
                for (int i5 = this.f15934d + 1; i5 > 0 && i4 < 2; i5--) {
                    C5500d dVar = this.f15932b[i5].mo15879d()[i3];
                    if (dVar != null) {
                        i4 = m22726c(c, i4, dVar);
                        if (!dVar.mo15862g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo15867j() {
        return this.f15934d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo15868k() {
        return this.f15931a.mo15841b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo15869l() {
        return this.f15931a.mo15842c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C5499c mo15870m() {
        return this.f15933c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C5505g mo15871n(int i) {
        return this.f15932b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C5505g[] mo15872o() {
        m22724a(this.f15932b[0]);
        m22724a(this.f15932b[this.f15934d + 1]);
        int i = 928;
        while (true) {
            int d = m22727d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f15932b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo15873p(C5499c cVar) {
        this.f15933c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo15874q(int i, C5505g gVar) {
        this.f15932b[i] = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            g.d.d.x.d.g[] r0 = r10.f15932b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f15934d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = 0
        L_0x0013:
            g.d.d.x.d.d[] r5 = r2.mo15879d()     // Catch:{ all -> 0x007e }
            int r5 = r5.length     // Catch:{ all -> 0x007e }
            if (r4 >= r5) goto L_0x0076
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007e }
            r6[r1] = r7     // Catch:{ all -> 0x007e }
            r0.format(r5, r6)     // Catch:{ all -> 0x007e }
            r5 = 0
        L_0x0028:
            int r6 = r10.f15934d     // Catch:{ all -> 0x007e }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x006c
            g.d.d.x.d.g[] r6 = r10.f15932b     // Catch:{ all -> 0x007e }
            r6 = r6[r5]     // Catch:{ all -> 0x007e }
            java.lang.String r8 = "    |   "
            if (r6 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r0.format(r8, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0069
        L_0x003c:
            g.d.d.x.d.g[] r6 = r10.f15932b     // Catch:{ all -> 0x007e }
            r6 = r6[r5]     // Catch:{ all -> 0x007e }
            g.d.d.x.d.d[] r6 = r6.mo15879d()     // Catch:{ all -> 0x007e }
            r6 = r6[r4]     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x004e
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r0.format(r8, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0069
        L_0x004e:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007e }
            int r9 = r6.mo15858c()     // Catch:{ all -> 0x007e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007e }
            r7[r1] = r9     // Catch:{ all -> 0x007e }
            int r6 = r6.mo15860e()     // Catch:{ all -> 0x007e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007e }
            r7[r3] = r6     // Catch:{ all -> 0x007e }
            r0.format(r8, r7)     // Catch:{ all -> 0x007e }
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x006c:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r0.format(r5, r6)     // Catch:{ all -> 0x007e }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0076:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007e }
            r0.close()
            return r1
        L_0x007e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0089:
            goto L_0x008b
        L_0x008a:
            throw r2
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p318x.p319d.C5504f.toString():java.lang.String");
    }
}
