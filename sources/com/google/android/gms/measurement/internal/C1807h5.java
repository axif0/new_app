package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.C1577c;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1682e;
import com.google.android.gms.common.util.C1685h;
import com.karumi.dexter.BuildConfig;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;
import p148g.p189d.p190a.p232c.p241f.p247f.C4515e;
import p148g.p189d.p190a.p232c.p241f.p247f.C4558g2;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;
import p148g.p189d.p190a.p232c.p241f.p247f.C4813ub;
import p148g.p189d.p190a.p232c.p241f.p247f.C4907zc;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
public class C1807h5 implements C1748c6 {

    /* renamed from: H */
    private static volatile C1807h5 f5865H;

    /* renamed from: A */
    private volatile Boolean f5866A;

    /* renamed from: B */
    private Boolean f5867B;

    /* renamed from: C */
    private Boolean f5868C;

    /* renamed from: D */
    private volatile boolean f5869D;

    /* renamed from: E */
    private int f5870E;

    /* renamed from: F */
    private AtomicInteger f5871F = new AtomicInteger(0);

    /* renamed from: G */
    final long f5872G;

    /* renamed from: a */
    private final Context f5873a;

    /* renamed from: b */
    private final String f5874b;

    /* renamed from: c */
    private final String f5875c;

    /* renamed from: d */
    private final String f5876d;

    /* renamed from: e */
    private final boolean f5877e;

    /* renamed from: f */
    private final C1980va f5878f;

    /* renamed from: g */
    private final C1992wa f5879g;

    /* renamed from: h */
    private final C1902p4 f5880h;

    /* renamed from: i */
    private final C1746c4 f5881i;

    /* renamed from: j */
    private final C1723a5 f5882j;

    /* renamed from: k */
    private final C1835j9 f5883k;

    /* renamed from: l */
    private final C1788fa f5884l;

    /* renamed from: m */
    private final C1722a4 f5885m;

    /* renamed from: n */
    private final C1682e f5886n;

    /* renamed from: o */
    private final C1953t7 f5887o;

    /* renamed from: p */
    private final C1856l6 f5888p;

    /* renamed from: q */
    private final C1717a f5889q;

    /* renamed from: r */
    private final C1893o7 f5890r;

    /* renamed from: s */
    private C2010y3 f5891s;

    /* renamed from: t */
    private C1750c8 f5892t;

    /* renamed from: u */
    private C1861m f5893u;

    /* renamed from: v */
    private C1973v3 f5894v;

    /* renamed from: w */
    private C1962u4 f5895w;

    /* renamed from: x */
    private boolean f5896x = false;

    /* renamed from: y */
    private Boolean f5897y;

    /* renamed from: z */
    private long f5898z;

