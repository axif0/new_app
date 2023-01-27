package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.b5 */
public final class C4467b5 {

    /* renamed from: a */
    private static final C4523e5 f13991a;

    /* renamed from: g.d.a.c.f.f.b5$a */
    static final class C4468a extends C4523e5 {
        C4468a() {
        }

        /* renamed from: a */
        public final void mo13850a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Integer r0 = m18800a()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0014
            int r1 = r0.intValue()     // Catch:{ all -> 0x002a }
            r2 = 19
            if (r1 < r2) goto L_0x0014
            g.d.a.c.f.f.i5 r1 = new g.d.a.c.f.f.i5     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0014:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x002a }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0024
            g.d.a.c.f.f.g5 r1 = new g.d.a.c.f.f.g5     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0024:
            g.d.a.c.f.f.b5$a r1 = new g.d.a.c.f.f.b5$a     // Catch:{ all -> 0x002a }
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
            java.lang.Class<g.d.a.c.f.f.b5$a> r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4467b5.C4468a.class
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
            g.d.a.c.f.f.b5$a r1 = new g.d.a.c.f.f.b5$a
            r1.<init>()
        L_0x0063:
            f13991a = r1
            if (r0 != 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            r0.intValue()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4467b5.<clinit>():void");
    }

    /* renamed from: a */
    private static Integer m18800a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: b */
    public static void m18801b(Throwable th, Throwable th2) {
        f13991a.mo13850a(th, th2);
    }
}
