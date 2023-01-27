package p148g.p189d.p190a.p232c.p241f.p247f;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g.d.a.c.f.f.g2 */
public abstract class C4558g2<T> {

    /* renamed from: g */
    private static final Object f14128g = new Object();

    /* renamed from: h */
    private static volatile C4705o2 f14129h;

    /* renamed from: i */
    private static C4787t2 f14130i = new C4787t2(C4593i2.f14179a);

    /* renamed from: j */
    private static final AtomicInteger f14131j = new AtomicInteger();

    /* renamed from: a */
    private final C4721p2 f14132a;

    /* renamed from: b */
    private final String f14133b;

    /* renamed from: c */
    private final T f14134c;

    /* renamed from: d */
    private volatile int f14135d;

    /* renamed from: e */
    private volatile T f14136e;

    /* renamed from: f */
    private final boolean f14137f;

    static {
        new AtomicReference();
    }

    private C4558g2(C4721p2 p2Var, String str, T t, boolean z) {
        this.f14135d = -1;
        if (p2Var.f14363a != null) {
            this.f14132a = p2Var;
            this.f14133b = str;
            this.f14134c = t;
            this.f14137f = z;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ C4558g2(C4721p2 p2Var, String str, Object obj, boolean z, C4649l2 l2Var) {
        this(p2Var, str, obj, z);
    }

    /* renamed from: f */
    private final String m19507f(String str) {
        if (str != null && str.isEmpty()) {
            return this.f14133b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f14133b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: g */
    static void m19508g() {
        f14131j.incrementAndGet();
    }

    @Deprecated
    /* renamed from: h */
    public static void m19509h(Context context) {
        synchronized (f14128g) {
            C4705o2 o2Var = f14129h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (o2Var == null || o2Var.mo14495a() != context) {
                C4752r1.m20263d();
                C4753r2.m20270b();
                C4446a2.m18696b();
                f14129h = new C4769s1(context, C4521e3.m19304a(new C4611j2(context)));
                f14131j.incrementAndGet();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static C4558g2<Double> m19510i(C4721p2 p2Var, String str, double d, boolean z) {
        return new C4687n2(p2Var, str, Double.valueOf(-3.0d), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static C4558g2<Long> m19511j(C4721p2 p2Var, String str, long j, boolean z) {
        return new C4649l2(p2Var, str, Long.valueOf(j), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static C4558g2<String> m19512k(C4721p2 p2Var, String str, String str2, boolean z) {
        return new C4669m2(p2Var, str, str2, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static C4558g2<Boolean> m19513l(C4721p2 p2Var, String str, boolean z, boolean z2) {
        return new C4631k2(p2Var, str, Boolean.valueOf(z), true);
    }

    /* renamed from: p */
    static final /* synthetic */ boolean m19515p() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract T mo14173e(Object obj);

    /* renamed from: n */
    public final String mo14174n() {
        return m19507f(this.f14132a.f14365c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo14175o() {
        /*
            r7 = this;
            boolean r0 = r7.f14137f
            if (r0 != 0) goto L_0x0011
            g.d.a.c.f.f.t2 r0 = f14130i
            java.lang.String r1 = r7.f14133b
            boolean r0 = r0.mo14652a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            p148g.p189d.p190a.p232c.p241f.p247f.C4447a3.m18707h(r0, r1)
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = f14131j
            int r0 = r0.get()
            int r1 = r7.f14135d
            if (r1 >= r0) goto L_0x0115
            monitor-enter(r7)
            int r1 = r7.f14135d     // Catch:{ all -> 0x0112 }
            if (r1 >= r0) goto L_0x0110
            g.d.a.c.f.f.o2 r1 = f14129h     // Catch:{ all -> 0x0112 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            p148g.p189d.p190a.p232c.p241f.p247f.C4447a3.m18707h(r4, r5)     // Catch:{ all -> 0x0112 }
            android.content.Context r4 = r1.mo14495a()     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.a2 r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4446a2.m18695a(r4)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r4 = r4.mo13773e(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x004d
            java.util.regex.Pattern r5 = p148g.p189d.p190a.p232c.p241f.p247f.C4686n1.f14304c     // Catch:{ all -> 0x0112 }
            java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch:{ all -> 0x0112 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            r3 = 0
            if (r2 != 0) goto L_0x0091
            g.d.a.c.f.f.p2 r2 = r7.f14132a     // Catch:{ all -> 0x0112 }
            android.net.Uri r2 = r2.f14363a     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x0078
            android.content.Context r2 = r1.mo14495a()     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.p2 r4 = r7.f14132a     // Catch:{ all -> 0x0112 }
            android.net.Uri r4 = r4.f14363a     // Catch:{ all -> 0x0112 }
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4520e2.m19303b(r2, r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x0076
            android.content.Context r2 = r1.mo14495a()     // Catch:{ all -> 0x0112 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.p2 r4 = r7.f14132a     // Catch:{ all -> 0x0112 }
            android.net.Uri r4 = r4.f14363a     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.r1 r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4752r1.m20262a(r2, r4)     // Catch:{ all -> 0x0112 }
            goto L_0x0080
        L_0x0076:
            r2 = r3
            goto L_0x0080
        L_0x0078:
            android.content.Context r2 = r1.mo14495a()     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.r2 r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4753r2.m20269a(r2, r3)     // Catch:{ all -> 0x0112 }
        L_0x0080:
            if (r2 == 0) goto L_0x00ba
            java.lang.String r4 = r7.mo14174n()     // Catch:{ all -> 0x0112 }
            java.lang.Object r2 = r2.mo13773e(r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00ba
            java.lang.Object r2 = r7.mo14173e(r2)     // Catch:{ all -> 0x0112 }
            goto L_0x00bb
        L_0x0091:
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.mo14174n()     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0112 }
            int r6 = r5.length()     // Catch:{ all -> 0x0112 }
            if (r6 == 0) goto L_0x00b1
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0112 }
            goto L_0x00b7
        L_0x00b1:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0112 }
            r5.<init>(r4)     // Catch:{ all -> 0x0112 }
            r4 = r5
        L_0x00b7:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0112 }
        L_0x00ba:
            r2 = r3
        L_0x00bb:
            if (r2 == 0) goto L_0x00be
            goto L_0x00df
        L_0x00be:
            android.content.Context r2 = r1.mo14495a()     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.a2 r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4446a2.m18695a(r2)     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.p2 r4 = r7.f14132a     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r4.f14364b     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r7.m19507f(r4)     // Catch:{ all -> 0x0112 }
            java.lang.Object r2 = r2.mo13773e(r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r7.mo14173e(r2)     // Catch:{ all -> 0x0112 }
            goto L_0x00da
        L_0x00d9:
            r2 = r3
        L_0x00da:
            if (r2 == 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            T r2 = r7.f14134c     // Catch:{ all -> 0x0112 }
        L_0x00df:
            g.d.a.c.f.f.f3 r1 = r1.mo14496b()     // Catch:{ all -> 0x0112 }
            java.lang.Object r1 = r1.mo13805a()     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.b3 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4465b3) r1     // Catch:{ all -> 0x0112 }
            boolean r4 = r1.mo13836b()     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x010c
            java.lang.Object r1 = r1.mo13837c()     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.b2 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4464b2) r1     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.p2 r2 = r7.f14132a     // Catch:{ all -> 0x0112 }
            android.net.Uri r2 = r2.f14363a     // Catch:{ all -> 0x0112 }
            g.d.a.c.f.f.p2 r4 = r7.f14132a     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r4.f14365c     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r7.f14133b     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = r1.mo13835a(r2, r3, r4, r5)     // Catch:{ all -> 0x0112 }
            if (r1 != 0) goto L_0x0108
            T r2 = r7.f14134c     // Catch:{ all -> 0x0112 }
            goto L_0x010c
        L_0x0108:
            java.lang.Object r2 = r7.mo14173e(r1)     // Catch:{ all -> 0x0112 }
        L_0x010c:
            r7.f14136e = r2     // Catch:{ all -> 0x0112 }
            r7.f14135d = r0     // Catch:{ all -> 0x0112 }
        L_0x0110:
            monitor-exit(r7)     // Catch:{ all -> 0x0112 }
            goto L_0x0115
        L_0x0112:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0112 }
            throw r0
        L_0x0115:
            T r0 = r7.f14136e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4558g2.mo14175o():java.lang.Object");
    }
}
