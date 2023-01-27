package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p037t.C1666c;
import com.karumi.dexter.BuildConfig;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C1677e();

    /* renamed from: f */
    private final int f5544f;

    /* renamed from: g */
    private final long f5545g;

    /* renamed from: h */
    private int f5546h;

    /* renamed from: i */
    private final String f5547i;

    /* renamed from: j */
    private final String f5548j;

    /* renamed from: k */
    private final String f5549k;

    /* renamed from: l */
    private final int f5550l;

    /* renamed from: m */
    private final List<String> f5551m;

    /* renamed from: n */
    private final String f5552n;

    /* renamed from: o */
    private final long f5553o;

    /* renamed from: p */
    private int f5554p;

    /* renamed from: q */
    private final String f5555q;

    /* renamed from: r */
    private final float f5556r;

    /* renamed from: s */
    private final long f5557s;

    /* renamed from: t */
    private final boolean f5558t;

    /* renamed from: u */
    private long f5559u;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f5544f = i;
        this.f5545g = j;
        this.f5546h = i2;
        this.f5547i = str;
        this.f5548j = str3;
        this.f5549k = str5;
        this.f5550l = i3;
        this.f5559u = -1;
        this.f5551m = list;
        this.f5552n = str2;
        this.f5553o = j2;
        this.f5554p = i4;
        this.f5555q = str4;
        this.f5556r = f;
        this.f5557s = j3;
        this.f5558t = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    /* renamed from: d */
    public final int mo6572d() {
        return this.f5546h;
    }

    /* renamed from: f */
    public final long mo6573f() {
        return this.f5545g;
    }

    /* renamed from: h */
    public final long mo6574h() {
        return this.f5559u;
    }

    /* renamed from: i */
    public final String mo6575i() {
        String str = this.f5547i;
        int i = this.f5550l;
        List<String> list = this.f5551m;
        String str2 = BuildConfig.FLAVOR;
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i2 = this.f5554p;
        String str3 = this.f5548j;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.f5555q;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.f5556r;
        String str5 = this.f5549k;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.f5558t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, this.f5544f);
        C1666c.m7897k(parcel, 2, mo6573f());
        C1666c.m7900n(parcel, 4, this.f5547i, false);
        C1666c.m7896j(parcel, 5, this.f5550l);
        C1666c.m7901o(parcel, 6, this.f5551m, false);
        C1666c.m7897k(parcel, 8, this.f5553o);
        C1666c.m7900n(parcel, 10, this.f5548j, false);
        C1666c.m7896j(parcel, 11, mo6572d());
        C1666c.m7900n(parcel, 12, this.f5552n, false);
        C1666c.m7900n(parcel, 13, this.f5555q, false);
        C1666c.m7896j(parcel, 14, this.f5554p);
        C1666c.m7893g(parcel, 15, this.f5556r);
        C1666c.m7897k(parcel, 16, this.f5557s);
        C1666c.m7900n(parcel, 17, this.f5549k, false);
        C1666c.m7889c(parcel, 18, this.f5558t);
        C1666c.m7888b(parcel, a);
    }
}
