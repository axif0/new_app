package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: com.google.android.gms.measurement.internal.ea */
public final class C1776ea extends C1663a {
    public static final Parcelable.Creator<C1776ea> CREATOR = new C1764da();

    /* renamed from: f */
    private final int f5773f;

    /* renamed from: g */
    public final String f5774g;

    /* renamed from: h */
    public final long f5775h;

    /* renamed from: i */
    public final Long f5776i;

    /* renamed from: j */
    public final String f5777j;

    /* renamed from: k */
    public final String f5778k;

    /* renamed from: l */
    public final Double f5779l;

    C1776ea(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f5773f = i;
        this.f5774g = str;
        this.f5775h = j;
        this.f5776i = l;
        if (i == 1) {
            this.f5779l = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f5779l = d;
        }
        this.f5777j = str2;
        this.f5778k = str3;
    }

    C1776ea(C1800ga gaVar) {
        this(gaVar.f5854c, gaVar.f5855d, gaVar.f5856e, gaVar.f5853b);
    }

    C1776ea(String str, long j, Object obj, String str2) {
        C1658o.m7841f(str);
        this.f5773f = 2;
        this.f5774g = str;
        this.f5775h = j;
        this.f5778k = str2;
        if (obj == null) {
            this.f5776i = null;
            this.f5779l = null;
            this.f5777j = null;
        } else if (obj instanceof Long) {
            this.f5776i = (Long) obj;
            this.f5779l = null;
            this.f5777j = null;
        } else if (obj instanceof String) {
            this.f5776i = null;
            this.f5779l = null;
            this.f5777j = (String) obj;
        } else if (obj instanceof Double) {
            this.f5776i = null;
            this.f5779l = (Double) obj;
            this.f5777j = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* renamed from: d */
    public final Object mo6894d() {
        Long l = this.f5776i;
        if (l != null) {
            return l;
        }
        Double d = this.f5779l;
        if (d != null) {
            return d;
        }
        String str = this.f5777j;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f5773f);
        C1666c.m7900n(parcel, 2, this.f5774g, false);
        C1666c.m7897k(parcel, 3, this.f5775h);
        C1666c.m7898l(parcel, 4, this.f5776i, false);
        C1666c.m7894h(parcel, 5, (Float) null, false);
        C1666c.m7900n(parcel, 6, this.f5777j, false);
        C1666c.m7900n(parcel, 7, this.f5778k, false);
        C1666c.m7892f(parcel, 8, this.f5779l, false);
        C1666c.m7888b(parcel, a);
    }
}
