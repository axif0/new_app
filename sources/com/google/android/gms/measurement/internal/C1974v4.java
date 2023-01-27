package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1658o;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
public final class C1974v4 {

    /* renamed from: a */
    private final String f6460a;

    /* renamed from: b */
    private boolean f6461b;

    /* renamed from: c */
    private String f6462c;

    /* renamed from: d */
    private final /* synthetic */ C1902p4 f6463d;

    public C1974v4(C1902p4 p4Var, String str, String str2) {
        this.f6463d = p4Var;
        C1658o.m7841f(str);
        this.f6460a = str;
    }

    /* renamed from: a */
    public final String mo7377a() {
        if (!this.f6461b) {
            this.f6461b = true;
            this.f6462c = this.f6463d.mo7277D().getString(this.f6460a, (String) null);
        }
        return this.f6462c;
    }

    /* renamed from: b */
    public final void mo7378b(String str) {
        SharedPreferences.Editor edit = this.f6463d.mo7277D().edit();
        edit.putString(this.f6460a, str);
        edit.apply();
        this.f6462c = str;
    }
}
