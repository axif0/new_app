package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p148g.p189d.p190a.p271e.p272a.p276c.C5107i0;

/* renamed from: com.google.android.play.core.assetpacks.c */
public abstract class C2327c {
    /* renamed from: b */
    static C2327c m10810b(Bundle bundle, String str, C2427y0 y0Var, C2430z zVar) {
        Bundle bundle2 = bundle;
        String str2 = str;
        int a = zVar.mo9103a(bundle2.getInt(C5107i0.m21492a("status", str2)), str2);
        int i = bundle2.getInt(C5107i0.m21492a("error_code", str2));
        long j = bundle2.getLong(C5107i0.m21492a("bytes_downloaded", str2));
        long j2 = bundle2.getLong(C5107i0.m21492a("total_bytes_to_download", str2));
        double c = y0Var.mo9267c(str2);
        long j3 = bundle2.getLong(C5107i0.m21492a("pack_version", str2));
        long j4 = bundle2.getLong(C5107i0.m21492a("pack_base_version", str2));
        return m10811c(str, a, i, j, j2, c, (a != 4 || j4 == 0 || j4 == j3) ? 1 : 2);
    }

    /* renamed from: c */
    public static C2327c m10811c(String str, int i, int i2, long j, long j2, double d, int i3) {
        return new C2353h0(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3);
    }

    /* renamed from: a */
    public abstract int mo9106a();

    /* renamed from: d */
    public abstract long mo9107d();

    /* renamed from: e */
    public abstract int mo9108e();

    /* renamed from: f */
    public abstract String mo9109f();

    /* renamed from: g */
    public abstract int mo9110g();

    /* renamed from: h */
    public abstract long mo9111h();

    /* renamed from: i */
    public abstract int mo9112i();
}
