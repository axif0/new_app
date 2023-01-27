package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p232c.p233a.p234a.C4325a;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
final class C1902p4 extends C1760d6 {

    /* renamed from: D */
    static final Pair<String, Long> f6128D = new Pair<>(BuildConfig.FLAVOR, 0L);

    /* renamed from: A */
    public final C1974v4 f6129A = new C1974v4(this, "deferred_attribution_cache", (String) null);

    /* renamed from: B */
    public final C1950t4 f6130B = new C1950t4(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: C */
    public final C1914q4 f6131C = new C1914q4(this, "default_event_parameters", (Bundle) null);

    /* renamed from: c */
    private SharedPreferences f6132c;

    /* renamed from: d */
    public C1938s4 f6133d;

    /* renamed from: e */
    public final C1950t4 f6134e = new C1950t4(this, "last_upload", 0);

    /* renamed from: f */
    public final C1950t4 f6135f = new C1950t4(this, "last_upload_attempt", 0);

    /* renamed from: g */
    public final C1950t4 f6136g = new C1950t4(this, "backoff", 0);

    /* renamed from: h */
    public final C1950t4 f6137h = new C1950t4(this, "last_delete_stale", 0);

    /* renamed from: i */
    public final C1950t4 f6138i = new C1950t4(this, "midnight_offset", 0);

    /* renamed from: j */
    public final C1950t4 f6139j = new C1950t4(this, "first_open_time", 0);

    /* renamed from: k */
    public final C1950t4 f6140k = new C1950t4(this, "app_install_time", 0);

    /* renamed from: l */
    public final C1974v4 f6141l = new C1974v4(this, "app_instance_id", (String) null);

    /* renamed from: m */
    private String f6142m;

    /* renamed from: n */
    private boolean f6143n;

    /* renamed from: o */
    private long f6144o;

    /* renamed from: p */
    public final C1950t4 f6145p = new C1950t4(this, "time_before_start", 10000);

    /* renamed from: q */
    public final C1950t4 f6146q = new C1950t4(this, "session_timeout", 1800000);

    /* renamed from: r */
    public final C1926r4 f6147r = new C1926r4(this, "start_new_session", true);

    /* renamed from: s */
    public final C1974v4 f6148s = new C1974v4(this, "non_personalized_ads", (String) null);

    /* renamed from: t */
    public final C1926r4 f6149t = new C1926r4(this, "allow_remote_dynamite", false);

    /* renamed from: u */
    public final C1950t4 f6150u = new C1950t4(this, "last_pause_time", 0);

    /* renamed from: v */
    public boolean f6151v;

    /* renamed from: w */
    public C1926r4 f6152w = new C1926r4(this, "app_backgrounded", false);

    /* renamed from: x */
    public C1926r4 f6153x = new C1926r4(this, "deep_link_retrieval_complete", false);

    /* renamed from: y */
    public C1950t4 f6154y = new C1950t4(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: z */
    public final C1974v4 f6155z = new C1974v4(this, "firebase_feature_rollouts", (String) null);

    C1902p4(C1807h5 h5Var) {
        super(h5Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo7274A(String str) {
        mo6700b();
        SharedPreferences.Editor edit = mo7277D().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo7275B(boolean z) {
        mo6700b();
        mo6709i().mo6772M().mo6886b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo7277D().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo7276C(String str) {
        mo6700b();
        SharedPreferences.Editor edit = mo7277D().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final SharedPreferences mo7277D() {
        mo6700b();
        mo6864o();
        return this.f6132c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo7278E() {
        mo6700b();
        return mo7277D().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo7279F() {
        mo6700b();
        return mo7277D().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final Boolean mo7280G() {
        mo6700b();
        if (!mo7277D().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(mo7277D().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo7281H() {
        mo6700b();
        Boolean I = mo7282I();
        SharedPreferences.Editor edit = mo7277D().edit();
        edit.clear();
        edit.apply();
        if (I != null) {
            mo7288u(I);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final Boolean mo7282I() {
        mo6700b();
        if (mo7277D().contains("measurement_enabled")) {
            return Boolean.valueOf(mo7277D().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean mo7283J() {
        if (!C4602ib.m19620b() || !mo6712l().mo7415s(C1957u.f6338P0)) {
            return null;
        }
        mo6700b();
        if (mo7277D().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(mo7277D().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final C1765e mo7284K() {
        mo6700b();
        return C1765e.m8334b(mo7277D().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final String mo7285L() {
        mo6700b();
        String string = mo7277D().getString("previous_os_version", (String) null);
        mo6704c().mo6864o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = mo7277D().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo7286M() {
        return this.f6132c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo6863m() {
        SharedPreferences sharedPreferences = mo6710j().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f6132c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f6151v = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f6132c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f6133d = new C1938s4(this, "health_monitor", Math.max(0, C1957u.f6358c.mo7323a(null).longValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo6689r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Pair<String, Boolean> mo7287t(String str) {
        mo6700b();
        long a = mo6708g().mo6585a();
        if (this.f6142m != null && a < this.f6144o) {
            return new Pair<>(this.f6142m, Boolean.valueOf(this.f6143n));
        }
        this.f6144o = a + mo6712l().mo7396A(str);
        C4325a.m18477d(true);
        try {
            C4325a.C4326a b = C4325a.m18476b(mo6710j());
            if (b != null) {
                this.f6142m = b.mo13612a();
                this.f6143n = b.mo13613b();
            }
            if (this.f6142m == null) {
                this.f6142m = BuildConfig.FLAVOR;
            }
        } catch (Exception e) {
            mo6709i().mo6771L().mo6886b("Unable to get advertising id", e);
            this.f6142m = BuildConfig.FLAVOR;
        }
        C4325a.m18477d(false);
        return new Pair<>(this.f6142m, Boolean.valueOf(this.f6143n));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo7288u(Boolean bool) {
        mo6700b();
        SharedPreferences.Editor edit = mo7277D().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo7289v(boolean z) {
        mo6700b();
        SharedPreferences.Editor edit = mo7277D().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo7290w(int i) {
        return C1765e.m8338g(i, mo7277D().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo7291x(long j) {
        return j - this.f6146q.mo7343a() > this.f6150u.mo7343a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo7292y(C1765e eVar, int i) {
        if (!C4602ib.m19620b() || !mo6712l().mo7415s(C1957u.f6338P0)) {
            return false;
        }
        mo6700b();
        if (!mo7290w(i)) {
            return false;
        }
        SharedPreferences.Editor edit = mo7277D().edit();
        edit.putString("consent_settings", eVar.mo6873e());
        edit.putInt("consent_source", i);
        edit.apply();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo7293z(Boolean bool) {
        if (C4602ib.m19620b() && mo6712l().mo7415s(C1957u.f6338P0)) {
            mo6700b();
            SharedPreferences.Editor edit = mo7277D().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
    }
}
