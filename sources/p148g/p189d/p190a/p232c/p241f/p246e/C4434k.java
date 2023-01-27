package p148g.p189d.p190a.p232c.p241f.p246e;

/* renamed from: g.d.a.c.f.e.k */
public final class C4434k {

    /* renamed from: a */
    private static final C4438n f13959a;

    /* renamed from: g.d.a.c.f.e.k$a */
    static final class C4435a extends C4438n {
        C4435a() {
        }

        /* renamed from: a */
        public final void mo13762a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Integer r0 = m18681a()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0014
            int r1 = r0.intValue()     // Catch:{ all -> 0x002a }
            r2 = 19
            if (r1 < r2) goto L_0x0014
            g.d.a.c.f.e.q r1 = new g.d.a.c.f.e.q     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0014:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x002a }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0024
            g.d.a.c.f.e.o r1 = new g.d.a.c.f.e.o     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0024:
            g.d.a.c.f.e.k$a r1 = new g.d.a.c.f.e.k$a     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x002a:
            r1 = move-exception
            goto L_0x002e
        L_0x002c:
            r1 = move-exception
            r0 = 0
        L_0x002e:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<g.d.a.c.f.e.k$a> r3 = p148g.p189d.p190a.p232c.p241f.p246e.C4434k.C4435a.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 133
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            g.d.a.c.f.e.k$a r1 = new g.d.a.c.f.e.k$a
            r1.<init>()
        L_0x0063:
            f13959a = r1
            if (r0 != 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            r0.intValue()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p246e.C4434k.<clinit>():void");
    }

    /* renamed from: a */
    private static Integer m18681a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: b */
    public static void m18682b(Throwable th, Throwable th2) {
        f13959a.mo13762a(th, th2);
    }
}
