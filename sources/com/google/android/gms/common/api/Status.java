package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1655n;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

public final class Status extends C1663a implements C1606j, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C1610n();

    /* renamed from: j */
    public static final Status f5308j = new Status(0);

    /* renamed from: k */
    public static final Status f5309k = new Status(15);

    /* renamed from: l */
    public static final Status f5310l = new Status(16);

    /* renamed from: f */
    private final int f5311f;

    /* renamed from: g */
    private final int f5312g;

    /* renamed from: h */
    private final String f5313h;

    /* renamed from: i */
    private final PendingIntent f5314i;

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f5311f = i;
        this.f5312g = i2;
        this.f5313h = str;
        this.f5314i = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    /* renamed from: c */
    public final Status mo6314c() {
        return this;
    }

    /* renamed from: d */
    public final int mo6315d() {
        return this.f5312g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5311f == status.f5311f && this.f5312g == status.f5312g && C1655n.m7832a(this.f5313h, status.f5313h) && C1655n.m7832a(this.f5314i, status.f5314i);
    }

    /* renamed from: f */
    public final String mo6317f() {
        return this.f5313h;
    }

    /* renamed from: h */
    public final boolean mo6318h() {
        return this.f5312g <= 0;
    }

    public final int hashCode() {
        return C1655n.m7833b(Integer.valueOf(this.f5311f), Integer.valueOf(this.f5312g), this.f5313h, this.f5314i);
    }

    /* renamed from: i */
    public final String mo6320i() {
        String str = this.f5313h;
        return str != null ? str : C1560d.m7523a(this.f5312g);
    }

    public final String toString() {
        C1655n.C1656a c = C1655n.m7834c(this);
        c.mo6552a("statusCode", mo6320i());
        c.mo6552a("resolution", this.f5314i);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7896j(parcel, 1, mo6315d());
        C1666c.m7900n(parcel, 2, mo6317f(), false);
        C1666c.m7899m(parcel, 3, this.f5314i, i, false);
        C1666c.m7896j(parcel, 1000, this.f5311f);
        C1666c.m7888b(parcel, a);
    }
}
