package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C1658o;
import com.karumi.dexter.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
public final class C1938s4 {

    /* renamed from: a */
    private final String f6245a;

    /* renamed from: b */
    private final String f6246b;

    /* renamed from: c */
    private final String f6247c;

    /* renamed from: d */
    private final long f6248d;

    /* renamed from: e */
    private final /* synthetic */ C1902p4 f6249e;

    private C1938s4(C1902p4 p4Var, String str, long j) {
        this.f6249e = p4Var;
        C1658o.m7841f(str);
        C1658o.m7836a(j > 0);
        this.f6245a = String.valueOf(str).concat(":start");
        this.f6246b = String.valueOf(str).concat(":count");
        this.f6247c = String.valueOf(str).concat(":value");
        this.f6248d = j;
    }

    /* renamed from: c */
    private final void m8832c() {
        this.f6249e.mo6700b();
        long c = this.f6249e.mo6708g().mo6587c();
        SharedPreferences.Editor edit = this.f6249e.mo7277D().edit();
        edit.remove(this.f6246b);
        edit.remove(this.f6247c);
        edit.putLong(this.f6245a, c);
        edit.apply();
    }

    /* renamed from: d */
    private final long m8833d() {
        return this.f6249e.mo7277D().getLong(this.f6245a, 0);
    }

    /* renamed from: a */
    public final Pair<String, Long> mo7335a() {
        long j;
        this.f6249e.mo6700b();
        this.f6249e.mo6700b();
        long d = m8833d();
        if (d == 0) {
            m8832c();
            j = 0;
        } else {
            j = Math.abs(d - this.f6249e.mo6708g().mo6587c());
        }
        long j2 = this.f6248d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            m8832c();
            return null;
        }
        String string = this.f6249e.mo7277D().getString(this.f6247c, (String) null);
        long j3 = this.f6249e.mo7277D().getLong(this.f6246b, 0);
        m8832c();
        return (string == null || j3 <= 0) ? C1902p4.f6128D : new Pair<>(string, Long.valueOf(j3));
    }

    /* renamed from: b */
    public final void mo7336b(String str, long j) {
        this.f6249e.mo6700b();
        if (m8833d() == 0) {
            m8832c();
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        long j2 = this.f6249e.mo7277D().getLong(this.f6246b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f6249e.mo7277D().edit();
            edit.putString(this.f6247c, str);
            edit.putLong(this.f6246b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f6249e.mo6707f().mo6978H0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f6249e.mo7277D().edit();
        if (z) {
            edit2.putString(this.f6247c, str);
        }
        edit2.putLong(this.f6246b, j3);
        edit2.apply();
    }
}
