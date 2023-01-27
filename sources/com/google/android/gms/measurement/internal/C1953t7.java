package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1658o;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p148g.p189d.p190a.p232c.p241f.p247f.C4697nc;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
public final class C1953t7 extends C1783f5 {

    /* renamed from: c */
    private volatile C1965u7 f6280c;

    /* renamed from: d */
    private C1965u7 f6281d;

    /* renamed from: e */
    protected C1965u7 f6282e;

    /* renamed from: f */
    private final Map<Activity, C1965u7> f6283f = new ConcurrentHashMap();

    /* renamed from: g */
    private Activity f6284g;

    /* renamed from: h */
    private volatile boolean f6285h;

    /* renamed from: i */
    private volatile C1965u7 f6286i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1965u7 f6287j;

    /* renamed from: k */
    private boolean f6288k;

    /* renamed from: l */
    private final Object f6289l = new Object();

    /* renamed from: m */
    private String f6290m;

    public C1953t7(C1807h5 h5Var) {
        super(h5Var);
    }

    /* renamed from: E */
    private static String m8852E(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : BuildConfig.FLAVOR;
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: H */
    private final void m8853H(Activity activity, C1965u7 u7Var, boolean z) {
        C1965u7 u7Var2;
        C1965u7 u7Var3 = u7Var;
        C1965u7 u7Var4 = this.f6280c == null ? this.f6281d : this.f6280c;
        if (u7Var3.f6423b == null) {
            u7Var2 = new C1965u7(u7Var3.f6422a, activity != null ? m8852E(activity.getClass().getCanonicalName()) : null, u7Var3.f6424c, u7Var3.f6426e, u7Var3.f6427f);
        } else {
            u7Var2 = u7Var3;
        }
        this.f6281d = this.f6280c;
        this.f6280c = u7Var2;
        mo6706e().mo6703y(new C1977v7(this, u7Var2, u7Var4, mo6708g().mo6585a(), z));
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m8854K(Bundle bundle, C1965u7 u7Var, C1965u7 u7Var2, long j) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        m8859P(u7Var, u7Var2, j, true, mo6707f().mo6973C((String) null, "screen_view", bundle, (List<String>) null, true, true));
    }

    /* renamed from: O */
    public static void m8858O(C1965u7 u7Var, Bundle bundle, boolean z) {
        if (bundle != null && u7Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = u7Var.f6422a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = u7Var.f6423b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", u7Var.f6424c);
        } else if (bundle != null && u7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m8859P(C1965u7 u7Var, C1965u7 u7Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        C1965u7 u7Var3;
        mo6700b();
        boolean z3 = false;
        if (mo6712l().mo7415s(C1957u.f6347U)) {
            z2 = z && this.f6282e != null;
            if (z2) {
                m8860Q(this.f6282e, true, j);
            }
        } else {
            if (z && (u7Var3 = this.f6282e) != null) {
                m8860Q(u7Var3, true, j);
            }
            z2 = false;
        }
        if (u7Var2 == null || u7Var2.f6424c != u7Var.f6424c || !C1788fa.m8442B0(u7Var2.f6423b, u7Var.f6423b) || !C1788fa.m8442B0(u7Var2.f6422a, u7Var.f6422a)) {
            z3 = true;
        }
        if (z3) {
            Bundle bundle2 = new Bundle();
            if (mo6712l().mo7415s(C1957u.f6401x0)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            Bundle bundle3 = bundle2;
            m8858O(u7Var, bundle3, true);
            if (u7Var2 != null) {
                String str = u7Var2.f6422a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = u7Var2.f6423b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", u7Var2.f6424c);
            }
            if (mo6712l().mo7415s(C1957u.f6347U) && z2) {
                long e = (!C4697nc.m20007b() || !mo6712l().mo7415s(C1957u.f6350W)) ? mo6860u().f5952e.mo7301e() : mo6860u().mo7155B(j);
                if (e > 0) {
                    mo6707f().mo6982L(bundle3, e);
                }
            }
            String str3 = "auto";
            if (mo6712l().mo7415s(C1957u.f6401x0)) {
                if (!mo6712l().mo7403H().booleanValue()) {
                    bundle3.putLong("_mst", 1);
                }
                if (u7Var.f6426e) {
                    str3 = "app";
                }
            }
            String str4 = str3;
            if (mo6712l().mo7415s(C1957u.f6401x0)) {
                long c = mo6708g().mo6587c();
                if (u7Var.f6426e) {
                    long j3 = u7Var.f6427f;
                    if (j3 != 0) {
                        j2 = j3;
                        mo6855p().mo7193U(str4, "_vs", j2, bundle3);
                    }
                }
                j2 = c;
                mo6855p().mo7193U(str4, "_vs", j2, bundle3);
            } else {
                mo6855p().mo7214v0(str4, "_vs", bundle3);
            }
        }
        this.f6282e = u7Var;
        if (mo6712l().mo7415s(C1957u.f6401x0) && u7Var.f6426e) {
            this.f6287j = u7Var;
        }
        mo6857r().mo6785M(u7Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public final void m8860Q(C1965u7 u7Var, boolean z, long j) {
        mo6854o().mo6686v(mo6708g().mo6585a());
        if (mo6860u().mo7156E(u7Var != null && u7Var.f6425d, z, j) && u7Var != null) {
            u7Var.f6425d = false;
        }
    }

    /* renamed from: W */
    private final C1965u7 m8861W(Activity activity) {
        C1658o.m7845j(activity);
        C1965u7 u7Var = this.f6283f.get(activity);
        if (u7Var == null) {
            C1965u7 u7Var2 = new C1965u7((String) null, m8852E(activity.getClass().getCanonicalName()), mo6707f().mo6976E0());
            this.f6283f.put(activity, u7Var2);
            u7Var = u7Var2;
        }
        return (mo6712l().mo7415s(C1957u.f6401x0) && this.f6286i != null) ? this.f6286i : u7Var;
    }

    /* renamed from: D */
    public final C1965u7 mo7347D(boolean z) {
        mo6965w();
        mo6700b();
        if (!mo6712l().mo7415s(C1957u.f6401x0) || !z) {
            return this.f6282e;
        }
        C1965u7 u7Var = this.f6282e;
        return u7Var != null ? u7Var : this.f6287j;
    }

    /* renamed from: F */
    public final void mo7348F(Activity activity) {
        if (mo6712l().mo7415s(C1957u.f6401x0)) {
            synchronized (this.f6289l) {
                this.f6288k = true;
                if (activity != this.f6284g) {
                    synchronized (this.f6289l) {
                        this.f6284g = activity;
                        this.f6285h = false;
                    }
                    if (mo6712l().mo7415s(C1957u.f6399w0) && mo6712l().mo7403H().booleanValue()) {
                        this.f6286i = null;
                        mo6706e().mo6703y(new C2025z7(this));
                    }
                }
            }
        }
        if (!mo6712l().mo7415s(C1957u.f6399w0) || mo6712l().mo7403H().booleanValue()) {
            m8853H(activity, m8861W(activity), false);
            C1717a o = mo6854o();
            o.mo6706e().mo6703y(new C1769e3(o, o.mo6708g().mo6585a()));
            return;
        }
        this.f6280c = this.f6286i;
        mo6706e().mo6703y(new C2014y7(this));
    }

    /* renamed from: G */
    public final void mo7349G(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (mo6712l().mo7403H().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f6283f.put(activity, new C1965u7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @Deprecated
    /* renamed from: I */
    public final void mo7350I(Activity activity, String str, String str2) {
        if (!mo6712l().mo7403H().booleanValue()) {
            mo6709i().mo6769J().mo6885a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.f6280c == null) {
            mo6709i().mo6769J().mo6885a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f6283f.get(activity) == null) {
            mo6709i().mo6769J().mo6885a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m8852E(activity.getClass().getCanonicalName());
            }
            boolean B0 = C1788fa.m8442B0(this.f6280c.f6423b, str2);
            boolean B02 = C1788fa.m8442B0(this.f6280c.f6422a, str);
            if (B0 && B02) {
                mo6709i().mo6769J().mo6885a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo6709i().mo6769J().mo6886b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo6709i().mo6772M().mo6887c("Setting current screen to name, class", str == null ? "null" : str, str2);
                C1965u7 u7Var = new C1965u7(str, str2, mo6707f().mo6976E0());
                this.f6283f.put(activity, u7Var);
                m8853H(activity, u7Var, true);
            } else {
                mo6709i().mo6769J().mo6886b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00da, code lost:
        r1 = mo6709i().mo6772M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r10 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e9, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        if (r11 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        r1.mo6887c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r8.f6280c != null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
        r1 = r8.f6281d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fa, code lost:
        r1 = r8.f6280c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fc, code lost:
        r5 = r1;
        r9 = new com.google.android.gms.measurement.internal.C1965u7(r10, r11, mo6707f().mo6976E0(), true, r19);
        r8.f6280c = r9;
        r8.f6281d = r5;
        r8.f6286i = r9;
        mo6706e().mo6703y(new com.google.android.gms.measurement.internal.C1989w7(r17, r18, r9, r5, mo6708g().mo6585a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012d, code lost:
        return;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7351J(android.os.Bundle r18, long r19) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            com.google.android.gms.measurement.internal.wa r1 = r17.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6401x0
            boolean r1 = r1.mo7415s(r2)
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.measurement.internal.c4 r0 = r17.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6769J()
            java.lang.String r1 = "Manual screen reporting is disabled."
            r0.mo6885a(r1)
            return
        L_0x001e:
            java.lang.Object r1 = r8.f6289l
            monitor-enter(r1)
            boolean r2 = r8.f6288k     // Catch:{ all -> 0x012e }
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.c4 r0 = r17.mo6709i()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6769J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Cannot log screen view event when the app is in the background."
            r0.mo6885a(r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x0034:
            r2 = 0
            if (r0 == 0) goto L_0x0092
            java.lang.String r2 = "screen_name"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x012e }
            r3 = 100
            if (r2 == 0) goto L_0x0064
            int r4 = r2.length()     // Catch:{ all -> 0x012e }
            if (r4 <= 0) goto L_0x004d
            int r4 = r2.length()     // Catch:{ all -> 0x012e }
            if (r4 <= r3) goto L_0x0064
        L_0x004d:
            com.google.android.gms.measurement.internal.c4 r0 = r17.mo6709i()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6769J()     // Catch:{ all -> 0x012e }
            java.lang.String r3 = "Invalid screen name length for screen view. Length"
            int r2 = r2.length()     // Catch:{ all -> 0x012e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x012e }
            r0.mo6886b(r3, r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x0064:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x012e }
            if (r4 == 0) goto L_0x008f
            int r5 = r4.length()     // Catch:{ all -> 0x012e }
            if (r5 <= 0) goto L_0x0078
            int r5 = r4.length()     // Catch:{ all -> 0x012e }
            if (r5 <= r3) goto L_0x008f
        L_0x0078:
            com.google.android.gms.measurement.internal.c4 r0 = r17.mo6709i()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6769J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Invalid screen class length for screen view. Length"
            int r3 = r4.length()     // Catch:{ all -> 0x012e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x012e }
            r0.mo6886b(r2, r3)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x008f:
            r10 = r2
            r2 = r4
            goto L_0x0093
        L_0x0092:
            r10 = r2
        L_0x0093:
            if (r2 != 0) goto L_0x00aa
            android.app.Activity r2 = r8.f6284g     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00a8
            android.app.Activity r2 = r8.f6284g     // Catch:{ all -> 0x012e }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r2.getCanonicalName()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = m8852E(r2)     // Catch:{ all -> 0x012e }
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r2 = "Activity"
        L_0x00aa:
            r11 = r2
            boolean r2 = r8.f6285h     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.u7 r2 = r8.f6280c     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            r2 = 0
            r8.f6285h = r2     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.u7 r2 = r8.f6280c     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r2.f6423b     // Catch:{ all -> 0x012e }
            boolean r2 = com.google.android.gms.measurement.internal.C1788fa.m8442B0(r2, r11)     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.u7 r3 = r8.f6280c     // Catch:{ all -> 0x012e }
            java.lang.String r3 = r3.f6422a     // Catch:{ all -> 0x012e }
            boolean r3 = com.google.android.gms.measurement.internal.C1788fa.m8442B0(r3, r10)     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            if (r3 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.c4 r0 = r17.mo6709i()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6769J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Ignoring call to log screen view event with duplicate parameters."
            r0.mo6885a(r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x00d9:
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.c4 r1 = r17.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            java.lang.String r2 = "Logging screen view with name, class"
            if (r10 != 0) goto L_0x00e9
            java.lang.String r3 = "null"
            goto L_0x00ea
        L_0x00e9:
            r3 = r10
        L_0x00ea:
            if (r11 != 0) goto L_0x00ef
            java.lang.String r4 = "null"
            goto L_0x00f0
        L_0x00ef:
            r4 = r11
        L_0x00f0:
            r1.mo6887c(r2, r3, r4)
            com.google.android.gms.measurement.internal.u7 r1 = r8.f6280c
            if (r1 != 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.u7 r1 = r8.f6281d
            goto L_0x00fc
        L_0x00fa:
            com.google.android.gms.measurement.internal.u7 r1 = r8.f6280c
        L_0x00fc:
            r5 = r1
            com.google.android.gms.measurement.internal.u7 r4 = new com.google.android.gms.measurement.internal.u7
            com.google.android.gms.measurement.internal.fa r1 = r17.mo6707f()
            long r12 = r1.mo6976E0()
            r14 = 1
            r9 = r4
            r15 = r19
            r9.<init>(r10, r11, r12, r14, r15)
            r8.f6280c = r4
            r8.f6281d = r5
            r8.f6286i = r4
            com.google.android.gms.common.util.e r1 = r17.mo6708g()
            long r6 = r1.mo6585a()
            com.google.android.gms.measurement.internal.a5 r9 = r17.mo6706e()
            com.google.android.gms.measurement.internal.w7 r10 = new com.google.android.gms.measurement.internal.w7
            r1 = r10
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r9.mo6703y(r10)
            return
        L_0x012e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1953t7.mo7351J(android.os.Bundle, long):void");
    }

    /* renamed from: R */
    public final void mo7352R(String str, C1965u7 u7Var) {
        mo6700b();
        synchronized (this) {
            if (this.f6290m == null || this.f6290m.equals(str) || u7Var != null) {
                this.f6290m = str;
            }
        }
    }

    /* renamed from: S */
    public final C1965u7 mo7353S() {
        return this.f6280c;
    }

    /* renamed from: T */
    public final void mo7354T(Activity activity) {
        if (mo6712l().mo7415s(C1957u.f6401x0)) {
            synchronized (this.f6289l) {
                this.f6288k = false;
                this.f6285h = true;
            }
        }
        long a = mo6708g().mo6585a();
        if (!mo6712l().mo7415s(C1957u.f6399w0) || mo6712l().mo7403H().booleanValue()) {
            C1965u7 W = m8861W(activity);
            this.f6281d = this.f6280c;
            this.f6280c = null;
            mo6706e().mo6703y(new C1726a8(this, W, a));
            return;
        }
        this.f6280c = null;
        mo6706e().mo6703y(new C2001x7(this, a));
    }

    /* renamed from: U */
    public final void mo7355U(Activity activity, Bundle bundle) {
        C1965u7 u7Var;
        if (mo6712l().mo7403H().booleanValue() && bundle != null && (u7Var = this.f6283f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", u7Var.f6424c);
            bundle2.putString("name", u7Var.f6422a);
            bundle2.putString("referrer_name", u7Var.f6423b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* renamed from: V */
    public final void mo7356V(Activity activity) {
        synchronized (this.f6289l) {
            if (activity == this.f6284g) {
                this.f6284g = null;
            }
        }
        if (mo6712l().mo7403H().booleanValue()) {
            this.f6283f.remove(activity);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo6801z() {
        return false;
    }
}
