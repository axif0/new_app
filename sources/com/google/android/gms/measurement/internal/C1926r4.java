package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1658o;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
public final class C1926r4 {

    /* renamed from: a */
    private final String f6215a;

    /* renamed from: b */
    private final boolean f6216b;

    /* renamed from: c */
    private boolean f6217c;

    /* renamed from: d */
    private boolean f6218d;

    /* renamed from: e */
    private final /* synthetic */ C1902p4 f6219e;

    public C1926r4(C1902p4 p4Var, String str, boolean z) {
        this.f6219e = p4Var;
        C1658o.m7841f(str);
        this.f6215a = str;
        this.f6216b = z;
    }

    /* renamed from: a */
    public final void mo7325a(boolean z) {
        SharedPreferences.Editor edit = this.f6219e.mo7277D().edit();
        edit.putBoolean(this.f6215a, z);
        edit.apply();
        this.f6218d = z;
    }

    /* renamed from: b */
    public final boolean mo7326b() {
        if (!this.f6217c) {
            this.f6217c = true;
            this.f6218d = this.f6219e.mo7277D().getBoolean(this.f6215a, this.f6216b);
        }
        return this.f6218d;
    }
}