    private C1807h5(C1868m6 m6Var) {
        String str;
        C1770e4 e4Var;
        Bundle bundle;
        boolean z = false;
        C1658o.m7845j(m6Var);
        C1980va vaVar = new C1980va(m6Var.f6049a);
        this.f5878f = vaVar;
        C1937s3.f6244a = vaVar;
        this.f5873a = m6Var.f6049a;
        this.f5874b = m6Var.f6050b;
        this.f5875c = m6Var.f6051c;
        this.f5876d = m6Var.f6052d;
        this.f5877e = m6Var.f6056h;
        this.f5866A = m6Var.f6053e;
        this.f5869D = true;
        C4515e eVar = m6Var.f6055g;
        if (!(eVar == null || (bundle = eVar.f14075l) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f5867B = (Boolean) obj;
            }
            Object obj2 = eVar.f14075l.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f5868C = (Boolean) obj2;
            }
        }
        C4558g2.m19509h(this.f5873a);
        C1682e d = C1685h.m7946d();
        this.f5886n = d;
        Long l = m6Var.f6057i;
        this.f5872G = l != null ? l.longValue() : d.mo6587c();
        this.f5879g = new C1992wa(this);
        C1902p4 p4Var = new C1902p4(this);
        p4Var.mo6865p();
        this.f5880h = p4Var;
        C1746c4 c4Var = new C1746c4(this);
        c4Var.mo6865p();
        this.f5881i = c4Var;
        C1788fa faVar = new C1788fa(this);
        faVar.mo6865p();
        this.f5884l = faVar;
        C1722a4 a4Var = new C1722a4(this);
        a4Var.mo6865p();
        this.f5885m = a4Var;
        this.f5889q = new C1717a(this);
        C1953t7 t7Var = new C1953t7(this);
        t7Var.mo6966x();
        this.f5887o = t7Var;
        C1856l6 l6Var = new C1856l6(this);
        l6Var.mo6966x();
        this.f5888p = l6Var;
        C1835j9 j9Var = new C1835j9(this);
        j9Var.mo6966x();
        this.f5883k = j9Var;
        C1893o7 o7Var = new C1893o7(this);
        o7Var.mo6865p();
        this.f5890r = o7Var;
        C1723a5 a5Var = new C1723a5(this);
        a5Var.mo6865p();
        this.f5882j = a5Var;
        C4515e eVar2 = m6Var.f6055g;
        if (!(eVar2 == null || eVar2.f14070g == 0)) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f5873a.getApplicationContext() instanceof Application) {
            C1856l6 F = mo7023F();
            if (F.mo6710j().getApplicationContext() instanceof Application) {
                Application application = (Application) F.mo6710j().getApplicationContext();
                if (F.f5996c == null) {
                    F.f5996c = new C1833j7(F, (C1916q6) null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(F.f5996c);
                    application.registerActivityLifecycleCallbacks(F.f5996c);
                    e4Var = F.mo6709i().mo6772M();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.f5882j.mo6703y(new C1831j5(this, m6Var));
        }
        e4Var = mo6709i().mo6767H();
        str = "Application context is not an Application";
        e4Var.mo6885a(str);
        this.f5882j.mo6703y(new C1831j5(this, m6Var));
    }

    /* renamed from: a */
    public static C1807h5 m8537a(Context context, C4515e eVar, Long l) {
        Bundle bundle;
        if (eVar != null && (eVar.f14073j == null || eVar.f14074k == null)) {
            eVar = new C4515e(eVar.f14069f, eVar.f14070g, eVar.f14071h, eVar.f14072i, (String) null, (String) null, eVar.f14075l);
        }
        C1658o.m7845j(context);
        C1658o.m7845j(context.getApplicationContext());
        if (f5865H == null) {
            synchronized (C1807h5.class) {
                if (f5865H == null) {
                    f5865H = new C1807h5(new C1868m6(context, eVar, l));
                }
            }
        } else if (!(eVar == null || (bundle = eVar.f14075l) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            f5865H.mo7043o(eVar.f14075l.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f5865H;
    }

    /* renamed from: h */
    private static void m8539h(C1724a6 a6Var) {
        if (a6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m8540l(C1868m6 m6Var) {
        C1770e4 e4Var;
        String str;
        mo6706e().mo6700b();
        C1861m mVar = new C1861m(this);
        mVar.mo6865p();
        this.f5893u = mVar;
        C1973v3 v3Var = new C1973v3(this, m6Var.f6054f);
        v3Var.mo6966x();
        this.f5894v = v3Var;
        C2010y3 y3Var = new C2010y3(this);
        y3Var.mo6966x();
        this.f5891s = y3Var;
        C1750c8 c8Var = new C1750c8(this);
        c8Var.mo6966x();
        this.f5892t = c8Var;
        this.f5884l.mo6866q();
        this.f5880h.mo6866q();
        this.f5895w = new C1962u4(this);
        this.f5894v.mo6967y();
        mo6709i().mo6770K().mo6886b("App measurement initialized, version", 31049L);
        mo6709i().mo6770K().mo6885a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String C = v3Var.mo7370C();
        if (TextUtils.isEmpty(this.f5874b)) {
            if (mo7024G().mo6974D0(C)) {
                e4Var = mo6709i().mo6770K();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                C1770e4 K = mo6709i().mo6770K();
                String valueOf = String.valueOf(C);
                C1770e4 e4Var2 = K;
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                e4Var = e4Var2;
            }
            e4Var.mo6885a(str);
        }
        mo6709i().mo6771L().mo6885a("Debug-level message logging enabled");
        if (this.f5870E != this.f5871F.get()) {
            mo6709i().mo6764E().mo6887c("Not all components initialized", Integer.valueOf(this.f5870E), Integer.valueOf(this.f5871F.get()));
        }
        this.f5896x = true;
    }

    /* renamed from: w */
    private final C1893o7 m8541w() {
        m8543z(this.f5890r);
        return this.f5890r;
    }

    /* renamed from: y */
    private static void m8542y(C1783f5 f5Var) {
        if (f5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!f5Var.mo6964v()) {
            String valueOf = String.valueOf(f5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: z */
    private static void m8543z(C1760d6 d6Var) {
        if (d6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!d6Var.mo6867s()) {
            String valueOf = String.valueOf(d6Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: A */
    public final void mo7018A(boolean z) {
        mo6706e().mo6700b();
        this.f5869D = z;
    }

    /* renamed from: B */
    public final C1746c4 mo7019B() {
        C1746c4 c4Var = this.f5881i;
        if (c4Var == null || !c4Var.mo6867s()) {
            return null;
        }
        return this.f5881i;
    }

    /* renamed from: C */
    public final C1835j9 mo7020C() {
        m8542y(this.f5883k);
        return this.f5883k;
    }

    /* renamed from: D */
    public final C1962u4 mo7021D() {
        return this.f5895w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C1723a5 mo7022E() {
        return this.f5882j;
    }

    /* renamed from: F */
    public final C1856l6 mo7023F() {
        m8542y(this.f5888p);
        return this.f5888p;
    }

    /* renamed from: G */
    public final C1788fa mo7024G() {
        m8539h(this.f5884l);
        return this.f5884l;
    }

    /* renamed from: H */
    public final C1722a4 mo7025H() {
        m8539h(this.f5885m);
        return this.f5885m;
    }

    /* renamed from: I */
    public final C2010y3 mo7026I() {
        m8542y(this.f5891s);
        return this.f5891s;
    }

    /* renamed from: J */
    public final boolean mo7027J() {
        return TextUtils.isEmpty(this.f5874b);
    }

    /* renamed from: K */
    public final String mo7028K() {
        return this.f5874b;
    }

    /* renamed from: L */
    public final String mo7029L() {
        return this.f5875c;
    }

    /* renamed from: M */
    public final String mo7030M() {
        return this.f5876d;
    }

    /* renamed from: N */
    public final boolean mo7031N() {
        return this.f5877e;
    }

    /* renamed from: O */
    public final C1953t7 mo7032O() {
        m8542y(this.f5887o);
        return this.f5887o;
    }

    /* renamed from: P */
    public final C1750c8 mo7033P() {
        m8542y(this.f5892t);
        return this.f5892t;
    }

    /* renamed from: Q */
    public final C1861m mo7034Q() {
        m8543z(this.f5893u);
        return this.f5893u;
    }

    /* renamed from: R */
    public final C1973v3 mo7035R() {
        m8542y(this.f5894v);
        return this.f5894v;
    }

    /* renamed from: S */
    public final C1717a mo7036S() {
        C1717a aVar = this.f5889q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: T */
    public final boolean mo7037T() {
        return this.f5866A != null && this.f5866A.booleanValue();
    }

    /* renamed from: b */
    public final C1992wa mo7038b() {
        return this.f5879g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7039c(C4515e eVar) {
        mo6706e().mo6700b();
        if (C4602ib.m19620b() && this.f5879g.mo7415s(C1957u.f6338P0)) {
            C1765e K = mo7051x().mo7284K();
            if (!(eVar == null || eVar.f14075l == null || !mo7051x().mo7290w(30))) {
                C1765e j = C1765e.m8340j(eVar.f14075l);
                if (!j.equals(C1765e.f5741c)) {
                    mo7023F().mo7188J(j, 30, this.f5872G);
                    K = j;
                }
            }
            mo7023F().mo7187I(K);
        }
        if (mo7051x().f6134e.mo7343a() == 0) {
            mo7051x().f6134e.mo7344b(this.f5886n.mo6587c());
        }
        if (Long.valueOf(mo7051x().f6139j.mo7343a()).longValue() == 0) {
            mo6709i().mo6772M().mo6886b("Persisting first open", Long.valueOf(this.f5872G));
            mo7051x().f6139j.mo7344b(this.f5872G);
        }
        if (this.f5879g.mo7415s(C1957u.f6330L0)) {
            mo7023F().f6007n.mo7261c();
        }
        if (mo7049u()) {
            if (!TextUtils.isEmpty(mo7035R().mo7371D()) || !TextUtils.isEmpty(mo7035R().mo7372E())) {
                mo7024G();
                if (C1788fa.m8461j0(mo7035R().mo7371D(), mo7051x().mo7278E(), mo7035R().mo7372E(), mo7051x().mo7279F())) {
                    mo6709i().mo6770K().mo6885a("Rechecking which service to use due to a GMP App Id change");
                    mo7051x().mo7281H();
                    mo7026I().mo7474H();
                    this.f5892t.mo6798b0();
                    this.f5892t.mo6796Z();
                    mo7051x().f6139j.mo7344b(this.f5872G);
                    mo7051x().f6141l.mo7378b((String) null);
                }
                mo7051x().mo7274A(mo7035R().mo7371D());
                mo7051x().mo7276C(mo7035R().mo7372E());
            }
            if (C4602ib.m19620b() && this.f5879g.mo7415s(C1957u.f6338P0) && !mo7051x().mo7284K().mo6882q()) {
                mo7051x().f6141l.mo7378b((String) null);
            }
            mo7023F().mo7192T(mo7051x().f6141l.mo7377a());
            if (C4813ub.m20481b() && this.f5879g.mo7415s(C1957u.f6389r0) && !mo7024G().mo6985N0() && !TextUtils.isEmpty(mo7051x().f6155z.mo7377a())) {
                mo6709i().mo6767H().mo6885a("Remote config removed with active feature rollouts");
                mo7051x().f6155z.mo7378b((String) null);
            }
            if (!TextUtils.isEmpty(mo7035R().mo7371D()) || !TextUtils.isEmpty(mo7035R().mo7372E())) {
                boolean p = mo7044p();
                if (!mo7051x().mo7286M() && !this.f5879g.mo7400E()) {
                    mo7051x().mo7275B(!p);
                }
                if (p) {
                    mo7023F().mo7208k0();
                }
                mo7020C().f5951d.mo7330a();
                mo7033P().mo6788R(new AtomicReference());
                if (C4907zc.m20843b() && this.f5879g.mo7415s(C1957u.f6322H0)) {
                    mo7033P().mo6777E(mo7051x().f6131C.mo7307a());
                }
            }
        } else if (mo7044p()) {
            if (!mo7024G().mo6971A0("android.permission.INTERNET")) {
                mo6709i().mo6764E().mo6885a("App is missing INTERNET permission");
            }
            if (!mo7024G().mo6971A0("android.permission.ACCESS_NETWORK_STATE")) {
                mo6709i().mo6764E().mo6885a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C4389c.m18627a(this.f5873a).mo13719g() && !this.f5879g.mo7410Q()) {
                if (!C2022z4.m9199b(this.f5873a)) {
                    mo6709i().mo6764E().mo6885a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C1788fa.m8455Y(this.f5873a, false)) {
                    mo6709i().mo6764E().mo6885a("AppMeasurementService not registered/enabled");
                }
            }
            mo6709i().mo6764E().mo6885a("Uploading is not possible. App measurement disabled");
        }
        mo7051x().f6149t.mo7325a(this.f5879g.mo7415s(C1957u.f6353Z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo7040d(C1783f5 f5Var) {
        this.f5870E++;
    }

    /* renamed from: e */
    public final C1723a5 mo6706e() {
        m8543z(this.f5882j);
        return this.f5882j;
    }

    /* renamed from: g */
    public final C1682e mo6708g() {
        return this.f5886n;
    }

    /* renamed from: i */
    public final C1746c4 mo6709i() {
        m8543z(this.f5881i);
        return this.f5881i;
    }

    /* renamed from: j */
    public final Context mo6710j() {
        return this.f5873a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo7041k(C1760d6 d6Var) {
        this.f5870E++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo7042m(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            mo6709i().mo6767H().mo6887c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        mo7051x().f6153x.mo7325a(true);
        if (bArr.length == 0) {
            mo6709i().mo6771L().mo6885a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
            String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                mo6709i().mo6771L().mo6885a("Deferred Deep Link is empty.");
                return;
            }
            C1788fa G = mo7024G();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = G.mo6710j().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                mo6709i().mo6767H().mo6887c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f5888p.mo7195X("auto", "_cmp", bundle);
            C1788fa G2 = mo7024G();
            if (!TextUtils.isEmpty(optString) && G2.mo6995e0(optString, optDouble)) {
                G2.mo6710j().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e) {
            mo6709i().mo6764E().mo6886b("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    /* renamed from: n */
    public final C1980va mo6713n() {
        return this.f5878f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo7043o(boolean z) {
        this.f5866A = Boolean.valueOf(z);
    }

    /* renamed from: p */
    public final boolean mo7044p() {
        return mo7045q() == 0;
    }

    /* renamed from: q */
    public final int mo7045q() {
        mo6706e().mo6700b();
        if (this.f5879g.mo7400E()) {
            return 1;
        }
        Boolean bool = this.f5868C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (C4602ib.m19620b() && this.f5879g.mo7415s(C1957u.f6338P0) && !mo7046r()) {
            return 8;
        }
        Boolean I = mo7051x().mo7282I();
        if (I != null) {
            return I.booleanValue() ? 0 : 3;
        }
        Boolean D = this.f5879g.mo7399D("firebase_analytics_collection_enabled");
        if (D != null) {
            return D.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f5867B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (C1577c.m7623d()) {
            return 6;
        }
        return (!this.f5879g.mo7415s(C1957u.f6345T) || this.f5866A == null || this.f5866A.booleanValue()) ? 0 : 7;
    }

    /* renamed from: r */
    public final boolean mo7046r() {
        mo6706e().mo6700b();
        return this.f5869D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo7047s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo7048t() {
        this.f5871F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo7049u() {
        if (this.f5896x) {
            mo6706e().mo6700b();
            Boolean bool = this.f5897y;
            if (bool == null || this.f5898z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f5886n.mo6585a() - this.f5898z) > 1000)) {
                this.f5898z = this.f5886n.mo6585a();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo7024G().mo6971A0("android.permission.INTERNET") && mo7024G().mo6971A0("android.permission.ACCESS_NETWORK_STATE") && (C4389c.m18627a(this.f5873a).mo13719g() || this.f5879g.mo7410Q() || (C2022z4.m9199b(this.f5873a) && C1788fa.m8455Y(this.f5873a, false))));
                this.f5897y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo7024G().mo6999i0(mo7035R().mo7371D(), mo7035R().mo7372E(), mo7035R().mo7373F()) && TextUtils.isEmpty(mo7035R().mo7372E())) {
                        z = false;
                    }
                    this.f5897y = Boolean.valueOf(z);
                }
            }
            return this.f5897y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: v */
    public final void mo7050v() {
        mo6706e().mo6700b();
        m8543z(m8541w());
        String C = mo7035R().mo7370C();
        Pair<String, Boolean> t = mo7051x().mo7287t(C);
        if (!this.f5879g.mo7401F().booleanValue() || ((Boolean) t.second).booleanValue() || TextUtils.isEmpty((CharSequence) t.first)) {
            mo6709i().mo6771L().mo6885a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!m8541w().mo7268w()) {
            mo6709i().mo6767H().mo6885a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            C1788fa G = mo7024G();
            mo7035R();
            URL I = G.mo6979I(31049, C, (String) t.first, mo7051x().f6154y.mo7343a() - 1);
            C1893o7 w = m8541w();
            C1795g5 g5Var = new C1795g5(this);
            w.mo6700b();
            w.mo6864o();
            C1658o.m7845j(I);
            C1658o.m7845j(g5Var);
            w.mo6706e().mo6697E(new C1917q7(w, C, I, (byte[]) null, (Map<String, String>) null, g5Var));
        }
    }

    /* renamed from: x */
    public final C1902p4 mo7051x() {
        m8539h(this.f5880h);
        return this.f5880h;
    }
}
