package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.internal.p037t.C1666c;

/* renamed from: com.google.android.gms.measurement.internal.s */
public final class C1933s extends C1663a {
    public static final Parcelable.Creator<C1933s> CREATOR = new C1921r();

    /* renamed from: f */
    public final String f6237f;

    /* renamed from: g */
    public final C1873n f6238g;

    /* renamed from: h */
    public final String f6239h;

    /* renamed from: i */
    public final long f6240i;

    C1933s(C1933s sVar, long j) {
        C1658o.m7845j(sVar);
        this.f6237f = sVar.f6237f;
        this.f6238g = sVar.f6238g;
        this.f6239h = sVar.f6239h;
        this.f6240i = j;
    }

    public C1933s(String str, C1873n nVar, String str2, long j) {
        this.f6237f = str;
        this.f6238g = nVar;
        this.f6239h = str2;
        this.f6240i = j;
    }

    public final String toString() {
        String str = this.f6239h;
        String str2 = this.f6237f;
        String valueOf = String.valueOf(this.f6238g);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1666c.m7887a(parcel);
        C1666c.m7900n(parcel, 2, this.f6237f, false);
        C1666c.m7899m(parcel, 3, this.f6238g, i, false);
        C1666c.m7900n(parcel, 4, this.f6239h, false);
        C1666c.m7897k(parcel, 5, this.f6240i);
        C1666c.m7888b(parcel, a);
    }
}
