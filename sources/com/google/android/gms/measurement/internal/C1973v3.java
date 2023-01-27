package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;
import p148g.p189d.p190a.p232c.p241f.p247f.C4749qe;
import p148g.p189d.p190a.p232c.p241f.p247f.C4884yc;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
public final class C1973v3 extends C1783f5 {

    /* renamed from: c */
    private String f6449c;

    /* renamed from: d */
    private String f6450d;

    /* renamed from: e */
    private int f6451e;

    /* renamed from: f */
    private String f6452f;

    /* renamed from: g */
    private long f6453g;

    /* renamed from: h */
    private long f6454h;

    /* renamed from: i */
    private List<String> f6455i;

    /* renamed from: j */
    private int f6456j;

    /* renamed from: k */
    private String f6457k;

    /* renamed from: l */
    private String f6458l;

    /* renamed from: m */
    private String f6459m;

    C1973v3(C1807h5 h5Var, long j) {
        super(h5Var);
        this.f6454h = j;
    }

    /* renamed from: J */
    private final String m9019J() {
        C1770e4 I;
        String str;
        if (!C4749qe.m20256b() || !mo6712l().mo7415s(C1957u.f6381n0)) {
            try {
                Class<?> loadClass = mo6710j().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{mo6710j()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        I = mo6709i().mo6769J();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    I = mo6709i().mo6768I();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            I = mo6709i().mo6772M();
            str = "Disabled IID for tests.";
            I.mo6885a(str);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0180 A[Catch:{ IllegalStateException -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018b A[Catch:{ IllegalStateException -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0195 A[Catch:{ IllegalStateException -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0197 A[Catch:{ IllegalStateException -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a2 A[SYNTHETIC, Splitter:B:77:0x01a2] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e0 A[Catch:{ IllegalStateException -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f0 A[Catch:{ IllegalStateException -> 0x020d }] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6963A() {
        /*
            r11 = this;
            android.content.Context r0 = r11.mo6710j()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.mo6710j()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.c4 r7 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6764E()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo6886b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.c4 r7 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6764E()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo6886b(r9, r8)
        L_0x0043:
            if (r5 != 0) goto L_0x0048
            java.lang.String r5 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0051
            r5 = r3
        L_0x0051:
            android.content.Context r7 = r11.mo6710j()     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r2
            r2 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r2
        L_0x007a:
            com.google.android.gms.measurement.internal.c4 r8 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6764E()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo6887c(r10, r9, r2)
            r2 = r7
        L_0x008c:
            r11.f6449c = r0
            r11.f6452f = r5
            r11.f6450d = r2
            r11.f6451e = r6
            r5 = 0
            r11.f6453g = r5
            android.content.Context r2 = r11.mo6710j()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C1577c.m7622c(r2)
            r5 = 1
            if (r2 == 0) goto L_0x00ab
            boolean r6 = r2.mo6318h()
            if (r6 == 0) goto L_0x00ab
            r6 = 1
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            com.google.android.gms.measurement.internal.h5 r7 = r11.f5634a
            java.lang.String r7 = r7.mo7028K()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.h5 r7 = r11.f5634a
            java.lang.String r7 = r7.mo7029L()
            java.lang.String r8 = "am"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00c8
            r7 = 1
            goto L_0x00c9
        L_0x00c8:
            r7 = 0
        L_0x00c9:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00f5
            if (r2 != 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.c4 r2 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6765F()
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r2.mo6885a(r8)
            goto L_0x00f5
        L_0x00dc:
            com.google.android.gms.measurement.internal.c4 r8 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6765F()
            int r9 = r2.mo6315d()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.mo6317f()
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.mo6887c(r10, r9, r2)
        L_0x00f5:
            if (r6 == 0) goto L_0x015d
            com.google.android.gms.measurement.internal.h5 r2 = r11.f5634a
            int r2 = r2.mo7045q()
            com.google.android.gms.measurement.internal.c4 r6 = r11.mo6709i()
            switch(r2) {
                case 0: goto L_0x0150;
                case 1: goto L_0x0149;
                case 2: goto L_0x0142;
                case 3: goto L_0x013b;
                case 4: goto L_0x0134;
                case 5: goto L_0x012d;
                case 6: goto L_0x0126;
                case 7: goto L_0x011f;
                case 8: goto L_0x0118;
                default: goto L_0x0104;
            }
        L_0x0104:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6770K()
            java.lang.String r8 = "App measurement disabled"
            r6.mo6885a(r8)
            com.google.android.gms.measurement.internal.c4 r6 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6765F()
            java.lang.String r8 = "Invalid scion state in identity"
            goto L_0x0156
        L_0x0118:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6770K()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            goto L_0x0156
        L_0x011f:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6770K()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x0156
        L_0x0126:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6769J()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x0156
        L_0x012d:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6772M()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x0156
        L_0x0134:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6770K()
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x0156
        L_0x013b:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6770K()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x0156
        L_0x0142:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6772M()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x0156
        L_0x0149:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6770K()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x0156
        L_0x0150:
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6772M()
            java.lang.String r8 = "App measurement collection enabled"
        L_0x0156:
            r6.mo6885a(r8)
            if (r2 != 0) goto L_0x015d
            r2 = 1
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            r11.f6457k = r3
            r11.f6458l = r3
            r11.f6459m = r3
            if (r7 == 0) goto L_0x016e
            com.google.android.gms.measurement.internal.h5 r6 = r11.f5634a
            java.lang.String r6 = r6.mo7028K()
            r11.f6458l = r6
        L_0x016e:
            boolean r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4643ke.m19846b()     // Catch:{ IllegalStateException -> 0x020d }
            if (r6 == 0) goto L_0x018b
            com.google.android.gms.measurement.internal.wa r6 = r11.mo6712l()     // Catch:{ IllegalStateException -> 0x020d }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C1957u.f6328K0     // Catch:{ IllegalStateException -> 0x020d }
            boolean r6 = r6.mo7415s(r7)     // Catch:{ IllegalStateException -> 0x020d }
            if (r6 == 0) goto L_0x018b
            android.content.Context r6 = r11.mo6710j()     // Catch:{ IllegalStateException -> 0x020d }
            java.lang.String r7 = "google_app_id"
            java.lang.String r6 = com.google.android.gms.measurement.internal.C1929r7.m8823a(r6, r7)     // Catch:{ IllegalStateException -> 0x020d }
            goto L_0x018f
        L_0x018b:
            java.lang.String r6 = com.google.android.gms.common.api.internal.C1577c.m7621b()     // Catch:{ IllegalStateException -> 0x020d }
        L_0x018f:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x020d }
            if (r7 == 0) goto L_0x0197
            r7 = r3
            goto L_0x0198
        L_0x0197:
            r7 = r6
        L_0x0198:
            r11.f6457k = r7     // Catch:{ IllegalStateException -> 0x020d }
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4884yc.m20730b()     // Catch:{ IllegalStateException -> 0x020d }
            java.lang.String r8 = "admob_app_id"
            if (r7 == 0) goto L_0x01da
            com.google.android.gms.measurement.internal.wa r7 = r11.mo6712l()     // Catch:{ IllegalStateException -> 0x020d }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C1957u.f6375k0     // Catch:{ IllegalStateException -> 0x020d }
            boolean r7 = r7.mo7415s(r9)     // Catch:{ IllegalStateException -> 0x020d }
            if (r7 == 0) goto L_0x01da
            com.google.android.gms.common.internal.s r7 = new com.google.android.gms.common.internal.s     // Catch:{ IllegalStateException -> 0x020d }
            android.content.Context r9 = r11.mo6710j()     // Catch:{ IllegalStateException -> 0x020d }
            r7.<init>(r9)     // Catch:{ IllegalStateException -> 0x020d }
            java.lang.String r9 = "ga_app_id"
            java.lang.String r9 = r7.mo6565a(r9)     // Catch:{ IllegalStateException -> 0x020d }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x020d }
            if (r10 == 0) goto L_0x01c4
            goto L_0x01c5
        L_0x01c4:
            r3 = r9
        L_0x01c5:
            r11.f6459m = r3     // Catch:{ IllegalStateException -> 0x020d }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x020d }
            if (r3 == 0) goto L_0x01d3
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x020d }
            if (r3 != 0) goto L_0x01ee
        L_0x01d3:
            java.lang.String r3 = r7.mo6565a(r8)     // Catch:{ IllegalStateException -> 0x020d }
        L_0x01d7:
            r11.f6458l = r3     // Catch:{ IllegalStateException -> 0x020d }
            goto L_0x01ee
        L_0x01da:
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x020d }
            if (r3 != 0) goto L_0x01ee
            com.google.android.gms.common.internal.s r3 = new com.google.android.gms.common.internal.s     // Catch:{ IllegalStateException -> 0x020d }
            android.content.Context r6 = r11.mo6710j()     // Catch:{ IllegalStateException -> 0x020d }
            r3.<init>(r6)     // Catch:{ IllegalStateException -> 0x020d }
            java.lang.String r3 = r3.mo6565a(r8)     // Catch:{ IllegalStateException -> 0x020d }
            goto L_0x01d7
        L_0x01ee:
            if (r2 == 0) goto L_0x021f
            com.google.android.gms.measurement.internal.c4 r2 = r11.mo6709i()     // Catch:{ IllegalStateException -> 0x020d }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6772M()     // Catch:{ IllegalStateException -> 0x020d }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r11.f6449c     // Catch:{ IllegalStateException -> 0x020d }
            java.lang.String r7 = r11.f6457k     // Catch:{ IllegalStateException -> 0x020d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x020d }
            if (r7 == 0) goto L_0x0207
            java.lang.String r7 = r11.f6458l     // Catch:{ IllegalStateException -> 0x020d }
            goto L_0x0209
        L_0x0207:
            java.lang.String r7 = r11.f6457k     // Catch:{ IllegalStateException -> 0x020d }
        L_0x0209:
            r2.mo6887c(r3, r6, r7)     // Catch:{ IllegalStateException -> 0x020d }
            goto L_0x021f
        L_0x020d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.c4 r3 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r3.mo6887c(r6, r0, r2)
        L_0x021f:
            r0 = 0
            r11.f6455i = r0
            com.google.android.gms.measurement.internal.wa r0 = r11.mo6712l()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo7402G(r2)
            if (r0 == 0) goto L_0x0260
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0243
            com.google.android.gms.measurement.internal.c4 r2 = r11.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6769J()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r2.mo6885a(r3)
        L_0x0241:
            r5 = 0
            goto L_0x0260
        L_0x0243:
            java.util.Iterator r2 = r0.iterator()
        L_0x0247:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0260
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.fa r6 = r11.mo6707f()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.mo7006v0(r7, r3)
            if (r3 != 0) goto L_0x0247
            goto L_0x0241
        L_0x0260:
            if (r5 == 0) goto L_0x0264
            r11.f6455i = r0
        L_0x0264:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x027a
            if (r1 == 0) goto L_0x0277
            android.content.Context r0 = r11.mo6710j()
            boolean r0 = p148g.p189d.p190a.p232c.p237d.p239p.C4387a.m18617a(r0)
            r11.f6456j = r0
            return
        L_0x0277:
            r11.f6456j = r4
            return
        L_0x027a:
            r11.f6456j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1973v3.mo6963A():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final C1860la mo7369B(String str) {
        mo6700b();
        String C = mo7370C();
        String D = mo7371D();
        mo6965w();
        String str2 = this.f6450d;
        long G = (long) mo7374G();
        mo6965w();
        String str3 = this.f6452f;
        mo6965w();
        mo6700b();
        if (this.f6453g == 0) {
            this.f6453g = this.f5634a.mo7024G().mo7007x(mo6710j(), mo6710j().getPackageName());
        }
        long j = this.f6453g;
        boolean p = this.f5634a.mo7044p();
        boolean z = !mo6711k().f6151v;
        mo6700b();
        String J = !this.f5634a.mo7044p() ? null : m9019J();
        C1807h5 h5Var = this.f5634a;
        Long valueOf = Long.valueOf(h5Var.mo7051x().f6139j.mo7343a());
        long min = valueOf.longValue() == 0 ? h5Var.f5872G : Math.min(h5Var.f5872G, valueOf.longValue());
        int H = mo7375H();
        boolean booleanValue = mo6712l().mo7401F().booleanValue();
        Boolean D2 = mo6712l().mo7399D("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(D2 == null || D2.booleanValue()).booleanValue();
        C1902p4 k = mo6711k();
        k.mo6700b();
        boolean z2 = k.mo7277D().getBoolean("deferred_analytics_collection", false);
        String E = mo7372E();
        Boolean D3 = mo6712l().mo7399D("google_analytics_default_allow_ad_personalization_signals");
        return new C1860la(C, D, str2, G, str3, 31049, j, str, p, z, J, 0, min, H, booleanValue, booleanValue2, z2, E, D3 == null ? null : Boolean.valueOf(true ^ D3.booleanValue()), this.f6454h, this.f6455i, (!C4884yc.m20730b() || !mo6712l().mo7415s(C1957u.f6375k0)) ? null : mo7373F(), (!C4602ib.m19620b() || !mo6712l().mo7415s(C1957u.f6338P0)) ? BuildConfig.FLAVOR : mo6711k().mo7284K().mo6873e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final String mo7370C() {
        mo6965w();
        return this.f6449c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final String mo7371D() {
        mo6965w();
        return this.f6457k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo7372E() {
        mo6965w();
        return this.f6458l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo7373F() {
        mo6965w();
        return this.f6459m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final int mo7374G() {
        mo6965w();
        return this.f6451e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final int mo7375H() {
        mo6965w();
        return this.f6456j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final List<String> mo7376I() {
        return this.f6455i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo6801z() {
        return true;
    }
}
