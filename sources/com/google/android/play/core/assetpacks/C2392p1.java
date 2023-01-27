package com.google.android.play.core.assetpacks;

import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.assetpacks.p1 */
final class C2392p1 {

    /* renamed from: d */
    private static final C5100f f7883d = new C5100f("ExtractorTaskFinder");

    /* renamed from: a */
    private final C2379m1 f7884a;

    /* renamed from: b */
    private final C2328c0 f7885b;

    /* renamed from: c */
    private final C2363j0 f7886c;

    C2392p1(C2379m1 m1Var, C2328c0 c0Var, C2363j0 j0Var) {
        this.f7884a = m1Var;
        this.f7885b = c0Var;
        this.f7886c = j0Var;
    }

    /* renamed from: b */
    private final boolean m10988b(C2364j1 j1Var, C2369k1 k1Var) {
        C2328c0 c0Var = this.f7885b;
        C2359i1 i1Var = j1Var.f7820c;
        String str = i1Var.f7800a;
        return c0Var.mo9132w(str, j1Var.f7819b, i1Var.f7801b, k1Var.f7832a).exists();
    }

    /* renamed from: c */
    private static boolean m10989c(C2369k1 k1Var) {
        int i = k1Var.f7837f;
        return i == 1 || i == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.play.core.assetpacks.c2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.play.core.assetpacks.c2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.play.core.assetpacks.z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.play.core.assetpacks.p2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.p2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.google.android.play.core.assetpacks.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.google.android.play.core.assetpacks.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: com.google.android.play.core.assetpacks.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: com.google.android.play.core.assetpacks.p2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: com.google.android.play.core.assetpacks.z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: com.google.android.play.core.assetpacks.c2} */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.play.core.assetpacks.o1] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x040f, code lost:
        if (r0 != null) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        f7883d.mo15203c("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r4.f7818a), r4.f7820c.f7800a);
        r11 = r4.f7818a;
        r8 = r4.f7820c;
        r10 = new com.google.android.play.core.assetpacks.C2330c2(r11, r8.f7800a, r4.f7819b, r8.f7801b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0218, code lost:
        r0 = f7883d;
        r4 = new java.lang.Object[r8];
        r4[r7] = java.lang.Integer.valueOf(r6.f7818a);
        r4[1] = r6.f7820c.f7800a;
        r4[2] = r10.f7832a;
        r0.mo15203c("Found extraction task for patch for session %s, pack %s, slice %s.", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r11 = r1.f7885b;
        r4 = r6.f7820c;
        r0 = new java.io.FileInputStream(r11.mo9132w(r4.f7800a, r6.f7819b, r4.f7801b, r10.f7832a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r9 = r6.f7818a;
        r11 = r6.f7820c;
        r19 = new com.google.android.play.core.assetpacks.C2399r0(r9, r11.f7800a, r6.f7819b, r11.f7801b, r10.f7832a, 0, 0, 1, r11.f7803d, r11.f7802c, r0);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C2388o1 mo9227a() {
        /*
            r34 = this;
            r1 = r34
            com.google.android.play.core.assetpacks.m1 r0 = r1.f7884a     // Catch:{ all -> 0x0424 }
            r0.mo9197b()     // Catch:{ all -> 0x0424 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0424 }
            r2.<init>()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.m1 r0 = r1.f7884a     // Catch:{ all -> 0x0424 }
            java.util.Map r0 = r0.mo9206k()     // Catch:{ all -> 0x0424 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0424 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0424 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0424 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.j1 r3 = (com.google.android.play.core.assetpacks.C2364j1) r3     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r4 = r3.f7820c     // Catch:{ all -> 0x0424 }
            int r4 = r4.f7802c     // Catch:{ all -> 0x0424 }
            boolean r4 = com.google.android.play.core.assetpacks.C2420w1.m11067h(r4)     // Catch:{ all -> 0x0424 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0424 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r0 != 0) goto L_0x0417
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0424 }
        L_0x003e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0424 }
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.j1 r4 = (com.google.android.play.core.assetpacks.C2364j1) r4     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.c0 r8 = r1.f7885b     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ IOException -> 0x008d }
            java.lang.String r10 = r9.f7800a     // Catch:{ IOException -> 0x008d }
            int r11 = r4.f7819b     // Catch:{ IOException -> 0x008d }
            long r12 = r9.f7801b     // Catch:{ IOException -> 0x008d }
            int r8 = r8.mo9127r(r10, r11, r12)     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ IOException -> 0x008d }
            java.util.List<com.google.android.play.core.assetpacks.k1> r9 = r9.f7804e     // Catch:{ IOException -> 0x008d }
            int r9 = r9.size()     // Catch:{ IOException -> 0x008d }
            if (r8 != r9) goto L_0x003e
            g.d.a.e.a.c.f r0 = f7883d     // Catch:{ all -> 0x0424 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0424 }
            int r9 = r4.f7818a     // Catch:{ all -> 0x0424 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0424 }
            r8[r7] = r9     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r9.f7800a     // Catch:{ all -> 0x0424 }
            r8[r6] = r9     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo15203c(r9, r8)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.c2 r0 = new com.google.android.play.core.assetpacks.c2     // Catch:{ all -> 0x0424 }
            int r11 = r4.f7818a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r8 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r12 = r8.f7800a     // Catch:{ all -> 0x0424 }
            int r13 = r4.f7819b     // Catch:{ all -> 0x0424 }
            long r14 = r8.f7801b     // Catch:{ all -> 0x0424 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x0424 }
            goto L_0x00ad
        L_0x008d:
            r0 = move-exception
            com.google.android.play.core.assetpacks.u0 r2 = new com.google.android.play.core.assetpacks.u0     // Catch:{ all -> 0x0424 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0424 }
            int r5 = r4.f7818a     // Catch:{ all -> 0x0424 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0424 }
            r3[r7] = r5     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r5 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r5 = r5.f7800a     // Catch:{ all -> 0x0424 }
            r3[r6] = r5     // Catch:{ all -> 0x0424 }
            java.lang.String r5 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x0424 }
            int r4 = r4.f7818a     // Catch:{ all -> 0x0424 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0424 }
            throw r2     // Catch:{ all -> 0x0424 }
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 != 0) goto L_0x0411
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0424 }
        L_0x00b3:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0424 }
            r8 = 3
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.j1 r4 = (com.google.android.play.core.assetpacks.C2364j1) r4     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ all -> 0x0424 }
            int r9 = r9.f7802c     // Catch:{ all -> 0x0424 }
            boolean r9 = com.google.android.play.core.assetpacks.C2420w1.m11067h(r9)     // Catch:{ all -> 0x0424 }
            if (r9 == 0) goto L_0x00b3
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.util.List<com.google.android.play.core.assetpacks.k1> r9 = r9.f7804e     // Catch:{ all -> 0x0424 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0424 }
        L_0x00d2:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0424 }
            if (r10 == 0) goto L_0x00b3
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.k1 r10 = (com.google.android.play.core.assetpacks.C2369k1) r10     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.c0 r11 = r1.f7885b     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r12 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r13 = r12.f7800a     // Catch:{ all -> 0x0424 }
            int r14 = r4.f7819b     // Catch:{ all -> 0x0424 }
            long r5 = r12.f7801b     // Catch:{ all -> 0x0424 }
            java.lang.String r15 = r10.f7832a     // Catch:{ all -> 0x0424 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.mo9121k(r12, r13, r14, r16)     // Catch:{ all -> 0x0424 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0424 }
            if (r5 == 0) goto L_0x0134
            g.d.a.e.a.c.f r0 = f7883d     // Catch:{ all -> 0x0424 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0424 }
            int r6 = r4.f7818a     // Catch:{ all -> 0x0424 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0424 }
            r5[r7] = r6     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r6 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r6 = r6.f7800a     // Catch:{ all -> 0x0424 }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x0424 }
            java.lang.String r6 = r10.f7832a     // Catch:{ all -> 0x0424 }
            r9 = 2
            r5[r9] = r6     // Catch:{ all -> 0x0424 }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo15203c(r6, r5)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.z1 r0 = new com.google.android.play.core.assetpacks.z1     // Catch:{ all -> 0x0424 }
            int r5 = r4.f7818a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r6 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r6.f7800a     // Catch:{ all -> 0x0424 }
            int r4 = r4.f7819b     // Catch:{ all -> 0x0424 }
            long r11 = r6.f7801b     // Catch:{ all -> 0x0424 }
            java.lang.String r6 = r10.f7832a     // Catch:{ all -> 0x0424 }
            r19 = r0
            r20 = r5
            r21 = r9
            r22 = r4
            r23 = r11
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0424 }
            goto L_0x0138
        L_0x0134:
            r5 = 2
            r6 = 1
            goto L_0x00d2
        L_0x0137:
            r0 = 0
        L_0x0138:
            if (r0 != 0) goto L_0x0411
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0424 }
        L_0x013e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0424 }
            if (r4 == 0) goto L_0x01d8
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.j1 r4 = (com.google.android.play.core.assetpacks.C2364j1) r4     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r5 = r4.f7820c     // Catch:{ all -> 0x0424 }
            int r5 = r5.f7802c     // Catch:{ all -> 0x0424 }
            boolean r5 = com.google.android.play.core.assetpacks.C2420w1.m11067h(r5)     // Catch:{ all -> 0x0424 }
            if (r5 == 0) goto L_0x013e
            com.google.android.play.core.assetpacks.i1 r5 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.util.List<com.google.android.play.core.assetpacks.k1> r5 = r5.f7804e     // Catch:{ all -> 0x0424 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0424 }
        L_0x015c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0424 }
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.k1 r6 = (com.google.android.play.core.assetpacks.C2369k1) r6     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.m2 r16 = new com.google.android.play.core.assetpacks.m2     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.c0 r10 = r1.f7885b     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r11 = r9.f7800a     // Catch:{ all -> 0x0424 }
            int r12 = r4.f7819b     // Catch:{ all -> 0x0424 }
            long r13 = r9.f7801b     // Catch:{ all -> 0x0424 }
            java.lang.String r15 = r6.f7832a     // Catch:{ all -> 0x0424 }
            r9 = r16
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0424 }
            boolean r9 = r16.mo9223m()     // Catch:{ all -> 0x0424 }
            if (r9 == 0) goto L_0x015c
            com.google.android.play.core.assetpacks.c0 r10 = r1.f7885b     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r11 = r9.f7800a     // Catch:{ all -> 0x0424 }
            int r12 = r4.f7819b     // Catch:{ all -> 0x0424 }
            long r13 = r9.f7801b     // Catch:{ all -> 0x0424 }
            java.lang.String r15 = r6.f7832a     // Catch:{ all -> 0x0424 }
            java.io.File r9 = r10.mo9115c(r11, r12, r13, r15)     // Catch:{ all -> 0x0424 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0424 }
            if (r9 == 0) goto L_0x015c
            g.d.a.e.a.c.f r0 = f7883d     // Catch:{ all -> 0x0424 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0424 }
            int r9 = r4.f7818a     // Catch:{ all -> 0x0424 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0424 }
            r5[r7] = r9     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r9.f7800a     // Catch:{ all -> 0x0424 }
            r10 = 1
            r5[r10] = r9     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r6.f7832a     // Catch:{ all -> 0x0424 }
            r10 = 2
            r5[r10] = r9     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo15203c(r9, r5)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.p2 r0 = new com.google.android.play.core.assetpacks.p2     // Catch:{ all -> 0x0424 }
            int r5 = r4.f7818a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r10 = r9.f7800a     // Catch:{ all -> 0x0424 }
            int r4 = r4.f7819b     // Catch:{ all -> 0x0424 }
            long r11 = r9.f7801b     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r6.f7832a     // Catch:{ all -> 0x0424 }
            java.lang.String r13 = r6.f7833b     // Catch:{ all -> 0x0424 }
            long r14 = r6.f7834c     // Catch:{ all -> 0x0424 }
            r19 = r0
            r20 = r5
            r21 = r10
            r22 = r4
            r23 = r11
            r25 = r9
            r26 = r13
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ all -> 0x0424 }
            goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            if (r0 != 0) goto L_0x0411
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0424 }
        L_0x01df:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0424 }
            r5 = 4
            if (r0 == 0) goto L_0x035b
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0424 }
            r6 = r0
            com.google.android.play.core.assetpacks.j1 r6 = (com.google.android.play.core.assetpacks.C2364j1) r6     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r0 = r6.f7820c     // Catch:{ all -> 0x0424 }
            int r0 = r0.f7802c     // Catch:{ all -> 0x0424 }
            boolean r0 = com.google.android.play.core.assetpacks.C2420w1.m11067h(r0)     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x01df
            com.google.android.play.core.assetpacks.i1 r0 = r6.f7820c     // Catch:{ all -> 0x0424 }
            java.util.List<com.google.android.play.core.assetpacks.k1> r0 = r0.f7804e     // Catch:{ all -> 0x0424 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0424 }
        L_0x01ff:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0424 }
            r10 = r0
            com.google.android.play.core.assetpacks.k1 r10 = (com.google.android.play.core.assetpacks.C2369k1) r10     // Catch:{ all -> 0x0424 }
            boolean r0 = m10989c(r10)     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x02a2
            boolean r0 = r1.m10988b(r6, r10)     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x01ff
            g.d.a.e.a.c.f r0 = f7883d     // Catch:{ all -> 0x0424 }
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x0424 }
            int r9 = r6.f7818a     // Catch:{ all -> 0x0424 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0424 }
            r4[r7] = r9     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r9 = r6.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r9.f7800a     // Catch:{ all -> 0x0424 }
            r11 = 1
            r4[r11] = r9     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r10.f7832a     // Catch:{ all -> 0x0424 }
            r11 = 2
            r4[r11] = r9     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = "Found extraction task for patch for session %s, pack %s, slice %s."
            r0.mo15203c(r9, r4)     // Catch:{ all -> 0x0424 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x027b }
            com.google.android.play.core.assetpacks.c0 r11 = r1.f7885b     // Catch:{ FileNotFoundException -> 0x027b }
            com.google.android.play.core.assetpacks.i1 r4 = r6.f7820c     // Catch:{ FileNotFoundException -> 0x027b }
            java.lang.String r12 = r4.f7800a     // Catch:{ FileNotFoundException -> 0x027b }
            int r13 = r6.f7819b     // Catch:{ FileNotFoundException -> 0x027b }
            long r14 = r4.f7801b     // Catch:{ FileNotFoundException -> 0x027b }
            java.lang.String r4 = r10.f7832a     // Catch:{ FileNotFoundException -> 0x027b }
            r16 = r4
            java.io.File r4 = r11.mo9132w(r12, r13, r14, r16)     // Catch:{ FileNotFoundException -> 0x027b }
            r0.<init>(r4)     // Catch:{ FileNotFoundException -> 0x027b }
            com.google.android.play.core.assetpacks.r0 r4 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x0424 }
            int r9 = r6.f7818a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r11 = r6.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r12 = r11.f7800a     // Catch:{ all -> 0x0424 }
            int r6 = r6.f7819b     // Catch:{ all -> 0x0424 }
            long r13 = r11.f7801b     // Catch:{ all -> 0x0424 }
            java.lang.String r10 = r10.f7832a     // Catch:{ all -> 0x0424 }
            long r7 = r11.f7803d     // Catch:{ all -> 0x0424 }
            r26 = 0
            r27 = 0
            r28 = 1
            int r11 = r11.f7802c     // Catch:{ all -> 0x0424 }
            r19 = r4
            r20 = r9
            r21 = r12
            r22 = r6
            r23 = r13
            r25 = r10
            r29 = r7
            r31 = r11
            r32 = r0
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0424 }
            goto L_0x035c
        L_0x027b:
            r0 = move-exception
            com.google.android.play.core.assetpacks.u0 r2 = new com.google.android.play.core.assetpacks.u0     // Catch:{ all -> 0x0424 }
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0424 }
            int r4 = r6.f7818a     // Catch:{ all -> 0x0424 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0424 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r4 = r6.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r4 = r4.f7800a     // Catch:{ all -> 0x0424 }
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x0424 }
            java.lang.String r4 = r10.f7832a     // Catch:{ all -> 0x0424 }
            r5 = 2
            r3[r5] = r4     // Catch:{ all -> 0x0424 }
            java.lang.String r4 = "Error finding patch, session %s packName %s sliceId %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0424 }
            int r4 = r6.f7818a     // Catch:{ all -> 0x0424 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0424 }
            throw r2     // Catch:{ all -> 0x0424 }
        L_0x02a2:
            com.google.android.play.core.assetpacks.m2 r0 = new com.google.android.play.core.assetpacks.m2     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.c0 r7 = r1.f7885b     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r8 = r6.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r11 = r8.f7800a     // Catch:{ all -> 0x0424 }
            int r12 = r6.f7819b     // Catch:{ all -> 0x0424 }
            long r13 = r8.f7801b     // Catch:{ all -> 0x0424 }
            java.lang.String r8 = r10.f7832a     // Catch:{ all -> 0x0424 }
            r19 = r0
            r20 = r7
            r21 = r11
            r22 = r12
            r23 = r13
            r25 = r8
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0424 }
            int r0 = r0.mo9222l()     // Catch:{ IOException -> 0x02c4 }
            goto L_0x02d4
        L_0x02c4:
            r0 = move-exception
            r7 = r0
            g.d.a.e.a.c.f r0 = f7883d     // Catch:{ all -> 0x0424 }
            r8 = 1
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x0424 }
            r8 = 0
            r11[r8] = r7     // Catch:{ all -> 0x0424 }
            java.lang.String r7 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo15205e(r7, r11)     // Catch:{ all -> 0x0424 }
            r0 = 0
        L_0x02d4:
            r7 = -1
            if (r0 == r7) goto L_0x0357
            java.util.List<com.google.android.play.core.assetpacks.h1> r7 = r10.f7835d     // Catch:{ all -> 0x0424 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.h1 r7 = (com.google.android.play.core.assetpacks.C2354h1) r7     // Catch:{ all -> 0x0424 }
            boolean r7 = r7.f7790a     // Catch:{ all -> 0x0424 }
            if (r7 == 0) goto L_0x0357
            g.d.a.e.a.c.f r4 = f7883d     // Catch:{ all -> 0x0424 }
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0424 }
            int r8 = r10.f7836e     // Catch:{ all -> 0x0424 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0424 }
            r9 = 0
            r7[r9] = r8     // Catch:{ all -> 0x0424 }
            int r8 = r6.f7818a     // Catch:{ all -> 0x0424 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0424 }
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r8 = r6.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r8 = r8.f7800a     // Catch:{ all -> 0x0424 }
            r9 = 2
            r7[r9] = r8     // Catch:{ all -> 0x0424 }
            java.lang.String r8 = r10.f7832a     // Catch:{ all -> 0x0424 }
            r9 = 3
            r7[r9] = r8     // Catch:{ all -> 0x0424 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0424 }
            r7[r5] = r8     // Catch:{ all -> 0x0424 }
            java.lang.String r8 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r4.mo15203c(r8, r7)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.j0 r4 = r1.f7886c     // Catch:{ all -> 0x0424 }
            int r7 = r6.f7818a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r8 = r6.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r8 = r8.f7800a     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r10.f7832a     // Catch:{ all -> 0x0424 }
            java.io.InputStream r32 = r4.mo9159a(r7, r8, r9, r0)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.r0 r4 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x0424 }
            int r7 = r6.f7818a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r8 = r6.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r8.f7800a     // Catch:{ all -> 0x0424 }
            int r11 = r6.f7819b     // Catch:{ all -> 0x0424 }
            long r12 = r8.f7801b     // Catch:{ all -> 0x0424 }
            java.lang.String r8 = r10.f7832a     // Catch:{ all -> 0x0424 }
            int r14 = r10.f7836e     // Catch:{ all -> 0x0424 }
            java.util.List<com.google.android.play.core.assetpacks.h1> r10 = r10.f7835d     // Catch:{ all -> 0x0424 }
            int r28 = r10.size()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r6 = r6.f7820c     // Catch:{ all -> 0x0424 }
            r33 = r4
            long r3 = r6.f7803d     // Catch:{ all -> 0x0424 }
            int r6 = r6.f7802c     // Catch:{ all -> 0x0424 }
            r19 = r33
            r20 = r7
            r21 = r9
            r22 = r11
            r23 = r12
            r25 = r8
            r26 = r14
            r27 = r0
            r29 = r3
            r31 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0424 }
            r4 = r33
            goto L_0x035c
        L_0x0357:
            r7 = 0
            r8 = 3
            goto L_0x01ff
        L_0x035b:
            r4 = 0
        L_0x035c:
            if (r4 != 0) goto L_0x041e
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0424 }
        L_0x0362:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0424 }
            if (r2 == 0) goto L_0x040e
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.j1 r2 = (com.google.android.play.core.assetpacks.C2364j1) r2     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r3 = r2.f7820c     // Catch:{ all -> 0x0424 }
            int r3 = r3.f7802c     // Catch:{ all -> 0x0424 }
            boolean r3 = com.google.android.play.core.assetpacks.C2420w1.m11067h(r3)     // Catch:{ all -> 0x0424 }
            if (r3 == 0) goto L_0x0362
            com.google.android.play.core.assetpacks.i1 r3 = r2.f7820c     // Catch:{ all -> 0x0424 }
            java.util.List<com.google.android.play.core.assetpacks.k1> r3 = r3.f7804e     // Catch:{ all -> 0x0424 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0424 }
        L_0x0380:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0424 }
            if (r4 == 0) goto L_0x0362
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.k1 r4 = (com.google.android.play.core.assetpacks.C2369k1) r4     // Catch:{ all -> 0x0424 }
            boolean r6 = m10989c(r4)     // Catch:{ all -> 0x0424 }
            if (r6 == 0) goto L_0x0380
            java.util.List<com.google.android.play.core.assetpacks.h1> r6 = r4.f7835d     // Catch:{ all -> 0x0424 }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.h1 r6 = (com.google.android.play.core.assetpacks.C2354h1) r6     // Catch:{ all -> 0x0424 }
            boolean r6 = r6.f7790a     // Catch:{ all -> 0x0424 }
            if (r6 == 0) goto L_0x0380
            boolean r6 = r1.m10988b(r2, r4)     // Catch:{ all -> 0x0424 }
            if (r6 != 0) goto L_0x0380
            g.d.a.e.a.c.f r0 = f7883d     // Catch:{ all -> 0x0424 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0424 }
            int r5 = r4.f7837f     // Catch:{ all -> 0x0424 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0424 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0424 }
            int r5 = r2.f7818a     // Catch:{ all -> 0x0424 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0424 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r5 = r2.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r5 = r5.f7800a     // Catch:{ all -> 0x0424 }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x0424 }
            java.lang.String r5 = r4.f7832a     // Catch:{ all -> 0x0424 }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x0424 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo15203c(r5, r3)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.j0 r0 = r1.f7886c     // Catch:{ all -> 0x0424 }
            int r3 = r2.f7818a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r5 = r2.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r5 = r5.f7800a     // Catch:{ all -> 0x0424 }
            java.lang.String r6 = r4.f7832a     // Catch:{ all -> 0x0424 }
            r9 = 0
            java.io.InputStream r24 = r0.mo9159a(r3, r5, r6, r9)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i2 r0 = new com.google.android.play.core.assetpacks.i2     // Catch:{ all -> 0x0424 }
            int r12 = r2.f7818a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r3 = r2.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r13 = r3.f7800a     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.c0 r3 = r1.f7885b     // Catch:{ all -> 0x0424 }
            int r14 = r3.mo9130u(r13)     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.c0 r3 = r1.f7885b     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r5 = r2.f7820c     // Catch:{ all -> 0x0424 }
            java.lang.String r5 = r5.f7800a     // Catch:{ all -> 0x0424 }
            long r15 = r3.mo9133x(r5)     // Catch:{ all -> 0x0424 }
            int r3 = r2.f7819b     // Catch:{ all -> 0x0424 }
            com.google.android.play.core.assetpacks.i1 r2 = r2.f7820c     // Catch:{ all -> 0x0424 }
            long r5 = r2.f7801b     // Catch:{ all -> 0x0424 }
            int r2 = r4.f7837f     // Catch:{ all -> 0x0424 }
            java.lang.String r7 = r4.f7832a     // Catch:{ all -> 0x0424 }
            long r8 = r4.f7834c     // Catch:{ all -> 0x0424 }
            r11 = r0
            r17 = r3
            r18 = r5
            r20 = r2
            r21 = r7
            r22 = r8
            r11.<init>(r12, r13, r14, r15, r17, r18, r20, r21, r22, r24)     // Catch:{ all -> 0x0424 }
            goto L_0x040f
        L_0x040e:
            r0 = 0
        L_0x040f:
            if (r0 == 0) goto L_0x0417
        L_0x0411:
            com.google.android.play.core.assetpacks.m1 r2 = r1.f7884a
            r2.mo9201f()
            return r0
        L_0x0417:
            com.google.android.play.core.assetpacks.m1 r0 = r1.f7884a
            r0.mo9201f()
            r2 = 0
            return r2
        L_0x041e:
            com.google.android.play.core.assetpacks.m1 r0 = r1.f7884a
            r0.mo9201f()
            return r4
        L_0x0424:
            r0 = move-exception
            com.google.android.play.core.assetpacks.m1 r2 = r1.f7884a
            r2.mo9201f()
            goto L_0x042c
        L_0x042b:
            throw r0
        L_0x042c:
            goto L_0x042b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C2392p1.mo9227a():com.google.android.play.core.assetpacks.o1");
    }
}
