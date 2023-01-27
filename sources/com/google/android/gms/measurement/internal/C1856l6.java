package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p241f.p247f.C4456ac;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;
import p148g.p189d.p190a.p232c.p241f.p247f.C4680mc;
import p148g.p189d.p190a.p232c.p241f.p247f.C4729pa;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
public final class C1856l6 extends C1783f5 {

    /* renamed from: c */
    protected C1833j7 f5996c;

    /* renamed from: d */
    private C1844k6 f5997d;

    /* renamed from: e */
    private final Set<C1832j6> f5998e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f5999f;

    /* renamed from: g */
    private final AtomicReference<String> f6000g = new AtomicReference<>();

    /* renamed from: h */
    private final Object f6001h = new Object();

    /* renamed from: i */
    private C1765e f6002i = new C1765e((Boolean) null, (Boolean) null);

    /* renamed from: j */
    private int f6003j = 100;

    /* renamed from: k */
    private final AtomicLong f6004k = new AtomicLong(0);

    /* renamed from: l */
    private long f6005l = -1;

    /* renamed from: m */
    private int f6006m = 100;

    /* renamed from: n */
    final C1884na f6007n;

    /* renamed from: o */
    private boolean f6008o = true;

    protected C1856l6(C1807h5 h5Var) {
        super(h5Var);
        this.f6007n = new C1884na(h5Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m8650K(C1765e eVar, int i, long j, boolean z, boolean z2) {
        mo6700b();
        mo6965w();
        if (j <= this.f6005l && C1765e.m8338g(this.f6006m, i)) {
            mo6709i().mo6770K().mo6886b("Dropped out-of-date consent setting, proposed settings", eVar);
        } else if (mo6711k().mo7292y(eVar, i)) {
            this.f6005l = j;
            this.f6006m = i;
            mo6857r().mo6791U(z);
            if (z2) {
                mo6857r().mo6788R(new AtomicReference());
            }
        } else {
            mo6709i().mo6770K().mo6886b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public final void m8655S(Boolean bool, boolean z) {
        mo6700b();
        mo6965w();
        mo6709i().mo6771L().mo6886b("Setting app measurement enabled (FE)", bool);
        mo6711k().mo7288u(bool);
        if (C4602ib.m19620b() && mo6712l().mo7415s(C1957u.f6338P0) && z) {
            mo6711k().mo7293z(bool);
        }
        if (!C4602ib.m19620b() || !mo6712l().mo7415s(C1957u.f6338P0) || this.f5634a.mo7046r() || !bool.booleanValue()) {
            m8657o0();
        }
    }

    /* renamed from: W */
    private final void m8656W(String str, String str2, long j, Object obj) {
        mo6706e().mo6703y(new C1952t6(this, str, str2, obj, j));
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public final void m8657o0() {
        mo6700b();
        String a = mo6711k().f6148s.mo7377a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo7197Z("app", "_npa", (Object) null, mo6708g().mo6587c());
            } else {
                mo7197Z("app", "_npa", Long.valueOf("true".equals(a) ? 1 : 0), mo6708g().mo6587c());
            }
        }
        if (!this.f5634a.mo7044p() || !this.f6008o) {
            mo6709i().mo6771L().mo6885a("Updating Scion state (FE)");
            mo6857r().mo6793W();
            return;
        }
        mo6709i().mo6771L().mo6885a("Recording app launch after enabling measurement for the first time (FE)");
        mo7208k0();
        if (C4680mc.m19971b() && mo6712l().mo7415s(C1957u.f6391s0)) {
            mo6860u().f5951d.mo7330a();
        }
        if (C4456ac.m18732b() && mo6712l().mo7415s(C1957u.f6397v0)) {
            if (!(this.f5634a.mo7021D().f6409a.mo7051x().f6140k.mo7343a() > 0)) {
                C1962u4 D = this.f5634a.mo7021D();
                D.mo7361b(D.f6409a.mo6710j().getPackageName());
            }
        }
        if (mo6712l().mo7415s(C1957u.f6330L0)) {
            mo6706e().mo6703y(new C1904p6(this));
        }
    }

    /* renamed from: p0 */
    private final ArrayList<Bundle> m8658p0(String str, String str2, String str3) {
        if (mo6706e().mo6698H()) {
            mo6709i().mo6764E().mo6885a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C1980va.m9035a()) {
            mo6709i().mo6764E().mo6885a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f5634a.mo6706e().mo6701u(atomicReference, 5000, "get conditional user properties", new C1737b7(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return C1788fa.m8466s0(list);
            }
            mo6709i().mo6764E().mo6886b("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    /* renamed from: q0 */
    private final Map<String, Object> m8659q0(String str, String str2, String str3, boolean z) {
        C1770e4 E;
        String str4;
        if (mo6706e().mo6698H()) {
            E = mo6709i().mo6764E();
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (C1980va.m9035a()) {
            E = mo6709i().mo6764E();
            str4 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f5634a.mo6706e().mo6701u(atomicReference, 5000, "get user properties", new C1725a7(this, atomicReference, str, str2, str3, z));
            List<C1776ea> list = (List) atomicReference.get();
            if (list == null) {
                mo6709i().mo6764E().mo6886b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            C3190a aVar = new C3190a(list.size());
            for (C1776ea eaVar : list) {
                aVar.put(eaVar.f5774g, eaVar.mo6894d());
            }
            return aVar;
        }
        E.mo6885a(str4);
        return Collections.emptyMap();
    }

    /* renamed from: s0 */
    private final void m8660s0(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C1658o.m7845j(bundle);
        C1784f6.m8437a(bundle, "app_id", cls2, null);
        C1784f6.m8437a(bundle, "origin", cls2, null);
        C1784f6.m8437a(bundle, "name", cls2, null);
        C1784f6.m8437a(bundle, "value", Object.class, null);
        C1784f6.m8437a(bundle, "trigger_event_name", cls2, null);
        C1784f6.m8437a(bundle, "trigger_timeout", cls, 0L);
        C1784f6.m8437a(bundle, "timed_out_event_name", cls2, null);
        C1784f6.m8437a(bundle, "timed_out_event_params", Bundle.class, null);
        C1784f6.m8437a(bundle, "triggered_event_name", cls2, null);
        C1784f6.m8437a(bundle, "triggered_event_params", Bundle.class, null);
        C1784f6.m8437a(bundle, "time_to_live", cls, 0L);
        C1784f6.m8437a(bundle, "expired_event_name", cls2, null);
        C1784f6.m8437a(bundle, "expired_event_params", Bundle.class, null);
        C1658o.m7841f(bundle.getString("name"));
        C1658o.m7841f(bundle.getString("origin"));
        C1658o.m7845j(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (mo6707f().mo7002p0(string) != 0) {
            mo6709i().mo6764E().mo6886b("Invalid conditional user property name", mo6705d().mo6694z(string));
        } else if (mo6707f().mo7003q0(string, obj) != 0) {
            mo6709i().mo6764E().mo6887c("Invalid conditional user property value", mo6705d().mo6694z(string), obj);
        } else {
            Object y0 = mo6707f().mo7008y0(string, obj);
            if (y0 == null) {
                mo6709i().mo6764E().mo6887c("Unable to normalize conditional user property value", mo6705d().mo6694z(string), obj);
                return;
            }
            C1784f6.m8438b(bundle, y0);
            long j2 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong("time_to_live");
                if (j3 > 15552000000L || j3 < 1) {
                    mo6709i().mo6764E().mo6887c("Invalid conditional user property time to live", mo6705d().mo6694z(string), Long.valueOf(j3));
                } else {
                    mo6706e().mo6703y(new C1988w6(this, bundle));
                }
            } else {
                mo6709i().mo6764E().mo6887c("Invalid conditional user property timeout", mo6705d().mo6694z(string), Long.valueOf(j2));
            }
        }
    }

    /* renamed from: w0 */
    private final void m8662w0(String str, String str2, String str3, Bundle bundle) {
        long c = mo6708g().mo6587c();
        C1658o.m7841f(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", c);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo6706e().mo6703y(new C2013y6(this, bundle2));
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public final void m8663x0(Bundle bundle) {
        Bundle bundle2 = bundle;
        mo6700b();
        mo6965w();
        C1658o.m7845j(bundle);
        C1658o.m7841f(bundle2.getString("name"));
        C1658o.m7841f(bundle2.getString("origin"));
        C1658o.m7845j(bundle2.get("value"));
        if (!this.f5634a.mo7044p()) {
            mo6709i().mo6772M().mo6885a("Conditional property not set since app measurement is disabled");
            return;
        }
        try {
            mo6857r().mo6787P(new C1968ua(bundle2.getString("app_id"), bundle2.getString("origin"), new C1776ea(bundle2.getString("name"), bundle2.getLong("triggered_timestamp"), bundle2.get("value"), bundle2.getString("origin")), bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), mo6707f().mo6975E(bundle2.getString("app_id"), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString("origin"), 0, true, false, C4729pa.m20169b() && mo6712l().mo7415s(C1957u.f6344S0)), bundle2.getLong("trigger_timeout"), mo6707f().mo6975E(bundle2.getString("app_id"), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString("origin"), 0, true, false, C4729pa.m20169b() && mo6712l().mo7415s(C1957u.f6344S0)), bundle2.getLong("time_to_live"), mo6707f().mo6975E(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), 0, true, false, C4729pa.m20169b() && mo6712l().mo7415s(C1957u.f6344S0))));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public final void m8664z0(Bundle bundle) {
        Bundle bundle2 = bundle;
        mo6700b();
        mo6965w();
        C1658o.m7845j(bundle);
        C1658o.m7841f(bundle2.getString("name"));
        if (!this.f5634a.mo7044p()) {
            mo6709i().mo6772M().mo6885a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        C1776ea eaVar = new C1776ea(bundle2.getString("name"), 0, (Object) null, (String) null);
        try {
            mo6857r().mo6787P(new C1968ua(bundle2.getString("app_id"), bundle2.getString("origin"), eaVar, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), (C1933s) null, bundle2.getLong("trigger_timeout"), (C1933s) null, bundle2.getLong("time_to_live"), mo6707f().mo6975E(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), bundle2.getLong("creation_timestamp"), true, false, C4729pa.m20169b() && mo6712l().mo7415s(C1957u.f6344S0))));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: B */
    public final ArrayList<Bundle> mo7180B(String str, String str2) {
        return m8658p0((String) null, str, str2);
    }

    /* renamed from: C */
    public final ArrayList<Bundle> mo7181C(String str, String str2, String str3) {
        C1658o.m7841f(str);
        mo6853m();
        throw null;
    }

    /* renamed from: D */
    public final Map<String, Object> mo7182D(String str, String str2, String str3, boolean z) {
        C1658o.m7841f(str);
        mo6853m();
        throw null;
    }

    /* renamed from: E */
    public final Map<String, Object> mo7183E(String str, String str2, boolean z) {
        return m8659q0((String) null, str, str2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo7184F(long j, boolean z) {
        mo6700b();
        mo6965w();
        mo6709i().mo6771L().mo6885a("Resetting analytics data (FE)");
        C1835j9 u = mo6860u();
        u.mo6700b();
        u.f5952e.mo7298a();
        boolean p = this.f5634a.mo7044p();
        C1902p4 k = mo6711k();
        k.f6139j.mo7344b(j);
        if (!TextUtils.isEmpty(k.mo6711k().f6155z.mo7377a())) {
            k.f6155z.mo7378b((String) null);
        }
        if (C4680mc.m19971b() && k.mo6712l().mo7415s(C1957u.f6391s0)) {
            k.f6150u.mo7344b(0);
        }
        if (!k.mo6712l().mo7400E()) {
            k.mo7275B(!p);
        }
        k.f6129A.mo7378b((String) null);
        k.f6130B.mo7344b(0);
        k.f6131C.mo7308b((Bundle) null);
        if (z) {
            mo6857r().mo6794X();
        }
        if (C4680mc.m19971b() && mo6712l().mo7415s(C1957u.f6391s0)) {
            mo6860u().f5951d.mo7330a();
        }
        this.f6008o = !p;
    }

    /* renamed from: G */
    public final void mo7185G(Bundle bundle) {
        mo7186H(bundle, mo6708g().mo6587c());
    }

    /* renamed from: H */
    public final void mo7186H(Bundle bundle, long j) {
        C1658o.m7845j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            mo6709i().mo6767H().mo6885a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        m8660s0(bundle2, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo7187I(C1765e eVar) {
        mo6700b();
        boolean z = (eVar.mo6882q() && eVar.mo6880o()) || mo6857r().mo6800d0();
        if (z != this.f5634a.mo7046r()) {
            this.f5634a.mo7018A(z);
            Boolean J = mo6711k().mo7283J();
            if (!z || J == null || J.booleanValue()) {
                m8655S(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: J */
    public final void mo7188J(C1765e eVar, int i, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        C1765e eVar2 = eVar;
        if (C4602ib.m19620b() && mo6712l().mo7415s(C1957u.f6338P0)) {
            mo6965w();
            if (eVar.mo6878l() == null && eVar.mo6881p() == null) {
                mo6709i().mo6769J().mo6885a("Discarding empty consent settings");
                return;
            }
            synchronized (this.f6001h) {
                int i2 = i;
                z = true;
                z2 = false;
                if (C1765e.m8338g(i, this.f6003j)) {
                    boolean h = eVar.mo6875h(this.f6002i);
                    if (eVar.mo6882q() && !this.f6002i.mo6882q()) {
                        z2 = true;
                    }
                    eVar2 = eVar.mo6879n(this.f6002i);
                    this.f6002i = eVar2;
                    z3 = z2;
                    z2 = h;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (!z) {
                mo6709i().mo6770K().mo6886b("Ignoring lower-priority consent settings, proposed settings", eVar2);
                return;
            }
            long andIncrement = this.f6004k.getAndIncrement();
            if (z2) {
                mo7192T((String) null);
                mo6706e().mo6696B(new C1821i7(this, eVar2, j, i, andIncrement, z3));
                return;
            }
            mo6706e().mo6703y(new C1809h7(this, eVar2, i, andIncrement, z3));
        }
    }

    /* renamed from: L */
    public final void mo7189L(C1832j6 j6Var) {
        mo6965w();
        C1658o.m7845j(j6Var);
        if (!this.f5998e.add(j6Var)) {
            mo6709i().mo6767H().mo6885a("OnEventListener already registered");
        }
    }

    /* renamed from: M */
    public final void mo7190M(C1844k6 k6Var) {
        C1844k6 k6Var2;
        mo6700b();
        mo6965w();
        if (!(k6Var == null || k6Var == (k6Var2 = this.f5997d))) {
            C1658o.m7849n(k6Var2 == null, "EventInterceptor already set.");
        }
        this.f5997d = k6Var;
    }

    /* renamed from: R */
    public final void mo7191R(Boolean bool) {
        mo6965w();
        mo6706e().mo6703y(new C1773e7(this, bool));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo7192T(String str) {
        this.f6000g.set(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo7193U(String str, String str2, long j, Bundle bundle) {
        mo6700b();
        mo7194V(str, str2, j, bundle, true, this.f5997d == null || C1788fa.m8443C0(str2), false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0152  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7194V(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r15 = r29
            r13 = r30
            r12 = r32
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.C1658o.m7841f(r28)
            com.google.android.gms.common.internal.C1658o.m7845j(r32)
            r27.mo6700b()
            r27.mo6965w()
            com.google.android.gms.measurement.internal.h5 r1 = r7.f5634a
            boolean r1 = r1.mo7044p()
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.c4 r0 = r27.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6771L()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo6885a(r1)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.v3 r1 = r27.mo6856q()
            java.util.List r1 = r1.mo7376I()
            if (r1 == 0) goto L_0x004c
            boolean r1 = r1.contains(r15)
            if (r1 != 0) goto L_0x004c
            com.google.android.gms.measurement.internal.c4 r0 = r27.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6771L()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo6887c(r1, r15, r8)
            return
        L_0x004c:
            boolean r1 = r7.f5999f
            r11 = 0
            r10 = 0
            r9 = 1
            if (r1 != 0) goto L_0x00a2
            r7.f5999f = r9
            com.google.android.gms.measurement.internal.h5 r1 = r7.f5634a     // Catch:{ ClassNotFoundException -> 0x0095 }
            boolean r1 = r1.mo7031N()     // Catch:{ ClassNotFoundException -> 0x0095 }
            if (r1 != 0) goto L_0x006a
            android.content.Context r1 = r27.mo6710j()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r1)     // Catch:{ ClassNotFoundException -> 0x0095 }
            goto L_0x006e
        L_0x006a:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0095 }
        L_0x006e:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0086 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3     // Catch:{ Exception -> 0x0086 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0086 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0086 }
            android.content.Context r2 = r27.mo6710j()     // Catch:{ Exception -> 0x0086 }
            r1[r10] = r2     // Catch:{ Exception -> 0x0086 }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x0086 }
            goto L_0x00a2
        L_0x0086:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r1 = r27.mo6709i()     // Catch:{ ClassNotFoundException -> 0x0095 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6767H()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo6886b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0095 }
            goto L_0x00a2
        L_0x0095:
            com.google.android.gms.measurement.internal.c4 r0 = r27.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6770K()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo6885a(r1)
        L_0x00a2:
            com.google.android.gms.measurement.internal.wa r0 = r27.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1957u.f6365f0
            boolean r0 = r0.mo7415s(r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00d3
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.e r0 = r27.mo6708g()
            long r5 = r0.mo6587c()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r27
            r1.mo7197Z(r2, r3, r4, r5)
        L_0x00d3:
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4907zc.m20843b()
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.wa r0 = r27.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1957u.f6322H0
            boolean r0 = r0.mo7415s(r1)
            if (r0 == 0) goto L_0x00fe
            if (r33 == 0) goto L_0x00fe
            boolean r0 = com.google.android.gms.measurement.internal.C1788fa.m8446F0(r29)
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.fa r0 = r27.mo6707f()
            com.google.android.gms.measurement.internal.p4 r1 = r27.mo6711k()
            com.google.android.gms.measurement.internal.q4 r1 = r1.f6131C
            android.os.Bundle r1 = r1.mo7307a()
            r0.mo6983M(r12, r1)
        L_0x00fe:
            r0 = 40
            if (r35 == 0) goto L_0x0182
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0182
            com.google.android.gms.measurement.internal.h5 r1 = r7.f5634a
            com.google.android.gms.measurement.internal.fa r1 = r1.mo7024G()
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4729pa.m20169b()
            if (r2 == 0) goto L_0x0124
            com.google.android.gms.measurement.internal.wa r2 = r27.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6344S0
            boolean r2 = r2.mo7415s(r3)
            if (r2 == 0) goto L_0x0124
            r2 = 1
            goto L_0x0125
        L_0x0124:
            r2 = 0
        L_0x0125:
            java.lang.String r3 = "event"
            boolean r4 = r1.mo6997g0(r3, r15)
            r5 = 13
            r6 = 2
            if (r4 != 0) goto L_0x0132
        L_0x0130:
            r5 = 2
            goto L_0x0150
        L_0x0132:
            if (r2 == 0) goto L_0x013f
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.C1772e6.f5757a
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.C1772e6.f5758b
            boolean r2 = r1.mo7001m0(r3, r2, r4, r15)
            if (r2 != 0) goto L_0x0148
            goto L_0x0150
        L_0x013f:
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.C1772e6.f5757a
            boolean r2 = r1.mo7000l0(r3, r2, r15)
            if (r2 != 0) goto L_0x0148
            goto L_0x0150
        L_0x0148:
            boolean r1 = r1.mo6996f0(r3, r0, r15)
            if (r1 != 0) goto L_0x014f
            goto L_0x0130
        L_0x014f:
            r5 = 0
        L_0x0150:
            if (r5 == 0) goto L_0x0182
            com.google.android.gms.measurement.internal.c4 r1 = r27.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6766G()
            com.google.android.gms.measurement.internal.a4 r2 = r27.mo6705d()
            java.lang.String r2 = r2.mo6692v(r15)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo6886b(r3, r2)
            com.google.android.gms.measurement.internal.h5 r1 = r7.f5634a
            r1.mo7024G()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C1788fa.m8448H(r15, r0, r9)
            if (r15 == 0) goto L_0x0176
            int r10 = r29.length()
        L_0x0176:
            com.google.android.gms.measurement.internal.h5 r1 = r7.f5634a
            com.google.android.gms.measurement.internal.fa r1 = r1.mo7024G()
            java.lang.String r2 = "_ev"
            r1.mo6980J(r5, r2, r0, r10)
            return
        L_0x0182:
            com.google.android.gms.measurement.internal.t7 r1 = r27.mo6858s()
            com.google.android.gms.measurement.internal.u7 r1 = r1.mo7347D(r10)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0196
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0196
            r1.f6425d = r9
        L_0x0196:
            if (r33 == 0) goto L_0x019c
            if (r35 == 0) goto L_0x019c
            r3 = 1
            goto L_0x019d
        L_0x019c:
            r3 = 0
        L_0x019d:
            com.google.android.gms.measurement.internal.C1953t7.m8858O(r1, r12, r3)
            java.lang.String r3 = "am"
            boolean r16 = r3.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C1788fa.m8443C0(r29)
            if (r33 == 0) goto L_0x01df
            com.google.android.gms.measurement.internal.k6 r4 = r7.f5997d
            if (r4 == 0) goto L_0x01df
            if (r3 != 0) goto L_0x01df
            if (r16 != 0) goto L_0x01df
            com.google.android.gms.measurement.internal.c4 r0 = r27.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6771L()
            com.google.android.gms.measurement.internal.a4 r1 = r27.mo6705d()
            java.lang.String r1 = r1.mo6692v(r15)
            com.google.android.gms.measurement.internal.a4 r2 = r27.mo6705d()
            java.lang.String r2 = r2.mo6690t(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo6887c(r3, r1, r2)
            com.google.android.gms.measurement.internal.k6 r1 = r7.f5997d
            r2 = r28
            r3 = r29
            r4 = r32
            r5 = r30
            r1.mo6684a(r2, r3, r4, r5)
            return
        L_0x01df:
            com.google.android.gms.measurement.internal.h5 r3 = r7.f5634a
            boolean r3 = r3.mo7049u()
            if (r3 != 0) goto L_0x01e8
            return
        L_0x01e8:
            com.google.android.gms.measurement.internal.fa r3 = r27.mo6707f()
            boolean r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4729pa.m20169b()
            if (r4 == 0) goto L_0x0200
            com.google.android.gms.measurement.internal.wa r4 = r27.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C1957u.f6344S0
            boolean r4 = r4.mo7415s(r5)
            if (r4 == 0) goto L_0x0200
            r4 = 1
            goto L_0x0201
        L_0x0200:
            r4 = 0
        L_0x0201:
            int r3 = r3.mo7005v(r15, r4)
            if (r3 == 0) goto L_0x0241
            com.google.android.gms.measurement.internal.c4 r1 = r27.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6766G()
            com.google.android.gms.measurement.internal.a4 r2 = r27.mo6705d()
            java.lang.String r2 = r2.mo6692v(r15)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r1.mo6886b(r4, r2)
            r27.mo6707f()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C1788fa.m8448H(r15, r0, r9)
            if (r15 == 0) goto L_0x0229
            int r10 = r29.length()
        L_0x0229:
            com.google.android.gms.measurement.internal.h5 r1 = r7.f5634a
            com.google.android.gms.measurement.internal.fa r1 = r1.mo7024G()
            java.lang.String r2 = "_ev"
            r28 = r1
            r29 = r36
            r30 = r3
            r31 = r2
            r32 = r0
            r33 = r10
            r28.mo6994W(r29, r30, r31, r32, r33)
            return
        L_0x0241:
            java.lang.String r0 = "_o"
            java.lang.String r3 = "_sn"
            java.lang.String r4 = "_si"
            java.lang.String[] r5 = new java.lang.String[]{r0, r3, r2, r4}
            java.util.List r17 = com.google.android.gms.common.util.C1683f.m7943c(r5)
            com.google.android.gms.measurement.internal.fa r5 = r27.mo6707f()
            r6 = 1
            r9 = r5
            r5 = 0
            r10 = r36
            r19 = r11
            r11 = r29
            r12 = r32
            r13 = r17
            r14 = r35
            r15 = r6
            android.os.Bundle r15 = r9.mo6973C(r10, r11, r12, r13, r14, r15)
            if (r15 == 0) goto L_0x0290
            boolean r6 = r15.containsKey(r2)
            if (r6 == 0) goto L_0x0290
            boolean r6 = r15.containsKey(r4)
            if (r6 != 0) goto L_0x0276
            goto L_0x0290
        L_0x0276:
            java.lang.String r3 = r15.getString(r3)
            java.lang.String r2 = r15.getString(r2)
            long r9 = r15.getLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            com.google.android.gms.measurement.internal.u7 r11 = new com.google.android.gms.measurement.internal.u7
            long r9 = r4.longValue()
            r11.<init>(r3, r2, r9)
            goto L_0x0292
        L_0x0290:
            r11 = r19
        L_0x0292:
            if (r11 != 0) goto L_0x0296
            r14 = r1
            goto L_0x0297
        L_0x0296:
            r14 = r11
        L_0x0297:
            com.google.android.gms.measurement.internal.wa r1 = r27.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6347U
            boolean r1 = r1.mo7415s(r2)
            java.lang.String r13 = "_ae"
            r9 = 0
            if (r1 == 0) goto L_0x02cf
            com.google.android.gms.measurement.internal.t7 r1 = r27.mo6858s()
            com.google.android.gms.measurement.internal.u7 r1 = r1.mo7347D(r5)
            if (r1 == 0) goto L_0x02cf
            r12 = r29
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x02d1
            com.google.android.gms.measurement.internal.j9 r1 = r27.mo6860u()
            com.google.android.gms.measurement.internal.p9 r1 = r1.f5952e
            long r1 = r1.mo7301e()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d1
            com.google.android.gms.measurement.internal.fa r3 = r27.mo6707f()
            r3.mo6982L(r15, r1)
            goto L_0x02d1
        L_0x02cf:
            r12 = r29
        L_0x02d1:
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4813ub.m20481b()
            if (r1 == 0) goto L_0x0353
            com.google.android.gms.measurement.internal.wa r1 = r27.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6389r0
            boolean r1 = r1.mo7415s(r2)
            if (r1 == 0) goto L_0x0353
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0336
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0336
            com.google.android.gms.measurement.internal.fa r1 = r27.mo6707f()
            java.lang.String r2 = r15.getString(r2)
            boolean r3 = com.google.android.gms.common.util.C1691n.m7971a(r2)
            if (r3 == 0) goto L_0x0306
            r11 = r19
            goto L_0x030a
        L_0x0306:
            java.lang.String r11 = r2.trim()
        L_0x030a:
            com.google.android.gms.measurement.internal.p4 r2 = r1.mo6711k()
            com.google.android.gms.measurement.internal.v4 r2 = r2.f6155z
            java.lang.String r2 = r2.mo7377a()
            boolean r2 = com.google.android.gms.measurement.internal.C1788fa.m8442B0(r11, r2)
            if (r2 == 0) goto L_0x0329
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6771L()
            java.lang.String r2 = "Not logging duplicate session_start_with_rollout event"
            r1.mo6885a(r2)
            r1 = 0
            goto L_0x0333
        L_0x0329:
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo6711k()
            com.google.android.gms.measurement.internal.v4 r1 = r1.f6155z
            r1.mo7378b(r11)
            r1 = 1
        L_0x0333:
            if (r1 != 0) goto L_0x0353
            return
        L_0x0336:
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x0353
            com.google.android.gms.measurement.internal.fa r1 = r27.mo6707f()
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo6711k()
            com.google.android.gms.measurement.internal.v4 r1 = r1.f6155z
            java.lang.String r1 = r1.mo7377a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0353
            r15.putString(r2, r1)
        L_0x0353:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r15)
            com.google.android.gms.measurement.internal.fa r1 = r27.mo6707f()
            java.security.SecureRandom r1 = r1.mo6978H0()
            long r3 = r1.nextLong()
            com.google.android.gms.measurement.internal.p4 r1 = r27.mo6711k()
            com.google.android.gms.measurement.internal.t4 r1 = r1.f6150u
            long r1 = r1.mo7343a()
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x03d7
            com.google.android.gms.measurement.internal.p4 r1 = r27.mo6711k()
            r9 = r30
            boolean r1 = r1.mo7291x(r9)
            if (r1 == 0) goto L_0x03d9
            com.google.android.gms.measurement.internal.p4 r1 = r27.mo6711k()
            com.google.android.gms.measurement.internal.r4 r1 = r1.f6152w
            boolean r1 = r1.mo7326b()
            if (r1 == 0) goto L_0x03d9
            com.google.android.gms.measurement.internal.c4 r1 = r27.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo6885a(r2)
            r6 = 0
            com.google.android.gms.common.util.e r1 = r27.mo6708g()
            long r19 = r1.mo6587c()
            java.lang.String r2 = "auto"
            java.lang.String r21 = "_sid"
            r1 = r27
            r22 = r3
            r3 = r21
            r4 = r6
            r5 = r19
            r1.mo7197Z(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.common.util.e r1 = r27.mo6708g()
            long r5 = r1.mo6587c()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r27
            r1.mo7197Z(r2, r3, r4, r5)
            com.google.android.gms.common.util.e r1 = r27.mo6708g()
            long r5 = r1.mo6587c()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r27
            r1.mo7197Z(r2, r3, r4, r5)
            goto L_0x03db
        L_0x03d7:
            r9 = r30
        L_0x03d9:
            r22 = r3
        L_0x03db:
            java.lang.String r1 = "extend_session"
            r2 = 0
            long r1 = r15.getLong(r1, r2)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0403
            com.google.android.gms.measurement.internal.c4 r1 = r27.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo6885a(r2)
            com.google.android.gms.measurement.internal.h5 r1 = r7.f5634a
            com.google.android.gms.measurement.internal.j9 r1 = r1.mo7020C()
            com.google.android.gms.measurement.internal.r9 r1 = r1.f5951d
            r5 = 1
            r1.mo7331b(r9, r5)
            goto L_0x0404
        L_0x0403:
            r5 = 1
        L_0x0404:
            java.util.Set r1 = r15.keySet()
            int r2 = r15.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4714ob.m20059b()
            if (r2 == 0) goto L_0x0456
            com.google.android.gms.measurement.internal.wa r2 = r27.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6310B0
            boolean r2 = r2.mo7415s(r3)
            if (r2 == 0) goto L_0x0456
            com.google.android.gms.measurement.internal.wa r2 = r27.mo6712l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6308A0
            boolean r2 = r2.mo7415s(r3)
            if (r2 == 0) goto L_0x0456
            int r2 = r1.length
            r3 = 0
        L_0x0437:
            if (r3 >= r2) goto L_0x044e
            r4 = r1[r3]
            r27.mo6707f()
            java.lang.Object r6 = r15.get(r4)
            android.os.Bundle[] r6 = com.google.android.gms.measurement.internal.C1788fa.m8472x0(r6)
            if (r6 == 0) goto L_0x044b
            r15.putParcelableArray(r4, r6)
        L_0x044b:
            int r3 = r3 + 1
            goto L_0x0437
        L_0x044e:
            r10 = r11
            r11 = r12
            r26 = r13
            r24 = 1
            goto L_0x0512
        L_0x0456:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0459:
            java.lang.String r6 = "_eid"
            if (r3 >= r2) goto L_0x04ff
            r5 = r1[r3]
            java.lang.Object r19 = r15.get(r5)
            r27.mo6707f()
            r32 = r1
            android.os.Bundle[] r1 = com.google.android.gms.measurement.internal.C1788fa.m8472x0(r19)
            r19 = r2
            if (r1 == 0) goto L_0x04de
            int r2 = r1.length
            r15.putInt(r5, r2)
            r2 = 0
        L_0x0475:
            int r9 = r1.length
            if (r2 >= r9) goto L_0x04d0
            r10 = r1[r2]
            r9 = 1
            com.google.android.gms.measurement.internal.C1953t7.m8858O(r14, r10, r9)
            com.google.android.gms.measurement.internal.fa r18 = r27.mo6707f()
            r20 = 0
            java.lang.String r21 = "_ep"
            r24 = 1
            r9 = r18
            r18 = r10
            r10 = r36
            r25 = r11
            r11 = r21
            r12 = r18
            r26 = r13
            r13 = r17
            r18 = r14
            r14 = r35
            r7 = r15
            r15 = r20
            android.os.Bundle r9 = r9.mo6973C(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r11 = r29
            r9.putString(r10, r11)
            r12 = r22
            r9.putLong(r6, r12)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r5)
            int r10 = r1.length
            java.lang.String r14 = "_ll"
            r9.putInt(r14, r10)
            java.lang.String r10 = "_i"
            r9.putInt(r10, r2)
            r10 = r25
            r10.add(r9)
            int r2 = r2 + 1
            r15 = r7
            r14 = r18
            r13 = r26
            r7 = r27
            r12 = r11
            r11 = r10
            goto L_0x0475
        L_0x04d0:
            r10 = r11
            r11 = r12
            r26 = r13
            r18 = r14
            r7 = r15
            r12 = r22
            r24 = 1
            int r1 = r1.length
            int r4 = r4 + r1
            goto L_0x04e9
        L_0x04de:
            r10 = r11
            r11 = r12
            r26 = r13
            r18 = r14
            r7 = r15
            r12 = r22
            r24 = 1
        L_0x04e9:
            int r3 = r3 + 1
            r1 = r32
            r15 = r7
            r22 = r12
            r14 = r18
            r2 = r19
            r13 = r26
            r5 = 1
            r7 = r27
            r12 = r11
            r11 = r10
            r9 = r30
            goto L_0x0459
        L_0x04ff:
            r10 = r11
            r11 = r12
            r26 = r13
            r7 = r15
            r12 = r22
            r24 = 1
            if (r4 == 0) goto L_0x0512
            r7.putLong(r6, r12)
            java.lang.String r1 = "_epc"
            r7.putInt(r1, r4)
        L_0x0512:
            r7 = 0
        L_0x0513:
            int r1 = r10.size()
            if (r7 >= r1) goto L_0x057b
            java.lang.Object r1 = r10.get(r7)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r7 == 0) goto L_0x0523
            r2 = 1
            goto L_0x0524
        L_0x0523:
            r2 = 0
        L_0x0524:
            if (r2 == 0) goto L_0x0529
            java.lang.String r2 = "_ep"
            goto L_0x052a
        L_0x0529:
            r2 = r11
        L_0x052a:
            r1.putString(r0, r8)
            if (r34 == 0) goto L_0x0537
            com.google.android.gms.measurement.internal.fa r3 = r27.mo6707f()
            android.os.Bundle r1 = r3.mo6972B(r1)
        L_0x0537:
            r9 = r1
            com.google.android.gms.measurement.internal.s r12 = new com.google.android.gms.measurement.internal.s
            com.google.android.gms.measurement.internal.n r3 = new com.google.android.gms.measurement.internal.n
            r3.<init>(r9)
            r1 = r12
            r4 = r28
            r13 = 1
            r5 = r30
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.c8 r1 = r27.mo6857r()
            r14 = r36
            r1.mo6782J(r12, r14)
            r12 = r27
            if (r16 != 0) goto L_0x0576
            java.util.Set<com.google.android.gms.measurement.internal.j6> r1 = r12.f5998e
            java.util.Iterator r15 = r1.iterator()
        L_0x055b:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.j6 r1 = (com.google.android.gms.measurement.internal.C1832j6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r9)
            r2 = r28
            r3 = r29
            r5 = r30
            r1.mo6683a(r2, r3, r4, r5)
            goto L_0x055b
        L_0x0576:
            int r7 = r7 + 1
            r24 = 1
            goto L_0x0513
        L_0x057b:
            r12 = r27
            r13 = 1
            com.google.android.gms.measurement.internal.t7 r0 = r27.mo6858s()
            r1 = 0
            com.google.android.gms.measurement.internal.u7 r0 = r0.mo7347D(r1)
            if (r0 == 0) goto L_0x05a0
            r0 = r26
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x05a0
            com.google.android.gms.measurement.internal.j9 r0 = r27.mo6860u()
            com.google.android.gms.common.util.e r1 = r27.mo6708g()
            long r1 = r1.mo6585a()
            r0.mo7156E(r13, r13, r1)
        L_0x05a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1856l6.mo7194V(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: X */
    public final void mo7195X(String str, String str2, Bundle bundle) {
        mo7196Y(str, str2, bundle, true, true, mo6708g().mo6587c());
    }

    /* renamed from: Y */
    public final void mo7196Y(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!mo6712l().mo7415s(C1957u.f6401x0)) {
            String str4 = str2;
        } else if (C1788fa.m8442B0(str2, "screen_view")) {
            mo6858s().mo7351J(bundle2, j);
            return;
        }
        long j2 = j;
        mo6706e().mo6703y(new C1964u6(this, str3, str2, j, C1788fa.m8465r0(bundle2), z2, !z2 || this.f5997d == null || C1788fa.m8443C0(str2), !z, (String) null));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7197Z(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C1658o.m7841f(r9)
            com.google.android.gms.common.internal.C1658o.m7841f(r10)
            r8.mo6700b()
            r8.mo6965w()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0060
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0050
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0035
            r4 = r2
            goto L_0x0037
        L_0x0035:
            r4 = 0
        L_0x0037:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.p4 r0 = r8.mo6711k()
            com.google.android.gms.measurement.internal.v4 r0 = r0.f6148s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004b
            java.lang.String r11 = "true"
        L_0x004b:
            r0.mo7378b(r11)
            r6 = r10
            goto L_0x005e
        L_0x0050:
            if (r11 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.p4 r10 = r8.mo6711k()
            com.google.android.gms.measurement.internal.v4 r10 = r10.f6148s
            java.lang.String r0 = "unset"
            r10.mo7378b(r0)
            r6 = r11
        L_0x005e:
            r3 = r1
            goto L_0x0062
        L_0x0060:
            r3 = r10
            r6 = r11
        L_0x0062:
            com.google.android.gms.measurement.internal.h5 r10 = r8.f5634a
            boolean r10 = r10.mo7044p()
            if (r10 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.c4 r9 = r8.mo6709i()
            com.google.android.gms.measurement.internal.e4 r9 = r9.mo6772M()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo6885a(r10)
            return
        L_0x0078:
            com.google.android.gms.measurement.internal.h5 r10 = r8.f5634a
            boolean r10 = r10.mo7049u()
            if (r10 != 0) goto L_0x0081
            return
        L_0x0081:
            com.google.android.gms.measurement.internal.ea r10 = new com.google.android.gms.measurement.internal.ea
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.c8 r9 = r8.mo6857r()
            r9.mo6786O(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1856l6.mo7197Z(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: a0 */
    public final void mo7198a0(String str, String str2, Object obj, boolean z) {
        mo7199b0(str, str2, obj, true, mo6708g().mo6587c());
    }

    /* renamed from: b0 */
    public final void mo7199b0(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo6707f().mo7002p0(str2);
        } else {
            C1788fa f = mo6707f();
            if (f.mo6997g0("user property", str2)) {
                if (!f.mo7000l0("user property", C1808h6.f5899a, str2)) {
                    i = 15;
                } else if (f.mo6996f0("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            mo6707f();
            String H = C1788fa.m8448H(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f5634a.mo7024G().mo6980J(i, "_ev", H, i2);
        } else if (obj != null) {
            int q0 = mo6707f().mo7003q0(str2, obj);
            if (q0 != 0) {
                mo6707f();
                String H2 = C1788fa.m8448H(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f5634a.mo7024G().mo6980J(q0, "_ev", H2, i2);
                return;
            }
            Object y0 = mo6707f().mo7008y0(str2, obj);
            if (y0 != null) {
                m8656W(str3, str2, j, y0);
            }
        } else {
            m8656W(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: c0 */
    public final void mo7200c0(String str, String str2, String str3, Bundle bundle) {
        C1658o.m7841f(str);
        mo6853m();
        throw null;
    }

    /* renamed from: d0 */
    public final void mo7201d0() {
        if (mo6710j().getApplicationContext() instanceof Application) {
            ((Application) mo6710j().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f5996c);
        }
    }

    /* renamed from: e0 */
    public final Boolean mo7202e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) mo6706e().mo6701u(atomicReference, 15000, "boolean test flag value", new C1916q6(this, atomicReference));
    }

    /* renamed from: f0 */
    public final String mo7203f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) mo6706e().mo6701u(atomicReference, 15000, "String test flag value", new C2024z6(this, atomicReference));
    }

    /* renamed from: g0 */
    public final Long mo7204g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) mo6706e().mo6701u(atomicReference, 15000, "long test flag value", new C1761d7(this, atomicReference));
    }

    /* renamed from: h0 */
    public final Integer mo7205h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) mo6706e().mo6701u(atomicReference, 15000, "int test flag value", new C1749c7(this, atomicReference));
    }

    /* renamed from: i0 */
    public final Double mo7206i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) mo6706e().mo6701u(atomicReference, 15000, "double test flag value", new C1785f7(this, atomicReference));
    }

    /* renamed from: j0 */
    public final String mo7207j0() {
        return this.f6000g.get();
    }

    /* renamed from: k0 */
    public final void mo7208k0() {
        mo6700b();
        mo6965w();
        if (this.f5634a.mo7049u()) {
            if (mo6712l().mo7415s(C1957u.f6363e0)) {
                Boolean D = mo6712l().mo7399D("google_analytics_deferred_deep_link_enabled");
                if (D != null && D.booleanValue()) {
                    mo6709i().mo6771L().mo6885a("Deferred Deep Link feature enabled.");
                    mo6706e().mo6703y(new C1880n6(this));
                }
            }
            mo6857r().mo6795Y();
            this.f6008o = false;
            String L = mo6711k().mo7285L();
            if (!TextUtils.isEmpty(L)) {
                mo6704c().mo6864o();
                if (!L.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", L);
                    mo7195X("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: l0 */
    public final String mo7209l0() {
        C1965u7 S = this.f5634a.mo7032O().mo7353S();
        if (S != null) {
            return S.f6422a;
        }
        return null;
    }

    /* renamed from: m0 */
    public final String mo7210m0() {
        C1965u7 S = this.f5634a.mo7032O().mo7353S();
        if (S != null) {
            return S.f6423b;
        }
        return null;
    }

    /* renamed from: n0 */
    public final String mo7211n0() {
        if (this.f5634a.mo7028K() != null) {
            return this.f5634a.mo7028K();
        }
        try {
            return C1929r7.m8823a(mo6710j(), "google_app_id");
        } catch (IllegalStateException e) {
            this.f5634a.mo6709i().mo6764E().mo6886b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: r0 */
    public final void mo7212r0(Bundle bundle) {
        C1658o.m7845j(bundle);
        C1658o.m7841f(bundle.getString("app_id"));
        mo6853m();
        throw null;
    }

    /* renamed from: t0 */
    public final void mo7213t0(C1832j6 j6Var) {
        mo6965w();
        C1658o.m7845j(j6Var);
        if (!this.f5998e.remove(j6Var)) {
            mo6709i().mo6767H().mo6885a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public final void mo7214v0(String str, String str2, Bundle bundle) {
        mo6700b();
        mo7193U(str, str2, mo6708g().mo6587c(), bundle);
    }

    /* renamed from: y0 */
    public final void mo7215y0(String str, String str2, Bundle bundle) {
        m8662w0((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo6801z() {
        return false;
    }
}
