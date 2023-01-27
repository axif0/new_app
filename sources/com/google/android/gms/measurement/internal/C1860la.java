package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.la */
public final class C1860la extends C1663a {
    public static final Parcelable.Creator<C1860la> CREATOR = new C1848ka();

    /* renamed from: A */
    public final String f6012A;

    /* renamed from: B */
    public final String f6013B;

    /* renamed from: f */
    public final String f6014f;

    /* renamed from: g */
    public final String f6015g;

    /* renamed from: h */
    public final String f6016h;

    /* renamed from: i */
    public final String f6017i;

    /* renamed from: j */
    public final long f6018j;

    /* renamed from: k */
    public final long f6019k;

    /* renamed from: l */
    public final String f6020l;

    /* renamed from: m */
    public final boolean f6021m;

    /* renamed from: n */
    public final boolean f6022n;

    /* renamed from: o */
    public final long f6023o;

    /* renamed from: p */
    public final String f6024p;

    /* renamed from: q */
    public final long f6025q;

    /* renamed from: r */
    public final long f6026r;

    /* renamed from: s */
    public final int f6027s;

    /* renamed from: t */
    public final boolean f6028t;

    /* renamed from: u */
    public final boolean f6029u;

    /* renamed from: v */
    public final boolean f6030v;

    /* renamed from: w */
    public final String f6031w;

    /* renamed from: x */
    public final Boolean f6032x;

    /* renamed from: y */
    public final long f6033y;

    /* renamed from: z */
    public final List<String> f6034z;

    C1860la(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        C1658o.m7841f(str);
        this.f6014f = str;
        this.f6015g = TextUtils.isEmpty(str2) ? null : str2;
        this.f6016h = str3;
        this.f6023o = j;
        this.f6017i = str4;
        this.f6018j = j2;
        this.f6019k = j3;
        this.f6020l = str5;
        this.f6021m = z;
        this.f6022n = z2;
        this.f6024p = str6;
        this.f6025q = j4;
        this.f6026r = j5;
        this.f6027s = i;
        this.f6028t = z3;
        this.f6029u = z4;
        this.f6030v = z5;
        this.f6031w = str7;
        this.f6032x = bool;
        this.f6033y = j6;
        this.f6034z = list;
        this.f6012A = str8;
        this.f6013B = str9;
    }

    C1860la(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        this.f6014f = str;
        this.f6015g = str2;
        this.f6016h = str3;
        this.f6023o = j3;
        this.f6017i = str4;
        this.f6018j = j;
        this.f6019k = j2;
        this.f6020l = str5;
        this.f6021m = z;
        this.f6022n = z2;
        this.f6024p = str6;
        this.f6025q = j4;
        this.f6026r = j5;
        this.f6027s = i;
        this.f6028t = z3;
        this.f6029u = z4;
        this.f6030v = z5;
        this.f6031w = str7;
        this.f6032x = bool;
        this.f6033y = j6;
        this.f6034z = list;
        this.f6012A = str8;
        this.f6013B = str9;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7900n(parcel, 2, this.f6014f, false);
        C1666c.m7900n(parcel, 3, this.f6015g, false);
        C1666c.m7900n(parcel, 4, this.f6016h, false);
        C1666c.m7900n(parcel, 5, this.f6017i, false);
        C1666c.m7897k(parcel, 6, this.f6018j);
        C1666c.m7897k(parcel, 7, this.f6019k);
        C1666c.m7900n(parcel, 8, this.f6020l, false);
        C1666c.m7889c(parcel, 9, this.f6021m);
        C1666c.m7889c(parcel, 10, this.f6022n);
        C1666c.m7897k(parcel, 11, this.f6023o);
        C1666c.m7900n(parcel, 12, this.f6024p, false);
        C1666c.m7897k(parcel, 13, this.f6025q);
        C1666c.m7897k(parcel, 14, this.f6026r);
        C1666c.m7896j(parcel, 15, this.f6027s);
        C1666c.m7889c(parcel, 16, this.f6028t);
        C1666c.m7889c(parcel, 17, this.f6029u);
        C1666c.m7889c(parcel, 18, this.f6030v);
        C1666c.m7900n(parcel, 19, this.f6031w, false);
        C1666c.m7890d(parcel, 21, this.f6032x, false);
        C1666c.m7897k(parcel, 22, this.f6033y);
        C1666c.m7901o(parcel, 23, this.f6034z, false);
        C1666c.m7900n(parcel, 24, this.f6012A, false);
        C1666c.m7900n(parcel, 25, this.f6013B, false);
        C1666c.m7888b(parcel, a);
    }
}
