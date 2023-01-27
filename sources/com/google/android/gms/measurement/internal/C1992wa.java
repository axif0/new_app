package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1690m;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;
import p148g.p189d.p190a.p232c.p241f.p247f.C4585hb;
import p148g.p189d.p190a.p232c.p241f.p247f.C4681md;

/* renamed from: com.google.android.gms.measurement.internal.wa */
public final class C1992wa extends C1724a6 {

    /* renamed from: b */
    private Boolean f6499b;

    /* renamed from: c */
    private C1729b f6500c = C1741c.f5679a;

    /* renamed from: d */
    private Boolean f6501d;

    C1992wa(C1807h5 h5Var) {
        super(h5Var);
    }

    /* renamed from: J */
    public static long m9065J() {
        return C1957u.f6313D.mo7323a(null).longValue();
    }

    /* renamed from: L */
    public static long m9066L() {
        return C1957u.f6360d.mo7323a(null).longValue();
    }

    /* renamed from: R */
    private final Bundle m9067R() {
        try {
            if (mo6710j().getPackageManager() == null) {
                mo6709i().mo6764E().mo6885a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = C4389c.m18627a(mo6710j()).mo13715c(mo6710j().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            mo6709i().mo6764E().mo6885a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            mo6709i().mo6764E().mo6886b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: h */
    private final String m9068h(String str, String str2) {
        String str3;
        C1770e4 e4Var;
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            e = e;
            e4Var = mo6709i().mo6764E();
            str3 = "Could not find SystemProperties class";
            e4Var.mo6886b(str3, e);
            return str2;
        } catch (NoSuchMethodException e2) {
            e = e2;
            e4Var = mo6709i().mo6764E();
            str3 = "Could not find SystemProperties.get() method";
            e4Var.mo6886b(str3, e);
            return str2;
        } catch (IllegalAccessException e3) {
            e = e3;
            e4Var = mo6709i().mo6764E();
            str3 = "Could not access SystemProperties.get()";
            e4Var.mo6886b(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            e4Var = mo6709i().mo6764E();
            str3 = "SystemProperties.get() threw an exception";
            e4Var.mo6886b(str3, e);
            return str2;
        }
    }

    /* renamed from: o */
    private final int m9069o(String str, C1925r3<Integer> r3Var, int i, int i2) {
        return Math.max(Math.min(mo7417u(str, r3Var), i2), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final long mo7396A(String str) {
        return mo7412p(str, C1957u.f6356b);
    }

    /* renamed from: B */
    public final boolean mo7397B() {
        if (this.f6501d == null) {
            synchronized (this) {
                if (this.f6501d == null) {
                    ApplicationInfo applicationInfo = mo6710j().getApplicationInfo();
                    String a = C1690m.m7968a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f6501d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f6501d == null) {
                        this.f6501d = Boolean.TRUE;
                        mo6709i().mo6764E().mo6885a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f6501d.booleanValue();
    }

    /* renamed from: C */
    public final boolean mo7398C(String str, C1925r3<Boolean> r3Var) {
        return mo7422z(str, r3Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final Boolean mo7399D(String str) {
        C1658o.m7841f(str);
        Bundle R = m9067R();
        if (R == null) {
            mo6709i().mo6764E().mo6885a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!R.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(R.getBoolean(str));
        }
    }

    /* renamed from: E */
    public final boolean mo7400E() {
        Boolean D = mo7399D("firebase_analytics_collection_deactivated");
        return D != null && D.booleanValue();
    }

    /* renamed from: F */
    public final Boolean mo7401F() {
        Boolean D = mo7399D("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(D == null || D.booleanValue());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo7402G(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C1658o.m7841f(r4)
            android.os.Bundle r0 = r3.m9067R()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.c4 r4 = r3.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6764E()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo6885a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.mo6710j()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.c4 r0 = r3.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6764E()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo6886b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1992wa.mo7402G(java.lang.String):java.util.List");
    }

    /* renamed from: H */
    public final Boolean mo7403H() {
        if (!C4681md.m19974b() || !mo7415s(C1957u.f6399w0)) {
            return Boolean.TRUE;
        }
        Boolean D = mo7399D("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(D == null || D.booleanValue());
    }

    /* renamed from: I */
    public final boolean mo7404I(String str) {
        return "1".equals(this.f6500c.mo6718h(str, "gaia_collection_enabled"));
    }

    /* renamed from: K */
    public final boolean mo7405K(String str) {
        return "1".equals(this.f6500c.mo6718h(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo7406M(String str) {
        return mo7422z(str, C1957u.f6327K);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final String mo7407N(String str) {
        C1925r3<String> r3Var = C1957u.f6329L;
        return r3Var.mo7323a(str == null ? null : this.f6500c.mo6718h(str, r3Var.mo7324b()));
    }

    /* renamed from: O */
    public final String mo7408O() {
        return m9068h("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    /* renamed from: P */
    public final String mo7409P() {
        return m9068h("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo7410Q() {
        if (this.f6499b == null) {
            Boolean D = mo7399D("app_measurement_lite");
            this.f6499b = D;
            if (D == null) {
                this.f6499b = Boolean.FALSE;
            }
        }
        return this.f6499b.booleanValue() || !this.f5634a.mo7031N();
    }

    /* renamed from: m */
    public final int mo7411m(String str) {
        return m9069o(str, C1957u.f6323I, 25, 100);
    }

    /* renamed from: p */
    public final long mo7412p(String str, C1925r3<Long> r3Var) {
        if (str != null) {
            String h = this.f6500c.mo6718h(str, r3Var.mo7324b());
            if (!TextUtils.isEmpty(h)) {
                try {
                    return r3Var.mo7323a(Long.valueOf(Long.parseLong(h))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return r3Var.mo7323a(null).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo7413q(com.google.android.gms.measurement.internal.C1782f4 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.mo6898A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4884yc.m20730b()
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.wa r1 = r5.mo6712l()
            java.lang.String r2 = r6.mo6956t()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6375k0
            boolean r1 = r1.mo7422z(r2, r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.mo6904G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.mo6901D()
        L_0x0033:
            com.google.android.gms.measurement.internal.r3<java.lang.String> r2 = com.google.android.gms.measurement.internal.C1957u.f6362e
            r3 = 0
            java.lang.Object r2 = r2.mo7323a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.r3<java.lang.String> r4 = com.google.android.gms.measurement.internal.C1957u.f6364f
            java.lang.Object r3 = r4.mo7323a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.mo6960x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            java.lang.String r1 = "gmp_version"
            java.lang.String r2 = "31049"
            r6.appendQueryParameter(r1, r2)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1992wa.mo7413q(com.google.android.gms.measurement.internal.f4):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo7414r(C1729b bVar) {
        this.f6500c = bVar;
    }

    /* renamed from: s */
    public final boolean mo7415s(C1925r3<Boolean> r3Var) {
        return mo7422z((String) null, r3Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final int mo7416t(String str) {
        if (!C4585hb.m19593b() || !mo7422z((String) null, C1957u.f6316E0)) {
            return 500;
        }
        return m9069o(str, C1957u.f6321H, 500, 2000);
    }

    /* renamed from: u */
    public final int mo7417u(String str, C1925r3<Integer> r3Var) {
        if (str != null) {
            String h = this.f6500c.mo6718h(str, r3Var.mo7324b());
            if (!TextUtils.isEmpty(h)) {
                try {
                    return r3Var.mo7323a(Integer.valueOf(Integer.parseInt(h))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return r3Var.mo7323a(null).intValue();
    }

    /* renamed from: v */
    public final double mo7418v(String str, C1925r3<Double> r3Var) {
        if (str != null) {
            String h = this.f6500c.mo6718h(str, r3Var.mo7324b());
            if (!TextUtils.isEmpty(h)) {
                try {
                    return r3Var.mo7323a(Double.valueOf(Double.parseDouble(h))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return r3Var.mo7323a(null).doubleValue();
    }

    /* renamed from: w */
    public final int mo7419w(String str) {
        return mo7417u(str, C1957u.f6382o);
    }

    /* renamed from: x */
    public final int mo7420x() {
        if (C4585hb.m19593b() && mo6712l().mo7422z((String) null, C1957u.f6318F0)) {
            C1788fa f = mo6707f();
            Boolean a0 = f.f5634a.mo7033P().mo6797a0();
            if (f.mo6981K0() >= 201500 || (a0 != null && !a0.booleanValue())) {
                return 100;
            }
        }
        return 25;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final int mo7421y(String str) {
        if (!C4585hb.m19593b() || !mo7422z((String) null, C1957u.f6316E0)) {
            return 25;
        }
        return m9069o(str, C1957u.f6319G, 25, 100);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.measurement.internal.r3, com.google.android.gms.measurement.internal.r3<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7422z(java.lang.String r4, com.google.android.gms.measurement.internal.C1925r3<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x000e
        L_0x0003:
            java.lang.Object r4 = r5.mo7323a(r0)
        L_0x0007:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x000e:
            com.google.android.gms.measurement.internal.b r1 = r3.f6500c
            java.lang.String r2 = r5.mo7324b()
            java.lang.String r4 = r1.mo6718h(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x001f
            goto L_0x0003
        L_0x001f:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.mo7323a(r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1992wa.mo7422z(java.lang.String, com.google.android.gms.measurement.internal.r3):boolean");
    }
}
