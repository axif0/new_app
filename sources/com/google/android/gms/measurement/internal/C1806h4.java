package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
public final class C1806h4 {

    /* renamed from: a */
    public String f5861a;

    /* renamed from: b */
    private String f5862b;

    /* renamed from: c */
    private long f5863c;

    /* renamed from: d */
    public Bundle f5864d;

    private C1806h4(String str, String str2, Bundle bundle, long j) {
        this.f5861a = str;
        this.f5862b = str2;
        this.f5864d = bundle == null ? new Bundle() : bundle;
        this.f5863c = j;
    }

    /* renamed from: b */
    public static C1806h4 m8535b(C1933s sVar) {
        return new C1806h4(sVar.f6237f, sVar.f6239h, sVar.f6238g.mo7245i(), sVar.f6240i);
    }

    /* renamed from: a */
    public final C1933s mo7016a() {
        return new C1933s(this.f5861a, new C1873n(new Bundle(this.f5864d)), this.f5862b, this.f5863c);
    }

    public final String toString() {
        String str = this.f5862b;
        String str2 = this.f5861a;
        String valueOf = String.valueOf(this.f5864d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
