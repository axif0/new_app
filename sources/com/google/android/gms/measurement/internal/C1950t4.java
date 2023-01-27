package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1658o;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
public final class C1950t4 {

    /* renamed from: a */
    private final String f6268a;

    /* renamed from: b */
    private final long f6269b;

    /* renamed from: c */
    private boolean f6270c;

    /* renamed from: d */
    private long f6271d;

    /* renamed from: e */
    private final /* synthetic */ C1902p4 f6272e;

    public C1950t4(C1902p4 p4Var, String str, long j) {
        this.f6272e = p4Var;
        C1658o.m7841f(str);
        this.f6268a = str;
        this.f6269b = j;
    }

    /* renamed from: a */
    public final long mo7343a() {
        if (!this.f6270c) {
            this.f6270c = true;
            this.f6271d = this.f6272e.mo7277D().getLong(this.f6268a, this.f6269b);
        }
        return this.f6271d;
    }

    /* renamed from: b */
    public final void mo7344b(long j) {
        SharedPreferences.Editor edit = this.f6272e.mo7277D().edit();
        edit.putLong(this.f6268a, j);
        edit.apply();
        this.f6271d = j;
    }
}
