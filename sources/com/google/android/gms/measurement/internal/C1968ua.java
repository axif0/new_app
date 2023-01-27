package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: com.google.android.gms.measurement.internal.ua */
public final class C1968ua extends C1663a {
    public static final Parcelable.Creator<C1968ua> CREATOR = new C2005xa();

    /* renamed from: f */
    public String f6434f;

    /* renamed from: g */
    public String f6435g;

    /* renamed from: h */
    public C1776ea f6436h;

    /* renamed from: i */
    public long f6437i;

    /* renamed from: j */
    public boolean f6438j;

    /* renamed from: k */
    public String f6439k;

    /* renamed from: l */
    public C1933s f6440l;

    /* renamed from: m */
    public long f6441m;

    /* renamed from: n */
    public C1933s f6442n;

    /* renamed from: o */
    public long f6443o;

    /* renamed from: p */
    public C1933s f6444p;

    C1968ua(C1968ua uaVar) {
        C1658o.m7845j(uaVar);
        this.f6434f = uaVar.f6434f;
        this.f6435g = uaVar.f6435g;
        this.f6436h = uaVar.f6436h;
        this.f6437i = uaVar.f6437i;
        this.f6438j = uaVar.f6438j;
        this.f6439k = uaVar.f6439k;
        this.f6440l = uaVar.f6440l;
        this.f6441m = uaVar.f6441m;
        this.f6442n = uaVar.f6442n;
        this.f6443o = uaVar.f6443o;
        this.f6444p = uaVar.f6444p;
    }

    C1968ua(String str, String str2, C1776ea eaVar, long j, boolean z, String str3, C1933s sVar, long j2, C1933s sVar2, long j3, C1933s sVar3) {
        this.f6434f = str;
        this.f6435g = str2;
        this.f6436h = eaVar;
        this.f6437i = j;
        this.f6438j = z;
        this.f6439k = str3;
        this.f6440l = sVar;
        this.f6441m = j2;
        this.f6442n = sVar2;
        this.f6443o = j3;
        this.f6444p = sVar3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7900n(parcel, 2, this.f6434f, false);
        C1666c.m7900n(parcel, 3, this.f6435g, false);
        C1666c.m7899m(parcel, 4, this.f6436h, i, false);
        C1666c.m7897k(parcel, 5, this.f6437i);
        C1666c.m7889c(parcel, 6, this.f6438j);
        C1666c.m7900n(parcel, 7, this.f6439k, false);
        C1666c.m7899m(parcel, 8, this.f6440l, i, false);
        C1666c.m7897k(parcel, 9, this.f6441m);
        C1666c.m7899m(parcel, 10, this.f6442n, i, false);
        C1666c.m7897k(parcel, 11, this.f6443o);
        C1666c.m7899m(parcel, 12, this.f6444p, i, false);
        C1666c.m7888b(parcel, a);
    }
}
