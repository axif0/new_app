package p148g.p189d.p296d.p318x.p319d;

/* renamed from: g.d.d.x.d.g */
class C5505g {

    /* renamed from: a */
    private final C5499c f15935a;

    /* renamed from: b */
    private final C5500d[] f15936b;

    C5505g(C5499c cVar) {
        this.f15935a = new C5499c(cVar);
        this.f15936b = new C5500d[((cVar.mo15851e() - cVar.mo15853g()) + 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5499c mo15876a() {
        return this.f15935a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5500d mo15877b(int i) {
        return this.f15936b[mo15880e(i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C5500d mo15878c(int i) {
        C5500d dVar;
        C5500d dVar2;
        C5500d b = mo15877b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo15880e(i) - i2;
            if (e >= 0 && (dVar2 = this.f15936b[e]) != null) {
                return dVar2;
            }
            int e2 = mo15880e(i) + i2;
            C5500d[] dVarArr = this.f15936b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C5500d[] mo15879d() {
        return this.f15936b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo15880e(int i) {
        return i - this.f15935a.mo15853g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo15881f(int i, C5500d dVar) {
        this.f15936b[mo15880e(i)] = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            g.d.d.x.d.d[] r1 = r11.f15936b     // Catch:{ all -> 0x0054 }
            int r2 = r1.length     // Catch:{ all -> 0x0054 }
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x004c
            r6 = r1[r4]     // Catch:{ all -> 0x0054 }
            r7 = 1
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0054 }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r7[r3] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0054 }
            r5 = r8
            goto L_0x0049
        L_0x0023:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0054 }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r3] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.mo15858c()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r7] = r5     // Catch:{ all -> 0x0054 }
            r5 = 2
            int r6 = r6.mo15860e()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0054 }
            r9[r5] = r6     // Catch:{ all -> 0x0054 }
            r0.format(r8, r9)     // Catch:{ all -> 0x0054 }
            r5 = r10
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x004c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0054 }
            r0.close()
            return r1
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x005f:
            goto L_0x0061
        L_0x0060:
            throw r2
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p318x.p319d.C5505g.toString():java.lang.String");
    }
}
